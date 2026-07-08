package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.configs.DYDLibraSetting;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0XYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C850670XYr implements C0TVF {
    @Override // X.C0TVF
    public final Map<String, String> getConfig() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        DYDLibraSetting.DYDSettingModel dYDSettingModel = DYDLibraSetting.LIZ;
        DYDLibraSetting.DYDSettingModel dYDSettingModel2 = (DYDLibraSetting.DYDSettingModel) settingsManagerLIZLLL.LJIIIIZZ("dyd_inapp", DYDLibraSetting.DYDSettingModel.class, dYDSettingModel);
        if (dYDSettingModel2 != null) {
            dYDSettingModel = dYDSettingModel2;
        }
        Pair[] pairArr = new Pair[5];
        String str = dYDSettingModel.dydMainUri;
        if (str == null) {
            str = "aweme://webview?container_color_auto_dark=1&use_spark=1&hide_nav_bar=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fdownload-your-data";
        }
        pairArr[0] = new Pair("dyd_main", str);
        String str2 = dYDSettingModel.dydGuestUri;
        if (str2 == null) {
            str2 = "aweme://webview?container_color_auto_dark=1&use_spark=1&hide_nav_bar=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fdownload-your-data%2Fguest";
        }
        pairArr[1] = new Pair("dyd_guest", str2);
        String str3 = dYDSettingModel.dydGuestDownload;
        if (str3 == null) {
            str3 = "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fdownload-your-data%2Fguest%2Fdownload";
        }
        pairArr[2] = new Pair("dyd_guest_download", str3);
        String str4 = dYDSettingModel.dydUnregistered;
        if (str4 == null) {
            str4 = "aweme://webview?container_color_auto_dark=1&use_spark=1&hide_nav_bar=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fdownload-your-data%2Funregistered-user";
        }
        pairArr[3] = new Pair("dyd_unregistered_user", str4);
        String str5 = dYDSettingModel.dydUnregisteredDownload;
        if (str5 == null) {
            str5 = "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fdownload-your-data%2Funregistered-user%2Fdownload";
        }
        pairArr[4] = new Pair("dyd_unregistered_user_download", str5);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
