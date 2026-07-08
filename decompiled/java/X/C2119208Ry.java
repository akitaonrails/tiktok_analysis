package X;

import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2119208Ry {
    public static final Map<String, Map<String, String>> LIZ = Collections.synchronizedMap(new LinkedHashMap());

    public static void LIZ(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = LIZ;
        if (map.get(str) == null) {
            map.put(str, new LinkedHashMap());
            map.get(str).put("navigation_id", str);
        }
        map.get(str).put(str2, str3);
    }

    public static void LIZIZ(final String str, final String str2, final Map map, final Map map2) {
        C824310WVh.LIZ(new Runnable() { // from class: X.08Rx
            public final void LIZ() throws JSONException {
                Map<String, String> map3 = C2119208Ry.LIZ.get(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sdk_version", "1.0-tiktok-monorepo");
                if (map3 != null) {
                    for (Map.Entry<String, String> entry : map3.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                Map<String, String> map4 = map;
                if (map4 != null) {
                    for (Map.Entry<String, String> entry2 : map4.entrySet()) {
                        jSONObject.put(entry2.getKey(), entry2.getValue());
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                Map<String, Object> map5 = map2;
                if (map5 != null) {
                    for (Map.Entry<String, Object> entry3 : map5.entrySet()) {
                        jSONObject2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                SDKMonitorUtils.getInstance("8560").LJIIJ(str2, jSONObject, jSONObject2, null);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("InternalWatcher@b050.notice$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("InternalWatcher@b050.notice$1");
            }
        });
    }
}
