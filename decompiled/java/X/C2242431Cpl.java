package X;

import com.ss.android.ugc.aweme.im.message.template.card.ShareRepostCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.RepostCardStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ShareRepostComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;

/* JADX INFO: renamed from: X.1Cpl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242431Cpl {
    public static final ShareRepostCardTemplate LIZ(C2242471Cpp c2242471Cpp, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        ShareRepostComponent shareRepostComponent;
        FallbackInfoComponent fallbackInfoComponent;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        AttachmentComponent attachmentComponentLIZ;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        long jLongValue;
        BaseUserComponent baseUserComponentLIZ;
        BaseUserComponent baseUserComponentLIZ2;
        ImageComponent imageComponentLIZ;
        int value;
        RepostCardStatusComponent repostCardStatusComponent;
        C2242451Cpn c2242451Cpn = c2242471Cpp.repost;
        if (c2242451Cpn != null) {
            Long l = c2242451Cpn.repost_id;
            long jLongValue2 = -1;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            Long lValueOf = Long.valueOf(jLongValue);
            Long l2 = c2242451Cpn.item_id;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            }
            Long lValueOf2 = Long.valueOf(jLongValue2);
            C2242541Cpw c2242541Cpw = c2242451Cpn.item_user_info;
            if (c2242541Cpw != null) {
                baseUserComponentLIZ = C2242561Cpy.LIZ(c2242541Cpw);
            } else {
                BaseUserComponent.Companion.getClass();
                baseUserComponentLIZ = C2242511Cpt.LIZ();
            }
            C2242541Cpw c2242541Cpw2 = c2242451Cpn.repost_user_info;
            if (c2242541Cpw2 != null) {
                baseUserComponentLIZ2 = C2242561Cpy.LIZ(c2242541Cpw2);
            } else {
                BaseUserComponent.Companion.getClass();
                baseUserComponentLIZ2 = C2242511Cpt.LIZ();
            }
            TextComponent textComponentLIZ = C2243551CrZ.LIZ(c2242451Cpn.repost_text);
            if (textComponentLIZ == null) {
                TextComponent.Companion.getClass();
                textComponentLIZ = C2243491CrT.LIZ();
            }
            C2244091CsR c2244091CsR = c2242451Cpn.repost_image;
            if (c2244091CsR != null) {
                imageComponentLIZ = C2244081CsQ.LIZJ(c2244091CsR);
            } else {
                ImageComponent.Companion.getClass();
                imageComponentLIZ = C18ZU.LIZ();
            }
            C0IBN c0ibn = RepostCardStatusComponent.Companion;
            C0IBL c0ibl = c2242451Cpn.status;
            if (c0ibl != null) {
                value = c0ibl.getValue();
            } else {
                value = RepostCardStatusComponent.REPOST_CARD_STATUS_REPOST_UNKNOWN.getValue();
            }
            Integer numValueOf = Integer.valueOf(value);
            c0ibn.getClass();
            int value2 = C0IBL.REPOST_CARD_STATUS_REPOST_UNKNOWN.getValue();
            if (numValueOf != null && numValueOf.intValue() == value2) {
                repostCardStatusComponent = RepostCardStatusComponent.REPOST_CARD_STATUS_REPOST_UNKNOWN;
            } else {
                int value3 = C0IBL.REPOST_CARD_STATUS_REPOST_SUCCESS.getValue();
                if (numValueOf != null && numValueOf.intValue() == value3) {
                    repostCardStatusComponent = RepostCardStatusComponent.REPOST_CARD_STATUS_REPOST_SUCCESS;
                } else {
                    int value4 = C0IBL.REPOST_CARD_STATUS_REPOST_INVISIBLE.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value4) {
                        repostCardStatusComponent = RepostCardStatusComponent.REPOST_CARD_STATUS_REPOST_INVISIBLE;
                    } else {
                        int value5 = C0IBL.REPOST_CARD_STATUS_POST_INVISIBLE.getValue();
                        if (numValueOf != null && numValueOf.intValue() == value5) {
                            repostCardStatusComponent = RepostCardStatusComponent.REPOST_CARD_STATUS_POST_INVISIBLE;
                        } else {
                            repostCardStatusComponent = RepostCardStatusComponent.REPOST_CARD_STATUS_REPOST_UNKNOWN;
                        }
                    }
                }
            }
            shareRepostComponent = new ShareRepostComponent(lValueOf, lValueOf2, baseUserComponentLIZ, baseUserComponentLIZ2, textComponentLIZ, imageComponentLIZ, repostCardStatusComponent);
        } else {
            shareRepostComponent = new ShareRepostComponent(0);
        }
        C2242211CpP c2242211CpP = c2242471Cpp.fallback_info;
        if (c2242211CpP != null) {
            fallbackInfoComponent = C2242131CpH.LIZ(c2242211CpP);
        } else {
            fallbackInfoComponent = new FallbackInfoComponent(7);
        }
        C2243941CsC c2243941CsC = c2242471Cpp.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2242471Cpp.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2242471Cpp.resp_base;
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
        return new ShareRepostCardTemplate(shareRepostComponent, fallbackInfoComponent, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ, 4);
    }
}
