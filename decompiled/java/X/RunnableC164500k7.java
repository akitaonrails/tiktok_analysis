package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00k7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC164500k7 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("BattleHealthBarV2@f358.dismissPreviewRunnable$1");
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
            C1C7U.LIZIZ("BattleHealthBarV2@f358.dismissPreviewRunnable$1");
        }
    }
}
