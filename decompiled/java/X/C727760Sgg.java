package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0Sgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727760Sgg {
    public static final C727760Sgg LIZ = new C727760Sgg();
    public static String LIZIZ;
    public static User LIZJ;

    public static void LIZ(Aweme aweme) {
        int storyStatus;
        String uid;
        String nickname;
        UserStory userStory;
        List<Aweme> stories;
        User user = LIZJ;
        int i = 0;
        if (user != null) {
            storyStatus = user.getStoryStatus();
        } else {
            storyStatus = 0;
        }
        if (aweme != null && (userStory = aweme.getUserStory()) != null && userStory.getTotalCount() != 0 && (stories = userStory.getStories()) != null && !stories.isEmpty()) {
            i = userStory.getAllViewed() ? 2 : 1;
        }
        if (storyStatus == i) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", LIZIZ);
        User user2 = LIZJ;
        if (user2 != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        User user3 = LIZJ;
        if (user3 != null) {
            nickname = user3.getNickname();
        } else {
            nickname = null;
        }
        c2344009Gk.LJIIIIZZ("nickname", nickname);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User user4 = LIZJ;
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(user4), "follow_status");
        c2344009Gk.LIZJ(storyStatus, "story_state");
        c2344009Gk.LIZJ(i, "story_aweme_date");
        C20684815ws.LJIILLIIL("story_click_unconsistent", c2344009Gk.LIZ);
        LIZIZ = null;
        LIZJ = null;
    }
}
