package X;

/* JADX INFO: renamed from: X.0BfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293840BfS {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C293830BfR());
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;

    static {
        LIZIZ = (LIZ() & 1) == 1;
        LIZJ = (LIZ() & 2) == 2;
        LIZLLL = (LIZ() & 4) == 4;
        LJ = (LIZ() & 8) == 8;
    }

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }
}
