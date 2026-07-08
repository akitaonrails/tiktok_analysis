package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.AITheaterInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.feed.model.ShareToVideoStruct;
import com.ss.android.ugc.aweme.feed.model.UserBaseInfo;
import com.ss.android.ugc.aweme.feed.model.story.ShareToStoryStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735280Sso {
    public static final C735280Sso LIZ = new C735280Sso();

    public static final boolean LIZ(Aweme aweme) {
        ShareToStoryStruct share2StoryStruct;
        if (aweme == null) {
            return true;
        }
        ShareToVideoStruct share2VideoStruct = aweme.getShare2VideoStruct();
        if ((share2VideoStruct != null && share2VideoStruct.getSharePostType() == 1) || (((share2StoryStruct = aweme.getShare2StoryStruct()) != null && share2StoryStruct.shareStoryPostType == 1) || aweme.getAwemeType() == 40 || aweme.getIsTikTokStory())) {
            return true;
        }
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null && iAwemeService.wr(aweme)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        User author;
        if (aweme != null && (author = aweme.getAuthor()) != null && author.getFollowStatus() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Aweme aweme) {
        AwemeStatus statusSafety;
        if (aweme != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.getPrivateStatus() == 2) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Aweme aweme) {
        User author;
        if (aweme != null && (author = aweme.getAuthor()) != null && author.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        boolean z;
        AwemeStatus statusSafety;
        List<CameoInfo> cameoInfo;
        String userId;
        UserBaseInfo userBaseInfo;
        if (aweme != null) {
            AITheaterInfo aITheaterInfo = aweme.aiTheaterInfo;
            if (aITheaterInfo != null && (cameoInfo = aITheaterInfo.getCameoInfo()) != null && !cameoInfo.isEmpty()) {
                for (CameoInfo cameoInfo2 : cameoInfo) {
                    if (cameoInfo2 != null && (userBaseInfo = cameoInfo2.getUserBaseInfo()) != null) {
                        userId = userBaseInfo.getUserId();
                    } else {
                        userId = null;
                    }
                    if (Intrinsics.LJFF(userId, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            if (aweme != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.getPrivateStatus() == 2) {
                User author = aweme.getAuthor();
                if ((author == null || author.getFollowStatus() != 2) && !C729980SkG.LJIIIIZZ(aweme) && !z) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean LJFF(Aweme aweme) {
        AwemeStatus statusSafety;
        if (aweme != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.getPrivateStatus() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJI(Aweme aweme) {
        AwemeStatus statusSafety;
        if (aweme != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.getPrivateStatus() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(Aweme aweme) {
        if (aweme.getAuthor() == null) {
            return false;
        }
        if (C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
            return ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isSecret();
        }
        return aweme.getAuthor().isSecret();
    }

    public static boolean LJIIIIZZ(Aweme aweme) {
        if (aweme != null && aweme.isSubOnlyVideo()) {
            return true;
        }
        return false;
    }
}
