package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570640MZq {
    public static final C570640MZq LIZ = new C570640MZq();

    public static final void LIZ(C0LAB c0lab, VideoPublishEditModel videoPublishEditModel) {
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0lab.LJ("draft_land_page", videoPublishEditModel.getDraftLandPage());
        c0lab.LIZ(videoPublishEditModel.isFromCrash() ? 1 : 0, "is_restore_crash");
        c0lab.LIZ(videoPublishEditModel.isPostDraftPrompt() ? 1 : 0, "is_post_draft_prompt");
    }
}
