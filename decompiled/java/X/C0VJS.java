package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C0VJS implements InterfaceC794070VCz {
    public static final void LIZ(JSONObject jSONObject) throws JSONException {
        Set<String> set;
        if (jSONObject != null && C0VJT.LIZ && (set = C0VJT.LIZIZ) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (C0VJT.LIZJ && !set.contains(next)) {
                    arrayList.add(next);
                } else if (!C0VJT.LIZJ && set.contains(next)) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jSONObject.remove((String) it2.next());
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("source", "slardar");
                jSONObject2.put("result", "remove");
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
                jSONObject2.put("result_desc", sb.toString());
                C793770VBv.LJII("pns_logging_drop_keys_monitor", jSONObject2, null, null);
                if (C0VJT.LIZLLL != null) {
                    C0VR5.LIZIZ(C795640VJa.LIZLLL("apm_body_header_management", C0VJT.LIZLLL, C0VR5.LIZ(), jSONObject2, C0VJY.SPEC_STATUS_RULE_RESULT));
                }
            }
        }
    }
}
