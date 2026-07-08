package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.pincard.SubscriptionCommonGuidanceLiveCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ewn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1108310ewn extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubscriptionCommonGuidanceLiveCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1108310ewn(SubscriptionCommonGuidanceLiveCardWidget subscriptionCommonGuidanceLiveCardWidget) {
        super(0);
        this.LL = subscriptionCommonGuidanceLiveCardWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.hide();
        return Unit.LIZ;
    }
}
