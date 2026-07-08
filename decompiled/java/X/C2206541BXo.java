package X;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.1BXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2206541BXo implements Iterable<C2206571BXr> {
    public final Map<String, Deque<C2206571BXr>> LL = new LinkedHashMap();
    public final LinkedHashSet<String> LLILLJJLI = new LinkedHashSet<>();

    @Override // java.lang.Iterable
    public final Iterator<C2206571BXr> iterator() {
        return new C2206561BXq(this);
    }

    public static String LIZJ(C2206571BXr c2206571BXr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c2206571BXr.LIZIZ);
        sbLIZ.append(":");
        sbLIZ.append(c2206571BXr.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJ(C2206571BXr c2206571BXr) {
        c2206571BXr.getClass();
        String strLIZJ = LIZJ(c2206571BXr);
        this.LLILLJJLI.add(strLIZJ);
        if (!this.LL.containsKey(strLIZJ)) {
            this.LL.put(strLIZJ, new ArrayDeque());
        }
        ((Deque) ((LinkedHashMap) this.LL).get(strLIZJ)).offerLast(c2206571BXr);
    }

    public final void LJFF(String str, Set<String> set) {
        Deque<C2206571BXr> deque;
        if (!set.isEmpty() && (deque = (Deque) ((LinkedHashMap) this.LL).get(str)) != null && !deque.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C2206571BXr c2206571BXr : deque) {
                if (set.contains(c2206571BXr.LJ)) {
                    arrayList.add(c2206571BXr);
                } else {
                    arrayList2.add(c2206571BXr);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            deque.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                deque.offerLast(it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                deque.offerLast(it3.next());
            }
        }
    }
}
