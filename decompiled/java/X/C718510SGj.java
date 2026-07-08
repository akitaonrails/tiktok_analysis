package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718510SGj {
    public static final boolean LIZIZ(Aweme aweme) {
        String str;
        HashMap<String, String> mobParams;
        HashMap<String, String> mobParams2;
        String str2 = null;
        if (aweme != null && (mobParams2 = aweme.getMobParams()) != null) {
            str = mobParams2.get("is_forced_insertion");
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "1")) {
            if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
                str2 = mobParams.get("is_from_forced_insertion");
            }
            if (!Intrinsics.LJFF(str2, "1")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LIZJ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = C718180SFc.LIZ(paidContentInfo)) != null) {
            return Intrinsics.LJFF(paidContentMiniDramaInfoLIZ.isHighLight(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        Video video;
        if (aweme != null && (video = aweme.getVideo()) != null && video.getPlayAddr() != null) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.isAd()) {
            return true;
        }
        PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
        if (paidContentInfo == null) {
            return false;
        }
        if ((!paidContentInfo.getShouldShowVideoInteractions() && !paidContentInfo.isLimitedFreeShortDrama() && !paidContentInfo.isPaidCollectionIntro() && !paidContentInfo.getShouldShowPreview()) || !aweme.isPaidContent) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(Aweme aweme, String str) {
        String aid;
        HashMap<String, String> mobParams;
        if (str != null) {
            String str2 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (!Intrinsics.LJFF(aid, str)) {
                if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
                    str2 = mobParams.get("original_aid");
                }
                if (Intrinsics.LJFF(str2, str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
