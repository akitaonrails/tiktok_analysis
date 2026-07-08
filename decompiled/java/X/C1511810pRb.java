package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pRb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511810pRb {
    public static final /* synthetic */ int LJIILIIL = 0;
    public float LIZIZ;
    public String LJIIJJI;
    public Float LJIIL;
    public boolean LIZ = false;
    public final C1511650pRL LIZJ = new C1511650pRL();
    public int LIZLLL = -1;
    public int LJ = -1;
    public int LJFF = -999;
    public final C1511650pRL LJI = new C1511650pRL();
    public final C1511650pRL LJII = new C1511650pRL();
    public final C1511650pRL LJIIIIZZ = new C1511650pRL();
    public int LJIIIZ = -1;
    public int LJIIJ = -1;

    public final void LIZ(int i, int i2, Map<String, Float> map) {
        if (!this.LIZ) {
            return;
        }
        this.LJI.LIZIZ = System.currentTimeMillis();
        String strValueOf = String.valueOf(i2);
        if (map != null && (!map.isEmpty())) {
            this.LJIIJJI = strValueOf;
            if (map.containsKey(strValueOf)) {
                this.LJIIL = map.get(strValueOf);
            }
        }
        this.LJIIIZ = i;
        if (AbstractC19994813Le.Default.nextFloat() < this.LIZIZ) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Scene.SCENE_SERVICE, "har_android");
                jSONObject.put("duration", Float.valueOf(this.LJI.LIZ()));
                jSONObject.put("pre_cost", Float.valueOf(this.LJII.LIZ()));
                jSONObject.put("infer_cost", Float.valueOf(this.LJIIIIZZ.LIZ()));
                jSONObject.put("success", this.LJIIIZ);
                jSONObject.put("sdk_success", this.LJIIJ);
                String str = this.LJIIJJI;
                if (str != null) {
                    jSONObject.put("s_result", str);
                }
                Float f = this.LJIIL;
                if (f != null) {
                    jSONObject.put("f_result", Float.valueOf(f.floatValue()));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C20684815ws.LJIJ("ml_scene_run", jSONObject);
        }
        C1511650pRL c1511650pRL = this.LJI;
        c1511650pRL.LIZ = -1L;
        c1511650pRL.LIZIZ = -1L;
        C1511650pRL c1511650pRL2 = this.LJII;
        c1511650pRL2.LIZ = -1L;
        c1511650pRL2.LIZIZ = -1L;
        C1511650pRL c1511650pRL3 = this.LJIIIIZZ;
        c1511650pRL3.LIZ = -1L;
        c1511650pRL3.LIZIZ = -1L;
        this.LJIIIZ = -1;
        this.LJIIJJI = null;
        this.LJIIL = null;
    }
}
