package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1339000kws {
    public static volatile C1339000kws LIZ;

    public final synchronized void LIZIZ() {
    }

    public final synchronized void LIZJ() {
    }

    public static C1339000kws LIZ() {
        if (LIZ == null) {
            synchronized (C1339000kws.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1339000kws();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
