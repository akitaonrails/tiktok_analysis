package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0XhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855610XhP {
    public static final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_quick_post_to_entire_post_page", true) == 1;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (LIZ() && videoPublishEditModel.creativeModel.editSaveLocalModel.isFromQuickPublish) {
            return true;
        }
        return false;
    }
}
