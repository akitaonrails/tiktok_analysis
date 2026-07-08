package X;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00d4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C120800d4 {
    public static final void LIZ(JSONObject jSONObject, Map<String, ? extends Object> map) throws JSONException {
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                if (entry.getKey() != null && (entry.getValue() instanceof String)) {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
