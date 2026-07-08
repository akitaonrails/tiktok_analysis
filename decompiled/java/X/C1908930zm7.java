package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0zm7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908930zm7 {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        boolean zContains;
        if (C1336205Ku.LIZ(false).getImPrivacySettings().LJIIJJI() == 3) {
            return false;
        }
        User author = videoItemParams.getAweme().getAuthor();
        List<Integer> canMessageFollowStatusList = author.getCanMessageFollowStatusList();
        if (canMessageFollowStatusList != null) {
            zContains = canMessageFollowStatusList.contains(3);
        } else {
            zContains = true;
        }
        if (author.getFollowStatus() == C0SY7.FOLLOW_MUTUAL.getValue() && !zContains) {
            return true;
        }
        MatchedFriendStruct matchedFriendStruct = author.getMatchedFriendStruct();
        if (matchedFriendStruct == null || matchedFriendStruct.recType == null || !C1336205Ku.LIZ(false).getImMafService().LIZLLL(author)) {
            return false;
        }
        return true;
    }
}
