package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;

/* JADX INFO: renamed from: X.0CHP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CHP {
    public static final boolean LIZ() {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        boolean z = false;
        if (((Number) C0B0U.LIZ.getValue()).intValue() != 0) {
            return true;
        }
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null && (eligibilityModelLIZ = iGatekeeperService.LIZ("tiktok_repost_notes")) != null && !eligibilityModelLIZ.isEligible()) {
            z = true;
        }
        return !z;
    }
}
