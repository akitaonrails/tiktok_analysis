package X;

import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.imagecard.ImageCardTitleBar;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1Cqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243031Cqj {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    public static final ImageCardTemplate LIZ(C2243041Cqk c2243041Cqk, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        ImageCardTitleBar value;
        ActionLinkComponent actionLinkComponentLIZ;
        PreviewHintComponent previewHintComponentLIZ;
        ?? arrayList;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        ImageComponent imageComponentLIZ;
        TextComponent textComponentLIZ;
        TextComponent textComponentLIZ2;
        ButtonComponent buttonComponent;
        C2243521CrW c2243521CrW;
        TextComponent textComponentLIZ3;
        ActionLinkComponent actionLinkComponentLIZ2;
        C2243061Cqm c2243061Cqm = c2243041Cqk.title;
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (c2243061Cqm != null) {
            C2244091CsR c2244091CsR = c2243061Cqm.image;
            if (c2244091CsR != null) {
                imageComponentLIZ = C2244081CsQ.LIZJ(c2244091CsR);
            } else {
                ImageComponent.Companion.getClass();
                imageComponentLIZ = C18ZU.LIZ();
            }
            C2243521CrW c2243521CrW2 = c2243061Cqm.title;
            if (c2243521CrW2 == null || (textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW2)) == null) {
                TextComponent.Companion.getClass();
                textComponentLIZ = C2243491CrT.LIZ();
            }
            C2243521CrW c2243521CrW3 = c2243061Cqm.subtitle;
            if (c2243521CrW3 == null || (textComponentLIZ2 = C2243551CrZ.LIZ(c2243521CrW3)) == null) {
                TextComponent.Companion.getClass();
                textComponentLIZ2 = C2243491CrT.LIZ();
            }
            C2243081Cqo c2243081Cqo = c2243061Cqm.button;
            if (c2243081Cqo != null && (c2243521CrW = c2243081Cqo.text) != null && (textComponentLIZ3 = C2243551CrZ.LIZ(c2243521CrW)) != null) {
                C2244321Cso c2244321Cso = c2243081Cqo.link_info;
                if (c2244321Cso != null) {
                    actionLinkComponentLIZ2 = C2244351Csr.LIZ(c2244321Cso);
                } else {
                    ActionLinkComponent.Companion.getClass();
                    actionLinkComponentLIZ2 = C2244301Csm.LIZ();
                }
                buttonComponent = new ButtonComponent(textComponentLIZ3, actionLinkComponentLIZ2);
            } else {
                buttonComponent = null;
            }
            value = new ImageCardTitleBar(imageComponentLIZ, textComponentLIZ, textComponentLIZ2, buttonComponent);
        } else {
            ImageCardTitleBar.Companion.getClass();
            value = ImageCardTitleBar.EMPTY_IMAGE_CARD_TITLE_BAR$delegate.getValue();
        }
        C2244321Cso c2244321Cso2 = c2243041Cqk.link_info;
        if (c2244321Cso2 != null) {
            actionLinkComponentLIZ = C2244351Csr.LIZ(c2244321Cso2);
        } else {
            ActionLinkComponent.Companion.getClass();
            actionLinkComponentLIZ = C2244301Csm.LIZ();
        }
        C2243941CsC c2243941CsC = c2243041Cqk.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        List<C2244101CsS> list = c2243041Cqk.videos;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<C2244101CsS> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C2244131CsV.LIZ(it2.next()));
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C1CH0 c1ch0 = c2243041Cqk.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2243041Cqk.resp_base;
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
        return new ImageCardTemplate(value, actionLinkComponentLIZ, arrayList, previewHintComponentLIZ, baseResponseComponent, baseRequestComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
