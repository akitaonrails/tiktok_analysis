package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;

/* JADX INFO: renamed from: X.0Km4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527260Km4 {
    public static TikTokMediaModel LIZ(MediaModel mediaModel) {
        TikTokMediaModel tikTokMediaModel = new TikTokMediaModel(mediaModel.id, (C0L9F) null, 6);
        TikTokMediaModel.Companion.getClass();
        tikTokMediaModel.LJIILL(mediaModel.LJFF());
        tikTokMediaModel.relativePath = mediaModel.relativePath;
        if (mediaModel instanceof TikTokMediaModel) {
            tikTokMediaModel.absolutePath = ((TikTokMediaModel) mediaModel).absolutePath;
        }
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
        return tikTokMediaModel;
    }
}
