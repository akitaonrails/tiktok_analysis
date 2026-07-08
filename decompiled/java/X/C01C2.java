package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01C2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01C2 {
    public final Map<String, Set<String>> LIZ = new LinkedHashMap();
    public final Map<String, Set<String>> LIZIZ = new LinkedHashMap();
    public final Set<String> LIZJ = new LinkedHashSet();

    public final void LIZIZ(AbstractC1420120n3i abstractC1420120n3i) {
        this.LIZJ.add(abstractC1420120n3i.LIZ);
        Map<String, Set<String>> map = this.LIZ;
        String str = abstractC1420120n3i.LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(str) == null) {
            linkedHashMap.put(str, new LinkedHashSet());
        }
        Map<String, Set<String>> map2 = this.LIZIZ;
        String str2 = abstractC1420120n3i.LIZ;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
        if (linkedHashMap2.get(str2) == null) {
            linkedHashMap2.put(str2, new LinkedHashSet());
        }
    }

    public final void LIZ(String str, String str2) {
        if (this.LIZJ.contains(str) && this.LIZJ.contains(str2)) {
            if (!LIZLLL(str, new LinkedHashSet(), this, str2)) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZ;
                Object linkedHashSet = linkedHashMap.get(str);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    linkedHashMap.put(str, linkedHashSet);
                }
                ((Set) linkedHashSet).add(str2);
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.LIZIZ;
                Object linkedHashSet2 = linkedHashMap2.get(str2);
                if (linkedHashSet2 == null) {
                    linkedHashSet2 = new LinkedHashSet();
                    linkedHashMap2.put(str2, linkedHashSet2);
                }
                ((Set) linkedHashSet2).add(str);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Adding dependency would create a cycle: ");
            sbLIZ.append(str);
            sbLIZ.append(" -> ");
            sbLIZ.append(str2);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Task not found: ");
        sbLIZ2.append(str);
        sbLIZ2.append(" or ");
        sbLIZ2.append(str2);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static final boolean LIZLLL(String str, Set<String> set, C01C2 c01c2, String str2) {
        if (Intrinsics.LJFF(str2, str)) {
            return true;
        }
        if (set.contains(str2)) {
            return false;
        }
        set.add(str2);
        Set set2 = (Set) ((LinkedHashMap) c01c2.LIZ).get(str2);
        if (set2 == null) {
            return false;
        }
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            if (LIZLLL(str, set, c01c2, (String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static final void LIZJ(Set<String> set, Set<String> set2, Set<String> set3, C01C2 c01c2, List<String> list, String str) {
        if (!set.contains(str)) {
            if (!set2.contains(str) && set3.contains(str)) {
                set.add(str);
                Set set4 = (Set) ((LinkedHashMap) c01c2.LIZ).get(str);
                if (set4 != null) {
                    Iterator it2 = set4.iterator();
                    while (it2.hasNext()) {
                        LIZJ(set, set2, set3, c01c2, list, (String) it2.next());
                    }
                }
                set.remove(str);
                set2.add(str);
                ((ArrayList) list).add(str);
                return;
            }
            return;
        }
        throw new IllegalStateException("Cycle detected in dependency graph");
    }
}
