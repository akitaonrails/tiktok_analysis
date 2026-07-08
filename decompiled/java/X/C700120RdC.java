package X;

import java.util.Set;

/* JADX INFO: renamed from: X.0RdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700120RdC {
    public static final Set<String> LIZ;

    static {
        Set<String> setLJ = C093Y.LJ("For You", "Following", "PROFILE", "Stem", "Nearby", "Friends", "Repost", "NEARBY_FEED_DOUBLE_COLUMN", "NEARBY_FEED_INNER", "Series");
        setLJ.addAll(C1581990rGn.LIZIZ);
        setLJ.addAll(C700080Rd8.LIZIZ.keySet());
        C13LP.LLIIJI(setLJ);
        LIZ = setLJ;
    }

    public static final boolean LIZ(String str) {
        return C13LP.LJJJJ(str, LIZ);
    }
}
