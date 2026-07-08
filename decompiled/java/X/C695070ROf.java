package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ROf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695070ROf {
    public static final boolean LIZ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null) {
            return Intrinsics.LJFF(paidContentInfo.isInnerFeedRecommend(), Boolean.TRUE);
        }
        return false;
    }
}
