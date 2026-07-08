package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.057I, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C057I implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("AdLightWebPageAssem@2487.releaseRunnable$1");
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
            C1C7U.LIZIZ("AdLightWebPageAssem@2487.releaseRunnable$1");
        }
    }
}
