package X;

/* JADX INFO: renamed from: X.0D65, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrdersCenterManager", f = "OrdersV2CenterManager.kt", l = {329}, m = "reportPaymentFailure")
public final class C0D65 extends AbstractC23140094w {
    public C259800zU LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D6A LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D65(C0D6A c0d6a, InterfaceC1364105Vn<? super C0D65> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0d6a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrdersCenterManager@e9d4.reportPaymentFailure$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, null, this);
        C1C7U.LIZIZ("OrdersCenterManager@e9d4.reportPaymentFailure$1");
        return objLJFF;
    }
}
