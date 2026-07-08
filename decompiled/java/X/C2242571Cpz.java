package X;

import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.HighlightStoryComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import defpackage.BulletinExtraComponent;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cpz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242571Cpz {
    public static final boolean LIZ(AwemeCardTemplate awemeCardTemplate) {
        IconTypeComponent iconTypeComponent = awemeCardTemplate.fallbackInfo.image.iconType;
        if (iconTypeComponent != IconTypeComponent.ABNORMAL && iconTypeComponent != IconTypeComponent.RESTRICTED) {
            return false;
        }
        return true;
    }

    public static final AwemeCardTemplate LIZIZ(C2242581Cq0 c2242581Cq0, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        VideoCoverComponent videoCoverComponentLIZ;
        VideoCardFallbackInfoComponent videoCardFallbackInfoComponentLIZ;
        BaseUserComponent baseUserComponentLIZ;
        PreviewHintComponent previewHintComponentLIZ;
        BulletinExtraComponent bulletinExtraComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        TextComponent textComponentLIZ;
        HighlightStoryComponent highlightStoryComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C2237891CiR c2237891CiRDecode;
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
        C2242541Cpw c2242541Cpw = c2242581Cq0.user_info;
        if (c2242541Cpw != null) {
            baseUserComponentLIZ = C2242561Cpy.LIZ(c2242541Cpw);
        } else {
            BaseUserComponent.Companion.getClass();
            baseUserComponentLIZ = C2242511Cpt.LIZ();
        }
        C2243941CsC c2243941CsC = c2242581Cq0.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        ByteString byteString = c2242581Cq0.extra_content;
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (byteString != null && (c2237891CiRDecode = C2237891CiR.ADAPTER.decode(byteString)) != null) {
            bulletinExtraComponentLIZ = new BulletinExtraComponent(c2237891CiRDecode.expose_cnt.longValue());
        } else {
            BulletinExtraComponent.Companion.getClass();
            bulletinExtraComponentLIZ = BulletinExtraComponent.b.LIZ();
        }
        C1CH0 c1ch0 = c2242581Cq0.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2243521CrW c2243521CrW = c2242581Cq0.top_inline_text;
        if (c2243521CrW != null) {
            textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW);
        } else {
            textComponentLIZ = null;
        }
        C2240071Clx c2240071Clx = c2242581Cq0.highlight_story_info;
        if (c2240071Clx != null) {
            highlightStoryComponent = new HighlightStoryComponent(c2240071Clx.highlight_story_collection_id);
        } else {
            highlightStoryComponent = null;
        }
        C2241571CoN c2241571CoN = c2242581Cq0.resp_base;
        if (c2241571CoN != null) {
            baseResponseComponent = C2241581CoO.LIZIZ(c2241571CoN);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
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
        return new AwemeCardTemplate(videoCoverComponentLIZ, videoCardFallbackInfoComponentLIZ, baseUserComponentLIZ, textComponentLIZ, highlightStoryComponent, bulletinExtraComponentLIZ, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
