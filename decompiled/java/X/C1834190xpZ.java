package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0xpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834190xpZ {
    public static volatile C1834190xpZ LIZIZ;
    public final C1519760peQ<InterfaceC1834200xpa> LIZ = new C1519760peQ<>();

    public static C1834190xpZ LIZ() {
        if (LIZIZ == null) {
            synchronized (C1834190xpZ.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1834190xpZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
