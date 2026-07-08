package X;

/* JADX INFO: renamed from: X.0MM6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MM6 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C1453400nvO LIZLLL;

    public C0MM6(String str, String str2, String str3, int i) {
        C1453400nvO c1453400nvO;
        str3 = (i & 4) != 0 ? C572440Mck.LIZ(0, 0) : str3;
        if ((i & 8) != 0) {
            C0MM7 c0mm7 = new C0MM7();
            c1453400nvO = new C1453400nvO(c0mm7.LIZ, c0mm7.LIZIZ, c0mm7.LIZJ, c0mm7.LIZLLL, c0mm7.LJ, c0mm7.LJFF, c0mm7.LJI, c0mm7.LJII);
        } else {
            c1453400nvO = null;
        }
        this(str, str2, str3, c1453400nvO);
    }

    public C0MM6(String str, String str2, String str3, C1453400nvO c1453400nvO) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = c1453400nvO;
    }
}
