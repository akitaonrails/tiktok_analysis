package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;

/* JADX INFO: renamed from: X.0CZb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C315690CZb {
    public static void LIZ(PushSettings pushSettings) {
        String str;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C1336205Ku.LIZ(false).getImPopupService().LIZ(pushSettings.chatSet, pushSettings.chatSettingsPanel, pushSettings.chatUserType);
            C19328310jZ.LIZIZ.LIZIZ(pushSettings);
            ISettingsRequestService iSettingsRequestService = (ISettingsRequestService) PluggableExtentionKt.pluggableSpi$default(ISettingsRequestService.class, false, false, false, 14, null);
            if (iSettingsRequestService != null) {
                iSettingsRequestService.LJII(pushSettings);
            }
            if (ComplianceServiceProvider.LJI().LJIJ() == 1) {
                str = "on";
            } else {
                str = "off";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            C20684815ws.LJIILLIIL("tns_remove_photosensitive_status", c2344009Gk.LIZ);
        }
    }
}
