package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RyN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713250RyN {
    public static final C713250RyN LIZ = new C713250RyN();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(354));

    public static int LIZ(VideoItemParams videoItemParams) {
        if ((Intrinsics.LJFF(videoItemParams.mEventType, "personal_homepage") && videoItemParams.isFromPostList) || (Intrinsics.LJFF(videoItemParams.mFrom, "others_homepage") && videoItemParams.isFromPostList)) {
            return C2277881EDy.LIZIZ.getProfileSortType();
        }
        return 0;
    }

    public static boolean LIZIZ(Aweme aweme) {
        C0K77 c0k77;
        String str;
        if (aweme == null) {
            return false;
        }
        if (aweme.isPaidContent) {
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (paidContentInfo != null) {
                if (paidContentInfo.isVideoPurchased() || paidContentInfo.isLimitedFreeShortDrama() || paidContentInfo.isSeriesPurchased() || C1594680rbG.LJIIIIZZ(aweme) || paidContentInfo.getShouldShowPreview() || paidContentInfo.isPaidCollectionIntro()) {
                    return false;
                }
                HashMap<String, String> mobParams = aweme.getMobParams();
                if (mobParams != null) {
                    str = mobParams.get("enter_from");
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, "paid_series_detail_page")) {
                    return false;
                }
            }
        } else if (!aweme.isAd() && !AwemeExtKt.isPhotoMode(aweme) && !AwemeSaaSExtKt.isLive(aweme) && (((c0k77 = (C0K77) LIZIZ.getValue()) == null || !c0k77.LJIJJ(aweme)) && (!C1594680rbG.LJIIIIZZ(aweme) || C713260RyO.LIZ))) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Aweme aweme) {
        int duration;
        int i;
        Video video;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            duration = video.getDuration();
        } else {
            duration = 0;
        }
        int i2 = C2530909vv.LIZ;
        if (i2 > 0) {
            if (duration <= i2) {
                return false;
            }
            return true;
        }
        if (C713270RyP.LIZ) {
            return true;
        }
        C695370RPj.LIZ.getClass();
        if (C695370RPj.LIZ(aweme).LIZLLL()) {
            i = C538540LAe.LLJJJIL;
        } else {
            i = 30000;
        }
        if (duration <= i) {
            return false;
        }
        return true;
    }
}
