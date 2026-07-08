package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697070RVx {
    public static boolean LIZ(VideoItemParams videoItemParams, boolean z) {
        String aid;
        Aweme aweme;
        User sharer;
        String uid;
        String curUserId;
        boolean z2;
        User sharer2;
        Aweme aweme2 = videoItemParams.getAweme();
        if (aweme2 == null || (aid = aweme2.getAid()) == null || C1230620i84.LIZ(aid) != null || (aweme = videoItemParams.getAweme()) == null || (sharer = AwemeBizExtKt.getSharer(aweme)) == null || (uid = sharer.getUid()) == null) {
            return false;
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId();
        } else {
            curUserId = null;
        }
        if (!Intrinsics.LJFF(uid, curUserId) && TextUtils.equals(videoItemParams.mEventType, "homepage_hot") && !TextUtils.equals(videoItemParams.mEventType, "chat")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && (C1336205Ku.LIZJ().LIZJ() || C1336205Ku.LIZ(false).getImPrivacySettings().LJI() || (sharer2 = AwemeBizExtKt.getSharer(videoItemParams.getAweme())) == null || sharer2.getFollowStatus() != 2)) {
            return false;
        }
        return z2;
    }
}
