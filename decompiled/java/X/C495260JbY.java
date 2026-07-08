package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.spotlight.SubscriptionSpotlightFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JbY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C495260JbY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SubscriptionSpotlightFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C495260JbY(SubscriptionSpotlightFragment subscriptionSpotlightFragment) {
        super(0);
        this.LL = subscriptionSpotlightFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        DialogC1389620mGW dialogC1389620mGW = this.LL.LLJJ;
        if (dialogC1389620mGW != null) {
            C786410Ut5.J4(dialogC1389620mGW);
        }
        SubscriptionSpotlightFragment subscriptionSpotlightFragment = this.LL;
        C495270JbZ c495270JbZ = new C495270JbZ(subscriptionSpotlightFragment);
        subscriptionSpotlightFragment.getClass();
        C500260Jjc.LJJJJJ(subscriptionSpotlightFragment, null, new C495130JbL(subscriptionSpotlightFragment, c495270JbZ, null), 3);
        return Unit.LIZ;
    }
}
