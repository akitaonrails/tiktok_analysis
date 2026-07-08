package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0mbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402910mbx {
    public static final C1402910mbx LIZ = new C1402910mbx();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        if (C1416310mxZ.LJI(videoPublishEditModel)) {
            c0lab.LIZ(1, "is_with_text_template");
        } else {
            c0lab.LIZ(0, "is_with_text_template");
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        if (C1416310mxZ.LJI(videoPublishEditModel)) {
            c0lab.LJ("photo_text_template", C1416310mxZ.LJJIJL(videoPublishEditModel));
        } else {
            c0lab.LJ("photo_text_template", "");
        }
    }

    public static C0LAB LIZJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        int size;
        List<SingleImageData> imageList;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c0lab.LIZ(size, "pic_cnt");
        c0lab.LIZ(z ? 1 : 0, "is_photo_editor");
        return c0lab;
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, boolean z, long j, boolean z2) {
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, false);
        c0labLIZJ.LIZ(!z ? 1 : 0, "error");
        c0labLIZJ.LIZIZ(j, "duration");
        c0labLIZJ.LIZ(0, Scene.SCENE_SERVICE);
        c0labLIZJ.LIZ(z2 ? 1 : 0, "is_new_text_template");
        C20684815ws.LJIILLIIL("creation_text_template_tab_loading", c0labLIZJ.LIZ);
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, boolean z, long j, String str, String str2, boolean z2) {
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, false);
        c0labLIZJ.LIZ(!z ? 1 : 0, "error");
        c0labLIZJ.LIZIZ(j, "duration");
        c0labLIZJ.LJ("tab_id", str);
        c0labLIZJ.LIZ(0, Scene.SCENE_SERVICE);
        c0labLIZJ.LJ("panel_name", str2);
        c0labLIZJ.LIZ(z2 ? 1 : 0, "is_new_text_template");
        C20684815ws.LJIILLIIL("creation_text_template_list_loading", c0labLIZJ.LIZ);
    }

    public static void LIZLLL(long j, VideoPublishEditModel videoPublishEditModel, String str, String str2, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, false);
        int i3 = 1;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        c0labLIZJ.LIZ(i, "error");
        if (z2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0labLIZJ.LIZ(i2, "is_preload");
        c0labLIZJ.LJ("font_id", str);
        if (!z3) {
            i3 = 0;
        }
        c0labLIZJ.LIZ(i3, "has_cache");
        c0labLIZJ.LIZIZ(j, "duration");
        c0labLIZJ.LJ("template_type", str2);
        c0labLIZJ.LIZ(0, Scene.SCENE_SERVICE);
        C20684815ws.LJIILLIIL("creation_text_template_font_download", c0labLIZJ.LIZ);
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, z);
        c0labLIZJ.LJ("template", str2);
        c0labLIZJ.LJ("text_template_tab", str);
        if (z2) {
            c0labLIZJ.LJ("is_shortcut", "1");
        } else {
            c0labLIZJ.LJ("is_shortcut", CardStruct.IStatusCode.DEFAULT);
        }
        if (z3) {
            c0labLIZJ.LJ("is_default_applied", "1");
        } else {
            c0labLIZJ.LJ("is_default_applied", CardStruct.IStatusCode.DEFAULT);
        }
        c0labLIZJ.LIZ(z4 ? 1 : 0, "is_new_text_template");
        C20684815ws.LJIILLIIL("select_photo_text_template", c0labLIZJ.LIZ);
    }

    public static void LJIIIIZZ(long j, VideoPublishEditModel videoPublishEditModel, String str, String str2, boolean z, boolean z2, boolean z3) {
        int i;
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, false);
        int i2 = 1;
        if (z) {
            i = 0;
        } else {
            i = 1;
        }
        c0labLIZJ.LIZ(i, "error");
        if (!z2) {
            i2 = 0;
        }
        c0labLIZJ.LIZ(i2, "is_preload");
        c0labLIZJ.LJ("template_id", str);
        c0labLIZJ.LIZIZ(j, "duration");
        c0labLIZJ.LJ("template_type", str2);
        c0labLIZJ.LIZ(0, Scene.SCENE_SERVICE);
        c0labLIZJ.LIZ(z3 ? 1 : 0, "is_new_text_template");
        C20684815ws.LJIILLIIL("creation_text_template_download", c0labLIZJ.LIZ);
    }

    public static void LJII(VideoPublishEditModel videoPublishEditModel, boolean z, long j, boolean z2, boolean z3, String str, String str2, String str3) {
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, false);
        c0labLIZJ.LIZ(!z ? 1 : 0, "error");
        c0labLIZJ.LIZ(z2 ? 1 : 0, "is_preload");
        c0labLIZJ.LIZ(z3 ? 1 : 0, "has_cache");
        c0labLIZJ.LIZIZ(j, "duration");
        c0labLIZJ.LJ("template_type", str);
        c0labLIZJ.LIZ(0, Scene.SCENE_SERVICE);
        c0labLIZJ.LJ("resource_id", str2);
        c0labLIZJ.LJ("type", str3);
        C20684815ws.LJIILLIIL("creation_text_template_depend_resource_download", c0labLIZJ.LIZ);
    }
}
