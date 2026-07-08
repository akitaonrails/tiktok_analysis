package X;

/* JADX INFO: renamed from: X.0uiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714380uiK {
    public static final C1714380uiK LJ = new C1714380uiK(0);
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C1714380uiK() {
        this(0);
    }

    public /* synthetic */ C1714380uiK(int i) {
        this(false, false, null, null);
    }

    public C1714380uiK(boolean z, boolean z2, String str, String str2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }

    public static C1714380uiK LIZ(C1714380uiK c1714380uiK, boolean z, boolean z2, String str, String str2, int i) {
        if ((i & 1) != 0) {
            z = c1714380uiK.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c1714380uiK.LIZIZ;
        }
        if ((i & 4) != 0) {
            str = c1714380uiK.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c1714380uiK.LIZLLL;
        }
        c1714380uiK.getClass();
        return new C1714380uiK(z, z2, str, str2);
    }
}
