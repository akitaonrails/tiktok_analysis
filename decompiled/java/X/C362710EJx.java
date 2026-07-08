package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362710EJx {
    public static final C362710EJx LIZ = new C362710EJx();

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        String str;
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("is_from_create_template", str);
        c0labLJFF.LJ("is_editor_pro", "1");
        C20684815ws.LJIILLIIL("filter_panel_show", c0labLJFF.LIZ);
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, Map map) {
        String enterFrom;
        String str;
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        Pair[] pairArr = new Pair[11];
        pairArr[0] = new Pair("creation_id", videoPublishEditModel.getCreationId());
        String str2 = videoPublishEditModel.mShootWay;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("shoot_way", str2);
        pairArr[2] = new Pair("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        pairArr[3] = new Pair("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        pairArr[4] = new Pair("creation_duration", String.valueOf(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength()));
        pairArr[5] = new Pair("draft_way", "general_draft_list");
        String strLJIJJ = "video_edit_page";
        if (videoPublishEditModel.getEnterFrom() == null || Intrinsics.LJFF(videoPublishEditModel.getEnterFrom(), "") || (enterFrom = videoPublishEditModel.getEnterFrom()) == null) {
            enterFrom = "video_edit_page";
        }
        if (videoPublishEditModel.getEditorProModel().getFromEditType() != 0 && videoPublishEditModel.getEditorProModel().getFromEditType() != 2 && videoPublishEditModel.getEditorProModel().getFromEditType() != 3 && videoPublishEditModel.getEditorProModel().getFromEditType() != 4) {
            strLJIJJ = enterFrom;
        }
        if (u4.LJJIJIL(videoPublishEditModel)) {
            strLJIJJ = u4.LJIJJ(videoPublishEditModel);
        }
        if (u4.LJJIJLIJ(videoPublishEditModel)) {
            strLJIJJ = "video_shoot_page";
        }
        if (u4.LJJIL(videoPublishEditModel)) {
            strLJIJJ = "shoot_page_edit_tab";
        }
        if (C1402900mbw.LIZJ(videoPublishEditModel.creativeModel.editorProSchemeModel)) {
            strLJIJJ = "fyp_anchor";
        }
        if (videoPublishEditModel.creativeModel.editorProSchemeModel.isDeepLink) {
            strLJIJJ = "external_link";
        }
        pairArr[6] = new Pair("enter_from", strLJIJJ);
        pairArr[7] = new Pair("pic_cnt", String.valueOf(iIntValue2));
        pairArr[8] = new Pair("video_cnt", String.valueOf(iIntValue));
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[9] = new Pair("is_from_create_template", str);
        pairArr[10] = new Pair("is_editor_pro", "1");
        map.putAll(C2097608Jq.LJIIJ(pairArr));
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("enter_way", str);
        C20684815ws.LJIILLIIL("click_modify_entrance", c0labLJFF.LIZ);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModel, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("enter_way", str);
        c0labLJFF.LJ("is_editor_pro", "1");
        C20684815ws.LJIILLIIL("filter_guidance_show", c0labLJFF.LIZ);
    }
}
