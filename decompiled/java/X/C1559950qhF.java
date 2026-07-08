package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qhF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559950qhF {
    public static C1559960qhG LIZ() {
        if (C1559960qhG.LIZLLL == null || !Intrinsics.LJFF(C1559960qhG.LIZJ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            synchronized (C1559960qhG.class) {
                try {
                    C1559960qhG.LIZJ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    C1559960qhG.LIZLLL = new C1559960qhG();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1559960qhG c1559960qhG = C1559960qhG.LIZLLL;
        if (c1559960qhG != null) {
            return c1559960qhG;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
