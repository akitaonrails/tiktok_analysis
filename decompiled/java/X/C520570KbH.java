package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS193S0000000_7;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KbH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520570KbH {
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public String LIZ = "";
    public String LIZIZ = "";
    public final C01GW LJIIJJI = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(244));

    public final JSONObject LIZ() {
        return (JSONObject) this.LJIIJJI.getValue();
    }

    public final void LIZIZ() throws JSONException {
        Object c098200Yq;
        C20441214yg.LIZIZ("FetchMethodPerformance", C786410Ut5.J3(LIZ()));
        JSONObject jSONObject = new JSONObject();
        try {
            c098200Yq = UriProtector.parse(this.LIZ).buildUpon().clearQuery().build().getPath();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
            c098200Yq = "";
        }
        jSONObject.put("path", c098200Yq);
        jSONObject.put("usePiperData", this.LJIIIZ);
        jSONObject.put("threadDispatchOptimizationEnable", this.LJIIJ);
        jSONObject.put("engineType", this.LIZIZ);
        C1CC2.LJ("live_hybrid_fetch_performance_detail", jSONObject, LIZ(), new JSONObject());
    }

    public final void LIZJ() throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.LJIIIIZZ;
        long j2 = jCurrentTimeMillis - this.LIZJ;
        LIZ().put("callbackExecuteDuration", j);
        LIZ().put("totalDuration", j2);
    }
}
