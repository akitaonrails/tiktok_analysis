package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680920tqM extends AbstractC20055413dY implements InterfaceC1695680uEA {
    public Function1<? super InterfaceC1675870tiD, Unit> LLJJ;

    @Override // X.InterfaceC1695680uEA
    public final /* synthetic */ void LJJLIIIJJIZ() {
    }

    public C1680920tqM(Function1<? super InterfaceC1675870tiD, Unit> function1) {
        this.LLJJ = function1;
    }

    @Override // X.InterfaceC1695680uEA
    public final void LJJIFFI(InterfaceC1669010tX9 interfaceC1669010tX9) {
        this.LLJJ.invoke(interfaceC1669010tX9);
        interfaceC1669010tX9.LLIIJLIL();
    }
}
