package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09aM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC2397209aM implements Runnable, Serializable {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    public /* synthetic */ RunnableC2397209aM(JSONObject jSONObject, boolean z, String str, String str2, String str3) {
        this.LL = jSONObject;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject = this.LL;
        boolean z = this.LLILLJJLI;
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        String str3 = this.LLILZIL;
        C1C7U.LIZ("TerminalMonitor@5bdf.$deserializeLambda$$2L");
        if (!z) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (str2 != null) {
            jSONObject.put("service", str2);
        }
        C793770VBv.LJ(str3, jSONObject);
        C1C7U.LIZIZ("TerminalMonitor@5bdf.$deserializeLambda$$2L");
    }
}
