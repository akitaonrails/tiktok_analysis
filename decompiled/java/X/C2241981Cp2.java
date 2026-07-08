package X;

import com.ss.android.ugc.aweme.im.message.template.card.InteractiveNoticeTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: renamed from: X.1Cp2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241981Cp2 {
    public static final InteractiveNoticeTemplate LIZ(C2242001Cp4 c2242001Cp4, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        TextComponent textComponentLIZ;
        TextComponent textComponentLIZ2;
        TextComponent textComponentLIZ3;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C2243521CrW c2243521CrW = c2242001Cp4.plain_notice;
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (c2243521CrW != null) {
            textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW);
        } else {
            textComponentLIZ = null;
        }
        C2243521CrW c2243521CrW2 = c2242001Cp4.interactive_notice;
        if (c2243521CrW2 != null) {
            textComponentLIZ2 = C2243551CrZ.LIZ(c2243521CrW2);
        } else {
            textComponentLIZ2 = null;
        }
        C2243521CrW c2243521CrW3 = c2242001Cp4.query_content;
        if (c2243521CrW3 != null) {
            textComponentLIZ3 = C2243551CrZ.LIZ(c2243521CrW3);
        } else {
            textComponentLIZ3 = null;
        }
        String str = c2242001Cp4.query_message_id;
        C1CH0 c1ch0 = c2242001Cp4.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2242001Cp4.resp_base;
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
        PreviewHintComponent.Companion.getClass();
        return new InteractiveNoticeTemplate(textComponentLIZ, textComponentLIZ2, textComponentLIZ3, str, C18Y9.LIZ(), baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
