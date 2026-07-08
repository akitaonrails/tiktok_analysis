package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402820mbo {
    public static final C1402820mbo LIZ = new C1402820mbo();

    public static C0LAB LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        int size;
        List<SingleImageData> imageList;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c0lab.LIZ(size, "pic_cnt");
        return c0lab;
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, String str) {
        LIZ.getClass();
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, str);
        c0labLIZJ.LJ("pause_method", "click");
        C20684815ws.LJIILLIIL("preview_video_pause", c0labLIZJ.LIZ);
    }

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel, String str, boolean z) {
        int i;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", videoPublishEditModel.creativeModel.postPageModel.previewEnterFrom);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c0lab.LIZ(i, "is_virtual_feed");
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
        if (str == null) {
            str = "";
        }
        c0lab.LJ("last_group_id", str);
        return c0lab;
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, String str, String str2, boolean z) {
        LIZ.getClass();
        C0LAB c0labLIZ = LIZ(videoPublishEditModel, str, z);
        c0labLIZ.LJ("enter_tab", str2);
        C20684815ws.LJIILLIIL("click_delete_virtual_feed_button", c0labLIZ.LIZ);
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3, boolean z) {
        LIZ.getClass();
        C0LAB c0labLIZ = LIZ(videoPublishEditModel, str, z);
        c0labLIZ.LJ("click_preview_entrance_time", str2);
        c0labLIZ.LJ("enter_tab", str3);
        C580270MpN.LIZIZ(videoPublishEditModel, c0labLIZ, Intrinsics.LJFF(videoPublishEditModel.creativeModel.postPageModel.previewEnterFrom, "edit_post_page"));
        C20684815ws.LJIILLIIL("click_preview_back_post_page_button", c0labLIZ.LIZ);
    }
}
