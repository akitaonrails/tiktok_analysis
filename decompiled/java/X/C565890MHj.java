package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0MHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565890MHj {
    public static List LIZ(VideoPublishEditModel videoPublishEditModel) {
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        ArrayList<String> arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (C1416310mxZ.LJJJJJ(videoPublishEditModel)) {
            CameraLayoutModel cameraLayoutModel = videoPublishEditModel.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel != null && (arrayList = cameraLayoutModel.originFilePaths) != null) {
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C565900MHk(it2.next(), 0L));
                }
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel != null && (imageAlbumData = creativeModel.imageAlbumModel) != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it3 = imageList.iterator();
            while (it3.hasNext()) {
                SrcImageInfo srcImageInfo = it3.next().getSrcImageInfo();
                if (srcImageInfo != null) {
                    arrayList2.add(new C565900MHk(srcImageInfo.getPath(), 0L));
                }
            }
        }
        if (arrayList2.isEmpty() && (previewInfo = videoPublishEditModel.getPreviewInfo()) != null && (videoList = previewInfo.getVideoList()) != null) {
            for (EditVideoSegment editVideoSegment : videoList) {
                arrayList2.add(new C565900MHk(editVideoSegment.getVideoPath(), editVideoSegment.getVideoFileInfo().getDuration()));
            }
        }
        return arrayList2;
    }
}
