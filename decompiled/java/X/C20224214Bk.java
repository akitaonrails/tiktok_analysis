package X;

import android.R;

/* JADX INFO: renamed from: X.14Bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20224214Bk {
    public static final int[] LJI = new int[256];
    public static final int[] LJII = new int[256];
    public static final int[] LJIIIIZZ = new int[256];
    public static final int[] LJIIIZ = new int[256];
    public static final int[] LJIIJ = new int[256];
    public static final int[] LJIIJJI = new int[256];
    public static final int[] LJIIL = new int[256];
    public static final int[] LJIILIIL = new int[256];
    public static final int[] LJIILJJIL = new int[256];
    public static final int[] LJIILL = new int[256];
    public static final int[] LJIILLIIL = {0, 1, 2, 4, 8, 16, 32, 64, 128, 27, 54};
    public final int[] LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int[] LJ;
    public final int[] LJFF;

    static {
        int[] iArr = new int[256];
        int i = 0;
        loop0: while (true) {
            int i2 = i << 1;
            while (true) {
                iArr[i] = i2;
                i++;
                if (i >= 256) {
                    break loop0;
                } else if (i >= 128) {
                    i2 = (i << 1) ^ 283;
                }
            }
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = ((((i4 << 1) ^ i4) ^ (i4 << 2)) ^ (i4 << 3)) ^ (i4 << 4);
            int i7 = ((i6 & 255) ^ (i6 >>> 8)) ^ 99;
            LJI[i5] = i7;
            LJII[i7] = i5;
            int i8 = iArr[i5];
            int i9 = iArr[i8];
            int i10 = iArr[i9];
            int i11 = (iArr[i7] * 257) ^ (i7 * R.attr.transcriptMode);
            LJIIIIZZ[i5] = (i11 << 24) | (i11 >>> 8);
            LJIIIZ[i5] = (i11 << 16) | (i11 >>> 16);
            LJIIJ[i5] = (i11 << 8) | (i11 >>> 24);
            LJIIJJI[i5] = i11 << 0;
            int i12 = (((i9 * 65537) ^ (R.attr.cacheColorHint * i10)) ^ (i8 * 257)) ^ (R.attr.transcriptMode * i5);
            LJIIL[i7] = (i12 << 24) | (i12 >>> 8);
            LJIILIIL[i7] = (i12 << 16) | (i12 >>> 16);
            LJIILJJIL[i7] = (i12 << 8) | (i12 >>> 24);
            LJIILL[i7] = i12 << 0;
            if (i5 == 0) {
                i4 = 1;
                i5 = 1;
            } else {
                i5 = iArr[iArr[iArr[i10 ^ i8]]] ^ i8;
                i4 ^= iArr[iArr[i4]];
            }
            i3++;
        } while (i3 < 256);
    }

    public C20224214Bk(byte[] bArr) {
        int[] iArr;
        int i;
        int i2;
        int[] iArrLIZIZ = C20224114Bj.LIZIZ(bArr);
        this.LIZ = iArrLIZIZ;
        int length = iArrLIZIZ.length;
        this.LIZIZ = length;
        int i3 = length + 6;
        this.LIZJ = i3;
        int i4 = (i3 + 1) * 4;
        this.LIZLLL = i4;
        int[] iArr2 = new int[i4];
        int i5 = 0;
        while (true) {
            iArr = LJI;
            if (i5 >= i4) {
                break;
            }
            int i6 = this.LIZIZ;
            if (i5 < i6) {
                i2 = this.LIZ[i5];
            } else {
                int i7 = iArr2[i5 - 1];
                int i8 = i5 % i6;
                if (i8 == 0) {
                    int i9 = (i7 >>> 24) | (i7 << 8);
                    i7 = (LJIILLIIL[i5 / i6] << 24) ^ (iArr[i9 & 255] | (((iArr[(i9 >>> 24) & 255] << 24) | (iArr[(i9 >>> 16) & 255] << 16)) | (iArr[(i9 >>> 8) & 255] << 8)));
                } else if (i6 > 6 && i8 == 4) {
                    i7 = (iArr[(i7 >>> 24) & 255] << 24) | (iArr[(i7 >>> 16) & 255] << 16) | (iArr[(i7 >>> 8) & 255] << 8) | iArr[i7 & 255];
                }
                i2 = iArr2[i5 - i6] ^ i7;
            }
            iArr2[i5] = i2;
            i5++;
        }
        this.LJ = iArr2;
        int i10 = this.LIZLLL;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.LIZLLL - i11;
            if (i11 % 4 != 0) {
                i = this.LJ[i12];
            } else {
                i = this.LJ[i12 - 4];
            }
            if (i11 >= 4 && i12 > 4) {
                i = LJIILL[iArr[i & 255]] ^ ((LJIIL[iArr[(i >>> 24) & 255]] ^ LJIILIIL[iArr[(i >>> 16) & 255]]) ^ LJIILJJIL[iArr[(i >>> 8) & 255]]);
            }
            iArr3[i11] = i;
        }
        this.LJFF = iArr3;
    }
}
