package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0ooO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487500ooO {
    public static List LIZ(int i) {
        int size;
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = C1487510ooP.LIZJ;
        if (i < copyOnWriteArrayList.size()) {
            size = copyOnWriteArrayList.size() - i;
        } else {
            size = 0;
        }
        Iterator<String> it2 = copyOnWriteArrayList.subList(size, copyOnWriteArrayList.size()).iterator();
        while (it2.hasNext()) {
            C1487510ooP c1487510ooP = C1487510ooP.LIZIZ.get(it2.next());
            if (c1487510ooP != null) {
                arrayList.add(c1487510ooP);
            }
        }
        return arrayList;
    }

    public static void LIZIZ(String str) {
        ConcurrentHashMap<String, C1487510ooP> concurrentHashMap = C1487510ooP.LIZIZ;
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        concurrentHashMap.put(str, new C1487510ooP(C1487510ooP.LIZLLL));
        C1487510ooP.LIZJ.add(str);
        C1487510ooP.LJ++;
        C1487510ooP.LIZLLL++;
        if (C1487510ooP.LJ >= 24) {
            int i = (C1487510ooP.LIZLLL - 24) + 8;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, C1487510ooP> entry : concurrentHashMap.entrySet()) {
                if (entry.getValue().LIZ < i) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setLLIIJI = C13LP.LLIIJI(linkedHashMap.keySet());
            C1487510ooP.LIZIZ.keySet().removeAll(setLLIIJI);
            C1487510ooP.LIZJ.removeAll(setLLIIJI);
            C1487510ooP.LJ -= setLLIIJI.size();
        }
    }
}
