package X;

import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13S2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13S2 extends C13S1 {
    public static final C13S3 LJIIIIZZ = new C13S4() { // from class: X.13S3
        {
            AFwS219S0000000_30.get$arr$(226);
        }
    };
    public static final int[] LJIIIZ = {7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21};
    public static final int[] LJIIJ;
    public final int[] LJFF = new int[4];
    public final int[] LJI = new int[4];
    public final int[] LJII = new int[16];

    /* JADX WARN: Type inference failed for: r0v0, types: [X.13S3] */
    static {
        int[] iArr = new int[64];
        int i = 0;
        do {
            iArr[i] = (int) (4294967296L * Math.abs(Math.sin(((double) i) + 1.0d)));
            i++;
        } while (i < 64);
        LJIIJ = iArr;
    }

    @Override // X.C13S1
    public final void LIZJ() {
        int[] iArr = this.LJFF;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
    }

    public C13S2() {
        LIZJ();
    }

    @Override // X.C13S1
    public final void LIZ(byte[] bArr) {
        int i = 0;
        do {
            bArr[i] = (byte) (this.LJFF[i / 4] >>> ((i % 4) * 8));
            i++;
        } while (i < 16);
    }

    @Override // X.C13S1
    public final byte[] LIZIZ(long j) {
        long j2 = 8;
        int i = this.LIZ;
        long j3 = ((j + j2) / ((long) i)) + 1;
        long j4 = j2 * j;
        int i2 = (int) ((j3 * ((long) i)) - j);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        bArr[0] = -128;
        do {
            bArr[(i2 - 8) + i3] = (byte) (j4 >>> (i3 * 8));
            i3++;
        } while (i3 < 8);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    @Override // X.C13S1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(byte[] r15) {
        /*
            r14 = this;
            r5 = 0
            r4 = 0
        L2:
            int[] r3 = r14.LJII
            int r2 = r4 >>> 2
            r0 = r15[r4]
            int r1 = r0 << 24
            r0 = r3[r2]
            int r0 = r0 >>> 8
            r1 = r1 | r0
            r3[r2] = r1
            int r4 = r4 + 1
            r9 = 64
            if (r4 < r9) goto L2
            r2 = 0
        L18:
            int[] r1 = r14.LJI
            int[] r0 = r14.LJFF
            r0 = r0[r2]
            r1[r2] = r0
            int r2 = r2 + 1
            r6 = 4
            if (r2 < r6) goto L18
            r10 = 0
        L26:
            int r8 = r10 / 16
            r7 = 3
            r4 = 2
            r3 = 1
            if (r8 == 0) goto L9e
            if (r8 == r3) goto L86
            if (r8 == r4) goto L7b
            if (r8 == r7) goto L70
            r2 = 0
            if (r8 == r3) goto L92
        L36:
            if (r8 == r4) goto L97
            if (r8 == r7) goto L6d
            r1 = 0
        L3b:
            int[] r11 = r14.LJFF
            r13 = r11[r3]
            r12 = r11[r5]
            int r12 = r12 + r2
            int[] r0 = r14.LJII
            r0 = r0[r1]
            int r12 = r12 + r0
            int[] r0 = X.C13S2.LJIIJ
            r0 = r0[r10]
            int r12 = r12 + r0
            int[] r2 = X.C13S2.LJIIIZ
            int r1 = r8 << 2
            r0 = r10 & 3
            r1 = r1 | r0
            r0 = r2[r1]
            int r1 = r12 << r0
            int r0 = 32 - r0
            int r12 = r12 >>> r0
            r12 = r12 | r1
            int r12 = r12 + r13
            r0 = r11[r7]
            r11[r5] = r0
            r0 = r11[r4]
            r11[r7] = r0
            r11[r4] = r13
            r11[r3] = r12
            int r10 = r10 + 1
            if (r10 >= r9) goto Lac
            goto L26
        L6d:
            int r0 = r10 * 7
            goto L9b
        L70:
            int[] r0 = r14.LJFF
            r11 = r0[r4]
            r1 = r0[r3]
            r0 = r0[r7]
            int r2 = ~r0
            r2 = r2 | r1
            goto L84
        L7b:
            int[] r1 = r14.LJFF
            r11 = r1[r3]
            r0 = r1[r4]
            r11 = r11 ^ r0
            r2 = r1[r7]
        L84:
            r2 = r2 ^ r11
            goto L36
        L86:
            int[] r2 = r14.LJFF
            r1 = r2[r3]
            r0 = r2[r7]
            r1 = r1 & r0
            r2 = r2[r4]
            int r0 = ~r0
            r2 = r2 & r0
            r2 = r2 | r1
        L92:
            int r0 = r10 * 5
            int r0 = r0 + 1
            goto L9b
        L97:
            int r0 = r10 * 3
            int r0 = r0 + 5
        L9b:
            r1 = r0 & 15
            goto L3b
        L9e:
            int[] r2 = r14.LJFF
            r0 = r2[r3]
            r1 = r2[r4]
            r1 = r1 & r0
            int r0 = ~r0
            r2 = r2[r7]
            r2 = r2 & r0
            r2 = r2 | r1
            r1 = r10
            goto L3b
        Lac:
            int[] r2 = r14.LJFF
            r1 = r2[r5]
            int[] r0 = r14.LJI
            r0 = r0[r5]
            int r1 = r1 + r0
            r2[r5] = r1
            int r5 = r5 + 1
            if (r5 < r6) goto Lac
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13S2.LIZLLL(byte[]):void");
    }
}
