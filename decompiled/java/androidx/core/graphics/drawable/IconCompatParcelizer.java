package androidx.core.graphics.drawable;

import X.AbstractC815450Vyp;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC815450Vyp abstractC815450Vyp) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.LIZ = abstractC815450Vyp.LJIIIZ(iconCompat.LIZ, 1);
        byte[] bArrLJFF = iconCompat.LIZJ;
        if (abstractC815450Vyp.LJII(2)) {
            bArrLJFF = abstractC815450Vyp.LJFF();
        }
        iconCompat.LIZJ = bArrLJFF;
        iconCompat.LIZLLL = abstractC815450Vyp.LJIIJJI(iconCompat.LIZLLL, 3);
        iconCompat.LJ = abstractC815450Vyp.LJIIIZ(iconCompat.LJ, 4);
        iconCompat.LJFF = abstractC815450Vyp.LJIIIZ(iconCompat.LJFF, 5);
        iconCompat.LJI = (ColorStateList) abstractC815450Vyp.LJIIJJI(iconCompat.LJI, 6);
        String strLJIIL = iconCompat.LJIIIIZZ;
        if (abstractC815450Vyp.LJII(7)) {
            strLJIIL = abstractC815450Vyp.LJIIL();
        }
        iconCompat.LJIIIIZZ = strLJIIL;
        String strLJIIL2 = iconCompat.LJIIIZ;
        if (abstractC815450Vyp.LJII(8)) {
            strLJIIL2 = abstractC815450Vyp.LJIIL();
        }
        iconCompat.LJIIIZ = strLJIIL2;
        iconCompat.LJII = PorterDuff.Mode.valueOf(iconCompat.LJIIIIZZ);
        switch (iconCompat.LIZ) {
            case -1:
                Parcelable parcelable = iconCompat.LIZLLL;
                if (parcelable != null) {
                    iconCompat.LIZIZ = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.LIZLLL;
                if (parcelable2 != null) {
                    iconCompat.LIZIZ = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.LIZJ;
                iconCompat.LIZIZ = bArr;
                iconCompat.LIZ = 3;
                iconCompat.LJ = 0;
                iconCompat.LJFF = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.LIZJ, Charset.forName("UTF-16"));
                iconCompat.LIZIZ = str;
                if (iconCompat.LIZ == 2 && iconCompat.LJIIIZ == null) {
                    iconCompat.LJIIIZ = str.split(":", -1)[0];
                    return iconCompat;
                }
                return iconCompat;
            case 3:
                iconCompat.LIZIZ = iconCompat.LIZJ;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC815450Vyp abstractC815450Vyp) {
        abstractC815450Vyp.getClass();
        iconCompat.LJIIIIZZ = iconCompat.LJII.name();
        switch (iconCompat.LIZ) {
            case -1:
                iconCompat.LIZLLL = (Parcelable) iconCompat.LIZIZ;
                break;
            case 1:
            case 5:
                iconCompat.LIZLLL = (Parcelable) iconCompat.LIZIZ;
                break;
            case 2:
                iconCompat.LIZJ = ((String) iconCompat.LIZIZ).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.LIZJ = (byte[]) iconCompat.LIZIZ;
                break;
            case 4:
            case 6:
                iconCompat.LIZJ = iconCompat.LIZIZ.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.LIZ;
        if (-1 != i) {
            abstractC815450Vyp.LJIJI(i, 1);
        }
        byte[] bArr = iconCompat.LIZJ;
        if (bArr != null) {
            abstractC815450Vyp.LJIILJJIL(2);
            abstractC815450Vyp.LJIILLIIL(bArr);
        }
        Parcelable parcelable = iconCompat.LIZLLL;
        if (parcelable != null) {
            abstractC815450Vyp.LJIILJJIL(3);
            abstractC815450Vyp.LJIJJ(parcelable);
        }
        int i2 = iconCompat.LJ;
        if (i2 != 0) {
            abstractC815450Vyp.LJIJI(i2, 4);
        }
        int i3 = iconCompat.LJFF;
        if (i3 != 0) {
            abstractC815450Vyp.LJIJI(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.LJI;
        if (colorStateList != null) {
            abstractC815450Vyp.LJIILJJIL(6);
            abstractC815450Vyp.LJIJJ(colorStateList);
        }
        String str = iconCompat.LJIIIIZZ;
        if (str != null) {
            abstractC815450Vyp.LJIILJJIL(7);
            abstractC815450Vyp.LJIJJLI(str);
        }
        String str2 = iconCompat.LJIIIZ;
        if (str2 != null) {
            abstractC815450Vyp.LJIILJJIL(8);
            abstractC815450Vyp.LJIJJLI(str2);
        }
    }
}
