package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJU {
    public static boolean LIZ;
    public static C0VJX LIZIZ;
    public static C0VJW LIZJ = C0VJW.NORMAL;
    public static boolean LIZLLL = true;
    public static Map<String, String> LJ;

    public static void LIZ(JSONObject jSONObject) {
        C0VJX c0vjx;
        Set<String> setLIZ;
        if (!LIZ) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        int i = C0VJV.LIZ[LIZJ.ordinal()];
        if (i == 1 || i != 2 || (c0vjx = LIZIZ) == null || (setLIZ = c0vjx.LIZ()) == null || setLIZ.isEmpty()) {
            return;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (LIZLLL && !setLIZ.contains(next)) {
                arrayList.add(next);
            } else if (!LIZLLL && setLIZ.contains(next)) {
                arrayList.add(next);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return;
        }
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jSONObject.remove((String) it2.next());
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("source", "applog");
            StringBuilder sb = new StringBuilder();
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it3.next());
                    if (!it3.hasNext()) {
                        break;
                    } else {
                        sb.append((CharSequence) ",");
                    }
                }
            }
            jSONObject2.put("remove_keys", sb.toString());
            C793770VBv.LJII("pns_logging_drop_keys_monitor", jSONObject2, null, null);
            if (LJ == null) {
                return;
            }
            C0VR5.LIZIZ(C795640VJa.LIZLLL("tea_body_header_management", LJ, C0VR5.LIZ(), jSONObject2, C0VJY.SPEC_STATUS_RULE_RESULT));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(C0VJX c0vjx, Map map) {
        LIZIZ = c0vjx;
        LIZLLL = true;
        LIZJ = C0VJW.WITH_BLOCK;
        if (map != null) {
            LJ = map;
            C0VR5.LIZIZ(C795640VJa.LIZJ("tea_body_header_management", map, C0VR5.LIZ(), C0VJY.SPEC_STATUS_RULE_PARSE));
        }
        LIZ = true;
    }
}
