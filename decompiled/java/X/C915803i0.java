package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03i0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C915803i0 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.LIZ;
            if (str != null) {
                jSONObject.put("billing_country_region", str);
            }
            String str2 = this.LIZIZ;
            if (str2 != null) {
                jSONObject.put("billing_state", str2);
            }
            String str3 = this.LIZJ;
            if (str3 != null) {
                jSONObject.put("billing_city", str3);
            }
            String str4 = this.LIZLLL;
            if (str4 != null) {
                jSONObject.put("billing_postal_code", str4);
            }
            String str5 = this.LJ;
            if (str5 != null) {
                jSONObject.put("billing_street", str5);
                return jSONObject;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public final String toString() {
        return C786410Ut5.J3(LIZ());
    }
}
