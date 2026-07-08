package X;

import com.bytedance.android.livesdk.comp.impl.logger.slardarmonitor.LiveSlardarSdkConfigSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k4M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305200k4M {
    public static volatile boolean LIZ;
    public static C0VCC LIZIZ;

    public static boolean LIZ() {
        String serverDeviceId;
        String channel;
        if (LIZ || LIZIZ != null) {
            return true;
        }
        LiveSlardarSdkConfigSetting liveSlardarSdkConfigSetting = LiveSlardarSdkConfigSetting.INSTANCE;
        if (!liveSlardarSdkConfigSetting.getConfig().enable) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext == null || (serverDeviceId = iHostAppContext.getServerDeviceId()) == null) {
                serverDeviceId = "";
            }
            jSONObject.put("device_id", serverDeviceId);
            jSONObject.put("host_aid", iHostAppContext != null ? Integer.valueOf(iHostAppContext.appId()) : null);
            jSONObject.put("sdk_version", C465680INy.LIZ());
            jSONObject.put("app_version", iHostAppContext != null ? iHostAppContext.getVersionCode() : null);
            if (iHostAppContext == null || (channel = iHostAppContext.getChannel()) == null) {
                channel = "unknown";
            }
            jSONObject.put("channel", channel);
            jSONObject.put("update_version_code", iHostAppContext != null ? Integer.valueOf(iHostAppContext.getUpdateVersionCode()) : "unknown");
            SDKMonitorUtils.setConfigUrl("1728", Collections.singletonList(liveSlardarSdkConfigSetting.getConfig().configUrl));
            SDKMonitorUtils.setDefaultReportUrl("1728", Collections.singletonList(liveSlardarSdkConfigSetting.getConfig().reportUrl));
            SDKMonitorUtils.initMonitor(iHostAppContext.context(), "1728", jSONObject, new C0VCZ() { // from class: X.07Ro
                @Override // X.C0VCZ
                public final String getSessionId() {
                    return "";
                }

                @Override // X.C0VCZ
                public final Map<String, String> getCommonParams() {
                    HashMap map = new HashMap();
                    map.put("oversea", "1");
                    return map;
                }
            });
            LIZIZ = SDKMonitorUtils.getInstance("1728");
            LIZ = true;
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ensure init error, ");
            sbLIZ.append(e);
            C20441214yg.LJFF("LiveSlardarSdkMonitor", C2188811AlT.LIZIZ(sbLIZ), e);
            return false;
        }
    }
}
