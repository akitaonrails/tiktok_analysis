package X;

import Y.AgS163S0300000_3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.09ID, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09ID<T> implements InterfaceC346201Wa<T> {
    public final InterfaceC346201Wa<T> LL;
    public final Function1<T, Object> LLILLJJLI;
    public final Function2<Object, Object, Boolean> LLILLL;

    public C09ID(InterfaceC346201Wa interfaceC346201Wa, Function2 function2) {
        AFwS231S0000000_3 aFwS231S0000000_3 = C09IO.LIZ;
        this.LL = interfaceC346201Wa;
        this.LLILLJJLI = aFwS231S0000000_3;
        this.LLILLL = function2;
    }

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super T> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = (T) C09AV.LIZ;
        Object objCollect = this.LL.collect(new AgS163S0300000_3(this, c259800zU, interfaceC346701Wf, 1), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
