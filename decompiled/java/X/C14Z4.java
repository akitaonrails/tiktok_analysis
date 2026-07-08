package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.survey.FeedSurveyConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Z4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14Z4 {
    public static final C14Z0 LIZ(Aweme aweme) {
        FeedSurveyConfig feedSurveyConfig;
        List<Integer> list;
        boolean zIsLive;
        boolean zIsPhotoMode;
        if (aweme != null) {
            if (AwemeBizExtKt.isSubAweme(aweme)) {
                zIsLive = Intrinsics.LJFF("live_sub_aweme_type", aweme.getLiveType());
            } else {
                zIsLive = AwemeSaaSExtKt.isLive(aweme);
            }
            if (zIsLive) {
                return C14Z0.LIVE_TYPE;
            }
            if (aweme != null) {
                if (AwemeBizExtKt.isSubAweme(aweme)) {
                    zIsPhotoMode = Intrinsics.LJFF("photo_sub_aweme_type", aweme.getExtra());
                } else {
                    zIsPhotoMode = AwemeExtKt.isPhotoMode(aweme);
                }
                if (zIsPhotoMode) {
                    return C14Z0.PHOTO_TYPE;
                }
            }
        }
        C14ZW.LIZ.getClass();
        C14ZG c14zgLJI = C14ZW.LJI(aweme);
        if (c14zgLJI != null && (feedSurveyConfig = c14zgLJI.LJI) != null && (list = feedSurveyConfig.multiSurveyTypes) != null && list.contains(Integer.valueOf(C14Z0.PROFILE_TYPE.getType()))) {
            return C14Z0.PROFILE_TYPE;
        }
        return C14Z0.FEED_TYPE;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (C14ZW.LIZLLL(aweme) != C14Z5.BACKGROUND.getType() && C14ZW.LIZLLL(aweme) != C14Z5.COMMON_BACKGROUND_LYNX.getType()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Aweme aweme) {
        if (aweme == null || C14ZW.LIZIZ(aweme) != 7 || !LIZLLL(aweme)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        int iLIZLLL = C14ZW.LIZLLL(aweme);
        if (iLIZLLL != C14Z5.NOT_USE.getType() && iLIZLLL != C14Z5.DIALOG.getType() && iLIZLLL != C14Z5.FLOATING.getType()) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        int iLIZLLL = C14ZW.LIZLLL(aweme);
        if (iLIZLLL != C14Z5.FORCE_VIDEO.getType() && iLIZLLL != C14Z5.FORCE_VIDEO_NO_COVER.getType() && iLIZLLL != C14Z5.FORCE_VIDEO_LYNX.getType() && iLIZLLL != C14Z5.COMMON_FORCE_VIDEO_LYNX.getType()) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(Aweme aweme) {
        if (aweme == null || C14ZW.LIZLLL(aweme) != C14Z5.GREY_CARD.getType()) {
            return false;
        }
        return true;
    }
}
