package X;

/* JADX INFO: renamed from: X.0CJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJJ {
    public static C0CJJ LJI;
    public int LIZ;
    public String LIZJ;
    public String LIZLLL;
    public int LIZIZ = -1;
    public boolean LJ = true;
    public boolean LJFF = true;

    public static synchronized C0CJJ LIZ() {
        if (LJI == null) {
            LJI = new C0CJJ();
        }
        return LJI;
    }
}
