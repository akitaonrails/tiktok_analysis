package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PhotoModeEditingStage;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;

/* JADX INFO: renamed from: X.0mz1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417210mz1 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        PhotoModeEditingStage photoModeEditingStage;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "photo_auto_cut_none_slideshow_option", true) != 1 || videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (photoModeEditingStage = creativeModel.photoModeEnterEditingStage) == null || !photoModeEditingStage.photoModeEnterAutoCut || !u4.LJIL(videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        CreativeModel creativeModel;
        PhotoModeEditingStage photoModeEditingStage;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (photoModeEditingStage = creativeModel.photoModeEnterEditingStage) != null && photoModeEditingStage.isFromMultiPhotoSpecialPage) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        CreativeModel creativeModel;
        PhotoModeEditingStage photoModeEditingStage;
        if (!C1417200mz0.LIZ() || videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (photoModeEditingStage = creativeModel.photoModeEnterEditingStage) == null || !photoModeEditingStage.photoModeEnterAutoCut || !u4.LJIL(videoPublishEditModel)) {
            return false;
        }
        return true;
    }
}
