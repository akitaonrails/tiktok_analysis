package X;

import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K95, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K95 extends C09AY implements Function1<SubscribeUserInfoResponse, Unit> {
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K95(SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget) {
        super(1);
        this.LL = subscriptionTrialLiveCardWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SubscribeUserInfoResponse subscribeUserInfoResponse) {
        if (C494680Jac.LJI(this.LL.dataChannel)) {
            SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget = this.LL;
            EnumC512800K9e enumC512800K9e = EnumC512800K9e.OTHERS;
            subscriptionTrialLiveCardWidget.F1(false);
            subscriptionTrialLiveCardWidget.z1(enumC512800K9e, false);
            C0K94 c0k94 = this.LL.LLJ;
            if (c0k94 != null) {
                c0k94.cancel();
            }
            this.LL.J1();
            C1113800f5e.LJIIIIZZ = false;
        }
        return Unit.LIZ;
    }
}
