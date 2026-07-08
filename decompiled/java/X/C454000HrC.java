package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.experiment.CommentStickerConsumptionSpecExp;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.im.common.model.AIMojiStickerItem;
import com.ss.android.ugc.aweme.im.common.model.AiMojiStickerSet;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerImage;
import com.ss.android.ugc.aweme.im.common.model.StickerSubType;
import com.ss.android.ugc.aweme.im.common.model.StickerUserInfo;
import com.ss.android.ugc.aweme.im.common.model.SubOnlyStickerItem;
import com.ss.android.ugc.aweme.im.common.model.ThirdpartyStickerItem;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.common.model.VideoToStickerItem;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0HrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454000HrC {
    public static final C454000HrC LIZ = new C454000HrC();

    public static final String LJII() {
        int iFJ;
        long jHN;
        int iLIZJ = CommentWithStickerExp.LIZJ();
        if (iLIZJ == EnumC454020HrE.ONLY_COMMENT.getType()) {
            C0I05 c0i05 = C0I05.LIZ;
            iFJ = C0I05.LIZJ(c0i05);
            jHN = C0I05.LIZLLL(c0i05);
        } else {
            if (iLIZJ != EnumC454020HrE.MEMORY_COMMENT_AND_DM.getType()) {
                return "emoji";
            }
            C454640HsE c454640HsE = IMStickerApi.LIZ;
            iFJ = c454640HsE.LIZIZ().getImStickerInputPanelService().LJIIIZ().fJ();
            jHN = c454640HsE.LIZIZ().getImStickerInputPanelService().LJIIIZ().hN();
        }
        if (iFJ == -1) {
            return "emoji";
        }
        switch (iFJ) {
            case 5:
                return "emoji";
            case 6:
            default:
                return "";
            case 7:
                return "favorite";
            case 8:
                return "GIF";
            case BdTuring.TYPE_ECAF /* 9 */:
                return jHN != -1 ? String.valueOf(jHN) : "";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "avatar";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.comment.model.CommentStickerInfo LIZIZ(com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r4) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454000HrC.LIZIZ(com.ss.android.ugc.aweme.comment.model.CommentStickerStruct):com.ss.android.ugc.aweme.comment.model.CommentStickerInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006e A[PHI: r0
      0x006e: PHI (r0v67 com.ss.android.ugc.aweme.base.model.UrlModel) = 
      (r0v15 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r0v18 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r0v69 com.ss.android.ugc.aweme.base.model.UrlModel)
     binds: [B:161:0x0264, B:150:0x0244, B:34:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080 A[PHI: r0
      0x0080: PHI (r0v64 com.ss.android.ugc.aweme.base.model.UrlModel) = 
      (r0v23 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r0v26 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r0v66 com.ss.android.ugc.aweme.base.model.UrlModel)
     binds: [B:144:0x0234, B:133:0x0214, B:39:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00eb A[PHI: r0
      0x00eb: PHI (r0v60 com.ss.android.ugc.aweme.base.model.UrlModel) = 
      (r0v40 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r0v43 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r0v62 com.ss.android.ugc.aweme.base.model.UrlModel)
     binds: [B:125:0x01fd, B:114:0x01dd, B:74:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd A[PHI: r0
      0x00fd: PHI (r0v57 com.ss.android.ugc.aweme.base.model.UrlModel) = 
      (r0v48 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r0v51 com.ss.android.ugc.aweme.base.model.UrlModel)
      (r0v59 com.ss.android.ugc.aweme.base.model.UrlModel)
     binds: [B:108:0x01cd, B:97:0x01ad, B:79:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.im.common.model.StickerItem LIZJ(com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r27) {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454000HrC.LIZJ(com.ss.android.ugc.aweme.comment.model.CommentStickerStruct):com.ss.android.ugc.aweme.im.common.model.StickerItem");
    }

    public static final CommentStickerStruct LIZLLL(C454060HrI c454060HrI) {
        Integer num;
        Integer num2;
        Long l;
        String str;
        Long l2;
        Long l3;
        Long l4;
        Integer num3;
        int i;
        List<String> listLJJLIIIJILLIZJL;
        String str2;
        String str3;
        List<String> list;
        int iIntValue;
        String str4;
        String str5;
        StickerImage stickerImage;
        StickerImage stickerImage2;
        Integer num4;
        StickerImage stickerImage3;
        Integer num5;
        StickerImage stickerImage4;
        CommentStickerStruct commentStickerStruct = new CommentStickerStruct();
        commentStickerStruct.setStickerEnterMethod(c454060HrI.LIZIZ.getValue());
        StickerBase stickerBase = c454060HrI.LIZ.stickerBase;
        Integer num6 = null;
        if (stickerBase != null) {
            num = stickerBase.stickerType;
        } else {
            num = null;
        }
        commentStickerStruct.setStickerType(num);
        StickerBase stickerBase2 = c454060HrI.LIZ.stickerBase;
        if (stickerBase2 != null) {
            num2 = stickerBase2.stickerType;
        } else {
            num2 = null;
        }
        int iIntValue2 = 0;
        if (C453560HqU.LIZJ(num2)) {
            UrlModel urlModel = new UrlModel();
            StickerBase stickerBase3 = c454060HrI.LIZ.stickerBase;
            if (stickerBase3 != null && (stickerImage4 = stickerBase3.image) != null) {
                list = stickerImage4.urlList;
            } else {
                list = null;
            }
            urlModel.setUrlList(list);
            StickerBase stickerBase4 = c454060HrI.LIZ.stickerBase;
            if (stickerBase4 != null && (stickerImage3 = stickerBase4.image) != null && (num5 = stickerImage3.width) != null) {
                iIntValue = num5.intValue();
            } else {
                iIntValue = 0;
            }
            urlModel.setWidth(iIntValue);
            StickerBase stickerBase5 = c454060HrI.LIZ.stickerBase;
            if (stickerBase5 != null && (stickerImage2 = stickerBase5.image) != null && (num4 = stickerImage2.height) != null) {
                iIntValue2 = num4.intValue();
            }
            urlModel.setHeight(iIntValue2);
            StickerBase stickerBase6 = c454060HrI.LIZ.stickerBase;
            if (stickerBase6 != null) {
                str4 = stickerBase6.thirdPartyStickerId;
            } else {
                str4 = null;
            }
            commentStickerStruct.setId(str4);
            C454000HrC c454000HrC = LIZ;
            StickerBase stickerBase7 = c454060HrI.LIZ.stickerBase;
            c454000HrC.getClass();
            commentStickerStruct.setAnimatedUrl(LJ(stickerBase7));
            StickerBase stickerBase8 = c454060HrI.LIZ.stickerBase;
            if (stickerBase8 != null && (stickerImage = stickerBase8.image) != null) {
                str5 = stickerImage.imageType;
            } else {
                str5 = null;
            }
            commentStickerStruct.setGiphyFormat(str5);
            ThirdpartyStickerItem thirdpartyStickerItem = c454060HrI.LIZ.thirdPartyStickerInfo;
            if (thirdpartyStickerItem != null) {
                num6 = thirdpartyStickerItem.source;
            }
            commentStickerStruct.setRecommendSubType(num6);
            return commentStickerStruct;
        }
        StickerBase stickerBase9 = c454060HrI.LIZ.stickerBase;
        if (stickerBase9 != null) {
            l = stickerBase9.id;
        } else {
            l = null;
        }
        commentStickerStruct.setId(String.valueOf(l));
        StickerUserInfo stickerUserInfo = c454060HrI.LIZ.userInfo;
        if (stickerUserInfo != null) {
            str = stickerUserInfo.creatorNickname;
        } else {
            str = null;
        }
        commentStickerStruct.setName(str);
        VideoToStickerItem videoToStickerItem = c454060HrI.LIZ.videoStickerInfo;
        if (videoToStickerItem != null) {
            l2 = videoToStickerItem.originalVideoId;
        } else {
            l2 = null;
        }
        commentStickerStruct.setOriginVideoId(l2);
        VideoToStickerItem videoToStickerItem2 = c454060HrI.LIZ.videoStickerInfo;
        if (videoToStickerItem2 != null) {
            l3 = videoToStickerItem2.userId;
        } else {
            l3 = null;
        }
        commentStickerStruct.setOriginVideoAuthorUid(l3);
        StickerUserInfo stickerUserInfo2 = c454060HrI.LIZ.userInfo;
        if (stickerUserInfo2 != null) {
            l4 = stickerUserInfo2.creatorUid;
        } else {
            l4 = null;
        }
        commentStickerStruct.setCreatorUid(l4);
        StickerBase stickerBase10 = c454060HrI.LIZ.stickerBase;
        if (stickerBase10 != null) {
            num3 = stickerBase10.moderationStatus;
        } else {
            num3 = null;
        }
        commentStickerStruct.setV2sStatus(num3);
        C454000HrC c454000HrC2 = LIZ;
        StickerBase stickerBase11 = c454060HrI.LIZ.stickerBase;
        c454000HrC2.getClass();
        commentStickerStruct.setStaticUrl(LJ(stickerBase11));
        commentStickerStruct.setAnimatedUrl(LJ(c454060HrI.LIZ.stickerBase));
        if (C08A4.LIZIZ(c454060HrI.LIZ.favoriteTime)) {
            i = 1;
        } else {
            i = 0;
        }
        commentStickerStruct.setUserFavorite(i);
        commentStickerStruct.setReviewMsg(c454060HrI.LIZ.moderationReason);
        commentStickerStruct.setSetId(c454060HrI.LIZ.setId);
        AIMojiStickerItem aIMojiStickerItem = c454060HrI.LIZ.aimojiInfo;
        if (aIMojiStickerItem != null && (str3 = aIMojiStickerItem.expression) != null) {
            listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL = null;
        }
        commentStickerStruct.setExpressions(listLJJLIIIJILLIZJL);
        SubOnlyStickerItem subOnlyStickerItem = c454060HrI.LIZ.subOnlyInfo;
        if (subOnlyStickerItem != null) {
            str2 = subOnlyStickerItem.tierId;
        } else {
            str2 = null;
        }
        commentStickerStruct.setTierId(str2);
        SubOnlyStickerItem subOnlyStickerItem2 = c454060HrI.LIZ.subOnlyInfo;
        if (subOnlyStickerItem2 != null) {
            num6 = subOnlyStickerItem2.subType;
        }
        commentStickerStruct.setStickerSubType(num6);
        return commentStickerStruct;
    }

    public static StickerUrlStruct LJ(StickerBase stickerBase) {
        List<String> list;
        int iIntValue;
        int iIntValue2;
        List<String> list2;
        int iIntValue3;
        StickerImage stickerImage;
        StickerImage stickerImage2;
        Integer num;
        StickerImage stickerImage3;
        Integer num2;
        StickerImage stickerImage4;
        StickerImage stickerImage5;
        Integer num3;
        StickerImage stickerImage6;
        Integer num4;
        StickerImage stickerImage7;
        UrlModel urlModel = new UrlModel();
        String str = null;
        if (stickerBase != null && (stickerImage7 = stickerBase.thumbnail) != null) {
            list = stickerImage7.urlList;
        } else {
            list = null;
        }
        urlModel.setUrlList(list);
        int iIntValue4 = 0;
        if (stickerBase != null && (stickerImage6 = stickerBase.thumbnail) != null && (num4 = stickerImage6.width) != null) {
            iIntValue = num4.intValue();
        } else {
            iIntValue = 0;
        }
        urlModel.setWidth(iIntValue);
        if (stickerBase != null && (stickerImage5 = stickerBase.thumbnail) != null && (num3 = stickerImage5.height) != null) {
            iIntValue2 = num3.intValue();
        } else {
            iIntValue2 = 0;
        }
        urlModel.setHeight(iIntValue2);
        UrlModel urlModel2 = new UrlModel();
        if (stickerBase != null && (stickerImage4 = stickerBase.image) != null) {
            list2 = stickerImage4.urlList;
        } else {
            list2 = null;
        }
        urlModel2.setUrlList(list2);
        if (stickerBase != null && (stickerImage3 = stickerBase.image) != null && (num2 = stickerImage3.width) != null) {
            iIntValue3 = num2.intValue();
        } else {
            iIntValue3 = 0;
        }
        urlModel2.setWidth(iIntValue3);
        if (stickerBase != null && (stickerImage2 = stickerBase.image) != null && (num = stickerImage2.height) != null) {
            iIntValue4 = num.intValue();
        }
        urlModel2.setHeight(iIntValue4);
        if (stickerBase != null && (stickerImage = stickerBase.image) != null) {
            str = stickerImage.uri;
        }
        return new StickerUrlStruct(urlModel, urlModel2, urlModel2, str);
    }

    public static StickerUrlStruct LJFF(com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct stickerUrlStruct) {
        UrlModel urlModel;
        UrlModel urlModel2;
        UrlModel urlModel3;
        String str = null;
        if (stickerUrlStruct != null) {
            urlModel = stickerUrlStruct.lowResolutionUrl;
            urlModel2 = stickerUrlStruct.midResolutionUrl;
            urlModel3 = stickerUrlStruct.highResolutionUrl;
            str = stickerUrlStruct.uri;
        } else {
            urlModel = null;
            urlModel2 = null;
            urlModel3 = null;
        }
        return new StickerUrlStruct(urlModel, urlModel2, urlModel3, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041 A[PHI: r3
      0x0041: PHI (r3v1 java.util.List<java.lang.String>) = 
      (r3v0 java.util.List<java.lang.String>)
      (r3v3 java.util.List<java.lang.String>)
      (r3v3 java.util.List<java.lang.String>)
     binds: [B:25:0x003e, B:10:0x0015, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJI(com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L3d
            com.ss.android.ugc.aweme.comment.model.StickerUrlStruct r1 = r4.getAnimatedUrl()
            if (r1 == 0) goto L3d
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.midResolutionUrl
            if (r1 == 0) goto L3d
            java.util.List r3 = r1.getUrlList()
        L11:
            com.ss.android.ugc.aweme.comment.model.StickerUrlStruct r1 = r4.getStaticUrl()
            if (r1 == 0) goto L41
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.midResolutionUrl
            if (r1 == 0) goto L41
            java.util.List r2 = r1.getUrlList()
        L1f:
            boolean r1 = X.C866950Xzh.LIZIZ(r3)
            if (r1 == 0) goto L2e
            if (r3 == 0) goto L2d
            java.lang.Object r0 = X.C13LP.LJJJLL(r3)
            java.lang.String r0 = (java.lang.String) r0
        L2d:
            return r0
        L2e:
            boolean r1 = X.C866950Xzh.LIZIZ(r2)
            if (r1 == 0) goto L2d
            if (r2 == 0) goto L2d
            java.lang.Object r0 = X.C13LP.LJJJLL(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L3d:
            r3 = r0
            if (r4 == 0) goto L41
            goto L11
        L41:
            r2 = r0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454000HrC.LJI(com.ss.android.ugc.aweme.comment.model.CommentStickerStruct):java.lang.String");
    }

    public static final String LJIIIIZZ(Integer num) {
        int type = EnumC451180Hme.ANIMATED.getType();
        if (num == null || num.intValue() != type) {
            int type2 = EnumC451180Hme.STATIC.getType();
            if (num != null && num.intValue() == type2) {
                return "sticker";
            }
            int type3 = EnumC451180Hme.VIDEO_STICKER_STATIC.getType();
            if (num == null || num.intValue() != type3) {
                int type4 = EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType();
                if (num != null && num.intValue() == type4) {
                    return "video_sticker";
                }
                int type5 = EnumC451180Hme.PHOTO_STICKER.getType();
                if (num != null && num.intValue() == type5) {
                    return "ugc_sticker";
                }
                int type6 = EnumC451180Hme.AIMOJI_STICKER_STATIC.getType();
                if (num != null && num.intValue() == type6) {
                    return "aimoji";
                }
                int type7 = EnumC451180Hme.GIPHY.getType();
                if (num == null || num.intValue() != type7) {
                    int type8 = EnumC451180Hme.THIRD_PARTY_GIPHY.getType();
                    if (num != null && num.intValue() == type8) {
                        return "giphy";
                    }
                    int type9 = EnumC451180Hme.THIRD_PARTY_TENOR.getType();
                    if (num != null && num.intValue() == type9) {
                        return "tenor";
                    }
                    int type10 = EnumC451180Hme.INHOUSE_TENOR.getType();
                    if (num != null && num.intValue() == type10) {
                        return "in_house_sticker";
                    }
                    int type11 = EnumC451180Hme.PHOTO_COMMENT_STICKER.getType();
                    if (num != null && num.intValue() == type11) {
                        return "photo_comment";
                    }
                    return "";
                }
                return "giphy";
            }
            return "video_sticker";
        }
        return "sticker";
    }

    public static final CommentStickerStruct LJIIIZ(C454010HrD c454010HrD) {
        List<String> listLLIIII;
        CommentStickerStruct commentStickerStruct = new CommentStickerStruct();
        InterfaceC449850HkV interfaceC449850HkV = c454010HrD.LIZ;
        if (interfaceC449850HkV instanceof AiMojiStickerSet) {
            AiMojiStickerSet aiMojiStickerSet = (AiMojiStickerSet) interfaceC449850HkV;
            commentStickerStruct.setId(String.valueOf(aiMojiStickerSet.getId()));
            commentStickerStruct.setSetId(aiMojiStickerSet.getSetId());
            commentStickerStruct.setStickerType(aiMojiStickerSet.getStickerType());
            C454000HrC c454000HrC = LIZ;
            com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct stickerUrl = aiMojiStickerSet.getStickerUrl();
            c454000HrC.getClass();
            commentStickerStruct.setStaticUrl(LJFF(stickerUrl));
            commentStickerStruct.setExpressions(aiMojiStickerSet.getExpressions());
        } else if (interfaceC449850HkV instanceof SetSticker) {
            SetSticker setSticker = (SetSticker) interfaceC449850HkV;
            commentStickerStruct.setId(String.valueOf(setSticker.getStickerId()));
            commentStickerStruct.setName(setSticker.getName());
            C454000HrC c454000HrC2 = LIZ;
            com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct staticUrl = setSticker.getStaticUrl();
            c454000HrC2.getClass();
            commentStickerStruct.setStaticUrl(LJFF(staticUrl));
            commentStickerStruct.setAnimatedUrl(LJFF(setSticker.getAnimateUrl()));
            commentStickerStruct.setDisplayOrder(setSticker.getDisplayOrder());
            commentStickerStruct.setSetId(setSticker.getSetId());
            commentStickerStruct.setCreatorUid(setSticker.getAuthorUid());
            commentStickerStruct.setStickerType(setSticker.getStickerType());
            List<String> expressions = setSticker.getExpressions();
            Integer num = null;
            if (expressions != null) {
                listLLIIII = C13LP.LLIIII(expressions);
            } else {
                listLLIIII = null;
            }
            commentStickerStruct.setExpressions(listLLIIII);
            commentStickerStruct.setTierId(setSticker.getTierId());
            StickerSubType stickerSubType = setSticker.getStickerSubType();
            if (stickerSubType != null) {
                int i = C455880HuE.LIZ[stickerSubType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            num = 2;
                        }
                    } else {
                        num = 1;
                    }
                } else {
                    num = 0;
                }
            }
            commentStickerStruct.setStickerSubType(num);
        } else if (interfaceC449850HkV instanceof VideoSticker) {
            VideoSticker videoSticker = (VideoSticker) interfaceC449850HkV;
            commentStickerStruct.setId(String.valueOf(videoSticker.getVideoStickerId()));
            commentStickerStruct.setName(videoSticker.getCreatorNickName());
            commentStickerStruct.setOriginVideoId(videoSticker.getOriginVideoId());
            commentStickerStruct.setOriginVideoAuthorUid(videoSticker.getOriginVideoUserId());
            commentStickerStruct.setCreatorUid(videoSticker.getCreatorUid());
            commentStickerStruct.setV2sStatus(videoSticker.getStatus());
            commentStickerStruct.setStickerType(videoSticker.getStickerType());
            C454000HrC c454000HrC3 = LIZ;
            com.ss.android.ugc.aweme.im.common.model.StickerUrlStruct staticUrl2 = videoSticker.getStaticUrl();
            c454000HrC3.getClass();
            commentStickerStruct.setStaticUrl(LJFF(staticUrl2));
            commentStickerStruct.setAnimatedUrl(LJFF(videoSticker.getAnimateUrl()));
            commentStickerStruct.setUserFavorite(videoSticker.getHaveFavorite());
            commentStickerStruct.setReviewMsg(videoSticker.getReviewMsg());
        }
        commentStickerStruct.setStickerEnterMethod(c454010HrD.LIZIZ.getValue());
        return commentStickerStruct;
    }

    public static final void LJIIJ(C454040HrG c454040HrG) {
        new CommentStickerStruct();
        c454040HrG.getClass();
        new UrlModel();
        new ArrayList();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C454540Hs4 LJIIL(com.ss.android.ugc.aweme.comment.model.CommentStickerStruct r6) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454000HrC.LJIIL(com.ss.android.ugc.aweme.comment.model.CommentStickerStruct):X.0Hs4");
    }

    public static UrlModel LJIIJJI(UrlModel urlModel, UrlModel urlModel2) {
        List<String> urlList;
        List<String> urlList2;
        if (urlModel != null) {
            urlList = urlModel.getUrlList();
        } else {
            urlList = null;
        }
        if (!C866950Xzh.LIZIZ(urlList)) {
            if (urlModel2 != null) {
                urlList2 = urlModel2.getUrlList();
            } else {
                urlList2 = null;
            }
            if (!C866950Xzh.LIZIZ(urlList2)) {
                return null;
            }
            return urlModel2;
        }
        return urlModel;
    }

    public static final Pair<Integer, Integer> LIZ(View view, Integer num, Integer num2) {
        int iLIZIZ;
        float f;
        Context context;
        Resources resources;
        DisplayMetrics displayMetrics;
        C01GW c01gw = CommentWithStickerExp.LIZIZ;
        CommentWithStickerExp.CommentStickerConfig commentStickerConfig = (CommentWithStickerExp.CommentStickerConfig) c01gw.getValue();
        int iLIZIZ2 = 0;
        if (commentStickerConfig != null) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(commentStickerConfig.stickerAdapterMaxSize)));
        } else {
            iLIZIZ = 0;
        }
        CommentWithStickerExp.CommentStickerConfig commentStickerConfig2 = (CommentWithStickerExp.CommentStickerConfig) c01gw.getValue();
        if (commentStickerConfig2 != null) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(commentStickerConfig2.stickerHeight)));
        }
        if (num != null && num2 != null && num.intValue() > 0 && num2.intValue() > 0) {
            if (view != null && (context = view.getContext()) != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                f = displayMetrics.density;
            } else {
                f = Resources.getSystem().getDisplayMetrics().density;
            }
            int i = (int) (48 * f);
            float fIntValue = num.intValue() / num2.intValue();
            if (iLIZIZ > 0) {
                if (num.intValue() > num2.intValue()) {
                    int i2 = (int) (iLIZIZ / fIntValue);
                    if (CommentStickerConsumptionSpecExp.LIZLLL() == 0 && i2 < i) {
                        iLIZIZ = (int) (i * fIntValue);
                    } else if (CommentStickerConsumptionSpecExp.LIZLLL() != 2 || i2 >= i) {
                        i = iLIZIZ;
                        iLIZIZ = i2;
                    }
                    int i3 = iLIZIZ;
                    iLIZIZ = i;
                    i = i3;
                } else {
                    int i4 = (int) (iLIZIZ * fIntValue);
                    if (CommentStickerConsumptionSpecExp.LIZLLL() == 0 && i4 < i) {
                        iLIZIZ = (int) (i / fIntValue);
                    } else if (CommentStickerConsumptionSpecExp.LIZLLL() != 2 || i4 >= i) {
                        i = i4;
                    }
                }
                iLIZIZ2 = iLIZIZ;
            } else {
                if (iLIZIZ2 <= 0) {
                    return null;
                }
                i = (int) (iLIZIZ2 * fIntValue);
            }
            if (i <= 0 || iLIZIZ2 <= 0) {
                return null;
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(iLIZIZ2));
        }
        if (iLIZIZ > 0) {
            return new Pair<>(Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ));
        }
        if (iLIZIZ2 <= 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ2));
    }
}
