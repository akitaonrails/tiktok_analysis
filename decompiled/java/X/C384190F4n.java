package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;

/* JADX INFO: renamed from: X.0F4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384190F4n {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            if (previewInfo != null && previewInfo.getPreviewVideoLength() != 0) {
                if (previewInfo.getPreviewVideoLength() >= 61000) {
                    return true;
                }
                return false;
            }
            if (videoPublishEditModel != null && videoPublishEditModel.getVideoDurationFromVideoCutPage() >= 61000) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZIZ(InterfaceC1455860nzM interfaceC1455860nzM) {
        InterfaceC1452170ntP value;
        if (interfaceC1455860nzM == null || (value = interfaceC1455860nzM.g().getValue()) == null || value.getDuration() < 61000) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(AVMusic aVMusic) {
        if (!aVMusic.isPgc() && !aVMusic.isLocalMusic() && !C290880Bag.LIZ()) {
            return true;
        }
        return false;
    }
}
