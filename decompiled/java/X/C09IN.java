package X;

import Y.AgS163S0300000_3;

/* JADX INFO: renamed from: X.09IN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {77}, m = "emit")
public final class C09IN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS163S0300000_3<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09IN(AgS163S0300000_3<? super T> agS163S0300000_3, InterfaceC1364105Vn<? super C09IN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS163S0300000_3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.emit(null, this);
    }
}
