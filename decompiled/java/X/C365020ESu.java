package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0ESu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365020ESu {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getEditorProModel().isAdvancedEdit() || (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_editor_pro_enable_new_photo_canvas", true) == 1 && C338630DPh.LIZ())) {
            return true;
        }
        return false;
    }
}
