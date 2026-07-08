package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0L52, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L52 {
    public static final C0L52 LIZ = new C0L52();

    public static C2344009Gk LIZ(ShortVideoContext shortVideoContext) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "video_shoot_page");
        c2344009Gk.LJIIIIZZ("content_type", "multi_photo");
        c2344009Gk.LJIIIIZZ("content_source", shortVideoContext.LJ().getContentSource());
        c2344009Gk.LJIIIIZZ("shoot_way", shortVideoContext.shootWay);
        c2344009Gk.LJIIIIZZ("creation_id", shortVideoContext.getCreationId());
        c2344009Gk.LIZJ(1, "is_text_mode");
        c2344009Gk.LIZJ(1, "is_text_trans_pic");
        return c2344009Gk;
    }
}
