package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oZK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478160oZK {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static final Object LIZJ = new Object();
    public static volatile InterfaceC1482870ogv LIZLLL = null;

    public static InterfaceC1482870ogv LIZ() {
        if (LIZLLL == null) {
            synchronized (LIZJ) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = C1475700oVM.LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }
}
