package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411670mq5 {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        List<SingleImageData> imageList;
        C0HWW c0hww = C0HWW.LIZ;
        boolean zLIZ = C1411680mq6.LIZ(videoPublishEditModel);
        c0hww.getClass();
        c0lab.LIZ(zLIZ ? 1 : 0, "has_collage");
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        int i = 0;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().getCollageInfo() != null) {
                    i++;
                }
            }
        }
        c0lab.LIZ(i, "collage_image_cnt");
    }
}
