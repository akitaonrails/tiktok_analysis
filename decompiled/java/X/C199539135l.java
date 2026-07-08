package X;

import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: renamed from: X.135l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199539135l extends AbstractMap<String, Object> {
    public final Object LL;
    public final C199544135q LLILLJJLI;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new C199540135m(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        C199545135r c199545135rLIZ;
        if (!(obj instanceof String) || (c199545135rLIZ = this.LLILLJJLI.LIZ((String) obj)) == null) {
            return null;
        }
        return c199545135rLIZ.LIZ(this.LL);
    }

    public C199539135l(Object obj, boolean z) {
        this.LL = obj;
        this.LLILLJJLI = C199544135q.LIZIZ(obj.getClass(), z);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        String str = (String) obj;
        C199545135r c199545135rLIZ = this.LLILLJJLI.LIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no field of key ");
        sbLIZ.append(str);
        C19864312np.LJI(c199545135rLIZ, C2188811AlT.LIZIZ(sbLIZ));
        Object objLIZ = c199545135rLIZ.LIZ(this.LL);
        Object obj3 = this.LL;
        obj2.getClass();
        c199545135rLIZ.LIZLLL(obj3, obj2);
        return objLIZ;
    }
}
