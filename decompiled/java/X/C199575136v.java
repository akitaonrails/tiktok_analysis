package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.136v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199575136v {
    public static final Map<Class<?>, List<C14EO>> LIZ = new ConcurrentHashMap();
    public static final C199574136u[] LIZIZ = new C199574136u[4];

    public static C199574136u LIZIZ() {
        synchronized (LIZIZ) {
            int i = 0;
            do {
                try {
                    C199574136u[] c199574136uArr = LIZIZ;
                    C199574136u c199574136u = c199574136uArr[i];
                    if (c199574136u != null) {
                        c199574136uArr[i] = null;
                        return c199574136u;
                    }
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } while (i < 4);
            return new C199574136u();
        }
    }

    public static List LIZ(C199574136u c199574136u) {
        ArrayList arrayList = new ArrayList(c199574136u.LIZ);
        ((ArrayList) c199574136u.LIZ).clear();
        ((HashMap) c199574136u.LIZIZ).clear();
        ((HashMap) c199574136u.LIZJ).clear();
        int i = 0;
        c199574136u.LIZLLL.setLength(0);
        c199574136u.LJ = null;
        c199574136u.LJFF = false;
        synchronized (LIZIZ) {
            while (true) {
                if (i >= 4) {
                    break;
                }
                try {
                    C199574136u[] c199574136uArr = LIZIZ;
                    if (c199574136uArr[i] == null) {
                        c199574136uArr[i] = c199574136u;
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
