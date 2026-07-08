package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0M4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562550M4n {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        if ((!C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) || !C0C64.LJIILLIIL().LJIIIZ(31744, "allow_post_single_photo_as_photo_mode_story", true, false) || !C562300M3o.LIZ()) && (!C1428470nHB.LJJZZI(videoPublishEditModel) || (imageAlbumData = videoPublishEditModel.getImageAlbumData()) == null || (imageList = imageAlbumData.getImageList()) == null || imageList.isEmpty() || !C0C64.LJIILLIIL().LJIIIZ(31744, "allow_post_album_as_story", true, false))) {
            return false;
        }
        return true;
    }
}
