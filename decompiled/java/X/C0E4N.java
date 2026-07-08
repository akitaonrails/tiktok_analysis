package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0E4N, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4N {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        EditorProModel editorProModel;
        List<EditorProEffectInfo> videoSegmentEffects;
        if (videoPublishEditModel != null && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return true;
        }
        if (!C0C0J.LIZ()) {
            return false;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_local_video_effect", true, false)) {
            return true;
        }
        if (videoPublishEditModel != null && (editorProModel = videoPublishEditModel.getEditorProModel()) != null && (videoSegmentEffects = editorProModel.getVideoSegmentEffects()) != null && !videoSegmentEffects.isEmpty()) {
            return true;
        }
        return false;
    }
}
