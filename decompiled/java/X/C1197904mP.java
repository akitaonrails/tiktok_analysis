package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04mP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1197904mP {
    public static volatile Keva LIZ;

    public static Keva LIZ() {
        if (LIZ == null) {
            synchronized (C1197904mP.class) {
                try {
                    if (LIZ == null) {
                        LIZ = Keva.getRepo("live_storage");
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
