package X;

/* JADX INFO: renamed from: X.10CT, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CT {
    public final String LIZ;
    public final String LIZIZ;
    public final C10CU LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final C10CZ LJI;

    public C10CT(String str, String str2, C10CU c10cu, boolean z, C10CZ c10cz, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        c10cu = (i & 4) != 0 ? null : c10cu;
        z = (i & 16) != 0 ? false : z;
        c10cz = (i & 64) != 0 ? null : c10cz;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c10cu;
        this.LIZLLL = false;
        this.LJ = z;
        this.LJFF = false;
        this.LJI = c10cz;
    }
}
