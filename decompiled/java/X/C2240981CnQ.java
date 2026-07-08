package X;

import com.ss.android.ugc.aweme.im.message.template.card.MarkdownMessageTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;

/* JADX INFO: renamed from: X.1CnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240981CnQ {
    public static final MarkdownMessageTemplate LIZ(C2240961CnO c2240961CnO, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        String str = c2240961CnO.raw;
        String str2 = c2240961CnO.context;
        C2243941CsC c2243941CsC = c2240961CnO.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2240961CnO.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2240961CnO.resp_base;
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
        return new MarkdownMessageTemplate(str, str2, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ);
    }
}
