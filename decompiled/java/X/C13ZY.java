package X;

/* JADX INFO: renamed from: X.13ZY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13ZY {
    public long[] LIZ = C19992013Kc.LIZ;
    public int[] LIZIZ;
    public int[] LIZJ;
    public int LIZLLL;
    public int LJ;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[PHI: r15
      0x0044: PHI (r15v4 int) = (r15v3 int), (r15v5 int) binds: [B:6:0x001e, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r16 = this;
            r0 = r16
            int[] r10 = r0.LIZIZ
            int[] r9 = r0.LIZJ
            long[] r8 = r0.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            r15 = 0
            if (r7 < 0) goto L49
            r6 = 0
            r15 = 0
        L10:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L44
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r5 = 0
        L2a:
            if (r5 >= r11) goto L42
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3e
            int r0 = r6 << 3
            int r0 = r0 + r5
            r1 = r10[r0]
            r0 = r9[r0]
            r0 = r0 ^ r1
            int r15 = r15 + r0
        L3e:
            long r3 = r3 >> r12
            int r5 = r5 + 1
            goto L2a
        L42:
            if (r11 != r12) goto L49
        L44:
            if (r6 == r7) goto L49
            int r6 = r6 + 1
            goto L10
        L49:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZY.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[PHI: r4
      0x0066: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:10:0x002b, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r11 = r18
            int r0 = r11.LJ
            if (r0 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "{"
            r10.<init>(r0)
            int[] r9 = r11.LIZIZ
            int[] r8 = r11.LIZJ
            long[] r7 = r11.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L6b
            r5 = 0
            r4 = 0
        L1d:
            r2 = r7[r5]
            long r0 = ~r2
            r12 = 7
            long r0 = r0 << r12
            long r0 = r0 & r2
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r13
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 == 0) goto L66
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r1 = 0
        L37:
            if (r1 >= r12) goto L64
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r2
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L60
            int r14 = r5 << 3
            int r14 = r14 + r1
            r0 = r9[r14]
            r14 = r8[r14]
            r10.append(r0)
            java.lang.String r0 = "="
            r10.append(r0)
            r10.append(r14)
            int r4 = r4 + 1
            int r0 = r11.LJ
            if (r4 >= r0) goto L60
            java.lang.String r0 = ", "
            r10.append(r0)
        L60:
            long r2 = r2 >> r13
            int r1 = r1 + 1
            goto L37
        L64:
            if (r12 != r13) goto L6b
        L66:
            if (r5 == r6) goto L6b
            int r5 = r5 + 1
            goto L1d
        L6b:
            r0 = 125(0x7d, float:1.75E-43)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZY.toString():java.lang.String");
    }

    public C13ZY() {
        int[] iArr = C649500Pdk.LIZ;
        this.LIZIZ = iArr;
        this.LIZJ = iArr;
    }

    public final int LIZ(int i) {
        int i2 = (-862048943) * i;
        int i3 = i2 ^ (i2 << 16);
        int i4 = i3 & 127;
        int i5 = this.LIZLLL;
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
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final int LIZIZ(int i) {
        int iLIZ = LIZ(i);
        if (iLIZ >= 0) {
            return this.LIZJ[iLIZ];
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r11 = r18
            r0 = 1
            r2 = r17
            if (r11 != r2) goto L8
            return r0
        L8:
            boolean r0 = r11 instanceof X.C13ZY
            r16 = 0
            if (r0 != 0) goto Lf
            return r16
        Lf:
            X.13ZY r11 = (X.C13ZY) r11
            int r1 = r11.LJ
            int r0 = r2.LJ
            if (r1 == r0) goto L18
            return r16
        L18:
            int[] r10 = r2.LIZIZ
            int[] r9 = r2.LIZJ
            long[] r8 = r2.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L68
            r6 = 0
        L24:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L63
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r5 = 0
        L3e:
            if (r5 >= r12) goto L61
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5d
            int r1 = r6 << 3
            int r1 = r1 + r5
            r0 = r10[r1]
            r2 = r9[r1]
            int r1 = r11.LIZ(r0)
            if (r1 < 0) goto L5c
            int[] r0 = r11.LIZJ
            r0 = r0[r1]
            if (r2 == r0) goto L5d
        L5c:
            return r16
        L5d:
            long r3 = r3 >> r13
            int r5 = r5 + 1
            goto L3e
        L61:
            if (r12 != r13) goto L68
        L63:
            if (r6 == r7) goto L68
            int r6 = r6 + 1
            goto L24
        L68:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13ZY.equals(java.lang.Object):boolean");
    }
}
