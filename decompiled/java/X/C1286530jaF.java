package X;

import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286530jaF {
    public C822650WOx LIZ;
    public InterfaceC1698710uJ3 LIZIZ;

    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC1698710uJ3 interfaceC1698710uJ3;
        try {
            if (TextUtils.equals(jSONObject.optString("event_key"), "play_stop") && (interfaceC1698710uJ3 = this.LIZIZ) != null) {
                interfaceC1698710uJ3.LJJIJ(str, jSONObject);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMonitorLog common params ex=");
            sbLIZ.append(th.toString());
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZIZ();
        }
        int iOptInt = jSONObject.optInt("use_new_applog_api", 0);
        String str2 = "livesdk_live_client_applog_webrtc_monitor_log";
        if (iOptInt == 2) {
            if (!str.equals("live_webrtc_monitor_log")) {
                str2 = "livesdk_live_client_applog_monitor_log";
            }
            AppLogNewUtils.LJFF(str2, jSONObject);
        } else if (iOptInt == 1) {
            if (!str.equals("live_webrtc_monitor_log")) {
                str2 = "livesdk_live_client_applog_monitor_log";
            }
            AppLog.onEventV3(str2, jSONObject);
        } else {
            if (!str.equals("live_webrtc_monitor_log")) {
                str2 = "livesdk_live_client_applog_monitor_log";
            }
            AppLogNewUtils.onEventV3(str2, jSONObject);
        }
    }
}
