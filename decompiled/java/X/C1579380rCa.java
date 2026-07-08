package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.MiniDramaAccountService;

/* JADX INFO: renamed from: X.0rCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579380rCa {
    public static final boolean LIZ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        String curUserId;
        String uid;
        if (aweme != null && aweme.isPaidContent && (paidContentInfo = aweme.mPaidContentInfo) != null && !paidContentInfo.getShouldShowPreview() && !paidContentInfo.isVideoPurchased() && !paidContentInfo.isSeriesPurchased() && !paidContentInfo.isPaidCollectionIntro()) {
            MiniDramaAccountService.LIZ.getClass();
            MiniDramaAccountService miniDramaAccountServiceLIZ = C1578660rBQ.LIZ();
            if (miniDramaAccountServiceLIZ != null && (curUserId = miniDramaAccountServiceLIZ.getCurUserId()) != null) {
                User author = aweme.getAuthor();
                if (author == null || (uid = author.getUid()) == null) {
                    uid = "";
                }
                if (curUserId.equals(uid)) {
                    return false;
                }
            }
            if (!paidContentInfo.isLimitedFreeShortDrama()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
