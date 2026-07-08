package X;

/* JADX INFO: renamed from: X.0Lwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559320Lwg {
    public final C375830EoP<Boolean> LIZ;
    public final C375830EoP<Boolean> LIZIZ;
    public final C375830EoP<Boolean> LIZJ;
    public final C375830EoP<Integer> LIZLLL;
    public final C375830EoP<Integer> LJ;
    public final C375830EoP<Boolean> LJFF;

    public C559320Lwg() {
        this(0);
    }

    public /* synthetic */ C559320Lwg(int i) {
        this(null, null, null, null, null, null);
    }

    public C559320Lwg(C375830EoP<Boolean> c375830EoP, C375830EoP<Boolean> c375830EoP2, C375830EoP<Boolean> c375830EoP3, C375830EoP<Integer> c375830EoP4, C375830EoP<Integer> c375830EoP5, C375830EoP<Boolean> c375830EoP6) {
        this.LIZ = c375830EoP;
        this.LIZIZ = c375830EoP2;
        this.LIZJ = c375830EoP3;
        this.LIZLLL = c375830EoP4;
        this.LJ = c375830EoP5;
        this.LJFF = c375830EoP6;
    }

    public static C559320Lwg LIZ(C559320Lwg c559320Lwg, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, int i) {
        C375830EoP<Boolean> c375830EoP6;
        C375830EoP c375830EoP7 = c375830EoP5;
        C375830EoP c375830EoP8 = c375830EoP4;
        C375830EoP c375830EoP9 = c375830EoP3;
        C375830EoP c375830EoP10 = c375830EoP2;
        C375830EoP c375830EoP11 = c375830EoP;
        if ((i & 1) != 0) {
            c375830EoP11 = c559320Lwg.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP10 = c559320Lwg.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP6 = c559320Lwg.LIZJ;
        } else {
            c375830EoP6 = null;
        }
        if ((i & 8) != 0) {
            c375830EoP9 = c559320Lwg.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP8 = c559320Lwg.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP7 = c559320Lwg.LJFF;
        }
        c559320Lwg.getClass();
        return new C559320Lwg(c375830EoP11, c375830EoP10, c375830EoP6, c375830EoP9, c375830EoP8, c375830EoP7);
    }
}
