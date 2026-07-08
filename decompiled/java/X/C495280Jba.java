package X;

import com.bytedance.android.livesdk.comp.api.subscription.model.PunishmentData;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495280Jba extends C09AY implements Function1<PunishmentData, Unit> {
    public final /* synthetic */ SubscriptionSpotlightFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495280Jba(SubscriptionSpotlightFragment subscriptionSpotlightFragment) {
        super(1);
        this.LL = subscriptionSpotlightFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PunishmentData punishmentData) {
        C19EG activity = this.LL.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.LIZ;
    }
}
