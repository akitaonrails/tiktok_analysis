package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08VL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08VL {
    public static final C08VL LIZ = new C08VL();
    public static C14BQ LIZIZ;

    public static final C08VO LIZ() {
        C14BQ c14bq = LIZIZ;
        if (c14bq == null) {
            synchronized (LIZ) {
                try {
                    c14bq = LIZIZ;
                    if (c14bq == null) {
                        c14bq = new C14BQ(0);
                        LIZIZ = c14bq;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c14bq;
    }
}
