package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jhl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291190jhl {
    public final int LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;

    public final String LIZ() {
        JSONObject jSONObject = this.LIZJ;
        if (jSONObject != null) {
            return C786410Ut5.J3(jSONObject);
        }
        String str = this.LIZIZ;
        return str != null ? str : "";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{\"code\": ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",\"msg\":");
        sbLIZ.append(LIZ());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1291190jhl(int i, JSONObject jSONObject) {
        this.LIZIZ = "";
        this.LIZJ = jSONObject;
        this.LIZ = i;
        try {
            if (jSONObject.has("error")) {
                this.LIZIZ = JSONObjectProtectorUtils.getString(jSONObject, "error");
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1291190jhl(int i, String str) {
        this.LIZIZ = "";
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
