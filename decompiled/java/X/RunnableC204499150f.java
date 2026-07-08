package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/* JADX INFO: renamed from: X.150f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class RunnableC204499150f implements Runnable {
    public final /* synthetic */ C204500150g LL;

    @Override // java.lang.Runnable
    public final void run() {
        C204500150g c204500150g = this.LL;
        c204500150g.getClass();
        C1C7U.LIZ("PageStorage$Storage@519c.clearIfNeed$1L");
        if (!c204500150g.LIZLLL.compareAndSet(false, true)) {
            C1C7U.LIZIZ("PageStorage$Storage@519c.clearIfNeed$1L");
            return;
        }
        Set<Map.Entry<String, ?>> setEntrySet = c204500150g.LIZIZ.getAll().entrySet();
        int i = (int) (((double) c204500150g.LIZJ) * 0.25d);
        PriorityQueue<Map.Entry> priorityQueue = new PriorityQueue(i, new Comparator() { // from class: X.07hx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return (int) (((Long) ((Map.Entry) obj2).getValue()).longValue() - ((Long) ((Map.Entry) obj).getValue()).longValue());
            }
        });
        C20320914fH c20320914fH = new C20320914fH();
        Iterator<Map.Entry<String, ?>> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            c20320914fH.LL = it2.next();
            if (priorityQueue.size() < i) {
                priorityQueue.offer(c20320914fH);
            } else {
                Map.Entry entry = (Map.Entry) priorityQueue.peek();
                if (entry != null && ((Long) entry.getValue()).longValue() > c20320914fH.getValue().longValue()) {
                    priorityQueue.poll();
                    priorityQueue.offer(c20320914fH);
                }
            }
        }
        for (Map.Entry entry2 : priorityQueue) {
            c204500150g.LIZ.erase((String) entry2.getKey());
            c204500150g.LIZIZ.erase((String) entry2.getKey());
        }
        c204500150g.LIZLLL.set(false);
        C1C7U.LIZIZ("PageStorage$Storage@519c.clearIfNeed$1L");
    }
}
