package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0SDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717700SDg {
    public static String LIZ(VideoItemParams videoItemParams) {
        String str;
        C2189821An6 c2189821An6;
        User userLIZ = null;
        uid = null;
        String uid = null;
        if (LIZJ(videoItemParams)) {
            Aweme aweme = videoItemParams.getAweme();
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams != null && (c2189821An6 = baseFeedPageParams.param) != null) {
                uid = c2189821An6.getUid();
            }
            String str2 = "";
            if (uid == null) {
                uid = "";
            }
            BaseFeedPageParams baseFeedPageParams2 = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams2 != null && (str = baseFeedPageParams2.eventType) != null) {
                str2 = str;
            }
            userLIZ = C328100Ctc.LIZ(aweme, uid, str2);
        }
        return C1057880ddS.LIZIZ(videoItemParams.mEventType, userLIZ, videoItemParams.getAweme());
    }

    public static Boolean LIZIZ(String str) {
        String str2;
        if (str == null || TextUtils.isEmpty(str) || !C0BAK.LIZ() || (str2 = (String) C2539309xH.LIZ.getValue()) == null) {
            return null;
        }
        Boolean boolValueOf = Boolean.valueOf(new Regex(str2).matches(str));
        boolValueOf.booleanValue();
        return boolValueOf;
    }

    public static boolean LIZJ(VideoItemParams videoItemParams) {
        String str;
        C2189821An6 c2189821An6;
        String str2;
        if (C0SE1.LIZ()) {
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            String uid = null;
            if (baseFeedPageParams != null) {
                str = baseFeedPageParams.eventType;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, "personal_homepage")) {
                BaseFeedPageParams baseFeedPageParams2 = videoItemParams.baseFeedPageParams;
                if (baseFeedPageParams2 != null) {
                    str2 = baseFeedPageParams2.eventType;
                } else {
                    str2 = null;
                }
                if (!Intrinsics.LJFF(str2, "others_homepage")) {
                    return false;
                }
            }
            BaseFeedPageParams baseFeedPageParams3 = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams3 != null && (c2189821An6 = baseFeedPageParams3.param) != null) {
                uid = c2189821An6.getUid();
            }
            if (!Intrinsics.LJFF(uid, AwemeExtKt.getAuthorUid(videoItemParams.getAweme()))) {
                return true;
            }
            return false;
        }
        return false;
    }
}
