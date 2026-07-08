package X;

import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08S3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08S3 {
    public static final C08S3 LIZ = new C08S3();
    public static C0VCC LIZIZ;
    public static boolean LIZJ;

    public static void LIZJ(String str, Map map) {
        LinkedHashMap linkedHashMap;
        InterfaceC359601aU interfaceC359601aULIZ;
        if (str != null && str.length() != 0) {
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
                HashMap map2 = new HashMap();
                map2.put("is_regression_test", CardStruct.IStatusCode.DEFAULT);
                linkedHashMap.putAll(map2);
            } else {
                linkedHashMap = null;
            }
            String str2 = C2195221Avo.LJIIIIZZ;
            if (str2 != null && (interfaceC359601aULIZ = C359501aT.LIZ(str2)) != null) {
                interfaceC359601aULIZ.LIZ(str, linkedHashMap);
            }
            C20684815ws.LJIILLIIL(str, linkedHashMap);
        }
    }

    public static void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        HashMap map = new HashMap();
        map.put("is_regression_test", CardStruct.IStatusCode.DEFAULT);
        for (Map.Entry entry : map.entrySet()) {
            if (jSONObject != null) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        if (!LIZJ) {
            SDKMonitorUtils.setConfigUrl("899355", Collections.singletonList("https://mon.isnssdk.com/monitor/appmonitor/v2/settings"));
            SDKMonitorUtils.setDefaultReportUrl("899355", Collections.singletonList("https://mon.isnssdk.com/monitor/collect/"));
            JSONObject jSONObject4 = new JSONObject();
            C844470XAv.LIZ.getClass();
            jSONObject4.put("host_aid", C844470XAv.LJIIJ);
            jSONObject4.put("sdk_version", C844470XAv.LJ());
            jSONObject4.put("app_version", C844470XAv.LJFF());
            jSONObject4.put("channel", C844470XAv.LJIILL);
            SDKMonitorUtils.initMonitor(C844470XAv.LIZ(), "899355", jSONObject4, new C0VCZ() { // from class: X.07Rk
                @Override // X.C0VCZ
                public final String getSessionId() {
                    return null;
                }

                @Override // X.C0VCZ
                public final Map<String, String> getCommonParams() {
                    HashMap map2 = new HashMap();
                    map2.put("oversea", "1");
                    return map2;
                }
            });
            LIZJ = true;
        }
        if (LIZIZ == null) {
            LIZIZ = SDKMonitorUtils.getInstance("899355");
        }
        C793770VBv.LJII(str, jSONObject, jSONObject2, jSONObject3);
        C0VCC c0vcc = LIZIZ;
        if (c0vcc != null) {
            c0vcc.LJIIJ(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    public static final void LIZLLL(String str, HashMap<String, Object> map, HashMap<String, Object> map2, Long l) {
        if (str.length() == 0) {
            return;
        }
        ?? c2344009Gk = new C2344009Gk();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                c2344009Gk.LJFF(entry.getKey(), entry.getValue().toString());
            }
            if (l == 0) {
                l = String.valueOf(System.currentTimeMillis());
            }
            c2344009Gk.LJ(l, "tm_timestamp");
        }
        if (map2 != null) {
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                c2344009Gk.LJFF(entry2.getKey(), entry2.getValue().toString());
            }
        }
        Map<String, String> map3 = c2344009Gk.LIZ;
        LIZJ(str, map3);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map3));
        C2188811AlT.LIZIZ(sbLIZ);
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Object> entry3 : map.entrySet()) {
                jSONObject.put(entry3.getKey(), entry3.getValue());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        if (map2 != null) {
            for (Map.Entry<String, Object> entry4 : map2.entrySet()) {
                jSONObject2.put(entry4.getKey(), entry4.getValue());
            }
        }
        LIZ(str, jSONObject, jSONObject2, null);
    }
}
