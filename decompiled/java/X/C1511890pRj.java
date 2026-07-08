package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511890pRj {
    public final String LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public boolean LIZ = C1512320pSQ.LIZ;
    public final C1511970pRr LJ = new C1511970pRr();
    public final C1511970pRr LJFF = new C1511970pRr();
    public final C1511970pRr LJI = new C1511970pRr();
    public boolean LJII = false;
    public boolean LJIIIIZZ = false;
    public boolean LJIIIZ = false;
    public final C1511970pRr LJIIJ = new C1511970pRr();
    public final C1511970pRr LJIIJJI = new C1511970pRr();
    public final C1511970pRr LJIIL = new C1511970pRr();
    public final C1511970pRr LJIILIIL = new C1511970pRr();
    public boolean LJIILJJIL = false;
    public String LJIILL = null;
    public Float LJIILLIIL = null;

    public final void LIZ() {
        this.LJIIJ.LIZ();
        this.LJIIJJI.LIZ();
        this.LJIIL.LIZ();
        this.LJIILIIL.LIZ();
        this.LJIILJJIL = false;
        this.LJIILL = null;
        this.LJIILLIIL = null;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Scene.SCENE_SERVICE, this.LIZIZ);
            jSONObject.put("model_name", this.LIZJ);
            jSONObject.put("sdk_duration", this.LJ.LIZIZ());
            jSONObject.put("download_cost", this.LJFF.LIZIZ());
            jSONObject.put("model_cost", this.LJI.LIZIZ());
            jSONObject.put("sdk_success", this.LJII ? 1 : 0);
            jSONObject.put("download_suc", this.LJIIIIZZ ? 1 : 0);
            jSONObject.put("model_load_suc", this.LJIIIZ ? 1 : 0);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1512290pSN.LIZ("ml#evaluator", "getSdkInitMonitorData error!", e);
        }
        this.LJ.LIZ();
        this.LJFF.LIZ();
        this.LJI.LIZ();
        this.LJII = false;
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        try {
            jSONObject.put(Scene.SCENE_SERVICE, this.LIZIZ);
            jSONObject.put("model_name", this.LIZJ);
            jSONObject.put("sdk_duration", this.LJIIJ.LIZIZ());
            jSONObject.put("pre_cost", this.LJIIJJI.LIZIZ());
            jSONObject.put("infer_cost", this.LJIIL.LIZIZ());
            jSONObject.put("post_cost", this.LJIILIIL.LIZIZ());
            jSONObject.put("sdk_success", this.LJIILJJIL ? 1 : 0);
            String str = this.LJIILL;
            if (str != null) {
                jSONObject.put("s_result", str);
            }
            if (this.LJIILLIIL != null) {
                jSONObject.put("f_result", r0.floatValue());
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1512290pSN.LIZ("ml#evaluator", "getSdkRunMonitorData error!", e2);
        }
        LIZ();
        return C786410Ut5.J3(jSONObject);
    }

    public C1511890pRj(String str) {
        this.LIZIZ = str;
    }

    public final void LIZIZ(boolean z) {
        if (this.LIZ && !this.LIZLLL) {
            this.LJ.LIZIZ = System.currentTimeMillis();
            this.LJII = z;
            this.LIZLLL = true;
        }
    }

    public final void LIZJ(boolean z) {
        if (this.LIZ && !this.LIZLLL) {
            this.LJI.LIZIZ = System.currentTimeMillis();
            this.LJIIIZ = z;
        }
    }

    public final void LIZLLL(float f, boolean z) {
        if (!this.LIZ) {
            return;
        }
        this.LJIIJ.LIZIZ = System.currentTimeMillis();
        this.LJIILJJIL = z;
        this.LJIILLIIL = Float.valueOf(f);
    }

    public final void LJ(String str, float f, boolean z) {
        if (!this.LIZ) {
            return;
        }
        this.LJIIJ.LIZIZ = System.currentTimeMillis();
        this.LJIILJJIL = z;
        this.LJIILL = str;
        this.LJIILLIIL = Float.valueOf(f);
    }
}
