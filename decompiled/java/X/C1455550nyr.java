package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455550nyr {
    public static final boolean LIZIZ() {
        return C297620BlY.LIZ() || C297630BlZ.LIZ();
    }

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!C297630BlZ.LIZ() || videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.getCanvasVideoData() != null || C0CHQ.LIZ().getAccountService().LIZ() || !C0CHQ.LIZ().getAccountService().isLogin()) {
            return false;
        }
        return true;
    }
}
