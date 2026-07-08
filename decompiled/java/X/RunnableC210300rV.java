package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00rV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC210300rV implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("NoticeCountTabBadgePresentManager@eea3.delayShowTabBadge$callback$1");
        try {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("NCTBPManager", "delayShowTabBadge is remove");
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
            C1C7U.LIZIZ("NoticeCountTabBadgePresentManager@eea3.delayShowTabBadge$callback$1");
        }
    }
}
