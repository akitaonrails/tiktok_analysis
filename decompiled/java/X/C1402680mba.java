package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402680mba {
    public static final C1402680mba LIZ = new C1402680mba();

    public static C0LAB LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        int size;
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 1;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(size, "pic_cnt");
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        return c0lab;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012a  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12, X.C0LAB r13) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402680mba.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0LAB):void");
    }

    public static void LIZJ(C1402680mba c1402680mba, VideoPublishEditModel videoPublishEditModel) {
        int i;
        Boolean bool = Boolean.FALSE;
        c1402680mba.getClass();
        C0LAB c0labLIZIZ = LIZIZ(videoPublishEditModel);
        c0labLIZIZ.LIZ(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "is_photo_editor");
        if (!C573570MeZ.LIZJ(videoPublishEditModel) && !C573570MeZ.LIZIZ(videoPublishEditModel)) {
            i = 0;
        } else {
            i = 1;
        }
        c0labLIZIZ.LIZ(i, "is_pic_frame_single_pic_edit");
        C1413430msv.LIZLLL(videoPublishEditModel, c0labLIZIZ);
        C1413430msv.LIZIZ(videoPublishEditModel, c0labLIZIZ);
        if (C573570MeZ.LIZJ(videoPublishEditModel) || C573570MeZ.LIZIZ(videoPublishEditModel)) {
            c0labLIZIZ.LIZ(1, "pic_cnt");
            c0labLIZIZ.LJ("content_type", "multi_photo");
        }
        C1413430msv.LIZ(videoPublishEditModel, c0labLIZIZ);
        C1413430msv.LJFF(videoPublishEditModel, c0labLIZIZ);
        C580270MpN.LJIILIIL(videoPublishEditModel, c0labLIZIZ, "click_crop_icon");
        C572310McX.LJ(videoPublishEditModel, c0labLIZIZ);
        c0labLIZIZ.LIZ(videoPublishEditModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
        C20684815ws.LJIILLIIL("click_crop_icon", c0labLIZIZ.LIZ);
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C0LAB c0labLIZIZ = LIZIZ(videoPublishEditModel);
        c0labLIZIZ.LIZ(z ? 1 : 0, "is_photo_cropped");
        c0labLIZIZ.LIZ(z2 ? 1 : 0, "is_photo_slider_used");
        c0labLIZIZ.LIZ(z3 ? 1 : 0, "is_photo_mirrorred");
        c0labLIZIZ.LIZ(z4 ? 1 : 0, "is_photo_rotated");
        c0labLIZIZ.LJ("size_name", str2);
        C20684815ws.LJIILLIIL(str, c0labLIZIZ.LIZ);
    }
}
