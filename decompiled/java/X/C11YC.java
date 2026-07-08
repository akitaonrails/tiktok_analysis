package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11YC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11YC {
    public final JSONObject LIZ = new JSONObject();
    public boolean LIZIZ;

    public final void LIZLLL() {
        C11YJ c11yj;
        if (this.LIZIZ) {
            return;
        }
        C11YX c11yx = new C11YX();
        c11yx.LIZIZ(Integer.valueOf(this.LIZ.optInt("error_code")));
        c11yx.LIZJ(this.LIZ.optString("error_msg"));
        C11YK c11yk = C11YJ.Companion;
        String strOptString = this.LIZ.optString("error_source", C11YJ.UNKNOWN_ERROR.getValue());
        c11yk.getClass();
        C11YJ[] c11yjArrValues = C11YJ.values();
        int length = c11yjArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                c11yj = C11YJ.UNKNOWN_ERROR;
                break;
            }
            c11yj = c11yjArrValues[i];
            if (Intrinsics.LJFF(c11yj.getValue(), strOptString)) {
                break;
            } else {
                i++;
            }
        }
        c11yx.LIZLLL(c11yj);
        c11yx.LJFF(this.LIZ.optString("task_id"));
        c11yx.LJ("feature_apply");
        C19518711Yb c19518711Yb = C19518711Yb.LIZ;
        JSONObject jSONObject = this.LIZ;
        C11YY c11yyLIZ = c11yx.LIZ();
        c19518711Yb.getClass();
        C20684815ws.LJIJ("feature_apply", jSONObject != null ? C475630Ikz.LIZ(jSONObject) : null);
        C19518711Yb.LIZ(c11yyLIZ);
        C20684815ws.LJIILLIIL("sami_business_error_mob", c11yyLIZ.LIZ);
    }

    public final void LJ() {
        this.LIZ.put("feature_name", "");
        this.LIZ.put("scene_name", "");
        this.LIZ.put("extra", "");
        this.LIZ.put("total_duration", 0L);
        this.LIZ.put("apply_duration", 0L);
        this.LIZ.put("resource_prepare_duration", 0L);
        this.LIZ.put("use_cache", 0);
        LIZIZ("");
        LIZ(0);
        this.LIZ.put("effect_id", "");
        this.LIZ.put("creation_id", "");
        LIZJ(C11YJ.UNKNOWN_ERROR.getValue());
        this.LIZ.put("task_id", "");
    }

    public final void LIZ(int i) {
        this.LIZ.put("error_code", i);
    }

    public final void LIZIZ(String str) {
        this.LIZ.put("error_msg", str);
    }

    public final void LIZJ(String str) {
        this.LIZ.put("error_source", str);
    }
}
