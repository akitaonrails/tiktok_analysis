package X;

/* JADX INFO: renamed from: X.0bSX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974230bSX {
    public final EnumC919170a1j LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C974230bSX(int i) {
        EnumC919170a1j enumC919170a1j;
        if ((i & 1) != 0) {
            enumC919170a1j = EnumC919170a1j.UNKNOWN;
        } else {
            enumC919170a1j = null;
        }
        this(enumC919170a1j, (i & 8) != 0 ? "" : null, false, false, false);
    }

    public static C974230bSX LIZ(C974230bSX c974230bSX, EnumC919170a1j enumC919170a1j) {
        return new C974230bSX(enumC919170a1j, c974230bSX.LIZLLL, c974230bSX.LIZIZ, c974230bSX.LIZJ, c974230bSX.LJ);
    }

    public C974230bSX(EnumC919170a1j enumC919170a1j, String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = enumC919170a1j;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
        this.LJ = z3;
    }
}
