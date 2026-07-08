package com.bytedance.android.live.liveinteract.api.event;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class ShowMatchPanelForQuickMatchEvent {

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("invite_type")
    public final int inviteType;

    @C09CT("rival_team_user")
    public final ShowMatchPanelForQuickMatchUser rivalTeamUser;

    @C09CT("self_team_user")
    public final ShowMatchPanelForQuickMatchUser selfTeamUser;

    @C09CT("show_dim")
    public final Boolean showDim;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowMatchPanelForQuickMatchEvent)) {
            return false;
        }
        ShowMatchPanelForQuickMatchEvent showMatchPanelForQuickMatchEvent = (ShowMatchPanelForQuickMatchEvent) obj;
        return Intrinsics.LJFF(this.selfTeamUser, showMatchPanelForQuickMatchEvent.selfTeamUser) && Intrinsics.LJFF(this.rivalTeamUser, showMatchPanelForQuickMatchEvent.rivalTeamUser) && this.inviteType == showMatchPanelForQuickMatchEvent.inviteType && Intrinsics.LJFF(this.enterFrom, showMatchPanelForQuickMatchEvent.enterFrom) && Intrinsics.LJFF(this.showDim, showMatchPanelForQuickMatchEvent.showDim);
    }

    public final int hashCode() {
        int iHashCode = ((((this.selfTeamUser.hashCode() * 31) + this.rivalTeamUser.hashCode()) * 31) + this.inviteType) * 31;
        String str = this.enterFrom;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.showDim;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowMatchPanelForQuickMatchEvent(selfTeamUser=");
        sbLIZ.append(this.selfTeamUser);
        sbLIZ.append(", rivalTeamUser=");
        sbLIZ.append(this.rivalTeamUser);
        sbLIZ.append(", inviteType=");
        sbLIZ.append(this.inviteType);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", showDim=");
        sbLIZ.append(this.showDim);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShowMatchPanelForQuickMatchEvent(ShowMatchPanelForQuickMatchUser showMatchPanelForQuickMatchUser, ShowMatchPanelForQuickMatchUser showMatchPanelForQuickMatchUser2, int i, String str, Boolean bool) {
        this.selfTeamUser = showMatchPanelForQuickMatchUser;
        this.rivalTeamUser = showMatchPanelForQuickMatchUser2;
        this.inviteType = i;
        this.enterFrom = str;
        this.showDim = bool;
    }

    public static final class ShowMatchPanelForQuickMatchUser {

        @C09CT("avatar_urls")
        public final List<String> avatarUrls;

        @C09CT("badge")
        public final GiftGalleryBadgeInfo badge;

        @C09CT("channel_id")
        public final long channelId;

        @C09CT("display_id")
        public final String displayId;

        @C09CT("nickname")
        public final String nickname;

        @C09CT("room_id")
        public final long roomId;

        @C09CT("sec_uid")
        public final String secUserId;

        @C09CT("user_id")
        public final long userId;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowMatchPanelForQuickMatchUser)) {
                return false;
            }
            ShowMatchPanelForQuickMatchUser showMatchPanelForQuickMatchUser = (ShowMatchPanelForQuickMatchUser) obj;
            return this.roomId == showMatchPanelForQuickMatchUser.roomId && this.userId == showMatchPanelForQuickMatchUser.userId && this.channelId == showMatchPanelForQuickMatchUser.channelId && Intrinsics.LJFF(this.displayId, showMatchPanelForQuickMatchUser.displayId) && Intrinsics.LJFF(this.secUserId, showMatchPanelForQuickMatchUser.secUserId) && Intrinsics.LJFF(this.nickname, showMatchPanelForQuickMatchUser.nickname) && Intrinsics.LJFF(this.avatarUrls, showMatchPanelForQuickMatchUser.avatarUrls) && Intrinsics.LJFF(this.badge, showMatchPanelForQuickMatchUser.badge);
        }

        public final int hashCode() {
            int iY2 = ((((C786410Ut5.Y2(this.roomId) * 31) + C786410Ut5.Y2(this.userId)) * 31) + C786410Ut5.Y2(this.channelId)) * 31;
            String str = this.displayId;
            int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.secUserId;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.nickname.hashCode()) * 31;
            List<String> list = this.avatarUrls;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            GiftGalleryBadgeInfo giftGalleryBadgeInfo = this.badge;
            return iHashCode3 + (giftGalleryBadgeInfo != null ? giftGalleryBadgeInfo.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShowMatchPanelForQuickMatchUser(roomId=");
            sbLIZ.append(this.roomId);
            sbLIZ.append(", userId=");
            sbLIZ.append(this.userId);
            sbLIZ.append(", channelId=");
            sbLIZ.append(this.channelId);
            sbLIZ.append(", displayId=");
            sbLIZ.append(this.displayId);
            sbLIZ.append(", secUserId=");
            sbLIZ.append(this.secUserId);
            sbLIZ.append(", nickname=");
            sbLIZ.append(this.nickname);
            sbLIZ.append(", avatarUrls=");
            sbLIZ.append(this.avatarUrls);
            sbLIZ.append(", badge=");
            sbLIZ.append(this.badge);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ShowMatchPanelForQuickMatchUser(long j, long j2, long j3, String str, String str2, String str3, List<String> list, GiftGalleryBadgeInfo giftGalleryBadgeInfo) {
            this.roomId = j;
            this.userId = j2;
            this.channelId = j3;
            this.displayId = str;
            this.secUserId = str2;
            this.nickname = str3;
            this.avatarUrls = list;
            this.badge = giftGalleryBadgeInfo;
        }
    }
}
