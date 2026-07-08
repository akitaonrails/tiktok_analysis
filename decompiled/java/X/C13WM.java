package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS274S0300000_30;
import kotlin.jvm.internal.AwS426S0200000_25;
import p2.j1;

/* JADX INFO: renamed from: X.13WM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13WM extends AbstractC20055413dY implements InterfaceC1696300uFA, InterfaceC20056813dm {
    public final C13WL LLJJ;
    public boolean LLJJI;

    @Override // X.InterfaceC20056813dm
    public final /* synthetic */ void LJJLJ(long j) {
    }

    @Override // X.AbstractC20055413dY
    public final boolean LLILLJJLI() {
        return false;
    }

    public C13WM(C20063313ep c20063313ep) {
        this.LLJJ = c20063313ep;
    }

    @Override // X.InterfaceC20056813dm
    public final void LLFF(j1 j1Var) {
        this.LLJJI = true;
    }

    public static final C1683130ttv LLJJ(C13WM c13wm, InterfaceC1692950u9l interfaceC1692950u9l, Function0 function0) {
        C1683130ttv c1683130ttv;
        if (!c13wm.LLJILLL || !c13wm.LLJJI) {
            return null;
        }
        j1 j1VarLJ = C20052513d5.LJ(c13wm);
        if (!interfaceC1692950u9l.LIZLLL() || (c1683130ttv = (C1683130ttv) function0.invoke()) == null) {
            return null;
        }
        return c1683130ttv.LJIIIZ(j1VarLJ.LJJJJZI(interfaceC1692950u9l, false).LJ());
    }

    @Override // X.InterfaceC1696300uFA
    public final Object LJJJJJ(j1 j1Var, AwS426S0200000_25 awS426S0200000_25, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objLJ = C2296808zG.LJ(new C13WI(this, j1Var, awS426S0200000_25, new AwS274S0300000_30(this, j1Var, awS426S0200000_25, 17), null), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }
}
