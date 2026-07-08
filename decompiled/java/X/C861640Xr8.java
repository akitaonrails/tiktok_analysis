package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Xr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861640Xr8 implements InterfaceC346201Wa<Object> {
    public final /* synthetic */ InterfaceC346201Wa LL;
    public final /* synthetic */ Function2 LLILLJJLI;

    public C861640Xr8(Function2 function2, InterfaceC346201Wa interfaceC346201Wa) {
        this.LL = interfaceC346201Wa;
        this.LLILLJJLI = function2;
    }

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<? super Object> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = this.LL.collect(new C861650Xr9(this.LLILLJJLI, interfaceC346701Wf), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
