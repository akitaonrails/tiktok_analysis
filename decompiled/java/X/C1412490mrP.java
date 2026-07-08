package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ReusedMusicInfo;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.creative.model.music.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.DefaultMusicLogIdInput;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412490mrP {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        String str = null;
        if (C1428470nHB.LJLI(videoPublishEditModel)) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel.mixEditingModel.reusedMusicInfo != null) {
                String strLIZJ = C1429680nJ8.LIZJ(creativeModel.musicBuzModel);
                ReusedMusicInfo reusedMusicInfo = videoPublishEditModel.creativeModel.mixEditingModel.reusedMusicInfo;
                if (reusedMusicInfo != null) {
                    str = reusedMusicInfo.reusedMusicId;
                }
                if (LIZLLL(strLIZJ, str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
            if (creativeModel2.autoCutModel.reusedMusicInfo != null) {
                String strLIZJ2 = C1429680nJ8.LIZJ(creativeModel2.musicBuzModel);
                ReusedMusicInfo reusedMusicInfo2 = videoPublishEditModel.creativeModel.autoCutModel.reusedMusicInfo;
                if (reusedMusicInfo2 != null) {
                    str = reusedMusicInfo2.reusedMusicId;
                }
                if (LIZLLL(strLIZJ2, str)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isLinkShareWithPresetMusic()) {
            return "dsp2tt_sharing";
        }
        if (C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData())) {
            return "others_share";
        }
        if (C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData())) {
            return "music_share";
        }
        if (videoPublishEditModel.creativeModel.reuseSoundAndEffectModel.isMusicFromDiscoveryPage()) {
            return "prop_panel_discovery";
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        MusicBuzModel musicBuzModel = creativeModel.musicBuzModel;
        MusicObject musicObject = musicBuzModel.music;
        if (musicObject != null && musicObject.isUnlimitedMusic) {
            String str = musicBuzModel.musicSelectedFrom;
            if (str != null) {
                return str;
            }
            return videoPublishEditModel.getMusicOriginWithCheck();
        }
        if (creativeModel.onThisDayData.isInOnThisDayPreviewPage() && ((Boolean) C0BNI.LIZ.getValue()).booleanValue() && videoPublishEditModel.creativeModel.onThisDayData.getMusicSelectedFromV2().length() > 0) {
            return videoPublishEditModel.creativeModel.onThisDayData.getMusicSelectedFromV2();
        }
        CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
        if (creativeModel2.musicBuzModel.music != null && creativeModel2.onThisDayData.isFromOnThisDay() && videoPublishEditModel.creativeModel.onThisDayData.getMusicSelectedFromV2().length() > 0) {
            return videoPublishEditModel.creativeModel.onThisDayData.getMusicSelectedFromV2();
        }
        FlowDataMusicInfo flowDataMusicInfo = videoPublishEditModel.getCreativeFlowData().getFlowDataMusicInfo();
        if (flowDataMusicInfo != null && flowDataMusicInfo.isSelectedByAuto() && (C1428470nHB.LLIIIL(videoPublishEditModel) || C1428470nHB.LLIIIJ(videoPublishEditModel))) {
            return "slideshow_rec";
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_modified_method_get_music_selected_from", true, false) && (C1428470nHB.LJLI(videoPublishEditModel) || videoPublishEditModel.isCurrentAutoCutMode())) {
            String str2 = null;
            String str3 = null;
            Integer numValueOf = null;
            if (C1428470nHB.LJLI(videoPublishEditModel)) {
                if (LIZ(videoPublishEditModel)) {
                    ReusedMusicInfo reusedMusicInfo = videoPublishEditModel.creativeModel.mixEditingModel.reusedMusicInfo;
                    if (reusedMusicInfo != null) {
                        str3 = reusedMusicInfo.reusedMusicOrigin;
                    }
                    return String.valueOf(str3);
                }
                if (LIZJ(videoPublishEditModel)) {
                    TemplateMobParams templateMobParams = videoPublishEditModel.creativeModel.mixEditingModel.templateMobParams;
                    if (templateMobParams != null) {
                        numValueOf = Integer.valueOf(templateMobParams.autocutTemplateType);
                    }
                    int value = EnumC1412640mre.CUT_SAME.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value) {
                        AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
                        if (autoCutThemeDataLIZJ != null && Intrinsics.LJFF(autoCutThemeDataLIZJ.musicPostUnavailable, Boolean.TRUE)) {
                            return "original";
                        }
                        return "lv_sync";
                    }
                    int value2 = EnumC1412640mre.ALGORITHM_TEMPLATE.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value2) {
                        return "mix_template_music_recommend";
                    }
                    int value3 = EnumC1412600mra.EFFECT_MUSIC_TEMPLATE.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value3) {
                        return "effect_music_recommend";
                    }
                    return videoPublishEditModel.getMusicOriginWithCheck();
                }
                return videoPublishEditModel.getMusicOriginWithCheck();
            }
            if (LIZ(videoPublishEditModel)) {
                ReusedMusicInfo reusedMusicInfo2 = videoPublishEditModel.creativeModel.autoCutModel.reusedMusicInfo;
                if (reusedMusicInfo2 != null) {
                    str2 = reusedMusicInfo2.reusedMusicOrigin;
                }
                return String.valueOf(str2);
            }
            if (LIZJ(videoPublishEditModel)) {
                if (videoPublishEditModel.creativeModel.autoCutModel.curTemplateType == EnumC1412640mre.CUT_SAME.getValue()) {
                    AutoCutThemeData autoCutThemeDataLIZJ2 = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
                    if (autoCutThemeDataLIZJ2 != null && Intrinsics.LJFF(autoCutThemeDataLIZJ2.musicPostUnavailable, Boolean.TRUE)) {
                        return "original";
                    }
                    return "lv_sync";
                }
                return "auto_cut_music_recommend";
            }
            return videoPublishEditModel.getMusicOriginWithCheck();
        }
        return videoPublishEditModel.getMusicOriginWithCheck();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r2.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel r0 = r0.mixEditingModel
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams r0 = r0.templateMobParams
            if (r0 == 0) goto L27
            int r1 = r0.autocutTemplateType
            X.0mre r0 = X.EnumC1412640mre.CUT_SAME
            int r0 = r0.getValue()
            if (r1 != r0) goto L27
        L12:
            java.lang.String r1 = X.C1418530n19.LIZ(r2)
        L16:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r2.creativeModel
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
            java.lang.String r0 = X.C1429680nJ8.LIZJ(r0)
            if (r1 != 0) goto L22
            java.lang.String r1 = ""
        L22:
            boolean r0 = LIZLLL(r0, r1)
            return r0
        L27:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r2.creativeModel
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r0 = r0.autoCutModel
            int r1 = r0.curTemplateType
            X.0mre r0 = X.EnumC1412640mre.CUT_SAME
            int r0 = r0.getValue()
            if (r1 == r0) goto L12
            boolean r0 = X.C1428470nHB.LJLI(r2)
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r2.creativeModel
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingModel r0 = r0.mixEditingModel
            com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams r0 = r0.templateMobParams
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.musicId
            goto L16
        L46:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r2.creativeModel
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r0 = r0.autoCutModel
            com.ss.android.ugc.aweme.creative.model.AutoCutThemeData r0 = X.C1416110mxF.LIZJ(r0)
            if (r0 == 0) goto L53
            java.lang.String r1 = r0.musicId
            goto L16
        L53:
            r1 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1412490mrP.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static String LJFF(VideoPublishEditModel videoPublishEditModel) {
        DefaultMusicLogIdInput defaultMusicLogIdInput = new DefaultMusicLogIdInput(LIZIZ(videoPublishEditModel));
        ConcurrentHashMap<String, InterfaceC1412480mrO> concurrentHashMap = C1412510mrR.LIZ;
        return C1412510mrR.LIZ(defaultMusicLogIdInput.musicSelectedFrom()).LIZIZ(videoPublishEditModel, null);
    }

    public static final boolean LIZLLL(String str, String str2) {
        if (!Intrinsics.LJFF(str, str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('-');
            sbLIZ.append(str);
            if (!Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), str2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('-');
                sbLIZ2.append(str2);
                if (!Intrinsics.LJFF(str, C2188811AlT.LIZIZ(sbLIZ2))) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static String LJ(ShortVideoContext shortVideoContext, String str) {
        if (str == null) {
            str = shortVideoContext.LJIIJJI();
        }
        DefaultMusicLogIdInput defaultMusicLogIdInput = new DefaultMusicLogIdInput(str);
        ConcurrentHashMap<String, InterfaceC1412480mrO> concurrentHashMap = C1412510mrR.LIZ;
        return C1412510mrR.LIZ(defaultMusicLogIdInput.musicSelectedFrom()).LIZ(shortVideoContext);
    }
}
