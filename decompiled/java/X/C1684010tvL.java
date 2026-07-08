package X;

import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684010tvL extends AbstractC20055413dY implements InterfaceC20052813d8 {
    public EnumC1683990tvJ LLJJ;
    public float LLJJI;

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZJ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZLLL(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20052813d8
    public final /* synthetic */ int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1696140uEu.LIZIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    public C1684010tvL(EnumC1683990tvJ enumC1683990tvJ, float f) {
        this.LLJJ = enumC1683990tvJ;
        this.LLJJI = f;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        int iLJIIJ;
        int iLJIIIIZZ;
        int iLJIIIZ;
        int iLJII;
        if (C1682380tsi.LJ(j) && this.LLJJ != EnumC1683990tvJ.Vertical) {
            int iRound = Math.round(C1682380tsi.LJIIIIZZ(j) * this.LLJJI);
            int iLJIIJ2 = C1682380tsi.LJIIJ(j);
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
            if (iRound < iLJIIJ2) {
                iRound = iLJIIJ2;
            }
            if (iRound <= iLJIIIIZZ) {
                iLJIIIIZZ = iRound;
            }
            iLJIIJ = iLJIIIIZZ;
        } else {
            iLJIIJ = C1682380tsi.LJIIJ(j);
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        }
        if (C1682380tsi.LIZLLL(j) && this.LLJJ != EnumC1683990tvJ.Horizontal) {
            int iRound2 = Math.round(C1682380tsi.LJII(j) * this.LLJJI);
            int iLJIIIZ2 = C1682380tsi.LJIIIZ(j);
            iLJIIIZ = C1682380tsi.LJII(j);
            if (iRound2 < iLJIIIZ2) {
                iRound2 = iLJIIIZ2;
            }
            if (iRound2 <= iLJIIIZ) {
                iLJIIIZ = iRound2;
            }
            iLJII = iLJIIIZ;
        } else {
            iLJIIIZ = C1682380tsi.LJIIIZ(j);
            iLJII = C1682380tsi.LJII(j);
        }
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682390tsj.LIZ(iLJIIJ, iLJIIIIZZ, iLJIIIZ, iLJII));
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, abstractC1686530tzPLJJJJZ.LLILLJJLI, C2097608Jq.LJ(), new AwS604S0100000_25(abstractC1686530tzPLJJJJZ, 641));
    }
}
