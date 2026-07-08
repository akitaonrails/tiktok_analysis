package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08wt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2282108wt implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("PageSession$Companion@9252.reportInLocalTest$1$1$1");
        try {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "The page is blocked by roma!", null, "RomaSDK", 2);
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
            C1C7U.LIZIZ("PageSession$Companion@9252.reportInLocalTest$1$1$1");
        }
    }
}
