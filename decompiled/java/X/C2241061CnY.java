package X;

import com.ss.android.ugc.aweme.im.message.template.card.OnboardingCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;

/* JADX INFO: renamed from: X.1CnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241061CnY {
    public static final OnboardingCardTemplate LIZ(C2241041CnW c2241041CnW, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        long jLongValue;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponentLIZ;
        BaseResponseComponent baseResponseComponent;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        BaseFooterComponent baseFooterComponentLIZ;
        Long l = c2241041CnW.target_uid;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C0NZT c0nzt = c2241041CnW.status;
        if (c0nzt == null) {
            c0nzt = C0NZT.ONBOARDING_CARD_STATUS_UNKNOWN;
        }
        C2243941CsC c2243941CsC = c2241041CnW.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2241041CnW.req_base;
        if (c1ch0 != null) {
            baseRequestComponentLIZ = C1CH2.LIZ(c1ch0);
        } else {
            BaseRequestComponent.Companion.getClass();
            baseRequestComponentLIZ = C18Y8.LIZ();
        }
        C2241571CoN c2241571CoN = c2241041CnW.resp_base;
        if (c2241571CoN != null) {
            baseResponseComponent = C2241581CoO.LIZIZ(c2241571CoN);
        } else {
            baseResponseComponent = new BaseResponseComponent(0L, 15);
        }
        AttachmentComponent attachmentComponentLIZ = null;
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
        if (c2242771CqJ != null) {
            attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ);
        }
        return new OnboardingCardTemplate(jLongValue, c0nzt, previewHintComponentLIZ, baseRequestComponentLIZ, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ, 4);
    }
}
