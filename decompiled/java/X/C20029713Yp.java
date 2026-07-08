package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13Yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20029713Yp<V> extends AbstractC20029613Yo<V> {
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

    public C20029713Yp(int i) {
        if (i >= 0) {
            LJFF(C19992013Kc.LJ(i));
        } else {
            C19968313Az.LIZ("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL(int r31) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029713Yp.LIZLLL(int):int");
    }

    public final int LJ(int i) {
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

    public final void LJFF(int i) {
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
        this.LIZJ = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        r12 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V LJI(int r18) {
        /*
            r17 = this;
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            r8 = r18
            int r1 = r1 * r8
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r7 = r1 & 127(0x7f, float:1.78E-43)
            r9 = r17
            int r6 = r9.LIZLLL
            int r16 = r1 >>> 7
            r16 = r16 & r6
            r15 = 0
        L14:
            long[] r3 = r9.LIZ
            int r2 = r16 >> 3
            r0 = r16 & 7
            int r1 = r0 << 3
            r10 = r3[r2]
            long r10 = r10 >>> r1
            int r0 = r2 + 1
            r4 = r3[r0]
            int r0 = 64 - r1
            long r4 = r4 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r4 = r4 & r0
            long r4 = r4 | r10
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r10 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r10
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r13
        L3f:
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L5a
            int r2 = java.lang.Long.numberOfTrailingZeros(r0)
            int r12 = r2 >> 3
            int r12 = r12 + r16
            r12 = r12 & r6
            int[] r2 = r9.LIZIZ
            r2 = r2[r12]
            if (r2 == r8) goto L64
            r10 = 1
            long r2 = r0 - r10
            long r0 = r0 & r2
            goto L3f
        L5a:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            long r4 = r4 & r13
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L95
            r12 = -1
        L64:
            r11 = 0
            if (r12 < 0) goto L9d
            int r0 = r9.LJ
            int r0 = r0 + (-1)
            r9.LJ = r0
            long[] r8 = r9.LIZ
            int r10 = r9.LIZLLL
            int r7 = r12 >> 3
            r0 = r12 & 7
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
            int r1 = r12 + (-7)
            r1 = r1 & r10
            r0 = r10 & 7
            int r1 = r1 + r0
            int r0 = r1 >> 3
            r8[r0] = r4
            java.lang.Object[] r1 = r9.LIZJ
            r0 = r1[r12]
            r1[r12] = r11
            return r0
        L95:
            int r15 = r15 + 8
            int r16 = r16 + r15
            r16 = r16 & r6
            goto L14
        L9d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029713Yp.LJI(int):java.lang.Object");
    }

    public final void LJII(int i, V v) {
        int iLIZLLL = LIZLLL(i);
        this.LIZIZ[iLIZLLL] = i;
        this.LIZJ[iLIZLLL] = v;
    }
}
