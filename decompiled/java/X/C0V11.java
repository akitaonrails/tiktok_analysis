package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V11, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V11 {
    public long LIZ;
    public int LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageObj{id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", obj='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", extra='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.LIZ = jSONObject.optLong(FollowStatusChangeMethod.PARAM_UID);
            this.LIZIZ = jSONObject.optInt("type");
            this.LIZJ = jSONObject.optString("obj");
            this.LIZLLL = jSONObject.optInt("from");
            this.LJ = jSONObject.optString("extra");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
