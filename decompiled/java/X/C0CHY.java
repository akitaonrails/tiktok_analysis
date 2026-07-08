package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0CHY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CHY {
    public static int LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!C0CHQ.LIZ().getAccountService().isLogin() || videoPublishEditModel.creativeModel.editPostModel != null || !C0C64.LJIILLIIL().LJIIIZ(31744, "enable_photo_mode_ai_desc_user", true, false)) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "photo_mode_enable_ai_desc", true);
    }
}
