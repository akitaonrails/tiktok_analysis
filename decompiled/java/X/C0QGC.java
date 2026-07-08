package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QGC, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QGC {
    public static final /* synthetic */ int LJI = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public String LJFF = "";

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("search_session_id", this.LIZ);
            jSONObject.put("search_id", this.LIZIZ);
            jSONObject.put("unit_session_order", this.LIZLLL);
            jSONObject.put("unit_session_type", this.LJ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSessionInfo(searchSessionId='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', unitSessionOrder=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", unitSessionType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sessionPath='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0QGC(String str, String str2, String str3, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
