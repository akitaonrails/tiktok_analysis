package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p2.j1;

/* JADX INFO: renamed from: X.0tj5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676410tj5 extends AbstractC20055413dY implements InterfaceC20056813dm {
    public Function1<? super InterfaceC1692950u9l, Unit> LLJJ;

    @Override // X.InterfaceC20056813dm
    public final /* synthetic */ void LJJLJ(long j) {
    }

    public C1676410tj5(Function1<? super InterfaceC1692950u9l, Unit> function1) {
        this.LLJJ = function1;
    }

    @Override // X.InterfaceC20056813dm
    public final void LLFF(j1 j1Var) {
        this.LLJJ.invoke(j1Var);
    }
}
