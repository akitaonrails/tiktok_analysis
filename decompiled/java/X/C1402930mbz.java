package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402930mbz {
    public static final String LIZJ(int i) {
        return i == 2131829841 ? "discard" : i == 2131829833 ? "discard_edits" : i == 2131829848 ? "start_over" : i == 2131829822 ? "exit_camera" : i == 2131829843 ? "continue_recording" : (i == 2131829846 || i == 2131846553) ? "save_draft" : i == 2131829868 ? "back_to_trim" : i == 2131829870 ? "record_again" : i == 2131829834 ? "quit_editing" : i == 2131831535 ? "send_to_friends" : (i == 2131829613 || i == 2131829612) ? "private_post" : i == 2131844923 ? "post_to_friends" : i == 2131846549 ? "discard_edits" : i == 2131846554 ? "discard" : i == 2131846555 ? "save_and_exit" : i == 2131846550 ? "continue_recording" : i == 2131846551 ? "save_edits" : i == 2131835486 ? "edit_text" : i == 2131825353 ? "continue_indraft" : i == 2131830680 ? "cancel" : i == 2131830681 ? "discard_edits" : "";
    }

    public static final String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getShootMode() != 15 && videoPublishEditModel.getShootMode() != 17) {
            if (videoPublishEditModel.getShootMode() != 10 && videoPublishEditModel.getShootMode() != 11 && videoPublishEditModel.getShootMode() != 14 && videoPublishEditModel.getShootMode() != 18) {
                if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "duet")) {
                    return "duet";
                }
                if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "stitch")) {
                    return "stitch";
                }
                if (videoPublishEditModel.isTemplateMv()) {
                    return "template";
                }
                return "upload";
            }
            return "camera";
        }
        return "quick";
    }

    public static final int LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (C1B46.LJIIJJI(videoPublishEditModel.mShootWay)) {
            return 1;
        }
        return 0;
    }

    public static final boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        if (LIZLLL(videoPublishEditModel) == 1) {
            return true;
        }
        return false;
    }

    public static final int LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.inlineCaptionModel != null) {
            return 3;
        }
        return videoPublishEditModel.hasSubtitle() ? 1 : 0;
    }

    public static final C0LAB LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        return c0lab;
    }

    public static final void LJII(VideoPublishEditModel videoPublishEditModel, String str) {
        C0LAB c0labLIZ = LIZ(videoPublishEditModel, "video_edit_page");
        c0labLIZ.LJ("enter_from", "video_edit_page");
        c0labLIZ.LJ("enter_method_popup", LIZIZ(videoPublishEditModel));
        c0labLIZ.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0labLIZ.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        c0labLIZ.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0labLIZ.LIZ(LIZLLL(videoPublishEditModel), "is_from_external");
        if (str.length() > 0) {
            c0labLIZ.LJ("template_async_scene", str);
        }
        C20684815ws.LJIILLIIL("show_exit_shoot_popup", c0labLIZ.LIZ);
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, String str, boolean z) {
        int size;
        String str2;
        List<SingleImageData> imageList;
        C0LAB c0labLIZ = LIZ(videoPublishEditModel, "video_edit_page");
        c0labLIZ.LJ("enter_from", "video_edit_page");
        c0labLIZ.LJ("enter_method_popup", LIZIZ(videoPublishEditModel));
        c0labLIZ.LJ("to_status", str);
        c0labLIZ.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0labLIZ.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        c0labLIZ.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0labLIZ.LIZ(LIZLLL(videoPublishEditModel), "is_from_external");
        int iLJIIJ = 0;
        if ("".length() > 0) {
            c0labLIZ.LJ("template_async_scene", "");
        }
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c0labLIZ.LIZ(size, "pic_cnt");
        c0labLIZ.LIZ(videoPublishEditModel.getVideoCount(), "video_cnt");
        ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData2 != null) {
            iLJIIJ = C1413430msv.LJIIJ(imageAlbumData2);
        }
        c0labLIZ.LIZ(iLJIIJ, "live_photo_cnt");
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "sdk")) {
            c0labLIZ.LJ("sdk_source_app", videoPublishEditModel.creativeModel.editModel.sdkSourceApp);
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZ.LJ("is_land_to_creation_flow", str2);
        C20684815ws.LJIILLIIL("exit_shoot_popup_result", c0labLIZ.LIZ);
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C0LAB c0labLIZ = LIZ(videoPublishEditModel, "video_edit_page");
        c0labLIZ.LJ("enter_from", str);
        c0labLIZ.LJ("enter_method_popup", LIZIZ(videoPublishEditModel));
        c0labLIZ.LJ("to_status", str2);
        c0labLIZ.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0labLIZ.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        c0labLIZ.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0labLIZ.LIZ(LIZLLL(videoPublishEditModel), "is_from_external");
        if ("".length() > 0) {
            c0labLIZ.LJ("template_async_scene", "");
        }
        C20684815ws.LJIILLIIL("exit_shoot_popup_result", c0labLIZ.LIZ);
    }

    public static final void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, String str, List list) {
        int size;
        int iLJIIJ;
        List<SingleImageData> imageList;
        C0LAB c0labLIZ = LIZ(videoPublishEditModel, "video_edit_page");
        c0labLIZ.LJ("enter_from", str);
        c0labLIZ.LJ("enter_method_popup", LIZIZ(videoPublishEditModel));
        c0labLIZ.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c0labLIZ.LIZ(size, "pic_cnt");
        c0labLIZ.LIZ(videoPublishEditModel.getVideoCount(), "video_cnt");
        ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData2 != null) {
            iLJIIJ = C1413430msv.LJIIJ(imageAlbumData2);
        } else {
            iLJIIJ = 0;
        }
        c0labLIZ.LIZ(iLJIIJ, "live_photo_cnt");
        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "sdk")) {
            c0labLIZ.LJ("sdk_source_app", videoPublishEditModel.creativeModel.editModel.sdkSourceApp);
        }
        c0labLIZ.LIZ(C1403850mdT.LJIIIIZZ(videoPublishEditModel), "is_multi_content");
        c0labLIZ.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0labLIZ.LIZ(LIZLLL(videoPublishEditModel), "is_from_external");
        if ("".length() > 0) {
            c0labLIZ.LJ("template_async_scene", "");
        }
        ArrayList arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            c0labLIZ.LJ("options", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        }
        C20684815ws.LJIILLIIL("show_exit_shoot_popup", c0labLIZ.LIZ);
    }
}
