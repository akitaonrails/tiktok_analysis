package X;

/* JADX INFO: renamed from: X.0D6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderLocalStoreV2", f = "OrdersV2LocalStore.kt", l = {333}, m = "findByOrderId")
public final class C333680D6g extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C1DEV LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C333640D6c LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333680D6g(C333640D6c c333640D6c, InterfaceC1364105Vn<? super C333680D6g> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c333640D6c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderLocalStoreV2@4ab3.findByOrderId$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, this);
        C1C7U.LIZIZ("OrderLocalStoreV2@4ab3.findByOrderId$1");
        return objLIZ;
    }
}
