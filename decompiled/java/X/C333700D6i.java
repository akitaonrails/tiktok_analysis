package X;

/* JADX INFO: renamed from: X.0D6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderLocalStoreV2", f = "OrdersV2LocalStore.kt", l = {333}, m = "readFirstFrame")
public final class C333700D6i extends AbstractC23140094w {
    public Object LL;
    public C1DEV LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C333640D6c LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333700D6i(C333640D6c c333640D6c, InterfaceC1364105Vn<? super C333700D6i> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c333640D6c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderLocalStoreV2@4ab3.readFirstFrame$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZ.LJ(null, this);
        C1C7U.LIZIZ("OrderLocalStoreV2@4ab3.readFirstFrame$1");
        return objLJ;
    }
}
