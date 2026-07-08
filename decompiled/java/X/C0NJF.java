package X;

/* JADX INFO: renamed from: X.0NJF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.state.store.PDPStateStore", f = "PDPStateStore.kt", l = {209}, m = "updateStateFlow")
public final class C0NJF extends AbstractC23140094w {
    public C1DEV LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0NJE LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NJF(C0NJE c0nje, InterfaceC1364105Vn<? super C0NJF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0nje;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PDPStateStore@6d65.updateStateFlow$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(this);
        C1C7U.LIZIZ("PDPStateStore@6d65.updateStateFlow$1");
        return objLIZLLL;
    }
}
