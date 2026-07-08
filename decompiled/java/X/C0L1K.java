package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.EditorProRecordVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0L1K, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L1K {
    public static final C0L1K LIZ = new C0L1K();

    public static Bundle LIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("shoot_way", videoPublishEditModel.mShootWay, bundle);
        C786410Ut5.LJJJI("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel), bundle);
        C786410Ut5.LJJJI("content_type", C1428470nHB.LJIILL(videoPublishEditModel), bundle);
        C786410Ut5.LJJJI("enter_from", "video_edit_page", bundle);
        C537520L6g.LJFF(bundle, videoPublishEditModel.getCreativeInfo());
        bundle.putInt("key_choose_scene", 54);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("key_support_flag", 1);
        if (z) {
            EditorProRecordVideoContext editorProRecordVideoContext = new EditorProRecordVideoContext(videoPublishEditModel.getCreativeInfo());
            editorProRecordVideoContext.creativeModel = CreativeModel.LIZIZ(videoPublishEditModel.creativeModel, null, null, null, null, -1, -1, -1, 2097151);
            editorProRecordVideoContext.shootWay = videoPublishEditModel.mShootWay;
            C786410Ut5.LJJIJL(bundle, "key_album_tab_editor_record_info", editorProRecordVideoContext);
            bundle.putBoolean("key_show_editor_pro_aigc_photo_entrance", true);
        }
        return bundle;
    }
}
