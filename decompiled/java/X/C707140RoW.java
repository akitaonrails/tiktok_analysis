package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RoW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707140RoW {
    public static final boolean LIZ(VideoItemParams videoItemParams) {
        boolean zEquals;
        AwemeRiskModel awemeRiskModel;
        AwemeRiskModel awemeRiskModel2;
        String url;
        AwemeRiskModel awemeRiskModel3;
        if (videoItemParams.getAweme().isAd() || !C729980SkG.LJIIJJI(videoItemParams.getAweme())) {
            return false;
        }
        Aweme aweme = videoItemParams.getAweme();
        if (aweme.getAwemeRiskModel() != null && (awemeRiskModel3 = aweme.getAwemeRiskModel()) != null && awemeRiskModel3.getUrl() != null && !TextUtils.isEmpty(aweme.getAwemeRiskModel().getUrl())) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(aweme.getAwemeRiskModel().getUrl()), "tag_id");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
            }
            zEquals = TextUtils.equals("356", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
        } else {
            zEquals = false;
        }
        if (!zEquals ? (awemeRiskModel = aweme.getAwemeRiskModel()) == null || !awemeRiskModel.isNotice() || (awemeRiskModel2 = aweme.getAwemeRiskModel()) == null || (url = awemeRiskModel2.getUrl()) == null || url.length() == 0 : !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_fact_checking_notice_tag", true, false)) {
            BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
            if (baseFeedPageParams == null) {
                return false;
            }
            int i = BubbleListAssem.LLLI;
            if (!C0ROI.LIZIZ(baseFeedPageParams, videoItemParams.getAweme(), null) || !C660360PvG.LIZ(videoItemParams.getAweme())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LIZIZ(Aweme aweme) {
        if (!C291190BbB.LIZ() || aweme == null) {
            return false;
        }
        return AwemeExtKt.isProhibitedAndShouldTell(aweme);
    }
}
