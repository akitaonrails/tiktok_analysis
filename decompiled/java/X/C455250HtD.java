package X;

/* JADX INFO: renamed from: X.0HtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455250HtD {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final Long LJ;
    public final boolean LJFF;
    public final String LJI;
    public final boolean LJII;
    public final C0HZ2 LJIIIIZZ;

    public static C455250HtD LIZ(C455250HtD c455250HtD) {
        return new C455250HtD(c455250HtD.LIZ, c455250HtD.LIZIZ, c455250HtD.LIZJ, c455250HtD.LIZLLL, c455250HtD.LJ, true, c455250HtD.LJI, c455250HtD.LJII, c455250HtD.LJIIIIZZ);
    }

    public /* synthetic */ C455250HtD(String str, String str2, String str3, Integer num, Long l, boolean z, boolean z2, C0HZ2 c0hz2, int i) {
        this((i & 1) != 0 ? "chat" : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : l, (i & 32) != 0 ? false : z, (String) null, (i & 128) != 0 ? false : z2, (i & 256) == 0 ? c0hz2 : null);
    }

    public C455250HtD(String str, String str2, String str3, Integer num, Long l, boolean z, String str4, boolean z2, C0HZ2 c0hz2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = num;
        this.LJ = l;
        this.LJFF = z;
        this.LJI = str4;
        this.LJII = z2;
        this.LJIIIIZZ = c0hz2;
    }
}
