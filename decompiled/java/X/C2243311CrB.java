package X;

import com.ss.android.ugc.aweme.im.message.template.card.InfoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.CardButtonType;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardContentComponent;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardTitleBarComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1CrB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243311CrB {
    public static final InfoCardTemplate LIZ(C2243301CrA c2243301CrA, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        TextComponent textComponentLIZ;
        TextComponent textComponentLIZ2;
        ImageComponent imageComponentLIZ;
        InfoCardContentComponent infoCardContentComponent;
        VideoCoverComponent videoCoverComponentLIZ;
        ActionLinkComponent actionLinkComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        BaseFooterComponent baseFooterComponentLIZ;
        CardButtonType cardButtonType;
        C2243521CrW c2243521CrW;
        C2243361CrG c2243361CrG = c2243301CrA.title;
        if (c2243361CrG == null || (c2243521CrW = c2243361CrG.title) == null || (textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW)) == null) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        }
        C2243361CrG c2243361CrG2 = c2243301CrA.title;
        C2243521CrW c2243521CrW2 = c2243361CrG2.title;
        if (c2243521CrW2 == null || (textComponentLIZ2 = C2243551CrZ.LIZ(c2243521CrW2)) == null) {
            TextComponent.Companion.getClass();
            textComponentLIZ2 = C2243491CrT.LIZ();
        }
        C2244091CsR c2244091CsR = c2243361CrG2.image;
        if (c2244091CsR != null) {
            imageComponentLIZ = C2244081CsQ.LIZJ(c2244091CsR);
        } else {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        }
        InfoCardTitleBarComponent infoCardTitleBarComponent = new InfoCardTitleBarComponent(textComponentLIZ2, imageComponentLIZ);
        C2243331CrD c2243331CrD = c2243301CrA.content;
        if (c2243331CrD != null) {
            TextComponent textComponentLIZ3 = C2243551CrZ.LIZ(c2243331CrD.description);
            if (textComponentLIZ3 == null) {
                TextComponent.Companion.getClass();
                textComponentLIZ3 = C2243491CrT.LIZ();
            }
            List<C2243521CrW> list = c2243331CrD.contents;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C2243521CrW> it2 = list.iterator();
            while (it2.hasNext()) {
                TextComponent textComponentLIZ4 = C2243551CrZ.LIZ(it2.next());
                if (textComponentLIZ4 == null) {
                    TextComponent.Companion.getClass();
                    textComponentLIZ4 = C2243491CrT.LIZ();
                }
                arrayList.add(textComponentLIZ4);
            }
            infoCardContentComponent = new InfoCardContentComponent(textComponentLIZ3, arrayList);
        } else {
            infoCardContentComponent = null;
        }
        C2244101CsS c2244101CsS = c2243301CrA.video;
        if (c2244101CsS != null) {
            videoCoverComponentLIZ = C2244131CsV.LIZ(c2244101CsS);
        } else {
            videoCoverComponentLIZ = null;
        }
        List<C2243341CrE> list2 = c2243301CrA.buttons;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (C2243341CrE c2243341CrE : list2) {
            TextComponent textComponentLIZ5 = C2243551CrZ.LIZ(c2243341CrE.text);
            if (textComponentLIZ5 == null) {
                TextComponent.Companion.getClass();
                textComponentLIZ5 = C2243491CrT.LIZ();
            }
            ActionLinkComponent actionLinkComponentLIZ2 = C2244351Csr.LIZ(c2243341CrE.link);
            EnumC2243411CrL enumC2243411CrL = c2243341CrE.type;
            if (enumC2243411CrL != null) {
                CardButtonType[] cardButtonTypeArrValues = CardButtonType.values();
                int length = cardButtonTypeArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        cardButtonType = cardButtonTypeArrValues[i];
                        if (cardButtonType.getValue() != enumC2243411CrL.getValue()) {
                            i++;
                        }
                    } else {
                        cardButtonType = CardButtonType.DEFAULT;
                        if (cardButtonType == null) {
                        }
                    }
                }
            } else {
                cardButtonType = CardButtonType.DEFAULT;
            }
            arrayList2.add(new InfoCardButtonComponent(textComponentLIZ5, actionLinkComponentLIZ2, cardButtonType, 2));
        }
        C2244321Cso c2244321Cso = c2243301CrA.link_info;
        if (c2244321Cso != null) {
            actionLinkComponentLIZ = C2244351Csr.LIZ(c2244321Cso);
        } else {
            actionLinkComponentLIZ = null;
        }
        PreviewHintComponent previewHintComponent = new PreviewHintComponent(textComponentLIZ, textComponentLIZ, textComponentLIZ, null, null, null, 56);
        C1CH0 c1ch0 = c2243301CrA.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2243301CrA.resp_base;
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
        } else {
            baseFooterComponentLIZ = null;
        }
        return new InfoCardTemplate(infoCardTitleBarComponent, infoCardContentComponent, videoCoverComponentLIZ, arrayList2, actionLinkComponentLIZ, previewHintComponent, baseResponseComponent, baseRequestComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
