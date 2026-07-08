package X;

import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0mvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414930mvL {
    public static final C1414930mvL LIZ = new C1414930mvL();
    public static MixEditingPathKeys LIZIZ;

    public static boolean LJIILIIL() {
        return !((Boolean) C273080An4.LIZ.getValue()).booleanValue();
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if ((!videoPublishEditModel.mIsFromDraft || C1414940mvM.LIZLLL(videoPublishEditModel)) && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "mv_page") && !C1416310mxZ.LJJJLIIL(videoPublishEditModel) && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor")) {
            int i = LJIIJJI(videoPublishEditModel).delayShowContainer;
            if (i != -1) {
                if (i != 0) {
                    return true;
                }
                return false;
            }
            if (((Number) C288120BRa.LIZ.getValue()).intValue() != 0) {
                return true;
            }
            return false;
        }
        if (((Number) C288120BRa.LIZ.getValue()).intValue() != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5) {
        /*
            com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys r0 = LJIIJJI(r5)
            boolean r0 = r0.enableAutoShowEntrance
            r2 = 1
            if (r0 == 0) goto L44
            com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys r0 = LJIIL(r5)
            java.lang.String r4 = "; autoOpenAutoCut = "
            if (r0 == 0) goto L4c
            X.0MJ8 r3 = X.C0MJ8.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fromSdk = "
            r1.append(r0)
            java.lang.String r0 = r5.mShootWay
            boolean r0 = X.C1B46.LJIIJ(r0)
            r1.append(r0)
            r1.append(r4)
            boolean r0 = X.C1414940mvM.LIZ(r5)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZJ(r3, r0)
            java.lang.String r0 = r5.mShootWay
            boolean r0 = X.C1B46.LJIIJ(r0)
            if (r0 != 0) goto L44
            boolean r0 = X.C1414940mvM.LIZ(r5)
            if (r0 == 0) goto L93
        L44:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.VideoImageSeparateSwitchModel r0 = r0.videoImageSeparateSwitchModel
            if (r0 != 0) goto L4b
            r2 = 0
        L4b:
            return r2
        L4c:
            X.0MJ8 r3 = X.C0MJ8.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isRecord = "
            r1.append(r0)
            int r0 = r5.getOriginal()
            if (r0 != r2) goto L91
            r0 = 1
        L5e:
            r1.append(r0)
            java.lang.String r0 = "; isFromSDKOrSystemShare = "
            r1.append(r0)
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.edit.u4.LJJJI(r5)
            r1.append(r0)
            r1.append(r4)
            boolean r0 = X.C1414940mvM.LIZ(r5)
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZJ(r3, r0)
            int r0 = r5.getOriginal()
            if (r0 == r2) goto L44
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.edit.u4.LJJJI(r5)
            if (r0 != 0) goto L44
            boolean r0 = X.C1414940mvM.LIZ(r5)
            if (r0 == 0) goto L93
            goto L44
        L91:
            r0 = 0
            goto L5e
        L93:
            boolean r0 = X.C573570MeZ.LIZJ(r5)
            if (r0 == 0) goto La8
            X.01GW r0 = X.C280010AyF.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L44
        La8:
            boolean r0 = X.C1417210mz1.LIZJ(r5)
            if (r0 == 0) goto L4b
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414930mvL.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static int LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (!LIZIZ(videoPublishEditModel)) {
            return 0;
        }
        if (LIZ(videoPublishEditModel)) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if ((creativeModel.videoImageSeparateSwitchModel == null || creativeModel.draftInfoModel.isDraft) && !C1414940mvM.LIZJ(videoPublishEditModel)) {
                return 0;
            }
        }
        return 1;
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableEditSoundSyncMixEditingLoadingStyle: enableMixEditingMaterial = ");
        LIZ.getClass();
        sbLIZ.append(LJII(videoPublishEditModel, false));
        sbLIZ.append("; enableAutoShowEntrance = ");
        sbLIZ.append(LIZIZ(videoPublishEditModel));
        sbLIZ.append("; enableSoundSyncRecommend = ");
        sbLIZ.append(LJIIIZ(videoPublishEditModel));
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_sound_sync_edit_loading_style", true);
        if ((iLJIJ != 1 && iLJIJ != 2) || !LJII(videoPublishEditModel, false) || !LIZIZ(videoPublishEditModel) || !LJIIIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_sound_sync_edit_loading_style", true) != 2) {
            return false;
        }
        LIZ.getClass();
        if (!LJII(videoPublishEditModel, false) || !LIZIZ(videoPublishEditModel) || !LJIIIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(VideoPublishEditModel videoPublishEditModel) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_sound_sync_edit_loading_style", true) != 3) {
            return false;
        }
        LIZ.getClass();
        if (!LJII(videoPublishEditModel, false) || !LIZIZ(videoPublishEditModel) || !LJIIIZ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        if (!LJIIJJI(videoPublishEditModel).enableEffectRecommend && !C1414940mvM.LIZJ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (LJIIJJI(videoPublishEditModel).enableSoundSyncRecommend || C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_editing_force_insert_sound_sync", true, true) || C1414940mvM.LIZJ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        if ((!LJII(videoPublishEditModel, false) || (!LJIIJJI(videoPublishEditModel).enableTemplateRecommend && !LJIIJJI(videoPublishEditModel).enableAITemplateRecommend)) && !C1414940mvM.LIZJ(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static MixEditingPathKeys LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<ImportVideoInfo> importInfoList;
        ArrayList<ImportVideoInfo> importInfoList2;
        MixEditingPathKeys mixEditingPathKeysLJIIL;
        if (C1414940mvM.LJ(videoPublishEditModel)) {
            return new MixEditingPathKeys(true, true, true, true, true, true, false, false, false, 0, 2, 0, null, 4992, null);
        }
        int i = 0;
        if (C1414940mvM.LIZLLL(videoPublishEditModel) && ((mixEditingPathKeysLJIIL = LJIIL(videoPublishEditModel)) == null || mixEditingPathKeysLJIIL.enableMixMaterial)) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 1, "mae_completion_default_panel", true) != 1) {
                i = -1;
            }
            return new MixEditingPathKeys(true, true, true, true, true, true, false, false, false, 0, 0, i, null, 4992, null);
        }
        MixEditingPathKeys mixEditingPathKeysLJIIL2 = LJIIL(videoPublishEditModel);
        if (mixEditingPathKeysLJIIL2 != null) {
            return mixEditingPathKeysLJIIL2;
        }
        if (videoPublishEditModel.getOriginal() != 1 && !videoPublishEditModel.isLivePhotoEdit() && !C1428470nHB.LJLIIL(videoPublishEditModel) && (importInfoList = videoPublishEditModel.getImportInfoList()) != null && !importInfoList.isEmpty() && (importInfoList2 = videoPublishEditModel.getImportInfoList()) != null && importInfoList2.size() > 1) {
            return C0L7Z.LIZ();
        }
        return C1414950mvN.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys LJIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1414930mvL.LJIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):com.ss.android.ugc.gamora.editor.mixediting.experiments.MixEditingPathKeys");
    }

    public static boolean LJII(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        if (C537970L7z.LIZLLL(videoPublishEditModel.creativeModel.editorProSchemeModel)) {
            return true;
        }
        if (C1414940mvM.LIZJ(videoPublishEditModel)) {
            if (!z) {
                return true;
            }
            if (C0C0E.LIZ() && videoPublishEditModel.getAILivePhotoModel().LJII()) {
                return true;
            }
        }
        if (C1414940mvM.LJ(videoPublishEditModel)) {
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingFeatureSwitch -> enableMixEditingMaterial: not ugcAnchor = ");
        C1412390mrF c1412390mrFLIZ = C1412380mrE.LIZ(videoPublishEditModel);
        C1412390mrF c1412390mrF = C1412390mrF.LIZLLL;
        sbLIZ.append(!Intrinsics.LJFF(c1412390mrFLIZ, c1412390mrF));
        sbLIZ.append("; not PUGC Anchor = ");
        C1412390mrF c1412390mrFLIZ2 = C1412380mrE.LIZ(videoPublishEditModel);
        C1412390mrF c1412390mrF2 = C1412390mrF.LJ;
        sbLIZ.append(!Intrinsics.LJFF(c1412390mrFLIZ2, c1412390mrF2));
        sbLIZ.append("; not template tab = ");
        sbLIZ.append(!Intrinsics.LJFF(C1412380mrE.LIZ(videoPublishEditModel), C1412390mrF.LJI));
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (LJIIJJI(videoPublishEditModel).enableMixMaterial && C0CHQ.LIZ().getAccountService().isLogin() && !C0CHQ.LIZ().getAccountService().LIZ() && C1601110rld.LIZ() && C364100EPg.LIZ() && !C1428470nHB.LLIIIJ(videoPublishEditModel) && videoPublishEditModel.creativeModel.editPostModel == null && !Intrinsics.LJFF(videoPublishEditModel.mShootWay, "share_to_story") && !videoPublishEditModel.isDuet() && videoPublishEditModel.getStitchParams() == null && !videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay()) {
            String collectionId = videoPublishEditModel.creativeModel.paidContentModel.getCollectionId();
            if ((collectionId == null || collectionId.length() == 0) && !C1428470nHB.LJJJJJL(videoPublishEditModel.creativeModel)) {
                String str2 = videoPublishEditModel.creativeModel.initialModel.highLightVideoParametersModel.fragmentId;
                if ((str2 == null || str2.length() == 0) && !C1416310mxZ.LJJJJZI(videoPublishEditModel) && !videoPublishEditModel.isEnterFromDM() && !Intrinsics.LJFF(C1412380mrE.LIZ(videoPublishEditModel), c1412390mrF) && !Intrinsics.LJFF(C1412380mrE.LIZ(videoPublishEditModel), c1412390mrF2)) {
                    C1412390mrF c1412390mrFLIZ3 = C1412380mrE.LIZ(videoPublishEditModel);
                    if ((c1412390mrFLIZ3 != null && c1412390mrFLIZ3.LIZJ()) || Intrinsics.LJFF(C1412380mrE.LIZ(videoPublishEditModel), C1412390mrF.LJIILLIIL) || C1428470nHB.LLIIIZ(videoPublishEditModel) || Intrinsics.LJFF(C1412380mrE.LIZ(videoPublishEditModel), C1412390mrF.LIZIZ) || Intrinsics.LJFF(C1412380mrE.LIZ(videoPublishEditModel), C1412390mrF.LJIILL) || Intrinsics.LJFF(C1412380mrE.LIZ(videoPublishEditModel), C1412390mrF.LJFF) || !C298890Bnb.LIZ()) {
                        return false;
                    }
                    if (C1412380mrE.LIZIZ(videoPublishEditModel.creativeModel)) {
                        C1412390mrF c1412390mrFLIZ4 = C1412380mrE.LIZ(videoPublishEditModel);
                        if (c1412390mrFLIZ4 == null || !c1412390mrFLIZ4.LIZ()) {
                            return false;
                        }
                        String strLJJIJIIJI = C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, true);
                        C1412390mrF c1412390mrFLIZ5 = C1412380mrE.LIZ(videoPublishEditModel);
                        if (c1412390mrFLIZ5 == null || (str = c1412390mrFLIZ5.LIZ) == null) {
                            str = "";
                        }
                        if (!Intrinsics.LJFF(strLJJIJIIJI, C1412630mrd.LIZLLL(EnumC1412640mre.CUT_SAME)) && ((!Intrinsics.LJFF(strLJJIJIIJI, C1412630mrd.LIZLLL(EnumC1412640mre.AIGT)) || u.LJIIZILJ(str, "_anchor", false)) && !Intrinsics.LJFF(strLJJIJIIJI, C1412630mrd.LIZLLL(EnumC1412640mre.SGT)))) {
                            return false;
                        }
                    }
                    if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate || Intrinsics.LJFF(videoPublishEditModel.mShootWay, "story") || u4.LJLL(videoPublishEditModel) || videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar || C1428470nHB.LJLJJLL(videoPublishEditModel)) {
                        return false;
                    }
                    if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "sdk") && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_enable_sdk_path", true, false)) {
                        return false;
                    }
                    if (C1414940mvM.LJFF(videoPublishEditModel)) {
                        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                        if (creativeModel.videoImageSeparateSwitchModel == null && !creativeModel.draftInfoModel.isDraft && creativeModel.autoCutModel.clickFrom == null && !creativeModel.photoModeEnterEditingStage.photoModeEnterAutoCut && !(!C1414940mvM.LJFF(videoPublishEditModel))) {
                            return false;
                        }
                    }
                    if (videoPublishEditModel.isLivePhotoEdit()) {
                        return false;
                    }
                    if (videoPublishEditModel.isUploadVideo()) {
                        CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
                        if (commonMobParamModel.originVideoCount == 0 && commonMobParamModel.originPhotoCount == 1) {
                            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
                            if (creativeModel2.videoImageSeparateSwitchModel == null && !creativeModel2.photoModeEnterEditingStage.photoModeEnterAutoCut) {
                                if (!C573570MeZ.LIZ()) {
                                    CreativeModel creativeModel3 = videoPublishEditModel.creativeModel;
                                    if (creativeModel3.draftInfoModel.isDraft) {
                                        if (!(!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()))) {
                                            return false;
                                        }
                                    } else if (creativeModel3.autoCutModel.clickFrom == null) {
                                        return false;
                                    }
                                } else if (C573570MeZ.LIZJ(videoPublishEditModel) || videoPublishEditModel.creativeModel.imageEditModel.enterFromImageMode) {
                                    return false;
                                }
                            }
                        }
                    }
                    if (!C565160MEo.LIZIZ(videoPublishEditModel)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
