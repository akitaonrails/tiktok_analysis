package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EIM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EIM {
    public static final C0EIM LIZ = new C0EIM();

    public static C0LAB LIZ(C0E48 c0e48, VideoPublishEditModel videoPublishEditModel, EnumC361800EGk enumC361800EGk) {
        Pair<Integer, Integer> pair;
        String str;
        String str2;
        if (c0e48 != null) {
            pair = u4.LJJII(C350870DpF.LJI(c0e48), false);
        } else {
            pair = new Pair<>(0, 0);
        }
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LIZ(videoPublishEditModel.getPreviewInfo().getPreviewVideoLength(), "creation_duration");
        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            c0lab.LJ("draft_way", "general_draft_list");
        }
        if (videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_from_create_template", str);
        c0lab.LJ("is_editor_pro", "1");
        if (enumC361800EGk != null) {
            if (enumC361800EGk == EnumC361800EGk.SOUND) {
                str2 = "sound";
            } else {
                str2 = "tts";
            }
            c0lab.LJ("editorpro_entrance", str2);
        }
        return c0lab;
    }
}
