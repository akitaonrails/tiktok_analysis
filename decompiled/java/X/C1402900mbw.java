package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.mob.IEditorProMobService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402900mbw {
    public static long LIZ;
    public static boolean LIZIZ;

    public static final Map<String, String> LIZ(VideoPublishEditModel videoPublishEditModel) {
        String strLJJIJIIJI;
        String strLJJIJIIJIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "1";
        String str2 = "template_anchor";
        if (C1428470nHB.LLIIJI(videoPublishEditModel)) {
            strLJJIJIIJI = C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, true);
        } else {
            if (videoPublishEditModel.isCurrentAutoCutMode() && C1412660mrg.LIZJ(videoPublishEditModel.creativeModel.autoCutModel.curTemplateType) == EnumC1412640mre.DESIGNER_FIXED_TEMPLATE) {
                strLJJIJIIJI = "designer";
            } else {
                strLJJIJIIJI = C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, false);
            }
            if (C123100dR.LIZ(strLJJIJIIJI)) {
                C1412390mrF c1412390mrFLIZ = C1412380mrE.LIZ(videoPublishEditModel);
                if ((!C298890Bnb.LIZ() || c1412390mrFLIZ == null || !c1412390mrFLIZ.LIZIZ()) && !Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LJ) && !Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LIZLLL) && !Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LIZIZ) && !Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LIZJ)) {
                    str2 = Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LJIILL) ? "mdp_square" : Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LJI) ? "template_tab" : Intrinsics.LJFF(c1412390mrFLIZ, C1412390mrF.LJIIJ) ? videoPublishEditModel.creativeModel.autoCutModel.curSource == C0MJ9.MIX_EDITING.ordinal() ? "edit_slide" : "autocut" : "";
                }
                if (str2.length() == 0 && (strLJJIJIIJIL = C1416310mxZ.LJJIJIIJIL(videoPublishEditModel, null)) != null && C123100dR.LIZ(strLJJIJIIJIL)) {
                    str2 = "edit_slide";
                }
                if (!C123100dR.LIZ(strLJJIJIIJI)) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
                str2 = "";
            }
        }
        linkedHashMap.put("is_template", str);
        linkedHashMap.put("template_type", strLJJIJIIJI);
        linkedHashMap.put("template_enter_method", str2);
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0LAB LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402900mbw.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):X.0LAB");
    }

    public static final boolean LIZJ(EditorProSchemeModel editorProSchemeModel) {
        String str;
        if (editorProSchemeModel == null) {
            return false;
        }
        EPAnchorData ePAnchorData = editorProSchemeModel.anchorData;
        if (ePAnchorData != null) {
            str = ePAnchorData.editorProAnchorType;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "captions");
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, int r24) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402900mbw.LJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i) {
        List<MultiEditVideoSegmentRecordData> list;
        int size;
        Integer numValueOf;
        boolean z14;
        String str;
        String strLIZ;
        String str2;
        ArrayList<String> arrayList;
        ?? r4 = z9;
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        if ((i & 32) != 0) {
            z4 = false;
        }
        if ((i & 64) != 0) {
            z5 = false;
        }
        if ((i & 128) != 0) {
            z6 = false;
        }
        if ((i & 256) != 0) {
            z7 = false;
        }
        if ((i & 512) != 0) {
            z8 = false;
        }
        if ((i & 1024) != 0) {
            r4 = 0;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z10 = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z11 = false;
        }
        if ((i & 8192) != 0) {
            z12 = false;
        }
        if ((i & 16384) != 0) {
            z13 = false;
        }
        if (videoPublishEditModel.isPhotoMvMode()) {
            MvCreateVideoData mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
            if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null) {
                size = arrayList.size();
                numValueOf = Integer.valueOf(size);
            }
            numValueOf = null;
        } else {
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null) {
                size = list.size();
                numValueOf = Integer.valueOf(size);
            }
            numValueOf = null;
        }
        boolean z15 = videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate;
        ?? LIZIZ2 = LIZIZ(videoPublishEditModel);
        if (u4.LJJIJIL(videoPublishEditModel)) {
            LIZIZ2.LJ("enter_from", u4.LJIJJ(videoPublishEditModel));
        }
        String strLJIJJ = "app_push";
        if (z8) {
            int i2 = videoPublishEditModel.mDraftToEditFrom;
            if (i2 == 6) {
                str2 = "app_push";
            } else if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && i2 == 0) {
                str2 = "draft";
            } else {
                str2 = "Interrupt_popup";
            }
            LIZIZ2.LJ("enter_from", str2);
        }
        if (z5 || z6 || z10) {
            LIZIZ2.LJ("enter_from", "video_edit_page");
        }
        int i3 = videoPublishEditModel.mDraftToEditFrom;
        if (i3 == 6) {
            z14 = true;
        } else {
            z14 = false;
        }
        String str3 = "edit_page";
        if (!z14) {
            if (z13) {
                strLJIJJ = "ai_video_tool";
            } else if (z8) {
                if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && i3 == 0) {
                    strLJIJJ = "draft";
                } else {
                    strLJIJJ = "Interrupt_popup";
                }
            } else if (LIZJ(videoPublishEditModel.creativeModel.editorProSchemeModel)) {
                strLJIJJ = "caption_anchor";
            } else if (C537970L7z.LJ(videoPublishEditModel.creativeModel.editorProSchemeModel)) {
                strLJIJJ = "magic_anchor";
            } else if (z10) {
                strLJIJJ = "captions_from_edit";
            } else if (z7) {
                strLJIJJ = "shoot_page_edit_tab";
            } else if (z15) {
                strLJIJJ = "template_tab";
            } else if (z2) {
                strLJIJJ = "fyp_anchor";
            } else if (z11) {
                strLJIJJ = "external_link";
            } else if (z3) {
                strLJIJJ = "video_post_page";
            } else if (z12) {
                strLJIJJ = "edit_page_retouch";
            } else if (z5) {
                strLJIJJ = "edit_page_slide";
            } else if (z6 || !u4.LJJIJIL(videoPublishEditModel)) {
                strLJIJJ = "edit_page";
            } else {
                strLJIJJ = u4.LJIJJ(videoPublishEditModel);
            }
        }
        videoPublishEditModel.getEditorProModel().setClickFrom(strLJIJJ);
        u4.LJIJJLI(videoPublishEditModel);
        LIZIZ2.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        LIZIZ2.LIZ(videoPublishEditModel.getVideoLength(), "creation_duration");
        String str4 = "1";
        LIZIZ2.LJ("is_editor_pro", "1");
        LIZIZ2.LJ("enter_dm", videoPublishEditModel.creativeModel.initialModel.dmCameraModel.enterDM);
        LIZIZ2.LJ("is_from_text", CardStruct.IStatusCode.DEFAULT);
        C0MJO.LIZIZ(videoPublishEditModel.creativeModel, LIZIZ2);
        C0MJO.LIZ(LIZIZ2, videoPublishEditModel);
        LIZIZ2.LJ("click_from", strLJIJJ);
        if (!z) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ2.LJ("is_warn_show", str4);
        if (numValueOf != null && numValueOf.intValue() > 1) {
            str = "multiple";
        } else {
            str = "single";
        }
        LIZIZ2.LJ("segment_type", str);
        IEditorProMobService iEditorProMobService = (IEditorProMobService) C04TO.LIZ.getValue();
        if (iEditorProMobService == null || (strLIZ = iEditorProMobService.LIZ(videoPublishEditModel)) == null) {
            strLIZ = "";
        }
        LIZIZ2.LJ("all_editor_pro_used_functions", strLIZ);
        LIZIZ2.LJI(LIZ(videoPublishEditModel));
        LIZIZ2.LJ("enter_type", u4.LJIJJLI(videoPublishEditModel));
        if (z4) {
            str3 = "photo_tab_edit_page";
        }
        LIZIZ2.LJ("click_from_page", str3);
        LIZIZ2.LIZ(r4, "is_pic_frame_single_pic_edit");
        if (C123100dR.LIZ(videoPublishEditModel.getFromAlbumBottomBtn())) {
            LIZIZ2.LJ("from_album_bottom_button", videoPublishEditModel.getFromAlbumBottomBtn());
        }
        if (r4 != 0) {
            LIZIZ2.LIZ(1, "pic_cnt");
            LIZIZ2.LJ("content_type", "multi_photo");
            if (Intrinsics.LJFF(C1428470nHB.LJIILIIL(videoPublishEditModel), "shoot")) {
                LIZIZ2.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
            }
        }
        LIZIZ2.LJ("is_from_pugc_grid", C1402490mbH.LIZ(videoPublishEditModel.isFromQuickGrid2EP()));
        C20684815ws.LJIILLIIL("click_video_trim", LIZIZ2.LIZ);
    }
}
