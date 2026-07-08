package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoMemoryState;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0MZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570530MZf {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int size;
        List<? extends MediaModel> list;
        C570540MZg c570540MZgLIZJ = LIZJ(videoPublishEditModel, true);
        c0lab.LIZ(c570540MZgLIZJ.LIZ, "is_live_config_mem");
        String str = c570540MZgLIZJ.LIZIZ;
        if (str != null) {
            c0lab.LJ("live_config_mem_type", str);
        }
        if (videoPublishEditModel.isLivePhotoEdit()) {
            LivePhotoModel livePhotoModel = videoPublishEditModel.creativeModel.livePhotoModel;
            if (livePhotoModel != null && (list = livePhotoModel.importedLivePhotoList) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            c0lab.LIZ(size, "live_pic_cnt");
        }
    }

    public static final void LIZIZ(C1403560md0 c1403560md0, VideoPublishEditModel videoPublishEditModel) {
        int size;
        List<? extends MediaModel> list;
        C570540MZg c570540MZgLIZJ = LIZJ(videoPublishEditModel, true);
        c1403560md0.LIZ(c570540MZgLIZJ.LIZ, "is_live_config_mem");
        String str = c570540MZgLIZJ.LIZIZ;
        if (str != null) {
            c1403560md0.LJ("live_config_mem_type", str);
        }
        if (videoPublishEditModel.isLivePhotoEdit()) {
            LivePhotoModel livePhotoModel = videoPublishEditModel.creativeModel.livePhotoModel;
            if (livePhotoModel != null && (list = livePhotoModel.importedLivePhotoList) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            c1403560md0.LIZ(size, "live_pic_cnt");
        }
    }

    public static final C570540MZg LIZJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        int i;
        String strLIZIZ;
        if (!videoPublishEditModel.isLivePhotoEdit() && !videoPublishEditModel.isImageLivePhotoEdit()) {
            return new C570540MZg();
        }
        LivePhotoModel livePhotoModel = videoPublishEditModel.creativeModel.livePhotoModel;
        if (livePhotoModel == null) {
            return new C570540MZg();
        }
        LivePhotoMemoryState livePhotoMemoryState = livePhotoModel.memoryState;
        boolean z2 = livePhotoMemoryState.switchedInAlbum;
        if (!z2 && livePhotoMemoryState.memoryAppliedOnEnter) {
            if (z && livePhotoMemoryState.switchedInEditor) {
                i = -1;
            } else {
                i = 1;
            }
        } else {
            i = 0;
        }
        if (livePhotoMemoryState.memoryAppliedOnEnter && !z2) {
            strLIZIZ = C570520MZe.LIZIZ(livePhotoModel.previewMode, false);
        } else {
            strLIZIZ = null;
        }
        return new C570540MZg(i, strLIZIZ);
    }

    public static final void LIZLLL(String str, LivePhotoPreviewMode livePhotoPreviewMode, LivePhotoPreviewMode livePhotoPreviewMode2, String str2, String str3, String str4, String str5, String str6) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("from_mode", C570520MZe.LIZIZ(livePhotoPreviewMode, false));
        c0lab.LJ("to_mode", C570520MZe.LIZIZ(livePhotoPreviewMode2, false));
        c0lab.LIZ(1, "live_pic_cnt");
        if (str2 != null) {
            c0lab.LJ("creation_id", str2);
        }
        if (str3 != null) {
            c0lab.LJ("shoot_way", str3);
        }
        if (str4 != null) {
            c0lab.LJ("content_source", str4);
        }
        if (str5 != null) {
            c0lab.LJ("content_type", str5);
        }
        if (str6 != null) {
            c0lab.LJ("biz_type", str6);
        }
        C20684815ws.LJIILLIIL("click_live_mode_icon", c0lab.LIZ);
    }
}
