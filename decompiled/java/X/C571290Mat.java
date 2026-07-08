package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;

/* JADX INFO: renamed from: X.0Mat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571290Mat {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!u4.LJLL(videoPublishEditModel) && !C1428470nHB.LJJZZI(videoPublishEditModel) && !C1428470nHB.LLIIIJ(videoPublishEditModel) && !C1428470nHB.LLIIIL(videoPublishEditModel) && C1428470nHB.LJZL(videoPublishEditModel) && !videoPublishEditModel.getAILivePhotoModel().LJI() && C571300Mau.LIZ()) {
            C1431780nMW.LIZ.getClass();
            if (C1431780nMW.LJI(videoPublishEditModel, null, null)) {
                C1431780nMW.LJIIIZ(videoPublishEditModel, C1439360nYk.LIZ(videoPublishEditModel), false);
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!u4.LJLL(videoPublishEditModel) && !C1428470nHB.LLIIIJ(videoPublishEditModel) && !C1428470nHB.LLIIIL(videoPublishEditModel)) {
            if (C1428470nHB.LJLIIL(videoPublishEditModel)) {
                return true;
            }
            if (C1428470nHB.LJZ(videoPublishEditModel) && C571300Mau.LIZ()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.creativeModel.draftInfoModel.isDraft && LIZIZ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.imagePublishModel.singlePhotoDirectPublish;
    }
}
