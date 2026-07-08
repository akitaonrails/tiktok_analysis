package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692230RDh {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        Aweme aweme;
        if (!AwemeExtKt.isSharedStoryVisible(videoItemParams.getAweme()) || AwemeExtKt.isCommentPostInvisible(videoItemParams.getAweme()) || ((C729980SkG.LJIIIIZZ(videoItemParams.getAweme()) && (aweme = videoItemParams.getAweme()) != null && AwemeExtKt.isProhibited(aweme)) || C0OAD.LIZIZ(videoItemParams.getAweme()))) {
            return true;
        }
        return false;
    }
}
