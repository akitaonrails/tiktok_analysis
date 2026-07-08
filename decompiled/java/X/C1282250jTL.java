package X;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282250jTL {
    public static final /* synthetic */ int LJFF = 0;
    public String LIZ;
    public String LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public Integer LJ;

    public final String LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("effect_face_model_level", this.LIZ);
        jSONObject.put("effect_matting_model_level", this.LIZIZ);
        jSONObject.put("effect_model_default_cnt", this.LIZJ);
        jSONObject.put("effect_model_upgrade_cnt", this.LIZLLL);
        jSONObject.put("effect_model_downgrade_cnt", this.LJ);
        return C786410Ut5.J3(jSONObject);
    }

    public C1282250jTL() {
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.LJ = 0;
    }

    public final void LIZ(C1282250jTL c1282250jTL) {
        Integer numValueOf;
        Integer numValueOf2;
        this.LIZ = c1282250jTL.LIZ;
        this.LIZIZ = c1282250jTL.LIZIZ;
        Integer num = c1282250jTL.LIZJ;
        Integer numValueOf3 = null;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = this.LIZJ;
            if (num2 != null) {
                numValueOf2 = Integer.valueOf(num2.intValue() + iIntValue);
            } else {
                numValueOf2 = null;
            }
            this.LIZJ = numValueOf2;
        }
        Integer num3 = c1282250jTL.LIZLLL;
        if (num3 != null) {
            int iIntValue2 = num3.intValue();
            Integer num4 = this.LIZLLL;
            if (num4 != null) {
                numValueOf = Integer.valueOf(num4.intValue() + iIntValue2);
            } else {
                numValueOf = null;
            }
            this.LIZLLL = numValueOf;
        }
        Integer num5 = c1282250jTL.LJ;
        if (num5 != null) {
            int iIntValue3 = num5.intValue();
            Integer num6 = this.LJ;
            if (num6 != null) {
                numValueOf3 = Integer.valueOf(num6.intValue() + iIntValue3);
            }
            this.LJ = numValueOf3;
        }
    }
}
