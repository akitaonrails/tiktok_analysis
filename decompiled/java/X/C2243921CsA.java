package X;

import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewIconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePicturePreviewComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QuotePreviewTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TTLComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: renamed from: X.1CsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243921CsA {
    public static final PreviewHintComponent LIZ(C2243941CsC c2243941CsC) {
        TextComponent textComponent;
        TextComponent textComponent2;
        TextComponent textComponent3;
        QuotePreviewTypeComponent quotePreviewTypeComponent;
        QuotePicturePreviewComponent quotePicturePreviewComponent;
        ImageComponent imageComponentLIZ;
        IconTypeComponent iconTypeComponentLIZIZ;
        TTLComponent tTLComponent;
        C2243521CrW c2243521CrW = c2243941CsC.sender_preview_text;
        TextComponent textComponentLIZ = null;
        if (c2243521CrW == null || (textComponent = C2243551CrZ.LIZ(c2243521CrW)) == null) {
            textComponent = new TextComponent("Sender", null, null);
        }
        C2243521CrW c2243521CrW2 = c2243941CsC.receiver_preview_text;
        if (c2243521CrW2 == null || (textComponent2 = C2243551CrZ.LIZ(c2243521CrW2)) == null) {
            textComponent2 = new TextComponent("Receiver", null, null);
        }
        C2243521CrW c2243521CrW3 = c2243941CsC.quote_preview_text;
        if (c2243521CrW3 == null || (textComponent3 = C2243551CrZ.LIZ(c2243521CrW3)) == null) {
            textComponent3 = new TextComponent("Quote", null, null);
        }
        EnumC2243981CsG enumC2243981CsG = c2243941CsC.quote_preview_type;
        if (enumC2243981CsG != null) {
            QuotePreviewTypeComponent[] quotePreviewTypeComponentArrValues = QuotePreviewTypeComponent.values();
            int length = quotePreviewTypeComponentArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    quotePreviewTypeComponent = quotePreviewTypeComponentArrValues[i];
                    if (quotePreviewTypeComponent.getValue() == enumC2243981CsG.getValue()) {
                        break;
                    }
                    i++;
                } else {
                    quotePreviewTypeComponent = QuotePreviewTypeComponent.TEXT;
                    break;
                }
            }
        } else {
            quotePreviewTypeComponent = null;
        }
        C2243901Cs8 c2243901Cs8 = c2243941CsC.quote_picture_preview;
        if (c2243901Cs8 != null) {
            String str = c2243901Cs8.resource_id;
            Long l = c2243901Cs8.sender_uid;
            C2244091CsR c2244091CsR = c2243901Cs8.preview_image;
            if (c2244091CsR != null) {
                imageComponentLIZ = C2244081CsQ.LIZJ(c2244091CsR);
            } else {
                ImageComponent.Companion.getClass();
                imageComponentLIZ = C18ZU.LIZ();
            }
            EnumC2244051CsN enumC2244051CsN = c2243901Cs8.fallback_icon;
            if (enumC2244051CsN == null || (iconTypeComponentLIZIZ = C2244081CsQ.LIZIZ(enumC2244051CsN)) == null) {
                iconTypeComponentLIZIZ = IconTypeComponent.DEFAULT;
            }
            C2241591CoP c2241591CoP = c2243901Cs8.ttl;
            if (c2241591CoP != null) {
                Long l2 = c2241591CoP.expired_at;
                if (l2 == null) {
                    l2 = C2241591CoP.DEFAULT_EXPIRED_AT;
                }
                tTLComponent = new TTLComponent(l2.longValue());
            } else {
                tTLComponent = new TTLComponent(0);
            }
            quotePicturePreviewComponent = new QuotePicturePreviewComponent(str, l, imageComponentLIZ, iconTypeComponentLIZIZ, (PreviewIconTypeComponent) null, tTLComponent, 48);
        } else {
            quotePicturePreviewComponent = null;
        }
        C2243521CrW c2243521CrW4 = c2243941CsC.inapp_push_preview;
        if (c2243521CrW4 != null) {
            textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW4);
        }
        return new PreviewHintComponent(textComponent, textComponent2, textComponent3, quotePreviewTypeComponent, quotePicturePreviewComponent, textComponentLIZ);
    }
}
