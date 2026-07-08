package X;

import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MDPTemplatePinReason;
import com.ss.android.ugc.aweme.music.model.Music;

/* JADX INFO: renamed from: X.0mV7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398670mV7 {
    public static final C1398670mV7 LIZ = new C1398670mV7();

    public static final boolean LIZ(Aweme aweme) {
        ICommerceMediaService iCommerceMediaService;
        if (!C297030Bkb.LIZ() || (iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null)) == null || iCommerceMediaService.LIZLLL() || aweme == null || aweme.getMdpTemplatePinReason() == null) {
            return false;
        }
        return true;
    }

    public static final MDPRecommendTemplateInfo LIZIZ(Aweme aweme) {
        String reason;
        Integer ttTemplatePinType;
        String templateId;
        String templateType;
        String aid = aweme.getAid();
        MDPTemplatePinReason mdpTemplatePinReason = aweme.getMdpTemplatePinReason();
        String idStr = null;
        if (mdpTemplatePinReason != null) {
            reason = mdpTemplatePinReason.getReason();
        } else {
            reason = null;
        }
        MDPTemplatePinReason mdpTemplatePinReason2 = aweme.getMdpTemplatePinReason();
        if (mdpTemplatePinReason2 != null) {
            ttTemplatePinType = mdpTemplatePinReason2.getTtTemplatePinType();
        } else {
            ttTemplatePinType = null;
        }
        MDPTemplatePinReason mdpTemplatePinReason3 = aweme.getMdpTemplatePinReason();
        if (mdpTemplatePinReason3 != null) {
            templateId = mdpTemplatePinReason3.getTemplateId();
        } else {
            templateId = null;
        }
        MDPTemplatePinReason mdpTemplatePinReason4 = aweme.getMdpTemplatePinReason();
        if (mdpTemplatePinReason4 != null) {
            templateType = mdpTemplatePinReason4.getTemplateType();
        } else {
            templateType = null;
        }
        Music music = aweme.getMusic();
        if (music != null) {
            idStr = music.getIdStr();
        }
        return new MDPRecommendTemplateInfo(aid, reason, ttTemplatePinType, templateId, templateType, idStr);
    }
}
