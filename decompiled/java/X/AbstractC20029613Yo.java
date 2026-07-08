package X;

/* JADX INFO: renamed from: X.13Yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20029613Yo<V> {
    public long[] LIZ = C19992013Kc.LIZ;
    public int[] LIZIZ = C649500Pdk.LIZ;
    public Object[] LIZJ = C830540Wi4.LIZJ;
    public int LIZLLL;
    public int LJ;

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[PHI: r16
      0x004f: PHI (r16v4 int) = (r16v3 int), (r16v5 int) binds: [B:6:0x0020, B:17:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r17 = this;
            r0 = r17
            int[] r10 = r0.LIZIZ
            java.lang.Object[] r9 = r0.LIZJ
            long[] r8 = r0.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            r16 = 0
            if (r7 < 0) goto L54
            r6 = 0
            r16 = 0
        L12:
            r2 = r8[r6]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L4f
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r5 = 8 - r0
            r4 = 0
        L2c:
            if (r4 >= r5) goto L4d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r2
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L47
            int r0 = r6 << 3
            int r0 = r0 + r4
            r1 = r10[r0]
            r0 = r9[r0]
            if (r0 == 0) goto L4b
            int r0 = r0.hashCode()
        L44:
            r0 = r0 ^ r1
            int r16 = r16 + r0
        L47:
            long r2 = r2 >> r11
            int r4 = r4 + 1
            goto L2c
        L4b:
            r0 = 0
            goto L44
        L4d:
            if (r5 != r11) goto L54
        L4f:
            if (r6 == r7) goto L54
            int r6 = r6 + 1
            goto L12
        L54:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20029613Yo.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r4
      0x006a: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:10:0x002b, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
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
            java.lang.Object[] r8 = r11.LIZJ
            long[] r7 = r11.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L6f
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
            if (r12 == 0) goto L6a
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r1 = 0
        L37:
            if (r1 >= r12) goto L68
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r2
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L64
            int r14 = r5 << 3
            int r14 = r14 + r1
            r0 = r9[r14]
            r14 = r8[r14]
            r10.append(r0)
            java.lang.String r0 = "="
            r10.append(r0)
            if (r14 != r11) goto L56
            java.lang.String r14 = "(this)"
        L56:
            r10.append(r14)
            int r4 = r4 + 1
            int r0 = r11.LJ
            if (r4 >= r0) goto L64
            java.lang.String r0 = ", "
            r10.append(r0)
        L64:
            long r2 = r2 >> r13
            int r1 = r1 + 1
            goto L37
        L68:
            if (r12 != r13) goto L6f
        L6a:
            if (r5 == r6) goto L6f
            int r5 = r5 + 1
            goto L1d
        L6f:
            r0 = 125(0x7d, float:1.75E-43)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20029613Yo.toString():java.lang.String");
    }

    public final boolean LIZ(int i) {
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

    public final V LIZIZ(int i) {
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
                    if (iNumberOfTrailingZeros >= 0) {
                        return (V) this.LIZJ[iNumberOfTrailingZeros];
                    }
                    return null;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) == 0) {
                i7 += 8;
                i6 = (i6 + i7) & i5;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r20) {
        /*
            r19 = this;
            r10 = r20
            r18 = 1
            r2 = r19
            if (r10 != r2) goto L9
            return r18
        L9:
            boolean r0 = r10 instanceof X.AbstractC20029613Yo
            r17 = 0
            if (r0 != 0) goto L10
            return r17
        L10:
            X.13Yo r10 = (X.AbstractC20029613Yo) r10
            int r1 = r10.LJ
            int r0 = r2.LJ
            if (r1 == r0) goto L19
            return r17
        L19:
            int[] r9 = r2.LIZIZ
            java.lang.Object[] r8 = r2.LIZJ
            long[] r7 = r2.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L76
            r5 = 0
        L25:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L71
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = 0
        L3f:
            if (r4 >= r11) goto L6f
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r2
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L6b
            int r0 = r5 << 3
            int r0 = r0 + r4
            r13 = r9[r0]
            r1 = r8[r0]
            if (r1 != 0) goto L60
            java.lang.Object r0 = r10.LIZIZ(r13)
            if (r0 != 0) goto L5f
            boolean r0 = r10.LIZ(r13)
            if (r0 != 0) goto L6b
        L5f:
            return r17
        L60:
            java.lang.Object r0 = r10.LIZIZ(r13)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L6b
            return r17
        L6b:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L3f
        L6f:
            if (r11 != r12) goto L76
        L71:
            if (r5 == r6) goto L76
            int r5 = r5 + 1
            goto L25
        L76:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20029613Yo.equals(java.lang.Object):boolean");
    }
}
