package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402600mbS {
    public static final C1402600mbS LIZ = new C1402600mbS();

    public static void LIZIZ(String str, String str2) {
        Boolean boolValueOf;
        C1403560md0 c1403560md0LIZIZ = C1403570md1.LIZIZ();
        c1403560md0LIZIZ.LJ("enter_from", "video_post_page");
        c1403560md0LIZIZ.LJ("is_from_save_draft_popup", "1");
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null) {
            boolValueOf = Boolean.valueOf(currentUser.LJIIJJI());
        } else {
            boolValueOf = null;
        }
        c1403560md0LIZIZ.LIZLLL(boolValueOf, "is_private_account");
        c1403560md0LIZIZ.LJ("from_status", str);
        c1403560md0LIZIZ.LJ("to_status", str2);
        C20684815ws.LJIILLIIL("select_privacy_setting", c1403560md0LIZIZ.LIZ);
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, Long l, Long l2) {
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        Pair pair = new Pair(pairLJIIJJI.getSecond(), pairLJIIJJI.getFirst());
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        C1403560md0 c1403560md0LIZIZ = C1403570md1.LIZIZ();
        c1403560md0LIZIZ.LJ("creation_id", videoPublishEditModel.getCreationId());
        c1403560md0LIZIZ.LJ("enter_from", "video_post_page");
        c1403560md0LIZIZ.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c1403560md0LIZIZ.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c1403560md0LIZIZ.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c1403560md0LIZIZ.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c1403560md0LIZIZ.LIZ(iIntValue2, "video_cnt");
        c1403560md0LIZIZ.LIZ(iIntValue, "pic_cnt");
        c1403560md0LIZIZ.LIZ(videoPublishEditModel.creativeModel.imageEditModel.livePicCnt, "live_pic_cnt");
        c1403560md0LIZIZ.LIZ(C580270MpN.LJIIIZ(videoPublishEditModel), "live_photo_cnt");
        if (l != null) {
            c1403560md0LIZIZ.LIZIZ(l.longValue(), "current_draft_size");
        }
        if (l2 != null) {
            c1403560md0LIZIZ.LIZIZ(l2.longValue(), "draft_size");
        }
        C20684815ws.LJIILLIIL("click_save_draft_entrance", c1403560md0LIZIZ.LIZ);
    }
}
