package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0zrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912470zrp {
    public final C10H4 LIZ;
    public final Map<C10NW, C1869040yjm> LIZIZ = new LinkedHashMap();
    public final List<InterfaceC1865160ydW> LIZJ = new ArrayList();

    public C1912470zrp(C10H4 c10h4) {
        this.LIZ = c10h4;
    }

    public final C1869040yjm LIZ(C10NW c10nw) {
        if (!this.LIZIZ.containsKey(c10nw)) {
            return null;
        }
        return (C1869040yjm) ((LinkedHashMap) this.LIZIZ).get(c10nw);
    }

    public final <T> T LIZIZ(Class<T> cls) {
        Iterator it2 = ((ArrayList) this.LIZJ).iterator();
        while (it2.hasNext()) {
            T t = (T) ((InterfaceC1865160ydW) it2.next()).getService(cls);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}
