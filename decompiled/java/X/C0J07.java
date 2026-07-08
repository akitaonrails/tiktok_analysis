package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.feed.exp.LivePreviewExtraCardConfig;
import com.ss.android.ugc.aweme.feed.exp.LivePreviewExtraCardDetail;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0J07, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J07 {
    public static final LivePreviewExtraCardConfig LIZ = new LivePreviewExtraCardConfig();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(380));

    public static LivePreviewExtraCardDetail LIZ(C0J09 c0j09) {
        int i = C0J08.LIZ[c0j09.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return ((LivePreviewExtraCardConfig) LIZIZ.getValue()).liveSurveyCardDetail;
            }
            return ((LivePreviewExtraCardConfig) LIZIZ.getValue()).aiSummaryCardDetail;
        }
        return ((LivePreviewExtraCardConfig) LIZIZ.getValue()).goLiveCardDetail;
    }

    public static final boolean LIZLLL(C0J09 c0j09) {
        LivePreviewExtraCardDetail livePreviewExtraCardDetailLIZ = LIZ(c0j09);
        if (livePreviewExtraCardDetailLIZ == null) {
            return false;
        }
        if (!livePreviewExtraCardDetailLIZ.optBgRoundCorner && !livePreviewExtraCardDetailLIZ.optBackgroundColor) {
            return false;
        }
        return true;
    }

    public static final Drawable LIZIZ(C0J09 c0j09, Context context, float f, int i) {
        LivePreviewExtraCardDetail livePreviewExtraCardDetailLIZ = LIZ(c0j09);
        if (livePreviewExtraCardDetailLIZ != null) {
            if (livePreviewExtraCardDetailLIZ.optBgRoundCorner) {
                f = C428220Gqi.LIZLLL;
            }
            if (livePreviewExtraCardDetailLIZ != null && livePreviewExtraCardDetailLIZ.optBackgroundColor) {
                i = R.attr.zg;
            }
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(f);
        c384050F3z.LIZIZ = Integer.valueOf(i);
        return c384050F3z.LIZ(context);
    }
}
