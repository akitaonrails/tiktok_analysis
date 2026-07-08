package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VYT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYT {
    public static C0VYT LIZLLL;
    public final JSONObject LIZ = new JSONObject();
    public final long LIZIZ;
    public long LIZJ;

    public C0VYT() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.LIZIZ = jUptimeMillis;
        this.LIZJ = jUptimeMillis;
    }

    public static void LIZ(String str) {
        if (LIZLLL == null) {
            return;
        }
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            C0VYT c0vyt = LIZLLL;
            c0vyt.LIZ.put(str, jUptimeMillis - c0vyt.LIZJ);
            LIZLLL.LIZJ = jUptimeMillis;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
