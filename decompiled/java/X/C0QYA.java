package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0QYA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QYA {
    public C0QYA LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C0QUV LJ;
    public final String LJFF;
    public final C0QUV LJI;
    public final Map<String, String> LJII;

    public C0QYA(boolean z, boolean z2, boolean z3, C0QUV c0quv, String str, C0QUV c0quv2, Map map, int i) {
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        z3 = (i & 8) != 0 ? false : z3;
        c0quv = (i & 16) != 0 ? null : c0quv;
        str = (i & 32) != 0 ? null : str;
        c0quv2 = (i & 64) != 0 ? null : c0quv2;
        map = (i & 128) != 0 ? null : map;
        this.LIZ = null;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = c0quv;
        this.LJFF = str;
        this.LJI = c0quv2;
        this.LJII = map;
    }
}
