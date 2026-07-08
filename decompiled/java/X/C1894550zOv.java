package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.Animation;
import com.bytedance.touchpoint.api.model.BottomTabBubble;
import com.bytedance.touchpoint.api.model.CoinBottomTab;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.touchpoint.api.model.ECReferralFeedPicture;
import com.bytedance.touchpoint.api.model.FeedButton;
import com.bytedance.touchpoint.api.model.FeedToast;
import com.bytedance.touchpoint.api.model.IncentiveShareCard;
import com.bytedance.touchpoint.api.model.IncentiveShareTextLink;
import com.bytedance.touchpoint.api.model.Picture;
import com.bytedance.touchpoint.api.model.ProfileActivityButton;
import com.bytedance.touchpoint.api.model.ProfileActivityIcon;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.SharePanelInfo;
import com.bytedance.touchpoint.api.model.Title;
import com.bytedance.touchpoint.api.model.Video;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0zOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894550zOv {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1893670zNV c1893670zNV) {
        Integer numValueOf;
        IncentiveShareTextLink incentiveShareTextLink;
        String str;
        String str2;
        FeedToast feedToast;
        Title title;
        String str3;
        IncentiveShareCard incentiveShareCard;
        String str4;
        FeedButton feedButton;
        String str5;
        BottomTabBubble bottomTabBubble;
        Title title2;
        String str6;
        String str7;
        SharePanelInfo sharePanelInfo;
        String str8;
        ReferralFeedBanner referralFeedBanner;
        List<Picture> list;
        Picture picture;
        String str9;
        List<Picture> list2;
        Picture picture2;
        Animation animation;
        String str10;
        List<Picture> list3;
        Picture picture3;
        Animation animation2;
        String str11;
        List<ECReferralFeedPicture> list4;
        ECReferralFeedPicture eCReferralFeedPicture;
        String str12;
        List<ECReferralFeedPicture> list5;
        ECReferralFeedPicture eCReferralFeedPicture2;
        String str13;
        List<Video> list6;
        Video video;
        String str14;
        List<Video> list7;
        Video video2;
        String str15;
        ProfileActivityIcon profileActivityIcon;
        String str16;
        List<ProfileActivityButton> list8;
        List<ProfileActivityButton> list9;
        ProfileActivityButton profileActivityButton;
        String str17;
        List<ProfileActivityButton> list10;
        ProfileActivityButton profileActivityButton2;
        String str18;
        CoinBottomTab coinBottomTab;
        String str19;
        String str20;
        Title title3;
        String str21;
        DynamicDialog dynamicDialog;
        String str22;
        String str23;
        if (c1893670zNV != null && (numValueOf = Integer.valueOf(c1893670zNV.LIZ)) != null) {
            if (numValueOf.intValue() == 4) {
                if (c1893670zNV instanceof DynamicDialog) {
                    dynamicDialog = (DynamicDialog) c1893670zNV;
                    if (dynamicDialog != null && (str22 = dynamicDialog.jsSource) != null && str22.length() != 0 && dynamicDialog != null && (str23 = dynamicDialog.name) != null && str23.length() != 0) {
                        return;
                    }
                } else {
                    dynamicDialog = null;
                }
                C1893680zNW.LJIIJ(C1893680zNW.LIZ, dynamicDialog);
                return;
            }
            if (numValueOf.intValue() == 29) {
                if (c1893670zNV instanceof CoinBottomTab) {
                    coinBottomTab = (CoinBottomTab) c1893670zNV;
                    if (coinBottomTab != null && (str19 = coinBottomTab.iconURL) != null && str19.length() != 0 && coinBottomTab != null && (str20 = coinBottomTab.jumpLink) != null && str20.length() != 0 && coinBottomTab != null && (title3 = coinBottomTab.title) != null && (str21 = title3.text) != null && str21.length() != 0) {
                        return;
                    }
                } else {
                    coinBottomTab = null;
                }
                C1893680zNW.LJIIJ(C1893680zNW.LIZ, coinBottomTab);
                return;
            }
            if (numValueOf.intValue() == 3) {
                if (c1893670zNV instanceof ProfileActivityIcon) {
                    profileActivityIcon = (ProfileActivityIcon) c1893670zNV;
                    if (profileActivityIcon != null && (str16 = profileActivityIcon.iconUrl) != null && str16.length() != 0 && profileActivityIcon != null && (list8 = profileActivityIcon.profileActivityButtons) != null && !list8.isEmpty() && profileActivityIcon != null && (list9 = profileActivityIcon.profileActivityButtons) != null && (profileActivityButton = (ProfileActivityButton) ListProtector.get(list9, 0)) != null && (str17 = profileActivityButton.icon) != null && str17.length() != 0 && profileActivityIcon != null && (list10 = profileActivityIcon.profileActivityButtons) != null && (profileActivityButton2 = (ProfileActivityButton) ListProtector.get(list10, 0)) != null && (str18 = profileActivityButton2.jumpLink) != null && str18.length() != 0) {
                        return;
                    }
                } else {
                    profileActivityIcon = null;
                }
                C1893680zNW.LJIIJ(C1893680zNW.LIZ, profileActivityIcon);
                return;
            }
            if (numValueOf.intValue() == 8) {
                if (!(c1893670zNV instanceof ReferralFeedBanner) || (referralFeedBanner = (ReferralFeedBanner) c1893670zNV) == null) {
                    return;
                }
                if (referralFeedBanner.bannerType != 1 && referralFeedBanner.bannerType != 8) {
                    if (referralFeedBanner.bannerType == 2) {
                        List<Video> list11 = referralFeedBanner.videos;
                        if (list11 != null && !list11.isEmpty() && (list6 = referralFeedBanner.videos) != null && (video = (Video) ListProtector.get(list6, 0)) != null && (str14 = video.videoUrl) != null && str14.length() != 0 && (list7 = referralFeedBanner.videos) != null && (video2 = (Video) ListProtector.get(list7, 0)) != null && (str15 = video2.videoCover) != null && str15.length() != 0) {
                            return;
                        }
                        C1893680zNW.LJIIJ(C1893680zNW.LIZ, referralFeedBanner);
                        return;
                    }
                    if (referralFeedBanner.bannerType == 9) {
                        List<ECReferralFeedPicture> list12 = referralFeedBanner.ecReferralFeedPictures;
                        if (list12 != null && !list12.isEmpty() && (list4 = referralFeedBanner.ecReferralFeedPictures) != null && (eCReferralFeedPicture = (ECReferralFeedPicture) ListProtector.get(list4, 0)) != null && (str12 = eCReferralFeedPicture.backgroundImage) != null && str12.length() != 0 && (list5 = referralFeedBanner.ecReferralFeedPictures) != null && (eCReferralFeedPicture2 = (ECReferralFeedPicture) ListProtector.get(list5, 0)) != null && (str13 = eCReferralFeedPicture2.coverImage) != null && str13.length() != 0) {
                            return;
                        }
                        C1893680zNW.LJIIJ(C1893680zNW.LIZ, referralFeedBanner);
                        return;
                    }
                    if (referralFeedBanner.bannerType != 100) {
                        return;
                    }
                    List<? extends Map<String, Object>> list13 = referralFeedBanner.lynxFeedBannerPicture;
                    if (list13 != null && list13.size() == 1) {
                        return;
                    }
                    C1893680zNW.LJIIJ(C1893680zNW.LIZ, referralFeedBanner);
                    return;
                }
                List<Picture> list14 = referralFeedBanner.pictures;
                if (list14 != null && !list14.isEmpty() && (list = referralFeedBanner.pictures) != null && (picture = (Picture) ListProtector.get(list, 0)) != null && (str9 = picture.bgImage) != null && str9.length() != 0 && (list2 = referralFeedBanner.pictures) != null && (picture2 = (Picture) ListProtector.get(list2, 0)) != null && (animation = picture2.animation) != null && (str10 = animation.lottie) != null && str10.length() != 0 && (list3 = referralFeedBanner.pictures) != null && (picture3 = (Picture) ListProtector.get(list3, 0)) != null && (animation2 = picture3.animation) != null && (str11 = animation2.lottieMd5) != null && str11.length() != 0) {
                    return;
                }
                C1893680zNW.LJIIJ(C1893680zNW.LIZ, referralFeedBanner);
                return;
            }
            if (numValueOf.intValue() == 33) {
                if (c1893670zNV instanceof SharePanelInfo) {
                    sharePanelInfo = (SharePanelInfo) c1893670zNV;
                    if (sharePanelInfo != null && (str8 = sharePanelInfo.jumpLink) != null && str8.length() != 0) {
                        return;
                    }
                } else {
                    sharePanelInfo = null;
                }
                C1893680zNW.LJIIJ(C1893680zNW.LIZ, sharePanelInfo);
                return;
            }
            if (numValueOf.intValue() == 36) {
                if (c1893670zNV instanceof BottomTabBubble) {
                    bottomTabBubble = (BottomTabBubble) c1893670zNV;
                    if (bottomTabBubble != null && (title2 = bottomTabBubble.title) != null && (str6 = title2.text) != null && str6.length() != 0 && bottomTabBubble != null && (str7 = bottomTabBubble.jumpLink) != null && str7.length() != 0) {
                        return;
                    }
                } else {
                    bottomTabBubble = null;
                }
                C1893680zNW.LJIIJ(C1893680zNW.LIZ, bottomTabBubble);
                return;
            }
            if (numValueOf.intValue() == 37) {
                if (c1893670zNV instanceof IncentiveShareCard) {
                    incentiveShareCard = (IncentiveShareCard) c1893670zNV;
                    if (incentiveShareCard != null && (str4 = incentiveShareCard.notificationId) != null && str4.length() != 0 && incentiveShareCard != null && (feedButton = incentiveShareCard.detailButton) != null && (str5 = feedButton.jumpLink) != null && str5.length() != 0) {
                        return;
                    }
                } else {
                    incentiveShareCard = null;
                }
                C1893680zNW.LJIIJ(C1893680zNW.LIZ, incentiveShareCard);
                return;
            }
            if (numValueOf.intValue() == 38) {
                if (c1893670zNV instanceof FeedToast) {
                    feedToast = (FeedToast) c1893670zNV;
                    if (feedToast != null && (title = feedToast.title) != null && (str3 = title.text) != null && str3.length() != 0) {
                        return;
                    }
                } else {
                    feedToast = null;
                }
                C1893680zNW.LJIIJ(C1893680zNW.LIZ, feedToast);
                return;
            }
            if (numValueOf.intValue() != 40) {
                return;
            }
            if (c1893670zNV instanceof IncentiveShareTextLink) {
                incentiveShareTextLink = (IncentiveShareTextLink) c1893670zNV;
                if (incentiveShareTextLink != null && (str = incentiveShareTextLink.text) != null && str.length() != 0 && incentiveShareTextLink != null && (str2 = incentiveShareTextLink.jumpLink) != null && str2.length() != 0) {
                    return;
                }
            } else {
                incentiveShareTextLink = null;
            }
            C1893680zNW.LJIIJ(C1893680zNW.LIZ, incentiveShareTextLink);
        }
    }
}
