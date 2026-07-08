package X;

import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684140tvY extends AbstractC20055413dY implements InterfaceC20052813d8 {
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;

    public final long LLJJ(InterfaceC1690500u5o interfaceC1690500u5o) {
        int iLJLLJ;
        int iLJLLJ2;
        int iLJLLJ3;
        int i = 0;
        if (!Float.isNaN(this.LLJJIII)) {
            iLJLLJ = interfaceC1690500u5o.LJLLJ(this.LLJJIII);
            if (iLJLLJ < 0) {
                iLJLLJ = 0;
            }
        } else {
            iLJLLJ = Integer.MAX_VALUE;
        }
        if (!Float.isNaN(this.LLJJIJI)) {
            iLJLLJ2 = interfaceC1690500u5o.LJLLJ(this.LLJJIJI);
            if (iLJLLJ2 < 0) {
                iLJLLJ2 = 0;
            }
        } else {
            iLJLLJ2 = Integer.MAX_VALUE;
        }
        if (!(!Float.isNaN(this.LLJJ)) || (iLJLLJ3 = interfaceC1690500u5o.LJLLJ(this.LLJJ)) < 0) {
            iLJLLJ3 = 0;
        } else {
            if (iLJLLJ3 > iLJLLJ) {
                iLJLLJ3 = iLJLLJ;
            }
            if (iLJLLJ3 == Integer.MAX_VALUE) {
                iLJLLJ3 = 0;
            }
        }
        if (!Float.isNaN(this.LLJJI)) {
            int iLJLLJ4 = interfaceC1690500u5o.LJLLJ(this.LLJJI);
            if (iLJLLJ4 < 0) {
                iLJLLJ4 = 0;
            } else {
                if (iLJLLJ4 > iLJLLJ2) {
                    iLJLLJ4 = iLJLLJ2;
                }
                if (iLJLLJ4 != Integer.MAX_VALUE) {
                }
            }
            i = iLJLLJ4;
        }
        return C1682390tsj.LIZ(iLJLLJ3, iLJLLJ, i, iLJLLJ2);
    }

    @Override // X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        long jLLJJ = LLJJ(interfaceC1676350tiz);
        if (C1682380tsi.LJFF(jLLJJ)) {
            return C1682380tsi.LJII(jLLJJ);
        }
        if (!this.LLJJIJIIJIL) {
            i = C1682390tsj.LJI(i, jLLJJ);
        }
        return C1682390tsj.LJFF(interfaceC1676340tiy.LJJIJ(i), jLLJJ);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        long jLLJJ = LLJJ(interfaceC1676350tiz);
        if (C1682380tsi.LJFF(jLLJJ)) {
            return C1682380tsi.LJII(jLLJJ);
        }
        if (!this.LLJJIJIIJIL) {
            i = C1682390tsj.LJI(i, jLLJJ);
        }
        return C1682390tsj.LJFF(interfaceC1676340tiy.LJJIIZ(i), jLLJJ);
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        int iLJIIJ;
        int iLJIIIIZZ;
        int iLJIIIZ;
        int iLJII;
        long jLIZ;
        long jLLJJ = LLJJ(interfaceC1689940u4u);
        if (this.LLJJIJIIJIL) {
            jLIZ = C1682390tsj.LJ(j, jLLJJ);
        } else {
            if (!Float.isNaN(this.LLJJ)) {
                iLJIIJ = C1682380tsi.LJIIJ(jLLJJ);
            } else {
                iLJIIJ = C1682380tsi.LJIIJ(j);
                int iLJIIIIZZ2 = C1682380tsi.LJIIIIZZ(jLLJJ);
                if (iLJIIJ > iLJIIIIZZ2) {
                    iLJIIJ = iLJIIIIZZ2;
                }
            }
            if (!Float.isNaN(this.LLJJIII)) {
                iLJIIIIZZ = C1682380tsi.LJIIIIZZ(jLLJJ);
            } else {
                iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
                int iLJIIJ2 = C1682380tsi.LJIIJ(jLLJJ);
                if (iLJIIIIZZ < iLJIIJ2) {
                    iLJIIIIZZ = iLJIIJ2;
                }
            }
            if (!Float.isNaN(this.LLJJI)) {
                iLJIIIZ = C1682380tsi.LJIIIZ(jLLJJ);
            } else {
                iLJIIIZ = C1682380tsi.LJIIIZ(j);
                int iLJII2 = C1682380tsi.LJII(jLLJJ);
                if (iLJIIIZ > iLJII2) {
                    iLJIIIZ = iLJII2;
                }
            }
            if (!Float.isNaN(this.LLJJIJI)) {
                iLJII = C1682380tsi.LJII(jLLJJ);
            } else {
                iLJII = C1682380tsi.LJII(j);
                int iLJIIIZ2 = C1682380tsi.LJIIIZ(jLLJJ);
                if (iLJII < iLJIIIZ2) {
                    iLJII = iLJIIIZ2;
                }
            }
            jLIZ = C1682390tsj.LIZ(iLJIIJ, iLJIIIIZZ, iLJIIIZ, iLJII);
        }
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(jLIZ);
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, abstractC1686530tzPLJJJJZ.LLILLJJLI, C2097608Jq.LJ(), new AwS604S0100000_25(abstractC1686530tzPLJJJJZ, 640));
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        long jLLJJ = LLJJ(interfaceC1676350tiz);
        if (C1682380tsi.LJI(jLLJJ)) {
            return C1682380tsi.LJIIIIZZ(jLLJJ);
        }
        if (!this.LLJJIJIIJIL) {
            i = C1682390tsj.LJFF(i, jLLJJ);
        }
        return C1682390tsj.LJI(interfaceC1676340tiy.LJJII(i), jLLJJ);
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        long jLLJJ = LLJJ(interfaceC1676350tiz);
        if (C1682380tsi.LJI(jLLJJ)) {
            return C1682380tsi.LJIIIIZZ(jLLJJ);
        }
        if (!this.LLJJIJIIJIL) {
            i = C1682390tsj.LJFF(i, jLLJJ);
        }
        return C1682390tsj.LJI(interfaceC1676340tiy.LJJIL(i), jLLJJ);
    }

    public C1684140tvY(float f, float f2, float f3, float f4, boolean z) {
        this.LLJJ = f;
        this.LLJJI = f2;
        this.LLJJIII = f3;
        this.LLJJIJI = f4;
        this.LLJJIJIIJIL = z;
    }
}
