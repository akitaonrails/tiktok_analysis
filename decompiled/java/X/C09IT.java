package X;

import Y.AgS194S0200000_3;

/* JADX INFO: renamed from: X.09IT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
public final class C09IT extends AbstractC23140094w {
    public AgS194S0200000_3 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AgS194S0200000_3<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09IT(AgS194S0200000_3<? super T> agS194S0200000_3, InterfaceC1364105Vn<? super C09IT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS194S0200000_3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        return this.LLILLL.emit(null, this);
    }
}
