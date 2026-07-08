package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0fPB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125910fPB {
    public static boolean LIZ(C1125830fP3 c1125830fP3) {
        HashMap<Integer, C1125860fP6> map;
        if (c1125830fP3 != null && (map = c1125830fP3.LIZLLL) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, C1125860fP6> entry : map.entrySet()) {
                if (entry.getKey().intValue() == 1) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Collection<C1125860fP6> collectionValues = linkedHashMap.values();
            if (collectionValues != null && !collectionValues.isEmpty()) {
                for (C1125860fP6 c1125860fP6 : collectionValues) {
                    if (c1125860fP6.LIZ > 0 && c1125860fP6.LIZIZ > C158B.LIZJ()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
