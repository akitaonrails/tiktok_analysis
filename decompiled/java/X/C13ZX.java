package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13ZX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZX extends C13ZY {
    public int LJFF;

    public final void LIZJ() {
        this.LJ = 0;
        long[] jArr = this.LIZ;
        if (jArr != C19992013Kc.LIZ) {
            C13DL.LJI(jArr, -9187201950435737472L);
            long[] jArr2 = this.LIZ;
            int i = this.LIZLLL;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        this.LJFF = C19992013Kc.LIZ(this.LIZLLL) - this.LJ;
    }

    public C13ZX() {
        LJ(C19992013Kc.LJ(6));
    }

    public final int LIZLLL(int i) {
        int i2 = this.LIZLLL;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void LJ(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            iMax = Math.max(7, C19992013Kc.LIZLLL(i));
        } else {
            iMax = 0;
        }
        this.LIZLLL = iMax;
        if (iMax == 0) {
            jArr = C19992013Kc.LIZ;
        } else {
            int i2 = ((((iMax + 1) + 7) + 7) & (-8)) >> 3;
            jArr = new long[i2];
            Arrays.fill(jArr, 0, i2, -9187201950435737472L);
        }
        this.LIZ = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.LJFF = C19992013Kc.LIZ(this.LIZLLL) - this.LJ;
        this.LIZIZ = new int[iMax];
        this.LIZJ = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        if (((((~r5) << 6) & r5) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        r6 = LIZLLL(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        if (r34.LJFF != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        if (((r34.LIZ[r6 >> 3] >> ((r6 & 7) << 3)) & 255) == 254) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        r6 = r34.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        if (r6 <= 8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        if (java.lang.Long.compare((((long) r34.LJ) * 32) ^ Long.MIN_VALUE, (((long) r6) * 25) ^ Long.MIN_VALUE) > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        r7 = r34.LIZ;
        r13 = r34.LIZLLL;
        r9 = r34.LIZIZ;
        r10 = r34.LIZJ;
        r11 = (r13 + 7) >> 3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (r6 >= r11) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        r2 = r7[r6] & r14;
        r7[r6] = (-72340172838076674L) & ((~r2) + (r2 >>> 7));
        r6 = r6 + 1;
        r14 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d3, code lost:
    
        r11 = r7.length - 1;
        r6 = r11 - 1;
        r7[r6] = (r7[r6] & 72057594037927935L) | (-72057594037927936L);
        r6 = 0;
        r7[r11] = r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00eb, code lost:
    
        if (r6 == r13) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ed, code lost:
    
        r22 = r6 >> 3;
        r21 = (r6 & 7) << 3;
        r1 = (r7[r22] >> r21) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fc, code lost:
    
        if (r1 == 128) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0100, code lost:
    
        if (r1 != 254) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0102, code lost:
    
        r3 = r9[r6] * (-862048943);
        r3 = r3 ^ (r3 << 16);
        r2 = r3 >>> 7;
        r18 = LIZLLL(r2);
        r2 = r2 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        if ((((r18 - r2) & r13) / 8) != (((r6 - r2) & r13) / 8)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        r7[r22] = ((~(255 << r21)) & r7[r22]) | (((long) (r3 & 127)) << r21);
        r7[r7.length - 1] = (r7[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0138, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013b, code lost:
    
        r17 = r18 >> 3;
        r15 = r7[r17];
        r14 = (r18 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0148, code lost:
    
        if (((r15 >> r14) & 255) != 128) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014a, code lost:
    
        r7[r17] = ((~(255 << r14)) & r15) | (((long) (r3 & 127)) << r14);
        r7[r22] = (r7[r22] & (~(255 << r21))) | (128 << r21);
        r9[r18] = r9[r6];
        r9[r6] = 0;
        r10[r18] = r10[r6];
        r10[r6] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x016e, code lost:
    
        r7[r7.length - 1] = (r7[0] & 72057594037927935L) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017e, code lost:
    
        r7[r17] = (((long) (r3 & 127)) << r14) | ((~(255 << r14)) & r15);
        r1 = r9[r18];
        r9[r18] = r9[r6];
        r9[r6] = r1;
        r1 = r10[r18];
        r10[r18] = r10[r6];
        r10[r6] = r1;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x019c, code lost:
    
        r1 = X.C19992013Kc.LIZJ(r34.LIZLLL);
        r0 = r34.LIZ;
        r0 = r34.LIZIZ;
        r15 = r34.LIZJ;
        r14 = r34.LIZLLL;
        LJ(r1);
        r13 = r34.LIZ;
        r12 = r34.LIZIZ;
        r11 = r34.LIZJ;
        r10 = r34.LIZLLL;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ba, code lost:
    
        if (r9 >= r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ca, code lost:
    
        if (((r0[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cc, code lost:
    
        r21 = r0[r9];
        r1 = r21 * (-862048943);
        r1 = r1 ^ (r1 << 16);
        r20 = LIZLLL(r1 >>> 7);
        r19 = r20 >> 3;
        r18 = (r20 & 7) << 3;
        r16 = (r13[r19] & (~(255 << r18))) | (((long) (r1 & 127)) << r18);
        r13[r19] = r16;
        r13[(((r20 - 7) & r10) + (r10 & 7)) >> 3] = r16;
        r12[r20] = r21;
        r11[r20] = r15[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0202, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0205, code lost:
    
        r34.LJFF = X.C19992013Kc.LIZ(r34.LIZLLL) - r34.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0210, code lost:
    
        r6 = LIZLLL(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0216, code lost:
    
        r15 = 1;
        r34.LJ++;
        r11 = r34.LJFF;
        r3 = r34.LIZ;
        r14 = r6 >> 3;
        r12 = r3[r14];
        r7 = (r6 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0230, code lost:
    
        if (((r12 >> r7) & 255) == 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0232, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0233, code lost:
    
        r34.LJFF = r11 - r15;
        r2 = r34.LIZLLL;
        r12 = (r12 & (~(255 << r7))) | (r0 << r7);
        r3[r14] = r12;
        r3[(((r6 - 7) & r2) + (r2 & 7)) >> 3] = r12;
        r4 = ~r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZX.LJFF(int, int):void");
    }
}
