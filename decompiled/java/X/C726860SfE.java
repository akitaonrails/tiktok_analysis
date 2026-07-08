package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.StoryLiteMetadata;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import com.ss.android.ugc.aweme.profile.model.UserFilterStoryInfo;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0SfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726860SfE {
    public static final boolean LIZ(Aweme aweme, User user) {
        Set setLLIIJI;
        List<StoryLiteMetadata> list;
        UserStory userStory;
        UserFilterStoryInfo userFilterStoryInfo;
        List<Long> list2;
        if (user == null) {
            return false;
        }
        if (aweme != null && (userStory = aweme.getUserStory()) != null && (userFilterStoryInfo = userStory.getUserFilterStoryInfo()) != null && (list2 = userFilterStoryInfo.filterStoryIds) != null) {
            setLLIIJI = C13LP.LLIIJI(list2);
        } else {
            setLLIIJI = null;
        }
        UserAllStoryMetadata allStoryMetadata = user.getAllStoryMetadata();
        if (allStoryMetadata != null) {
            list = allStoryMetadata.storyLiteMetadata;
        } else {
            list = null;
        }
        if (list == null) {
            if (user.getStoryStatus() != 1) {
                return false;
            }
        } else {
            if (list.isEmpty()) {
                return false;
            }
            int i = 0;
            for (StoryLiteMetadata storyLiteMetadata : list) {
                if (!storyLiteMetadata.viewed && (setLLIIJI == null || !setLLIIJI.contains(Long.valueOf(storyLiteMetadata.itemID)))) {
                    i++;
                    if (i < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            if (i <= 0) {
                return false;
            }
        }
        return true;
    }
}
