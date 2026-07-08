package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.analytics.AppLogDualReportSettings;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DMU, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DMU {
    public static final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ);
    public static String LIZIZ = "";
    public static boolean LIZJ;

    public static void LIZIZ(String str, JSONObject jSONObject) {
        AppLogDualReportSettings.EventConfig eventConfig = (AppLogDualReportSettings.EventConfig) ((Map) AppLogDualReportSettings.LIZ.getValue()).get(str);
        if (eventConfig == null) {
            return;
        }
        float f = eventConfig.sampleRate;
        try {
            if (AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId() != null) {
                if (CastLongProtector.parseLong(r0) % ((long) 1000000) < f * 1000000) {
                    String str2 = eventConfig.slardarEvent;
                    if (str2 == null) {
                        str2 = "ttk_cd_monitor_normal_event";
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("event", str);
                    jSONObject2.put("experiments", LIZIZ);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    if (jSONObject != null) {
                        LIZ(jSONObject2, jSONObject, eventConfig.categories);
                        LIZ(jSONObject3, jSONObject, eventConfig.metrics);
                        LIZ(jSONObject4, jSONObject, eventConfig.extra);
                    }
                    C793770VBv.LJII(str2, jSONObject2, jSONObject3, jSONObject4);
                    C2213981Bky.LIZIZ.isDebug();
                }
            }
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2, Map map) throws JSONException {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object objOpt = jSONObject2.opt((String) entry.getKey());
                if (objOpt != null) {
                    jSONObject.put((String) entry.getValue(), objOpt);
                }
            }
        }
    }
}
