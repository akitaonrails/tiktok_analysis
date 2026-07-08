package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13KZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13KZ<K, V> {
    public long[] LIZ = C19992013Kc.LIZ;
    public Object[] LIZIZ;
    public Object[] LIZJ;
    public int LIZLLL;
    public int LJ;

    public final boolean LJ() {
        return this.LJ == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[PHI: r16
      0x0057: PHI (r16v4 int) = (r16v3 int), (r16v5 int) binds: [B:6:0x0020, B:20:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object[] r9 = r0.LIZIZ
            java.lang.Object[] r8 = r0.LIZJ
            long[] r7 = r0.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            r16 = 0
            if (r6 < 0) goto L5c
            r5 = 0
            r16 = 0
        L12:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r10
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 == 0) goto L57
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r4 = 0
        L2c:
            if (r4 >= r10) goto L55
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r2
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L4d
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r9[r0]
            r0 = r8[r0]
            if (r1 == 0) goto L53
            int r1 = r1.hashCode()
        L44:
            if (r0 == 0) goto L51
            int r0 = r0.hashCode()
        L4a:
            r0 = r0 ^ r1
            int r16 = r16 + r0
        L4d:
            long r2 = r2 >> r11
            int r4 = r4 + 1
            goto L2c
        L51:
            r0 = 0
            goto L4a
        L53:
            r1 = 0
            goto L44
        L55:
            if (r10 != r11) goto L5c
        L57:
            if (r5 == r6) goto L5c
            int r5 = r5 + 1
            goto L12
        L5c:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13KZ.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[PHI: r4
      0x0070: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:10:0x002d, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r11 = r18
            boolean r0 = r11.LJ()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "{}"
            return r0
        Lb:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "{"
            r10.<init>(r0)
            java.lang.Object[] r9 = r11.LIZIZ
            java.lang.Object[] r8 = r11.LIZJ
            long[] r7 = r11.LIZ
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L75
            r5 = 0
            r4 = 0
        L1f:
            r2 = r7[r5]
            long r0 = ~r2
            r12 = 7
            long r0 = r0 << r12
            long r0 = r0 & r2
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r13
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 == 0) goto L70
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r1 = 0
        L39:
            if (r1 >= r12) goto L6e
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r2
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L6a
            int r14 = r5 << 3
            int r14 = r14 + r1
            r0 = r9[r14]
            r15 = r8[r14]
            java.lang.String r14 = "(this)"
            if (r0 != r11) goto L51
            r0 = r14
        L51:
            r10.append(r0)
            java.lang.String r0 = "="
            r10.append(r0)
            if (r15 != r11) goto L5c
            r15 = r14
        L5c:
            r10.append(r15)
            int r4 = r4 + 1
            int r0 = r11.LJ
            if (r4 >= r0) goto L6a
            java.lang.String r0 = ", "
            r10.append(r0)
        L6a:
            long r2 = r2 >> r13
            int r1 = r1 + 1
            goto L39
        L6e:
            if (r12 != r13) goto L75
        L70:
            if (r5 == r6) goto L75
            int r5 = r5 + 1
            goto L1f
        L75:
            r0 = 125(0x7d, float:1.75E-43)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13KZ.toString():java.lang.String");
    }

    public C13KZ() {
        Object[] objArr = C830540Wi4.LIZJ;
        this.LIZIZ = objArr;
        this.LIZJ = objArr;
    }

    public final boolean LIZ(K k) {
        int iHashCode;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.LIZLLL;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.LJFF(this.LIZIZ[iNumberOfTrailingZeros], k)) {
                    if (iNumberOfTrailingZeros < 0) {
                        return false;
                    }
                    return true;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final boolean LIZIZ(K k) {
        int iHashCode;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.LIZLLL;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.LJFF(this.LIZIZ[iNumberOfTrailingZeros], k)) {
                    if (iNumberOfTrailingZeros < 0) {
                        return false;
                    }
                    return true;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(V r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object[] r12 = r0.LIZJ
            long[] r11 = r0.LIZ
            int r0 = r11.length
            int r10 = r0 + (-2)
            r15 = 0
            if (r10 < 0) goto L4c
            r9 = 0
        Ld:
            r2 = r11[r9]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r5
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L47
            int r0 = r9 - r10
            int r0 = ~r0
            int r0 = r0 >>> 31
            r8 = 8
            int r7 = 8 - r0
            r6 = 0
        L27:
            if (r6 >= r7) goto L45
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r2
            r4 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L41
            int r0 = r9 << 3
            int r0 = r0 + r6
            r0 = r12[r0]
            r4 = r17
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L41
            return r1
        L41:
            long r2 = r2 >> r8
            int r6 = r6 + 1
            goto L27
        L45:
            if (r7 != r8) goto L4c
        L47:
            if (r9 == r10) goto L4c
            int r9 = r9 + 1
            goto Ld
        L4c:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13KZ.LIZJ(java.lang.Object):boolean");
    }

    public final V LIZLLL(K k) {
        int iHashCode;
        if (k != null) {
            iHashCode = k.hashCode();
        } else {
            iHashCode = 0;
        }
        int i = iHashCode * (-862048943);
        int i2 = i ^ (i << 16);
        int i3 = i2 & 127;
        int i4 = this.LIZLLL;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.LIZ;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.LJFF(this.LIZIZ[iNumberOfTrailingZeros], k)) {
                    if (iNumberOfTrailingZeros >= 0) {
                        return (V) this.LIZJ[iNumberOfTrailingZeros];
                    }
                    return null;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) == 0) {
                i6 += 8;
                i5 = (i5 + i6) & i4;
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
            boolean r0 = r10 instanceof X.C13KZ
            r17 = 0
            if (r0 != 0) goto L10
            return r17
        L10:
            X.13KZ r10 = (X.C13KZ) r10
            int r1 = r10.LJ
            int r0 = r2.LJ
            if (r1 == r0) goto L19
            return r17
        L19:
            java.lang.Object[] r9 = r2.LIZIZ
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
            java.lang.Object r0 = r10.LIZLLL(r13)
            if (r0 != 0) goto L5f
            boolean r0 = r10.LIZIZ(r13)
            if (r0 != 0) goto L6b
        L5f:
            return r17
        L60:
            java.lang.Object r0 = r10.LIZLLL(r13)
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
        throw new UnsupportedOperationException("Method not decompiled: X.C13KZ.equals(java.lang.Object):boolean");
    }
}
