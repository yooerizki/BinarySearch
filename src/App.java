import java.util.Scanner;
import java.util.Arrays;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        int angka;
        boolean notfound = true;
        int intarray[][] = { { 0, 6, 8 }, { 20, 22, 28 }, { 36, 38, 44 } };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari= ");
        angka = sc.nextInt();
        for (int i = 0; i < intarray.length; i++) {
            for (int j = 0; j < intarray.length; j++) {
                System.out.print(intarray[i][j] + ",");
            }
            System.out.println();
        }

        int batasAtas = intarray.length - 1;
        int batasBawah = 0;
    }

}

/*
 * public class App { public static void searchMat(int matrix[][], int target) {
 * int baris = matrix.length; int kolom = matrix[0].length;
 * 
 * int awal = 0; int akhir = baris * kolom - 1;
 * 
 * // memecah elemen matrik while (awal <= akhir) {// looping int tengah = (awal
 * + akhir) / 2; // nilai tengah int i = tengah / kolom; int j = tengah % kolom;
 * 
 * if (matrix[i][j] == target) { // sama dengan target System.out.println(target
 * + " Ditemukan di : (" + i + ", " + j + ")"); return; } if (matrix[i][j] <
 * target) { awal = tengah + 1; // cari di tengah ke awal } else { akhir =
 * tengah - 1; // cari di tengah sampai akhir } } System.out.print(target +
 * " tidak ditemukan "); return; }
 * 
 * public static void main(String[] args) { Scanner masuk = new
 * Scanner(System.in); System.out.print("element yang dicari : "); int x =
 * masuk.nextInt(); int matrix[][] = { { 0, 6, 8, 9, 11 }, { 20, 22, 28, 29, 31
 * }, { 36, 38, 44, 61, 63 }, { 64, 66, 100, 122, 128 } }; for (int row[] :
 * matrix) { // return isi array System.out.println(Arrays.toString(row)); }
 * searchMat(matrix, x); }
 * 
 * }
 */