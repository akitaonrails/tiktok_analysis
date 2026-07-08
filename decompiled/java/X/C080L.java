package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.080L, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080L implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ double LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    public C080L(double d, String str, String str2, String str3, String str4, String str5) {
        this.LL = str;
        this.LLILLJJLI = d;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
    }

    public final void LIZ() {
        Object c098200Yq;
        String str = this.LL;
        double d = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        String str5 = this.LLILZLL;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stage", str);
            jSONObject.put("sample_rate", d);
            jSONObject.put("timing_key", str2);
            jSONObject.put("outreach_type", str3);
            jSONObject.put("outreach_key", str4);
            jSONObject.put("extra", str5);
            C20684815ws.LJIJ("outreach_pipeline", jSONObject);
            C080G.LIZIZ("outreach_pipeline", jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str6 = this.LL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20571615ec.LIZ.getClass();
            C20571615ec.LIZIZ("OutreachPipelineTracker reportFrameworkStage error, stage=" + str6 + ", error=" + thM5exceptionOrNullimpl);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("OutreachPipelineTracker@32ff.reportFrameworkStage$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OutreachPipelineTracker@32ff.reportFrameworkStage$1");
    }
}
