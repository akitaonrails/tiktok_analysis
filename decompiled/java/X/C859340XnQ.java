package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0XnQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C859340XnQ {
    public static final boolean LIZIZ() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService == null) {
            return false;
        }
        return iAVPublishPageUIRefactorService.enableToastCenter();
    }

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C0M0L.LIZ() && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.isPreventDownload()) {
            return true;
        }
        return false;
    }
}
