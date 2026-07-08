package X;

/* JADX INFO: renamed from: X.0D6G, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderListAPIV2", f = "OrdersV2Api.kt", l = {65}, m = "syncPendingOrder-gIAlu-s")
public final class C0D6G extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D6F LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D6G(C0D6F c0d6f, InterfaceC1364105Vn<? super C0D6G> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d6f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderListAPIV2@3506.syncPendingOrder$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("OrderListAPIV2@3506.syncPendingOrder$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("OrderListAPIV2@3506.syncPendingOrder$1");
        return c189200o6M1boximpl;
    }
}
