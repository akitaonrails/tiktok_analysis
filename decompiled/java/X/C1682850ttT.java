package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS33S0102000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ttT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682850ttT implements InterfaceC20056613dk, InterfaceC1697560uHC, InterfaceC1685780tyC<InterfaceC1672820tdI> {
    public final InterfaceC1672820tdI LIZIZ;
    public final C05P0 LIZJ;
    public final C05P0 LIZLLL;

    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
        return C1685810tyF.LIZ(this, interfaceC1685750ty9);
    }

    @Override // X.InterfaceC20056613dk
    public final /* synthetic */ int LIZLLL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1688380u2O.LIZJ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20056613dk
    public final /* synthetic */ int LJIIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1688380u2O.LIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ boolean LJIILLIIL(Function1 function1) {
        return C1672400tcc.LIZ(this, function1);
    }

    @Override // X.InterfaceC20056613dk
    public final /* synthetic */ int LJIJJLI(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1688380u2O.LIZLLL(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC20056613dk
    public final /* synthetic */ int LJIL(InterfaceC1676350tiz interfaceC1676350tiz, InterfaceC1676340tiy interfaceC1676340tiy, int i) {
        return C1688380u2O.LIZIZ(this, interfaceC1676350tiz, interfaceC1676340tiy, i);
    }

    @Override // X.InterfaceC1685780tyC
    public final InterfaceC1672820tdI LJIIIIZZ() {
        return (InterfaceC1672820tdI) ((C13FE) this.LIZLLL).getValue();
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    @Override // X.InterfaceC1685780tyC
    public final C1691310u77<InterfaceC1672820tdI> getKey() {
        return C1682870ttV.LIZ;
    }

    public C1682850ttT(InterfaceC1672820tdI interfaceC1672820tdI) {
        this.LIZIZ = interfaceC1672820tdI;
        this.LIZJ = C20028913Yh.LJI(interfaceC1672820tdI);
        this.LIZLLL = C20028913Yh.LJI(interfaceC1672820tdI);
    }

    @Override // X.InterfaceC1697560uHC
    public final void LJIILIIL(InterfaceC1682880ttW interfaceC1682880ttW) {
        InterfaceC1672820tdI interfaceC1672820tdI = (InterfaceC1672820tdI) interfaceC1682880ttW.LJLJJLL(C1682870ttV.LIZ);
        ((C13FE) this.LIZJ).setValue(new C1672850tdL(this.LIZIZ, interfaceC1672820tdI));
        ((C13FE) this.LIZLLL).setValue(new C1672840tdK(interfaceC1672820tdI, this.LIZIZ));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1682850ttT)) {
            return false;
        }
        return Intrinsics.LJFF(((C1682850ttT) obj).LIZIZ, this.LIZIZ);
    }

    @Override // X.InterfaceC1685750ty9
    public final Object LJIILJJIL(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // X.InterfaceC20056613dk
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        int iLIZJ = ((InterfaceC1672820tdI) ((C13FE) this.LIZJ).getValue()).LIZJ(interfaceC1689940u4u, interfaceC1689940u4u.getLayoutDirection());
        int iLIZ = ((InterfaceC1672820tdI) ((C13FE) this.LIZJ).getValue()).LIZ(interfaceC1689940u4u);
        int iLIZIZ = ((InterfaceC1672820tdI) ((C13FE) this.LIZJ).getValue()).LIZIZ(interfaceC1689940u4u, interfaceC1689940u4u.getLayoutDirection()) + iLIZJ;
        int iLIZLLL = ((InterfaceC1672820tdI) ((C13FE) this.LIZJ).getValue()).LIZLLL(interfaceC1689940u4u) + iLIZ;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682390tsj.LJIIIIZZ(-iLIZIZ, -iLIZLLL, j));
        return interfaceC1689940u4u.LJLJJL(C1682390tsj.LJI(abstractC1686530tzPLJJJJZ.LL + iLIZIZ, j), C1682390tsj.LJFF(abstractC1686530tzPLJJJJZ.LLILLJJLI + iLIZLLL, j), C2097608Jq.LJ(), new AwS33S0102000_25(iLIZJ, iLIZ, abstractC1686530tzPLJJJJZ, 4));
    }
}
