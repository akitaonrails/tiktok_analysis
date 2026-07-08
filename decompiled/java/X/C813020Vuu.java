package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813020Vuu extends AbstractC828060We4 {
    public static C813020Vuu LIZIZ;

    public static C813020Vuu LJIIL() {
        if (LIZIZ == null) {
            synchronized (C813020Vuu.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C813020Vuu();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    @Override // X.AbstractC828060We4
    public final void LJII() {
        this.LIZ = "default_config";
    }
}
