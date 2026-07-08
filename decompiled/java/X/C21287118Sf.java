package X;

import Y.AgS213S0200000_32;

/* JADX INFO: renamed from: X.18Sf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.api.subscription.status.SubscriptionStatusFlow$collectIn$$inlined$filter$1$2", f = "SubscriptionStatusFlow.kt", l = {223}, m = "emit")
public final class C21287118Sf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS213S0200000_32 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21287118Sf(AgS213S0200000_32 agS213S0200000_32, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS213S0200000_32;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscriptionStatusFlow@6cb9.collectIn$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("SubscriptionStatusFlow@6cb9.collectIn$$inlined$filter$1$2$1");
        return objEmit;
    }
}
