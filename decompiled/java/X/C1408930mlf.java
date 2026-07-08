package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0mlf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408930mlf {
    public static final C1408930mlf LIZ = new C1408930mlf();

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.creativeModel.creativeInfo.getCreationId());
        c0lab.LJ("shoot_way", "story");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_enter_from", C1428470nHB.LJJIIJ(videoPublishEditModel, true));
        c0lab.LJ("shoot_enter_method", videoPublishEditModel.getShootEnterMethod());
        return c0lab;
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C0LAB c0labLIZ;
        if (videoPublishEditModel == null) {
            return;
        }
        if (str == null) {
            c0labLIZ = LIZ(videoPublishEditModel);
        } else {
            c0labLIZ = LIZ(videoPublishEditModel);
            c0labLIZ.LJ("message_button_show_way", str);
        }
        C2341909Fp.LIZ(str2, c0labLIZ.LIZ);
    }
}
