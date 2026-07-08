package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p2.j1;

/* JADX INFO: renamed from: X.0txU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685340txU extends AbstractC20055413dY implements InterfaceC20051913cz {
    public Function1<? super InterfaceC1692950u9l, Unit> LLJJ;

    public C1685340txU(Function1<? super InterfaceC1692950u9l, Unit> function1) {
        this.LLJJ = function1;
    }

    @Override // X.InterfaceC20051913cz
    public final void LLIIII(j1 j1Var) {
        this.LLJJ.invoke(j1Var);
    }
}
