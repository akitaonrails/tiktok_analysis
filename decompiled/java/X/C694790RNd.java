package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0RNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694790RNd {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        Aweme aweme;
        User author;
        if (C298540Bn2.LIZ()) {
            Aweme aweme2 = videoItemParams.getAweme();
            User author2 = null;
            if (aweme2 != null) {
                author2 = aweme2.getAuthor();
            }
            if (C10EU.LJIILJJIL(author2) && (aweme = videoItemParams.getAweme()) != null && (author = aweme.getAuthor()) != null && author.getMatchedFriendStruct() != null) {
                return true;
            }
            return false;
        }
        return false;
    }
}
