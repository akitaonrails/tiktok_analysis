package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0L1I, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L1I {
    public static final C0L1I LIZ = new C0L1I();

    public static void LIZ(Activity activity, VideoPublishEditModel videoPublishEditModel, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_choose_scene", 48);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        if (z) {
            bundle.putInt("key_support_flag", 9);
        } else {
            bundle.putInt("key_support_flag", 1);
        }
        C786410Ut5.LJJJI("shoot_way", videoPublishEditModel.mShootWay, bundle);
        C786410Ut5.LJJJI("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel), bundle);
        C786410Ut5.LJJJI("content_type", C1428470nHB.LJIILL(videoPublishEditModel), bundle);
        C786410Ut5.LJJJI("enter_from", "video_edit_page", bundle);
        C537520L6g.LJFF(bundle, videoPublishEditModel.getCreativeInfo());
        C1660680tJi.LIZ().LJIIIZ(activity, bundle, 10011, 10011);
    }
}
