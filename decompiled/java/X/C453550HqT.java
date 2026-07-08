package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.common.experiment.IMPhoto2StickerInlineConfig;
import com.ss.android.ugc.aweme.im.common.model.DuoAvatarStickerItem;
import com.ss.android.ugc.aweme.im.common.model.IMGiphyInfo;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationImageInfo;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationStickerInfo;
import com.ss.android.ugc.aweme.im.common.model.SocialAvatarStickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.im.common.model.StickerUserInfo;
import com.ss.android.ugc.aweme.im.common.model.ThirdpartyStickerItem;
import com.ss.android.ugc.aweme.im.common.model.TypingRecommendationItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.common.model.VideoToStickerItem;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.service.analytics.IIMEmojiAnalytics;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0HqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453550HqT {
    public static final String LIZ(StickerItem stickerItem) {
        SocialAvatarStickerItem socialAvatarStickerItem;
        Long l;
        List<Long> list;
        StickerBase stickerBase;
        Integer num = stickerItem.createSource;
        int source = C0HK7.AVATAR_DUO.getSource();
        if (num != null && num.intValue() == source) {
            DuoAvatarStickerItem duoAvatarStickerItem = stickerItem.duoAvatarStickerInfo;
            if (duoAvatarStickerItem == null || (list = duoAvatarStickerItem.userIdList) == null) {
                return null;
            }
            String str = duoAvatarStickerItem.expression;
            if ((str == null || str.length() <= 0) && ((stickerBase = stickerItem.stickerBase) == null || (str = stickerBase.title) == null)) {
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(C13LP.LJJLIIIJ(list, ":", null, null, 0, null, null, 62));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (C441280HSc.LIZ() && (socialAvatarStickerItem = stickerItem.socialAvatarInfo) != null && socialAvatarStickerItem.elementType != null) {
            StickerBase stickerBase2 = stickerItem.stickerBase;
            if (stickerBase2 == null || (l = stickerBase2.id) == null) {
                return null;
            }
            return l.toString();
        }
        SocialAvatarStickerItem socialAvatarStickerItem2 = stickerItem.socialAvatarInfo;
        if (socialAvatarStickerItem2 == null) {
            return null;
        }
        return socialAvatarStickerItem2.expression;
    }

    public static final Long LIZIZ(StickerItem stickerItem) {
        long jLongValue;
        String str;
        Long lLJIILIIL;
        Long l;
        TypingRecommendationItem typingRecommendationItem = stickerItem.typingRecommendationItem;
        if (typingRecommendationItem != null && (l = typingRecommendationItem.typingRecommendationAlgoEtId) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        if (jLongValue > 0) {
            TypingRecommendationItem typingRecommendationItem2 = stickerItem.typingRecommendationItem;
            if (typingRecommendationItem2 == null) {
                return null;
            }
            return typingRecommendationItem2.typingRecommendationAlgoEtId;
        }
        StickerBase stickerBase = stickerItem.stickerBase;
        if (stickerBase != null && (str = stickerBase.thirdPartyStickerId) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            return lLJIILIIL;
        }
        StickerBase stickerBase2 = stickerItem.stickerBase;
        if (stickerBase2 == null) {
            return null;
        }
        return stickerBase2.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZJ(com.ss.android.ugc.aweme.im.common.model.StickerItem r3) {
        /*
            com.ss.android.ugc.aweme.im.common.model.StickerBase r0 = r3.stickerBase
            if (r0 == 0) goto L45
            java.lang.Integer r2 = r0.stickerType
            X.0Hme r0 = X.EnumC451180Hme.INHOUSE_TENOR
            int r1 = r0.getType()
            if (r2 == 0) goto L45
            int r0 = r2.intValue()
            if (r0 != r1) goto L45
            r0 = 1
        L15:
            r1 = 0
            if (r0 == 0) goto L23
            com.ss.android.ugc.aweme.im.common.model.ThirdpartyStickerItem r0 = r3.thirdPartyStickerInfo
            if (r0 == 0) goto L22
            com.ss.android.ugc.aweme.im.common.model.ThirdPartyTenorExtInfo r0 = r0.thirdPartyTenorExtInfo
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.tenorId
        L22:
            return r1
        L23:
            com.ss.android.ugc.aweme.im.common.model.StickerBase r0 = r3.stickerBase
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.thirdPartyStickerId
            if (r0 == 0) goto L38
            int r0 = r0.length()
            if (r0 <= 0) goto L38
            com.ss.android.ugc.aweme.im.common.model.StickerBase r0 = r3.stickerBase
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.thirdPartyStickerId
            return r1
        L38:
            com.ss.android.ugc.aweme.im.common.model.StickerBase r0 = r3.stickerBase
            if (r0 == 0) goto L22
            java.lang.Long r0 = r0.id
            if (r0 == 0) goto L22
            java.lang.String r1 = r0.toString()
            return r1
        L45:
            r0 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C453550HqT.LIZJ(com.ss.android.ugc.aweme.im.common.model.StickerItem):java.lang.String");
    }

    public static final StickerUrlStruct LIZLLL(StickerItem stickerItem) {
        UrlModel urlModelLJIIIIZZ;
        StickerImage stickerImage;
        StickerImage stickerImage2;
        StickerBase stickerBase = stickerItem.stickerBase;
        UrlModel urlModelLJIIIIZZ2 = null;
        if (stickerBase != null && (stickerImage2 = stickerBase.thumbnail) != null) {
            urlModelLJIIIIZZ = C453560HqU.LJIIIIZZ(stickerImage2);
        } else {
            urlModelLJIIIIZZ = null;
        }
        StickerBase stickerBase2 = stickerItem.stickerBase;
        if (stickerBase2 != null && (stickerImage = stickerBase2.image) != null) {
            urlModelLJIIIIZZ2 = C453560HqU.LJIIIIZZ(stickerImage);
        }
        return new StickerUrlStruct(urlModelLJIIIIZZ, urlModelLJIIIIZZ2, null, null);
    }

    public static final String LJ(StickerItem stickerItem) {
        Integer num;
        Integer num2;
        IIMEmojiAnalytics.LIZ.getClass();
        IIMEmojiAnalytics iIMEmojiAnalyticsLIZ = C453520HqQ.LIZ();
        if (iIMEmojiAnalyticsLIZ != null) {
            StickerBase stickerBase = stickerItem.stickerBase;
            if (stickerBase != null) {
                num2 = stickerBase.stickerType;
            } else {
                num2 = null;
            }
            String strLIZ = iIMEmojiAnalyticsLIZ.LIZ(num2);
            if (strLIZ != null && strLIZ.length() > 0) {
                return strLIZ;
            }
        }
        StickerBase stickerBase2 = stickerItem.stickerBase;
        if (stickerBase2 == null || (num = stickerBase2.stickerType) == null) {
            return null;
        }
        return num.toString();
    }

    public static final boolean LJFF(C869590Y9l c869590Y9l) {
        StickerTemplate stickerTemplate;
        if (!IMStickerApi.LIZ.LIZIZ().getImAiSelfStickerService().LJI()) {
            return false;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (!(baseTemplateLIZ instanceof StickerTemplate) || (stickerTemplate = (StickerTemplate) baseTemplateLIZ) == null) {
            return false;
        }
        Integer numLIZLLL = C2243571Crb.LIZLLL(stickerTemplate);
        int type = EnumC451180Hme.AISELF_STICKER.getType();
        if (numLIZLLL == null || numLIZLLL.intValue() != type || C0ZDX.LJJJJIZL(c869590Y9l)) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(C869590Y9l c869590Y9l) {
        if (!((IMPhoto2StickerInlineConfig) C453580HqW.LIZIZ.getValue()).isEnabled || !C0BB8.LIZ() || c869590Y9l.getMsgType() != 1803 || !c869590Y9l.isSuccessStatus() || !C0ZDX.LJJJJIZL(c869590Y9l)) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(C869590Y9l c869590Y9l) {
        if (!((IMPhoto2StickerInlineConfig) C453580HqW.LIZIZ.getValue()).isEnabled || c869590Y9l.getMsgType() != 1802 || !c869590Y9l.isSuccessStatus() || !C0ZDX.LJJJJIZL(c869590Y9l)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(C869590Y9l c869590Y9l) {
        StickerTemplate stickerTemplate;
        if (!((IMPhoto2StickerInlineConfig) C453580HqW.LIZIZ.getValue()).isEnabled) {
            return false;
        }
        BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
        if (!(baseTemplateLIZ instanceof StickerTemplate) || (stickerTemplate = (StickerTemplate) baseTemplateLIZ) == null) {
            return false;
        }
        Integer numLIZLLL = C2243571Crb.LIZLLL(stickerTemplate);
        int type = EnumC451180Hme.PHOTO_STICKER.getType();
        if (numLIZLLL == null || numLIZLLL.intValue() != type || !c869590Y9l.isSuccessStatus() || C0ZDX.LJJJJIZL(c869590Y9l)) {
            return false;
        }
        return true;
    }

    public static final C451030HmP LJIIIZ(IMGiphyInfo iMGiphyInfo) {
        int iIntValue;
        C451030HmP c451030HmP = new C451030HmP();
        Emoji emoji = new Emoji();
        emoji.setAnimateType(iMGiphyInfo.getType());
        emoji.setStickerType(3);
        Integer width = iMGiphyInfo.getWidth();
        int iIntValue2 = 200;
        if (width != null) {
            iIntValue = width.intValue();
        } else {
            iIntValue = 200;
        }
        emoji.setWidth(iIntValue);
        Integer height = iMGiphyInfo.getHeight();
        if (height != null) {
            iIntValue2 = height.intValue();
        }
        emoji.setHeight(iIntValue2);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(Collections.singletonList(iMGiphyInfo.getUrl()));
        emoji.setAnimateUrl(urlModel);
        emoji.setStickerId(iMGiphyInfo.getId());
        c451030HmP.LIZJ = emoji;
        c451030HmP.LJI = iMGiphyInfo;
        return c451030HmP;
    }

    public static final IMGiphyInfo LJIIJ(StickerItem stickerItem) {
        String str;
        Integer num;
        Integer num2;
        String str2;
        String str3;
        Integer num3;
        Integer num4;
        String str4;
        List<String> list;
        List<String> list2;
        StickerBase stickerBase = stickerItem.stickerBase;
        Integer num5 = null;
        if (stickerBase == null || !C453560HqU.LIZJ(stickerBase.stickerType)) {
            return null;
        }
        String str5 = stickerBase.thirdPartyStickerId;
        StickerImage stickerImage = stickerBase.image;
        if (stickerImage != null && (list2 = stickerImage.urlList) != null) {
            str = (String) C13LP.LJJJLL(list2);
        } else {
            str = null;
        }
        StickerImage stickerImage2 = stickerBase.image;
        if (stickerImage2 != null) {
            num = stickerImage2.width;
            num2 = stickerImage2.height;
            str2 = stickerImage2.imageType;
        } else {
            num = null;
            num2 = null;
            str2 = null;
        }
        IMTypingRecommendationImageInfo iMTypingRecommendationImageInfo = new IMTypingRecommendationImageInfo(str, num, num2, str2);
        StickerImage stickerImage3 = stickerBase.thumbnail;
        if (stickerImage3 != null && (list = stickerImage3.urlList) != null) {
            str3 = (String) C13LP.LJJJLL(list);
        } else {
            str3 = null;
        }
        StickerImage stickerImage4 = stickerBase.thumbnail;
        if (stickerImage4 != null) {
            num3 = stickerImage4.width;
            num4 = stickerImage4.height;
            str4 = stickerImage4.imageType;
        } else {
            num3 = null;
            num4 = null;
            str4 = null;
        }
        IMTypingRecommendationImageInfo iMTypingRecommendationImageInfo2 = new IMTypingRecommendationImageInfo(str3, num3, num4, str4);
        Integer num6 = stickerBase.stickerType;
        int type = EnumC451180Hme.THIRD_PARTY_GIPHY.getType();
        if (num6 != null && num6.intValue() == type) {
            num5 = 1;
        } else {
            int type2 = EnumC451180Hme.THIRD_PARTY_TENOR.getType();
            if (num6 != null && num6.intValue() == type2) {
                num5 = 2;
            } else {
                int type3 = EnumC451180Hme.GIPHY.getType();
                if (num6 != null && num6.intValue() == type3) {
                    ThirdpartyStickerItem thirdpartyStickerItem = stickerItem.thirdPartyStickerInfo;
                    if (thirdpartyStickerItem != null) {
                        num5 = thirdpartyStickerItem.source;
                    }
                } else {
                    num5 = 0;
                }
            }
        }
        return C453570HqV.LIZJ(new IMTypingRecommendationStickerInfo(str5, iMTypingRecommendationImageInfo, iMTypingRecommendationImageInfo2, null, num5, stickerBase.id, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.im.common.model.SetSticker LJIIJJI(com.ss.android.ugc.aweme.im.common.model.StickerItem r19) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C453550HqT.LJIIJJI(com.ss.android.ugc.aweme.im.common.model.StickerItem):com.ss.android.ugc.aweme.im.common.model.SetSticker");
    }

    public static final VideoSticker LJIIL(StickerItem stickerItem) {
        long jLongValue;
        Long l;
        Long l2;
        StickerUrlStruct stickerUrlStruct;
        int status;
        String str;
        StickerBase stickerBase = stickerItem.stickerBase;
        Long l3 = null;
        if (stickerBase == null) {
            return null;
        }
        Integer num = stickerBase.stickerType;
        EnumC451180Hme enumC451180Hme = EnumC451180Hme.VIDEO_STICKER_STATIC;
        int type = enumC451180Hme.getType();
        if (num == null || num.intValue() != type) {
            Integer num2 = stickerBase.stickerType;
            int type2 = EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType();
            if (num2 == null || num2.intValue() != type2) {
                return null;
            }
        }
        StickerUrlStruct stickerUrlStructLIZLLL = LIZLLL(stickerItem);
        Long l4 = stickerItem.favoriteTime;
        if (l4 != null) {
            jLongValue = l4.longValue();
        } else {
            jLongValue = 0;
        }
        Long l5 = stickerBase.id;
        VideoToStickerItem videoToStickerItem = stickerItem.videoStickerInfo;
        if (videoToStickerItem != null) {
            l = videoToStickerItem.originalVideoId;
            l2 = videoToStickerItem.userId;
        } else {
            l = null;
            l2 = null;
        }
        StickerUserInfo stickerUserInfo = stickerItem.userInfo;
        if (stickerUserInfo != null) {
            l3 = stickerUserInfo.creatorUid;
        }
        Integer num3 = stickerBase.moderationStatus;
        Integer num4 = stickerBase.stickerType;
        int type3 = enumC451180Hme.getType();
        if (num4 != null && num4.intValue() == type3) {
            stickerUrlStruct = stickerUrlStructLIZLLL;
        } else {
            stickerUrlStruct = null;
        }
        Integer num5 = stickerBase.stickerType;
        int type4 = EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType();
        if (num5 == null || num5.intValue() != type4) {
            stickerUrlStructLIZLLL = null;
        }
        if (jLongValue > 0) {
            status = EnumC120600d2.FAVORITE.getStatus();
        } else {
            status = EnumC120600d2.NOT_FAVORITE.getStatus();
        }
        Integer numValueOf = Integer.valueOf(status);
        StickerUserInfo stickerUserInfo2 = stickerItem.userInfo;
        if (stickerUserInfo2 != null) {
            str = stickerUserInfo2.creatorNickname;
        } else {
            str = null;
        }
        return new VideoSticker(l5, l, l2, l3, null, num3, num4, stickerUrlStruct, stickerUrlStructLIZLLL, numValueOf, null, str, null, null);
    }
}
