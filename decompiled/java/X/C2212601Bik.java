package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Bik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212601Bik {
    public static volatile C2212601Bik LIZJ;
    public volatile C2212201Bi6 LIZ;
    public long LIZIZ;

    public static C2212601Bik LIZ() {
        if (LIZJ == null) {
            synchronized (C2212601Bik.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C2212601Bik();
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
