package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0Mb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571380Mb2 {
    public static final C571380Mb2 LIZ = new C571380Mb2();

    public static void LIZ(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        String str2;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        if (!C1428470nHB.LJJZZI(videoPublishEditModel)) {
            str2 = "photo";
        } else {
            str2 = "video";
        }
        c0lab.LJ("to_mode", str2);
        c0lab.LJ("mix_type", "photo");
        c0lab.LIZ(1, "is_multi_content");
        c0lab.LIZ(i, "pic_cnt");
        c0lab.LJ("click_method", str);
        C2341909Fp.LIZ("click_switch_btn", c0lab.LIZ);
    }
}
