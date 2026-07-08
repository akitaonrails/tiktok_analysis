package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495360Jbi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubscriptionSpotlightFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495360Jbi(SubscriptionSpotlightFragment subscriptionSpotlightFragment) {
        super(0);
        this.LL = subscriptionSpotlightFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19EG activity = this.LL.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.LIZ;
    }
}
