package X;

import com.ss.android.ugc.aweme.story.experiment.StorySkylightPreloadAvatarExpData;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605630rsv {
    public static final StorySkylightPreloadAvatarExpData LIZ = new StorySkylightPreloadAvatarExpData(false, false, 0, 10, 10, 10, 10);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(519));

    public static StorySkylightPreloadAvatarExpData LIZ() {
        return (StorySkylightPreloadAvatarExpData) LIZIZ.getValue();
    }

    public static int LIZIZ(EnumC1596540reG enumC1596540reG) {
        int i = C1596550reH.LIZ[enumC1596540reG.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return 0;
                    }
                    return LIZ().preloadCountForFollowing;
                }
                return LIZ().preloadCountForFriends;
            }
            return LIZ().preloadCountForFyp;
        }
        return LIZ().preloadCountForInbox;
    }
}
