package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0XoZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860050XoZ {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        boolean z2;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_editor_pro_publish_first_frame_opt_publish_page", true) != 0 && videoPublishEditModel.isMultiVideoEdit() && (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() || C1416310mxZ.LJJJJIZL(videoPublishEditModel))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            return z2;
        }
        if (!z2 || !videoPublishEditModel.creativeModel.postPageModel.isEnterFromEPDirectly) {
            return false;
        }
        return true;
    }
}
