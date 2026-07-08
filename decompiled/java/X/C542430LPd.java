package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0LPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542430LPd {
    public static final boolean LIZ(C1346605Ou c1346605Ou) {
        Map<String, AbstractC1406905f1> map;
        Collection<AbstractC1406905f1> collectionValues;
        if (c1346605Ou == null || (map = c1346605Ou.LIZ) == null || (collectionValues = map.values()) == null || collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof C1406605ey) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZIZ(C1346605Ou c1346605Ou) {
        Collection<AbstractC1406905f1> collectionValues;
        Map<String, AbstractC1406905f1> map = c1346605Ou.LIZ;
        if (map != null && (collectionValues = map.values()) != null && !collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (it2.next() instanceof C1405905er) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZJ(C1346605Ou c1346605Ou) {
        Map<String, AbstractC1406905f1> map = c1346605Ou.LIZ;
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<String, AbstractC1406905f1>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            AbstractC1406905f1 value = it2.next().getValue();
            if (!(value instanceof C1406405ew) && !(value instanceof C1407105f3)) {
                return false;
            }
        }
        return true;
    }
}
