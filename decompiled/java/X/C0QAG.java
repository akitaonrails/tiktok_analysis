package X;

/* JADX INFO: renamed from: X.0QAG, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QAG {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public C0QAG(int i, String str, String str2, int i2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i2;
    }

    public static C0QAG LIZ(C0QAG c0qag, int i, int i2, int i3) {
        String str;
        if ((i3 & 1) != 0) {
            i = c0qag.LIZ;
        }
        String str2 = null;
        if ((i3 & 2) != 0) {
            str = c0qag.LIZIZ;
        } else {
            str = null;
        }
        if ((i3 & 4) != 0) {
            str2 = c0qag.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i2 = c0qag.LIZLLL;
        }
        c0qag.getClass();
        return new C0QAG(i, str, str2, i2);
    }
}
