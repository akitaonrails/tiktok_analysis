package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0LHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540390LHh {
    public static final C540390LHh LIZ = new C540390LHh();

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LIZ(z ? 1 : 0, "is_mix_edit_run");
        C20684815ws.LJIILLIIL("smart_cover_begin_monitor", c0lab.LIZ);
    }

    public static void LIZ(String str, boolean z, boolean z2, boolean z3) {
        int i;
        C0LAB c0lab = new C0LAB();
        c0lab.LJFF("hit_exp", C493401w4.LIZ());
        c0lab.LJ("creation_id", str);
        c0lab.LIZ(z ? 1 : 0, "path_from_new_list");
        if (z2) {
            if (z3) {
                i = 0;
            } else {
                i = 1;
            }
        } else {
            i = 2;
        }
        c0lab.LIZ(i, "path_file_state");
        C20684815ws.LJIILLIIL("cover_path_check", c0lab.LIZ);
    }
}
