package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS9S0302000_25;

/* JADX INFO: renamed from: X.0tvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683980tvI extends AbstractC20055413dY implements InterfaceC20052813d8 {
    public EnumC1683990tvJ LLJJ;
    public boolean LLJJI;
    public Function2<? super C1682900ttY, ? super EnumC1671200tag, C1676820tjk> LLJJIII;

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

    public C1683980tvI(EnumC1683990tvJ enumC1683990tvJ, boolean z, Function2<? super C1682900ttY, ? super EnumC1671200tag, C1676820tjk> function2) {
        this.LLJJ = enumC1683990tvJ;
        this.LLJJI = z;
        this.LLJJIII = function2;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        int iLJIIJ;
        int iLJIIIIZZ;
        EnumC1683990tvJ enumC1683990tvJ = this.LLJJ;
        EnumC1683990tvJ enumC1683990tvJ2 = EnumC1683990tvJ.Vertical;
        int iLJIIIZ = 0;
        if (enumC1683990tvJ != enumC1683990tvJ2) {
            iLJIIJ = 0;
        } else {
            iLJIIJ = C1682380tsi.LJIIJ(j);
        }
        EnumC1683990tvJ enumC1683990tvJ3 = this.LLJJ;
        EnumC1683990tvJ enumC1683990tvJ4 = EnumC1683990tvJ.Horizontal;
        if (enumC1683990tvJ3 == enumC1683990tvJ4) {
            iLJIIIZ = C1682380tsi.LJIIIZ(j);
        }
        int iLJII = Integer.MAX_VALUE;
        if (this.LLJJ != enumC1683990tvJ2 && this.LLJJI) {
            iLJIIIIZZ = Integer.MAX_VALUE;
        } else {
            iLJIIIIZZ = C1682380tsi.LJIIIIZZ(j);
        }
        if (this.LLJJ == enumC1683990tvJ4 || !this.LLJJI) {
            iLJII = C1682380tsi.LJII(j);
        }
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682390tsj.LIZ(iLJIIJ, iLJIIIIZZ, iLJIIIZ, iLJII));
        int iLJ = C13LZ.LJ(abstractC1686530tzPLJJJJZ.LL, C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j));
        int iLJ2 = C13LZ.LJ(abstractC1686530tzPLJJJJZ.LLILLJJLI, C1682380tsi.LJIIIZ(j), C1682380tsi.LJII(j));
        return interfaceC1689940u4u.LJLJJL(iLJ, iLJ2, C2097608Jq.LJ(), new AwS9S0302000_25(this, iLJ, abstractC1686530tzPLJJJJZ, iLJ2, interfaceC1689940u4u, 1));
    }
}
