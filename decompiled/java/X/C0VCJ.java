package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VCJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VCJ extends C0VCW {
    public final String LIZIZ;
    public final int LIZJ;
    public final JSONObject LIZLLL;
    public final JSONObject LJ;
    public final JSONObject LJFF;
    public JSONObject LJI;
    public final long LJII;

    public final JSONObject LIZIZ(C0VCI c0vci) {
        try {
            if (this.LJI == null) {
                this.LJI = new JSONObject();
            }
            this.LJI.put("log_type", "service_monitor");
            this.LJI.put("service", this.LIZIZ);
            this.LJI.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LIZJ);
            this.LJI.put("value", this.LIZLLL);
            JSONObject jSONObject = this.LJ;
            if (jSONObject != null) {
                this.LJI.put("category", jSONObject);
            }
            JSONObject jSONObject2 = this.LJFF;
            if (jSONObject2 != null) {
                this.LJI.put("metric", jSONObject2);
            }
            if (this.LJI.isNull("timestamp")) {
                this.LJI.put("timestamp", this.LJII);
            }
            if (c0vci != null) {
                c0vci.LIZ("service_monitor", this.LJI);
            }
            LIZ(this.LJI);
            return this.LJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public C0VCJ(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j) {
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = jSONObject;
        this.LJ = jSONObject2;
        this.LJFF = jSONObject3;
        this.LJI = jSONObject4;
        this.LJII = j;
    }
}
