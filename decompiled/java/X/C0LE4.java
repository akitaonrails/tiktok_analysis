package X;

/* JADX INFO: renamed from: X.0LE4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LE4 {
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public String LJ;

    public C0LE4() {
        this(31, null);
    }

    public C0LE4(int i, String str) {
        boolean z;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = (i & 16) == 0 ? null : "";
        this.LIZ = str;
        this.LIZIZ = false;
        this.LIZJ = z;
        this.LIZLLL = 0L;
        this.LJ = str2;
    }
}
