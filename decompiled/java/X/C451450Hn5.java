package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Hn5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451450Hn5 {
    public static C451440Hn4 LIZ() {
        if (C451440Hn4.LIZ == null) {
            synchronized (C451440Hn4.class) {
                try {
                    if (C451440Hn4.LIZ == null) {
                        C451440Hn4.LIZ = new C451440Hn4();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C451440Hn4.LIZ;
    }
}
