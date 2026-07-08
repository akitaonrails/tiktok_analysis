package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k4H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305150k4H {
    public static final C1305150k4H LIZ = new C1305150k4H();
    public static C0VCC LIZIZ;

    public static final void LIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }
}
