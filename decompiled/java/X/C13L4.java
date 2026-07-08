package X;

/* JADX INFO: renamed from: X.13L4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13L4 {
    public long[] LIZ = C19992013Kc.LIZ;
    public float[] LIZIZ = C13L3.LIZ;
    public int LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[PHI: r14
      0x0041: PHI (r14v4 int) = (r14v3 int), (r14v5 int) binds: [B:6:0x001a, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r15 = this;
            float[] r9 = r15.LIZIZ
            long[] r8 = r15.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            r14 = 0
            if (r7 < 0) goto L46
            r6 = 0
            r14 = 0
        Lc:
            r1 = r8[r6]
            long r3 = ~r1
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r1
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r10
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L41
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r5 = 0
        L26:
            if (r5 >= r10) goto L3f
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r1
            r3 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 >= 0) goto L3b
            int r0 = r6 << 3
            int r0 = r0 + r5
            r0 = r9[r0]
            int r0 = java.lang.Float.floatToIntBits(r0)
            int r14 = r14 + r0
        L3b:
            long r1 = r1 >> r11
            int r5 = r5 + 1
            goto L26
        L3f:
            if (r10 != r11) goto L46
        L41:
            if (r6 == r7) goto L46
            int r6 = r6 + 1
            goto Lc
        L46:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13L4.hashCode():int");
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
            float[] r10 = r0.LIZIZ
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
        throw new UnsupportedOperationException("Method not decompiled: X.C13L4.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (((((~r4) << 6) & r4) & (-9187201950435737472L)) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13L4.equals(java.lang.Object):boolean");
    }
}
