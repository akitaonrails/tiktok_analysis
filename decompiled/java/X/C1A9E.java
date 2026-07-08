package X;

import com.ss.android.ugc.aweme.relation.feed.FYPConfig;
import com.ss.android.ugc.aweme.relation.feed.FriendsTabConfig;
import com.ss.android.ugc.aweme.relation.feed.RecUserBigCardConfig;
import com.ss.android.ugc.aweme.relation.feed.StackCardConfig;

/* JADX INFO: renamed from: X.1A9E, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A9E {
    public static final RecUserBigCardConfig LIZ = new RecUserBigCardConfig(10, 20, 20, 60, 0, 3, 20, 10, true, true, new FYPConfig(1, 1, 1, 1, 3, 1, new int[]{1, 1, 3}, new int[]{5, 60, 10000}, 2, 2, 6), new FriendsTabConfig(1, 1, 1, 1, 4, 1, new int[]{1, 1, 4}, new int[]{5, 60, 10000}, 5, 3), 0, new StackCardConfig(0, 30, true), false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1A9P());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1A9Q());

    public static RecUserBigCardConfig LIZ() {
        return (RecUserBigCardConfig) LIZJ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZ().group == 11;
    }

    public static boolean LIZJ() {
        return LIZ().stackCard.uiStyle != 0;
    }

    public static boolean LIZLLL() {
        return LIZ().group > 6;
    }
}
