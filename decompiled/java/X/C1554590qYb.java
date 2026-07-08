package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0qYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554590qYb {
    public static volatile C1554590qYb LIZ;

    public static C1554590qYb LIZ() {
        if (LIZ == null) {
            synchronized (C1554590qYb.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1554590qYb();
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
