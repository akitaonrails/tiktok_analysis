package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0kxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339690kxz {
    public static volatile C1339690kxz LIZIZ;
    public final boolean LIZ = true;

    public static C1339690kxz LIZ() {
        if (LIZIZ == null) {
            synchronized (C1339690kxz.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1339690kxz();
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
