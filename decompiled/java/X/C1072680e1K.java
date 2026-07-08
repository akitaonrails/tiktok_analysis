package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e1K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072680e1K {
    public static C1072670e1J LIZ() {
        if (C1072670e1J.LIZJ == null || !Intrinsics.LJFF(C1072670e1J.LIZIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            synchronized (C1072670e1J.class) {
                try {
                    C1072670e1J.LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    C1072670e1J.LIZJ = new C1072670e1J();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1072670e1J.LIZJ;
    }
}
