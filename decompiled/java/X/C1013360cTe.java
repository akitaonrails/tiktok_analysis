package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013360cTe implements InterfaceC1010530cP5 {
    public final InterfaceC1013400cTi LL;
    public final List<C1013120cTG> LLILLJJLI = Collections.singletonList(C1013120cTG.LIZIZ);
    public final Map<Integer, Integer> LLILLL;
    public int LLILZ;
    public List<AbstractC1013010cT5> LLILZIL;
    public int LLILZLL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C1013360cTe(C1013370cTf c1013370cTf) {
        this.LL = c1013370cTf;
        List<C1013410cTj> list = c1013370cTf.LIZIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        Iterator<C1013410cTj> it2 = list.iterator();
        while (it2.hasNext()) {
            Pair pair = new Pair(Integer.valueOf(it2.next().LIZ), 1);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.LLILLL = new LinkedHashMap(linkedHashMap);
        this.LLILZIL = new ArrayList();
        this.LLILZLL = 1;
    }

    public final void LIZ(int i, int i2) {
        int iIntValue;
        Integer num;
        int iIntValue2;
        List<C1013410cTj> stats = this.LL.getStats();
        ArrayList arrayList = new ArrayList();
        for (C1013410cTj c1013410cTj : stats) {
            if (c1013410cTj.LIZ < i) {
                arrayList.add(c1013410cTj);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            Integer num2 = ((C1013410cTj) it2.next()).LIZIZ;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            i3 += iIntValue2;
        }
        this.LLILZ = i3 + i2;
        C1022620cia.LIZ("MultiContentProgressManager", "updatePlaybackPosition: currentIndex is " + i + ", currentTime: " + this.LLILZ);
        C1013410cTj c1013410cTj2 = (C1013410cTj) C13LP.LJJJLZIJ(i, this.LL.getStats());
        if (c1013410cTj2 != null && c1013410cTj2.LIZLLL) {
            return;
        }
        List<AbstractC1013010cT5> list = this.LLILZIL;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (i2 >= ((AbstractC1013010cT5) obj).LIZ) {
                arrayList2.add(obj);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (Intrinsics.LJFF(it3.next(), C1013120cTG.LIZIZ)) {
                C1013550cTx c1013550cTxYc = this.LL.yc();
                Integer num3 = (Integer) ((LinkedHashMap) this.LLILLL).get(Integer.valueOf(i));
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer numValueOf = Integer.valueOf(iIntValue);
                C1013410cTj c1013410cTj3 = (C1013410cTj) C13LP.LJJJLZIJ(i, this.LL.getStats());
                String str = null;
                if (c1013410cTj3 != null) {
                    num = c1013410cTj3.LIZIZ;
                } else {
                    num = null;
                }
                C1013410cTj c1013410cTj4 = (C1013410cTj) C13LP.LJJJLZIJ(i, this.LL.getStats());
                if (c1013410cTj4 != null) {
                    str = c1013410cTj4.LIZJ;
                }
                c1013550cTxYc.LIZLLL(i, numValueOf, num, str);
                C1013410cTj c1013410cTj5 = (C1013410cTj) C13LP.LJJJLZIJ(i, this.LL.getStats());
                if (c1013410cTj5 != null) {
                    c1013410cTj5.LIZLLL = true;
                }
            }
        }
        ((ArrayList) this.LLILZIL).removeAll(arrayList2);
    }
}
