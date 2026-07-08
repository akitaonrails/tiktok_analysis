package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1D8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251041D8s {
    public final Map<Object, C2251051D8t> LIZ = new LinkedHashMap();
    public final C2251021D8q LIZIZ;

    public C2251041D8s(C2251021D8q c2251021D8q) {
        this.LIZIZ = c2251021D8q;
    }

    public final C2251051D8t LIZ(Object obj) {
        C2251021D8q c2251021D8q;
        Integer numLIZ;
        Object obj2;
        if (!this.LIZ.containsKey(obj)) {
            return null;
        }
        C2251051D8t c2251051D8tLIZ = (C2251051D8t) ((LinkedHashMap) this.LIZ).get(obj);
        if (c2251051D8tLIZ.LIZ && (numLIZ = (c2251021D8q = this.LIZIZ).LIZ(obj)) != null) {
            int iIntValue = numLIZ.intValue() + 1;
            C1437500nVk c1437500nVk = (C1437500nVk) C13LP.LJJJLZIJ(iIntValue, c2251021D8q.LIZ);
            if (c1437500nVk != null && (obj2 = c1437500nVk.LIZ) != null) {
                C2251051D8t c2251051D8t = new C2251051D8t(0.0f, iIntValue, obj2);
                c2251051D8tLIZ = LIZ(c2251051D8t.LIZIZ);
                if (c2251051D8tLIZ == null) {
                    return c2251051D8t;
                }
            }
        }
        return c2251051D8tLIZ;
    }
}
