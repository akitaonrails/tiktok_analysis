package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.019t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2883019t {
    public final LinkedHashMap<Integer, C2878019o> LIZ;
    public final C13E8<C2878019o> LIZIZ;

    public final C2878019o LIZ() {
        return C500260Jjc.LJJIJIIJI(this.LIZIZ) ? this.LIZIZ.first() : (C2878019o) C13LP.LJJJJZ(this.LIZ.values());
    }

    public C2883019t() {
        LinkedHashMap<Integer, C2878019o> linkedHashMapLJII = C2097608Jq.LJII(new Pair(0, new C2878019o(0, new C2886019w())), new Pair(1, new C2878019o(1, new C2887019x())), new Pair(4, new C2878019o(4, new C2885019v())), new Pair(2, new C2878019o(2, new C2888019y())), new Pair(3, new C2878019o(3, new C2889019z())), new Pair(6, new C2878019o(6, new C01A0())));
        this.LIZ = linkedHashMapLJII;
        this.LIZIZ = new C13E8<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(((C2878019o) C13LP.LJJJJZ(linkedHashMapLJII.values())).LIZ));
        LIZIZ(arrayList);
    }

    public final void LIZIZ(List<Integer> list) {
        this.LIZIZ.clear();
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = list.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            C2878019o c2878019o = this.LIZ.get(Integer.valueOf(iIntValue));
            if (c2878019o == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Warning: Server sent textPresetId ");
                sbLIZ.append(iIntValue);
                sbLIZ.append(" but local app doesn't support it.");
                C20441214yg.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                arrayList.add(c2878019o);
            }
        }
        this.LIZIZ.addAll(arrayList);
        C13E8<C2878019o> c13e8 = this.LIZIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(c13e8, 10));
        Iterator<C2878019o> it3 = c13e8.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(it3.next().LIZ));
        }
    }
}
