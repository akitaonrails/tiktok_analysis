package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212441BiU {
    public static volatile C2212441BiU LIZLLL;
    public volatile long LIZ;
    public volatile boolean LIZIZ = true;
    public volatile long LIZJ;

    public static C2212441BiU LIZ() {
        if (LIZLLL == null) {
            synchronized (C2212441BiU.class) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C2212441BiU();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration_ad_show_total_time", jCurrentTimeMillis);
            C2212291BiF.LIZLLL().LJI("service_splash_ad_show_time", jSONObject, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
