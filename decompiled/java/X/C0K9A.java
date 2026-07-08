package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K9A, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K9A extends C09AY implements Function1<User, Unit> {
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K9A(SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget) {
        super(1);
        this.LL = subscriptionTrialLiveCardWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(User user) {
        this.LL.LLJJIII.setValue(Boolean.TRUE);
        return Unit.LIZ;
    }
}
