package X;

import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectMethodType;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetFrom;
import com.ss.android.ugc.gamora.editor.mixediting.eventtrack.CancelMethodType;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412440mrK {
    public static final C1412440mrK LIZ = new C1412440mrK();
    public static final Set<C1412470mrN> LIZIZ = new LinkedHashSet();

    public static String LIZIZ(Asset asset) {
        boolean z;
        C1412870ms1.LIZ.getClass();
        MixEditingMaterialType mixEditingMaterialTypeLIZJ = C1412870ms1.LIZJ(asset);
        String music_id = asset.getBusiness_extra().getMusic_id();
        if (music_id != null && music_id.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        switch (C1412360mrC.LIZ[mixEditingMaterialTypeLIZJ.ordinal()]) {
            case 1:
                if (z2) {
                    return "effect_music";
                }
                return "effect";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return mixEditingMaterialTypeLIZJ.getDescription();
            default:
                return "";
        }
    }

    public static boolean LJ(C1412800mru c1412800mru) {
        MixEditingMaterialType mixEditingMaterialType = c1412800mru.LIZ;
        if (mixEditingMaterialType != MixEditingMaterialType.UNKNOWN_TYPE && mixEditingMaterialType != MixEditingMaterialType.CANCEL_TYPE) {
            return false;
        }
        return true;
    }

    public static C0LAB LIZJ(VideoPublishEditModel videoPublishEditModel, Function0 function0) {
        Pair<Integer, Integer> pairLJJIIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        if (function0 == null || (pairLJJIIZ = (Pair) function0.invoke()) == null) {
            pairLJJIIZ = C1416310mxZ.LJJIIZ(videoPublishEditModel);
        }
        int iIntValue = pairLJJIIZ.getFirst().intValue();
        int iIntValue2 = pairLJJIIZ.getSecond().intValue();
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(iIntValue2, "photo_cnt");
        return c0lab;
    }

    public static C0LAB LIZLLL(VideoPublishEditModel videoPublishEditModel, Function0 function0) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        Pair<Integer, Integer> pairLJJIIZ = (Pair) function0.invoke();
        if (pairLJJIIZ == null) {
            pairLJJIIZ = C1416310mxZ.LJJIIZ(videoPublishEditModel);
        }
        int iIntValue = pairLJJIIZ.getFirst().intValue();
        int iIntValue2 = pairLJJIIZ.getSecond().intValue();
        c0lab.LIZ(iIntValue, "original_video_cnt");
        c0lab.LIZ(iIntValue2, "original_pic_cnt");
        return c0lab;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, X.C1412800mru r6, kotlin.jvm.functions.Function0 r7) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel r0 = r0.mixEditingModel
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem r4 = r0.selectedMaterialItem
            if (r6 == 0) goto L71
            com.ss.android.ugc.effectmanager.effect.model.Asset r3 = r6.LIZLLL
        La:
            X.0LAB r2 = LIZJ(r5, r7)
            if (r3 == 0) goto L26
            X.0mrK r0 = X.C1412440mrK.LIZ
            r0.getClass()
            boolean r0 = LJ(r6)
            if (r0 != 0) goto L26
            if (r4 == 0) goto L26
            int r1 = r4.materialPosition
            X.0mrM r0 = X.C1412450mrL.LIZ(r6)
            LIZ(r2, r3, r1, r5, r0)
        L26:
            X.0mrK r0 = X.C1412440mrK.LIZ
            r0.getClass()
            if (r6 == 0) goto L6e
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType r1 = r6.LIZ
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType r0 = com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType.UNKNOWN_TYPE
            if (r1 == r0) goto L6e
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType r0 = com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType.CANCEL_TYPE
            if (r1 != r0) goto L62
            java.lang.String r1 = "empty"
        L39:
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = "select_method"
            r2.LJ(r0, r1)
        L44:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.CommonMobParamModel r0 = r0.commonMobModel
            int r1 = r0.originVideoCount
            java.lang.String r0 = "original_video_cnt"
            r2.LIZ(r1, r0)
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.CommonMobParamModel r0 = r0.commonMobModel
            int r1 = r0.originPhotoCount
            java.lang.String r0 = "original_pic_cnt"
            r2.LIZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "exit_auto_edit"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L62:
            if (r4 == 0) goto L6e
            boolean r0 = r4.isAutoApply
            if (r0 == 0) goto L6b
            java.lang.String r1 = "auto"
            goto L39
        L6b:
            java.lang.String r1 = "manual"
            goto L39
        L6e:
            java.lang.String r1 = ""
            goto L39
        L71:
            r3 = 0
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1412440mrK.LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0mru, kotlin.jvm.functions.Function0):void");
    }

    public static void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, C1412800mru c1412800mru, Function0 function0) {
        SelectedMaterialItem selectedMaterialItem;
        Asset asset;
        String str;
        Integer numValueOf;
        if (LJ(c1412800mru) || (selectedMaterialItem = videoPublishEditModel.creativeModel.mixEditingModel.selectedMaterialItem) == null || (asset = c1412800mru.LIZLLL) == null) {
            return;
        }
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, function0);
        LIZ(c0labLIZJ, asset, selectedMaterialItem.materialPosition, videoPublishEditModel, C1412450mrL.LIZ(c1412800mru));
        if (selectedMaterialItem.isAutoApply) {
            str = "auto";
        } else {
            str = "manual";
        }
        c0labLIZJ.LJ("select_method", str);
        if (selectedMaterialItem.applyTimestamp > 0) {
            c0labLIZJ.LIZIZ(System.currentTimeMillis() - selectedMaterialItem.applyTimestamp, "auto_edit_play_duration");
        }
        c0labLIZJ.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0labLIZJ.LJ("mix_request_id", videoPublishEditModel.creativeModel.mixEditingModel.requestId);
        if (c1412800mru.LJFF) {
            numValueOf = asset.getBusiness_extra().getAsset_from();
        } else {
            numValueOf = Integer.valueOf(AssetFrom.CLIENT_INSERT.getValue());
        }
        c0labLIZJ.LIZLLL(numValueOf, "asset_from");
        C20684815ws.LJIILLIIL("auto_edit_mix_material_play_end", c0labLIZJ.LIZ);
    }

    public static void LIZ(C0LAB c0lab, Asset asset, int i, VideoPublishEditModel videoPublishEditModel, C1412460mrM c1412460mrM) {
        C1412870ms1.LIZ.getClass();
        switch (C1412360mrC.LIZ[C1412870ms1.LIZJ(asset).ordinal()]) {
            case 1:
                c0lab.LJ("effect_resource_id", asset.getResource_id());
                String music_id = asset.getBusiness_extra().getMusic_id();
                if (music_id != null) {
                    c0lab.LJ("music_id", music_id);
                }
                c0lab.LIZ(c1412460mrM.LIZ ? 1 : 0, "is_edit_prop");
                if (c1412460mrM.LIZ) {
                    c0lab.LJ("prop_id", c1412460mrM.LIZIZ);
                    c0lab.LJ("effect_id", "");
                } else {
                    c0lab.LJ("prop_id", "");
                    c0lab.LJ("effect_id", asset.getAsset_id());
                }
                break;
            case 2:
                c0lab.LJ("music_id", asset.getAsset_id());
                break;
            case 3:
                c0lab.LJ("template_resource_id", asset.getResource_id());
                String music_id2 = asset.getBusiness_extra().getMusic_id();
                if (music_id2 != null) {
                    c0lab.LJ("music_id", music_id2);
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                c0lab.LJ("template_resource_id", asset.getResource_id());
                c0lab.LJ("autocut_template_id", asset.getAsset_id());
                String music_id3 = asset.getBusiness_extra().getMusic_id();
                if (music_id3 != null) {
                    c0lab.LJ("music_id", music_id3);
                }
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                c0lab.LJ("template_resource_id", asset.getResource_id());
                c0lab.LJ("autocut_template_group_id", asset.getAsset_id());
                c0lab.LJ("music_id", asset.getAsset_id());
                break;
        }
        c0lab.LJ("auto_edit_id", asset.getAsset_id());
        c0lab.LIZ(i, "auto_edit_rank");
        c0lab.LJ("auto_edit_type", LIZIZ(asset));
        c0lab.LIZ(videoPublishEditModel.creativeModel.commonMobModel.originVideoCount, "original_video_cnt");
        c0lab.LIZ(videoPublishEditModel.creativeModel.commonMobModel.originPhotoCount, "original_pic_cnt");
        c0lab.LIZ(c1412460mrM.LIZLLL ? 1 : 0, "is_auto_edit_recommend");
    }

    public static void LJIIIZ(VideoPublishEditModel videoPublishEditModel, C1412800mru c1412800mru, int i, boolean z, Function0 function0) {
        Asset asset;
        String description;
        Integer numValueOf;
        if (LJ(c1412800mru) || (asset = c1412800mru.LIZLLL) == null) {
            return;
        }
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, function0);
        LIZ(c0labLIZJ, asset, i, videoPublishEditModel, C1412450mrL.LIZ(c1412800mru));
        if (z) {
            description = "auto";
        } else {
            SelectMethodType selectMethodType = c1412800mru.LJIIIIZZ;
            if (selectMethodType == null || (description = selectMethodType.getDescription()) == null) {
                description = "manual";
            }
        }
        c0labLIZJ.LJ("select_method", description);
        c0labLIZJ.LJ("mix_request_id", videoPublishEditModel.creativeModel.mixEditingModel.requestId);
        c0labLIZJ.LJ("enter_method", videoPublishEditModel.creativeModel.mixEditingModel.enterMixEditingMethod);
        c0labLIZJ.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        if (c1412800mru.LJFF) {
            numValueOf = asset.getBusiness_extra().getAsset_from();
        } else {
            numValueOf = Integer.valueOf(AssetFrom.CLIENT_INSERT.getValue());
        }
        c0labLIZJ.LIZLLL(numValueOf, "asset_from");
        C20684815ws.LJIILLIIL("select_auto_edit_mix_material", c0labLIZJ.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02db A[PHI: r23
      0x02db: PHI (r23v2 java.lang.String) = (r23v1 java.lang.String), (r23v4 java.lang.String) binds: [B:129:0x02d7, B:67:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r43, X.C1412800mru r44, int r45, boolean r46, kotlin.jvm.functions.Function0 r47) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1412440mrK.LJIIJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0mru, int, boolean, kotlin.jvm.functions.Function0):void");
    }

    public static void LJII(VideoPublishEditModel videoPublishEditModel, C1412800mru c1412800mru, int i, CancelMethodType cancelMethodType, String str, Function0 function0) {
        if (c1412800mru.LIZ == MixEditingMaterialType.UNKNOWN_TYPE) {
            return;
        }
        Asset asset = c1412800mru.LIZLLL;
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, function0);
        if (asset != null) {
            C1412440mrK c1412440mrK = LIZ;
            C1412460mrM c1412460mrMLIZ = C1412450mrL.LIZ(c1412800mru);
            c1412440mrK.getClass();
            LIZ(c0labLIZJ, asset, i, videoPublishEditModel, c1412460mrMLIZ);
        }
        c0labLIZJ.LJ("mix_request_id", videoPublishEditModel.creativeModel.mixEditingModel.requestId);
        c0labLIZJ.LJ("cancel_method", cancelMethodType.getDescription());
        c0labLIZJ.LJ("enter_method", videoPublishEditModel.creativeModel.mixEditingModel.enterMixEditingMethod);
        c0labLIZJ.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        if (c1412800mru.LJII == SelectMethodType.AUTO) {
            str = "auto";
        } else if (str == null) {
            str = "manual";
        }
        c0labLIZJ.LJ("select_method", str);
        C20684815ws.LJIILLIIL("cancel_auto_edit_mix_material", c0labLIZJ.LIZ);
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, C1412860ms0 c1412860ms0, int i, boolean z, C1412460mrM c1412460mrM, String str, Function0 function0) {
        Integer numValueOf;
        if (c1412860ms0 == null) {
            return;
        }
        Asset asset = c1412860ms0.LIZ;
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, function0);
        LIZ(c0labLIZJ, asset, i, videoPublishEditModel, c1412460mrM);
        if (z) {
            str = "auto";
        } else if (str == null) {
            str = "manual";
        }
        c0labLIZJ.LJ("select_method", str);
        c0labLIZJ.LJ("mix_request_id", videoPublishEditModel.creativeModel.mixEditingModel.requestId);
        c0labLIZJ.LJ("enter_method", videoPublishEditModel.creativeModel.mixEditingModel.enterMixEditingMethod);
        c0labLIZJ.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        if (c1412460mrM.LIZLLL) {
            numValueOf = asset.getBusiness_extra().getAsset_from();
        } else {
            numValueOf = Integer.valueOf(AssetFrom.CLIENT_INSERT.getValue());
        }
        c0labLIZJ.LIZLLL(numValueOf, "asset_from");
        C20684815ws.LJIILLIIL("apply_auto_edit_mix_material", c0labLIZJ.LIZ);
    }
}
