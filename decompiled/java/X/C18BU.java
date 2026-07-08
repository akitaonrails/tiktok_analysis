package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18BU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BU {
    public C18BX LIZ;
    public String LIZIZ;
    public String LIZJ;
    public int LIZLLL = -1;

    public final JSONObject LIZ() {
        C18BX c18bx = this.LIZ;
        if (c18bx != C18BX.LAST_BTM_ID && c18bx != C18BX.TOP_PAGE) {
            String str = this.LIZIZ;
            if ((str == null || str.length() == 0) && this.LIZLLL == -1) {
                return null;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            C18BX c18bx2 = this.LIZ;
            jSONObject.put("chain_from", c18bx2 != null ? c18bx2.getValue() : null);
            jSONObject.put("finder", this.LIZIZ);
            jSONObject.put("last_btm_id_switch", this.LIZLLL);
            jSONObject.putOpt("invalid_token", this.LIZJ);
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return jSONObject;
        }
    }
}
