package X;

import com.google.gson.m;
import com.google.gson.n;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2096608Jg {
    public static final boolean LIZ(n nVar) {
        if (nVar != null && !(nVar instanceof m) && nVar.size() != 0) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject2 != null && jSONObject2.length() != 0) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }
}
