package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.06cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1648406cs {
    public final Map<String, C1722406oo> LIZ;
    public final C01GW LIZIZ;

    public C1648406cs(List<C1722406oo> list) {
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (Object obj : (ArrayList) list) {
            linkedHashMap.put(String.valueOf(((C1722406oo) obj).creatorUserId), obj);
        }
        this.LIZ = new LinkedHashMap(linkedHashMap);
        this.LIZIZ = C452501pT.LIZIZ(new C08LB(this));
    }

    public final C1722406oo LIZ(String str) {
        C0Y8T c0y8tLJ;
        long jLJII = C0YNP.LJII(str);
        if (jLJII == -1 || (c0y8tLJ = C0YNP.LIZIZ(str).LJ()) == null || c0y8tLJ.getUnreadCount() != 0) {
            return null;
        }
        return (C1722406oo) ((LinkedHashMap) this.LIZ).get(String.valueOf(jLJII));
    }
}
