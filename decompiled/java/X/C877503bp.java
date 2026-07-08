package X;

/* JADX INFO: renamed from: X.03bp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi$Companion", f = "PaymentApi.kt", l = {286}, m = "queryPayResult$ecommerce_transaction_release")
public final class C877503bp extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C877403bo LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877503bp(C877403bo c877403bo, InterfaceC1364105Vn<? super C877503bp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c877403bo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentApi$Companion@725.queryPayResult$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(null, this);
        C1C7U.LIZIZ("PaymentApi$Companion@725.queryPayResult$1");
        return objLJFF;
    }
}
