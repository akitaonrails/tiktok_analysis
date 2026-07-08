package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;

/* JADX INFO: renamed from: X.0Ruc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710920Ruc {
    public static final C735890Stn LIZ(Aweme aweme) {
        UserStory userStory;
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return null;
        }
        return LIZIZ(userStory);
    }

    public static final C735890Stn LIZIZ(UserStory userStory) {
        if (userStory == null) {
            return null;
        }
        return new C735890Stn(Integer.valueOf((int) userStory.getCurrentPosition()), UserStoryKt.currentIndex(userStory), Long.valueOf(userStory.getTotalCount()));
    }
}
