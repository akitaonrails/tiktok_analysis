package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0rOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586930rOl {
    public final Map<String, Set<String>> LIZ;
    public final Map<String, Map<String, Boolean>> LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public /* synthetic */ C1586930rOl() {
        this(-1, new LinkedHashMap(), new LinkedHashMap(), false);
    }

    public C1586930rOl(int i, Map map, Map map2, boolean z) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = i;
        this.LIZLLL = z;
    }

    public static C1586930rOl LIZ(C1586930rOl c1586930rOl, Map map, Map map2, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            map = c1586930rOl.LIZ;
        }
        if ((i2 & 2) != 0) {
            map2 = c1586930rOl.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            i = c1586930rOl.LIZJ;
        }
        if ((i2 & 8) != 0) {
            z = c1586930rOl.LIZLLL;
        }
        c1586930rOl.getClass();
        return new C1586930rOl(i, map, map2, z);
    }
}
