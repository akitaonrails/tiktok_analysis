package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;

/* JADX INFO: renamed from: X.0MH2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MH2 {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        if (z || C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) || videoPublishEditModel.isPhotoMvMode() || videoPublishEditModel.isMvThemeVideoType() || C1428470nHB.LJJZZI(videoPublishEditModel) || (previewInfo = videoPublishEditModel.getPreviewInfo()) == null || (videoList = previewInfo.getVideoList()) == null || videoList.size() != 1 || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_creative_edit_hdr_v2", true, false) || videoPublishEditModel.getEditorProModel().isAdvancedEditDraft()) {
            return false;
        }
        return true;
    }
}
