package X;

import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07eU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1913207eU {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(848));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(852));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(850));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(847));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(851));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(849));
    public static final int LJI = 6;
    public static final int LJII = 8;
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(853));

    public static int LIZJ() {
        return ((Number) LJIIIIZZ.getValue()).intValue();
    }

    public static int LIZ() {
        int iLIZJ = LIZJ();
        return iLIZJ == LJI ? ((Number) LJ.getValue()).intValue() : iLIZJ == LJII ? ((Number) LJFF.getValue()).intValue() : ((Number) LIZLLL.getValue()).intValue();
    }

    public static float LIZIZ() {
        int iLIZJ = LIZJ();
        return iLIZJ == LJI ? ((Number) LIZIZ.getValue()).floatValue() : iLIZJ == LJII ? ((Number) LIZJ.getValue()).floatValue() : ((Number) LIZ.getValue()).floatValue();
    }

    public static boolean LIZLLL() {
        return LIZJ() == 4;
    }
}
