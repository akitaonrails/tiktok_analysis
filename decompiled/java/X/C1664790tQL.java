package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0tQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664790tQL {
    public static <E> Set<E> LIZJ() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static int LIZIZ(Set<?> set) {
        int iHashCode;
        int i = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i = ~(~(i + iHashCode));
        }
        return i;
    }

    public static boolean LIZ(Object obj, Set set) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (ClassCastException | NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
