package X;

/* JADX INFO: renamed from: X.0mDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387890mDj {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public Long LJ;

    public C1387890mDj() {
        this(false, false, false, null, null, 31);
    }

    public C1387890mDj(boolean z, boolean z2, boolean z3, String str, Long l, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        str = (i & 8) != 0 ? null : str;
        l = (i & 16) != 0 ? null : l;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = str;
        this.LJ = l;
    }
}
