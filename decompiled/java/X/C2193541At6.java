package X;

/* JADX INFO: renamed from: X.1At6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193541At6 {
    public String LIZ;
    public String LIZIZ;
    public C2193521At4 LIZJ;
    public C2193491At1 LIZLLL;
    public C2193571At9 LJ;

    public final Long LIZ() {
        if (this.LJ != null) {
            return null;
        }
        C2193491At1 c2193491At1 = this.LIZLLL;
        if (c2193491At1 != null && c2193491At1.LIZJ != null) {
            return c2193491At1.LIZLLL;
        }
        C2193521At4 c2193521At4 = this.LIZJ;
        if (c2193521At4 == null || c2193521At4.LJ == null) {
            return null;
        }
        return c2193521At4.LJFF;
    }

    public C2193541At6(C2193521At4 c2193521At4, C2193571At9 c2193571At9) {
        boolean z;
        boolean z2;
        boolean z3;
        if (c2193521At4 != null) {
            z = true;
        } else {
            z = false;
        }
        if (c2193571At9 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C20137213qk.LIZ("exactly one of authResponse or authError should be non-null", z ^ z2);
        if (c2193521At4 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C20137213qk.LIZ("exactly one of authResponse or authException should be non-null", (c2193571At9 != null) ^ z3);
        if (c2193571At9 != null) {
            if (c2193571At9.type == 1) {
                this.LJ = c2193571At9;
            }
        } else {
            this.LIZJ = c2193521At4;
            this.LIZLLL = null;
            this.LIZ = null;
            this.LJ = null;
            String str = c2193521At4.LJII;
            this.LIZIZ = str == null ? c2193521At4.LIZ.LJII : str;
        }
    }
}
