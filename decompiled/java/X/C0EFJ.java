package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EFJ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFJ {
    public static final C0EFJ LIZ = new C0EFJ();

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        Pair<Integer, Integer> pair;
        String creationId;
        String str;
        String str2;
        String enterFrom;
        EditPreviewInfo previewInfo;
        int previewVideoLength = 0;
        if (c0e48 != null) {
            pair = u4.LJJII(C350870DpF.LJI(c0e48), false);
        } else {
            pair = new Pair<>(0, 0);
        }
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        String str3 = "";
        if (videoPublishEditModel == null || (creationId = videoPublishEditModel.getCreationId()) == null) {
            creationId = "";
        }
        c0lab.LJ("creation_id", creationId);
        if (videoPublishEditModel == null || (str = videoPublishEditModel.mShootWay) == null) {
            str = "";
        }
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        if (videoPublishEditModel != null && (previewInfo = videoPublishEditModel.getPreviewInfo()) != null) {
            previewVideoLength = previewInfo.getPreviewVideoLength();
        }
        c0lab.LIZ(previewVideoLength, "creation_duration");
        if (videoPublishEditModel != null && (enterFrom = videoPublishEditModel.getEnterFrom()) != null) {
            str3 = enterFrom;
        }
        c0lab.LJ("enter_from", str3);
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.mDraftToEditFrom == 0) {
                c0lab.LJ("draft_way", "general_draft_list");
            }
            if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_from_create_template", str2);
        }
        c0lab.LJ("is_editor_pro", "1");
        return c0lab;
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLIZ = LIZ(videoPublishEditModel, c0e48);
        c0labLIZ.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        C20684815ws.LJIILLIIL("edit_match_sound_status", c0labLIZ.LIZ);
    }
}
