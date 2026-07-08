package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0P8R, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P8R {
    public final C0P8S LIZ() {
        C0P8S c0p8s = C0P8S.LJIL;
        if (c0p8s == null) {
            synchronized (this) {
                try {
                    c0p8s = C0P8S.LJIL;
                    if (c0p8s == null) {
                        c0p8s = new C0P8S();
                        C0P8S.LJIL = c0p8s;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c0p8s;
    }
}
