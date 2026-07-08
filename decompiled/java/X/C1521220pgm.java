package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521220pgm extends AbstractC1520150pf3 {
    public C1521490phD LJI;
    public int LJII;
    public final long LJIIIIZZ;
    public Map<String, Object> LJIIIZ;

    public C1521220pgm() {
        super("performance");
        this.LJIIIIZZ = System.currentTimeMillis();
    }

    @Override // X.AbstractC1520070pev
    public final void LIZ(JSONObject jSONObject) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7 = null;
        C1520640pfq.LIZ(jSONObject, null);
        Double dValueOf = Double.valueOf(0.0d);
        C1520640pfq.LJIILJJIL(jSONObject, "fp", dValueOf);
        C1520640pfq.LJIILJJIL(jSONObject, "fmp", dValueOf);
        C1520640pfq.LJIILJJIL(jSONObject, "tti", dValueOf);
        C1520640pfq.LJIILJJIL(jSONObject, "Layout", dValueOf);
        C1520640pfq.LJIILJJIL(jSONObject, "render_page", dValueOf);
        C1520640pfq.LJIILJJIL(jSONObject, "Diff_root_create", dValueOf);
        C1520640pfq.LJIILJJIL(jSONObject, "Diff_same_root", dValueOf);
        C1520640pfq.LJIILJJIL(jSONObject, "tasm_binary_decode", dValueOf);
        C1520640pfq.LJIILJJIL(jSONObject, "tasm_end_decode_finish_load_template", dValueOf);
        C1520640pfq.LJIILJJIL(jSONObject, "tasm_finish_load_template", dValueOf);
        C1520640pfq.LJIIJJI(this.LJII, "state", jSONObject);
        C1520640pfq.LJIIL("report_ts", this.LJIIIIZZ, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        Map<String, Object> map = this.LJIIIZ;
        if (map != null && map.get("metrics") != null) {
            Map<String, Object> map2 = this.LJIIIZ;
            if (map2 != null) {
                obj6 = map2.get("metrics");
            } else {
                obj6 = null;
            }
            C1520640pfq.LJIILJJIL(jSONObject2, "metrics", C1520640pfq.LJIILL(String.valueOf(obj6)));
        }
        Map<String, Object> map3 = this.LJIIIZ;
        if (map3 != null && map3.get("setup_timing") != null) {
            Map<String, Object> map4 = this.LJIIIZ;
            if (map4 != null) {
                obj5 = map4.get("setup_timing");
            } else {
                obj5 = null;
            }
            C1520640pfq.LJIILJJIL(jSONObject2, "setup_timing", C1520640pfq.LJIILL(String.valueOf(obj5)));
        }
        Map<String, Object> map5 = this.LJIIIZ;
        if (map5 != null && map5.get("update_timings") != null) {
            Map<String, Object> map6 = this.LJIIIZ;
            if (map6 != null) {
                obj4 = map6.get("update_timings");
            } else {
                obj4 = null;
            }
            C1520640pfq.LJIILJJIL(jSONObject2, "update_timings", C1520640pfq.LJIILL(String.valueOf(obj4)));
        }
        Map<String, Object> map7 = this.LJIIIZ;
        if (map7 != null && map7.get("extra_timing") != null) {
            Map<String, Object> map8 = this.LJIIIZ;
            if (map8 != null) {
                obj3 = map8.get("extra_timing");
            } else {
                obj3 = null;
            }
            C1520640pfq.LJIILJJIL(jSONObject2, "extra_timing", C1520640pfq.LJIILL(String.valueOf(obj3)));
        }
        Map<String, Object> map9 = this.LJIIIZ;
        if (map9 != null && map9.get("thread_strategy") != null) {
            Map<String, Object> map10 = this.LJIIIZ;
            if (map10 != null) {
                obj2 = map10.get("thread_strategy");
            } else {
                obj2 = null;
            }
            C1520640pfq.LJIILJJIL(jSONObject2, "thread_strategy", obj2);
        }
        Map<String, Object> map11 = this.LJIIIZ;
        if (map11 != null) {
            obj = map11.get("url");
        } else {
            obj = null;
        }
        if (String.valueOf(obj).length() > 0) {
            Map<String, Object> map12 = this.LJIIIZ;
            if (map12 != null) {
                obj7 = map12.get("url");
            }
            C1520640pfq.LJIILJJIL(jSONObject2, "url", obj7);
        }
        C1520640pfq.LIZ(jSONObject, jSONObject2);
        C1521490phD c1521490phD = this.LJI;
        if (c1521490phD != null) {
            c1521490phD.LIZ(jSONObject);
        }
    }

    public final void LIZJ(int i) {
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set lynx_state = ");
        sbLIZ.append(i);
        C1521730phb.LJFF("LynxState", C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = i;
    }
}
