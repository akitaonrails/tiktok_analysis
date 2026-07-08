package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570710MZx {
    public final C20184413yM LIZ() {
        C20184413yM c20184413yM = C20184413yM.LJFF;
        if (c20184413yM == null) {
            synchronized (this) {
                try {
                    c20184413yM = C20184413yM.LJFF;
                    if (c20184413yM == null) {
                        c20184413yM = new C20184413yM();
                        C20184413yM.LJFF = c20184413yM;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c20184413yM;
    }
}
