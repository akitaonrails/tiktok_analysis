package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08v6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2271008v6 {
    public final ConcurrentHashMap<String, C2294308yr> LIZ = new ConcurrentHashMap<>();

    public final void LIZ() {
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearAllBachCache ");
        sbLIZ.append(this.LIZ.size());
        C201955140j.LIZLLL(c0mj8, "BachInstanceManager", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList<C2294308yr> arrayList = new ArrayList();
        Iterator<Map.Entry<String, C2294308yr>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getValue());
        }
        this.LIZ.clear();
        for (C2294308yr c2294308yr : arrayList) {
            c2294308yr.getClass();
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2271108v7(c2294308yr, null), 2);
        }
    }
}
