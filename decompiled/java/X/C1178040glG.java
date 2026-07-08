package X;

import Y.AComparatorS37S0000000_18;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0glG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178040glG implements InterfaceC1206010hUN<C1178080glK> {
    public boolean LIZ;

    @Override // X.InterfaceC1206010hUN
    public final Set<InterfaceC1177120gjm<C1178080glK>> LIZ(Set<? extends InterfaceC1177120gjm<C1178080glK>> set) {
        boolean z = this.LIZ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            InterfaceC1177120gjm interfaceC1177120gjm = (InterfaceC1177120gjm) it2.next();
            if (interfaceC1177120gjm != null) {
                ArrayList arrayList = new ArrayList();
                for (C1178080glK c1178080glK : interfaceC1177120gjm.getItems()) {
                    if (z) {
                        linkedHashSet.add(new C1178020glE(c1178080glK.LJ, Collections.singletonList(c1178080glK)));
                    } else {
                        arrayList.add(c1178080glK);
                    }
                }
                if (!arrayList.isEmpty()) {
                    linkedHashSet.add(new C1178020glE(interfaceC1177120gjm.getPosition(), C13LP.LJLLLL(new AComparatorS37S0000000_18(15), arrayList)));
                }
            }
        }
        return linkedHashSet;
    }
}
