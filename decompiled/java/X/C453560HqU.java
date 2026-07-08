package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.DuoAvatarStickerItem;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationImageInfo;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationSAExtInfo;
import com.ss.android.ugc.aweme.im.common.model.IMTypingRecommendationStickerInfo;
import com.ss.android.ugc.aweme.im.common.model.SocialAvatarStickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerUserInfo;
import com.ss.android.ugc.aweme.im.common.model.ThirdPartyTenorExtInfo;
import com.ss.android.ugc.aweme.im.common.model.ThirdpartyStickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.model.AiMojiModel;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0HqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453560HqU {
    public static final String LIZ(StickerItem stickerItem) {
        String str;
        String str2;
        DuoAvatarStickerItem duoAvatarStickerItem = stickerItem.duoAvatarStickerInfo;
        if (duoAvatarStickerItem != null && (str2 = duoAvatarStickerItem.expression) != null && str2.length() > 0) {
            return str2;
        }
        SocialAvatarStickerItem socialAvatarStickerItem = stickerItem.socialAvatarInfo;
        if (socialAvatarStickerItem != null && (str = socialAvatarStickerItem.expression) != null && str.length() > 0) {
            return str;
        }
        StickerBase stickerBase = stickerItem.stickerBase;
        if (stickerBase == null) {
            return null;
        }
        return stickerBase.title;
    }

    public static final String LIZIZ(StickerItem stickerItem) {
        Integer num;
        Long l;
        ThirdPartyTenorExtInfo thirdPartyTenorExtInfo;
        StickerBase stickerBase = stickerItem.stickerBase;
        if (stickerBase != null) {
            num = stickerBase.stickerType;
        } else {
            num = null;
        }
        if (LIZJ(num)) {
            StickerBase stickerBase2 = stickerItem.stickerBase;
            if (stickerBase2 == null) {
                return null;
            }
            return stickerBase2.thirdPartyStickerId;
        }
        StickerBase stickerBase3 = stickerItem.stickerBase;
        if (stickerBase3 != null) {
            Integer num2 = stickerBase3.stickerType;
            int type = EnumC451180Hme.INHOUSE_TENOR.getType();
            if (num2 != null && num2.intValue() == type) {
                ThirdpartyStickerItem thirdpartyStickerItem = stickerItem.thirdPartyStickerInfo;
                if (thirdpartyStickerItem == null || (thirdPartyTenorExtInfo = thirdpartyStickerItem.thirdPartyTenorExtInfo) == null) {
                    return null;
                }
                return thirdPartyTenorExtInfo.tenorId;
            }
        }
        StickerBase stickerBase4 = stickerItem.stickerBase;
        if (stickerBase4 == null || (l = stickerBase4.id) == null) {
            return null;
        }
        return l.toString();
    }

    public static final boolean LIZJ(Integer num) {
        int type = EnumC451180Hme.GIPHY.getType();
        if (num == null || num.intValue() != type) {
            int type2 = EnumC451180Hme.THIRD_PARTY_GIPHY.getType();
            if (num == null || num.intValue() != type2) {
                int type3 = EnumC451180Hme.THIRD_PARTY_TENOR.getType();
                if (num != null && num.intValue() == type3) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @InterfaceC1294060jmO
    public static final C453740Hqm LIZLLL(StickerItem stickerItem) {
        Long l;
        Long l2;
        UrlModel urlModelLJIIIIZZ;
        UrlModel urlModelLJIIIIZZ2;
        Set setSingleton;
        StickerBase stickerBase = stickerItem.stickerBase;
        Long l3 = null;
        if (stickerBase == null) {
            return null;
        }
        Integer num = stickerBase.stickerType;
        int type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
        if (num != null && num.intValue() == type && (l = stickerBase.id) != null) {
            long jLongValue = l.longValue();
            StickerUserInfo stickerUserInfo = stickerItem.userInfo;
            if (stickerUserInfo != null && (l2 = stickerUserInfo.creatorUid) != null) {
                long jLongValue2 = l2.longValue();
                Long l4 = stickerItem.setId;
                if (l4 != null) {
                    long jLongValue3 = l4.longValue();
                    StickerImage stickerImage = stickerBase.thumbnail;
                    if (stickerImage != null) {
                        urlModelLJIIIIZZ = LJIIIIZZ(stickerImage);
                    } else {
                        urlModelLJIIIIZZ = null;
                    }
                    StickerImage stickerImage2 = stickerBase.image;
                    if (stickerImage2 != null) {
                        urlModelLJIIIIZZ2 = LJIIIIZZ(stickerImage2);
                    } else {
                        urlModelLJIIIIZZ2 = null;
                    }
                    AiMojiModel aiMojiModel = new AiMojiModel(urlModelLJIIIIZZ, urlModelLJIIIIZZ2, null, null);
                    String strLIZ = LIZ(stickerItem);
                    if (strLIZ == null || (setSingleton = Collections.singleton(strLIZ)) == null) {
                        setSingleton = C08CX.INSTANCE;
                    }
                    SocialAvatarStickerItem socialAvatarStickerItem = stickerItem.socialAvatarInfo;
                    if (socialAvatarStickerItem != null) {
                        l3 = socialAvatarStickerItem.originalSAStickerId;
                    }
                    return new C453740Hqm(jLongValue, jLongValue2, jLongValue3, aiMojiModel, setSingleton, 1, l3, stickerBase.thirdPartyStickerId);
                }
            }
        }
        return null;
    }

    public static final StickerImage LJ(UrlModel urlModel) {
        return new StickerImage(urlModel.getUri(), urlModel.getUrlList(), Integer.valueOf(urlModel.getWidth()), Integer.valueOf(urlModel.getHeight()), null);
    }

    public static StickerItem LJII(IMTypingRecommendationStickerInfo iMTypingRecommendationStickerInfo) {
        Long lLJIILIIL;
        StickerImage stickerImage;
        StickerImage stickerImage2;
        int type;
        StickerUserInfo stickerUserInfo;
        Long l;
        SocialAvatarStickerItem socialAvatarStickerItem;
        List listSingletonList;
        List listSingletonList2;
        String strLJJLIL;
        String str = iMTypingRecommendationStickerInfo.stickerId;
        if (str != null && (strLJJLIL = a0.LJJLIL(str, "sa:", str)) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(strLJJLIL);
        } else {
            lLJIILIIL = null;
        }
        IMTypingRecommendationImageInfo iMTypingRecommendationImageInfo = iMTypingRecommendationStickerInfo.normalImage;
        if (iMTypingRecommendationImageInfo != null) {
            String str2 = iMTypingRecommendationImageInfo.url;
            if (str2 != null) {
                listSingletonList2 = Collections.singletonList(str2);
            } else {
                listSingletonList2 = null;
            }
            stickerImage = new StickerImage(null, listSingletonList2, iMTypingRecommendationImageInfo.width, iMTypingRecommendationImageInfo.height, iMTypingRecommendationImageInfo.type);
        } else {
            stickerImage = null;
        }
        IMTypingRecommendationImageInfo iMTypingRecommendationImageInfo2 = iMTypingRecommendationStickerInfo.smallImage;
        if (iMTypingRecommendationImageInfo2 != null) {
            String str3 = iMTypingRecommendationImageInfo2.url;
            if (str3 != null) {
                listSingletonList = Collections.singletonList(str3);
            } else {
                listSingletonList = null;
            }
            stickerImage2 = new StickerImage(null, listSingletonList, iMTypingRecommendationImageInfo2.width, iMTypingRecommendationImageInfo2.height, iMTypingRecommendationImageInfo2.type);
        } else {
            stickerImage2 = null;
        }
        if (iMTypingRecommendationStickerInfo.socialAvartarExtInfo != null) {
            type = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
        } else {
            type = EnumC451180Hme.GIPHY.getType();
        }
        StickerBase stickerBase = new StickerBase(lLJIILIIL, stickerImage, stickerImage2, Integer.valueOf(type), null, null, iMTypingRecommendationStickerInfo.stickerId);
        IMTypingRecommendationSAExtInfo iMTypingRecommendationSAExtInfo = iMTypingRecommendationStickerInfo.socialAvartarExtInfo;
        if (iMTypingRecommendationSAExtInfo != null) {
            stickerUserInfo = new StickerUserInfo(iMTypingRecommendationSAExtInfo.creatorUid, null, null);
        } else {
            stickerUserInfo = null;
        }
        IMTypingRecommendationSAExtInfo iMTypingRecommendationSAExtInfo2 = iMTypingRecommendationStickerInfo.socialAvartarExtInfo;
        if (iMTypingRecommendationSAExtInfo2 != null) {
            l = iMTypingRecommendationSAExtInfo2.originalStickerSetId;
        } else {
            l = null;
        }
        if (iMTypingRecommendationSAExtInfo2 != null) {
            socialAvatarStickerItem = new SocialAvatarStickerItem(iMTypingRecommendationSAExtInfo2.creatorUid, "", null, null, null, iMTypingRecommendationSAExtInfo2.originalStickerId, null, null);
        } else {
            socialAvatarStickerItem = null;
        }
        return new StickerItem(stickerBase, stickerUserInfo, null, null, null, null, null, null, l, null, null, null, null, socialAvatarStickerItem, null, new ThirdpartyStickerItem(iMTypingRecommendationStickerInfo.stickerType, null), null, null, null, null, null, null, null, 8347372, null);
    }

    public static final UrlModel LJIIIIZZ(StickerImage stickerImage) {
        UrlModel urlModel = new UrlModel();
        String str = stickerImage.uri;
        if (str != null) {
            urlModel.setUri(str);
        }
        List<String> list = stickerImage.urlList;
        if (list != null) {
            urlModel.setUrlList(list);
        }
        Integer num = stickerImage.width;
        if (num != null) {
            urlModel.setWidth(num.intValue());
        }
        Integer num2 = stickerImage.height;
        if (num2 != null) {
            urlModel.setHeight(num2.intValue());
        }
        return urlModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.im.common.model.StickerItem LJFF(com.ss.android.ugc.aweme.im.common.model.SetSticker r27, java.lang.Long r28) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C453560HqU.LJFF(com.ss.android.ugc.aweme.im.common.model.SetSticker, java.lang.Long):com.ss.android.ugc.aweme.im.common.model.StickerItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.im.common.model.StickerItem LJI(com.ss.android.ugc.aweme.im.common.model.VideoSticker r27, java.lang.Long r28) {
        /*
            com.ss.android.ugc.aweme.im.common.model.StickerItem r3 = new com.ss.android.ugc.aweme.im.common.model.StickerItem
            com.ss.android.ugc.aweme.im.common.model.StickerBase r4 = new com.ss.android.ugc.aweme.im.common.model.StickerBase
            java.lang.Long r8 = r27.getVideoStickerId()
            java.lang.Integer r0 = r27.getStickerType()
            X.0Hme r2 = X.EnumC451180Hme.VIDEO_STICKER_ANIMATED
            int r1 = r2.getType()
            r10 = 0
            if (r0 == 0) goto Laa
            int r0 = r0.intValue()
            if (r0 != r1) goto Laa
            com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct r0 = r27.getAnimateUrl()
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.midResolutionUrl
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.im.common.model.StickerImage r9 = LJ(r0)
        L29:
            java.lang.Integer r0 = r27.getStickerType()
            int r1 = r2.getType()
            if (r0 == 0) goto L9b
            int r0 = r0.intValue()
            if (r0 != r1) goto L9b
            com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct r0 = r27.getAnimateUrl()
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.lowResolutionUrl
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.im.common.model.StickerImage r10 = LJ(r0)
        L47:
            java.lang.Integer r11 = r27.getStickerType()
            java.lang.Integer r12 = r27.getStatus()
            r6 = 0
            r7 = r4
            r13 = r6
            r14 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.im.common.model.StickerUserInfo r5 = new com.ss.android.ugc.aweme.im.common.model.StickerUserInfo
            java.lang.Long r1 = r27.getCreatorUid()
            java.lang.String r0 = r27.getCreatorNickName()
            r5.<init>(r1, r0, r6)
            java.lang.String r9 = r27.getReviewMsg()
            com.ss.android.ugc.aweme.im.common.model.VideoToStickerItem r15 = new com.ss.android.ugc.aweme.im.common.model.VideoToStickerItem
            java.lang.Long r1 = r27.getOriginVideoUserId()
            java.lang.Long r0 = r27.getOriginVideoId()
            r15.<init>(r1, r0)
            r27 = 8386508(0x7ff7cc, float:1.1752001E-38)
            r8 = r28
            r7 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r25 = r6
            r26 = r6
            r28 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r3
        L9b:
            com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct r0 = r27.getStaticUrl()
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.lowResolutionUrl
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.im.common.model.StickerImage r10 = LJ(r0)
            goto L47
        Laa:
            com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct r0 = r27.getStaticUrl()
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.midResolutionUrl
            if (r0 == 0) goto Lba
            com.ss.android.ugc.aweme.im.common.model.StickerImage r9 = LJ(r0)
            goto L29
        Lba:
            r9 = r10
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C453560HqU.LJI(com.ss.android.ugc.aweme.im.common.model.VideoSticker, java.lang.Long):com.ss.android.ugc.aweme.im.common.model.StickerItem");
    }
}
