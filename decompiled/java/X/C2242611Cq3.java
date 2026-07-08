package X;

import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;

/* JADX INFO: renamed from: X.1Cq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242611Cq3 {
    public static final VideoCardTemplate LIZ(C2242581Cq0 c2242581Cq0, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        VideoCoverComponent videoCoverComponentLIZ;
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponentLIZ;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C2244101CsS c2244101CsS = c2242581Cq0.video;
        if (c2244101CsS != null) {
            videoCoverComponentLIZ = C2244131CsV.LIZ(c2244101CsS);
        } else {
            VideoCoverComponent.Companion.getClass();
            videoCoverComponentLIZ = VideoCoverComponent.EMPTY_VIDEO_COVER;
        }
        C2242721CqE c2242721CqE = c2242581Cq0.fallback;
        if (c2242721CqE != null) {
            videoCardFallbackInfoComponentLIZ = C2242711CqD.LIZ(c2242721CqE);
        } else {
            VideoCardFallbackInfoComponent.Companion.getClass();
            videoCardFallbackInfoComponentLIZ = VideoCardFallbackInfoComponent.EMPTY_FALLBACK;
        }
        C2243941CsC c2243941CsC = c2242581Cq0.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2242581Cq0.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2242581Cq0.resp_base;
        if (c2241571CoN != null) {
            baseResponseComponent = C2241581CoO.LIZIZ(c2241571CoN);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (c2242771CqJ != null) {
            attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ);
        } else {
            attachmentComponentLIZ = null;
        }
        if (c2242321Cpa != null) {
            baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
        } else {
            baseHeaderComponentLIZIZ = null;
        }
        if (c2242801CqM != null) {
            baseFooterComponentLIZ = C2242841CqQ.LIZ(c2242801CqM);
        }
        return new VideoCardTemplate(videoCoverComponentLIZ, videoCardFallbackInfoComponentLIZ, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
