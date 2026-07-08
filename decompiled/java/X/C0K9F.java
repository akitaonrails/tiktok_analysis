package X;

/* JADX INFO: renamed from: X.0K9F, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget$updateStatusToNonSubscriberForbiddenLive$1$invokeSuspend$$inlined$filter$1$2", f = "SubscriptionTrialLiveCardWidget.kt", l = {223}, m = "emit")
public final class C0K9F extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0K9E LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K9F(C0K9E c0k9e, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0k9e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubscriptionTrialLiveCardWidget@31af.updateStatusToNonSubscriberForbiddenLive$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("SubscriptionTrialLiveCardWidget@31af.updateStatusToNonSubscriberForbiddenLive$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
