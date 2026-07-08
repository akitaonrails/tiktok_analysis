package X;

/* JADX INFO: renamed from: X.0u2E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688280u2E {
    public final EnumC1688240u2A LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public InterfaceC1673370teB LIZLLL;
    public AbstractC1686530tzP LJ;
    public InterfaceC1673370teB LJFF;
    public AbstractC1686530tzP LJI;
    public C1688300u2G LJII;
    public C1688300u2G LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1688280u2E)) {
            return false;
        }
        C1688280u2E c1688280u2E = (C1688280u2E) obj;
        return this.LIZ == c1688280u2E.LIZ && this.LIZIZ == c1688280u2E.LIZIZ && this.LIZJ == c1688280u2E.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlowLayoutOverflowState(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", minLinesToShowCollapse=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", minCrossAxisSizeToShowCollapse=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1688280u2E(EnumC1688240u2A enumC1688240u2A, int i, int i2) {
        this.LIZ = enumC1688240u2A;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    public final C1688300u2G LIZ(int i, int i2, boolean z) {
        int i3 = C1688250u2B.LIZ[this.LIZ.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return null;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (z) {
                    return this.LJII;
                }
                if (i + 1 < this.LIZIZ || i2 < this.LIZJ) {
                    return null;
                }
                return this.LJIIIIZZ;
            }
            throw new C1954807lC();
        }
        if (!z) {
            return null;
        }
        return this.LJII;
    }

    public final void LIZIZ(InterfaceC1676340tiy interfaceC1676340tiy, InterfaceC1676340tiy interfaceC1676340tiy2, boolean z, long j) {
        EnumC1324330kZD enumC1324330kZD;
        int iLJJIJ;
        int iLJJII;
        InterfaceC1673370teB interfaceC1673370teB;
        int iLJJIJ2;
        int iLJJII2;
        InterfaceC1673370teB interfaceC1673370teB2;
        if (z) {
            enumC1324330kZD = EnumC1324330kZD.Horizontal;
        } else {
            enumC1324330kZD = EnumC1324330kZD.Vertical;
        }
        long jLIZ = C1688310u2H.LIZ(j, enumC1324330kZD);
        if (interfaceC1676340tiy != null) {
            int iLJII = C1682380tsi.LJII(jLIZ);
            int i = C1688060u1s.LIZ;
            if (z) {
                iLJJIJ2 = interfaceC1676340tiy.LJJII(iLJII);
                iLJJII2 = interfaceC1676340tiy.LJJIJ(iLJJIJ2);
            } else {
                iLJJIJ2 = interfaceC1676340tiy.LJJIJ(iLJII);
                iLJJII2 = interfaceC1676340tiy.LJJII(iLJJIJ2);
            }
            this.LJII = new C1688300u2G(C1688300u2G.LIZ(iLJJIJ2, iLJJII2));
            if (interfaceC1676340tiy instanceof InterfaceC1673370teB) {
                interfaceC1673370teB2 = (InterfaceC1673370teB) interfaceC1676340tiy;
            } else {
                interfaceC1673370teB2 = null;
            }
            this.LIZLLL = interfaceC1673370teB2;
            this.LJ = null;
        }
        if (interfaceC1676340tiy2 != null) {
            int iLJII2 = C1682380tsi.LJII(jLIZ);
            int i2 = C1688060u1s.LIZ;
            if (z) {
                iLJJIJ = interfaceC1676340tiy2.LJJII(iLJII2);
                iLJJII = interfaceC1676340tiy2.LJJIJ(iLJJIJ);
            } else {
                iLJJIJ = interfaceC1676340tiy2.LJJIJ(iLJII2);
                iLJJII = interfaceC1676340tiy2.LJJII(iLJJIJ);
            }
            this.LJIIIIZZ = new C1688300u2G(C1688300u2G.LIZ(iLJJIJ, iLJJII));
            if (interfaceC1676340tiy2 instanceof InterfaceC1673370teB) {
                interfaceC1673370teB = (InterfaceC1673370teB) interfaceC1676340tiy2;
            } else {
                interfaceC1673370teB = null;
            }
            this.LJFF = interfaceC1673370teB;
            this.LJI = null;
        }
    }
}
