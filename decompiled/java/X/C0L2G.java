package X;

import com.ss.android.ugc.aweme.experiment.StoryAlbumEnterEditLaunchParams;
import com.ss.android.ugc.aweme.experiment.StoryAlbumEnterEditOptConfig;
import com.ss.android.ugc.aweme.experiment.StoryAlbumEnterEditRule;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0L2G, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2G {
    public static final C0L2G LIZ = new C0L2G();
    public static final StoryAlbumEnterEditOptConfig LIZIZ = new StoryAlbumEnterEditOptConfig(false, false, false, false, 0, false, false, 0, false, null, 1023, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(89));

    public static StoryAlbumEnterEditOptConfig LIZIZ() {
        return (StoryAlbumEnterEditOptConfig) LIZJ.getValue();
    }

    public static final boolean LIZJ() {
        LIZ.getClass();
        return LIZIZ().enable;
    }

    public static final long LIZLLL() {
        LIZ.getClass();
        long j = LIZIZ().sessionCacheMaxTtlSec;
        if (j < 0) {
            j = 0;
        }
        return j * 1000;
    }

    public static final boolean LIZ(StoryAlbumEnterEditLaunchParams storyAlbumEnterEditLaunchParams) {
        LIZ.getClass();
        StoryAlbumEnterEditOptConfig storyAlbumEnterEditOptConfigLIZIZ = LIZIZ();
        if (storyAlbumEnterEditOptConfigLIZIZ.enable && !storyAlbumEnterEditOptConfigLIZIZ.rules.isEmpty()) {
            List<StoryAlbumEnterEditRule> list = storyAlbumEnterEditOptConfigLIZIZ.rules;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (StoryAlbumEnterEditRule storyAlbumEnterEditRule : list) {
                    if (C1237604so.LIZ(storyAlbumEnterEditRule.shootWay, storyAlbumEnterEditLaunchParams.shootWay) && C1237604so.LIZ(storyAlbumEnterEditRule.enterMethod, storyAlbumEnterEditLaunchParams.enterMethod) && C1237604so.LIZ(storyAlbumEnterEditRule.shootEnterFrom, storyAlbumEnterEditLaunchParams.shootEnterFrom)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
