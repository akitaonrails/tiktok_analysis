package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03SA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03SA {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("element", this.LIZ);
            jSONObject.put("param_name", this.LIZIZ);
            jSONObject.put("param_value", this.LIZJ);
            jSONObject.put("is_encrypted", this.LIZLLL);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public C03SA(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
