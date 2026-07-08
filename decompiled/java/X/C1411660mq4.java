package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0mq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411660mq4 {
    public static final C1411660mq4 LIZ = new C1411660mq4();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, EnumC1287340jbY enumC1287340jbY, EnumC1411640mq2 enumC1411640mq2, String str, long j, long j2, int i) {
        int size;
        List<SingleImageData> imageList;
        C0LAB c0lab = new C0LAB();
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c0lab.LIZ(size, "pic_cnt");
        c0lab.LIZ(enumC1287340jbY.getValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(enumC1411640mq2.getValue(), "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "upload_duration");
        c0lab.LIZIZ(j2, "generate_duration");
        c0lab.LIZIZ(j + j2, "total_duration");
        c0lab.LIZ(i, "text_length");
        C20684815ws.LJIILLIIL("tt_ai_description_performance", c0lab.LIZ);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, EnumC1287340jbY enumC1287340jbY, EnumC1411640mq2 enumC1411640mq2, String str, long j, long j2, int i, int i2, boolean z) {
        int size;
        List<SingleImageData> imageList;
        C0LAB c0lab = new C0LAB();
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c0lab.LIZ(size, "pic_cnt");
        c0lab.LIZ(1, "is_ai_rewrite");
        c0lab.LIZ(enumC1287340jbY.getValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(enumC1411640mq2.getValue(), "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "upload_duration");
        c0lab.LIZIZ(j2, "generate_duration");
        c0lab.LIZIZ(j + j2, "total_duration");
        c0lab.LIZ(i2, "promptType");
        c0lab.LIZ(i, "text_length");
        C0HWW.LIZ.getClass();
        c0lab.LIZ(z ? 1 : 0, "degrade");
        C20684815ws.LJIILLIIL("tt_ai_description_performance", c0lab.LIZ);
    }
}
