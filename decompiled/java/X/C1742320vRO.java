package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0vRO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742320vRO extends AbstractC1742310vRN {
    @Override // X.AbstractC1742310vRN
    public final List<C1763450vzT> LIZ() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = C1742330vRP.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        Iterator<String> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1763450vzT(this.LIZ, it2.next()));
        }
        return arrayList;
    }

    public C1742320vRO(String str) {
        super(str);
    }
}
