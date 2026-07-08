package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XAU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XAU {
    public static final void LIZ(Runnable runnable) {
        try {
            C0XAB c0xabLIZ = C0XAA.LIZ();
            if (c0xabLIZ != null && c0xabLIZ.LIZ) {
                runnable.run();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
