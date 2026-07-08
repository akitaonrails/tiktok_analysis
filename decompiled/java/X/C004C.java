package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.004C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C004C {
    public static volatile C004C LIZ;

    public static C004C LIZ() {
        if (LIZ == null) {
            synchronized (C004C.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C004C();
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
