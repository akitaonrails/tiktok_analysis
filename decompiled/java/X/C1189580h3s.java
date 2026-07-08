package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0h3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189580h3s {
    public static final C1189580h3s LIZ = new C1189580h3s();

    public static JSONObject LIZ(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                C2365509Or.LIZLLL(jSONObject, (String) entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }
}
