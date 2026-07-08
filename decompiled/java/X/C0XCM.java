package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XCM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCM extends C0XCG {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public long LIZLLL;

    @Override // X.C0XCG
    public final void LIZJ() {
    }

    @Override // X.C0XCG
    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "uc_login");
            jSONObject.put("type", this.LIZ);
            jSONObject.put("state", this.LIZIZ);
            jSONObject.put("flag", this.LIZJ);
            jSONObject.put("duration", this.LIZLLL);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }
}
