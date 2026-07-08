package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03fU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C900203fU {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;

    public final void LIZJ() {
        this.LJFF = true;
    }

    public final JSONObject LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("environment", this.LIZ);
            jSONObject.put("locale", this.LIZIZ);
            jSONObject.put("origin_key", this.LIZJ);
            jSONObject.put("platform", this.LIZLLL);
            jSONObject.put("current_region", this.LJ);
            jSONObject.put("use_fe_land_page_callback", this.LJFF);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final void LIZ(String str) {
        this.LJ = str;
    }

    public final void LIZIZ(String str) {
        this.LIZIZ = str;
    }
}
