package X;

/* JADX INFO: renamed from: X.0FJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387990FJd {
    public final C0FHM LIZ;
    public final C0FHM LIZIZ;
    public final C0FHM LIZJ;
    public final C0FHM LIZLLL;
    public final C0FHM LJ;
    public final C0FHM LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public C387990FJd() {
        C0FHM c0fhm = null;
        this(c0fhm, c0fhm, c0fhm, c0fhm, c0fhm, c0fhm, 63);
    }

    public C387990FJd(C0FHM c0fhm, C0FHM c0fhm2, C0FHM c0fhm3, C0FHM c0fhm4, C0FHM c0fhm5, C0FHM c0fhm6) {
        this.LIZ = c0fhm;
        this.LIZIZ = c0fhm2;
        this.LIZJ = c0fhm3;
        this.LIZLLL = c0fhm4;
        this.LJ = c0fhm5;
        this.LJFF = c0fhm6;
    }

    public /* synthetic */ C387990FJd(C0FHM c0fhm, C0FHM c0fhm2, C0FHM c0fhm3, C0FHM c0fhm4, C0FHM c0fhm5, C0FHM c0fhm6, int i) {
        this((i & 1) != 0 ? C0FHM.GONE : c0fhm, (i & 2) != 0 ? C0FHM.GONE : c0fhm2, (i & 4) != 0 ? C0FHM.GONE : c0fhm3, (i & 8) != 0 ? C0FHM.GONE : c0fhm4, (i & 16) != 0 ? C0FHM.GONE : c0fhm5, (i & 32) != 0 ? C0FHM.GONE : c0fhm6);
    }

    public static C387990FJd LIZ(C387990FJd c387990FJd, C0FHM c0fhm, C0FHM c0fhm2, C0FHM c0fhm3, C0FHM c0fhm4, C0FHM c0fhm5, C0FHM c0fhm6, int i) {
        C0FHM c0fhm7 = c0fhm6;
        C0FHM c0fhm8 = c0fhm5;
        C0FHM c0fhm9 = c0fhm4;
        C0FHM c0fhm10 = c0fhm3;
        C0FHM c0fhm11 = c0fhm2;
        C0FHM c0fhm12 = c0fhm;
        if ((i & 1) != 0) {
            c0fhm12 = c387990FJd.LIZ;
        }
        if ((i & 2) != 0) {
            c0fhm11 = c387990FJd.LIZIZ;
        }
        if ((i & 4) != 0) {
            c0fhm10 = c387990FJd.LIZJ;
        }
        if ((i & 8) != 0) {
            c0fhm9 = c387990FJd.LIZLLL;
        }
        if ((i & 16) != 0) {
            c0fhm8 = c387990FJd.LJ;
        }
        if ((i & 32) != 0) {
            c0fhm7 = c387990FJd.LJFF;
        }
        c387990FJd.getClass();
        return new C387990FJd(c0fhm12, c0fhm11, c0fhm10, c0fhm9, c0fhm8, c0fhm7);
    }
}
