package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B8O, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B8O {
    public static C1B8Q LIZ() {
        if (C1B8Q.LIZIZ == null) {
            synchronized (C1B8Q.class) {
                try {
                    if (C1B8Q.LIZIZ == null) {
                        C1B8Q.LIZIZ = new C1B8Q();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1B8Q.LIZIZ;
    }
}
