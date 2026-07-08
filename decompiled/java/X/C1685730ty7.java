package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ty7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685730ty7 extends AbstractC1685790tyD implements InterfaceC1672410tcd {
    public final InterfaceC1631620sYq<InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, InterfaceC1685750ty9> LIZJ;

    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
        return C1685810tyF.LIZ(this, interfaceC1685750ty9);
    }

    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ boolean LJIILLIIL(Function1 function1) {
        return C1672400tcc.LIZ(this, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1685730ty7(Function1<? super C1688620u2m, Unit> function1, InterfaceC1631620sYq<? super InterfaceC1685750ty9, ? super InterfaceC1680500tpg, ? super Integer, ? extends InterfaceC1685750ty9> interfaceC1631620sYq) {
        super(function1);
        this.LIZJ = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC1685750ty9
    public final Object LJIILJJIL(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
