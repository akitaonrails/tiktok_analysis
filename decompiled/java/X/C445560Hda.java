package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hda, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445560Hda {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        String uid;
        if (!C441280HSc.LIZ()) {
            return false;
        }
        Aweme aweme = videoItemParams.getAweme();
        if (!C729510SjV.LJJIJIL(aweme)) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        if (!Intrinsics.LJFF(uid, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) && C453800Hqs.LIZIZ(aweme)) {
            return true;
        }
        ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarDebugService.class, false, false, false, 14, null);
        if (iSocialAvatarDebugService == null) {
            return false;
        }
        iSocialAvatarDebugService.LJIIIZ();
        return false;
    }
}
