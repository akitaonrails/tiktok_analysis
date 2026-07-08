package X;

import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;

/* JADX INFO: renamed from: X.0ML8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0ML8 {
    public static final C0ML8 LIZ = new C0ML8();

    public static void LIZ(String str, CreativeModel creativeModel) {
        String followupSquareActionPosition;
        String strIsFromFollowupSquareOriginalVideo;
        String followupSquareRecommendType;
        C0LAB c0lab = new C0LAB();
        C0ML7.LIZ.getClass();
        C0ML7.LIZ(creativeModel, c0lab);
        C0ML9.LIZIZ(creativeModel, c0lab);
        ShootExtraData shootExtraData = creativeModel.creativeFlowData.getShootExtraData();
        String followupSquareRecommendReason = null;
        if (shootExtraData != null) {
            followupSquareActionPosition = shootExtraData.getFollowupSquareActionPosition();
        } else {
            followupSquareActionPosition = null;
        }
        c0lab.LJ("followup_square_action_position", followupSquareActionPosition);
        ShootExtraData shootExtraData2 = creativeModel.creativeFlowData.getShootExtraData();
        if (shootExtraData2 != null) {
            strIsFromFollowupSquareOriginalVideo = shootExtraData2.isFromFollowupSquareOriginalVideo();
        } else {
            strIsFromFollowupSquareOriginalVideo = null;
        }
        c0lab.LJ("is_from_followup_square_original_video", strIsFromFollowupSquareOriginalVideo);
        ShootExtraData shootExtraData3 = creativeModel.creativeFlowData.getShootExtraData();
        if (shootExtraData3 != null) {
            followupSquareRecommendType = shootExtraData3.getFollowupSquareRecommendType();
        } else {
            followupSquareRecommendType = null;
        }
        c0lab.LJ("followup_square_recommend_type", followupSquareRecommendType);
        ShootExtraData shootExtraData4 = creativeModel.creativeFlowData.getShootExtraData();
        if (shootExtraData4 != null) {
            followupSquareRecommendReason = shootExtraData4.getFollowupSquareRecommendReason();
        }
        c0lab.LJ("followup_square_recommend_reason", followupSquareRecommendReason);
        c0lab.LJ("from_group_id", C1443560nfW.LJIIIIZZ());
        c0lab.LJ("enter_from", str);
        c0lab.LJ("album_from_scene", "end_of_year_page");
        c0lab.LJ("album_from_page", "end_of_year_page");
        C20684815ws.LJIILLIIL("click_upload_entrance", c0lab.LIZ);
    }

    public static void LIZIZ(String str, CreativeModel creativeModel) {
        C0LAB c0lab = new C0LAB();
        C0ML7.LIZ.getClass();
        C0ML7.LIZ(creativeModel, c0lab);
        C0ML9.LIZ(creativeModel, c0lab);
        CelebrationData celebrationData = creativeModel.celebrationData;
        if (celebrationData != null) {
            boolean hasPoster = celebrationData.getHasPoster();
            c0lab.LIZ(celebrationData.getContentCnt(), "content_cnt");
            c0lab.LIZ(celebrationData.getStoryCnt(), "story_cnt");
            c0lab.LIZ(celebrationData.getPostCnt(), "post_cnt");
            c0lab.LIZ(hasPoster ? 1 : 0, "auto_cnt");
            c0lab.LJ("has_poster", C0ML9.LJ(hasPoster));
            c0lab.LIZ(celebrationData.getLocalCnt(), "local_cnt");
        }
        c0lab.LJ("click_method", str);
        C20684815ws.LJIILLIIL("on_this_day_select_more", c0lab.LIZ);
    }
}
