package X;

import android.util.Base64;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525410pnX {
    public final boolean LIZ;
    public final JSONObject LIZIZ;
    public final C1525420pnY LIZJ;
    public final Map<String, byte[]> LIZLLL;

    public final JSONObject LIZ() throws JSONException {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isSuccess", this.LIZ);
        JSONObject jSONObject2 = this.LIZIZ;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj2 = jSONObject2.get(next);
            if (obj2 instanceof byte[]) {
                jSONObject2.put(next, Base64.encodeToString((byte[]) obj2, 2));
            }
        }
        jSONObject.put("data", jSONObject2);
        C1525420pnY c1525420pnY = this.LIZJ;
        if (c1525420pnY != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("errorCode", c1525420pnY.LIZ);
            jSONObject3.put("errorMsg", c1525420pnY.LIZIZ);
            obj = jSONObject3;
        } else {
            obj = "{}";
        }
        jSONObject.put("errorInfo", obj);
        return jSONObject;
    }

    public C1525410pnX(boolean z, JSONObject jSONObject, C1525420pnY c1525420pnY, Map<String, byte[]> map) {
        this.LIZ = z;
        this.LIZIZ = jSONObject;
        this.LIZJ = c1525420pnY;
        this.LIZLLL = map;
    }
}
