package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nNI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432260nNI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        int i;
        if (videoPublishEditModel.getCreationMode() == 2 || videoPublishEditModel.getImageAlbumData() != null) {
            C201955140j.LJ("revertImageMode");
            if (C1428470nHB.LLIIIL(videoPublishEditModel)) {
                i = 3;
            } else {
                i = 1;
            }
            videoPublishEditModel.setCreationMode(i);
            videoPublishEditModel.setImageAlbumData(null);
            if (C297670Bld.LIZ()) {
                C0CHQ.LIZ().getPublishService().LJJLL(videoPublishEditModel, "revert to normal mode");
            }
        }
        videoPublishEditModel.setShareToDM(false);
    }
}
