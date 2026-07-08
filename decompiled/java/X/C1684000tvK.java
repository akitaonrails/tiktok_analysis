package X;

import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684000tvK extends AbstractC20055413dY implements InterfaceC20052813d8 {
    public float LLJJ;
    public float LLJJI;

    public C1684000tvK(float f, float f2) {
        this.LLJJ = f;
        this.LLJJI = f2;
    }

    @Override // X.InterfaceC20052813d8
    public final int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        int iLJLLJ;
        int iLJJIJ = interfaceC1676340tiy.LJJIJ(i);
        if (!Float.isNaN(this.LLJJI)) {
            iLJLLJ = interfaceC1676350tiz.LJLLJ(this.LLJJI);
        } else {
            iLJLLJ = 0;
        }
        if (iLJJIJ < iLJLLJ) {
            return iLJLLJ;
        }
        return iLJJIJ;
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        int iLJLLJ;
        int iLJJIIZ = interfaceC1676340tiy.LJJIIZ(i);
        if (!Float.isNaN(this.LLJJI)) {
            iLJLLJ = interfaceC1676350tiz.LJLLJ(this.LLJJI);
        } else {
            iLJLLJ = 0;
        }
        if (iLJJIIZ < iLJLLJ) {
            return iLJLLJ;
        }
        return iLJJIIZ;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        int iLJIIJ;
        int iLJIIIZ;
        int i = 0;
        if ((!Float.isNaN(this.LLJJ)) && C1682380tsi.LJIIJ(j) == 0) {
            int iLJLLJ = interfaceC1689940u4u.LJLLJ(this.LLJJ);
            iLJIIJ = C1682380tsi.LJIIIIZZ(j);
            if (iLJLLJ < 0) {
                iLJLLJ = 0;
            }
            if (iLJLLJ <= iLJIIJ) {
                iLJIIJ = iLJLLJ;
            }
        } else {
            iLJIIJ = C1682380tsi.LJIIJ(j);
        }
        int iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        if ((!Float.isNaN(this.LLJJI)) && C1682380tsi.LJIIIZ(j) == 0) {
            int iLJLLJ2 = interfaceC1689940u4u.LJLLJ(this.LLJJI);
            iLJIIIZ = C1682380tsi.LJII(j);
            if (iLJLLJ2 >= 0) {
                i = iLJLLJ2;
            }
            if (i <= iLJIIIZ) {
                iLJIIIZ = i;
            }
        } else {
            iLJIIIZ = C1682380tsi.LJIIIZ(j);
        }
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682390tsj.LIZ(iLJIIJ, iLJIIIIZZ, iLJIIIZ, C1682380tsi.LJII(j)));
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, abstractC1686530tzPLJJJJZ.LLILLJJLI, C2097608Jq.LJ(), new AwS604S0100000_25(abstractC1686530tzPLJJJJZ, 644));
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        int iLJLLJ;
        int iLJJII = interfaceC1676340tiy.LJJII(i);
        if (!Float.isNaN(this.LLJJ)) {
            iLJLLJ = interfaceC1676350tiz.LJLLJ(this.LLJJ);
        } else {
            iLJLLJ = 0;
        }
        if (iLJJII < iLJLLJ) {
            return iLJLLJ;
        }
        return iLJJII;
    }

    @Override // X.InterfaceC20052813d8
    public final int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        int iLJLLJ;
        int iLJJIL = interfaceC1676340tiy.LJJIL(i);
        if (!Float.isNaN(this.LLJJ)) {
            iLJLLJ = interfaceC1676350tiz.LJLLJ(this.LLJJ);
        } else {
            iLJLLJ = 0;
        }
        if (iLJJIL < iLJLLJ) {
            return iLJLLJ;
        }
        return iLJJIL;
    }
}
