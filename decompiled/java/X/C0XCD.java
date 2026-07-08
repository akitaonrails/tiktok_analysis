package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XCD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCD extends C0XCG {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;

    @Override // X.C0XCG
    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "uc_login");
            jSONObject.put("duration", this.LIZIZ - this.LIZ);
            jSONObject.put("retry_count", this.LIZJ);
            jSONObject.put("is_first", this.LIZLLL);
            jSONObject.put("is_new_user_mode", this.LJ);
            jSONObject.put(Scene.SCENE_SERVICE, this.LJFF);
            jSONObject.put("result", this.LJI);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // X.C0XCG
    public final void LIZJ() {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = false;
        this.LJI = false;
    }
}
