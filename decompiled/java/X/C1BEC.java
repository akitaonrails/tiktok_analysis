package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BEC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEC extends C1BEE {
    public static volatile C1BEC LIZ;

    public static C1BEC LIZIZ() {
        if (LIZ == null) {
            synchronized (C1BEC.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1BEC();
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
