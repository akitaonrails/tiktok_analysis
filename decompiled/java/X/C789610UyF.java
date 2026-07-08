package X;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0UyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789610UyF {
    public static boolean LIZ(String str, Map map, Set set, Set set2) {
        HashSet hashSet = (HashSet) set;
        if (!hashSet.contains(str)) {
            hashSet.add(str);
            HashSet hashSet2 = (HashSet) set2;
            hashSet2.add(str);
            List<String> list = (List) map.get(str);
            if (list != null) {
                for (String str2 : list) {
                    if (!hashSet.contains(str2) && LIZ(str2, map, set, set2)) {
                        return true;
                    }
                    if (hashSet2.contains(str2)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("CycleDetector CIRCULAR-DEPENDENCY | task = ");
                        sbLIZ.append(str);
                        sbLIZ.append(", dependency = ");
                        sbLIZ.append(str2);
                        C1BXU.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        return true;
                    }
                }
            }
        }
        ((HashSet) set2).remove(str);
        return false;
    }
}
