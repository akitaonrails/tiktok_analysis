package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.05iB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1426505iB {
    public static C1426305i9 LIZ(String str, C1426705iD c1426705iD, C05WF c05wf) {
        C1426305i9 c1426305i9;
        Iterator<Map.Entry<String, WeakReference<C1426305i9>>> it2 = C1426305i9.LJ.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
        ConcurrentHashMap<String, WeakReference<C1426305i9>> concurrentHashMap = C1426305i9.LJ;
        WeakReference<C1426305i9> weakReference = concurrentHashMap.get(str);
        if (weakReference != null && (c1426305i9 = weakReference.get()) != null) {
            return c1426305i9;
        }
        C1426305i9 c1426305i92 = new C1426305i9(str, c1426705iD, c05wf);
        concurrentHashMap.put(str, new WeakReference<>(c1426305i92));
        return c1426305i92;
    }
}
