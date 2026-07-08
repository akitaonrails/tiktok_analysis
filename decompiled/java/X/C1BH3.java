package X;

import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BH3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BH3 {
    public static final C1BH3 LIZ = new C1BH3();
    public static final C2344009Gk LIZIZ = new C2344009Gk();
    public static final Map<String, String> LIZJ = new LinkedHashMap();

    public static void LIZIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(LIZIZ.LIZ);
        C1BH6.LIZ.getClass();
        c2344009Gk.LJFF("edge_type", C1BH6.LIZIZ);
        if (C1BH6.LIZIZ()) {
            C1BH4.LIZ.getClass();
            c2344009Gk.LJFF("scc_logid", C1BH4.LIZJ);
            c2344009Gk.LJFF("scc_reason", C1BH4.LIZIZ);
        }
        C20684815ws.LJIILLIIL("edge_case_show", c2344009Gk.LIZ);
    }

    public static void LIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(LIZIZ.LIZ);
        C1BH6.LIZ.getClass();
        c2344009Gk.LJFF("edge_type", C1BH6.LIZIZ);
        c2344009Gk.LJFF("button_name", str);
        C20684815ws.LJIILLIIL("edge_case_click", c2344009Gk.LIZ);
    }

    public static void LIZJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            ((LinkedHashMap) LIZJ).clear();
            return;
        }
        for (Map.Entry<String, Object> entry : JsonExtKt.toMap(jSONObject).entrySet()) {
            LIZJ.put(entry.getKey(), entry.getValue().toString());
        }
    }

    public static void LIZLLL(long j) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJII(LIZIZ.LIZ);
        c2344009Gk.LJFF("duration", String.valueOf(System.currentTimeMillis() - j));
        String str = (String) ((LinkedHashMap) LIZJ).get("business_event_keys_stay_time");
        if (C123100dR.LIZ(str)) {
            C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
        } else {
            C20684815ws.LJIILLIIL("search_webpage_stay_time", c2344009Gk.LIZ);
        }
    }
}
