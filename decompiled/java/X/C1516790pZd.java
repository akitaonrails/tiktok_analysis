package X;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.0pZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516790pZd {
    public static final byte[] LIZLLL = new byte[100];
    public static final byte[] LJ = new byte[100];
    public static final byte[] LJFF = "-2147483648".getBytes(StandardCharsets.US_ASCII);
    public static final byte[] LJI = "-9223372036854775808".getBytes(StandardCharsets.US_ASCII);
    public static final byte[] LJII = "true".getBytes(StandardCharsets.US_ASCII);
    public static final byte[] LJIIIIZZ = "false".getBytes(StandardCharsets.US_ASCII);
    public static final byte[] LJIIIZ = "0123456789abcdef".getBytes(StandardCharsets.US_ASCII);
    public static final byte[] LJIIJ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes(StandardCharsets.US_ASCII);
    public static final boolean[] LJIIJJI = new boolean[128];
    public static final byte[] LJIIL = new byte[128];
    public final InterfaceC1496780p3M LIZ;
    public final byte[] LIZIZ = new byte[24];
    public final byte[] LIZJ = new byte[4];

    static {
        int i = 0;
        do {
            LIZLLL[i] = (byte) ((i / 10) + 48);
            LJ[i] = (byte) ((i % 10) + 48);
            i++;
        } while (i < 100);
        for (int i2 = 0; i2 < 32; i2++) {
            LJIIJJI[i2] = true;
        }
        boolean[] zArr = LJIIJJI;
        zArr[34] = true;
        zArr[92] = true;
        byte[] bArr = LJIIL;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[9] = 116;
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[8] = 98;
        bArr[12] = 102;
    }

    public C1516790pZd(C1496690p3D c1496690p3D) {
        this.LIZ = c1496690p3D;
    }

    public final void LIZ(byte b) {
        this.LIZ.writeByte(b);
    }

    public final int LIZJ(int i, int i2) {
        byte[] bArr;
        byte[] bArr2;
        while (true) {
            bArr = LIZLLL;
            bArr2 = LJ;
            if (i < 100) {
                break;
            }
            int i3 = i / 100;
            int i4 = i - (i3 * 100);
            byte[] bArr3 = this.LIZIZ;
            int i5 = i2 - 1;
            bArr3[i5] = bArr2[i4];
            i2 = i5 - 1;
            bArr3[i2] = bArr[i4];
            i = i3;
        }
        if (i >= 10) {
            byte[] bArr4 = this.LIZIZ;
            int i6 = i2 - 1;
            bArr4[i6] = bArr2[i];
            int i7 = i6 - 1;
            bArr4[i7] = bArr[i];
            return i7;
        }
        int i8 = i2 - 1;
        this.LIZIZ[i8] = (byte) (i + 48);
        return i8;
    }

    public final int LIZLLL(int i, long j) {
        byte[] bArr;
        byte[] bArr2;
        while (true) {
            bArr = LIZLLL;
            bArr2 = LJ;
            if (j < 100) {
                break;
            }
            long j2 = j / 100;
            int i2 = (int) (j - (100 * j2));
            byte[] bArr3 = this.LIZIZ;
            int i3 = i - 1;
            bArr3[i3] = bArr2[i2];
            i = i3 - 1;
            bArr3[i] = bArr[i2];
            j = j2;
        }
        int i4 = (int) j;
        if (i4 >= 10) {
            byte[] bArr4 = this.LIZIZ;
            int i5 = i - 1;
            bArr4[i5] = bArr2[i4];
            int i6 = i5 - 1;
            bArr4[i6] = bArr[i4];
            return i6;
        }
        int i7 = i - 1;
        this.LIZIZ[i7] = (byte) (i4 + 48);
        return i7;
    }

    public final void LIZIZ(int i, byte[] bArr, int i2) {
        this.LIZ.writeByte(34);
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            byte b = bArr[i];
            if (b >= 0 && b < 128 && LJIIJJI[b]) {
                if (i > i4) {
                    this.LIZ.LJJIII(i4, bArr, i - i4);
                }
                this.LIZ.writeByte(92);
                byte b2 = LJIIL[b];
                if (b2 != 0) {
                    this.LIZ.writeByte(b2);
                } else {
                    this.LIZ.writeByte(117);
                    this.LIZ.writeByte(48);
                    this.LIZ.writeByte(48);
                    InterfaceC1496780p3M interfaceC1496780p3M = this.LIZ;
                    byte[] bArr2 = LJIIIZ;
                    interfaceC1496780p3M.writeByte(bArr2[(b >>> 4) & 15]);
                    this.LIZ.writeByte(bArr2[b & 15]);
                }
                i4 = i + 1;
            }
            i++;
        }
        if (i > i4) {
            this.LIZ.LJJIII(i4, bArr, i - i4);
        }
        this.LIZ.writeByte(34);
    }
}
