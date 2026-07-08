package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.07d1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1904107d1 {
    public final Set<String> LIZ = new LinkedHashSet();
    public final Map<String, C1904107d1> LIZIZ = new LinkedHashMap();
    public C1904107d1 LIZJ;
    public boolean LIZLLL;

    public final C07ZM LIZ() {
        Set setLLIIJI = C13LP.LLIIJI(this.LIZ);
        Map<String, C1904107d1> map = this.LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            linkedHashMap.put(entry.getKey(), ((C1904107d1) entry.getValue()).LIZ());
        }
        C1904107d1 c1904107d1 = this.LIZJ;
        return new C07ZM(setLLIIJI, linkedHashMap, c1904107d1 != null ? c1904107d1.LIZ() : null, this.LIZLLL);
    }
}
