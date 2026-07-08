package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0XiL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856190XiL {
    public static final C856190XiL LIZ = new C856190XiL();

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel) {
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        C580270MpN.LJFF(videoPublishEditModel, c0lab);
        return c0lab;
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis() - videoPublishEditModel.creativeModel.transientPostPageModel.LJ;
        C0LAB c0labLIZ = LIZ(videoPublishEditModel);
        c0labLIZ.LIZ(i, "text_length");
        c0labLIZ.LIZIZ(jCurrentTimeMillis, "publish_stay_duration");
        C20684815ws.LJIILLIIL("post_page_stay_time", c0labLIZ.LIZ);
    }

    public static void LIZJ(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        C0LAB c0labLIZ = LIZ(videoPublishEditModel);
        c0labLIZ.LJ("select_style", str);
        c0labLIZ.LIZ(i, "text_length");
        C20684815ws.LJIILLIIL("click_ai_rewrite_style", c0labLIZ.LIZ);
    }

    public static void LIZIZ(int i, VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C0LAB c0labLIZ = LIZ(videoPublishEditModel);
        c0labLIZ.LJ("click_result", str);
        c0labLIZ.LIZ(i, "text_length");
        c0labLIZ.LIZ(i, "cur_text_length");
        c0labLIZ.LJ("trigger_type", str2);
        C20684815ws.LJIILLIIL("click_ai_rewrite", c0labLIZ.LIZ);
    }
}
