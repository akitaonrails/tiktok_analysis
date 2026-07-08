package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691040u6g implements InterfaceC1691090u6l {
    public final Function1<Integer, Object> LIZ;
    public final Function1<Integer, Object> LIZIZ;
    public final InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> LIZJ;

    @Override // X.InterfaceC1691090u6l
    public final Function1<Integer, Object> getKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1691090u6l
    public final Function1<Integer, Object> getType() {
        return this.LIZIZ;
    }

    public C1691040u6g(Function1 function1, Function1 function12, C19719212De c19719212De) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = c19719212De;
    }
}
