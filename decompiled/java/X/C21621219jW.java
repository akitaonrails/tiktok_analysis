package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19jW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21621219jW {
    public static final String[] LIZIZ = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int[][] LIZJ = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    public static final int[][] LIZLLL;
    public static final int[][] LJ;
    public final byte[] LIZ;

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        LIZLLL = iArr;
        iArr[0][32] = 1;
        int i = 65;
        do {
            LIZLLL[0][i] = (i - 65) + 2;
            i++;
        } while (i <= 90);
        LIZLLL[1][32] = 1;
        int i2 = 97;
        do {
            LIZLLL[1][i2] = (i2 - 97) + 2;
            i2++;
        } while (i2 <= 122);
        LIZLLL[2][32] = 1;
        int i3 = 48;
        do {
            LIZLLL[2][i3] = (i3 - 48) + 2;
            i3++;
        } while (i3 <= 57);
        int[] iArr2 = LIZLLL[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        int i4 = 0;
        do {
            LIZLLL[3][iArr3[i4]] = i4;
            i4++;
        } while (i4 < 28);
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        int i5 = 0;
        do {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                LIZLLL[4][i6] = i5;
            }
            i5++;
        } while (i5 < 31);
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        LJ = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = LJ;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public C21621219jW(byte[] bArr) {
        this.LIZ = bArr;
    }

    public static Collection<C21621419jY> LIZ(Iterable<C21621419jY> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C21621419jY c21621419jY : iterable) {
            Iterator it2 = linkedList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C21621419jY c21621419jY2 = (C21621419jY) it2.next();
                    if (!c21621419jY2.LIZJ(c21621419jY)) {
                        if (c21621419jY.LIZJ(c21621419jY2)) {
                            it2.remove();
                        }
                    }
                } else {
                    linkedList.add(c21621419jY);
                    break;
                }
            }
        }
        return linkedList;
    }
}
