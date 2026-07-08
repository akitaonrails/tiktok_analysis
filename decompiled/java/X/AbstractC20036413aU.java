package X;

/* JADX INFO: renamed from: X.13aU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20036413aU {
    public long[] LIZ = C19992013Kc.LIZ;
    public int[] LIZIZ = C649500Pdk.LIZ;
    public int LIZJ;
    public int LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[PHI: r14
      0x003d: PHI (r14v4 int) = (r14v3 int), (r14v5 int) binds: [B:6:0x001a, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r15 = this;
            int[] r10 = r15.LIZIZ
            long[] r9 = r15.LIZ
            int r0 = r9.length
            int r8 = r0 + (-2)
            r14 = 0
            if (r8 < 0) goto L42
            r7 = 0
            r14 = 0
        Lc:
            r3 = r9[r7]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r5
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L3d
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r6 = 8 - r0
            r5 = 0
        L26:
            if (r5 >= r6) goto L3b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L37
            int r0 = r7 << 3
            int r0 = r0 + r5
            r0 = r10[r0]
            int r14 = r14 + r0
        L37:
            long r3 = r3 >> r11
            int r5 = r5 + 1
            goto L26
        L3b:
            if (r6 != r11) goto L42
        L3d:
            if (r7 == r8) goto L42
            int r7 = r7 + 1
            goto Lc
        L42:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20036413aU.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r5
      0x0060: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0025, B:20:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r17 = this;
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "["
            r8.append(r0)
            r0 = r17
            int[] r10 = r0.LIZIZ
            long[] r9 = r0.LIZ
            int r0 = r9.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L65
            r6 = 0
            r5 = 0
        L17:
            r2 = r9[r6]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L60
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = 0
        L31:
            if (r4 >= r11) goto L5e
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r2
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L5a
            int r0 = r6 << 3
            int r0 = r0 + r4
            r1 = r10[r0]
            r0 = -1
            if (r5 != r0) goto L4e
            java.lang.String r0 = "..."
            r8.append(r0)
        L49:
            java.lang.String r0 = r8.toString()
            return r0
        L4e:
            if (r5 == 0) goto L55
            java.lang.String r0 = ", "
            r8.append(r0)
        L55:
            r8.append(r1)
            int r5 = r5 + 1
        L5a:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L31
        L5e:
            if (r11 != r12) goto L65
        L60:
            if (r6 == r7) goto L65
            int r6 = r6 + 1
            goto L17
        L65:
            java.lang.String r0 = "]"
            r8.append(r0)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20036413aU.toString():java.lang.String");
    }

    public final boolean LIZ(int i) {
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r18
            r16 = 1
            r2 = r17
            if (r10 != r2) goto L9
            return r16
        L9:
            boolean r0 = r10 instanceof X.AbstractC20036413aU
            r15 = 0
            if (r0 != 0) goto Lf
            return r15
        Lf:
            X.13aU r10 = (X.AbstractC20036413aU) r10
            int r1 = r10.LIZLLL
            int r0 = r2.LIZLLL
            if (r1 == r0) goto L18
            return r15
        L18:
            int[] r9 = r2.LIZIZ
            long[] r8 = r2.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L5e
            r6 = 0
        L22:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L59
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r5 = 0
        L3c:
            if (r5 >= r11) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L53
            int r0 = r6 << 3
            int r0 = r0 + r5
            r0 = r9[r0]
            boolean r0 = r10.LIZ(r0)
            if (r0 != 0) goto L53
            return r15
        L53:
            long r3 = r3 >> r12
            int r5 = r5 + 1
            goto L3c
        L57:
            if (r11 != r12) goto L5e
        L59:
            if (r6 == r7) goto L5e
            int r6 = r6 + 1
            goto L22
        L5e:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20036413aU.equals(java.lang.Object):boolean");
    }
}
