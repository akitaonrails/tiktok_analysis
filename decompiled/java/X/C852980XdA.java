package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852980XdA {
    public static volatile C852980XdA LIZIZ;
    public static final Object LIZJ = new Object();
    public InterfaceC853000XdC LIZ;

    public static C852980XdA LIZ() {
        if (LIZIZ == null) {
            synchronized (C852980XdA.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C852980XdA();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(C852990XdB c852990XdB) {
        synchronized (LIZJ) {
            try {
                InterfaceC853000XdC interfaceC853000XdC = this.LIZ;
                if (interfaceC853000XdC != null) {
                    interfaceC853000XdC.onComplete(c852990XdB);
                    this.LIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
