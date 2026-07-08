package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VyB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815050VyB {
    public static volatile C815050VyB LIZJ;
    public final C815170VyN LIZ = new Object() { // from class: X.0VyN
    };
    public final Keva LIZIZ = Keva.getRepo("revoke_push_cache");

    public static C815050VyB LIZ() {
        if (LIZJ == null) {
            synchronized (C815050VyB.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C815050VyB();
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
