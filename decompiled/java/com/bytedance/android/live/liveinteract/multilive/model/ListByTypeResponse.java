package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class ListByTypeResponse {

    @C09CT("data")
    public MultiLiveGuestInfoList data;

    @C09CT("extra")
    public Extra extra;

    public static final class ChatGroupInfo {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public long id;

        @C09CT("invited")
        public long invited;

        @C09CT("members")
        public long members;

        @C09CT("title")
        public String title = "";

        @C09CT("icon")
        public String icon = "";
    }

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class GiftScoreAppliedUser {

        @C09CT("gift_score")
        public long giftScore;

        @C09CT("list_user")
        public LinkPlayerInfo listUser;
    }

    public static final class HostDisplayInfo {

        @C09CT("host_type")
        public long hostType;

        @C09CT("host_icon_background_url")
        public String hostIconBackgroundUrl = "";

        @C09CT("host_icon_url")
        public String hostIconUrl = "";

        @C09CT("host_color")
        public String hostColor = "";

        @C09CT("icon_link_url")
        public String iconLinkUrl = "";
    }

    public static final class LiveEventRegisterUser {

        @C09CT("list_user")
        public LinkPlayerInfo listUser;

        @C09CT("live_event_identity")
        public long liveEventIdentity;

        @C09CT("register_time")
        public long registerTime;

        @C09CT("source_type")
        public long sourceType;
    }

    public static final class MultiGuestBonus {

        @C09CT("is_success")
        public boolean isSuccess;

        @C09CT("multi_guest_bonus_value")
        public long multiGuestBonusValue;

        @C09CT("multi_guest_bonus_value_string")
        public String multiGuestBonusValueString = "";

        @C09CT("multi_guest_bonus_note_string")
        public String multiGuestBonusNoteString = "";
    }

    public static final class ReservedUser {

        @C09CT("reserve_id")
        public long reserveId;

        @C09CT("reserve_type")
        public int reserveType;

        @C09CT("tag_list")
        public List<String> tagList;

        @C09CT("update_time")
        public long updateTime;

        @C09CT("user")
        public User user;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "ListByTypeResponse{");
        sb.append('}');
        return sb.toString();
    }
}
