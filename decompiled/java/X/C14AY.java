package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.14AY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14AY {
    public static volatile C14AY LIZ;

    public static C14AY LIZ() {
        if (LIZ == null) {
            synchronized (C14AY.class) {
                try {
                    LIZ = new C14AY();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public C14AY() {
        new Object() { // from class: X.14Ab
        };
    }
}
