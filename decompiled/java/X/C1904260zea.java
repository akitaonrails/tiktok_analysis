package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0zea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904260zea {
    public static C1904260zea LJ;
    public final HashMap<Long, Integer> LIZ = new HashMap<>();
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public String LIZLLL = null;

    public static C1904260zea LIZ() {
        if (LJ == null) {
            synchronized (C1904260zea.class) {
                try {
                    if (LJ == null) {
                        LJ = new C1904260zea();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }
}
