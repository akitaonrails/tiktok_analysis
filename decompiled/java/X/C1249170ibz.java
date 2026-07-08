package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ibz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249170ibz {
    public static C1249160iby LIZ() {
        if (C1249160iby.LIZJ == null || !Intrinsics.LJFF(C1249160iby.LIZIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            synchronized (C1249160iby.class) {
                try {
                    C1249160iby.LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    C1249160iby.LIZJ = new C1249160iby();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1249160iby.LIZJ;
    }
}
