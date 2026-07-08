package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376950EqD {
    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || C1416310mxZ.LJJJJZI(videoPublishEditModel) || !C301690Bs7.LIZ()) {
            return false;
        }
        if (!C1428470nHB.LLIIJI(videoPublishEditModel) && !C1428470nHB.LLIIIZ(videoPublishEditModel) && !videoPublishEditModel.isCurrentAutoCutMode() && !C0EYU.LIZIZ(videoPublishEditModel, null, null)) {
            return false;
        }
        return true;
    }
}
