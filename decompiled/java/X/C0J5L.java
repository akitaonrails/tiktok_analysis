package X;

import java.util.List;

/* JADX INFO: renamed from: X.0J5L, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J5L {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final List<String> LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public boolean LJIIJ;

    public C0J5L() {
        throw null;
    }

    public C0J5L(String str, int i, boolean z, long j, long j2, long j3, List list, String str2, String str3, int i2) {
        str = (i2 & 2) != 0 ? "toplive" : str;
        i = (i2 & 4) != 0 ? 1 : i;
        z = (i2 & 8) != 0 ? false : z;
        j3 = (i2 & 64) != 0 ? 0L : j3;
        list = (i2 & 128) != 0 ? null : list;
        String str4 = (i2 & 256) == 0 ? str2 : null;
        boolean z2 = (i2 & 512) != 0;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = j3;
        this.LJI = list;
        this.LJII = str4;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = str3;
        this.LJIIJ = false;
    }
}
