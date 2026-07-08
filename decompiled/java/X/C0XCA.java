package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XCA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCA extends C0XCG {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.C0XCG
    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("params_for_special", "uc_login");
            jSONObject.put("duration", this.LIZIZ - this.LIZ);
            long j = 0;
            if (this.LJIIIZ) {
                InterfaceC844780XCa interfaceC844780XCa = C0XCJ.LIZIZ.LJIIIZ;
                long jLongValue = interfaceC844780XCa == null ? 0L : interfaceC844780XCa.getLongValue("cold_start_time").longValue();
                if (jLongValue != 0) {
                    j = this.LIZJ - jLongValue;
                }
            }
            jSONObject.put("duration_after_cold_start", j);
            jSONObject.put("is_cold_start", this.LJIIIZ);
            jSONObject.put("retry_count", this.LIZLLL);
            jSONObject.put("is_first", this.LJFF);
            jSONObject.put("did_change", this.LJ);
            jSONObject.put("is_new_user_mode", this.LJI);
            jSONObject.put(Scene.SCENE_SERVICE, this.LJII);
            jSONObject.put("result", this.LJIIIIZZ);
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
        this.LIZLLL = 0;
        this.LJ = false;
        this.LJFF = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
    }
}
