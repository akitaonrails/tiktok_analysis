package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00o2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C188800o2 {
    public static final <T> void LIZIZ(Collection<T> collection, Function1<? super T, Boolean> function1) {
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (function1.invoke(it2.next()).booleanValue()) {
                it2.remove();
            }
        }
    }

    public static final void LIZ(String str, Map map, Set set) {
        HashMap map2 = (HashMap) map;
        if (map2.get(str) == null) {
            map2.put(str, new LinkedHashSet());
        }
        Set set2 = (Set) map2.get(str);
        if (set2 != null) {
            set2.addAll(set);
        }
    }
}
