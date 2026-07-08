package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0Km2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527240Km2 {
    public static MediaModel LIZIZ(TikTokMediaModel tikTokMediaModel) {
        MediaModel mediaModel = new MediaModel(tikTokMediaModel.id);
        mediaModel.LJIILL(tikTokMediaModel.LJFF());
        mediaModel.relativePath = tikTokMediaModel.relativePath;
        mediaModel.mediaPickerAbsolutePath = tikTokMediaModel.mediaPickerAbsolutePath;
        mediaModel.fileName = tikTokMediaModel.fileName;
        mediaModel.localUri = tikTokMediaModel.localUri;
        mediaModel.albumClass = tikTokMediaModel.albumClass;
        mediaModel.date = tikTokMediaModel.date;
        mediaModel.type = tikTokMediaModel.type;
        mediaModel.subType = tikTokMediaModel.subType;
        mediaModel.duration = tikTokMediaModel.duration;
        mediaModel.fileSize = tikTokMediaModel.fileSize;
        String str = tikTokMediaModel.mimeType;
        if (str != null) {
            mediaModel.mimeType = str;
        }
        mediaModel.thumbnail = tikTokMediaModel.thumbnail;
        mediaModel.width = tikTokMediaModel.width;
        mediaModel.height = tikTokMediaModel.height;
        mediaModel.modify = tikTokMediaModel.modify;
        mediaModel.aigcInfo = tikTokMediaModel.aigcInfo;
        mediaModel.onlineVideoUrl = tikTokMediaModel.onlineVideoUrl;
        mediaModel.thumbnailOnlineUrl = tikTokMediaModel.thumbnailOnlineUrl;
        mediaModel.liveHighlightType = tikTokMediaModel.liveHighlightType;
        mediaModel.liveInfo = tikTokMediaModel.liveInfo;
        mediaModel.livePhotoInfo = tikTokMediaModel.livePhotoInfo;
        mediaModel.mediaSource = tikTokMediaModel.mediaSource;
        return mediaModel;
    }

    public static void LIZ(TikTokMediaModel tikTokMediaModel, MediaModel mediaModel) {
        tikTokMediaModel.LJIILL(mediaModel.LJFF());
        tikTokMediaModel.relativePath = mediaModel.relativePath;
        tikTokMediaModel.mediaPickerAbsolutePath = mediaModel.mediaPickerAbsolutePath;
        tikTokMediaModel.fileName = mediaModel.fileName;
        tikTokMediaModel.localUri = mediaModel.localUri;
        tikTokMediaModel.albumClass = mediaModel.albumClass;
        tikTokMediaModel.date = mediaModel.date;
        tikTokMediaModel.type = mediaModel.type;
        tikTokMediaModel.subType = mediaModel.subType;
        tikTokMediaModel.duration = mediaModel.duration;
        tikTokMediaModel.fileSize = mediaModel.fileSize;
        String str = mediaModel.mimeType;
        if (str != null) {
            tikTokMediaModel.mimeType = str;
        }
        tikTokMediaModel.thumbnail = mediaModel.thumbnail;
        tikTokMediaModel.width = mediaModel.width;
        tikTokMediaModel.height = mediaModel.height;
        tikTokMediaModel.modify = mediaModel.modify;
        tikTokMediaModel.aigcInfo = mediaModel.aigcInfo;
        tikTokMediaModel.onlineVideoUrl = mediaModel.onlineVideoUrl;
        tikTokMediaModel.thumbnailOnlineUrl = mediaModel.thumbnailOnlineUrl;
        tikTokMediaModel.liveHighlightType = mediaModel.liveHighlightType;
        tikTokMediaModel.liveInfo = mediaModel.liveInfo;
        tikTokMediaModel.livePhotoInfo = mediaModel.livePhotoInfo;
        tikTokMediaModel.dateTaken = mediaModel.dateTaken;
    }

    public static TikTokMediaModel LIZJ(C530020KqW c530020KqW, MediaModel mediaModel) {
        EnumC538220L8y enumC538220L8y;
        String str = mediaModel.id;
        if (mediaModel instanceof TikTokMediaModel) {
            enumC538220L8y = ((TikTokMediaModel) mediaModel).loadSource;
        } else {
            enumC538220L8y = EnumC538220L8y.MEDIA_STORE;
        }
        TikTokMediaModel tikTokMediaModelLIZ = c530020KqW.LIZ(str, enumC538220L8y);
        TikTokMediaModel.Companion.getClass();
        LIZ(tikTokMediaModelLIZ, mediaModel);
        return tikTokMediaModelLIZ;
    }
}
