package X;

/* JADX INFO: renamed from: X.0D7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.UCPCheckoutGateway", f = "UCPCheckoutGateway.kt", l = {86}, m = "completeCheckout")
public final class C333880D7a extends AbstractC23140094w {
    public C0D7Y LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D7Y LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333880D7a(C0D7Y c0d7y, InterfaceC1364105Vn<? super C333880D7a> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0d7y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UCPCheckoutGateway@ccae.completeCheckout$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, null, null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("UCPCheckoutGateway@ccae.completeCheckout$1");
        return objLIZJ;
    }
}
