package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.07mG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1961407mG {
    public final Map LIZ;

    public final Map LIZ(Collection collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        for (Object obj : this.LIZ.keySet()) {
            if (!this.LIZ.containsKey(obj)) {
                setUnmodifiableSet = Collections.emptySet();
            } else {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) this.LIZ.get(obj)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add(entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            }
            map.put(obj, setUnmodifiableSet);
        }
        return map;
    }
}
