package X;

import Y.AgS198S0200000_7;

/* JADX INFO: renamed from: X.0KVG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.api.status.SubscriptionStatusFlow$collectIn$$inlined$filter$2$2", f = "SubscriptionStatusFlow.kt", l = {223}, m = "emit")
public final class C0KVG extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS198S0200000_7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KVG(AgS198S0200000_7 agS198S0200000_7, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS198S0200000_7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscriptionStatusFlow@d5d3.collectIn$$inlined$filter$2$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("SubscriptionStatusFlow@d5d3.collectIn$$inlined$filter$2$2$1");
        return objEmit;
    }
}
