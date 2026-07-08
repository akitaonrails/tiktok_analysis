package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJT {
    public static boolean LIZ;
    public static Set<String> LIZIZ;
    public static boolean LIZJ = true;
    public static Map<String, String> LIZLLL;

    public static JSONObject LIZ(JSONObject jSONObject) throws JSONException {
        Set<String> set;
        if (LIZ && (set = LIZIZ) != null) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (LIZJ && set.contains(next)) {
                    try {
                        jSONObject2.put(next, jSONObject.opt(next));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } else if (!LIZJ && !set.contains(next)) {
                    try {
                        jSONObject2.put(next, jSONObject.opt(next));
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                } else {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("source", "slardar");
                jSONObject3.put("result", "remove");
                StringBuilder sb = new StringBuilder();
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) ",");
                    }
                }
                jSONObject3.put("result_desc", sb.toString());
                C793770VBv.LJII("pns_logging_drop_keys_monitor", jSONObject3, null, null);
                if (LIZLLL != null) {
                    C0VR5.LIZIZ(C795640VJa.LIZLLL("apm_body_header_management", LIZLLL, C0VR5.LIZ(), jSONObject3, C0VJY.SPEC_STATUS_RULE_RESULT));
                }
            }
            return jSONObject2;
        }
        return jSONObject;
    }

    public static void LIZIZ(Map map, Set set) {
        LIZIZ = set;
        LIZJ = true;
        LIZ = true;
        if (map != null) {
            LIZLLL = map;
            C0VR5.LIZIZ(C795640VJa.LIZJ("apm_body_header_management", map, C0VR5.LIZ(), C0VJY.SPEC_STATUS_RULE_PARSE));
        }
    }
}
