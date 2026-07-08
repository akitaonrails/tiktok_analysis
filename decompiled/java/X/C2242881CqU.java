package X;

import com.ss.android.ugc.aweme.im.message.template.card.ShareCommentCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseShareCommentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseUserComponent;
import com.ss.android.ugc.aweme.im.message.template.component.CommentFallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.CommentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1CqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242881CqU {
    public static final ShareCommentCardTemplate LIZ(C2242861CqS c2242861CqS, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        long jLongValue;
        TextComponent textComponentLIZ;
        ImageComponent imageComponentLIZ;
        int value;
        CommentTypeComponent commentTypeComponent;
        Integer numValueOf;
        CommentFallbackStatusComponent commentFallbackStatusComponent;
        AttachmentComponent attachmentComponentLIZ;
        PreviewHintComponent previewHintComponentLIZ;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        BaseHeaderComponent baseHeaderComponentLIZIZ;
        C2242771CqJ c2242771CqJ2 = c2242771CqJ;
        C2242891CqV c2242891CqV = c2242861CqS.comment;
        long jLongValue2 = c2242891CqV.item_id.longValue();
        Long l = c2242891CqV.comment_id;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 1;
        }
        TextComponent textComponentLIZ2 = C2243551CrZ.LIZ(c2242891CqV.top_inline_text);
        if (textComponentLIZ2 == null) {
            TextComponent.Companion.getClass();
            textComponentLIZ2 = C2243491CrT.LIZ();
        }
        C2243521CrW c2243521CrW = c2242891CqV.comment_text;
        if (c2243521CrW == null || (textComponentLIZ = C2243551CrZ.LIZ(c2243521CrW)) == null) {
            TextComponent.Companion.getClass();
            textComponentLIZ = C2243491CrT.LIZ();
        }
        C2244091CsR c2244091CsR = c2242891CqV.image;
        if (c2244091CsR != null) {
            imageComponentLIZ = C2244081CsQ.LIZJ(c2244091CsR);
        } else {
            ImageComponent.Companion.getClass();
            imageComponentLIZ = C18ZU.LIZ();
        }
        C2243011Cqh c2243011Cqh = CommentTypeComponent.Companion;
        EnumC2242941Cqa enumC2242941Cqa = c2242891CqV.comment_type;
        if (enumC2242941Cqa != null) {
            value = enumC2242941Cqa.getValue();
        } else {
            value = CommentTypeComponent.TYPE_TEXT.getValue();
        }
        c2243011Cqh.getClass();
        if (value == EnumC2242941Cqa.TYPE_TEXT.getValue()) {
            commentTypeComponent = CommentTypeComponent.TYPE_TEXT;
        } else if (value == EnumC2242941Cqa.TYPE_STICKER.getValue()) {
            commentTypeComponent = CommentTypeComponent.TYPE_STICKER;
        } else if (value == EnumC2242941Cqa.TYPE_PICTURE.getValue()) {
            commentTypeComponent = CommentTypeComponent.TYPE_PICTURE;
        } else {
            commentTypeComponent = CommentTypeComponent.TYPE_TEXT;
        }
        BaseShareCommentComponent baseShareCommentComponent = new BaseShareCommentComponent(jLongValue2, jLongValue, textComponentLIZ2, textComponentLIZ, imageComponentLIZ, commentTypeComponent);
        BaseUserComponent baseUserComponentLIZ = C2242561Cpy.LIZ(c2242861CqS.user_info);
        List<C2243521CrW> list = c2242861CqS.mention_username;
        ArrayList arrayList = new ArrayList();
        Iterator<C2243521CrW> it2 = list.iterator();
        while (it2.hasNext()) {
            TextComponent textComponentLIZ3 = C2243551CrZ.LIZ(it2.next());
            if (textComponentLIZ3 != null) {
                arrayList.add(textComponentLIZ3);
            }
        }
        C2243001Cqg c2243001Cqg = CommentFallbackStatusComponent.Companion;
        EnumC2242921CqY enumC2242921CqY = c2242861CqS.fallback;
        BaseFooterComponent baseFooterComponentLIZ = null;
        if (enumC2242921CqY != null) {
            numValueOf = Integer.valueOf(enumC2242921CqY.getValue());
        } else {
            numValueOf = null;
        }
        c2243001Cqg.getClass();
        int value2 = EnumC2242921CqY.STATUS_COMMENT_VISIBLE.getValue();
        if (numValueOf != null && numValueOf.intValue() == value2) {
            commentFallbackStatusComponent = CommentFallbackStatusComponent.STATUS_COMMENT_VISIBLE;
        } else {
            int value3 = EnumC2242921CqY.STATUS_VIDEO_SELF_VISIBLE.getValue();
            if (numValueOf != null && numValueOf.intValue() == value3) {
                commentFallbackStatusComponent = CommentFallbackStatusComponent.STATUS_VIDEO_SELF_VISIBLE;
            } else {
                int value4 = EnumC2242921CqY.STATUS_VIDEO_FRIEND_VISIBLE.getValue();
                if (numValueOf != null && numValueOf.intValue() == value4) {
                    commentFallbackStatusComponent = CommentFallbackStatusComponent.STATUS_VIDEO_FRIEND_VISIBLE;
                } else {
                    int value5 = EnumC2242921CqY.STATUS_VIDEO_FOLLOWER_VISIBLE.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value5) {
                        commentFallbackStatusComponent = CommentFallbackStatusComponent.STATUS_VIDEO_FOLLOWER_VISIBLE;
                    } else {
                        int value6 = EnumC2242921CqY.STATUS_VIDEO_NO_VISIBLE.getValue();
                        if (numValueOf != null && numValueOf.intValue() == value6) {
                            commentFallbackStatusComponent = CommentFallbackStatusComponent.STATUS_VIDEO_NO_VISIBLE;
                        } else {
                            int value7 = EnumC2242921CqY.STATUS_COMMENT_DELETED.getValue();
                            if (numValueOf != null && numValueOf.intValue() == value7) {
                                commentFallbackStatusComponent = CommentFallbackStatusComponent.STATUS_COMMENT_DELETED;
                            } else {
                                commentFallbackStatusComponent = CommentFallbackStatusComponent.STATUS_COMMENT_NO_VISIBLE;
                            }
                        }
                    }
                }
            }
        }
        if (c2242771CqJ2 == null && (c2242771CqJ2 = c2242861CqS.attachment) == null) {
            attachmentComponentLIZ = null;
        } else {
            attachmentComponentLIZ = C2242791CqL.LIZ(c2242771CqJ2);
        }
        C2243941CsC c2243941CsC = c2242861CqS.preview_hint;
        if (c2243941CsC != null) {
            previewHintComponentLIZ = C2243921CsA.LIZ(c2243941CsC);
        } else {
            PreviewHintComponent.Companion.getClass();
            previewHintComponentLIZ = C18Y9.LIZ();
        }
        C1CH0 c1ch0 = c2242861CqS.req_base;
        if (c1ch0 != null) {
            baseRequestComponent = C1CH2.LIZ(c1ch0);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        C2241571CoN c2241571CoN = c2242861CqS.resp_base;
        if (c2241571CoN != null) {
            baseResponseComponent = C2241581CoO.LIZIZ(c2241571CoN);
        } else {
            baseResponseComponent = new BaseResponseComponent(359000L, 11);
        }
        if (c2242321Cpa != null) {
            baseHeaderComponentLIZIZ = C2242351Cpd.LIZIZ(c2242321Cpa);
        } else {
            baseHeaderComponentLIZIZ = null;
        }
        if (c2242801CqM != null) {
            baseFooterComponentLIZ = C2242841CqQ.LIZ(c2242801CqM);
        }
        return new ShareCommentCardTemplate(baseShareCommentComponent, baseUserComponentLIZ, arrayList, commentFallbackStatusComponent, previewHintComponentLIZ, baseRequestComponent, baseResponseComponent, attachmentComponentLIZ, baseHeaderComponentLIZIZ, baseFooterComponentLIZ, 16);
    }
}
