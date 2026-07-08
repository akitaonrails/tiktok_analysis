package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0D6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderLocalStoreV2", f = "OrdersV2LocalStore.kt", l = {333}, m = "writeFirstPageSync")
public final class C333670D6f extends AbstractC23140094w {
    public Object LL;
    public Function2 LLILLJJLI;
    public C1DEV LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C333640D6c LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333670D6f(C333640D6c c333640D6c, InterfaceC1364105Vn<? super C333670D6f> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c333640D6c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrderLocalStoreV2@4ab3.writeFirstPageSync$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJII = this.LLIZ.LJII(null, 0L, false, null, this);
        C1C7U.LIZIZ("OrderLocalStoreV2@4ab3.writeFirstPageSync$1");
        return objLJII;
    }
}
