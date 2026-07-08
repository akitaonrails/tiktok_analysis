package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICLACaptionService;

/* JADX INFO: renamed from: X.1604, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1604 {
    public static String LIZ(C160S c160s) {
        Aweme aweme;
        VideoItemParams videoItemParams = c160s.getVideoItemParams();
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            return aweme.getAid();
        }
        return null;
    }

    public static boolean LIZIZ(C160S c160s) {
        Aweme aweme;
        ICLACaptionService iCLACaptionServiceLIZ = C0RT2.LIZ();
        VideoItemParams videoItemParams = c160s.getVideoItemParams();
        if (videoItemParams != null) {
            aweme = videoItemParams.getAweme();
        } else {
            aweme = null;
        }
        return iCLACaptionServiceLIZ.LIZJ(aweme);
    }
}
