package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0mAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386040mAk {
    public final C1386050mAl LIZ() {
        C1386050mAl c1386050mAl = C1386050mAl.LIZLLL;
        if (c1386050mAl == null) {
            synchronized (this) {
                try {
                    c1386050mAl = C1386050mAl.LIZLLL;
                    if (c1386050mAl == null) {
                        c1386050mAl = new C1386050mAl();
                        C1386050mAl.LIZLLL = c1386050mAl;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c1386050mAl;
    }
}
