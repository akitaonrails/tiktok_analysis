package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;

/* JADX INFO: renamed from: X.0o8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461820o8y {
    public static final C1461820o8y LIZ = new C1461820o8y();
    public static final Keva LIZIZ = Keva.getRepo("image_edit_show_thumbnail_keva");

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!u4.LJIL(videoPublishEditModel) || !C0FQX.LIZJ) {
            return false;
        }
        return !LIZIZ.getBoolean("discard_dialog_has_shown", false);
    }
}
