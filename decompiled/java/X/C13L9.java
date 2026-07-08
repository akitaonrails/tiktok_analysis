package X;

/* JADX INFO: renamed from: X.13L9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13L9 {
    public long[] LIZ = C19992013Kc.LIZ;
    public long[] LIZIZ = C13L8.LIZ;
    public int LIZJ;
    public int LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[PHI: r14
      0x0042: PHI (r14v4 int) = (r14v3 int), (r14v5 int) binds: [B:6:0x001b, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r15 = this;
            r0 = r15
            long[] r11 = r0.LIZIZ
            long[] r10 = r0.LIZ
            int r0 = r10.length
            int r9 = r0 + (-2)
            r14 = 0
            if (r9 < 0) goto L47
            r8 = 0
            r14 = 0
        Ld:
            r3 = r10[r8]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r5
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L42
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L27:
            if (r5 >= r6) goto L40
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3c
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            int r0 = X.C786410Ut5.Y2(r0)
            int r14 = r14 + r0
        L3c:
            long r3 = r3 >> r7
            int r5 = r5 + 1
            goto L27
        L40:
            if (r6 != r7) goto L47
        L42:
            if (r8 == r9) goto L47
            int r8 = r8 + 1
            goto Ld
        L47:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13L9.hashCode():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r6
      0x0060: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:6:0x0025, B:20:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r16 = this;
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "["
            r9.append(r0)
            r0 = r16
            long[] r11 = r0.LIZIZ
            long[] r10 = r0.LIZ
            int r0 = r10.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L65
            r7 = 0
            r6 = 0
        L17:
            r4 = r10[r7]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r4
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L60
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r3 = 0
        L31:
            if (r3 >= r12) goto L5e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r4
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5a
            int r0 = r7 << 3
            int r0 = r0 + r3
            r1 = r11[r0]
            r0 = -1
            if (r6 != r0) goto L4e
            java.lang.String r0 = "..."
            r9.append(r0)
        L49:
            java.lang.String r0 = r9.toString()
            return r0
        L4e:
            if (r6 == 0) goto L55
            java.lang.String r0 = ", "
            r9.append(r0)
        L55:
            r9.append(r1)
            int r6 = r6 + 1
        L5a:
            long r4 = r4 >> r13
            int r3 = r3 + 1
            goto L31
        L5e:
            if (r12 != r13) goto L65
        L60:
            if (r7 == r8) goto L65
            int r7 = r7 + 1
            goto L17
        L65:
            java.lang.String r0 = "]"
            r9.append(r0)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13L9.toString():java.lang.String");
    }

    public final boolean LIZ(long j) {
        int iY2 = C786410Ut5.Y2(j) * (-862048943);
        int i = iY2 ^ (iY2 << 16);
        int i2 = i & 127;
        int i3 = this.LIZJ;
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

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
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
            boolean r0 = r10 instanceof X.C13L9
            r16 = 0
            if (r0 != 0) goto L10
            return r16
        L10:
            X.13L9 r10 = (X.C13L9) r10
            int r1 = r10.LIZLLL
            int r0 = r2.LIZLLL
            if (r1 == r0) goto L19
            return r16
        L19:
            long[] r9 = r2.LIZIZ
            long[] r8 = r2.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L5f
            r6 = 0
        L23:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L5a
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r5 = 8 - r0
            r2 = 0
        L3d:
            if (r2 >= r5) goto L58
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r3
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L54
            int r0 = r6 << 3
            int r0 = r0 + r2
            r0 = r9[r0]
            boolean r0 = r10.LIZ(r0)
            if (r0 != 0) goto L54
            return r16
        L54:
            long r3 = r3 >> r11
            int r2 = r2 + 1
            goto L3d
        L58:
            if (r5 != r11) goto L5f
        L5a:
            if (r6 == r7) goto L5f
            int r6 = r6 + 1
            goto L23
        L5f:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13L9.equals(java.lang.Object):boolean");
    }
}
