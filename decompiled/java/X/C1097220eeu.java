package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eeu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097220eeu {
    public final long LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Function1<C1097250eex, Unit> LIZLLL;
    public final CopyOnWriteArrayList<C1097230eev> LJ = new CopyOnWriteArrayList<>();

    public final void LIZ(String str) {
        this.LJ.add(new C1097230eev(str, System.currentTimeMillis()));
        if (this.LJ.size() > this.LIZIZ) {
            if (this.LJ.size() >= this.LIZIZ) {
                C1097230eev c1097230eev = this.LJ.get(0);
                CopyOnWriteArrayList<C1097230eev> copyOnWriteArrayList = this.LJ;
                long j = copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).LIZIZ - c1097230eev.LIZIZ;
                if (j <= this.LIZ) {
                    int size = this.LJ.size();
                    CopyOnWriteArrayList<C1097230eev> copyOnWriteArrayList2 = this.LJ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C1097230eev c1097230eev2 : copyOnWriteArrayList2) {
                        String str2 = c1097230eev2.LIZ;
                        Object arrayList = linkedHashMap.get(str2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(str2, arrayList);
                        }
                        ((List) arrayList).add(c1097230eev2);
                    }
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        arrayList2.add(new Pair(entry.getKey(), Integer.valueOf(((List) entry.getValue()).size())));
                    }
                    this.LIZLLL.invoke(new C1097250eex(size, j, C13LP.LL(C13LP.LJLLLL(new Comparator() { // from class: X.00tf
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return C20085613iQ.LIZIZ((Integer) ((Pair) t2).getSecond(), (Integer) ((Pair) t).getSecond());
                        }
                    }, arrayList2), this.LIZJ)));
                    this.LJ.clear();
                }
            }
            if (this.LJ.size() > 0) {
                this.LJ.remove(0);
            }
        }
    }

    public C1097220eeu(int i, int i2, long j, Function1 function1) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = function1;
    }
}
