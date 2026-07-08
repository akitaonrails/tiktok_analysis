package com.bytedance.android.live.base.model.user;

import X.C09CT;
import X.InterfaceC2262081DgM;
import X.InterfaceC2262101DgO;
import X.InterfaceC2262111DgP;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.android.livesdk.model.ActivityRewardInfo;
import com.bytedance.android.livesdk.model.AnchorInfo;
import com.bytedance.android.livesdk.model.AnchorLevel;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.Author;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.model.FraternityInfo;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.NobleLevelInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.UserHonor;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import webcast.data.SubSplitStatus;

/* JADX INFO: loaded from: classes36.dex */
public class User implements InterfaceC2262081DgM {
    public static boolean sShowSubEntranceGoLive;
    public static boolean sSubPermission;
    public static SubSplitStatus subSplitStatus;

    @C09CT("allow_find_by_contacts")
    public boolean allowFindByContacts;

    @C09CT("allow_others_download_video")
    public boolean allowOthersDownloadVideo;

    @C09CT("allow_others_download_when_sharing_video")
    public boolean allowOthersDownloadWhenSharingVideo;

    @C09CT("allow_share_show_profile")
    public boolean allowShareShowProfile;

    @C09CT("allow_show_in_gossip")
    public boolean allowShowInGossip;

    @C09CT("allow_show_my_action")
    public boolean allowShowMyAction;

    @C09CT("allow_strange_comment")
    public boolean allowStrangeComment;

    @C09CT("allow_unfollower_comment")
    public boolean allowUnfollowerComment;

    @C09CT("allow_use_linkmic")
    public boolean allowUseLinkmic;

    @C09CT("anchor_info")
    public AnchorInfo anchorInfo;

    @C09CT("webcast_anchor_level")
    public AnchorLevel anchorLevel;

    @C09CT("authentication_info")
    public AuthenticationInfo authenticationInfo;

    @C09CT("author_stats")
    public Author authorInfo;

    @C09CT("avatar_border")
    public ImageModel avatarBorder;

    @C09CT("avatar_jpg")
    public ImageModel avatarJpg;

    @C09CT("avatar_large")
    public ImageModel avatarLarge;

    @C09CT("avatar_medium")
    public ImageModel avatarMedium;

    @C09CT("avatar_thumb")
    public ImageModel avatarThumb;

    @C09CT("badge_list")
    public List<BadgeStruct> badgeList;

    @C09CT("block_status")
    public int blockStatus;

    @C09CT("border")
    public BorderInfo border;

    @C09CT("border_list")
    public List<BorderInfo> borders;

    @C09CT("combo_badge_info")
    public ComboBadgeInfo comboBadgeInfo;

    @C09CT("comment_restrict")
    public int commentRestrict;

    @C09CT("commerce_webcast_config_ids")
    public List<Long> commerceWebcastConfigIds;

    @C09CT("create_time")
    public long createTime;

    @C09CT("disable_ichat")
    public int disableIchat;

    @C09CT("ecommerce_entrance")
    public EcommerceEntrance ecommerceEntrance;

    @C09CT("with_car_management_permission")
    public boolean enableCarManagementPermission;

    @C09CT("enable_ichat_img")
    public long enableIchatImg;

    @C09CT("with_commerce_permission")
    public boolean enableShowCommerceSale;

    @C09CT("enigma_info")
    public EnigmaInfo enigmaInfo;

    @C09CT("exp")
    public int exp;

    @C09CT("ticket_count")
    public long fanTicketCount;

    @C09CT("fans_club")
    public FansClubMember fansClub;

    @C09CT("fans_club_info")
    public FansClubInfo fansClubInfo;

    @C09CT("fold_stranger_chat")
    public boolean foldStrangerChat;

    @C09CT("follow_info")
    public FollowInfo followInfo;
    public FraternityInfo fraternityInfo;

    @C09CT("ichat_restrict_type")
    public int ichatRestrictType;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("is_anchor_marked")
    public boolean isAnchorMarked;

    @C09CT("is_block")
    public boolean isBlock;

    @C09CT("is_follower")
    public boolean isFollower;

    @C09CT("is_following")
    public boolean isFollowing;

    @C09CT("is_subscribe")
    public boolean isSubscribe;

    @C09CT("verified")
    public boolean isVerified;

    @C09CT("link_mic_stats")
    public int linkMicStats;
    public String logPb;
    public String mAvatarLargeStr;
    public String mAvatarMediumStr;
    public String mAvatarThumbStr;

    @C09CT("medal")
    public ImageModel medal;

    @C09CT("media_badge_image_list")
    public List<ImageModel> mediaBadgeImageList;

    @C09CT("mint_type_label")
    public List<Long> mintTypeLabel;

    @C09CT("modify_time")
    public long modifyTime;

    @C09CT("need_profile_guide")
    public boolean needProfileGuide;

    @C09CT("new_real_time_icons")
    public List<ImageModel> newUserBadges;
    public NobleLevelInfo nobleLevelInfo;

    @C09CT("own_room")
    public OwnRoom ownRoom;

    @C09CT("pay_score")
    public long payScore;

    @C09CT("deprecated21")
    public long payScores;

    @C09CT("personal_card")
    public ImageModel personalCard;

    @C09CT("push_comment_status")
    public boolean pushCommentStatus;

    @C09CT("push_digg")
    public boolean pushDigg;

    @C09CT("push_follow")
    public boolean pushFollow;

    @C09CT("push_friend_action")
    public boolean pushFriendAction;

    @C09CT("push_ichat")
    public boolean pushIchat;

    @C09CT("push_status")
    public boolean pushStatus;

    @C09CT("push_video_post")
    public boolean pushVideoPost;

    @C09CT("push_video_recommend")
    public boolean pushVideoRecommend;
    public String requestId;

    @C09CT("activity_reward")
    public ActivityRewardInfo rewardInfo;

    @C09CT("secret")
    public int secret;
    public boolean shareLinkReceiver;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("subscribe_info")
    public SubscribeInfo subscribeInfo;

    @C09CT("top_fans")
    public List<User> topFans;

    @C09CT("top_vip_no")
    public int topVipNo;

    @C09CT("upcoming_event_list")
    public List<LiveEventInfo> upcomingEventList;

    @C09CT("user_attr")
    public UserAttr userAttr;

    @C09CT("real_time_icons")
    public List<ImageModel> userBadges;

    @C09CT("pay_grade")
    public UserHonor userHonor;

    @C09CT("user_role")
    public int userRole;

    @C09CT("with_fusion_shop_entry")
    public boolean withFusionShopEntry;

    @C09CT("nickname")
    public String nickName = "";

    @C09CT("bio_description")
    public String signature = "";

    @C09CT("sec_uid")
    public String secUid = "";

    @C09CT("share_qrcode_uri")
    public String shareQrcodeUri = "";

    @C09CT("verified_content")
    public String verifiedContent = "";

    @C09CT("scm_label")
    public String scmLabel = "";

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("verified_reason")
    public String verifiedReason = "";

    @C09CT("display_id")
    public String username = "";

    @C09CT("special_id")
    public String specialId = "";

    @C09CT("bg_img_url")
    public String backgroundImgUrl = "";

    @C09CT("constellation")
    public String constellation = "";

    @C09CT("follow_status")
    public Long followStatus = 0L;

    /* JADX INFO: loaded from: classes.dex */
    public static class ComboBadgeInfo {

        @C09CT("combo_count")
        public long comboCount;

        @C09CT("icon")
        public ImageModel icon;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CreatorScoreDisplayInfo {

        @C09CT("ecommerce_entrance_label")
        public CreatorScoreLabelInfo ecommerceEntranceLabel;

        @C09CT("score_level")
        public int scoreLevel;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CreatorScoreLabelInfo {

        @C09CT("label_text")
        public String labelText = "";

        @C09CT("label_text_color_dark")
        public String labelTextColorDark = "";

        @C09CT("label_text_color_light")
        public String labelTextColorLight = "";

        @C09CT("logo_dark")
        public ImageModel logoDark;

        @C09CT("logo_light")
        public ImageModel logoLight;

        @C09CT("pop_up_info")
        public PopUpInfo popUpInfo;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class CreatorScoreProfile {

        @C09CT("country_code")
        public String countryCode = "";

        @C09CT("display_info")
        public CreatorScoreDisplayInfo displayInfo;

        @C09CT("final_score")
        public double finalScore;

        @C09CT("score_info_extra")
        public Map<String, String> scoreInfoExtra;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class EnigmaInfo {

        @C09CT("is_enigma_mask_on")
        public boolean isEnigmaMaskOn;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class FansClubInfo {

        @C09CT("badge")
        public ImageModel badge;

        @C09CT("fans_club_name")
        public String fansClubName = "";

        @C09CT("fans_count")
        public long fansCount;

        @C09CT("fans_level")
        public long fansLevel;

        @C09CT("fans_score")
        public long fansScore;

        @C09CT("is_sleeping")
        public boolean isSleeping;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class OwnRoom {

        @C09CT("room_ids")
        public List<Long> roomIdList;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PopUpInfo {

        @C09CT("title")
        public String title = "";

        @C09CT("description")
        public String description = "";
    }

    public boolean childrenManagerForbidCreateLiveRoom() {
        return false;
    }

    @Override // X.InterfaceC2262081DgM
    public boolean childrenManagerForbidWalletFunctions() {
        return false;
    }

    @Override // X.InterfaceC2262081DgM
    public ImageModel getAvatarLarge() {
        try {
            if (this.avatarLarge == null && !TextUtils.isEmpty(this.mAvatarLargeStr)) {
                this.avatarLarge = (ImageModel) new Gson().LJII(this.mAvatarLargeStr, ImageModel.class);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return this.avatarLarge;
    }

    @Override // X.InterfaceC2262081DgM
    public ImageModel getAvatarMedium() {
        try {
            if (this.avatarMedium == null && !TextUtils.isEmpty(this.mAvatarMediumStr)) {
                this.avatarMedium = (ImageModel) new Gson().LJII(this.mAvatarMediumStr, ImageModel.class);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return this.avatarMedium;
    }

    @Override // X.InterfaceC2262081DgM
    public ImageModel getAvatarThumb() {
        try {
            if (this.avatarThumb == null && !TextUtils.isEmpty(this.mAvatarThumbStr)) {
                this.avatarThumb = (ImageModel) new Gson().LJII(this.mAvatarThumbStr, ImageModel.class);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return this.avatarThumb;
    }

    public String getIdStr() {
        return TextUtils.isEmpty(this.idStr) ? String.valueOf(this.id) : this.idStr;
    }

    @Override // X.InterfaceC2262081DgM
    public long getLiveRoomId() {
        List<Long> list;
        OwnRoom ownRoom = this.ownRoom;
        if (ownRoom == null || (list = ownRoom.roomIdList) == null || list.size() == 0) {
            return 0L;
        }
        return ((Long) ListProtector.get(ownRoom.roomIdList, 0)).longValue();
    }

    @Override // X.InterfaceC2262081DgM
    public List<ImageModel> getNewUserBadges() {
        List<ImageModel> list = this.newUserBadges;
        return (list == null || list.isEmpty()) ? this.userBadges : this.newUserBadges;
    }

    public int hashCode() {
        String str = this.nickName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.signature;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.id;
        int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.createTime;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        ImageModel imageModel = this.avatarThumb;
        int iHashCode3 = (i2 + (imageModel != null ? imageModel.hashCode() : 0)) * 31;
        ImageModel imageModel2 = this.avatarMedium;
        int iHashCode4 = (iHashCode3 + (imageModel2 != null ? imageModel2.hashCode() : 0)) * 31;
        ImageModel imageModel3 = this.avatarLarge;
        int iHashCode5 = (iHashCode4 + (imageModel3 != null ? imageModel3.hashCode() : 0)) * 31;
        List<User> list = this.topFans;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.idStr;
        int iHashCode7 = str3 != null ? str3.hashCode() : 0;
        long j3 = this.fanTicketCount;
        int i3 = (((((iHashCode6 + iHashCode7) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.isVerified ? 1 : 0)) * 31;
        String str4 = this.verifiedReason;
        int iHashCode8 = (((i3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.topVipNo) * 31;
        UserHonor userHonor = this.userHonor;
        int iHashCode9 = (iHashCode8 + (userHonor != null ? userHonor.hashCode() : 0)) * 31;
        AnchorLevel anchorLevel = this.anchorLevel;
        int iHashCode10 = (iHashCode9 + (anchorLevel != null ? anchorLevel.hashCode() : 0)) * 31;
        List<ImageModel> list2 = this.userBadges;
        int iHashCode11 = (iHashCode10 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<ImageModel> list3 = this.newUserBadges;
        int iHashCode12 = (iHashCode11 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str5 = this.mAvatarThumbStr;
        int iHashCode13 = (iHashCode12 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.mAvatarMediumStr;
        int iHashCode14 = (iHashCode13 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.mAvatarLargeStr;
        int iHashCode15 = (((iHashCode14 + (str7 != null ? str7.hashCode() : 0)) * 31) + (this.enableShowCommerceSale ? 1 : 0)) * 31;
        String str8 = this.backgroundImgUrl;
        int iHashCode16 = (((iHashCode15 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.status) * 31;
        long j4 = this.modifyTime;
        int i4 = (((iHashCode16 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.secret) * 31;
        String str9 = this.shareQrcodeUri;
        int iHashCode17 = (i4 + (str9 != null ? str9.hashCode() : 0)) * 31;
        FollowInfo followInfo = this.followInfo;
        int iHashCode18 = (iHashCode17 + (followInfo != null ? followInfo.hashCode() : 0)) * 31;
        UserAttr userAttr = this.userAttr;
        int iHashCode19 = (iHashCode18 + (userAttr != null ? userAttr.hashCode() : 0)) * 31;
        AnchorInfo anchorInfo = this.anchorInfo;
        return iHashCode19 + (anchorInfo != null ? anchorInfo.hashCode() : 0);
    }

    public boolean isAnchorHasSubQualification() {
        SubscribeInfo subscribeInfo = this.subscribeInfo;
        if (subscribeInfo != null) {
            return subscribeInfo.isAnchorQualified();
        }
        return false;
    }

    public boolean isFollowing() {
        FollowInfo followInfo = this.followInfo;
        if (followInfo == null) {
            return false;
        }
        return followInfo.getFollowStatus() == 2 || this.followInfo.getFollowStatus() == 1;
    }

    public boolean isSubscribed() {
        SubscribeInfo subscribeInfo = this.subscribeInfo;
        if (subscribeInfo == null || !subscribeInfo.isAnchorQualified()) {
            return false;
        }
        return this.subscribeInfo.isSubscribed();
    }

    public boolean isWithCommercePermission() {
        return isEnableShowCommerceSale();
    }

    @Override // X.InterfaceC2262081DgM
    public AnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }

    @Override // X.InterfaceC2262081DgM
    public AuthenticationInfo getAuthenticationInfo() {
        return this.authenticationInfo;
    }

    public Author getAuthorInfo() {
        return this.authorInfo;
    }

    @Override // X.InterfaceC2262081DgM
    public String getAutoGraph() {
        return this.signature;
    }

    public ImageModel getAvatarBorder() {
        return this.avatarBorder;
    }

    @Override // X.InterfaceC2262081DgM
    public String getBackgroundImgUrl() {
        return this.backgroundImgUrl;
    }

    public List<BadgeStruct> getBadgeList() {
        return this.badgeList;
    }

    public BorderInfo getBorder() {
        return this.border;
    }

    public List<BorderInfo> getBorders() {
        return this.borders;
    }

    public ComboBadgeInfo getComboBadgeInfo() {
        return this.comboBadgeInfo;
    }

    @Override // X.InterfaceC2262081DgM
    public long getCreateTime() {
        return this.createTime;
    }

    public String getDisplayId() {
        return this.username;
    }

    @Override // X.InterfaceC2262081DgM
    public long getFanTicketCount() {
        return this.fanTicketCount;
    }

    public FansClubMember getFansClub() {
        return this.fansClub;
    }

    @Override // X.InterfaceC2262081DgM
    public FollowInfo getFollowInfo() {
        return this.followInfo;
    }

    public FraternityInfo getFraternityInfo() {
        return this.fraternityInfo;
    }

    @Override // X.InterfaceC2262081DgM
    public long getId() {
        return this.id;
    }

    public int getLinkMicStats() {
        return this.linkMicStats;
    }

    public String getLogPb() {
        return this.logPb;
    }

    public ImageModel getMedal() {
        return this.medal;
    }

    @Override // X.InterfaceC2262081DgM
    public long getModifyTime() {
        return this.modifyTime;
    }

    public String getNickName() {
        return this.nickName;
    }

    public NobleLevelInfo getNobleLevelInfo() {
        return this.nobleLevelInfo;
    }

    @Override // X.InterfaceC2262081DgM
    public OwnRoom getOwnRoom() {
        return this.ownRoom;
    }

    public long getPayScores() {
        return this.payScores;
    }

    public ImageModel getPersonalCard() {
        return this.personalCard;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public ActivityRewardInfo getRewardInfo() {
        return this.rewardInfo;
    }

    public String getScmLabel() {
        return this.scmLabel;
    }

    @Override // X.InterfaceC2262081DgM
    public String getSecUid() {
        return this.secUid;
    }

    @Override // X.InterfaceC2262081DgM
    public int getSecret() {
        return this.secret;
    }

    public boolean getShareLinkReceiver() {
        return this.shareLinkReceiver;
    }

    @Override // X.InterfaceC2262081DgM
    public String getShareQrcodeUri() {
        return this.shareQrcodeUri;
    }

    public String getSpecialId() {
        return this.specialId;
    }

    @Override // X.InterfaceC2262081DgM
    public int getStatus() {
        return this.status;
    }

    @Override // X.InterfaceC2262081DgM
    public SubscribeInfo getSubscribeInfo() {
        return this.subscribeInfo;
    }

    @Override // X.InterfaceC2262081DgM
    public List<User> getTopFans() {
        return this.topFans;
    }

    @Override // X.InterfaceC2262081DgM
    public int getTopVipNo() {
        return this.topVipNo;
    }

    @Override // X.InterfaceC2262081DgM
    public UserAttr getUserAttr() {
        return this.userAttr;
    }

    @Override // X.InterfaceC2262081DgM
    public List<ImageModel> getUserBadges() {
        return this.userBadges;
    }

    public int getUserRole() {
        return this.userRole;
    }

    public String getUsername() {
        return this.username;
    }

    public String getVerifiedContent() {
        return this.verifiedContent;
    }

    @Override // X.InterfaceC2262081DgM
    public String getVerifiedReason() {
        return this.verifiedReason;
    }

    public boolean isEnableCarManagement() {
        return this.enableCarManagementPermission;
    }

    @Override // X.InterfaceC2262081DgM
    public boolean isEnableShowCommerceSale() {
        return this.enableShowCommerceSale;
    }

    @Override // X.InterfaceC2262081DgM
    public boolean isVerified() {
        return this.isVerified;
    }

    @Override // X.InterfaceC2262081DgM
    public AnchorLevel getAnchorLevel() {
        return this.anchorLevel;
    }

    @Override // X.InterfaceC2262081DgM
    public UserHonor getUserHonor() {
        return this.userHonor;
    }

    public static User from(InterfaceC2262081DgM interfaceC2262081DgM) {
        if (interfaceC2262081DgM == null) {
            return null;
        }
        if (interfaceC2262081DgM instanceof User) {
            Gson gson = new Gson();
            return (User) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, interfaceC2262081DgM), User.class);
        }
        User user = new User();
        user.initWith(interfaceC2262081DgM);
        return user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (this.id != user.id || this.createTime != user.createTime || this.fanTicketCount != user.fanTicketCount || this.isVerified != user.isVerified || this.topVipNo != user.topVipNo || getLiveRoomId() != user.getLiveRoomId() || this.enableShowCommerceSale != user.enableShowCommerceSale) {
            return false;
        }
        String str = this.nickName;
        if (str != null) {
            if (!str.equals(user.nickName)) {
                return false;
            }
        } else if (user.nickName != null) {
            return false;
        }
        String str2 = this.signature;
        if (str2 != null) {
            if (!str2.equals(user.signature)) {
                return false;
            }
        } else if (user.signature != null) {
            return false;
        }
        ImageModel imageModel = this.avatarThumb;
        if (imageModel != null) {
            if (!imageModel.equals(user.avatarThumb)) {
                return false;
            }
        } else if (user.avatarThumb != null) {
            return false;
        }
        ImageModel imageModel2 = this.avatarMedium;
        if (imageModel2 != null) {
            if (!imageModel2.equals(user.avatarMedium)) {
                return false;
            }
        } else if (user.avatarMedium != null) {
            return false;
        }
        ImageModel imageModel3 = this.avatarLarge;
        if (imageModel3 != null) {
            if (!imageModel3.equals(user.avatarLarge)) {
                return false;
            }
        } else if (user.avatarLarge != null) {
            return false;
        }
        List<User> list = this.topFans;
        if (list != null) {
            if (!list.equals(user.topFans)) {
                return false;
            }
        } else if (user.topFans != null) {
            return false;
        }
        String str3 = this.idStr;
        if (str3 != null) {
            if (!str3.equals(user.idStr)) {
                return false;
            }
        } else if (user.idStr != null) {
            return false;
        }
        String str4 = this.verifiedReason;
        if (str4 != null) {
            if (!str4.equals(user.verifiedReason)) {
                return false;
            }
        } else if (user.verifiedReason != null) {
            return false;
        }
        UserHonor userHonor = this.userHonor;
        if (userHonor != null) {
            if (!userHonor.equals(user.userHonor)) {
                return false;
            }
        } else if (user.userHonor != null) {
            return false;
        }
        AnchorLevel anchorLevel = this.anchorLevel;
        if (anchorLevel != null) {
            if (!anchorLevel.equals(user.anchorLevel)) {
                return false;
            }
        } else if (user.anchorLevel != null) {
            return false;
        }
        List<ImageModel> list2 = this.userBadges;
        if (list2 != null) {
            if (!list2.equals(user.userBadges)) {
                return false;
            }
        } else if (user.userBadges != null) {
            return false;
        }
        List<ImageModel> list3 = this.newUserBadges;
        if (list3 != null) {
            if (!list3.equals(user.newUserBadges)) {
                return false;
            }
        } else if (user.newUserBadges != null) {
            return false;
        }
        String str5 = this.mAvatarThumbStr;
        if (str5 != null) {
            if (!str5.equals(user.mAvatarThumbStr)) {
                return false;
            }
        } else if (user.mAvatarThumbStr != null) {
            return false;
        }
        String str6 = this.mAvatarMediumStr;
        if (str6 != null) {
            if (!str6.equals(user.mAvatarMediumStr)) {
                return false;
            }
        } else if (user.mAvatarMediumStr != null) {
            return false;
        }
        String str7 = this.mAvatarLargeStr;
        if (str7 != null) {
            if (!str7.equals(user.mAvatarLargeStr)) {
                return false;
            }
        } else if (user.mAvatarLargeStr != null) {
            return false;
        }
        String str8 = this.backgroundImgUrl;
        if (str8 != null) {
            if (!str8.equals(user.backgroundImgUrl)) {
                return false;
            }
        } else if (user.backgroundImgUrl != null) {
            return false;
        }
        if (this.status != user.status || this.modifyTime != user.modifyTime || this.secret != user.secret) {
            return false;
        }
        String str9 = this.shareQrcodeUri;
        if (str9 != null) {
            if (!str9.equals(user.shareQrcodeUri)) {
                return false;
            }
        } else if (user.shareQrcodeUri != null) {
            return false;
        }
        FollowInfo followInfo = this.followInfo;
        if (followInfo != null) {
            if (!followInfo.equals(user.followInfo)) {
                return false;
            }
        } else if (user.followInfo != null) {
            return false;
        }
        UserAttr userAttr = this.userAttr;
        if (userAttr != null) {
            if (!userAttr.equals(user.userAttr)) {
                return false;
            }
        } else if (user.userAttr != null) {
            return false;
        }
        AuthenticationInfo authenticationInfo = this.authenticationInfo;
        if (authenticationInfo != null) {
            if (!authenticationInfo.equals(user.authenticationInfo)) {
                return false;
            }
        } else if (user.authenticationInfo != null) {
            return false;
        }
        AnchorInfo anchorInfo = this.anchorInfo;
        AnchorInfo anchorInfo2 = user.anchorInfo;
        if (anchorInfo != null) {
            return anchorInfo.equals(anchorInfo2);
        }
        if (anchorInfo2 == null) {
            return true;
        }
        return false;
    }

    public void initWith(InterfaceC2262081DgM interfaceC2262081DgM) {
        ArrayList arrayList;
        UserHonor userHonor;
        ArrayList arrayList2;
        AnchorLevel anchorLevel;
        ArrayList arrayList3;
        this.enableShowCommerceSale = interfaceC2262081DgM.isEnableShowCommerceSale();
        this.fanTicketCount = interfaceC2262081DgM.getFanTicketCount();
        this.avatarThumb = interfaceC2262081DgM.getAvatarThumb();
        this.avatarMedium = interfaceC2262081DgM.getAvatarMedium();
        this.avatarLarge = interfaceC2262081DgM.getAvatarLarge();
        if (interfaceC2262081DgM instanceof User) {
            this.nickName = ((User) interfaceC2262081DgM).nickName;
        }
        this.signature = interfaceC2262081DgM.getAutoGraph();
        this.id = interfaceC2262081DgM.getId();
        ArrayList arrayList4 = null;
        if (interfaceC2262081DgM.getTopFans() != null) {
            arrayList = new ArrayList(interfaceC2262081DgM.getTopFans());
        } else {
            arrayList = null;
        }
        this.topFans = arrayList;
        this.isVerified = interfaceC2262081DgM.isVerified();
        this.verifiedReason = interfaceC2262081DgM.getVerifiedReason();
        this.topVipNo = interfaceC2262081DgM.getTopVipNo();
        InterfaceC2262101DgO userHonor2 = interfaceC2262081DgM.getUserHonor();
        if (userHonor2 == null) {
            userHonor = null;
        } else if (userHonor2 instanceof UserHonor) {
            Gson gson = new Gson();
            userHonor = (UserHonor) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, userHonor2), UserHonor.class);
        } else {
            userHonor = new UserHonor();
            userHonor.diamondIcon = userHonor2.LJIILLIIL();
            userHonor.currentHonorIcon = userHonor2.LJIIZILJ();
            userHonor.nextHonorIcon = userHonor2.LJ();
            userHonor.nextHonorName = userHonor2.LJIILJJIL();
            userHonor.currentHonorName = userHonor2.LJIIJJI();
            userHonor.totalDiamond = userHonor2.LJIIIIZZ();
            userHonor.currentDiamond = userHonor2.LJIIJ();
            userHonor.imIcon = userHonor2.LJIILIIL();
            userHonor.imIconWithLevel = userHonor2.LJFF();
            userHonor.newImIconWithLevel = userHonor2.LJIIL();
            userHonor.level = userHonor2.getLevel();
            userHonor.liveIcon = userHonor2.LIZJ();
            userHonor.newLiveIcon = userHonor2.LJIILL();
            if (userHonor2.LJIIIZ() != null) {
                arrayList2 = new ArrayList(userHonor2.LJIIIZ());
            } else {
                arrayList2 = null;
            }
            userHonor.gradeIconList = arrayList2;
            userHonor.gradeDescribe = userHonor2.LJII();
            userHonor.thisGradeMaxDiamond = userHonor2.LJI();
            userHonor.thisGradeMinDiamond = userHonor2.LIZLLL();
            userHonor.profileDialogBg = userHonor2.LIZ();
            userHonor.profileDialogBackBg = userHonor2.LIZIZ();
        }
        this.userHonor = userHonor;
        InterfaceC2262111DgP anchorLevel2 = interfaceC2262081DgM.getAnchorLevel();
        if (anchorLevel2 == null) {
            anchorLevel = null;
        } else if (anchorLevel2 instanceof AnchorLevel) {
            anchorLevel = (AnchorLevel) anchorLevel2;
        } else {
            AnchorLevel anchorLevel3 = new AnchorLevel();
            anchorLevel3.level = anchorLevel2.getLevel();
            anchorLevel3.experience = anchorLevel2.LJII();
            anchorLevel3.lowestExperienceThisLevel = anchorLevel2.LIZJ();
            anchorLevel3.highestExperienceThisLevel = anchorLevel2.LJFF();
            anchorLevel3.taskStartExperience = anchorLevel2.LJIIIIZZ();
            anchorLevel3.taskStartTime = anchorLevel2.LJIIJJI();
            anchorLevel3.taskDecreaseExperience = anchorLevel2.LJIIJ();
            anchorLevel3.taskTargetExperience = anchorLevel2.LJIIIZ();
            anchorLevel3.taskEndTime = anchorLevel2.LIZLLL();
            anchorLevel3.profileDialogBg = anchorLevel2.LIZ();
            anchorLevel3.profileDialogBackBg = anchorLevel2.LIZIZ();
            anchorLevel3.stageLevelIcon = anchorLevel2.LJI();
            anchorLevel3.levelIcon = anchorLevel2.LJ();
            anchorLevel = anchorLevel3;
        }
        this.anchorLevel = anchorLevel;
        this.createTime = interfaceC2262081DgM.getCreateTime();
        this.ownRoom = interfaceC2262081DgM.getOwnRoom();
        if (interfaceC2262081DgM.getUserBadges() != null) {
            arrayList3 = new ArrayList(interfaceC2262081DgM.getUserBadges());
        } else {
            arrayList3 = null;
        }
        this.userBadges = arrayList3;
        if (interfaceC2262081DgM.getNewUserBadges() != null) {
            arrayList4 = new ArrayList(interfaceC2262081DgM.getNewUserBadges());
        }
        this.newUserBadges = arrayList4;
        this.backgroundImgUrl = interfaceC2262081DgM.getBackgroundImgUrl();
        this.status = interfaceC2262081DgM.getStatus();
        this.modifyTime = interfaceC2262081DgM.getModifyTime();
        this.secret = interfaceC2262081DgM.getSecret();
        this.shareQrcodeUri = interfaceC2262081DgM.getShareQrcodeUri();
        this.followInfo = interfaceC2262081DgM.getFollowInfo();
        this.userAttr = interfaceC2262081DgM.getUserAttr();
        this.anchorInfo = interfaceC2262081DgM.getAnchorInfo();
        this.authenticationInfo = interfaceC2262081DgM.getAuthenticationInfo();
    }

    public void setAnchorInfo(AnchorInfo anchorInfo) {
        this.anchorInfo = anchorInfo;
    }

    public void setAvatarLarge(ImageModel imageModel) {
        this.avatarLarge = imageModel;
    }

    public void setAvatarMedium(ImageModel imageModel) {
        this.avatarMedium = imageModel;
    }

    public void setAvatarThumb(ImageModel imageModel) {
        this.avatarThumb = imageModel;
    }

    public void setBadgeList(List<BadgeStruct> list) {
        this.badgeList = list;
    }

    public void setBorder(BorderInfo borderInfo) {
        this.border = borderInfo;
    }

    public void setDisplayId(String str) {
        this.username = str;
    }

    public void setEnableShowCommerceSale(boolean z) {
        this.enableShowCommerceSale = z;
    }

    public void setFollowInfo(FollowInfo followInfo) {
        this.followInfo = followInfo;
    }

    public void setFollowStatus(int i) {
        FollowInfo followInfo = this.followInfo;
        if (followInfo != null) {
            followInfo.setFollowStatus(i);
        }
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setLogPb(String str) {
        this.logPb = str;
    }

    public void setModifyTime(long j) {
        this.modifyTime = j;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setOwnRoom(OwnRoom ownRoom) {
        this.ownRoom = ownRoom;
    }

    public void setPayScores(long j) {
        this.payScores = j;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setScmLabel(String str) {
        this.scmLabel = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSecret(int i) {
        this.secret = i;
    }

    public void setShareLinkReceiver(boolean z) {
        this.shareLinkReceiver = z;
    }

    public void setShareQrcodeUri(String str) {
        this.shareQrcodeUri = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setSubscribeInfo(SubscribeInfo subscribeInfo) {
        this.subscribeInfo = subscribeInfo;
    }

    public void setSubscribeStatus(boolean z) {
        SubscribeInfo subscribeInfo = this.subscribeInfo;
        if (subscribeInfo != null) {
            subscribeInfo.setSubscribed(z);
        }
    }

    @Override // X.InterfaceC2262081DgM
    public void setUserAttr(UserAttr userAttr) {
        this.userAttr = userAttr;
    }

    public void setUserRole(int i) {
        this.userRole = i;
    }

    public void setWithCommercePermission(boolean z) {
        setEnableShowCommerceSale(z);
    }
}
