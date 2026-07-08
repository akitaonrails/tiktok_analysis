package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentMiniDramaInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718180SFc {
    public static final PaidContentMiniDramaInfo LIZ(PaidContentInfo paidContentInfo) {
        boolean z;
        Object c098200Yq;
        String miniDramaInfo = paidContentInfo.getMiniDramaInfo();
        if (miniDramaInfo != null && miniDramaInfo.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        if (paidContentInfo.getPaidContentMiniDramaInfo() == null) {
            try {
                c098200Yq = (PaidContentMiniDramaInfo) C09C2.LIZ().LJII(paidContentInfo.getMiniDramaInfo(), PaidContentMiniDramaInfo.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            paidContentInfo.setPaidContentMiniDramaInfo((PaidContentMiniDramaInfo) obj);
        }
        return paidContentInfo.getPaidContentMiniDramaInfo();
    }

    public static final String LIZIZ(Aweme aweme) {
        Map<String, String> logExtra;
        boolean z;
        Object c098200Yq;
        PaidContentInfo paidContentInfo;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        Object obj = null;
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (paidContentMiniDramaInfoLIZ = LIZ(paidContentInfo)) != null) {
            logExtra = paidContentMiniDramaInfoLIZ.getLogExtra();
        } else {
            logExtra = null;
        }
        if (logExtra != null && !logExtra.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            c098200Yq = C09C2.LIZ().LJIILL(logExtra);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LJ(Aweme aweme) {
        String seriesVideoType;
        PaidContentMiniDramaInfo paidContentMiniDramaInfoLIZ;
        if (aweme != null) {
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (paidContentInfo != null && (paidContentMiniDramaInfoLIZ = LIZ(paidContentInfo)) != null) {
                seriesVideoType = paidContentMiniDramaInfoLIZ.getSeriesVideoType();
            } else {
                seriesVideoType = null;
            }
            if (seriesVideoType != null && seriesVideoType.length() != 0) {
                return seriesVideoType;
            }
            if (aweme != null && aweme.isPaidContent) {
                if (C718510SGj.LIZJ(aweme)) {
                    return "series_highlight_video";
                }
                PaidContentInfo paidContentInfo2 = aweme.mPaidContentInfo;
                if (paidContentInfo2 != null && paidContentInfo2.isPaidCollectionIntro()) {
                    return "series_trailer_video";
                }
                return "series_video";
            }
        }
        return null;
    }

    public static String LIZJ(Aweme aweme, String str) {
        Boolean bool = Boolean.TRUE;
        if (C718190SFd.LIZIZ(aweme)) {
            return "dual_button";
        }
        if (C718190SFd.LIZJ(aweme)) {
            return "short_drama_card";
        }
        if (C718190SFd.LIZLLL(aweme, str)) {
            return "breathing_light";
        }
        if (Intrinsics.LJFF(bool, bool)) {
            return "single_button";
        }
        return "bottom_button";
    }

    public static final String LIZLLL(Aweme aweme, String str) {
        HashMap<String, String> mobParams;
        String str2 = null;
        if (C123100dR.LIZ(str) && str != null) {
            str2 = str;
        } else if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
            str2 = mobParams.get("enter_from");
        }
        if (str2 == null) {
            return "";
        }
        int iHashCode = str2.hashCode();
        if (iHashCode != -908000280) {
            if (iHashCode != 1691937916) {
                if (iHashCode != 1998809160 || !str2.equals("paid_series_detail_page") || !C695070ROf.LIZ(aweme)) {
                    return "";
                }
                return "502";
            }
            if (!str2.equals("homepage_hot")) {
                return "";
            }
            return "112";
        }
        if (!str2.equals("homepage_series")) {
            return "";
        }
        return "501";
    }
}
