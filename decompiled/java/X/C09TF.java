package X;

/* JADX INFO: renamed from: X.09TF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TF {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public Boolean LIZLLL;
    public Boolean LJ;
    public Boolean LJFF;
    public C09TL LJI;

    public C09TF() {
        this(null, null, null, 127);
    }

    public C09TF(String str, String str2, String str3, int i) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        if ((i & 16) != 0) {
            bool2 = Boolean.TRUE;
        } else {
            bool2 = null;
        }
        if ((i & 32) != 0) {
            bool3 = Boolean.FALSE;
        } else {
            bool3 = null;
        }
        C09TL c09tl = (i & 64) != 0 ? C09TL.IDLE : null;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = bool;
        this.LJ = bool2;
        this.LJFF = bool3;
        this.LJI = c09tl;
    }
}
