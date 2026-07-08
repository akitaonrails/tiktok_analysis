package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0XpZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860670XpZ {
    public static final C860670XpZ LIZ = new C860670XpZ();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("group_id", C1443560nfW.LJIIIIZZ());
        if (videoPublishEditModel.getDraftId() != 0) {
            c0lab.LIZ(videoPublishEditModel.getDraftId(), "draft_id");
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("click_text_entrance", c0lab.LIZ);
    }
}
