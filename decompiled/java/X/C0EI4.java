package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;

/* JADX INFO: renamed from: X.0EI4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EI4 {
    public static final C0EI4 LIZ = new C0EI4();

    public static void LJI(VideoPublishEditModel videoPublishEditModel) {
        C201955140j.LIZLLL(C563650M8t.LIZIZ, "CutoutMobEvent", "mobClickChroma");
        C20684815ws.LJIILLIIL("click_chroma", LIZ(videoPublishEditModel, true).LIZ);
    }

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        String str2;
        String openEditToolType;
        EditorProModel editorProModel;
        if (C0CHQ.LIZ().getAccountService().isLogin()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (z) {
            str2 = "main";
        } else {
            str2 = "pip";
        }
        boolean zLJJIL = u4.LJJIL(videoPublishEditModel);
        if (videoPublishEditModel == null || (editorProModel = videoPublishEditModel.getEditorProModel()) == null || (openEditToolType = editorProModel.getOpenEditToolType()) == null) {
            openEditToolType = "unknown";
        }
        String strLIZJ = C1403540mcy.LIZJ(videoPublishEditModel);
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createCutoutCommonParams isMainTrack = ");
        sbLIZ.append(z);
        sbLIZ.append(" isFromEditorTab = ");
        sbLIZ.append(zLJJIL ? 1 : 0);
        sbLIZ.append(", editorTabEntrance = ");
        sbLIZ.append(openEditToolType);
        sbLIZ.append(", enterFrom = ");
        sbLIZ.append(str2);
        sbLIZ.append(", isLogin = ");
        sbLIZ.append(str);
        sbLIZ.append(", isEditorPro = ");
        sbLIZ.append(1);
        sbLIZ.append(", creationId = ");
        sbLIZ.append(strLIZJ);
        C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(zLJJIL ? 1 : 0, "is_from_edit_tab");
        c0lab.LJ("edit_tab_entrance", openEditToolType);
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("is_login", str);
        c0lab.LIZ(1, "is_editor_pro");
        c0lab.LJ("creation_id", strLIZJ);
        return c0lab;
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, boolean z) {
        if (videoPublishEditModel != null) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobClickAutoCutout isMainTrack = ");
            sbLIZ.append(z);
            C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
            C20684815ws.LJIILLIIL("click_auto_cutout", LIZ(videoPublishEditModel, z).LIZ);
        }
    }

    public static void LJII(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        String str2;
        boolean z2 = true;
        if (videoPublishEditModel != null) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobClickCutOut isMainTrack = ");
            sbLIZ.append(z);
            C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
            C0E0S.LIZ.getClass();
            String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
            Keva keva = C0E0S.LJI;
            long j = 0;
            if (keva != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ep_video_cutout_guide_start_");
                sbLIZ2.append(currentUserID);
                j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L);
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (1 > jCurrentTimeMillis || jCurrentTimeMillis >= 3000) {
                z2 = false;
            }
            if (u4.LJJIL(videoPublishEditModel)) {
                str = "shoot_page_edit_tab";
            } else {
                str = "click_button";
            }
            C363500EMy.LIZ.getClass();
            boolean zLJIIL = C363500EMy.LJIIL(videoPublishEditModel);
            C0LAB c0labLIZ = LIZ(videoPublishEditModel, z);
            c0labLIZ.LJ("enter_method", str);
            if (z2) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0labLIZ.LJ("is_after_star_animation_hint", str2);
            c0labLIZ.LIZ(zLJIIL ? 1 : 0, "is_from_edit_tab_cutout");
            C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0labLIZ);
            C20684815ws.LJIILLIIL("click_cutout", c0labLIZ.LIZ);
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, boolean z) {
        if (videoPublishEditModel != null) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobAdjustBrushSize isMainTrack = ");
            sbLIZ.append(z);
            sbLIZ.append(" brushSize:");
            sbLIZ.append(str);
            C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
            C0LAB c0labLIZ = LIZ(videoPublishEditModel, z);
            c0labLIZ.LJ("adjust_brush_value", str);
            C20684815ws.LJIILLIIL("adjust_brush_size", c0labLIZ.LIZ);
        }
    }

    public static void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, C0EI5 c0ei5, boolean z) {
        if (videoPublishEditModel != null) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobClickManualCutout isMainTrack = ");
            sbLIZ.append(z);
            sbLIZ.append(" cutoutType:");
            sbLIZ.append(c0ei5);
            C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
            C0LAB c0labLIZ = LIZ(videoPublishEditModel, z);
            c0labLIZ.LJ("cutout_type", c0ei5.getValue());
            C20684815ws.LJIILLIIL("click_manual_cutout", c0labLIZ.LIZ);
        }
    }

    public static void LJIIJ(VideoPublishEditModel videoPublishEditModel, boolean z, EnumC373110Ek1 enumC373110Ek1) {
        if (videoPublishEditModel != null) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobCutoutPanelClick isMainTrack = ");
            sbLIZ.append(z);
            sbLIZ.append(" clickButtonName:");
            sbLIZ.append(enumC373110Ek1.getValue());
            C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
            C0LAB c0labLIZ = LIZ(videoPublishEditModel, z);
            c0labLIZ.LJ("click_button_name", enumC373110Ek1.getValue());
            C20684815ws.LJIILLIIL("cutout_panel_click", c0labLIZ.LIZ);
        }
    }

    public static void LJIIL(VideoPublishEditModel videoPublishEditModel, C0EI5 c0ei5, boolean z) {
        if (videoPublishEditModel != null) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobCutoutStart isMainTrack = ");
            sbLIZ.append(z);
            sbLIZ.append(" cutoutType:");
            sbLIZ.append(c0ei5);
            C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
            C0LAB c0labLIZ = LIZ(videoPublishEditModel, z);
            c0labLIZ.LJ("cutout_type", c0ei5.getValue());
            C20684815ws.LJIILLIIL("cutout_start", c0labLIZ.LIZ);
        }
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, C0EI5 c0ei5, EnumC373350EkP enumC373350EkP) {
        String str;
        if (videoPublishEditModel != null) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobCancelCutOut isMainTrack = ");
            sbLIZ.append(z2);
            sbLIZ.append(" cancelReason:");
            sbLIZ.append(enumC373350EkP.getValue());
            C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                str = "long_press";
            } else {
                str = "click_button";
            }
            if (u4.LJJIL(videoPublishEditModel)) {
                str = "shoot_page_edit_tab";
            }
            if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && !C301700Bs8.LIZ()) {
                enumC373350EkP = EnumC373350EkP.AFTER_DRAFT_RECOVER;
            }
            C363500EMy.LIZ.getClass();
            boolean zLJIIL = C363500EMy.LJIIL(videoPublishEditModel);
            C0LAB c0labLIZ = LIZ(videoPublishEditModel, z2);
            c0labLIZ.LJ("reason", enumC373350EkP.getValue());
            c0labLIZ.LJ("enter_method", str);
            c0labLIZ.LIZ(zLJIIL ? 1 : 0, "is_from_edit_tab_cutout");
            c0labLIZ.LJ("cutout_type", c0ei5.getValue());
            C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0labLIZ);
            C20684815ws.LJIILLIIL("cancel_cutout", c0labLIZ.LIZ);
        }
    }

    public static void LJIILIIL(long j, Integer num, String str, boolean z, boolean z2) {
        int i;
        String str2;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        c0lab.LJ("duration", String.valueOf(j));
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("use_cache", str2);
        if (!z && num != null) {
            c0lab.LJ("error_code", num.toString());
            c0lab.LJ("error_domain", str);
        }
        C20684815ws.LJIILLIIL("load_custom_cutout_effect_list", c0lab.LIZ);
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, long j, C0EI5 c0ei5, String str) {
        String str2;
        if (videoPublishEditModel != null && j != 0) {
            if (z) {
                str2 = "long_press";
            } else {
                str2 = "click_button";
            }
            if (u4.LJJIL(videoPublishEditModel)) {
                str2 = "shoot_page_edit_tab";
            }
            C363500EMy.LIZ.getClass();
            boolean zLJIIL = C363500EMy.LJIIL(videoPublishEditModel);
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobApplyCutOut costMs:");
            sbLIZ.append(j);
            sbLIZ.append(" cutoutType:");
            sbLIZ.append(c0ei5);
            sbLIZ.append(" brushSize:");
            sbLIZ.append(str);
            sbLIZ.append(" isMainTrack:");
            sbLIZ.append(z2);
            sbLIZ.append(" isFromEditorTabCutout:");
            sbLIZ.append(zLJIIL ? 1 : 0);
            C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
            C0LAB c0labLIZ = LIZ(videoPublishEditModel, z2);
            c0labLIZ.LJ("enter_method", str2);
            c0labLIZ.LIZIZ(j, "duration");
            c0labLIZ.LJ("cutout_type", c0ei5.getValue());
            c0labLIZ.LJ("adjust_brush_value", str);
            c0labLIZ.LIZ(zLJIIL ? 1 : 0, "is_from_edit_tab_cutout");
            C0MJO.LIZIZ(videoPublishEditModel.creativeModel, c0labLIZ);
            C20684815ws.LJIILLIIL("apply_cutout", c0labLIZ.LIZ);
        }
    }

    public static void LJIIJJI(VideoPublishEditModel videoPublishEditModel, int i, boolean z, String str, String str2, boolean z2) {
        String str3;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobCutoutResult isSuccess = ");
        sbLIZ.append(z);
        sbLIZ.append(" errorCode = ");
        sbLIZ.append(str);
        sbLIZ.append(" errorMsg = ");
        sbLIZ.append(str2);
        C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLIZ = LIZ(videoPublishEditModel, z2);
        c0labLIZ.LJ("error_code", str);
        c0labLIZ.LJ("error_msg", str2);
        c0labLIZ.LJ("matting_type", String.valueOf(i));
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZ.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        C20684815ws.LJIILLIIL("dve_matting_success_rate", c0labLIZ.LIZ);
    }

    public static void LJIIIZ(VideoPublishEditModel videoPublishEditModel, long j, boolean z, int i, int i2, int i3, int i4, long j2, boolean z2) {
        String str;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobCutoutcostMs costMs = ");
        sbLIZ.append(j);
        sbLIZ.append(" isVideo = ");
        sbLIZ.append(z);
        sbLIZ.append(" width = ");
        sbLIZ.append(i);
        sbLIZ.append(" height = ");
        sbLIZ.append(i2);
        sbLIZ.append(" fps = ");
        sbLIZ.append(i3);
        sbLIZ.append(" videoDuration = ");
        sbLIZ.append(i4);
        sbLIZ.append(" videoFileSize = ");
        sbLIZ.append(j2);
        C201955140j.LIZLLL(c563650M8t, "CutoutMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLIZ = LIZ(videoPublishEditModel, z2);
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZ.LJ("is_video", str);
        c0labLIZ.LIZ(i, "material_width");
        c0labLIZ.LIZ(i2, "material_height");
        c0labLIZ.LIZ(i4, "material_duration");
        c0labLIZ.LIZ(i3, "fps");
        c0labLIZ.LIZIZ(j2, "material_size");
        c0labLIZ.LIZIZ(j, "duration");
        C20684815ws.LJIILLIIL("dve_matting_duration", c0labLIZ.LIZ);
    }
}
