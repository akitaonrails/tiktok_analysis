package X;

/* JADX INFO: renamed from: X.08VK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08VK {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final long LJFF;

    public static boolean LIZIZ(String str) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(String str, String str2) {
        if (LIZIZ(str) && LIZIZ(str2)) {
            return true;
        }
        return false;
    }

    public final C08VM LIZJ(long j, String str) {
        if (LIZIZ(str) && str.equals(this.LIZ) && LIZ(this.LIZ, this.LIZIZ)) {
            return new C08VM(new C08VK(this.LIZ, this.LIZIZ, this.LIZJ, j, this.LIZLLL, true), true);
        }
        return new C08VM(this, false);
    }

    public C08VK(String str, String str2, String str3, long j, String str4, boolean z) {
        this.LIZ = LIZIZ(str) ? str : null;
        this.LIZIZ = LIZIZ(str2) ? str2 : null;
        this.LIZJ = LIZIZ(str3) ? str3 : null;
        this.LIZLLL = LIZIZ(str4) ? str4 : null;
        this.LJ = z;
        this.LJFF = j;
    }
}
