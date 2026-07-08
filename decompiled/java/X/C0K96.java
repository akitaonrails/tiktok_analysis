package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.SubscriptionTrialLiveCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0K96, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K96 extends C09AY implements Function1<AbstractC509530JyZ, Unit> {
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K96(SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget) {
        super(1);
        this.LL = subscriptionTrialLiveCardWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC509530JyZ abstractC509530JyZ) {
        C508910JxZ.LIZIZ(abstractC509530JyZ, new C0K93(this.LL));
        return Unit.LIZ;
    }
}
