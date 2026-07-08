package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s2G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611420s2G {
    public static final boolean LIZ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        String pineDramaCardType;
        if (aweme != null) {
            if (!aweme.isAd()) {
                if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null && (pineDramaCardType = paidContentMiniDramaInfoLIZ.getPineDramaCardType()) != null && pineDramaCardType.length() != 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        if (aweme == null || aweme.getAwemeType() != 106) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Aweme aweme) {
        String pineDramaCardType;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        if (aweme != null && aweme.getAwemeType() == 106) {
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (paidContentInfo != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null) {
                pineDramaCardType = paidContentMiniDramaInfoLIZ.getPineDramaCardType();
            } else {
                pineDramaCardType = null;
            }
            if (Intrinsics.LJFF(pineDramaCardType, "mid_insert_blocking_card")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        String pineDramaCardType;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        if (aweme != null && aweme.getAwemeType() == 106) {
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (paidContentInfo != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null) {
                pineDramaCardType = paidContentMiniDramaInfoLIZ.getPineDramaCardType();
            } else {
                pineDramaCardType = null;
            }
            if (Intrinsics.LJFF(pineDramaCardType, "end_of_episode_completion_card")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJ(Aweme aweme) {
        String pineDramaCardType;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        if (aweme != null && aweme.getAwemeType() == 106) {
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (paidContentInfo != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null) {
                pineDramaCardType = paidContentMiniDramaInfoLIZ.getPineDramaCardType();
            } else {
                pineDramaCardType = null;
            }
            if (Intrinsics.LJFF(pineDramaCardType, "mid_insert_non_blocking_card")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
