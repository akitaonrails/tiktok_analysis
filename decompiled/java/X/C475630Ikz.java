package X;

import android.content.Context;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ikz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475630Ikz {
    public static final JSONObject LIZ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject2;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject2.putOpt(next, jSONObject.get(next));
        }
        return jSONObject2;
    }

    public static final int LIZIZ(int i, Context context) {
        Integer numLIZJ;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(i, context)) != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }
}
