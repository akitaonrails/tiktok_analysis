package X;

import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupMeta;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupUIModel;
import com.ss.android.ugc.aweme.pns.usercommunication.api.PolicyNoticeUPSdk;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519120pdO {
    public static final String LIZ(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse) {
        PolicyNoticeUPSdk policyNoticeUPSdk;
        NetworkUniversalPopupResponse networkUniversalPopupResponse;
        NetworkUniversalPopupMeta networkUniversalPopupMeta;
        String str;
        List<NetworkUniversalPopupResponse> list = networkUniversalPopupDispatchResponse.popupResponses;
        if (list == null || (networkUniversalPopupResponse = (NetworkUniversalPopupResponse) C13LP.LJJJLL(list)) == null || (networkUniversalPopupMeta = networkUniversalPopupResponse.popupMeta) == null || (str = networkUniversalPopupMeta.business) == null) {
            List<PolicyNoticeUPSdk> list2 = networkUniversalPopupDispatchResponse.policyNotices;
            if (list2 != null && (policyNoticeUPSdk = (PolicyNoticeUPSdk) C13LP.LJJJLL(list2)) != null) {
                return policyNoticeUPSdk.business;
            }
            return "";
        }
        return str;
    }

    public static final String LIZIZ(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse) {
        PolicyNoticeUPSdk policyNoticeUPSdk;
        String str;
        NetworkUniversalPopupResponse networkUniversalPopupResponse;
        NetworkUniversalPopupUIModel networkUniversalPopupUIModel;
        List<NetworkUniversalPopupResponse> list = networkUniversalPopupDispatchResponse.popupResponses;
        if (list == null || (networkUniversalPopupResponse = (NetworkUniversalPopupResponse) C13LP.LJJJLL(list)) == null || (networkUniversalPopupUIModel = networkUniversalPopupResponse.popupUiModel) == null || (str = networkUniversalPopupUIModel.webviewUrl) == null) {
            List<PolicyNoticeUPSdk> list2 = networkUniversalPopupDispatchResponse.policyNotices;
            if (list2 != null && (policyNoticeUPSdk = (PolicyNoticeUPSdk) C13LP.LJJJLL(list2)) != null) {
                str = policyNoticeUPSdk.webviewUrl;
                if (str == null && !a0.LJJJIL(str)) {
                    return str;
                }
            }
        } else if (str == null) {
        }
        return null;
    }

    public static final boolean LIZJ(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse) {
        List<NetworkUniversalPopupResponse> list;
        if ((networkUniversalPopupDispatchResponse.policyNotices == null || !(!r0.isEmpty())) && ((list = networkUniversalPopupDispatchResponse.popupResponses) == null || !(!list.isEmpty()))) {
            return false;
        }
        return true;
    }
}
