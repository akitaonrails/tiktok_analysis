package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Kk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2099608Kk implements Runnable {
    public static void LIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", C1937307iN.LIZ());
            jSONObject.put("period", C2099708Kl.LIZIZ);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("new", C2099708Kl.LIZ.get());
            C793770VBv.LJII("super_thread_count", jSONObject, jSONObject2, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i = C2099708Kl.LIZIZ;
        if (i <= 10) {
            C2099708Kl.LIZIZ = i + 1;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SuperThreadMonitor@4253.periodTask$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SuperThreadMonitor@4253.periodTask$1");
    }
}
