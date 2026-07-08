package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465340oEe {
    public final C1634780sdw LIZ() {
        if (!C300230Bpl.LIZ()) {
            return null;
        }
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            C1634780sdw.LJII = null;
            return C1634780sdw.LJII;
        }
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        C1634780sdw c1634780sdw = C1634780sdw.LJII;
        if (c1634780sdw == null) {
            synchronized (this) {
                try {
                    c1634780sdw = C1634780sdw.LJII;
                    if (c1634780sdw == null) {
                        c1634780sdw = new C1634780sdw(currentUserID);
                        C1634780sdw.LJII = c1634780sdw;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1634780sdw;
    }
}
