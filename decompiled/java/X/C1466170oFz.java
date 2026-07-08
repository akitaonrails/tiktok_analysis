package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oFz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1466170oFz {
    public final VideoPublishEditModel LIZ;

    public C1466170oFz(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    public final C0LAB LIZ(int i) {
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        if (videoPublishEditModel != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LJ("sticker_type", String.valueOf(i));
            C1403830mdR.LIZ(videoPublishEditModel, c0lab);
            return c0lab;
        }
        return new C0LAB();
    }

    public final void LIZLLL(Integer num) {
        if (num != null) {
            C20684815ws.LJIILLIIL("prop_duration_adjust", LIZ(num.intValue()).LIZ);
        }
    }

    public final void LJ(Integer num) {
        if (num != null) {
            C20684815ws.LJIILLIIL("prop_timeset_cancel", LIZ(num.intValue()).LIZ);
        }
    }

    public final void LJFF(Integer num) {
        if (num != null) {
            C20684815ws.LJIILLIIL("prop_timeset_confirm", LIZ(num.intValue()).LIZ);
        }
    }

    public final void LIZIZ(int i, int i2, DonationStickerModel donationStickerModel) {
        String currentUserID;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
            currentUserID = "";
        }
        C0LAB c0labLIZ = LIZ(EnumC1466150oFx.DONATION.getType());
        c0labLIZ.LIZ(i, "donation_sticker_type_before");
        c0labLIZ.LIZ(i2, "donation_sticker_type_after");
        c0labLIZ.LJ("fundraiser_id", donationStickerModel.getFundraiserId());
        c0labLIZ.LJ("ngo_name", donationStickerModel.getName());
        c0labLIZ.LJ("from_user_id", currentUserID);
        c0labLIZ.LJ("fundraiser_owner_id", donationStickerModel.getFundraiserOwnerId());
        C20684815ws.LJIILLIIL("donation_sticker_type_change_click", c0labLIZ.LIZ);
    }

    public final void LIZJ(StickerModel stickerModel, String str, int i) {
        int size;
        List<SingleImageData> imageList;
        String str2 = "info";
        Map<String, String> map = null;
        if (stickerModel != null) {
            switch (C1466160oFy.LIZ[stickerModel.getStickerType().ordinal()]) {
                case 2:
                    str2 = "hashtag";
                    break;
                case 3:
                    str2 = "mention";
                    break;
                case 4:
                    str2 = "text";
                    break;
                case 5:
                    str2 = "poll";
                    break;
                case 6:
                    str2 = "donation";
                    break;
                case 7:
                case 8:
                    str2 = "live";
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    str2 = "add_yours";
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    str2 = "music";
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    str2 = "poi";
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    str2 = "emoji_slider";
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    str2 = "interactive_emoji";
                    break;
                case 14:
                    str2 = "link";
                    break;
                case 15:
                    str2 = "article_link";
                    break;
            }
        }
        VideoPublishEditModel videoPublishEditModel = this.LIZ;
        if (videoPublishEditModel != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LIZ(videoPublishEditModel.getVideoCount(), "video_cnt");
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            c0lab.LIZ(size, "pic_cnt");
            c0lab.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
            c0lab.LJ("panel_sticker_type", str2);
            c0lab.LJ("delete_type", str);
            c0lab.LIZ(i, "is_editor_pro");
            map = c0lab.LIZ;
        }
        C20684815ws.LJIILLIIL("edit_sticker_delete", map);
    }
}
