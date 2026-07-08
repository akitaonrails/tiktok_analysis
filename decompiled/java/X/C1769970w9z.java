package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0w9z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769970w9z extends C1543000qFu {
    public static final C1544630qIX<C1531540pxQ> LIZJ = new C1544630qIX<>(new C1531540pxQ(C1769900w9s.LIZ().piperDataJsb));
    public static final C1544630qIX<C2281611ESh> LIZLLL = new C1544630qIX<>(C2281611ESh.LIZ);
    public static final C1544630qIX<C1770000wA2> LJ = new C1544630qIX<>(C1770000wA2.LIZ);
    public static final C1544630qIX<C1769990wA1> LJFF = new C1544630qIX<>(C1769990wA1.LIZ);
    public final String LIZ;
    public final boolean LIZIZ;

    @Override // X.C1543000qFu
    public final Map<Class<?>, C1544630qIX<?>> LJII() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!this.LIZIZ) {
            linkedHashMap.put(C1531540pxQ.class, LIZJ);
        }
        if (C1769870w9p.LIZ().enable) {
            String str = this.LIZ;
            if (!C1769870w9p.LIZ().enable || !C1769870w9p.LIZ().channels.contains(str)) {
                linkedHashMap.put(C1545130qJL.class, LJFF);
                return linkedHashMap;
            }
        }
        String str2 = this.LIZ;
        List<String> list = C1769900w9s.LIZ().mainThreadChannels;
        if (list == null || !list.contains(str2)) {
            linkedHashMap.put(C1545130qJL.class, LIZLLL);
            return linkedHashMap;
        }
        linkedHashMap.put(C1545130qJL.class, LJ);
        return linkedHashMap;
    }

    public C1769970w9z(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
