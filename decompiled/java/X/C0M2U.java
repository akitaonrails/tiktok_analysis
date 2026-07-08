package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M2U, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2U {
    public static final C0M2U LIZ = new C0M2U();
    public static final Keva LIZIZ = Keva.getRepo("draft_mob_limit_keva");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("saveTextVideoFromEdit", "clickPopupFromEdit", "click_exit_edit_page_auto_save", "clickSheetFromEdit", "ai_livephoto_cancel_edit_auto_save", "ai_livephoto_click_loading_sheet", "ai_livephoto_publish_auto_save");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("autoSaveDraftAfterPublished", "saveBeforePublish", "clickSaveFromPublish");
    public static final List<String> LJ = Collections.singletonList("clickPopupFromRecord");

    public static void LIZIZ(String str, boolean z) {
        String str2;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("draft_select_page_type", "page");
        if (z) {
            str2 = "long_press";
        } else {
            str2 = "click_select";
        }
        c0lab.LJ("action_type", str2);
        c0lab.LJ("enter_from", str);
        C20684815ws.LJIILLIIL("enter_draft_selection", c0lab.LIZ);
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        String str3;
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LJ("function", str);
        if (videoPublishEditModel.creativeModel.editSaveLocalModel.isFromQuickPublish) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_from_save_local_popup", str3);
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("content_size", C1428520nHG.LJJIIJ(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
        C20684815ws.LJIILLIIL("post_page_function_click", c0lab.LIZ);
    }

    public static void LIZJ(int i, String str, String str2, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("draft_select_page_type", "page");
        c0lab.LJ("action_type", str);
        c0lab.LJ("enter_from", str2);
        c0lab.LIZ(i, "select_count");
        c0lab.LJ("is_first_selection", str3);
        c0lab.LIZ(Intrinsics.LJFF(str2, "shoot_page_edit_tab") ? 1 : 0, "is_from_edit_tab");
        C20684815ws.LJIILLIIL("select_draft", c0lab.LIZ);
    }
}
