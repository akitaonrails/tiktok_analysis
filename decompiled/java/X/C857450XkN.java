package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0XkN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857450XkN {
    public static final C857450XkN LIZ = new C857450XkN();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, boolean z, int i, String str, String str2) {
        String str3;
        int size;
        List<SingleImageData> imageList;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        if (z) {
            str3 = "manual_click";
        } else {
            str3 = "auto";
        }
        c0lab.LJ("enter_method", str3);
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c0lab.LIZ(size, "pic_cnt");
        c0lab.LIZ(i + 1, "pic_location");
        c0lab.LJ("enter_tab", str2);
        C2341909Fp.LIZ("camera_multi_photo_swipe", c0lab.LIZ);
    }
}
