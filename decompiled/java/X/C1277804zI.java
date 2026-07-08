package X;

import defpackage.n1;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.04zI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1277804zI {
    public static final String LIZ(JSONObject jSONObject, Map<String, String> map) {
        Map mapLIZ = n1.LIZ(map);
        if (mapLIZ != null) {
            for (Map.Entry entry : mapLIZ.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        return C786410Ut5.J3(jSONObject);
    }
}
