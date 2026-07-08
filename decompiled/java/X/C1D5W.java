package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.fyp.tag.EcVideoRecommendTagSwitch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.ECommerce;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.TTECContentTag;

/* JADX INFO: renamed from: X.1D5W, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D5W {
    public static boolean LIZ(Aweme aweme) {
        String str;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        ECommerce ecommerce;
        TTECContentTag tTECContentTag;
        AnchorBizUtils.LIZ.getClass();
        if (AnchorBizUtils.LJJJLL(aweme)) {
            if (((EcVideoRecommendTagSwitch) C1D5Y.LIZIZ.getValue()).customer != 1) {
                return false;
            }
        } else if (((EcVideoRecommendTagSwitch) C1D5Z.LIZIZ.getValue()).customer != 1) {
            return false;
        }
        if (AnchorBizUtils.LJJJJLI(aweme)) {
            if (aweme != null && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (ecommerce = standardBusinessModel.getEcommerce()) != null && (tTECContentTag = ecommerce.ttecContentTag) != null) {
                str = tTECContentTag.recommendationTagConsumerStr;
            } else {
                str = null;
            }
            if (C1533950q1J.LJ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
