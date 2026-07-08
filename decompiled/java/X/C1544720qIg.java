package X;

import android.content.Context;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544720qIg {
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public final C0VCC LIZ;

    public final void LIZ(C1544730qIh c1544730qIh) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("code", c1544730qIh.LIZIZ);
        jSONObject.put("app_id", c1544730qIh.LIZJ);
        jSONObject.put("url", c1544730qIh.LJI);
        jSONObject.put("channel", c1544730qIh.LIZLLL);
        jSONObject.put("method", c1544730qIh.LIZ);
        jSONObject.put("container_type", c1544730qIh.LJ);
        jSONObject2.put("duration", c1544730qIh.LJFF);
        jSONObject2.put("request_data_length", c1544730qIh.LJII);
        jSONObject2.put("request_send_timestamp", c1544730qIh.LJIIIIZZ);
        jSONObject2.put("request_receive_timestamp", c1544730qIh.LJIIIZ);
        jSONObject2.put("request_decode_duration", c1544730qIh.LJIIJ);
        jSONObject2.put("request_duration", c1544730qIh.LJIIJJI);
        jSONObject2.put("response_data_length", c1544730qIh.LJIIL);
        jSONObject2.put("response_send_timestamp", c1544730qIh.LJIILJJIL);
        jSONObject2.put("response_receive_timestamp", c1544730qIh.LJIILL);
        jSONObject2.put("response_encode_duration", c1544730qIh.LJIILIIL);
        jSONObject2.put("response_duration", c1544730qIh.LJIILLIIL);
        this.LIZ.LJIIJ("bdxbridge_performance", jSONObject, jSONObject2, null);
    }

    public C1544720qIg(Context context, C1544740qIi c1544740qIi, List<String> list, List<String> list2) throws JSONException {
        String str;
        String str2 = c1544740qIi.LIZ;
        String str3 = c1544740qIi.LIZJ;
        final String str4 = c1544740qIi.LIZIZ;
        String str5 = c1544740qIi.LIZLLL;
        String str6 = c1544740qIi.LJ;
        String str7 = c1544740qIi.LJFF;
        if (str4 == null) {
            str = "";
        } else {
            str = str4;
        }
        LIZIZ = str;
        LIZJ = str6 != null ? str6 : "";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("device_id", str2);
        if (str2 == null || str2.length() == 0) {
            int i = C2187451AjH.LIZ;
            InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        }
        jSONObject.put("host_aid", str4);
        jSONObject.put("app_version", str3);
        jSONObject.put("update_version_code", str5);
        jSONObject.put("channel", str6);
        jSONObject.put("sdk_version", str7);
        SDKMonitorUtils.setDefaultReportUrl("292472", list);
        SDKMonitorUtils.setConfigUrl("292472", list2);
        SDKMonitorUtils.initMonitor(C786410Ut5.N3(context), "292472", jSONObject, new C0VCZ() { // from class: X.0qHr
            @Override // X.C0VCZ
            public final String getSessionId() {
                return "";
            }

            @Override // X.C0VCZ
            public final Map<String, String> getCommonParams() {
                HashMap map = new HashMap();
                String str8 = str4;
                if (str8 != null) {
                    map.put("host_aid", str8);
                }
                return map;
            }
        });
        this.LIZ = SDKMonitorUtils.getInstance("292472");
    }
}
