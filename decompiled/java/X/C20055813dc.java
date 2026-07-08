package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20055813dc {
    public int[] LIZ;
    public int LIZIZ;

    public C20055813dc(int i) {
        this.LIZ = new int[i];
    }

    public final void LIZJ(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.LIZ;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    LIZLLL(i3, i4);
                }
            }
            int i7 = i3 + 3;
            LIZLLL(i7, i2);
            LIZJ(i, i7 - 3);
            LIZJ(i7 + 3, i2);
        }
    }

    public final void LIZLLL(int i, int i2) {
        int[] iArr = this.LIZ;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public final void LIZ(int i, int i2, int i3) {
        int i4 = this.LIZIZ;
        int[] iArrCopyOf = this.LIZ;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.LIZ = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.LIZIZ = i5;
    }

    public final void LIZIZ(int i, int i2, int i3, int i4) {
        int i5 = this.LIZIZ;
        int[] iArrCopyOf = this.LIZ;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.LIZ = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.LIZIZ = i6;
    }
}
