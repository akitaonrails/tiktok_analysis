package X;

/* JADX INFO: renamed from: X.13L6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13L6<V> {
    public long[] LIZ = C19992013Kc.LIZ;
    public long[] LIZIZ = C13L8.LIZ;
    public Object[] LIZJ = C830540Wi4.LIZJ;
    public int LIZLLL;
    public int LJ;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[PHI: r15
      0x0050: PHI (r15v4 int) = (r15v3 int), (r15v5 int) binds: [B:6:0x001e, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r16 = this;
            r0 = r16
            long[] r10 = r0.LIZIZ
            java.lang.Object[] r9 = r0.LIZJ
            long[] r8 = r0.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            r15 = 0
            if (r7 < 0) goto L55
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
            if (r2 == 0) goto L50
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r5 = 0
        L2a:
            if (r5 >= r11) goto L4e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L48
            int r0 = r6 << 3
            int r0 = r0 + r5
            r1 = r10[r0]
            r0 = r9[r0]
            int r1 = X.C786410Ut5.Y2(r1)
            if (r0 == 0) goto L4c
            int r0 = r0.hashCode()
        L46:
            r0 = r0 ^ r1
            int r15 = r15 + r0
        L48:
            long r3 = r3 >> r12
            int r5 = r5 + 1
            goto L2a
        L4c:
            r0 = 0
            goto L46
        L4e:
            if (r11 != r12) goto L55
        L50:
            if (r6 == r7) goto L55
            int r6 = r6 + 1
            goto L10
        L55:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13L6.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r5
      0x006a: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:10:0x002b, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r12 = r19
            int r0 = r12.LJ
            if (r0 != 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "{"
            r11.<init>(r0)
            long[] r10 = r12.LIZIZ
            java.lang.Object[] r9 = r12.LIZJ
            long[] r8 = r12.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L6f
            r6 = 0
            r5 = 0
        L1d:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r13
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L6a
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r14 = 8
            int r13 = 8 - r0
            r2 = 0
        L37:
            if (r2 >= r13) goto L68
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r17 & r3
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L64
            int r15 = r6 << 3
            int r15 = r15 + r2
            r0 = r10[r15]
            r15 = r9[r15]
            r11.append(r0)
            java.lang.String r0 = "="
            r11.append(r0)
            if (r15 != r12) goto L56
            java.lang.String r15 = "(this)"
        L56:
            r11.append(r15)
            int r5 = r5 + 1
            int r0 = r12.LJ
            if (r5 >= r0) goto L64
            java.lang.String r0 = ", "
            r11.append(r0)
        L64:
            long r3 = r3 >> r14
            int r2 = r2 + 1
            goto L37
        L68:
            if (r13 != r14) goto L6f
        L6a:
            if (r6 == r7) goto L6f
            int r6 = r6 + 1
            goto L1d
        L6f:
            r0 = 125(0x7d, float:1.75E-43)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13L6.toString():java.lang.String");
    }

    public final boolean LIZ(long j) {
        int iY2 = C786410Ut5.Y2(j) * (-862048943);
        int i = iY2 ^ (iY2 << 16);
        int i2 = i & 127;
        int i3 = this.LIZLLL;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.LIZIZ[iNumberOfTrailingZeros] == j) {
                    if (iNumberOfTrailingZeros < 0) {
                        return false;
                    }
                    return true;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final V LIZIZ(long j) {
        int iY2 = C786410Ut5.Y2(j) * (-862048943);
        int i = iY2 ^ (iY2 << 16);
        int i2 = i & 127;
        int i3 = this.LIZLLL;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.LIZIZ[iNumberOfTrailingZeros] == j) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return (V) this.LIZJ[iNumberOfTrailingZeros];
                    }
                    return null;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) == 0) {
                i5 += 8;
                i4 = (i4 + i5) & i3;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r10 = r19
            r17 = 1
            r2 = r18
            if (r10 != r2) goto L9
            return r17
        L9:
            boolean r0 = r10 instanceof X.C13L6
            r16 = 0
            if (r0 != 0) goto L10
            return r16
        L10:
            X.13L6 r10 = (X.C13L6) r10
            int r1 = r10.LJ
            int r0 = r2.LJ
            if (r1 == r0) goto L19
            return r16
        L19:
            long[] r9 = r2.LIZIZ
            java.lang.Object[] r8 = r2.LIZJ
            long[] r7 = r2.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L78
            r5 = 0
        L25:
            r3 = r7[r5]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L73
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r12 = 8 - r0
            r11 = 0
        L3f:
            if (r11 >= r12) goto L71
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6d
            int r0 = r5 << 3
            int r0 = r0 + r11
            r1 = r9[r0]
            r13 = r8[r0]
            if (r13 != 0) goto L60
            java.lang.Object r0 = r10.LIZIZ(r1)
            if (r0 != 0) goto L5f
            boolean r0 = r10.LIZ(r1)
            if (r0 != 0) goto L6b
        L5f:
            return r16
        L60:
            java.lang.Object r0 = r10.LIZIZ(r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r13, r0)
            if (r0 != 0) goto L6b
            return r16
        L6b:
            r15 = 8
        L6d:
            long r3 = r3 >> r15
            int r11 = r11 + 1
            goto L3f
        L71:
            if (r12 != r15) goto L78
        L73:
            if (r5 == r6) goto L78
            int r5 = r5 + 1
            goto L25
        L78:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13L6.equals(java.lang.Object):boolean");
    }
}
