package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BEB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEB extends C1BEE {
    public static volatile C1BEB LIZ;

    public static C1BEB LIZIZ() {
        if (LIZ == null) {
            synchronized (C1BEB.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1BEB();
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
