package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.theater.common.experiment.AITheaterFollowPanelConfig;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558400LvC implements InterfaceC558600LvW {
    public String LIZ;
    public boolean LIZIZ;

    @Override // X.InterfaceC558600LvW
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJI() {
        return ((Boolean) C18093076t.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC558600LvW
    public final HashSet<String> LJII() {
        return (HashSet) C0CLK.LIZIZ.getValue();
    }

    @Override // X.InterfaceC558600LvW
    public final boolean isFeatureEnabled() {
        return ((Boolean) C306280BzW.LIZ.getValue()).booleanValue() && !LJIL();
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LIZ() {
        return isFeatureEnabled() && ((Boolean) C0AZ6.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC558600LvW
    public final String LIZIZ() {
        return C558390LvB.LIZ().learnMoreSlug;
    }

    @Override // X.InterfaceC558600LvW
    public final int LIZJ() {
        return C558390LvB.LIZ().clickNumToMakeCastBannerNeverShow;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LIZLLL() {
        return C558390LvB.LIZ().showModelNameInSubtitle;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJ() {
        return isFeatureEnabled() && ((Boolean) C558430LvF.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJFF() {
        return isFeatureEnabled() && ((AITheaterFollowPanelConfig) C558420LvE.LIZIZ.getValue()).aiTheaterPageEnable;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJIIIIZZ() {
        return isFeatureEnabled() && C558390LvB.LIZ().recordSubtabEntranceEnable;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJIIIZ() {
        return isFeatureEnabled() && C558390LvB.LIZ().recordToolbarEntranceEnable;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJIIJJI() {
        return isFeatureEnabled() && ((Boolean) C0AZ3.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJIIL() {
        return C558390LvB.LIZ().showModelNameInBanner;
    }

    @Override // X.InterfaceC558600LvW
    public final EnumC558410LvD LJIILIIL() {
        if (!isFeatureEnabled()) {
            return EnumC558410LvD.DISABLED;
        }
        int iIntValue = ((Number) C0AZ2.LIZ.getValue()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? EnumC558410LvD.DISABLED : EnumC558410LvD.ANCHOR : EnumC558410LvD.WHITE_BUTTON : EnumC558410LvD.HOLLOW_VIEW;
    }

    @Override // X.InterfaceC558600LvW
    public final int LJIILJJIL() {
        return C558390LvB.LIZ().notClickBannerNumToMakeItDisappear3Days;
    }

    @Override // X.InterfaceC558600LvW
    public final int LJIILL() {
        return C558390LvB.LIZ().dailyBannerShowLimit;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJIILLIIL() {
        return isFeatureEnabled() && C558390LvB.LIZ().editToolbarEntranceEnable;
    }

    @Override // X.InterfaceC558600LvW
    public final String LJIIZILJ() {
        return C558390LvB.LIZ().learnMoreSlugUs;
    }

    @Override // X.InterfaceC558600LvW
    public final String LJIJ() {
        return C558390LvB.LIZ().aboutAiSelfSlug;
    }

    @Override // X.InterfaceC558600LvW
    public final int LJIJI() {
        return C558390LvB.LIZ().maxMentionCount;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJIJJ() {
        return LJFF() && ((AITheaterFollowPanelConfig) C558420LvE.LIZIZ.getValue()).aiTheaterFriendPageEnable;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJIJJLI() {
        return LJFF() && ((AITheaterFollowPanelConfig) C558420LvE.LIZIZ.getValue()).aiTheaterDetailPageEnable;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJIL() {
        InterfaceC566960MLm storyService;
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            C537540L6i.LIZ.LIZ("AITheaterFeatureConfigsImpl", "User is not logged in.");
            return true;
        }
        if (this.LIZ != null && Intrinsics.LJFF(C0CHQ.LIZ().getAccountService().getCurrentUserID(), this.LIZ)) {
            return this.LIZIZ;
        }
        this.LIZ = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        this.LIZIZ = false;
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            C537540L6i.LIZ.LIZ("AITheaterFeatureConfigsImpl", "The current mode is children mode.");
            this.LIZIZ = true;
        } else {
            IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null);
            if (iAVServiceProxy == null || (storyService = iAVServiceProxy.getStoryService()) == null || !storyService.LJI()) {
                C537540L6i.LIZ.LIZ("AITheaterFeatureConfigsImpl", "Disable for story reverse experiment.");
                this.LIZIZ = true;
            } else {
                IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
                if (iGatekeeperService != null && (eligibilityModelLIZ = iGatekeeperService.LIZ(C558390LvB.LIZ().gatekeeperFeatureId)) != null && !eligibilityModelLIZ.isEligible()) {
                    C537540L6i.LIZ.LIZIZ("AITheaterFeatureConfigsImpl", "User is under 18 years old.", null);
                    this.LIZIZ = true;
                }
            }
        }
        return this.LIZIZ;
    }

    @Override // X.InterfaceC558600LvW
    public final boolean LJJ() {
        return isFeatureEnabled() && ((Boolean) C264700AYy.LIZ.getValue()).booleanValue();
    }
}
