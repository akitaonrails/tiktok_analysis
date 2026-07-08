package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VeI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802720VeI {
    public String LIZ;
    public long LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public String LJIIJJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppExitInfo{mProcessName='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mTimestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mPid=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mReason='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mImportance=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mPss='");
        sbLIZ.append(this.LJI);
        sbLIZ.append('\'');
        sbLIZ.append(", mRss='");
        sbLIZ.append(this.LJII);
        sbLIZ.append('\'');
        sbLIZ.append(", mDescription='");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mRealPss=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", mRealRss=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", subReason='");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(JSONObject jSONObject, Map map) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            if (!C0VJO.LJI(jSONObject2)) {
                jSONObject.put("custom", jSONObject2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZIZ(JSONObject jSONObject, Map map) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            if (!C0VJO.LJI(jSONObject2)) {
                jSONObject.put("filters", jSONObject2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
