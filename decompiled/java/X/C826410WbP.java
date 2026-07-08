package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: renamed from: X.0WbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826410WbP {
    public static final C826410WbP LIZIZ = new C826410WbP();
    public final ConcurrentHashMap<String, ConcurrentLinkedDeque<C826400WbO>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(ConcurrentLinkedDeque concurrentLinkedDeque) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it2 = concurrentLinkedDeque.iterator();
        while (it2.hasNext()) {
            if (jCurrentTimeMillis - ((C826400WbO) it2.next()).LIZIZ > 30000) {
                it2.remove();
            }
        }
    }

    public final C826130Wax LIZIZ(String str) {
        ConcurrentLinkedDeque<C826400WbO> concurrentLinkedDeque = this.LIZ.get(str);
        if (concurrentLinkedDeque == null) {
            return null;
        }
        C826400WbO c826400WbOPollLast = concurrentLinkedDeque.pollLast();
        while (c826400WbOPollLast != null && System.currentTimeMillis() - c826400WbOPollLast.LIZIZ > 30000) {
            c826400WbOPollLast = concurrentLinkedDeque.pollLast();
        }
        if (concurrentLinkedDeque.isEmpty()) {
            this.LIZ.remove(str);
        }
        if (c826400WbOPollLast == null) {
            return null;
        }
        return c826400WbOPollLast.LIZ;
    }

    public final void LIZJ(String str, C826130Wax c826130Wax) {
        ConcurrentLinkedDeque<C826400WbO> concurrentLinkedDequePutIfAbsent;
        ConcurrentHashMap<String, ConcurrentLinkedDeque<C826400WbO>> concurrentHashMap = this.LIZ;
        ConcurrentLinkedDeque<C826400WbO> concurrentLinkedDeque = concurrentHashMap.get(str);
        if (concurrentLinkedDeque == null && (concurrentLinkedDequePutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentLinkedDeque = new ConcurrentLinkedDeque<>()))) != null) {
            concurrentLinkedDeque = concurrentLinkedDequePutIfAbsent;
        }
        concurrentLinkedDeque.addLast(new C826400WbO(c826130Wax, System.currentTimeMillis()));
        if (this.LIZ.size() > 100) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ConcurrentLinkedDeque<C826400WbO>> entry : this.LIZ.entrySet()) {
                String key = entry.getKey();
                ConcurrentLinkedDeque<C826400WbO> value = entry.getValue();
                LIZ(value);
                if (value.isEmpty()) {
                    arrayList.add(key);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.LIZ.remove(it2.next());
            }
        }
    }
}
