package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nLD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430970nLD {
    public final VideoPublishEditModel LIZ;
    public final List<String> LIZIZ = new ArrayList();

    public C1430970nLD(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        this.LIZ = videoPublishEditModel;
        if (videoPublishEditModel != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                this.LIZIZ.add(it2.next().getId());
            }
        }
    }

    public static void LIZ(SingleImageData singleImageData, SrcImageInfo srcImageInfo) {
        String path;
        ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
        if (synthesisData == null || (path = synthesisData.getPath()) == null || a0.LJJJIL(path)) {
            singleImageData.setSynthesisData(new ImageSynthesisResult(srcImageInfo.getPath(), srcImageInfo.getWidth(), srcImageInfo.getHeight(), null, null, null, null, null, null, 504, null));
        }
        SrcImageInfo srcImageInfo2 = singleImageData.getSrcImageInfo();
        singleImageData.setSrcImageInfo(srcImageInfo2.copy(srcImageInfo.getPath(), srcImageInfo.getHeight(), srcImageInfo.getWidth(), srcImageInfo.getAltText(), srcImageInfo2.remoteUri));
    }
}
