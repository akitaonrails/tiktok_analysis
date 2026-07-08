package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Xlk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858300Xlk {
    public static final void LIZ(EnumC1462160o9W enumC1462160o9W, VideoPublishEditModel videoPublishEditModel) {
        String str;
        switch (C1462150o9V.LIZ[enumC1462160o9W.ordinal()]) {
            case 1:
                str = "click_poll_on_sticker_panel";
                break;
            case 2:
                str = "click_custom_on_sticker_panel";
                break;
            case 3:
                str = "click_donation_on_sticker_panel";
                break;
            case 4:
                str = "click_hashtag_on_sticker_panel";
                break;
            case 5:
                str = "click_info_on_sticker_panel";
                break;
            case 6:
                str = "click_live_countdown_on_sticker_panel";
                break;
            case 7:
                str = "click_mention_on_sticker_panel";
                break;
            case 8:
                str = "click_article_sticker_entrance";
                break;
            default:
                throw new C1954807lC();
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("is_new_sticker_framework", CardStruct.IStatusCode.DEFAULT);
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }
}
