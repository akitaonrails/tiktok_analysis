package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.List;

/* JADX INFO: renamed from: X.0mdb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403930mdb {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!u4.LJLL(videoPublishEditModel)) {
            if (C1428470nHB.LJJZZI(videoPublishEditModel) || LIZIZ(videoPublishEditModel)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        CanvasVideoData canvasVideoData;
        List<String> list;
        if (!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) || (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) == null || (list = canvasVideoData.sourceInfo) == null || list.size() != 1 || videoPublishEditModel.isCurrentAutoCutMode() || C1444940nhk.LJIIJ(videoPublishEditModel.getCanvasVideoData()) || C1444940nhk.LJIIIIZZ(videoPublishEditModel.getCanvasVideoData()) || videoPublishEditModel.creativeModel.changeAvatarModel.isFromChangeAvatar) {
            return false;
        }
        return true;
    }
}
