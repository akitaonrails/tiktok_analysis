package X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0rK0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583980rK0 {
    public static final /* synthetic */ C1583980rK0 LIZ = new C1583980rK0();
    public static final List<String> LIZIZ = Arrays.asList("For You", "PGC_INSPIRATION");
    public static final List<String> LIZJ = Arrays.asList("Following", "PGC_TRENDING");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("Rewards", "homepage_explore", "Popular", "Shop", "Nearby", "FRIENDS_FEED", "Stem", "Live", "Drama");
    public static final List<String> LJ;
    public static final List<String> LJFF;

    static {
        Map<Integer, Set<EnumC1584360rKc>> map = C1584270rKT.LIZ;
        LJ = C1584270rKT.LIZJ;
        LJFF = Arrays.asList("INCENTIVE_COIN", "PUBLISH");
    }

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 0) {
                return "HOME";
            }
            if (num.intValue() != 1) {
                if (num.intValue() == 2) {
                    return "PUBLISH";
                }
                if (num.intValue() == 3) {
                    return "NOTIFICATION";
                }
                if (num.intValue() == 4) {
                    return "USER";
                }
                if (num.intValue() == 5) {
                    return "DISCOVER";
                }
                return "";
            }
            return "DISCOVER";
        }
        return "";
    }
}
