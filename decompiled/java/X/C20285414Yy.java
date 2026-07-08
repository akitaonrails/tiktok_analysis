package X;

/* JADX INFO: renamed from: X.14Yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20285414Yy {
    public static final C01GW<C20285414Yy> LIZLLL = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C14Z1());
    public final C603820NmG<String, C14XX> LIZ = new C603820NmG<>(100);
    public final C603820NmG<String, C20283314Yd> LIZIZ = new C603820NmG<>(100);
    public final C603820NmG<String, C14Z2> LIZJ = new C603820NmG<>(100);

    public final boolean LIZ(String str) {
        C603820NmG<String, C14Z2> c603820NmG;
        C14Z2 c14z2LIZJ;
        if (str == null || (c603820NmG = this.LIZJ) == null || (c14z2LIZJ = c603820NmG.LIZJ(str)) == null) {
            return false;
        }
        if ((c14z2LIZJ.LIZ != C14Z5.BACKGROUND.getType() && c14z2LIZJ.LIZ != C14Z5.COMMON_BACKGROUND_LYNX.getType()) || !c14z2LIZJ.LIZIZ) {
            return false;
        }
        return true;
    }

    public final C20283314Yd LIZIZ(String str) {
        C603820NmG<String, C20283314Yd> c603820NmG;
        if (str == null || (c603820NmG = this.LIZIZ) == null) {
            return null;
        }
        return c603820NmG.LIZJ(str);
    }

    public final C14XX LIZJ(String str) {
        C603820NmG<String, C14XX> c603820NmG;
        if (str == null || (c603820NmG = this.LIZ) == null) {
            return null;
        }
        return c603820NmG.LIZJ(str);
    }

    public final boolean LIZLLL(int i, String str) {
        C603820NmG<String, C14Z2> c603820NmG;
        C14Z2 c14z2LIZJ;
        if (str == null || (c603820NmG = this.LIZJ) == null || (c14z2LIZJ = c603820NmG.LIZJ(str)) == null || c14z2LIZJ.LIZ != i) {
            return false;
        }
        return c14z2LIZJ.LIZIZ;
    }

    public final void LJFF(String str, C20283314Yd c20283314Yd) {
        C603820NmG<String, C20283314Yd> c603820NmG;
        if (str != null && (c603820NmG = this.LIZIZ) != null) {
            c603820NmG.LIZLLL(str, c20283314Yd);
        }
    }

    public final void LJI(String str, C14XX c14xx) {
        C603820NmG<String, C14XX> c603820NmG;
        if (str != null && (c603820NmG = this.LIZ) != null) {
            c603820NmG.LIZLLL(str, c14xx);
        }
    }

    public final void LJII(String str, C14Z2 c14z2) {
        C603820NmG<String, C14Z2> c603820NmG;
        if (str != null && (c603820NmG = this.LIZJ) != null) {
            c603820NmG.LIZLLL(str, c14z2);
        }
    }
}
