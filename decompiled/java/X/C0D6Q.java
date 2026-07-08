package X;

/* JADX INFO: renamed from: X.0D6Q, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.TTKCommerceShopOrderListRequestCaller", f = "OrdersV2Api.kt", l = {93}, m = "requestOrderList-yxL6bBk")
public final class C0D6Q extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D6P LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D6Q(C0D6P c0d6p, InterfaceC1364105Vn<? super C0D6Q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d6p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTKCommerceShopOrderListRequestCaller@a19b.requestOrderList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, 0L, 0L, 0L, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("TTKCommerceShopOrderListRequestCaller@a19b.requestOrderList$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("TTKCommerceShopOrderListRequestCaller@a19b.requestOrderList$1");
        return c189200o6M1boximpl;
    }
}
