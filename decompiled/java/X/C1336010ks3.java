package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ks3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336010ks3 {
    public static volatile C1336020ks4 LIZ = null;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0ks4] */
    public static InterfaceC1336040ks6 LIZ() {
        if (LIZ == null) {
            synchronized (C1336010ks3.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new InterfaceC1336040ks6() { // from class: X.0ks4
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static void LIZIZ() {
        if (((Number) C292000BcU.LIZ.getValue()).intValue() <= 0) {
            LIZ().getClass();
        }
    }
}
