package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;

/* JADX INFO: renamed from: X.0CHO, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CHO {
    public static final C0CHO LIZ = new C0CHO();
    public static final IGatekeeperService LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        LIZIZ = iGatekeeperService;
        LIZJ = (iGatekeeperService == null || (eligibilityModelLIZ = iGatekeeperService.LIZ("2041")) == null) ? true : eligibilityModelLIZ.isEligible();
        LIZLLL = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_forbid_one_click_beauty", true, false);
    }

    public static boolean LIZ() {
        return ((Boolean) C263000ASk.LIZ.getValue()).booleanValue() ? LIZJ : !LIZLLL;
    }
}
