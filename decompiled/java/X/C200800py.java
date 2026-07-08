package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: X.00py, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C200800py {
    public static final void LIZ(Map<String, SortedSet<String>> map, Map<String, ? extends List<String>> map2) {
        for (Map.Entry<String, ? extends List<String>> entry : map2.entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                String key = entry.getKey();
                TreeSet treeSet = new TreeSet();
                C13LQ.LJJLIIIJL(treeSet, new String[0]);
                map.put(key, treeSet);
            }
            SortedSet sortedSet = (SortedSet) ((LinkedHashMap) map).get(entry.getKey());
            if (sortedSet != null) {
                sortedSet.addAll(entry.getValue());
            }
        }
    }
}
