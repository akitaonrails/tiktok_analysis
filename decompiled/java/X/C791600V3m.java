package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0V3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791600V3m {
    public static volatile C791600V3m LIZIZ;
    public int LIZ;

    public static C791600V3m LIZ() {
        if (LIZIZ == null) {
            synchronized (C791600V3m.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C791600V3m();
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
