package X;

import com.ss.android.ugc.aweme.im.message.template.card.PortraitCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: renamed from: X.1Cpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242421Cpk {
    public static final PortraitCardTemplate LIZ(C2242401Cpi c2242401Cpi, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        BaseUserComponent baseUserComponentLIZ;
        ImageComponent imageComponentLIZJ;
        TextComponent textComponentLIZ;
        TextComponent textComponentLIZ2;
        TextComponent textComponentLIZ3;
        ActionLinkComponent actionLinkComponentLIZ;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C2242541Cpw c2242541Cpw = c2242401Cpi.user_info;
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (c2242541Cpw != null) {
            baseUserComponentLIZ = C2242561Cpy.LIZ(c2242541Cpw);
        } else {
            baseUserComponentLIZ = null;
        }
        C2244091CsR c2244091CsR = c2242401Cpi.image;
        if (c2244091CsR != null) {
            imageComponentLIZJ = C2244081CsQ.LIZJ(c2244091CsR);
        } else {
            imageComponentLIZJ = null;
        }
        C2243521CrW c2243521CrW = c2242401Cpi.title;
        if (c2243521CrW != null) {
            textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW);
        } else {
            textComponentLIZ = null;
        }
        C2243521CrW c2243521CrW2 = c2242401Cpi.sub_title;
        if (c2243521CrW2 != null) {
            textComponentLIZ2 = C2243551CrZ.LIZ(c2243521CrW2);
        } else {
            textComponentLIZ2 = null;
        }
        C2243521CrW c2243521CrW3 = c2242401Cpi.hint_title;
        if (c2243521CrW3 != null) {
            textComponentLIZ3 = C2243551CrZ.LIZ(c2243521CrW3);
        } else {
            textComponentLIZ3 = null;
        }
        C2244321Cso c2244321Cso = c2242401Cpi.link_info;
        if (c2244321Cso != null) {
            actionLinkComponentLIZ = C2244351Csr.LIZ(c2244321Cso);
        } else {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        C2243941CsC c2243941CsC = c2242401Cpi.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2242401Cpi.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2242401Cpi.resp_base;
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
        return new PortraitCardTemplate(imageComponentLIZJ, baseUserComponentLIZ, textComponentLIZ, textComponentLIZ2, textComponentLIZ3, actionLinkComponentLIZ, previewHintComponentLIZ, baseResponseComponent, baseRequestComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
