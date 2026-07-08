package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01JS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01JS {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final long LJIIIIZZ;
    public final JSONArray LJIIIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TriggerResult(businessName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", triggerType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", watchDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rulesPkgName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", ruleName=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", label=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", features=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", triggerEvents=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        Object c098200Yq;
        try {
            c098200Yq = C786410Ut5.J3(new JSONObject().putOpt("business_name", this.LIZ).putOpt("trigger_type", this.LIZIZ).putOpt("features", this.LJII).putOpt("rules_pkg_name", this.LJ).putOpt("rule_name", this.LJFF).putOpt("room_id", Long.valueOf(this.LJIIIIZZ)).putOpt("watch_duration", String.valueOf(this.LIZJ)).putOpt("label", this.LJI));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String strJ3 = C786410Ut5.J3(new JSONObject());
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = strJ3;
        }
        return (String) c098200Yq;
    }

    public C01JS(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, long j2, JSONArray jSONArray) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = j2;
        this.LJIIIZ = jSONArray;
    }
}
