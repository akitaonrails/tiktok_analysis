package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CtaDisplayConfig;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718190SFd {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        CtaDisplayConfig ctaDisplayConfig;
        PaidContentInfo paidContentInfo3;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ2;
        CtaDisplayConfig ctaDisplayConfig2;
        if (aweme == null || (paidContentInfo = aweme.mPaidContentInfo) == null || !Intrinsics.LJFF(paidContentInfo.getShouldShowBottomButton(), Boolean.TRUE) || aweme == null || (paidContentInfo2 = aweme.mPaidContentInfo) == null || (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo2)) == null || (ctaDisplayConfig = paidContentMiniDramaInfoLIZ.getCtaDisplayConfig()) == null || !Intrinsics.LJFF(ctaDisplayConfig.getShouldJointTitleToDesc(), Boolean.TRUE) || aweme == null || (paidContentInfo3 = aweme.mPaidContentInfo) == null || (paidContentMiniDramaInfoLIZ2 = C718180SFc.LIZ(paidContentInfo3)) == null || (ctaDisplayConfig2 = paidContentMiniDramaInfoLIZ2.getCtaDisplayConfig()) == null || !Intrinsics.LJFF(ctaDisplayConfig2.getShouldShowDoubleButton(), Boolean.FALSE)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        CtaDisplayConfig ctaDisplayConfig;
        PaidContentInfo paidContentInfo3;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ2;
        CtaDisplayConfig ctaDisplayConfig2;
        if (aweme == null || (paidContentInfo = aweme.mPaidContentInfo) == null || !Intrinsics.LJFF(paidContentInfo.getShouldShowBottomButton(), Boolean.TRUE) || aweme == null || (paidContentInfo2 = aweme.mPaidContentInfo) == null || (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo2)) == null || (ctaDisplayConfig = paidContentMiniDramaInfoLIZ.getCtaDisplayConfig()) == null || !Intrinsics.LJFF(ctaDisplayConfig.getShouldShowDoubleButton(), Boolean.TRUE) || aweme == null || (paidContentInfo3 = aweme.mPaidContentInfo) == null || (paidContentMiniDramaInfoLIZ2 = C718180SFc.LIZ(paidContentInfo3)) == null || (ctaDisplayConfig2 = paidContentMiniDramaInfoLIZ2.getCtaDisplayConfig()) == null || !Intrinsics.LJFF(ctaDisplayConfig2.getShouldJointTitleToDesc(), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        CtaDisplayConfig ctaDisplayConfig;
        if (aweme == null || (paidContentInfo = aweme.mPaidContentInfo) == null || !Intrinsics.LJFF(paidContentInfo.getShouldShowBottomButton(), Boolean.TRUE) || aweme == null || (paidContentInfo2 = aweme.mPaidContentInfo) == null || (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo2)) == null || (ctaDisplayConfig = paidContentMiniDramaInfoLIZ.getCtaDisplayConfig()) == null || !Intrinsics.LJFF(ctaDisplayConfig.getShouldShouldCover(), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Aweme aweme, String str) {
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        CtaDisplayConfig ctaDisplayConfig;
        if (aweme == null || (paidContentInfo = aweme.mPaidContentInfo) == null || !Intrinsics.LJFF(paidContentInfo.getShouldShowBottomButton(), Boolean.TRUE) || aweme == null || (paidContentInfo2 = aweme.mPaidContentInfo) == null || (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo2)) == null || (ctaDisplayConfig = paidContentMiniDramaInfoLIZ.getCtaDisplayConfig()) == null || !Intrinsics.LJFF(ctaDisplayConfig.getShouldShowImmersiveMode(), Boolean.TRUE)) {
            return false;
        }
        if (Intrinsics.LJFF(str, "paid_series_detail_page") && !C695070ROf.LIZ(aweme)) {
            return false;
        }
        return true;
    }
}
