package X;

/* JADX INFO: renamed from: X.0D88, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.network.CheckoutNetworkService", f = "CheckoutNetworkService.kt", l = {39, 45}, m = "createCheckout$ucp_impl_release")
public final class C0D88 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D86 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D88(C0D86 c0d86, InterfaceC1364105Vn<? super C0D88> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0d86;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CheckoutNetworkService@6cea.createCheckout$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("CheckoutNetworkService@6cea.createCheckout$1");
        return objLJ;
    }
}
