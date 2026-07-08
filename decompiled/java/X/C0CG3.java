package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0CG3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CG3 {
    public static volatile C0CG3 LIZ;

    public static C0CG3 LIZ() {
        if (LIZ == null) {
            synchronized (C0CG3.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C0CG3();
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
