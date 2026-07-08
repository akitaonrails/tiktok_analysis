package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13L7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13L7<V> extends C13L6<V> {
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
        Arrays.fill(this.LIZJ, 0, this.LIZLLL, (Object) null);
        this.LJFF = C19992013Kc.LIZ(this.LIZLLL) - this.LJ;
    }

    public C13L7(int i) {
        if (i >= 0) {
            LJ(C19992013Kc.LJ(i));
        } else {
            C19968313Az.LIZ("Capacity must be a positive value.");
            throw null;
        }
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
        this.LIZIZ = new long[iMax];
        this.LIZJ = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V LJFF(long r16) {
        /*
            r15 = this;
            int r1 = X.C786410Ut5.Y2(r16)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r7 = r1 & 127(0x7f, float:1.78E-43)
            int r6 = r15.LIZLLL
            int r14 = r1 >>> 7
            r14 = r14 & r6
            r10 = 0
        L13:
            long[] r3 = r15.LIZ
            int r2 = r14 >> 3
            r0 = r14 & 7
            int r1 = r0 << 3
            r8 = r3[r2]
            long r8 = r8 >>> r1
            int r0 = r2 + 1
            r4 = r3[r0]
            int r0 = 64 - r1
            long r4 = r4 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r4 = r4 & r0
            long r4 = r4 | r8
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r8 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
        L3e:
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L5a
            int r2 = java.lang.Long.numberOfTrailingZeros(r0)
            int r11 = r2 >> 3
            int r11 = r11 + r14
            r11 = r11 & r6
            long[] r2 = r15.LIZIZ
            r8 = r2[r11]
            int r2 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r2 == 0) goto L64
            r8 = 1
            long r2 = r0 - r8
            long r0 = r0 & r2
            goto L3e
        L5a:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            long r4 = r4 & r12
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto L95
            r11 = -1
        L64:
            r10 = 0
            if (r11 < 0) goto L9b
            int r0 = r15.LJ
            int r0 = r0 + (-1)
            r15.LJ = r0
            long[] r8 = r15.LIZ
            int r9 = r15.LIZLLL
            int r7 = r11 >> 3
            r0 = r11 & 7
            int r6 = r0 << 3
            r4 = r8[r7]
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 << r6
            long r0 = ~r2
            long r4 = r4 & r0
            r0 = 254(0xfe, double:1.255E-321)
            long r0 = r0 << r6
            long r4 = r4 | r0
            r8[r7] = r4
            int r1 = r11 + (-7)
            r1 = r1 & r9
            r0 = r9 & 7
            int r1 = r1 + r0
            int r0 = r1 >> 3
            r8[r0] = r4
            java.lang.Object[] r1 = r15.LIZJ
            r0 = r1[r11]
            r1[r11] = r10
            return r0
        L95:
            int r10 = r10 + 8
            int r14 = r14 + r10
            r14 = r14 & r6
            goto L13
        L9b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13L7.LJFF(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006b, code lost:
    
        if (((((~r4) << 6) & r4) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006d, code lost:
    
        r17 = LIZLLL(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        if (r32.LJFF != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        if (((r32.LIZ[r17 >> 3] >> ((r17 & 7) << 3)) & 255) == 254) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        r4 = r32.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
    
        if (r4 <= 8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        if (java.lang.Long.compare((((long) r32.LJ) * 32) ^ Long.MIN_VALUE, (((long) r4) * 25) ^ Long.MIN_VALUE) > 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        r5 = r32.LIZ;
        r11 = r32.LIZLLL;
        r9 = r32.LIZIZ;
        r10 = r32.LIZJ;
        r7 = (r11 + 7) >> 3;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (r4 >= r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        r2 = r5[r4] & r12;
        r5[r4] = (-72340172838076674L) & ((~r2) + (r2 >>> 7));
        r4 = r4 + 1;
        r12 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d3, code lost:
    
        r7 = r5.length - 1;
        r4 = r7 - 1;
        r5[r4] = (r5[r4] & 72057594037927935L) | (-72057594037927936L);
        r5[r7] = r5[0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00eb, code lost:
    
        if (r4 == r11) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ed, code lost:
    
        r24 = r4 >> 3;
        r23 = (r4 & 7) << 3;
        r2 = (r5[r24] >> r23) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fe, code lost:
    
        if (r2 == 128) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0102, code lost:
    
        if (r2 != 254) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0104, code lost:
    
        r12 = X.C786410Ut5.Y2(r9[r4]) * (-862048943);
        r12 = r12 ^ (r12 << 16);
        r3 = r12 >>> 7;
        r20 = LIZLLL(r3);
        r3 = r3 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0123, code lost:
    
        if ((((r20 - r3) & r11) / 8) != (((r4 - r3) & r11) / 8)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0125, code lost:
    
        r5[r24] = ((r12 & 127) << r23) | ((~(255 << r23)) & r5[r24]);
        r5[r5.length - 1] = (r5[0] & 72057594037927935L) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0145, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0148, code lost:
    
        r19 = r20 >> 3;
        r17 = r5[r19];
        r16 = (r20 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0157, code lost:
    
        if (((r17 >> r16) & 255) != 128) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0159, code lost:
    
        r5[r19] = (((long) (r12 & 127)) << r16) | ((~(255 << r16)) & r17);
        r5[r24] = (r5[r24] & (~(255 << r23))) | (128 << r23);
        r9[r20] = r9[r4];
        r9[r4] = 0;
        r10[r20] = r10[r4];
        r10[r4] = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017f, code lost:
    
        r5[r5.length - 1] = (r5[0] & 72057594037927935L) | Long.MIN_VALUE;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0193, code lost:
    
        r5[r19] = ((~(255 << r16)) & r17) | (((long) (r12 & 127)) << r16);
        r2 = r9[r20];
        r9[r20] = r9[r4];
        r9[r4] = r2;
        r1 = r10[r20];
        r10[r20] = r10[r4];
        r10[r4] = r1;
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b3, code lost:
    
        r1 = X.C19992013Kc.LIZJ(r32.LIZLLL);
        r0 = r32.LIZ;
        r0 = r32.LIZIZ;
        r13 = r32.LIZJ;
        r12 = r32.LIZLLL;
        LJ(r1);
        r10 = r32.LIZ;
        r11 = r32.LIZIZ;
        r9 = r32.LIZJ;
        r8 = r32.LIZLLL;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d1, code lost:
    
        if (r7 >= r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01e3, code lost:
    
        if (((r0[r7 >> 3] >> ((r7 & 7) << 3)) & 255) >= 128) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01e5, code lost:
    
        r21 = r0[r7];
        r1 = X.C786410Ut5.Y2(r21) * (-862048943);
        r1 = r1 ^ (r1 << 16);
        r20 = LIZLLL(r1 >>> 7);
        r19 = r20 >> 3;
        r18 = (r20 & 7) << 3;
        r4 = (((long) (r1 & 127)) << r18) | (r10[r19] & (~(255 << r18)));
        r10[r19] = r4;
        r10[(((r20 - 7) & r8) + (r8 & 7)) >> 3] = r4;
        r11[r20] = r21;
        r9[r20] = r13[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0220, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0223, code lost:
    
        r32.LJFF = X.C19992013Kc.LIZ(r32.LIZLLL) - r32.LJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x022e, code lost:
    
        r17 = LIZLLL(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0234, code lost:
    
        r4 = 1;
        r32.LJ++;
        r1 = r32.LJFF;
        r5 = r32.LIZ;
        r16 = r17 >> 3;
        r12 = r5[r16];
        r11 = (r17 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0250, code lost:
    
        if (((r12 >> r11) & 255) == 128) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0252, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0253, code lost:
    
        r32.LJFF = r1 - r4;
        r4 = r32.LIZLLL;
        r12 = (r12 & (~(255 << r11))) | (r14 << r11);
        r5[r16] = r12;
        r5[(((r17 - 7) & r4) + (r4 & 7)) >> 3] = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(long r33, V r35) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13L7.LJI(long, java.lang.Object):void");
    }
}
