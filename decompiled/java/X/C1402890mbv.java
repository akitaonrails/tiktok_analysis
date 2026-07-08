package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0mbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402890mbv {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if (videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isPhotoMvMode() && !videoPublishEditModel.isDraftMusicIllegal()) {
            return true;
        }
        if ((!videoPublishEditModel.mIsFromDraft && C1428470nHB.LJIIZILJ(videoPublishEditModel)) || (videoPublishEditModel.mIsFromDraft && videoPublishEditModel.getEditMusicSyncMode())) {
            if (!C1430550nKX.LIZLLL(videoPublishEditModel)) {
                return true;
            }
            return false;
        }
        if ((videoPublishEditModel.getRecordMode() != 1 || videoPublishEditModel.mIsFromDraft) && aVMusicExtractAVMusic != null) {
            return true;
        }
        return false;
    }
}
