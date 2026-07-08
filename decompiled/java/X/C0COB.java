package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0COB, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0COB {
    public static volatile C0COB LIZIZ;
    public boolean LIZ;

    public static C0COB LIZ() {
        if (LIZIZ == null) {
            synchronized (C0COB.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0COB();
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
