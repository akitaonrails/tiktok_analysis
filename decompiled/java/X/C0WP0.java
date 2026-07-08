package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.0WP0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WP0 {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile Set<String> LIZJ = new HashSet();

    public static boolean LIZJ() {
        String strLIZLLL = "";
        if (!LIZ) {
            try {
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                if (contextLIZ != null) {
                    strLIZLLL = C08Q0.LIZLLL(contextLIZ, "milo_schedule_task_exp", "");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (!strLIZLLL.isEmpty()) {
                LIZIZ = true;
                String[] strArrSplit = strLIZLLL.split(",");
                if (strArrSplit != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : strArrSplit) {
                        hashSet.add(str);
                    }
                    LIZJ = hashSet;
                }
            }
            LIZ = true;
        }
        return LIZIZ;
    }

    public static boolean LIZ(Runnable runnable) {
        C1BCE c1bceLIZIZ;
        if (!LIZJ() || (c1bceLIZIZ = C1BCB.LIZIZ(runnable.getClass(), "run")) == null || c1bceLIZIZ.LIZ <= 0) {
            return false;
        }
        return ((HashSet) LIZJ).contains(String.valueOf(c1bceLIZIZ.LIZ));
    }

    public static boolean LIZIZ(Callable<?> callable) {
        C1BCE c1bceLIZIZ;
        if (!LIZJ() || (c1bceLIZIZ = C1BCB.LIZIZ(callable.getClass(), "call")) == null || c1bceLIZIZ.LIZ <= 0) {
            return false;
        }
        return ((HashSet) LIZJ).contains(String.valueOf(c1bceLIZIZ.LIZ));
    }
}
