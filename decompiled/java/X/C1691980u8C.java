package X;

/* JADX INFO: renamed from: X.0u8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691980u8C {
    public final C1692150u8T LIZ;
    public InterfaceC1692950u9l LIZIZ = null;
    public InterfaceC1692950u9l LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZ(long r9) {
        /*
            r8 = this;
            X.0u9l r2 = r8.LIZIZ
            if (r2 == 0) goto L15
            boolean r0 = r2.LIZLLL()
            if (r0 == 0) goto L61
            X.0u9l r1 = r8.LIZJ
            if (r1 == 0) goto L15
            r0 = 1
            X.0ttv r6 = r1.LJJJJZI(r2, r0)
        L13:
            if (r6 != 0) goto L17
        L15:
            X.0ttv r6 = X.C1683130ttv.LJ
        L17:
            r7 = 32
            long r2 = r9 >> r7
            int r1 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r1)
            float r3 = r6.LIZ
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L34
            float r0 = java.lang.Float.intBitsToFloat(r1)
            float r3 = r6.LIZJ
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L34
            float r3 = java.lang.Float.intBitsToFloat(r1)
        L34:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r4
            int r2 = (int) r9
            float r0 = java.lang.Float.intBitsToFloat(r2)
            float r1 = r6.LIZIZ
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L53
            float r0 = java.lang.Float.intBitsToFloat(r2)
            float r1 = r6.LIZLLL
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L53
            float r1 = java.lang.Float.intBitsToFloat(r2)
        L53:
            int r0 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r7
            long r0 = r0 & r4
            long r2 = r2 | r0
            return r2
        L61:
            X.0ttv r6 = X.C1683130ttv.LJ
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1691980u8C.LIZ(long):long");
    }

    public final boolean LIZJ(long j) {
        long jLIZLLL = LIZLLL(LIZ(j));
        int iLJIIIIZZ = this.LIZ.LJIIIIZZ(Float.intBitsToFloat((int) (4294967295L & jLIZLLL)));
        int i = (int) (jLIZLLL >> 32);
        if (Float.intBitsToFloat(i) >= this.LIZ.LJIIIZ(iLJIIIIZZ) && Float.intBitsToFloat(i) <= this.LIZ.LJIIJ(iLJIIIIZZ)) {
            return true;
        }
        return false;
    }

    public final long LIZLLL(long j) {
        InterfaceC1692950u9l interfaceC1692950u9l;
        InterfaceC1692950u9l interfaceC1692950u9l2 = this.LIZIZ;
        if (interfaceC1692950u9l2 != null && interfaceC1692950u9l2.LIZLLL() && (interfaceC1692950u9l = this.LIZJ) != null && interfaceC1692950u9l.LIZLLL()) {
            return interfaceC1692950u9l2.LJJIFFI(interfaceC1692950u9l, j);
        }
        return j;
    }

    public final long LJ(long j) {
        InterfaceC1692950u9l interfaceC1692950u9l;
        InterfaceC1692950u9l interfaceC1692950u9l2 = this.LIZIZ;
        if (interfaceC1692950u9l2 != null && interfaceC1692950u9l2.LIZLLL() && (interfaceC1692950u9l = this.LIZJ) != null && interfaceC1692950u9l.LIZLLL()) {
            return interfaceC1692950u9l.LJJIFFI(interfaceC1692950u9l2, j);
        }
        return j;
    }

    public C1691980u8C(C1692150u8T c1692150u8T, InterfaceC1692950u9l interfaceC1692950u9l) {
        this.LIZ = c1692150u8T;
        this.LIZJ = interfaceC1692950u9l;
    }

    public final int LIZIZ(long j, boolean z) {
        if (z) {
            j = LIZ(j);
        }
        return this.LIZ.LIZIZ.LJI(LIZLLL(j));
    }
}
