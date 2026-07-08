package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0oA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462470oA1 {
    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if ((videoPublishEditModel instanceof VideoPublishEditModel) && C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return LIZIZ(videoPublishEditModel);
        }
        if (videoPublishEditModel != null && videoPublishEditModel.getVideoLength() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!C1428470nHB.LJLIIL(videoPublishEditModel) && !C0MUK.LJFF(videoPublishEditModel.creativeModel) && !C1428470nHB.LJZ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        boolean z = videoPublishEditModel instanceof VideoPublishEditModel;
        if (z && C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return LIZIZ(videoPublishEditModel);
        }
        if (z) {
            if (videoPublishEditModel.getVideoLength() > 0 || videoPublishEditModel.getRecordMode() == 1) {
                return true;
            }
            return false;
        }
        if (videoPublishEditModel != null && videoPublishEditModel.getVideoLength() > 0) {
            return true;
        }
        return false;
    }
}
