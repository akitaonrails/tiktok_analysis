package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0rU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590270rU9 {
    public static volatile C1590270rU9 LIZJ;
    public InterfaceC1590340rUG LIZ;
    public String LIZIZ;

    public static C1590270rU9 LIZ() {
        if (LIZJ == null) {
            synchronized (C1590270rU9.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1590270rU9();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }
}
