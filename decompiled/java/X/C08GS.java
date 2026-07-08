package X;

/* JADX INFO: renamed from: X.08GS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GS {
    public static final /* synthetic */ int LJ = 0;
    public final int LIZ;
    public final String LIZIZ;
    public final C08GV LIZJ;
    public final String LIZLLL;

    public final String toString() {
        C08GV c08gv = this.LIZJ;
        if (c08gv == null || this.LIZLLL == null) {
            return "X" + this.LIZ + "," + this.LIZIZ;
        }
        return "X" + this.LIZ + "," + this.LIZIZ + ",F" + c08gv.ordinal() + "," + this.LIZLLL;
    }

    public C08GS(int i, String str, C08GV c08gv, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = c08gv;
        this.LIZLLL = str2;
    }
}
