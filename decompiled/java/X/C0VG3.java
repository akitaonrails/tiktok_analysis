package X;

import java.util.LinkedHashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VG3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VG3 implements C0VBD {
    @Override // X.C0VBD
    public final JSONObject LIZ(JSONObject jSONObject) {
        if (C0VJQ.LIZJ && jSONObject != null) {
            String strOptString = jSONObject.optString("service");
            String strOptString2 = jSONObject.optString("log_type");
            return C0VJQ.LIZJ(jSONObject, C0VJQ.LIZ(strOptString2, strOptString), new LinkedHashSet());
        }
        return jSONObject;
    }
}
