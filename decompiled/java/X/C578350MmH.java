package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MmH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578350MmH {
    public static final C578350MmH LIZ = new C578350MmH();
    public static boolean LIZIZ;

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        boolean zLJJZZI = C1428470nHB.LJJZZI(videoPublishEditModel);
        Pair<Integer, Integer> pairLJJIIZ = C1416310mxZ.LJJIIZ(videoPublishEditModel);
        C0LAB c0lab = new C0LAB();
        if (zLJJZZI) {
            str = "video";
        } else {
            str = "photo";
        }
        c0lab.LJ("to_type", str);
        c0lab.LIZ(pairLJJIIZ.getFirst().intValue(), "original_video_cnt");
        c0lab.LIZ(pairLJJIIZ.getSecond().intValue(), "original_pic_cnt");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.creativeModel.photoModeEnterEditingStage.isFromMultiPhotoSpecialPage ? 1 : 0, "is_from_multi_photo_special_page");
        C20684815ws.LJIILLIIL("switch_edit_page_type_button_show", c0lab.LIZ);
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C1403560md0 c1403560md0) {
        c1403560md0.LJ("edit_page_type", videoPublishEditModel.creativeModel.commonMobModel.editPageType);
    }
}
