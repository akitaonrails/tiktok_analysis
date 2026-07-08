package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0R6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690440R6k {
    public static C1576740r8K LIZ() {
        if (C1576740r8K.LJIIIIZZ == null) {
            synchronized (C1576740r8K.class) {
                try {
                    if (C1576740r8K.LJIIIIZZ == null) {
                        C1576740r8K.LJIIIIZZ = new C1576740r8K();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C1576740r8K.LJIIIIZZ;
    }
}
