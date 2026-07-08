package X;

import java.util.List;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0b2L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C957990b2L {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(481));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(480));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(484));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(482));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(483));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(479));

    public static final List<Integer> LIZ() {
        return (List) LIZ.getValue();
    }

    public static final List<Integer> LIZIZ() {
        return (List) LJ.getValue();
    }

    public static final List<Integer> LIZJ() {
        return (List) LIZJ.getValue();
    }

    public static final boolean LIZLLL(Integer num) {
        if (num == null) {
            return false;
        }
        if (!LJ(num) && !LJI(num) && !LJII(num)) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(Integer num) {
        return C13LP.LJJJJ(num, LIZ());
    }

    public static final boolean LJFF(C955540ayO c955540ayO) {
        Integer numValueOf;
        if (c955540ayO != null) {
            numValueOf = Integer.valueOf(c955540ayO.LIZ);
        } else {
            numValueOf = null;
        }
        return LJI(numValueOf);
    }

    public static final boolean LJI(Integer num) {
        return C13LP.LJJJJ(num, LIZJ());
    }

    public static final boolean LJII(Integer num) {
        return C13LP.LJJJJ(num, LIZIZ());
    }
}
