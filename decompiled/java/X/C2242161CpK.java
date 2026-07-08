package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PictureCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import defpackage.BulletinExtraComponent;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242161CpK {
    public static final boolean LIZ(BaseTemplate baseTemplate) {
        AttachmentTypeComponent attachmentTypeComponent;
        AttachmentComponent attachmentComponentHs;
        if (baseTemplate == null) {
            return false;
        }
        AttachmentComponent attachmentComponentHs2 = baseTemplate.Hs();
        if (attachmentComponentHs2 != null) {
            attachmentTypeComponent = attachmentComponentHs2.type;
        } else {
            attachmentTypeComponent = null;
        }
        if (attachmentTypeComponent != AttachmentTypeComponent.ATTACHMENT_TYPE_STORY_REPLY || (attachmentComponentHs = baseTemplate.Hs()) == null || !attachmentComponentHs.isStory) {
            return false;
        }
        return true;
    }

    public static final PictureCardTemplate LIZIZ(C2242181CpM c2242181CpM, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        ImageComponent imageComponentLIZ;
        ImageComponent imageComponentLIZ2;
        PictureCardFallbackInfoComponent pictureCardFallbackInfoComponent;
        ActionLinkComponent actionLinkComponentLIZ;
        BulletinExtraComponent bulletinExtraComponentLIZ;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C2237891CiR c2237891CiRDecode;
        ImageComponent imageComponentLIZ3;
        TextComponent textComponentLIZ;
        ActionLinkComponent actionLinkComponentLIZ2;
        C2244091CsR c2244091CsR = c2242181CpM.image;
        if (c2244091CsR != null) {
            imageComponentLIZ = C2244081CsQ.LIZJ(c2244091CsR);
        } else {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        }
        C2244091CsR c2244091CsR2 = c2242181CpM.thumbnail;
        if (c2244091CsR2 != null) {
            imageComponentLIZ2 = C2244081CsQ.LIZJ(c2244091CsR2);
        } else {
            ImageComponent.Companion.getClass();
            imageComponentLIZ2 = C18ZU.LIZ();
        }
        C2242201CpO c2242201CpO = c2242181CpM.fallback;
        if (c2242201CpO != null) {
            C2244091CsR c2244091CsR3 = c2242201CpO.image;
            if (c2244091CsR3 != null) {
                imageComponentLIZ3 = C2244081CsQ.LIZJ(c2244091CsR3);
            } else {
                ImageComponent.Companion.getClass();
                imageComponentLIZ3 = C18ZU.LIZ();
            }
            C2243521CrW c2243521CrW = c2242201CpO.text;
            if (c2243521CrW == null || (textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW)) == null) {
                TextComponent.Companion.getClass();
                textComponentLIZ = C2243491CrT.LIZ();
            }
            C2244321Cso c2244321Cso = c2242201CpO.link_info;
            if (c2244321Cso != null) {
                actionLinkComponentLIZ2 = C2244351Csr.LIZ(c2244321Cso);
            } else {
                ActionLinkComponent.Companion.getClass();
                actionLinkComponentLIZ2 = C2244301Csm.LIZ();
            }
            pictureCardFallbackInfoComponent = new PictureCardFallbackInfoComponent(actionLinkComponentLIZ2, imageComponentLIZ3, textComponentLIZ);
        } else {
            PictureCardFallbackInfoComponent.Companion.getClass();
            pictureCardFallbackInfoComponent = PictureCardFallbackInfoComponent.EMPTY_FALLBACK;
        }
        C2244321Cso c2244321Cso2 = c2242181CpM.link_info;
        if (c2244321Cso2 != null) {
            actionLinkComponentLIZ = C2244351Csr.LIZ(c2244321Cso2);
        } else {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        ByteString byteString = c2242181CpM.extra_content;
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (byteString != null && (c2237891CiRDecode = C2237891CiR.ADAPTER.decode(byteString)) != null) {
            bulletinExtraComponentLIZ = new BulletinExtraComponent(c2237891CiRDecode.expose_cnt.longValue());
        } else {
            BulletinExtraComponent.Companion.getClass();
            bulletinExtraComponentLIZ = BulletinExtraComponent.b.LIZ();
        }
        C2243941CsC c2243941CsC = c2242181CpM.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2242181CpM.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2242181CpM.resp_base;
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
        return new PictureCardTemplate(imageComponentLIZ, imageComponentLIZ2, pictureCardFallbackInfoComponent, actionLinkComponentLIZ, bulletinExtraComponentLIZ, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
