package X;

import com.ss.android.ugc.feed.platform.ab.FeedComponentComplexityExpConfig;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKZ {
    public static final FeedComponentComplexityExpConfig LIZ;
    public static final Set<String> LIZIZ;
    public static final C01GW LIZJ;

    static {
        Boolean bool = Boolean.FALSE;
        LIZ = new FeedComponentComplexityExpConfig(bool, C2097908Jt.LIZJ(new Pair("bottom_banner", bool)), null, null);
        LIZIZ = C093Y.LJ("For You");
        LIZJ = C452501pT.LIZIZ(new C0RKY());
    }

    public static boolean LIZ(String str) {
        List<String> list;
        C01GW c01gw = LIZJ;
        FeedComponentComplexityExpConfig feedComponentComplexityExpConfig = (FeedComponentComplexityExpConfig) c01gw.getValue();
        if (feedComponentComplexityExpConfig == null || !Intrinsics.LJFF(feedComponentComplexityExpConfig.useNewTrigger, Boolean.TRUE) || str == null || str.length() == 0) {
            return false;
        }
        FeedComponentComplexityExpConfig feedComponentComplexityExpConfig2 = (FeedComponentComplexityExpConfig) c01gw.getValue();
        if ((feedComponentComplexityExpConfig2 == null || (list = feedComponentComplexityExpConfig2.enabledScene) == null || !list.contains(str)) && !LIZIZ.contains(str)) {
            return false;
        }
        return true;
    }
}
