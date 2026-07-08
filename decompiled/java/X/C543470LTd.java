package X;

import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0LTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543470LTd {
    public static final C543470LTd LIZ = new C543470LTd();

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel) {
        int size;
        List<SingleImageData> imageList;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        C0CHQ.LIZ().getApplicationService().getClass();
        c0lab.LJ("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        c0lab.LJ("user_id", C0CHQ.LIZ().getAccountService().getCurrentUserID());
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c0lab.LIZ(size, "pic_cnt");
        return c0lab;
    }
}
