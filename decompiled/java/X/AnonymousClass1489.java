package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1489, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1489 {
    public final String LIZ;
    public final String LIZIZ;
    public HashMap<String, Object> LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public final Map<String, ? extends Object> LJI;
    public final Map<String, ? extends Object> LJII;

    public AnonymousClass1489() {
        throw null;
    }

    public AnonymousClass1489(String str, String str2, HashMap map, String str3, int i) {
        String str4;
        map = (i & 4) != 0 ? null : map;
        str3 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            str4 = "active";
        } else {
            str4 = null;
        }
        String str5 = (i & 32) == 0 ? null : "";
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = null;
        this.LJII = null;
    }
}
