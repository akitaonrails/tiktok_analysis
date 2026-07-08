package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0sbC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633080sbC {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final Map<String, String> LJIIIZ;
    public boolean LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1633080sbC() {
        boolean z = false;
        this(null, z, z, 1023);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1633080sbC(String str, boolean z, boolean z2, int i) {
        int i2;
        boolean z3 = z2;
        boolean z4 = z;
        String str2 = (i & 1) != 0 ? "" : str;
        String str3 = (i & 16) == 0 ? null : "";
        z4 = (i & 32) != 0 ? true : z4;
        z3 = (i & 128) != 0 ? false : z3;
        if ((i & 256) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(str2, 0, 0, 0, str3, z4, false, z3, i2, (i & 512) != 0 ? C2097608Jq.LJ() : null);
    }

    public C1633080sbC(String str, int i, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, int i4, Map<String, String> map) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = str2;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = map;
    }
}
