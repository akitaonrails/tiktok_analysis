package X;

import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696140RSi {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        if (C296920BkQ.LIZ() || (paidContentInfo = videoItemParams.getAweme().mPaidContentInfo) == null || !paidContentInfo.getShouldShowPreview() || (((paidContentInfo2 = videoItemParams.getAweme().mPaidContentInfo) != null && paidContentInfo2.isVideoPurchased()) || !Intrinsics.LJFF(videoItemParams.mEventType, "paid_series_detail_page") || C695070ROf.LIZ(videoItemParams.getAweme()))) {
            return false;
        }
        return true;
    }
}
