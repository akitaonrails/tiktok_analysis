package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import j27.s;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AOB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AOB extends C1290430jgX {
    public C1AOB(int i, s sVar) {
        super(i, sVar);
    }

    public final void LIZIZ(int i, Integer num, String str, String str2, String str3, boolean z) {
        JSONObject jSONObject = new JSONObject();
        C1520640pfq.LJIILIIL("code", String.valueOf(i), jSONObject);
        C1520640pfq.LJIILIIL("playerType", str, jSONObject);
        C1520640pfq.LJIILIIL("autoPlay", String.valueOf(z), jSONObject);
        C1520640pfq.LJIILIIL("message", str2, jSONObject);
        if (str3 != null) {
            C1520640pfq.LJIILIIL("src", str3, jSONObject);
        }
        if (num != null) {
            C1520640pfq.LJIILIIL("playStatus", String.valueOf(num.intValue()), jSONObject);
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("eventName: ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", common: ");
            sbLIZ.append((String) null);
            sbLIZ.append(", category: ");
            sbLIZ.append(C786410Ut5.K3(4, jSONObject));
            C2188811AlT.LIZIZ(sbLIZ);
            C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
            String str4 = this.LIZ;
            c1520380pfQ.getClass();
            C1520380pfQ.LIZIZ("", str4, jSONObject, null, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2178901APg.LIZ("AUDIO_MONITOR_TAG", e.getMessage());
        }
        LIZ(jSONObject);
    }
}
