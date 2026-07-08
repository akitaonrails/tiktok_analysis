package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import kotlin.jvm.functions.Function0;
import lth.o;

/* JADX INFO: renamed from: X.1EP6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EP6 extends C09AY implements Function0<C0CHM> {
    public C1EP6() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0CHM] */
    @Override // kotlin.jvm.functions.Function0
    public final C0CHM invoke() {
        return new C1EPC() { // from class: X.0CHM
            @Override // X.C1EPC
            public final boolean LIZJ() {
                if (((Boolean) C268610Afr.LIZ.getValue()).booleanValue()) {
                    return isFeatureEnabled();
                }
                C21290818Tq.LIZ("AiChatFeatureConfigsImpl", "Entrance experiment is disabled. There is no entrance.");
                return false;
            }

            @Override // X.C1EPC
            public final boolean LIZ() {
                return LIZJ() && ((Boolean) C300310Bpt.LIZ.getValue()).booleanValue();
            }

            @Override // X.C1EPC
            public final boolean LIZIZ() {
                return LIZJ() && ((Boolean) C300290Bpr.LIZ.getValue()).booleanValue();
            }

            @Override // X.C1EPC
            public final boolean LIZLLL() {
                if (LIZJ()) {
                    return ((Boolean) C300290Bpr.LIZ.getValue()).booleanValue() || ((Boolean) C300280Bpq.LIZ.getValue()).booleanValue();
                }
                return false;
            }

            @Override // X.C1EPC
            public final boolean isFeatureEnabled() {
                DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
                if (!C300270Bpp.LIZ()) {
                    return false;
                }
                if (!C297150Bkn.LIZ() || o.LJIIZILJ.LJIIJJI()) {
                    C21290818Tq.LIZ("AiChatFeatureConfigsImpl", "Editor tab reverse experiment is enabled. There is no entrance.");
                    return false;
                }
                IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
                if (iGatekeeperService != null && (eligibilityModelLIZ = iGatekeeperService.LIZ("uas_2038")) != null && !eligibilityModelLIZ.isEligible()) {
                    C21290818Tq.LIZ("AiChatFeatureConfigsImpl", "User is under 18 years old.");
                    return false;
                }
                if (!C0CHQ.LIZ().getAccountService().isLogin()) {
                    C21290818Tq.LIZ("AiChatFeatureConfigsImpl", "User is not logged in.");
                    return false;
                }
                if (!C0CHQ.LIZ().getAccountService().LIZ()) {
                    return true;
                }
                C21290818Tq.LIZ("AiChatFeatureConfigsImpl", "The current mode is children mode.");
                return false;
            }
        };
    }
}
