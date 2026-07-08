package X;

import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C834350WoD {
    public C0VCC LIZ;

    public final void LIZ(C834300Wo8 c834300Wo8) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paymentResult", c834300Wo8.toString());
            LIZIZ("pipo_googlepayapi_request_payment_end", jSONObject, new JSONObject());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZJ(boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_google_ready", z);
        LIZIZ("pipo_googlepayapi_isready_end", jSONObject, null);
    }

    public C834350WoD(Context context, C834360WoE c834360WoE) throws JSONException {
        SDKMonitorUtils.setConfigUrl("4108", Collections.singletonList("https://mon.isnssdk.com/monitor/appmonitor/v2/settings"));
        SDKMonitorUtils.setDefaultReportUrl("4108", Collections.singletonList("https://mon.isnssdk.com/monitor/collect/"));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("device_id", c834360WoE.LIZ);
        jSONObject.put("host_aid", c834360WoE.LIZIZ);
        jSONObject.put("sdk_version", "0.0.1-alpha.24");
        jSONObject.put("channel", c834360WoE.LIZJ);
        jSONObject.put("app_version", c834360WoE.LIZLLL);
        jSONObject.put("update_version_code", c834360WoE.LJ);
        SDKMonitorUtils.initMonitor(context, "4108", jSONObject, new C0VCZ() { // from class: X.0WoC
            @Override // X.C0VCZ
            public final String getSessionId() {
                return null;
            }

            @Override // X.C0VCZ
            public final Map<String, String> getCommonParams() {
                return new HashMap();
            }
        });
    }

    public final void LIZIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.LIZ == null) {
            this.LIZ = SDKMonitorUtils.getInstance("4108");
        }
        try {
            C0VCC c0vcc = this.LIZ;
            if (c0vcc != null) {
                c0vcc.LJIIJ(str, jSONObject, jSONObject2, null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
