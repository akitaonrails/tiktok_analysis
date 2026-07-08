package X;

/* JADX INFO: renamed from: X.0u2F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688290u2F {
    public final int LIZ;
    public final C1688280u2E LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public C1688290u2F(int i, C1688280u2E c1688280u2E, long j, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = c1688280u2E;
        this.LIZJ = j;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
    }

    public final C1688330u2J LIZ(C1688340u2K c1688340u2K, boolean z, int i, int i2, int i3, int i4) {
        InterfaceC1673370teB interfaceC1673370teB;
        C1688300u2G c1688300u2G;
        AbstractC1686530tzP abstractC1686530tzP;
        if (!c1688340u2K.LIZIZ) {
            return null;
        }
        C1688280u2E c1688280u2E = this.LIZIZ;
        int i5 = C1688250u2B.LIZ[c1688280u2E.LIZ.ordinal()];
        boolean z2 = true;
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3 && i5 != 4) {
                throw new C1954807lC();
            }
            if (z) {
                interfaceC1673370teB = c1688280u2E.LIZLLL;
                c1688300u2G = c1688280u2E.LJII;
                abstractC1686530tzP = c1688280u2E.LJ;
            } else {
                if (i >= c1688280u2E.LIZIZ - 1 && i2 >= c1688280u2E.LIZJ) {
                    interfaceC1673370teB = c1688280u2E.LJFF;
                } else {
                    interfaceC1673370teB = null;
                }
                c1688300u2G = c1688280u2E.LJIIIIZZ;
                abstractC1686530tzP = c1688280u2E.LJI;
            }
            if (interfaceC1673370teB != null) {
                C1688330u2J c1688330u2J = new C1688330u2J(interfaceC1673370teB, abstractC1686530tzP, c1688300u2G.LIZ);
                if (i < 0 || (i4 != 0 && (i3 - ((int) (c1688330u2J.LIZJ >> 32)) < 0 || i4 >= this.LIZ))) {
                    z2 = false;
                }
                c1688330u2J.LIZLLL = z2;
                return c1688330u2J;
            }
        }
        return null;
    }

    public final C1688340u2K LIZIZ(boolean z, int i, long j, C1688300u2G c1688300u2G, int i2, int i3, int i4, boolean z2, boolean z3) {
        C1688300u2G c1688300u2GLIZ;
        int i5 = i3 + i4;
        if (c1688300u2G == null) {
            return new C1688340u2K(true, true);
        }
        if (this.LIZIZ.LIZ != EnumC1688240u2A.Visible && (i2 >= this.LIZLLL || C1688300u2G.LIZIZ(j) - C1688300u2G.LIZIZ(c1688300u2G.LIZ) < 0)) {
            return new C1688340u2K(true, true);
        }
        if (i != 0 && (i >= this.LIZ || ((int) (j >> 32)) - ((int) (c1688300u2G.LIZ >> 32)) < 0)) {
            if (z2) {
                return new C1688340u2K(true, true);
            }
            long jLIZ = C1688300u2G.LIZ(C1682380tsi.LJIIIIZZ(this.LIZJ), (C1688300u2G.LIZIZ(j) - this.LJFF) - i4);
            long j2 = c1688300u2G.LIZ;
            return new C1688340u2K(true, LIZIZ(z, 0, jLIZ, new C1688300u2G(C1688300u2G.LIZ(((int) (j2 >> 32)) - this.LJ, C1688300u2G.LIZIZ(j2))), i2 + 1, i5, 0, true, false).LIZIZ);
        }
        int iMax = i3 + Math.max(i4, C1688300u2G.LIZIZ(c1688300u2G.LIZ));
        if (!z3 && (c1688300u2GLIZ = this.LIZIZ.LIZ(i2, iMax, z)) != null && (i + 1 >= this.LIZ || ((((int) (j >> 32)) - ((int) (c1688300u2G.LIZ >> 32))) - this.LJ) - ((int) (c1688300u2GLIZ.LIZ >> 32)) < 0)) {
            if (z3) {
                return new C1688340u2K(true, true);
            }
            boolean z4 = LIZIZ(false, 0, C1688300u2G.LIZ(C1682380tsi.LJIIIIZZ(this.LIZJ), (C1688300u2G.LIZIZ(j) - this.LJFF) - Math.max(i4, C1688300u2G.LIZIZ(c1688300u2G.LIZ))), c1688300u2GLIZ, i2 + 1, iMax, 0, true, true).LIZIZ;
            return new C1688340u2K(z4, z4);
        }
        return new C1688340u2K(false, false);
    }
}
