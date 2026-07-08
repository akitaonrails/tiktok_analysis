package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jTM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282260jTM {
    public static C1282250jTL LIZ(JSONObject jSONObject) {
        C1282250jTL c1282250jTL = new C1282250jTL();
        c1282250jTL.LIZ = jSONObject.optString("effect_face_model_level");
        c1282250jTL.LIZIZ = jSONObject.optString("effect_matting_model_level");
        c1282250jTL.LIZJ = Integer.valueOf(jSONObject.optInt("effect_model_default_cnt", 0));
        c1282250jTL.LIZJ = Integer.valueOf(jSONObject.optInt("effect_model_default_cnt", 0));
        c1282250jTL.LIZLLL = Integer.valueOf(jSONObject.optInt("effect_model_upgrade_cnt", 0));
        c1282250jTL.LJ = Integer.valueOf(jSONObject.optInt("effect_model_downgrade_cnt", 0));
        return c1282250jTL;
    }
}
