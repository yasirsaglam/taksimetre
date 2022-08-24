import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int km;
        double kmUcret = 2.2, toplamUcret, acilisUcret = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Yolculuk mesafesini giriniz (KM) : ");
        km = input.nextInt();
        toplamUcret = km * kmUcret;
        toplamUcret += acilisUcret;

        toplamUcret = (toplamUcret < 20) ? 20 : toplamUcret;
        System.out.println("Toplam Ücretiniz : " + toplamUcret);
    }
}
