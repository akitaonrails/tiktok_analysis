package androidx.work;

import X.C0VHO;
import X.C795380VIa;
import X.C795410VId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class OverwritingInputMerger extends C0VHO {
    @Override // X.C0VHO
    public final C795380VIa LIZ(List<C795380VIa> list) {
        C795410VId c795410VId = new C795410VId();
        HashMap map = new HashMap();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((C795380VIa) it2.next()).LIZ));
        }
        c795410VId.LIZJ(map);
        return c795410VId.LIZ();
    }
}
