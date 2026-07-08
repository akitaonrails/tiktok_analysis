package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13aT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20036313aT extends AbstractC20036413aU {
    public int LJ;

    public C20036313aT(int i) {
        if (i >= 0) {
            LIZLLL(C19992013Kc.LJ(i));
        } else {
            C19968313Az.LIZ("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        if (((((~r2) << 6) & r2) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
    
        r14 = LIZJ(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if (r31.LJ != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        if (((r31.LIZ[r14 >> 3] >> ((r14 & 7) << 3)) & 255) == 254) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0090, code lost:
    
        r4 = r31.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
    
        if (r4 <= 8) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if (java.lang.Long.compare((((long) r31.LIZLLL) * 32) ^ Long.MIN_VALUE, (((long) r4) * 25) ^ Long.MIN_VALUE) > 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r7 = r31.LIZ;
        r14 = r31.LIZJ;
        r9 = r31.LIZIZ;
        r5 = (r14 + 7) >> 3;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        if (r4 >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        r2 = r7[r4] & r15;
        r7[r4] = (-72340172838076674L) & ((~r2) + (r2 >>> 7));
        r4 = r4 + 1;
        r15 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d5, code lost:
    
        r5 = r7.length - 1;
        r4 = r5 - 1;
        r15 = 72057594037927935L;
        r7[r4] = (r7[r4] & 72057594037927935L) | (-72057594037927936L);
        r6 = 0;
        r7[r5] = r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ec, code lost:
    
        if (r6 == r14) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
    
        r21 = r6 >> 3;
        r20 = (r6 & 7) << 3;
        r1 = (r7[r21] >> r20) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fd, code lost:
    
        if (r1 == 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0101, code lost:
    
        if (r1 != 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0103, code lost:
    
        r3 = r9[r6] * (-862048943);
        r3 = r3 ^ (r3 << 16);
        r2 = r3 >>> 7;
        r19 = LIZJ(r2);
        r2 = r2 & r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011d, code lost:
    
        if ((((r19 - r2) & r14) / 8) != (((r6 - r2) & r14) / 8)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011f, code lost:
    
        r7[r21] = (((long) (r3 & 127)) << r20) | ((~(255 << r20)) & r7[r21]);
        r7[r7.length - 1] = (r7[0] & r15) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013a, code lost:
    
        r6 = r6 + 1;
        r15 = 72057594037927935L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0140, code lost:
    
        r18 = r19 >> 3;
        r16 = r7[r18];
        r15 = (r19 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014d, code lost:
    
        if (((r16 >> r15) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014f, code lost:
    
        r7[r18] = ((~(255 << r15)) & r16) | (((long) (r3 & 127)) << r15);
        r7[r21] = (r7[r21] & (~(255 << r20))) | (128 << r20);
        r9[r19] = r9[r6];
        r9[r6] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016d, code lost:
    
        r7[r7.length - 1] = (r7[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0180, code lost:
    
        r7[r18] = ((~(255 << r15)) & r16) | (((long) (r3 & 127)) << r15);
        r1 = r9[r19];
        r9[r19] = r9[r6];
        r9[r6] = r1;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0196, code lost:
    
        r0 = X.C19992013Kc.LIZJ(r31.LIZJ);
        r15 = r31.LIZ;
        r14 = r31.LIZIZ;
        r13 = r31.LIZJ;
        LIZLLL(r0);
        r12 = r31.LIZ;
        r9 = r31.LIZIZ;
        r7 = r31.LIZJ;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ac, code lost:
    
        if (r6 >= r13) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01bc, code lost:
    
        if (((r15[r6 >> 3] >> ((r6 & 7) << 3)) & 255) >= 128) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01be, code lost:
    
        r21 = r14[r6];
        r1 = r21 * (-862048943);
        r1 = r1 ^ (r1 << 16);
        r20 = LIZJ(r1 >>> 7);
        r19 = r20 >> 3;
        r18 = (r20 & 7) << 3;
        r16 = (r12[r19] & (~(255 << r18))) | (((long) (r1 & 127)) << r18);
        r12[r19] = r16;
        r12[(((r20 - 7) & r7) + (r7 & 7)) >> 3] = r16;
        r9[r20] = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f2, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f5, code lost:
    
        r31.LJ = X.C19992013Kc.LIZ(r31.LIZJ) - r31.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0200, code lost:
    
        r14 = LIZJ(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0206, code lost:
    
        r31.LIZLLL++;
        r7 = r31.LJ;
        r5 = r31.LIZ;
        r9 = r14 >> 3;
        r12 = r5[r9];
        r6 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021f, code lost:
    
        if (((r12 >> r6) & 255) != 128) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0221, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0222, code lost:
    
        r31.LJ = r7 - r0;
        r2 = r31.LIZJ;
        r12 = (r12 & (~(255 << r6))) | (r10 << r6);
        r5[r9] = r12;
        r5[(((r14 - 7) & r2) + (r2 & 7)) >> 3] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0244, code lost:
    
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r32) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20036313aT.LIZIZ(int):boolean");
    }

    public final int LIZJ(int i) {
        int i2 = this.LIZJ;
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

    public final void LIZLLL(int i) {
        int iMax;
        long[] jArr;
        if (i > 0) {
            iMax = Math.max(7, C19992013Kc.LIZLLL(i));
        } else {
            iMax = 0;
        }
        this.LIZJ = iMax;
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
        this.LJ = C19992013Kc.LIZ(this.LIZJ) - this.LIZLLL;
        this.LIZIZ = new int[iMax];
    }

    public final boolean LJ(int i) {
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this.LIZJ;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (((long) i4) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.LIZIZ[iNumberOfTrailingZeros] == i) {
                    if (iNumberOfTrailingZeros < 0) {
                        return false;
                    }
                    LJFF(iNumberOfTrailingZeros);
                    return true;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final void LJFF(int i) {
        this.LIZLLL--;
        long[] jArr = this.LIZ;
        int i2 = this.LIZJ;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
    }
}
