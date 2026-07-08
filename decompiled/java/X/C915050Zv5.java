package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Zv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915050Zv5 {
    public final C953760avW LIZ() {
        C953760avW c953760avW = C953760avW.LIZJ;
        if (c953760avW == null) {
            synchronized (this) {
                try {
                    c953760avW = C953760avW.LIZJ;
                    if (c953760avW == null) {
                        c953760avW = new C953760avW();
                        c953760avW.LJIIJ();
                        C953760avW.LIZJ = c953760avW;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c953760avW;
    }
}
