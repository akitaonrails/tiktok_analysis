package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468480oJi {
    public static final C1468500oJk LIZ = new C1468500oJk();

    public static boolean LIZ() {
        boolean z;
        synchronized (C1468480oJi.class) {
            try {
                z = LIZ.LIZ > 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }
}
