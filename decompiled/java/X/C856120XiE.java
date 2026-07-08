package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0XiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856120XiE {
    public static final C856120XiE LIZ = new C856120XiE();

    public static final C0LAB LIZ(VideoPublishEditModel videoPublishEditModel) {
        String creationId;
        C0LAB c0lab = new C0LAB();
        String str = "mModel is null";
        if (videoPublishEditModel == null) {
            creationId = "mModel is null";
        } else {
            creationId = videoPublishEditModel.getCreationId();
        }
        c0lab.LJ("creation_id", creationId);
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.mShootWay;
        }
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("enter_from", "video_post_page");
        return c0lab;
    }
}
