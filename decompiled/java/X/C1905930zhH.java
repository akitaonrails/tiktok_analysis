package X;

import android.os.Bundle;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905930zhH {
    public static final C1905930zhH LIZ = new C1905930zhH();

    public static boolean LIZ(DecisionMakerNetworkApi.EligibilityModel eligibilityModel) {
        String str;
        String str2 = null;
        if (eligibilityModel != null) {
            str = eligibilityModel.decisionCode;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "uk_u18_osa_follower_request_transparency")) {
            if (eligibilityModel != null) {
                str2 = eligibilityModel.decisionCode;
            }
            if (!Intrinsics.LJFF(str2, "uk_u16_osa_follower_request_transparency")) {
                return false;
            }
        }
        if (eligibilityModel.isEligible()) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(DecisionMakerNetworkApi.EligibilityModel eligibilityModel) {
        List<DecisionMakerNetworkApi.PPFActionModel> list;
        C1518550pcT c1518550pcTLJI;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", "new_followers", bundle);
        AppLogNewUtils.LJ("followers_notice_tool_tip_click", bundle);
        if (eligibilityModel != null && (list = eligibilityModel.actionList) != null) {
            for (DecisionMakerNetworkApi.PPFActionModel pPFActionModel : list) {
                if (Intrinsics.LJFF(pPFActionModel.actionId, "PopupAPIProcessor")) {
                    TTKUserCommunicationService tTKUserCommunicationService = (TTKUserCommunicationService) PluggableExtentionKt.pluggableSpi$default(TTKUserCommunicationService.class, false, false, false, 14, null);
                    if (tTKUserCommunicationService != null && (c1518550pcTLJI = tTKUserCommunicationService.LJI()) != null) {
                        UserCommunicationProcessorModel userCommunicationProcessorModel = new UserCommunicationProcessorModel(pPFActionModel.actionId, pPFActionModel.actionParams, null);
                        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", "new_followers"), new Pair("popup_provider", new InterfaceC1519250pdb() { // from class: X.0zhI
                            @Override // X.InterfaceC1519250pdb
                            public final InterfaceC1519200pdW LIZ() {
                                return null;
                            }

                            @Override // X.InterfaceC1519250pdb
                            public final InterfaceC1914220zue LIZJ() {
                                return null;
                            }

                            @Override // X.InterfaceC1519250pdb
                            public final Map<String, String> LIZIZ() {
                                return C2097908Jt.LIZJ(new Pair("enter_method", "tool_tip_click"));
                            }
                        }));
                        c1518550pcTLJI.getClass();
                        C1518550pcT.LJI(userCommunicationProcessorModel, null, mapLJIIIIZZ);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
