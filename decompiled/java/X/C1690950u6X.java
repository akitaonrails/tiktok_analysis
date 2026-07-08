package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0u6X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690950u6X implements InterfaceC1691090u6l {
    public final Function1<Integer, Object> LIZ;
    public final Function2<InterfaceC1691150u6r, Integer, C1561460qjg> LIZIZ;
    public final Function1<Integer, Object> LIZJ;
    public final InterfaceC1631630sYr<InterfaceC1691180u6u, Integer, InterfaceC1680500tpg, Integer, Unit> LIZLLL;

    @Override // X.InterfaceC1691090u6l
    public final Function1<Integer, Object> getKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1691090u6l
    public final Function1<Integer, Object> getType() {
        return this.LIZJ;
    }

    public C1690950u6X(Function1 function1, Function2 function2, Function1 function12, C19719212De c19719212De) {
        this.LIZ = function1;
        this.LIZIZ = function2;
        this.LIZJ = function12;
        this.LIZLLL = c19719212De;
    }
}
