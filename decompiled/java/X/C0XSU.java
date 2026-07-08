package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0XSU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XSU {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final C0XSV LIZJ;
    public final Map<String, String> LIZLLL;
    public final Map<String, Object> LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final Map<String, Object> LJIIIIZZ;
    public final Map<String, Object> LJIIIZ;

    public C0XSU() {
        throw null;
    }

    public C0XSU(String str, List list, C0XSV c0xsv, Map map, String str2, boolean z, Map map2, Map map3, int i) {
        boolean z2;
        list = (i & 2) != 0 ? null : list;
        c0xsv = (i & 4) != 0 ? C0XSV.GET : c0xsv;
        map = (i & 16) != 0 ? null : map;
        str2 = (i & 32) != 0 ? "application/x-www-form-urlencoded" : str2;
        if ((i & 64) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i & 128) != 0 ? false : z;
        map2 = (i & 256) != 0 ? null : map2;
        map3 = (i & 512) != 0 ? null : map3;
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = c0xsv;
        this.LIZLLL = null;
        this.LJ = map;
        this.LJFF = str2;
        this.LJI = z2;
        this.LJII = z;
        this.LJIIIIZZ = map2;
        this.LJIIIZ = map3;
    }
}
