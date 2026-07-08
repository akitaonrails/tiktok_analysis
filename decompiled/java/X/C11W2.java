package X;

import Y.AComparatorS48S0000000_29;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: X.11W2, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11W2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Map map, int i, EnumC19360910op enumC19360910op) {
        AComparatorS48S0000000_29 aComparatorS48S0000000_29;
        InterfaceC19362510p5 interfaceC19362510p5;
        InterfaceC19362510p5 interfaceC19362510p52;
        if (enumC19360910op.isAscending()) {
            aComparatorS48S0000000_29 = new AComparatorS48S0000000_29(8);
        } else {
            aComparatorS48S0000000_29 = new AComparatorS48S0000000_29(7);
        }
        PriorityQueue<Map.Entry> priorityQueue = new PriorityQueue(i, aComparatorS48S0000000_29);
        for (Map.Entry entry : map.entrySet()) {
            if (priorityQueue.size() < i) {
                priorityQueue.offer(entry);
            } else {
                long jLIZ = 0;
                if (enumC19360910op.isAscending()) {
                    long jLIZ2 = ((InterfaceC19362510p5) entry.getValue()).LIZ();
                    Map.Entry entry2 = (Map.Entry) priorityQueue.peek();
                    if (entry2 != null && (interfaceC19362510p5 = (InterfaceC19362510p5) entry2.getValue()) != null) {
                        jLIZ = interfaceC19362510p5.LIZ();
                    }
                    if (jLIZ2 < jLIZ) {
                        priorityQueue.poll();
                        priorityQueue.offer(entry);
                    }
                } else if (enumC19360910op.isDescending()) {
                    long jLIZ3 = ((InterfaceC19362510p5) entry.getValue()).LIZ();
                    Map.Entry entry3 = (Map.Entry) priorityQueue.peek();
                    if (entry3 != null && (interfaceC19362510p52 = (InterfaceC19362510p5) entry3.getValue()) != null) {
                        jLIZ = interfaceC19362510p52.LIZ();
                    }
                    if (jLIZ3 > jLIZ) {
                        priorityQueue.poll();
                        priorityQueue.offer(entry);
                    }
                }
            }
        }
        HashMap map2 = new HashMap(i);
        for (Map.Entry entry4 : priorityQueue) {
            map2.put(entry4.getKey(), entry4.getValue());
        }
        map.clear();
        map.putAll(map2);
    }
}
