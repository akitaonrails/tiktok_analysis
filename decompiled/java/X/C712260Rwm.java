package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserAllStoryMetadata;
import java.util.List;

/* JADX INFO: renamed from: X.0Rwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712260Rwm {
    public static boolean LIZ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        C0RJN c0rjnLIZIZ;
        C0RJN c0rjnLIZIZ2;
        Aweme aweme;
        User author;
        UserAllStoryMetadata allStoryMetadata;
        List<Integer> list;
        User author2;
        UserAllStoryMetadata allStoryMetadata2;
        List<Integer> list2;
        User author3;
        UserAllStoryMetadata allStoryMetadata3;
        List<Integer> list3;
        C0RJN c0rjnLIZIZ3 = null;
        if (c690870R8b != null) {
            c0rjnLIZIZ = c690870R8b.LIZIZ();
        } else {
            c0rjnLIZIZ = null;
        }
        if (C1389300mG0.LJIL(c0rjnLIZIZ)) {
            Aweme aweme2 = videoItemParams.getAweme();
            if (aweme2 != null && (author3 = aweme2.getAuthor()) != null && (allStoryMetadata3 = author3.getAllStoryMetadata()) != null && (list3 = allStoryMetadata3.disableStoryCircleScenes) != null) {
                return list3.contains(1);
            }
            return false;
        }
        if (c690870R8b != null) {
            c0rjnLIZIZ2 = c690870R8b.LIZIZ();
        } else {
            c0rjnLIZIZ2 = null;
        }
        if (C1389300mG0.LJIIIZ(c0rjnLIZIZ2)) {
            Aweme aweme3 = videoItemParams.getAweme();
            if (aweme3 != null && (author2 = aweme3.getAuthor()) != null && (allStoryMetadata2 = author2.getAllStoryMetadata()) != null && (list2 = allStoryMetadata2.disableStoryCircleScenes) != null) {
                return list2.contains(2);
            }
            return false;
        }
        if (c690870R8b != null) {
            c0rjnLIZIZ3 = c690870R8b.LIZIZ();
        }
        if (C1389300mG0.LJIIIIZZ(c0rjnLIZIZ3) && (aweme = videoItemParams.getAweme()) != null && (author = aweme.getAuthor()) != null && (allStoryMetadata = author.getAllStoryMetadata()) != null && (list = allStoryMetadata.disableStoryCircleScenes) != null) {
            return list.contains(3);
        }
        return false;
    }
}
