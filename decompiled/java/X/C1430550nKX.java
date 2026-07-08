package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadStickPointResources;
import java.util.List;

/* JADX INFO: renamed from: X.0nKX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430550nKX {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if (videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isPhotoMvMode() && !videoPublishEditModel.isDraftMusicIllegal()) {
            return true;
        }
        if ((!videoPublishEditModel.mIsFromDraft && C1428470nHB.LJIIZILJ(videoPublishEditModel)) || (videoPublishEditModel.mIsFromDraft && videoPublishEditModel.getEditMusicSyncMode())) {
            if (!LIZLLL(videoPublishEditModel)) {
                return true;
            }
            return false;
        }
        if ((videoPublishEditModel.getRecordMode() != 1 || videoPublishEditModel.mIsFromDraft) && aVMusicExtractAVMusic != null) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        List<String> list;
        List list2;
        String strLIZ = C1438730nXj.LIZ(MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel));
        MvCreateVideoData mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
        if (mvCreateVideoData != null) {
            list = mvCreateVideoData.musicIds;
        } else {
            list = null;
        }
        if (!C580130Mp9.LIZ(list)) {
            MvCreateVideoData mvCreateVideoData2 = videoPublishEditModel.getMvCreateVideoData();
            if (mvCreateVideoData2 == null || (list2 = mvCreateVideoData2.musicIds) == null) {
                list2 = C13BV.INSTANCE;
            }
            if (list2.contains(strLIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getOriginal() == 0 || videoPublishEditModel.isDuet() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isCutSameVideoType() || videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.hasMusic() || videoPublishEditModel.getCreationMode() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        Cut2EditTransferModel cut2EditTransferModel;
        if (!LazyLoadStickPointResources.LIZ() || videoPublishEditModel.mIsFromDraft || !C1428470nHB.LJIIZILJ(videoPublishEditModel) || (cut2EditTransferModel = videoPublishEditModel.getCut2EditTransferModel()) == null || !cut2EditTransferModel.getLazyLoadStickerPoint()) {
            return false;
        }
        return true;
    }
}
