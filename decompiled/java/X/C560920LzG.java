package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0LzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C560920LzG {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2) {
        String str;
        if (z) {
            str = "click_draft";
        } else {
            str = "click_publish";
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - videoPublishEditModel.creativeModel.transientPostPageModel.LJIIIIZZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("shoot_way", videoPublishEditModel.mShootWay);
        c2344009Gk.LJIIIIZZ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c2344009Gk.LJIIIIZZ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModel.getCreationId());
        c2344009Gk.LJIIIIZZ("save_draft_scene", str);
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "save_draft_duration");
        c2344009Gk.LIZJ(!z2 ? 1 : 0, "save_draft_success");
        C20684815ws.LJIILLIIL("publish_page_finish", c2344009Gk.LIZ);
    }
}
