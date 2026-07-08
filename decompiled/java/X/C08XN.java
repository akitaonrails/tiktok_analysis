package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08XN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08XN {
    public static volatile C08XN LIZJ;
    public int LIZ = 0;
    public Throwable LIZIZ = null;

    public static C08XN LIZ() {
        if (LIZJ == null) {
            synchronized (C08XN.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C08XN();
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
