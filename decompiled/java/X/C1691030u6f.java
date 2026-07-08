package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: renamed from: X.0u6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691030u6f implements InterfaceC1691090u6l {
    public final Function1<Integer, Object> LIZ;
    public final InterfaceC1631630sYr<InterfaceC1691190u6v, Integer, InterfaceC1680500tpg, Integer, Unit> LIZIZ;

    @Override // X.InterfaceC1691090u6l
    public final Function1 getType() {
        return AFwS266S0000000_25.get$arr$(537);
    }

    @Override // X.InterfaceC1691090u6l
    public final Function1<Integer, Object> getKey() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1691030u6f(Function1<? super Integer, ? extends Object> function1, InterfaceC1631630sYr<? super InterfaceC1691190u6v, ? super Integer, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr) {
        this.LIZ = function1;
        this.LIZIZ = interfaceC1631630sYr;
    }
}
