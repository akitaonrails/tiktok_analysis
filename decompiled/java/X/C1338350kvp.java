package X;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338350kvp {
    public final WeakReference<C1338380kvs> LIZ;

    public C1338350kvp(WeakReference<C1338380kvs> weakReference) {
        this.LIZ = weakReference;
    }

    public final void LIZ(JSONObject jSONObject) {
        boolean z;
        C1338380kvs c1338380kvs = this.LIZ.get();
        if (c1338380kvs == null) {
            return;
        }
        c1338380kvs.LIZIZ = jSONObject.optLong("duration", -1L);
        if (jSONObject.optBoolean("isSuccess")) {
            z = true;
        } else {
            z = false;
        }
        c1338380kvs.LIZLLL = z;
        c1338380kvs.LIZJ = true;
        String strOptString = jSONObject.optString("uri");
        if (strOptString == null) {
            strOptString = "";
        }
        if (strOptString.length() > 0 && c1338380kvs.LIZ.length() == 0) {
            c1338380kvs.LIZ = strOptString;
        }
    }
}
