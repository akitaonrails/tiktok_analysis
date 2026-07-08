package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0prk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528020prk {
    public static C1528020prk LIZ;

    public static C1528020prk LIZ() {
        if (LIZ == null) {
            synchronized (C1528020prk.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1528020prk();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
