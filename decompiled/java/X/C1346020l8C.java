package X;

import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.CommentChannelConfig;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;

/* JADX INFO: renamed from: X.0l8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346020l8C {
    public static final String LIZ(Aweme aweme, EnumC1342450l2R enumC1342450l2R, String str) {
        AdStyleActionModel adStyleActionModel;
        CommentChannelConfig commentChannelConfig;
        String str2;
        if (aweme == null) {
            if (str == null) {
                return "";
            }
            return str;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (commentChannelConfig = adStyleActionModel.commentChannelConfig) != null && (str2 = commentChannelConfig.commentChannelName) != null && str2.length() > 0) {
            return str2;
        }
        int i = C1342470l2T.LIZ[enumC1342450l2R.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (!((Boolean) C0AGL.LIZ.getValue()).booleanValue()) {
                        if (str == null) {
                            return "";
                        }
                        return str;
                    }
                    List<AnchorCommonStruct> anchors = aweme.getAnchors();
                    if (anchors != null && !anchors.isEmpty()) {
                        for (AnchorCommonStruct anchorCommonStruct : anchors) {
                            if (anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_TT_CC_TEMPLATE.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_AIGT_TEMPLATE.getTYPE() || anchorCommonStruct.getType() == EnumC1430380nKG.ANCHOR_PHOTO_MODE_TEMPLATE.getTYPE()) {
                                return "tiktok_video_comment_publish_feed";
                            }
                        }
                    }
                    if (C1017070cZd.LJLL(aweme)) {
                        return "tiktok_video_comment_ecom_feed";
                    }
                    if (str == null) {
                        return "";
                    }
                    return str;
                }
                return "tiktok_video_comment_option_creator";
            }
            return "tiktok_video_comment_option_visual";
        }
        return "tiktok_video_comment_option_time";
    }
}
