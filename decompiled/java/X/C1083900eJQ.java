package X;

import com.bytedance.android.live_settings.Monitor;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1083900eJQ implements Monitor {
    @Override // com.bytedance.android.live_settings.Monitor
    public final void reportException(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        JSONObject jSONObjectPut = jSONObject.put("exception", C2188811AlT.LIZIZ(sbLIZ));
        C1CC3 c1cc3 = C1CC2.LIZ;
        if (c1cc3 != null) {
            c1cc3.LJIJ(jSONObjectPut);
        }
    }

    @Override // com.bytedance.android.live_settings.Monitor
    public final void reportSettingReadPerformance(final String str, final long j, final String str2) {
        if (((int) (Math.random() * ((double) 10000))) >= C1338270kvh.LIZIZ) {
            return;
        }
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0eJP
            public final void LIZ() throws JSONException {
                C1083900eJQ c1083900eJQ = this.LL;
                String str3 = str;
                long j2 = j;
                String str4 = str2;
                c1083900eJQ.getClass();
                if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_setting_manager_performance", 0.001d)) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("setting_key", str3);
                    jSONObject2.put("duration", Float.valueOf(j2 / 1000.0f));
                    jSONObject2.put("field_type_name", str4);
                    C1CC2.LJ("ttlive_setting_manager_performance", jSONObject, jSONObject2, new JSONObject());
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveSettingMonitor@3f41.reportSettingReadPerformance$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveSettingMonitor@3f41.reportSettingReadPerformance$1");
            }
        });
    }
}
