package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0Mr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581360Mr8 {
    public static final /* synthetic */ int LJIILL = 0;
    public final boolean LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public String LJII;
    public String LJIIIIZZ;
    public Map<String, String> LJIIIZ;
    public Integer LJIIJ;
    public Integer LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;

    public C581360Mr8(boolean z, boolean z2, boolean z3, boolean z4, String str, Map map, int i, int i2) {
        int i3;
        int i4;
        z = (i2 & 2) != 0 ? true : z;
        z2 = (i2 & 4) != 0 ? true : z2;
        z3 = (i2 & 8) != 0 ? true : z3;
        z4 = (i2 & 16) != 0 ? true : z4;
        if ((i2 & 64) != 0) {
            i3 = -2;
        } else {
            i3 = 0;
        }
        if ((i2 & 128) != 0) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        str = (i2 & 256) != 0 ? null : str;
        map = (i2 & 1024) != 0 ? null : map;
        i = (i2 & 16384) != 0 ? 0 : i;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = false;
        this.LJFF = i3;
        this.LJI = i4;
        this.LJII = str;
        this.LJIIIIZZ = null;
        this.LJIIIZ = map;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = i;
        this.LJIILIIL = 0;
        this.LJIILJJIL = false;
    }
}
