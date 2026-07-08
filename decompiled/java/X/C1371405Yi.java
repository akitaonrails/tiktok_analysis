package X;

import Y.AgS162S0300000_2;

/* JADX INFO: renamed from: X.05Yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
public final class C1371405Yi extends AbstractC23140094w {
    public AgS162S0300000_2 LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AgS162S0300000_2<T> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1371405Yi(AgS162S0300000_2<? super T> agS162S0300000_2, InterfaceC1364105Vn<? super C1371405Yi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = agS162S0300000_2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        return this.LLILZ.emit(null, this);
    }
}
