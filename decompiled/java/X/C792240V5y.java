package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792240V5y {
    public static volatile C792240V5y LIZIZ;
    public final C792230V5x<JSONObject> LIZ = new C792230V5x<>();

    public static C792240V5y LIZ() {
        if (LIZIZ == null) {
            synchronized (C792240V5y.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C792240V5y();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
