package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0ird, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258870ird {
    public static C1258870ird LIZJ;
    public final Set<String> LIZ;
    public boolean LIZIZ;

    public static C1258870ird LIZ() {
        if (LIZJ == null) {
            synchronized (C1258870ird.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1258870ird();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public C1258870ird() {
        new HashSet();
        this.LIZ = new HashSet();
        this.LIZIZ = false;
    }
}
