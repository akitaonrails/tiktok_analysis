package X;

import X.AbstractC20055413dY;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1685820tyG<N extends AbstractC20055413dY> implements InterfaceC1672410tcd {
    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
        return C1685810tyF.LIZ(this, interfaceC1685750ty9);
    }

    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ boolean LJIILLIIL(Function1 function1) {
        return C1672400tcc.LIZ(this, function1);
    }

    public abstract N LJIJI();

    public abstract void LJIJJ(N n);

    @Override // X.InterfaceC1685750ty9
    public final Object LJIILJJIL(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
