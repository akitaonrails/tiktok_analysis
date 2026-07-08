package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072880e1e {
    public static C1072890e1f LIZ() {
        if (C1072890e1f.LIZJ == null || !Intrinsics.LJFF(C1072890e1f.LIZIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            synchronized (C1072890e1f.class) {
                try {
                    C1072890e1f.LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    C1072890e1f.LIZJ = new C1072890e1f();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1072890e1f.LIZJ;
    }
}
