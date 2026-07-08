package X;

import Y.AObjectS197S0300000_25;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tj1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676370tj1<T> extends AbstractC20055413dY implements InterfaceC20052813d8 {
    public C594920NVa<T> LLJJ;
    public Function2<? super C1682900ttY, ? super C1682380tsi, ? extends Pair<? extends InterfaceC594940NVc<T>, ? extends T>> LLJJI;
    public EnumC1684030tvN LLJJIII;
    public boolean LLJJIJI;

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

    @Override // X.AbstractC20055413dY
    public final void LLIZ() {
        this.LLJJIJI = false;
    }

    public C1676370tj1(C594920NVa<T> c594920NVa, Function2<? super C1682900ttY, ? super C1682380tsi, ? extends Pair<? extends InterfaceC594940NVc<T>, ? extends T>> function2, EnumC1684030tvN enumC1684030tvN) {
        this.LLJJ = c594920NVa;
        this.LLJJI = function2;
        this.LLJJIII = enumC1684030tvN;
    }

    @Override // X.InterfaceC20052813d8
    public final InterfaceC1690350u5Z LJIILL(InterfaceC1689940u4u interfaceC1689940u4u, InterfaceC1673370teB interfaceC1673370teB, long j) {
        boolean z;
        AbstractC1686530tzP abstractC1686530tzPLJJJJZ = interfaceC1673370teB.LJJJJZ(j);
        if (!interfaceC1689940u4u.LLIILII() || !this.LLJJIJI) {
            Pair<? extends InterfaceC594940NVc<T>, ? extends T> pairInvoke = this.LLJJI.invoke(new C1682900ttY((((long) abstractC1686530tzPLJJJJZ.LLILLJJLI) & 4294967295L) | (((long) abstractC1686530tzPLJJJJZ.LL) << 32)), new C1682380tsi(j));
            this.LLJJ.LJIIJ(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        if (!interfaceC1689940u4u.LLIILII() && !this.LLJJIJI) {
            z = false;
        } else {
            z = true;
        }
        this.LLJJIJI = z;
        return interfaceC1689940u4u.LJLJJL(abstractC1686530tzPLJJJJZ.LL, abstractC1686530tzPLJJJJZ.LLILLJJLI, C2097608Jq.LJ(), new AObjectS197S0300000_25(interfaceC1689940u4u, this, abstractC1686530tzPLJJJJZ, 1));
    }
}
