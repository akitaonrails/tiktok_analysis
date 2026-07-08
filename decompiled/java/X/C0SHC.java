package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SHC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SHC {
    public static boolean LIZ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (aweme != null) {
            paidContentInfo = aweme.mPaidContentInfo;
        } else {
            paidContentInfo = null;
        }
        if (C286700BLo.LIZ() && paidContentInfo != null && Intrinsics.LJFF(paidContentInfo.isSubscriptionActive(), Boolean.TRUE)) {
            Long subscriptionExpiredTime = paidContentInfo.getSubscriptionExpiredTime();
            if (subscriptionExpiredTime != null) {
                jLongValue = subscriptionExpiredTime.longValue();
            } else {
                jLongValue = 0;
            }
            if (jLongValue > jCurrentTimeMillis) {
                return true;
            }
            return false;
        }
        return false;
    }
}
