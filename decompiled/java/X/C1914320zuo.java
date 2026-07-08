package X;

import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.PolicyNoticeUPSdk;
import com.ss.android.ugc.aweme.pns.usercommunication.popupext.UniversalPopupTransformer;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS607S0100000_28;
import v7.o;

/* JADX INFO: renamed from: X.0zuo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914320zuo implements InterfaceC1914160zuY {
    public final NetworkUniversalPopupDispatchResponse LIZ;
    public final Integer LIZIZ;

    @Override // X.InterfaceC1914160zuY
    public final C15O7<UniversalPopupResponse> LIZIZ() {
        List<PolicyNoticeUPSdk> list = this.LIZ.policyNotices;
        if (list != null && !list.isEmpty()) {
            List<PolicyNoticeUPSdk> list2 = this.LIZ.policyNotices;
            Integer num = this.LIZIZ;
            return C15O7.LJIIJ(C1914110zuT.LIZIZ(list2, num != null ? C2097908Jt.LIZJ(new Pair("uc_scene", String.valueOf(num.intValue()))) : null));
        }
        UniversalPopupTransformer universalPopupTransformer = UniversalPopupTransformer.LIZ;
        NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse = this.LIZ;
        universalPopupTransformer.getClass();
        return C15O7.LJIIJ(UniversalPopupTransformer.LIZJ(networkUniversalPopupDispatchResponse));
    }

    public C1914320zuo(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse, Integer num) {
        this.LIZ = networkUniversalPopupDispatchResponse;
        this.LIZIZ = num;
    }

    @Override // X.InterfaceC1914160zuY
    public final C15O7<Unit> LIZ(String str, Map<String, String> map) {
        Integer numLJIIJJI;
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("business", str));
        String str2 = map.get("policy_version");
        if (str2 != null) {
            mapLJIIJ.put("policy_version", str2);
        }
        String str3 = map.get("style");
        if (str3 != null) {
            mapLJIIJ.put("style", str3);
        }
        String str4 = map.get("extra");
        if (str4 != null) {
            mapLJIIJ.put("extra", str4);
        }
        String str5 = map.get("operation");
        if (str5 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str5)) != null) {
            mapLJIIJ.put("operation", String.valueOf(numLJIIJJI.intValue()));
        }
        o oVar = new o();
        ((TTKUserCommunicationService) ServiceManager.get().getService(TTKUserCommunicationService.class)).LJIIJ(mapLJIIJ, new AwS607S0100000_28(oVar, (o<Unit>) 209));
        return oVar.LIZ;
    }
}
