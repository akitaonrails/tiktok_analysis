package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0mXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400380mXs {
    public static C1400380mXs LIZJ;
    public boolean LIZ = true;
    public boolean LIZIZ = true;

    public static C1400380mXs LIZ() {
        if (LIZJ == null) {
            synchronized (C1400380mXs.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1400380mXs();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }
}
