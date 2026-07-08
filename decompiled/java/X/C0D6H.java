package X;

/* JADX INFO: renamed from: X.0D6H, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderListAPIV2", f = "OrdersV2Api.kt", l = {37}, m = "fetchPage")
public final class C0D6H extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D6F LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D6H(C0D6F c0d6f, InterfaceC1364105Vn<? super C0D6H> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d6f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderListAPIV2@3506.fetchPage$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0L, 0L, this);
        C1C7U.LIZIZ("OrderListAPIV2@3506.fetchPage$1");
        return objLIZ;
    }
}
