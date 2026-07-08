package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.adfreeuk.ui.fragment.page.AdFreeSubscriptionFragment;

/* JADX INFO: renamed from: X.0TNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745720TNa implements C100F {
    public final /* synthetic */ AdFreeSubscriptionFragment LL;

    public C745720TNa(AdFreeSubscriptionFragment adFreeSubscriptionFragment) {
        this.LL = adFreeSubscriptionFragment;
    }

    @Override // X.C100F
    public final void LIZIZ(boolean z) {
        this.LL.UR();
        SubscriptionVM subscriptionVM = this.LL.LLIZ;
        if (subscriptionVM != null) {
            subscriptionVM.AQ2();
        }
    }
}
