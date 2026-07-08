package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823080WQo {
    public static boolean LIZ() {
        C0WTW c0wtw = C0WTW.LIZ;
        try {
            if (C0WTW.LIZJ) {
                C0WTW.LIZ.getClass();
                if (C0WTW.LJIIIZ().optLivePageCheck) {
                    return C0WTW.LIZLLL;
                }
            }
            return C0WTW.LIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
