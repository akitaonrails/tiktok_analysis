package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0xsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836300xsy {
    public static volatile C1836300xsy LIZIZ;
    public final C1519760peQ<InterfaceC1836350xt3> LIZ = new C1519760peQ<>();

    public static C1836300xsy LIZ() {
        if (LIZIZ == null) {
            synchronized (C1836300xsy.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1836300xsy();
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
