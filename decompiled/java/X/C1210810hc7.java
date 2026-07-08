package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210810hc7 {
    public static C1210800hc6 LIZ() {
        if (C1210800hc6.LIZJ == null || !Intrinsics.LJFF(C1210800hc6.LIZIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            synchronized (C1210800hc6.class) {
                try {
                    C1210800hc6.LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    C1210800hc6.LIZJ = new C1210800hc6();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1210800hc6.LIZJ;
    }
}
