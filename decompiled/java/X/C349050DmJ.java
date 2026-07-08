package X;

import Y.AComparatorS504S0100000_5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349050DmJ {
    public static final List<InterfaceC1806790x7N> LIZ(List<? extends InterfaceC1806790x7N> list) {
        List<Class<? extends InterfaceC1806790x7N>> list2 = C1805510x5J.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        int i = 0;
        for (Class<? extends InterfaceC1806790x7N> cls : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new Pair(cls, Integer.valueOf(i)));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return C13LP.LJLLLL(new AComparatorS504S0100000_5(C2097608Jq.LJIILLIIL(arrayList), 8), list);
    }
}
