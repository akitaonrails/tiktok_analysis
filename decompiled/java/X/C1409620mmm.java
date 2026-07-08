package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0mmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1409620mmm {
    public static final C1409620mmm LIZ = new C1409620mmm();

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel) {
        int size;
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LIZ(size, "pic_cnt");
        c0lab.LIZ(size, "image_cnt");
        return c0lab;
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel, EnumC1409650mmp enumC1409650mmp, EnumC1409600mmk enumC1409600mmk) {
        String value;
        String value2;
        LIZ.getClass();
        C0LAB c0labLIZ = LIZ(videoPublishEditModel);
        String str = "";
        if (enumC1409650mmp == null || (value = enumC1409650mmp.getValue()) == null) {
            value = "";
        }
        c0labLIZ.LJ("from_previous_entrance", value);
        if (enumC1409600mmk != null && (value2 = enumC1409600mmk.getValue()) != null) {
            str = value2;
        }
        c0labLIZ.LJ("idea_type", str);
        C20684815ws.LJIILLIIL("click_text_inspiration_ideas_entrance", c0labLIZ.LIZ);
    }

    public static final void LJ(VideoPublishEditModel videoPublishEditModel, EnumC1409650mmp enumC1409650mmp, EnumC1409600mmk enumC1409600mmk) {
        String value;
        String value2;
        LIZ.getClass();
        C0LAB c0labLIZ = LIZ(videoPublishEditModel);
        String str = "";
        if (enumC1409650mmp == null || (value = enumC1409650mmp.getValue()) == null) {
            value = "";
        }
        c0labLIZ.LJ("from_previous_entrance", value);
        if (enumC1409600mmk != null && (value2 = enumC1409600mmk.getValue()) != null) {
            str = value2;
        }
        c0labLIZ.LJ("idea_type", str);
        C20684815ws.LJIILLIIL("show_text_inspiration_ideas_entrance", c0labLIZ.LIZ);
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, EnumC1409650mmp enumC1409650mmp, EnumC1409600mmk enumC1409600mmk, Integer num, int i) {
        int iIntValue;
        LIZ.getClass();
        C0LAB c0labLIZ = LIZ(videoPublishEditModel);
        c0labLIZ.LJ("from_previous_entrance", enumC1409650mmp.getValue());
        c0labLIZ.LJ("idea_type", enumC1409600mmk.getValue());
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c0labLIZ.LIZ(iIntValue, "idea_order");
        c0labLIZ.LJ("inspiration_language", C0CHQ.LIZ().getAppLanguage());
        c0labLIZ.LIZ(i, "inspiration_length");
        C20684815ws.LJIILLIIL("click_text_inspiration_ideas", c0labLIZ.LIZ);
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, EnumC1409650mmp enumC1409650mmp, EnumC1409600mmk enumC1409600mmk, String str, String str2) {
        LIZ.getClass();
        C0LAB c0labLIZ = LIZ(videoPublishEditModel);
        c0labLIZ.LJ("from_previous_entrance", enumC1409650mmp.getValue());
        c0labLIZ.LJ("idea_type", enumC1409600mmk.getValue());
        c0labLIZ.LJ("close_method", str);
        c0labLIZ.LJ("panel_type", str2);
        C20684815ws.LJIILLIIL("close_text_inspiration_ideas", c0labLIZ.LIZ);
    }

    public static final void LJFF(VideoPublishEditModel videoPublishEditModel, EnumC1409650mmp enumC1409650mmp, EnumC1409600mmk enumC1409600mmk, boolean z, long j, List<Integer> list) {
        String value;
        String value2;
        String str;
        LIZ.getClass();
        C0LAB c0labLIZ = LIZ(videoPublishEditModel);
        if (enumC1409650mmp == null || (value = enumC1409650mmp.getValue()) == null) {
            value = EnumC1409650mmp.EDIT_BOTTOM.getValue();
        }
        c0labLIZ.LJ("from_previous_entrance", value);
        if (enumC1409600mmk == null || (value2 = enumC1409600mmk.getValue()) == null) {
            value2 = "";
        }
        c0labLIZ.LJ("idea_type", value2);
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        c0labLIZ.LJ("action_result", str);
        c0labLIZ.LIZIZ(j, "generate_duration");
        c0labLIZ.LJ("inspiration_language", C0CHQ.LIZ().getAppLanguage());
        c0labLIZ.LIZLLL(list, "inspiration_length_info");
        C20684815ws.LJIILLIIL("ttinter_text_inspiration_ideas_generate_result", c0labLIZ.LIZ);
    }
}
