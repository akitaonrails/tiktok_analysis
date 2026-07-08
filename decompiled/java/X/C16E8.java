package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.16E8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16E8 {
    public static final Object LIZ = new Object();
    public static volatile C16E8 LIZIZ;

    public static void LIZ() {
        synchronized (LIZ) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C16E8() {
        if (LIZIZ != null) {
            throw new RuntimeException("Illegal access.");
        }
    }
}
