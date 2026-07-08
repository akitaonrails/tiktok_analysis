package X;

import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.PolicyNoticeUPSdk;
import com.ss.android.ugc.aweme.pns.usercommunication.popupext.UniversalPopupTransformer;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0zun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914310zun implements InterfaceC1914160zuY {
    public final NetworkUniversalPopupDispatchResponse LIZ;

    @Override // X.InterfaceC1914160zuY
    public final C15O7<UniversalPopupResponse> LIZIZ() {
        List<PolicyNoticeUPSdk> list = this.LIZ.policyNotices;
        if (list != null && !list.isEmpty()) {
            return C15O7.LJIIJ(C1914110zuT.LIZIZ(this.LIZ.policyNotices, null));
        }
        UniversalPopupTransformer universalPopupTransformer = UniversalPopupTransformer.LIZ;
        NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse = this.LIZ;
        universalPopupTransformer.getClass();
        return C15O7.LJIIJ(UniversalPopupTransformer.LIZJ(networkUniversalPopupDispatchResponse));
    }

    public C1914310zun(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse) {
        this.LIZ = networkUniversalPopupDispatchResponse;
    }

    @Override // X.InterfaceC1914160zuY
    public final C15O7<Unit> LIZ(String str, Map<String, String> map) {
        return C15O7.LJIIJ(Unit.LIZ);
    }
}
