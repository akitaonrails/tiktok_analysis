package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0naO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440380naO {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        if (videoPublishEditModel != null && (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) != null && C1444940nhk.LJIIZILJ(canvasVideoData) && ((Number) C264070AWn.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        if (videoPublishEditModel == null || (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) == null || !C1444940nhk.LJIIZILJ(canvasVideoData)) {
            return false;
        }
        return C287150BNh.LIZ();
    }
}
