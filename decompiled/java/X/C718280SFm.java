package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.series.commonfeed.component.bottombanner.SeriesBottomBannerButtonType;
import java.util.Locale;

/* JADX INFO: renamed from: X.0SFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718280SFm {
    public static final C718280SFm LIZ = new C718280SFm();

    public static void LIZ(String str, Aweme aweme, SeriesBottomBannerButtonType seriesBottomBannerButtonType, String str2) {
        String string;
        String strLJ;
        PaidContentInfo paidContentInfo;
        String aid;
        PaidContentInfo paidContentInfo2;
        PaidContentInfo paidContentInfo3;
        String str3 = "";
        if (aweme == null || (paidContentInfo3 = aweme.mPaidContentInfo) == null || (string = Long.valueOf(paidContentInfo3.getPaidCollectionId()).toString()) == null) {
            string = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("collection_id", string);
        c2344009Gk.LJIIIIZZ("button_content", seriesBottomBannerButtonType.name().toLowerCase(Locale.ROOT));
        Long lValueOf = null;
        if (aweme != null) {
            strLJ = C718180SFc.LJ(aweme);
        } else {
            strLJ = null;
        }
        c2344009Gk.LJIIIIZZ("series_video_type", strLJ);
        if (aweme != null && (paidContentInfo2 = aweme.mPaidContentInfo) != null) {
            lValueOf = Long.valueOf(paidContentInfo2.getCategory());
        }
        c2344009Gk.LJ(lValueOf, "series_category");
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str3);
        boolean z = true;
        if (aweme == null || (((paidContentInfo = aweme.mPaidContentInfo) == null || !paidContentInfo.isLimitedFreeShortDrama()) && !C718300SFo.LIZ(aweme))) {
            z = false;
        }
        C718270SFl.LIZ(c2344009Gk, z);
        C0RRR.LIZ(c2344009Gk);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }
}
