package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.012e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2686012e {
    public static final <T, R> void LIZ(ConcurrentHashMap<T, List<R>> concurrentHashMap, T t, List<? extends R> list) {
        if (t != null) {
            List<R> list2 = concurrentHashMap.get(t);
            if (list2 != null) {
                list2.addAll(list);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            concurrentHashMap.put(t, arrayList);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final <T, R> void LIZIZ(ConcurrentHashMap<T, CopyOnWriteArrayList<R>> concurrentHashMap, T t, R r) {
        if (t != null) {
            CopyOnWriteArrayList<R> copyOnWriteArrayList = concurrentHashMap.get(t);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.add(r);
                return;
            }
            CopyOnWriteArrayList<R> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            copyOnWriteArrayList2.add(r);
            concurrentHashMap.put(t, copyOnWriteArrayList2);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
