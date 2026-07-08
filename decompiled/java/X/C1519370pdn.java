package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0pdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519370pdn {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;
    public Map<String, ? extends Object> LJ;

    public C1519370pdn(String str, String str2, String str3, Map map, int i) {
        Map<String, ? extends Object> mapLJ;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        map = (i & 8) != 0 ? C2097608Jq.LJ() : map;
        if ((i & 16) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = map;
        this.LJ = mapLJ;
    }
}
