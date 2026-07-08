package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS49S0301000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684300tvo implements InterfaceC20056613dk {
    public final C1684240tvi LIZIZ;
    public final int LIZJ;
    public final C1684310tvp LIZLLL;
    public final Function0<C1691980u8C> LJ;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1684300tvo)) {
            return false;
        }
        C1684300tvo c1684300tvo = (C1684300tvo) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1684300tvo.LIZIZ) && this.LIZJ == c1684300tvo.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1684300tvo.LIZLLL) && Intrinsics.LJFF(this.LJ, c1684300tvo.LJ);
    }

    public final int hashCode() {
        return (((((this.LIZIZ.hashCode() * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VerticalScrollLayoutModifier(scrollerPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cursorOffset=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", transformedText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", textLayoutResultProvider=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1685750ty9
    public final Object LJIILJJIL(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // X.InterfaceC20056613dk
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(C1682380tsi.LIZ(C1682380tsi.LJIIJ(j), C1682380tsi.LJIIIIZZ(j), C1682380tsi.LJIIIZ(j), Integer.MAX_VALUE));
        int iMin = Math.min(abstractC1686530tzPLJJJJZ.LLILLJJLI, C1682380tsi.LJII(j));
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, iMin, C2097608Jq.LJ(), new AwS49S0301000_25(interfaceC1689940u4u, this, abstractC1686530tzPLJJJJZ, iMin, 4));
    }

    public C1684300tvo(C1684240tvi c1684240tvi, int i, C1684310tvp c1684310tvp, Function0<C1691980u8C> function0) {
        this.LIZIZ = c1684240tvi;
        this.LIZJ = i;
        this.LIZLLL = c1684310tvp;
        this.LJ = function0;
    }
}
