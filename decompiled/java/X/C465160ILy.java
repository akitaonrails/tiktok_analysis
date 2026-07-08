package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ILy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465160ILy {
    public static volatile C465160ILy LIZ;

    public static C465160ILy LIZ() {
        if (LIZ == null) {
            synchronized (C465160ILy.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C465160ILy();
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
