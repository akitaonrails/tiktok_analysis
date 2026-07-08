package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;

/* JADX INFO: renamed from: X.0nIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429390nIf {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        if (C1444940nhk.LJFF(videoPublishEditModel.getCanvasVideoData()) || C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData()) || z || u4.LJJZZI(videoPublishEditModel) || u4.LJJZZIII(videoPublishEditModel)) {
            return true;
        }
        if ((C1428470nHB.LLIIIJ(videoPublishEditModel) && u4.LJJJIL(videoPublishEditModel) && ((Boolean) C0B0M.LIZ.getValue()).booleanValue()) || C1444940nhk.LJIILL(videoPublishEditModel.getCanvasVideoData())) {
            return true;
        }
        if ((videoPublishEditModel.isEnterFromDM() && ((Boolean) C276620Asm.LIZ.getValue()).booleanValue()) || videoPublishEditModel.isPhotoSwap() || C1444940nhk.LJ(videoPublishEditModel.getCanvasVideoData()) || u4.LJJJJLL(videoPublishEditModel.creativeModel)) {
            return true;
        }
        return false;
    }
}
