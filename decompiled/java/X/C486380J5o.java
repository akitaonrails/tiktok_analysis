package X;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0J5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486380J5o {
    public final Map<String, Set<String>> LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public Set<String> LIZLLL;
    public Set<String> LJ;
    public boolean LJFF;

    public C486380J5o() {
        this(null, null, null, 63);
    }

    public C486380J5o(Map map, String str, Set set, int i) {
        map = (i & 1) != 0 ? null : map;
        str = (i & 4) != 0 ? null : str;
        set = (i & 8) != 0 ? null : set;
        this.LIZ = map;
        this.LIZIZ = false;
        this.LIZJ = str;
        this.LIZLLL = set;
        this.LJ = null;
        this.LJFF = false;
    }
}
