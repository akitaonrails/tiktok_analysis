package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439910HMv {
    public static C439920HMw LIZ() {
        if (C439920HMw.LIZIZ == null) {
            synchronized (C439920HMw.class) {
                try {
                    if (C439920HMw.LIZIZ == null) {
                        C439920HMw.LIZIZ = new C439920HMw();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C439920HMw.LIZIZ;
    }
}
