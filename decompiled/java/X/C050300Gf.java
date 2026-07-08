package X;

/* JADX INFO: renamed from: X.00Gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C050300Gf {
    public final C050800Gk LIZ;
    public final C050800Gk LIZIZ;
    public final C050800Gk LIZJ;
    public final C050800Gk LIZLLL;
    public final Integer LJ;

    public C050300Gf(String str, C050800Gk c050800Gk, C050800Gk c050800Gk2, C050800Gk c050800Gk3, int i) {
        C050800Gk c050800Gk4;
        if ((i & 2) != 0) {
            c050800Gk4 = new C050800Gk(str, "#FFFFFF");
        } else {
            c050800Gk4 = null;
        }
        c050800Gk = (i & 4) != 0 ? new C050800Gk(str, "#FFFFFF") : c050800Gk;
        c050800Gk2 = (i & 8) != 0 ? new C050800Gk("#FFFFFF", str) : c050800Gk2;
        c050800Gk3 = (i & 16) != 0 ? new C050800Gk("#FFFFFF", str) : c050800Gk3;
        this.LIZ = c050800Gk4;
        this.LIZIZ = c050800Gk;
        this.LIZJ = c050800Gk2;
        this.LIZLLL = c050800Gk3;
        this.LJ = C202500qF.LJFF(str);
    }
}
