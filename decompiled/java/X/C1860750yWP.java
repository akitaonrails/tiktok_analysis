package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0yWP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860750yWP {
    public static final Object LIZ = new Object();
    public static final LinkedHashMap<String, C1860790yWT> LIZIZ = new LinkedHashMap<>();
    public static final LinkedHashSet<String> LIZJ = new LinkedHashSet<>();

    public static boolean LIZ(String str) {
        boolean zContains;
        synchronized (LIZ) {
            try {
                zContains = LIZJ.contains(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zContains;
    }

    public static void LIZIZ(String str) {
        synchronized (LIZ) {
            try {
                LinkedHashSet<String> linkedHashSet = LIZJ;
                if (linkedHashSet.add(str) && linkedHashSet.size() > 100) {
                    Iterator<String> it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static C1860790yWT LIZJ(String str) {
        synchronized (LIZ) {
            try {
                if (LIZJ.contains(str)) {
                    LIZIZ.remove(str);
                    return null;
                }
                return LIZIZ.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
