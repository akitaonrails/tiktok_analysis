package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0D6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderLocalStoreV2", f = "OrdersV2LocalStore.kt", l = {333}, m = "updatePendingQueueSync")
public final class C333690D6h extends AbstractC23140094w {
    public Object LL;
    public Function1 LLILLJJLI;
    public C1DEV LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C333640D6c LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333690D6h(C333640D6c c333640D6c, InterfaceC1364105Vn<? super C333690D6h> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c333640D6c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderLocalStoreV2@4ab3.updatePendingQueueSync$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZIL.LJI(null, null, this);
        C1C7U.LIZIZ("OrderLocalStoreV2@4ab3.updatePendingQueueSync$1");
        return objLJI;
    }
}
