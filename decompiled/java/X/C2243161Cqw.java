package X;

import com.ss.android.ugc.aweme.im.message.template.card.InteractionCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FortuneCookieInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;

/* JADX INFO: renamed from: X.1Cqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243161Cqw {
    public static final InteractionCardTemplate LIZ(C2243171Cqx c2243171Cqx, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        FortuneCookieInfoComponent fortuneCookieInfoComponent;
        GreetingCardInfoComponent greetingCardInfoComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C2243211Cr1 c2243211Cr1 = c2243171Cqx.fortune_cookie_info;
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (c2243211Cr1 != null) {
            fortuneCookieInfoComponent = new FortuneCookieInfoComponent(c2243211Cr1.message_tips, c2243211Cr1.show_message.booleanValue());
        } else {
            fortuneCookieInfoComponent = null;
        }
        C2243191Cqz c2243191Cqz = c2243171Cqx.greeting_card_info;
        if (c2243191Cqz != null) {
            String str = c2243191Cqz.card_footer;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = c2243191Cqz.card_header;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = c2243191Cqz.card_content;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c2243191Cqz.card_style_id;
            if (str5 != null) {
                str2 = str5;
            }
            C0IBH c0ibh = c2243191Cqz.status;
            if (c0ibh == null) {
                c0ibh = C0IBH.GREETING_CARD_STATUS_UNKNOWN;
            }
            greetingCardInfoComponent = new GreetingCardInfoComponent(str, str3, str4, c0ibh, str2);
        } else {
            greetingCardInfoComponent = null;
        }
        PreviewHintComponent previewHintComponentLIZ = C2243921CsA.LIZ(c2243171Cqx.preview_hint);
        BaseResponseComponent baseResponseComponentLIZIZ = C2241581CoO.LIZIZ(c2243171Cqx.resp_base);
        BaseRequestComponent baseRequestComponentLIZ = C1CH2.LIZ(c2243171Cqx.req_base);
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
        return new InteractionCardTemplate(fortuneCookieInfoComponent, greetingCardInfoComponent, previewHintComponentLIZ, baseResponseComponentLIZIZ, baseRequestComponentLIZ, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
