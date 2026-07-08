package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.PersistentExtraData;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.ImageCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.InteractionCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicUiLocationType;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCoverComponent;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZDX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDX {
    public static final long LIZ;
    public static final long LIZIZ;
    public static final /* synthetic */ int LIZJ = 0;

    static {
        long jLJII = C19990313Jl.LJII(3, EnumC19990213Jk.MINUTES);
        EnumC19990213Jk enumC19990213Jk = EnumC19990213Jk.MILLISECONDS;
        LIZ = C19990113Jj.LJIJI(jLJII, enumC19990213Jk);
        LIZIZ = C19990113Jj.LJIJI(C19990313Jl.LJII(1, EnumC19990213Jk.HOURS), enumC19990213Jk);
    }

    public static final String LIZ(C869590Y9l c869590Y9l) {
        int iLongValue;
        ShareAwemeContent shareAwemeContent;
        Long l;
        AttachmentComponent attachmentComponent;
        VideoCoverComponent videoCoverComponent;
        String str;
        ImageCardTemplate imageCardTemplate;
        BaseRequestComponent baseRequestComponent;
        QueryDataComponent queryDataComponent;
        if (c869590Y9l.getMessageStatus() == C0YUT.DELETED || c869590Y9l.getMessageStatus() == C0YUT.RECALLED) {
            return null;
        }
        String str2 = c869590Y9l.getLocalExt().get("aweme_id");
        if (str2 != null && str2.length() != 0) {
            return str2;
        }
        int msgType = c869590Y9l.getMsgType();
        if (msgType != 5) {
            if (msgType != 11) {
                if (msgType != 40) {
                    if (msgType != 1025) {
                        if (msgType != 1805) {
                            if (msgType != 1809) {
                                if (msgType != 7) {
                                    if (msgType != 8) {
                                        if (1801 - msgType != 0 || !Intrinsics.LJFF(c869590Y9l.getScene(), "now_post") || (imageCardTemplate = (ImageCardTemplate) C0Z2Z.LIZ(c869590Y9l, ImageCardTemplate.class)) == null || (baseRequestComponent = imageCardTemplate.baseRequestComponent) == null || (queryDataComponent = baseRequestComponent.queryData) == null) {
                                            return null;
                                        }
                                        return queryDataComponent.resourceID;
                                    }
                                    ShareAwemeContent shareAwemeContent2 = (ShareAwemeContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareAwemeContent.class);
                                    if (shareAwemeContent2 == null) {
                                        return null;
                                    }
                                    return shareAwemeContent2.getItemId();
                                }
                            } else {
                                AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) C0Z2Z.LIZ(c869590Y9l, AwemeCardTemplate.class);
                                if (awemeCardTemplate != null && (videoCoverComponent = awemeCardTemplate.baseVideoComponent) != null && (str = videoCoverComponent.id) != null) {
                                    return str;
                                }
                                return "";
                            }
                        } else {
                            StickerTemplate stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class);
                            if (stickerTemplate == null || (attachmentComponent = stickerTemplate.attachment) == null) {
                                return null;
                            }
                            return attachmentComponent.id;
                        }
                    } else {
                        ShareAwemeContent shareAwemeContent3 = (ShareAwemeContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareAwemeContent.class);
                        if (shareAwemeContent3 == null) {
                            return null;
                        }
                        return shareAwemeContent3.getItemId();
                    }
                } else {
                    CommentContent commentContent = (CommentContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, CommentContent.class);
                    if (commentContent == null) {
                        return null;
                    }
                    return commentContent.getAwemeId();
                }
            } else {
                ShareAwemeContent shareAwemeContent4 = (ShareAwemeContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, ShareAwemeContent.class);
                if (shareAwemeContent4 == null) {
                    return null;
                }
                return shareAwemeContent4.getItemId();
            }
        }
        if (c869590Y9l.getReferenceInfo() != null) {
            ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
            if (referenceInfo != null && (l = referenceInfo.ref_message_type) != null) {
                iLongValue = (int) l.longValue();
            } else {
                iLongValue = -1;
            }
            BaseContent orParseJsonContentOfRefMsg = BaseContentParserKt.getOrParseJsonContentOfRefMsg(c869590Y9l, iLongValue);
            if (!(orParseJsonContentOfRefMsg instanceof ShareAwemeContent) || (shareAwemeContent = (ShareAwemeContent) orParseJsonContentOfRefMsg) == null) {
                return null;
            }
            return shareAwemeContent.getItemId();
        }
        BaseContent.ReferenceVideo referenceVideo = BaseContentParserKt.getReferenceVideo(c869590Y9l);
        if (referenceVideo == null) {
            return null;
        }
        return referenceVideo.getRefVideoId();
    }

    public static final String LIZIZ(C869590Y9l c869590Y9l) {
        Integer numValueOf;
        String str;
        List listLJJLIIIJILLIZJL;
        String str2;
        FeatureAttachmentContent featureAttachmentContentLJ = LJ(c869590Y9l);
        if (featureAttachmentContentLJ == null || (numValueOf = Integer.valueOf(featureAttachmentContentLJ.type)) == null) {
            return null;
        }
        if (numValueOf.intValue() == 11) {
            return featureAttachmentContentLJ.id;
        }
        if (numValueOf.intValue() != 12 || (str = featureAttachmentContentLJ.id) == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) == null || (str2 = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL)) == null) {
            return null;
        }
        return a0.LJLIIIL(str2).toString();
    }

    public static final String LIZJ(BaseTemplate baseTemplate) {
        String str = baseTemplate.rj().queryData.extras.get("effect_game_id");
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static final String LIZLLL(BaseTemplate baseTemplate) {
        String strLIZ = C902260ZaS.LIZ(baseTemplate);
        if (strLIZ == null) {
            return LIZJ(baseTemplate);
        }
        return strLIZ;
    }

    public static final FeatureAttachmentContent LJ(C869590Y9l c869590Y9l) {
        GifContent gifContent;
        TextContent textContent;
        FeatureAttachmentData featureAttachmentData;
        int msgType = c869590Y9l.getMsgType();
        if (msgType != 5) {
            if (msgType != 7) {
                PersistentExtraData persistentExtraDataLJIIIIZZ = LJIIIIZZ(c869590Y9l);
                if (persistentExtraDataLJIIIIZZ == null || (featureAttachmentData = persistentExtraDataLJIIIIZZ.featureAttachment) == null) {
                    return null;
                }
                return new FeatureAttachmentContent(featureAttachmentData.type.getValue(), featureAttachmentData.id, Long.valueOf(featureAttachmentData.uid), Long.valueOf(featureAttachmentData.originalCreateTime), null);
            }
            BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
            if (!(orParseJsonContent instanceof TextContent) || (textContent = (TextContent) orParseJsonContent) == null) {
                return null;
            }
            return textContent.getAttachment();
        }
        BaseContent orParseJsonContent2 = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (!(orParseJsonContent2 instanceof GifContent) || (gifContent = (GifContent) orParseJsonContent2) == null) {
            return null;
        }
        return gifContent.getAttachment();
    }

    public static final int LJFF(C869590Y9l c869590Y9l) {
        String str;
        if (c869590Y9l.getMsgType() != 5 || (str = c869590Y9l.getExt().get("a:src")) == null) {
            return 0;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 98361695) {
            if (iHashCode != 110246592) {
                if (iHashCode != 2076840998 || !str.equals("ai_sticker")) {
                    return 0;
                }
                return 3;
            }
            if (!str.equals("tenor")) {
                return 0;
            }
            return 2;
        }
        if (!str.equals("giphy")) {
            return 0;
        }
        return 1;
    }

    public static final GreetingCardInfoComponent LJI(C869590Y9l c869590Y9l) {
        InteractionCardTemplate interactionCardTemplate;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (!(baseTemplateLIZ instanceof InteractionCardTemplate) || (interactionCardTemplate = (InteractionCardTemplate) baseTemplateLIZ) == null) {
            return null;
        }
        return interactionCardTemplate.greetingCardInfoComponent;
    }

    public static final String LJII(C869590Y9l c869590Y9l) {
        return c869590Y9l.getExt().get("a:landing_msg_type");
    }

    public static final PersistentExtraData LJIIIIZZ(C869590Y9l c869590Y9l) {
        PersistentExtraData persistentExtraData;
        Object localCache = c869590Y9l.getLocalCache(512);
        if ((localCache instanceof PersistentExtraData) && (persistentExtraData = (PersistentExtraData) localCache) != null) {
            return persistentExtraData;
        }
        PersistentExtraData persistentExtraDataLIZ = C905400ZfW.LIZ(c869590Y9l);
        if (persistentExtraDataLIZ == null) {
            return null;
        }
        c869590Y9l.putLocalCache(512, persistentExtraDataLIZ);
        return persistentExtraDataLIZ;
    }

    public static final ReferenceInfoHint LJIIIZ(C869590Y9l c869590Y9l) {
        String str;
        ReferenceInfoHint referenceInfoHint;
        Set<Integer> setLIZ;
        ReferenceInfo referenceInfo;
        Long l;
        C0ZDY.LIZ.getClass();
        C0ZDY value = C0ZDZ.LIZIZ.getValue();
        if (value != null && (setLIZ = value.LIZ()) != null && (referenceInfo = c869590Y9l.getReferenceInfo()) != null && (l = referenceInfo.ref_message_type) != null && !setLIZ.contains(Integer.valueOf((int) l.longValue()))) {
            return null;
        }
        Object localCache = c869590Y9l.getLocalCache(502);
        if ((localCache instanceof ReferenceInfoHint) && (referenceInfoHint = (ReferenceInfoHint) localCache) != null) {
            return referenceInfoHint;
        }
        ReferenceInfo referenceInfo2 = c869590Y9l.getReferenceInfo();
        if (referenceInfo2 != null && (str = referenceInfo2.hint) != null) {
            try {
                ReferenceInfoHint referenceInfoHint2 = (ReferenceInfoHint) C051M.LIZIZ(ReferenceInfoHint.class, str);
                if (referenceInfoHint2 != null) {
                    c869590Y9l.putLocalCache(502, referenceInfoHint2);
                    return referenceInfoHint2;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static final BaseContent LJIIJ(C869590Y9l c869590Y9l) {
        BaseContent contentByMsgType;
        Object localCache = c869590Y9l.getLocalCache(503);
        if (localCache != null && (localCache instanceof BaseContent)) {
            return (BaseContent) localCache;
        }
        ReferenceInfoHint referenceInfoHintLJIIIZ = LJIIIZ(c869590Y9l);
        if (referenceInfoHintLJIIIZ == null || (contentByMsgType = BaseContentParserKt.getContentByMsgType(referenceInfoHintLJIIIZ.getRefmsg_content(), referenceInfoHintLJIIIZ.getRefmsg_type())) == null) {
            return null;
        }
        c869590Y9l.putLocalCache(503, contentByMsgType);
        return contentByMsgType;
    }

    public static final String LJIIJJI(C869590Y9l c869590Y9l) {
        String str;
        FeatureAttachmentContent featureAttachmentContentLJ = LJ(c869590Y9l);
        if (featureAttachmentContentLJ == null || featureAttachmentContentLJ.type != 14 || (str = featureAttachmentContentLJ.id) == null || !C123100dR.LIZ(str)) {
            return null;
        }
        return str;
    }

    public static final String LJIIL(C869590Y9l c869590Y9l) {
        String str = c869590Y9l.getExt().get("s:recall_uid");
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final String LJIILIIL(C869590Y9l c869590Y9l) {
        String str = c869590Y9l.getExt().get("a:set_by");
        if (str == null) {
            if (!Intrinsics.LJFF(c869590Y9l.getExt().get("a:create_src"), "ad") && !C866950Xzh.LIZ(c869590Y9l.getExt().get("a:ad_creative_id"))) {
                return "";
            }
            return "advertiser";
        }
        return str;
    }

    public static final String LJIILJJIL(C869590Y9l c869590Y9l) {
        StickerTemplate stickerTemplate;
        Long lLIZIZ;
        int msgType = c869590Y9l.getMsgType();
        if (msgType != 5) {
            if (msgType != 1805 || (stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class)) == null || (lLIZIZ = C2243571Crb.LIZIZ(stickerTemplate)) == null) {
                return null;
            }
            return lLIZIZ.toString();
        }
        GifContent gifContent = (GifContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, GifContent.class);
        if (gifContent == null) {
            return null;
        }
        return gifContent.getStickerId();
    }

    public static final boolean LJIILL(C869590Y9l c869590Y9l) {
        FeatureAttachmentData featureAttachmentData;
        String str = null;
        if (LJJJJLI(c869590Y9l)) {
            PersistentExtraData persistentExtraDataLJIIIIZZ = LJIIIIZZ(c869590Y9l);
            if (persistentExtraDataLJIIIIZZ != null && (featureAttachmentData = persistentExtraDataLJIIIIZZ.featureAttachment) != null && C123100dR.LIZ(featureAttachmentData.id)) {
                return true;
            }
            return false;
        }
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (orParseJsonContent instanceof TextContent) {
            TextContent textContent = (TextContent) orParseJsonContent;
            if (textContent.getAttachment() != null) {
                FeatureAttachmentContent attachment = textContent.getAttachment();
                if (attachment != null) {
                    str = attachment.id;
                }
                if (C123100dR.LIZ(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (orParseJsonContent instanceof GifContent) {
            GifContent gifContent = (GifContent) orParseJsonContent;
            if (gifContent.getAttachment() != null) {
                FeatureAttachmentContent attachment2 = gifContent.getAttachment();
                if (attachment2 != null) {
                    str = attachment2.id;
                }
                if (C123100dR.LIZ(str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIILLIIL(C869590Y9l c869590Y9l) {
        AttachmentComponent attachmentComponentHs;
        if (LJJJJLI(c869590Y9l)) {
            BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
            if (baseTemplateLIZ != null && (attachmentComponentHs = baseTemplateLIZ.Hs()) != null && C123100dR.LIZ(attachmentComponentHs.id)) {
                return true;
            }
            return false;
        }
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        if (orParseJsonContent != null && orParseJsonContent.getRefVideo() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIZILJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getMsgType() != 1809) {
            return false;
        }
        AwemeCardTemplate awemeCardTemplate = (AwemeCardTemplate) C0Z2Z.LIZ(c869590Y9l, AwemeCardTemplate.class);
        if (awemeCardTemplate != null && !C2242571Cpz.LIZ(awemeCardTemplate)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJ(C869590Y9l c869590Y9l) {
        BaseTemplate baseTemplateLIZ;
        if (c869590Y9l.getMsgType() != 1805 || (baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class)) == null) {
            return false;
        }
        return LJIJJ(baseTemplateLIZ);
    }

    public static final boolean LJIJI(C869590Y9l c869590Y9l) {
        BaseTemplate baseTemplateLIZ;
        if (c869590Y9l.getMsgType() != 1805 || (baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class)) == null) {
            return false;
        }
        return Intrinsics.LJFF(baseTemplateLIZ.rj().queryData.extras.get("a:sticker_type"), String.valueOf(EnumC451180Hme.AISELF_STICKER.getType()));
    }

    public static final boolean LJIJJ(BaseTemplate baseTemplate) {
        return Intrinsics.LJFF(baseTemplate.rj().queryData.extras.get("a:sticker_type"), String.valueOf(EnumC451180Hme.AIMOJI_STICKER_STATIC.getType()));
    }

    public static final boolean LJIJJLI(C869590Y9l c869590Y9l) {
        StickerTemplate stickerTemplate;
        if (c869590Y9l.getMsgType() != 1805 || (stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class)) == null) {
            return false;
        }
        int i = stickerTemplate.stickerVariant;
        StickerVariant.Companion.getClass();
        if (i != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJIL(C869590Y9l c869590Y9l) {
        return Intrinsics.LJFF(c869590Y9l.getExt().get("a:src"), "link");
    }

    public static final boolean LJJ(C869590Y9l c869590Y9l) {
        BaseFooterComponent baseFooterComponentDG;
        TextComponent textComponent;
        String str;
        BaseFooterComponent baseFooterComponentDG2;
        if (!LJIL(c869590Y9l)) {
            return false;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        String str2 = null;
        if (baseTemplateLIZ == null || (baseFooterComponentDG = baseTemplateLIZ.dG()) == null || (textComponent = baseFooterComponentDG.text) == null || (str = textComponent.text) == null || a0.LJJJIL(str)) {
            return false;
        }
        if (baseTemplateLIZ != null && (baseFooterComponentDG2 = baseTemplateLIZ.dG()) != null) {
            str2 = baseFooterComponentDG2.footerScene;
        }
        return Intrinsics.LJFF(str2, "link_auto_message_notice");
    }

    public static final boolean LJJI(C869590Y9l c869590Y9l) {
        return C1697810uHb.LJIIJJI(1802, 1803).contains(Integer.valueOf(c869590Y9l.getMsgType()));
    }

    public static final boolean LJJIFFI(C869590Y9l c869590Y9l) {
        CommentContent commentContent = (CommentContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, CommentContent.class);
        if (commentContent == null || commentContent.getCommentStatus() != EnumC461630I8j.ALL_VISIBLE.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJII(C869590Y9l c869590Y9l) {
        CommentContent commentContent = (CommentContent) BaseContentParserKt.getOrParseJsonContent(c869590Y9l, CommentContent.class);
        if (commentContent == null || commentContent.getAwemeStatus() != EnumC1994407ra.NORMAL.getValue()) {
            return false;
        }
        return true;
    }

    public static boolean LJJIII(C869590Y9l c869590Y9l) {
        BaseTemplate baseTemplateLIZ;
        long jLIZ = C2185408hI.LIZ();
        if (!BaseContentParserKt.isJsonContentInvalid(c869590Y9l)) {
            return false;
        }
        ByteString contentPB = c869590Y9l.getContentPB();
        if (contentPB != null && contentPB.size() > 0 && (baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class)) != null && jLIZ >= baseTemplateLIZ.Nc().minVersion) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJ(C869590Y9l c869590Y9l) {
        Map<String, String> localExt;
        String str;
        Integer numLJIIJJI;
        if (c869590Y9l == null || (localExt = c869590Y9l.getLocalExt()) == null || (str = localExt.get("s:msg_error_code")) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null || numLJIIJJI.intValue() != 100022) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJZLJL(C869590Y9l c869590Y9l) {
        StickerTemplate stickerTemplate;
        if (!LJIJ(c869590Y9l) || (stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class)) == null || stickerTemplate.stickerCreateScene != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIZ(C869590Y9l c869590Y9l) {
        DynamicUiLocationType dynamicUiLocationType;
        DynamicInfoComponent dynamicInfoComponent;
        if (c869590Y9l == null || c869590Y9l.getMsgType() != 2000) {
            return false;
        }
        DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l, DynamicCardTemplate.class);
        if (dynamicCardTemplate != null && (dynamicInfoComponent = dynamicCardTemplate.dynamicInfo) != null) {
            dynamicUiLocationType = dynamicInfoComponent.uiLocationType;
        } else {
            dynamicUiLocationType = null;
        }
        if (dynamicUiLocationType != DynamicUiLocationType.MESSAGE_CENTER) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIZI(C869590Y9l c869590Y9l) {
        IconTypeComponent iconTypeComponent;
        FallbackInfoComponent fallbackInfoComponent;
        TextComponent textComponent;
        FallbackInfoComponent fallbackInfoComponent2;
        ImageComponent imageComponent;
        if (2000 != c869590Y9l.getMsgType()) {
            return false;
        }
        DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l, DynamicCardTemplate.class);
        String str = null;
        if (dynamicCardTemplate != null && (fallbackInfoComponent2 = dynamicCardTemplate.fallbackInfo) != null && (imageComponent = fallbackInfoComponent2.imageComponent) != null) {
            iconTypeComponent = imageComponent.iconType;
        } else {
            iconTypeComponent = null;
        }
        DynamicCardTemplate dynamicCardTemplate2 = (DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l, DynamicCardTemplate.class);
        if (dynamicCardTemplate2 != null && (fallbackInfoComponent = dynamicCardTemplate2.fallbackInfo) != null && (textComponent = fallbackInfoComponent.textComponent) != null) {
            str = textComponent.text;
        }
        if (!C123100dR.LIZ(str) || iconTypeComponent == IconTypeComponent.DEFAULT) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJ(C869590Y9l c869590Y9l) {
        List listLJJLIIIJILLIZJL;
        boolean zContains = false;
        try {
            if (Intrinsics.LJFF(c869590Y9l.getLocalExt().get("a:force_mask"), "1")) {
                return true;
            }
            String str = c869590Y9l.getExt().get("a:force_mask");
            if (str == null || (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) == null) {
                return false;
            }
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            zContains = listLJJLIIIJILLIZJL.contains(curUserId);
            return zContains;
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            return zContains;
        }
    }

    public static final boolean LJJIJIIJI(C869590Y9l c869590Y9l) {
        FeatureAttachmentContent featureAttachmentContentLJ;
        if (c869590Y9l == null || (featureAttachmentContentLJ = LJ(c869590Y9l)) == null) {
            return false;
        }
        int i = featureAttachmentContentLJ.type;
        if (i != 11 && i != 12) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJIL(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getConversationType() == AbstractC1711506n3.LIZIZ) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIL(C869590Y9l c869590Y9l) {
        int msgType;
        if (C068M.LIZ(c869590Y9l) || LJJJJL(c869590Y9l) || (msgType = c869590Y9l.getMsgType()) == 1 || msgType == 1031 || msgType == 4013 || msgType == 4058 || msgType == 4084 || msgType == 4065 || msgType == 4066) {
            return true;
        }
        switch (msgType) {
            case 4006:
            case 4007:
            case 4008:
            case 4009:
            case 4010:
            case 4011:
                break;
            default:
                if (c869590Y9l.getMessageStatus() != C0YUT.RECALLED) {
                }
                break;
        }
        return true;
    }

    public static final boolean LJJIJL(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getMsgType() != 1802 && c869590Y9l.getMsgType() != 1803 && c869590Y9l.getMsgType() != 1818) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJLIJ(C869590Y9l c869590Y9l) {
        StickerTemplate stickerTemplate;
        if ((!LJIJ(c869590Y9l) && !LJIJI(c869590Y9l)) || (stickerTemplate = (StickerTemplate) C0Z2Z.LIZ(c869590Y9l, StickerTemplate.class)) == null || stickerTemplate.stickerCreateScene != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIL(C869590Y9l c869590Y9l) {
        int msgType = c869590Y9l.getMsgType();
        if (msgType != 8 && msgType != 11 && msgType != 1025) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIZ(C869590Y9l c869590Y9l) {
        return Intrinsics.LJFF(c869590Y9l.getLocalExt().get("quick_reply_message"), "true");
    }

    public static final boolean LJJJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getReferenceInfo() == null && !LJIILLIIL(c869590Y9l)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJI(C869590Y9l c869590Y9l) {
        boolean z;
        BaseContent orParseJsonContent;
        if (!LJJIJIIJI(c869590Y9l) || c869590Y9l == null) {
            return false;
        }
        if (LJJJJLI(c869590Y9l)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
            if (baseTemplateLIZ == null || baseTemplateLIZ.Hs() == null) {
                return false;
            }
        } else if (c869590Y9l == null || (orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class)) == null || orParseJsonContent.getRefVideo() == null) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJIL(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getMsgType() != EnumC868450Y5b.MsgTypeTemplateDynamicCard.getValue()) {
            return false;
        }
        if (!Intrinsics.LJFF(c869590Y9l.getScene(), "ci_share_feed_summary") && !Intrinsics.LJFF(c869590Y9l.getScene(), "ci_share_feed_group_summary")) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJ(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getMsgStatus() == 0 || c869590Y9l.getMsgStatus() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJI(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return false;
        }
        return Intrinsics.LJFF(c869590Y9l.getExt().get("a:src"), "chatbot_reply");
    }

    public static final boolean LJJJJIZL(C869590Y9l c869590Y9l) {
        return c869590Y9l.isSelf(C461720I8s.LIZJ());
    }

    public static final boolean LJJJJJ(C869590Y9l c869590Y9l) {
        AttachmentComponent attachmentComponentHs;
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (baseTemplateLIZ != null && (attachmentComponentHs = baseTemplateLIZ.Hs()) != null && attachmentComponentHs.type == AttachmentTypeComponent.ATTACHMENT_TYPE_STORY_REPLY) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJJL(C869590Y9l c869590Y9l) {
        if (!C1697810uHb.LJIIJJI(2002, 4081).contains(Integer.valueOf(c869590Y9l.getMsgType())) || c869590Y9l.getMessageStatus() == C0YUT.DELETED || c869590Y9l.getMessageStatus() == C0YUT.RECALLED) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJL(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getMsgType() == 1 || c869590Y9l.getMsgType() == 1031 || c869590Y9l.getMsgType() == 1039) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJLI(C869590Y9l c869590Y9l) {
        ByteString contentPB = c869590Y9l.getContentPB();
        if (contentPB == null || contentPB.size() <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJLL(C869590Y9l c869590Y9l) {
        if (c869590Y9l.getMsgType() == 4002 || c869590Y9l.getMsgType() == 4046 || c869590Y9l.getMsgType() == 4047) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJZ(C869590Y9l c869590Y9l) {
        return Intrinsics.LJFF(c869590Y9l.getExt().get("a:is_violative"), "true");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C869590Y9l LJJJJZI(com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint r6) {
        /*
            X.0Y9l r5 = new X.0Y9l
            r5.<init>()
            java.util.Map r2 = r5.getExt()
            java.lang.String r1 = "s:is_recalled"
            java.lang.String r0 = "0"
            r2.put(r1, r0)
            java.lang.String r0 = r6.getRefmsg_sub_type()
            if (r0 != 0) goto L36
            int r1 = r6.getRefmsg_type()
            r0 = 5
            if (r1 != r0) goto L48
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = r6.getRefmsg_content()     // Catch: java.lang.Exception -> L44
            r1.<init>(r0)     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = "image_id"
            long r3 = r1.optLong(r0)     // Catch: java.lang.Exception -> L44
            com.ss.android.ugc.aweme.emoji.model.Emoji r0 = X.C1BA7.LIZ     // Catch: java.lang.Exception -> L44
            long r1 = r0.getId()     // Catch: java.lang.Exception -> L44
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
        L36:
            java.util.Map r2 = r5.getExt()
            java.lang.String r1 = "a:src"
            java.lang.String r0 = r6.getRefmsg_sub_type()
            r2.put(r1, r0)
            goto L48
        L44:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L48:
            java.lang.String r0 = r6.getRefmsg_light_interaction_name()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L5f
            java.util.Map r2 = r5.getExt()
            java.lang.String r1 = "a:light_interaction_name"
            java.lang.String r0 = r6.getRefmsg_light_interaction_name()
            r2.put(r1, r0)
        L5f:
            java.lang.String r0 = r6.getRefmsg_content()
            r5.setContent(r0)
            int r0 = r6.getRefmsg_type()
            r5.setMsgType(r0)
            java.lang.String r0 = r6.getRefmsg_uid()
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L7f
            long r0 = r0.longValue()
        L7b:
            r5.setSender(r0)
            return r5
        L7f:
            r0 = 0
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ZDX.LJJJJZI(com.ss.android.ugc.aweme.im.common.model.ReferenceInfoHint):X.0Y9l");
    }
}
