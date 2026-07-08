package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionPage;

/* JADX INFO: renamed from: X.0TO4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TO4 {
    public static SubscriptionPage LIZ(int i, C0TNG c0tng, PickYourAdPlanPage pickYourAdPlanPage) {
        PickYourAdPlanPage pickYourAdPlanPage2;
        SubscriptionPage.LLJJJ = Integer.valueOf(i);
        SubscriptionPage subscriptionPage = new SubscriptionPage();
        SubscriptionPage.LLJJIJIL = c0tng;
        Bundle bundle = new Bundle();
        if (i == 1) {
            C786410Ut5.LJJIJL(bundle, "page_data", pickYourAdPlanPage);
        } else {
            C0TOM.LIZ.getClass();
            AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
            if (adFreeSubscriptionLJ != null) {
                pickYourAdPlanPage2 = adFreeSubscriptionLJ.pickYourAdPlanPage;
            } else {
                pickYourAdPlanPage2 = null;
            }
            C786410Ut5.LJJIJL(bundle, "page_data", pickYourAdPlanPage2);
        }
        subscriptionPage.setArguments(bundle);
        return subscriptionPage;
    }
}
