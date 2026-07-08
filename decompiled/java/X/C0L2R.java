package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0L2R, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L2R {
    public static final C0L2R LIZ = new C0L2R();

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.creativeModel.creativeInfo.getCreationId());
        c0lab.LJ("shoot_way", "story");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_enter_from", C1428470nHB.LJJIIJ(videoPublishEditModel, true));
        c0lab.LJ("shoot_enter_method", videoPublishEditModel.getShootEnterMethod());
        return c0lab;
    }
}
