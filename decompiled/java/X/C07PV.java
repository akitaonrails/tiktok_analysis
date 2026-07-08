package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.07PV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07PV {
    public static C07PV LIZIZ;
    public List<Object> LIZ;

    public static C07PV LIZ() {
        if (LIZIZ == null) {
            synchronized (C07PV.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C07PV();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public C07PV() {
        new C08HY(16, 16);
        new Object() { // from class: X.07PU
            public final List<String> LIZ = new ArrayList();
            public final List<String> LIZIZ = new ArrayList();
            public final List<String> LIZJ = new ArrayList();
        };
    }
}
