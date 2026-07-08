package X;

import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nNH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432250nNH {
    /* JADX WARN: Multi-variable type inference failed */
    public static final SingleImageData LIZ(MediaModel mediaModel, VideoPublishEditModel videoPublishEditModel, int i, String str, SrcLiveVideoInfo srcLiveVideoInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(videoPublishEditModel.getCreationId());
        sbLIZ.append('_');
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(System.currentTimeMillis());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String str2 = mediaModel.id;
        List list = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        SrcImageInfo srcImageInfo = new SrcImageInfo(str, mediaModel.height, mediaModel.width, null, null, 24, null);
        EditImageInfo editImageInfo = new EditImageInfo(null, null, 0, 0, false, false, 0, 0.0f, null, null, null, null, null, null, null, null, false, null, false, null, null, 2097151, null);
        int i2 = C1451140nrk.LIZ;
        editImageInfo.setFullScreen(C1451140nrk.LIZ(mediaModel.width / mediaModel.height));
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        ImportVideoInfo importVideoInfo = null;
        if (importInfoList != null) {
            Iterator<ImportVideoInfo> it2 = importInfoList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ImportVideoInfo next = it2.next();
                String originImportPath = next.getOriginImportPath();
                if (originImportPath != null && a0.LJJIIZI(originImportPath, mediaModel.id, false)) {
                    importVideoInfo = next;
                    break;
                }
            }
            importVideoInfo = importVideoInfo;
        }
        SingleImageData singleImageData = new SingleImageData(strLIZIZ, str2, srcImageInfo, null, editImageInfo, null, null, null, new ImageStickerInfoNewEngine(list, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 1023, objArr == true ? 1 : 0), null, null, 0, mediaModel.aigcInfo, importVideoInfo, null, null, false, srcLiveVideoInfo, null, null, null, null, false, 8244960, null);
        int i3 = C1451140nrk.LIZ;
        if (singleImageData.getSrcImageInfo().getImageRatio() < 0.75f) {
            videoPublishEditModel.creativeModel.imageEditModel.isAutoCropTo3v4 = false;
            EditImageInfo editImageInfo2 = singleImageData.getEditImageInfo();
            editImageInfo2.setRatio(0.75f);
            editImageInfo2.setRatioMode(1);
            if (C1441980ncy.LIZ()) {
                singleImageData.getEditImageInfo().setNeedCompileNle(true);
            }
        }
        return singleImageData;
    }
}
