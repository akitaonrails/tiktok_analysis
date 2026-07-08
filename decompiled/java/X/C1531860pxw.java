package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pxw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531860pxw {
    public static final /* synthetic */ int LIZLLL = 0;
    public LinkedHashMap<String, String> LIZ;
    public final Set<String> LIZIZ;
    public HashSet<String> LIZJ;

    public final boolean LIZ(String str) {
        Set<String> set = this.LIZIZ;
        if (set != null && set.contains(str)) {
            return true;
        }
        HashSet<String> hashSet = this.LIZJ;
        if (hashSet != null && hashSet.contains(str)) {
            return true;
        }
        return false;
    }

    public C1531860pxw(LinkedHashMap<String, String> linkedHashMap, Set<String> set) {
        this.LIZ = linkedHashMap;
        this.LIZIZ = set;
    }

    public static final boolean LJ(C1531860pxw c1531860pxw, C1531860pxw c1531860pxw2) {
        Set<String> set = c1531860pxw.LIZIZ;
        HashSet<String> hashSet = c1531860pxw.LIZJ;
        Set<String> set2 = c1531860pxw2.LIZIZ;
        HashSet<String> hashSet2 = c1531860pxw2.LIZJ;
        for (Map.Entry<String, String> entry : c1531860pxw.LIZ.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (set == null || !set.contains(key)) {
                if (hashSet == null || !hashSet.contains(key)) {
                    if (set2 != null && set2.contains(key)) {
                        return false;
                    }
                    if ((hashSet2 != null && hashSet2.contains(key)) || !Intrinsics.LJFF(c1531860pxw2.LIZ.get(key), value)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean LIZIZ(C1531860pxw c1531860pxw, boolean z) {
        if (c1531860pxw == this) {
            return true;
        }
        if (c1531860pxw == null) {
            if (!z) {
                return true;
            }
            Iterator<Map.Entry<String, String>> it2 = this.LIZ.entrySet().iterator();
            while (it2.hasNext()) {
                if (!LIZ(it2.next().getKey())) {
                    return false;
                }
            }
            return true;
        }
        Set<String> set = this.LIZIZ;
        HashSet<String> hashSet = this.LIZJ;
        Set<String> set2 = c1531860pxw.LIZIZ;
        HashSet<String> hashSet2 = c1531860pxw.LIZJ;
        if (!z) {
            if (LJ(this, c1531860pxw) || LJ(c1531860pxw, this)) {
                return true;
            }
            return false;
        }
        for (Map.Entry<String, String> entry : this.LIZ.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!LIZLLL(set, hashSet, key) && !LIZJ(set2, hashSet2, key) && !Intrinsics.LJFF(c1531860pxw.LIZ.get(key), value)) {
                return false;
            }
        }
        for (Map.Entry<String, String> entry2 : c1531860pxw.LIZ.entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            if (!LIZJ(set2, hashSet2, key2) && !LIZLLL(set, hashSet, key2) && !Intrinsics.LJFF(this.LIZ.get(key2), value2)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZJ(Set<String> set, HashSet<String> hashSet, String str) {
        if (set != null && set.contains(str)) {
            return true;
        }
        if (hashSet != null && hashSet.contains(str)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(Set<String> set, HashSet<String> hashSet, String str) {
        if (set != null && set.contains(str)) {
            return true;
        }
        if (hashSet != null && hashSet.contains(str)) {
            return true;
        }
        return false;
    }
}
