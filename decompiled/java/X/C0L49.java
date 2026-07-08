package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0L49, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L49 {
    public static final HashMap<String, String> LIZ(VideoPublishEditModel videoPublishEditModel) {
        HashMap<String, String> map = new HashMap<>();
        map.put("creation_id", videoPublishEditModel.getCreationId());
        map.put("enter_from", "video_post_page");
        map.put("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        map.put("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        map.put("shoot_way", videoPublishEditModel.mShootWay);
        return map;
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        C20684815ws.LJIILLIIL("toggle_post_reuse_content_settings", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "video_post_page"), new Pair("creation_id", videoPublishEditModel.getCreationId()), new Pair("value", str)));
    }
}
