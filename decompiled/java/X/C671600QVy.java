package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671600QVy {
    public int LIZ = -1;
    public C0QW1 LIZIZ = C0QW1.NOT_INIT;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public long LJIIIIZZ = -1;
    public volatile long LJIIIZ = -1;
    public volatile long LJIIJ = -1;
    public int LJIIJJI = -1;
    public String LJIIL;
    public String LJIILIIL;

    public final void LIZ(JSONObject jSONObject) {
        jSONObject.put("root_enter_from_type", this.LJIIJJI);
        jSONObject.put("enter_method", this.LJIIL);
        jSONObject.put("enter_from", this.LJIILIIL);
        jSONObject.put("current_stage", this.LIZIZ.getStage());
    }

    public final void LIZIZ(String str, Function1<? super JSONObject, Unit> function1) {
        boolean z;
        if (this.LIZIZ == C0QW1.NOT_INIT) {
            return;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", this.LJIIIIZZ - this.LIZJ);
        Long lValueOf = Long.valueOf(this.LJIIIZ);
        if (lValueOf.longValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jSONObject.put("click_2_start_prefetch", lValueOf.longValue() - this.LIZJ);
        }
        Long lValueOf2 = Long.valueOf(this.LJIIJ);
        if (lValueOf2.longValue() != -1) {
            long jLongValue = lValueOf2.longValue();
            jSONObject.put("start_2_handle_prefetch", jLongValue - this.LJIIIZ);
            jSONObject.put("handle_prefetch_2_meaningful", this.LJIIIIZZ - jLongValue);
        }
        jSONObject.put("click_2_jump", this.LIZLLL - this.LIZJ);
        jSONObject.put("jump_2_route", this.LJ - this.LIZLLL);
        jSONObject.put("click_2_route", this.LJ - this.LIZJ);
        jSONObject.put("route_2_launch", this.LJFF - this.LJ);
        jSONObject.put("launch_2_mix_init", this.LJI - this.LJFF);
        jSONObject.put("mix_init_2_mix_refresh_data", this.LJII - this.LJI);
        jSONObject.put("mix_refresh_data_2_meaningful", this.LJIIIIZZ - this.LJII);
        LIZ(jSONObject);
        if (function1 != null) {
            function1.invoke(jSONObject);
        }
        jSONObject.put(Scene.SCENE_SERVICE, str);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_search_half_screen_trace", jSONObject);
    }
}
