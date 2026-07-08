package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import java.util.ConcurrentModificationException;
import java.util.List;

/* JADX INFO: renamed from: X.0SfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726990SfR {
    public static long LIZ(UserStory userStory) {
        long jLIZIZ = 0;
        if (userStory == null) {
            return 0L;
        }
        try {
            jLIZIZ = LIZIZ(userStory);
            return jLIZIZ;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return jLIZIZ;
        } catch (ConcurrentModificationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return jLIZIZ;
        }
    }

    public static long LIZIZ(UserStory userStory) {
        Aweme aweme;
        UserAllStoryMetadata allStoryMetadata;
        long jHashCode;
        int iHashCode;
        String aid;
        int iIntValue;
        int iHashCode2;
        String aid2;
        List<Aweme> stories = userStory.getStories();
        int size = stories.size();
        if (size == 0 || (aweme = (Aweme) C13LP.LJJJLL(stories)) == null || aweme.getAuthor() == null) {
            return 0L;
        }
        C238400w2 c238400w2 = new C238400w2();
        long j = 1;
        c238400w2.element = 1L;
        LIZLLL(size, c238400w2);
        c238400w2.element = (c238400w2.element * 31) + userStory.getTotalCount();
        c238400w2.element = (c238400w2.element * 31) + userStory.getCurrentPosition();
        LIZJ(c238400w2, userStory.getAllViewed());
        c238400w2.element = (c238400w2.element * 31) + userStory.getMinCursor();
        c238400w2.element = (c238400w2.element * 31) + userStory.getMaxCursor();
        LIZJ(c238400w2, userStory.getHasMoreAfter());
        LIZJ(c238400w2, userStory.getHasMoreBefore());
        c238400w2.element = (c238400w2.element * 31) + userStory.getLastStoryCreatedAt();
        LIZJ(c238400w2, userStory.isPostStyle());
        c238400w2.element = (c238400w2.element * 31) + userStory.getOriginTotalCount();
        LIZLLL(userStory.getFirstUnViewedStoryIdx(), c238400w2);
        LIZJ(c238400w2, userStory.getShouldStartFromUnViewedStoryIdx());
        LIZJ(c238400w2, userStory.getFakeSelfStoryCollection());
        LIZJ(c238400w2, userStory.getFakeAwemeShell());
        c238400w2.element = (c238400w2.element * 31) + userStory.getTotalVV();
        UserStoryCurrentInfo currentInfo = userStory.getCurrentInfo();
        int iIntValue2 = -1;
        int iHashCode3 = 0;
        if (currentInfo != null) {
            LIZLLL(currentInfo.dispatchCode, c238400w2);
            Integer num = currentInfo.currentIndex;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            LIZLLL(iIntValue, c238400w2);
            Aweme aweme2 = currentInfo.currentStory;
            if (aweme2 != null && (aid2 = aweme2.getAid()) != null) {
                iHashCode2 = aid2.hashCode();
            } else {
                iHashCode2 = 0;
            }
            LIZLLL(iHashCode2, c238400w2);
        }
        UserStoryCurrentInfo maxViewedInfo = userStory.getMaxViewedInfo();
        if (maxViewedInfo != null) {
            Integer num2 = maxViewedInfo.currentIndex;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            LIZLLL(iIntValue2, c238400w2);
            Aweme aweme3 = maxViewedInfo.currentStory;
            if (aweme3 != null && (aid = aweme3.getAid()) != null) {
                iHashCode = aid.hashCode();
            } else {
                iHashCode = 0;
            }
            LIZLLL(iHashCode, c238400w2);
        }
        for (int i = 0; i < size; i++) {
            Aweme aweme4 = (Aweme) C13LP.LJJJLZIJ(i, stories);
            if (aweme4 != null) {
                long j2 = j * 31;
                String aid3 = aweme4.getAid();
                if (aid3 != null) {
                    jHashCode = aid3.hashCode();
                } else {
                    jHashCode = 0;
                }
                j = j2 + jHashCode;
            }
        }
        c238400w2.element = (c238400w2.element * 31) + j;
        User author = aweme.getAuthor();
        if (author != null && (allStoryMetadata = author.getAllStoryMetadata()) != null) {
            iHashCode3 = allStoryMetadata.hashCode();
        }
        LIZLLL(iHashCode3, c238400w2);
        return c238400w2.element;
    }

    public static final void LIZJ(C238400w2 c238400w2, boolean z) {
        long j;
        long j2 = c238400w2.element * 31;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        c238400w2.element = j2 + j;
    }

    public static final void LIZLLL(int i, C238400w2 c238400w2) {
        c238400w2.element = (c238400w2.element * 31) + ((long) i);
    }
}
