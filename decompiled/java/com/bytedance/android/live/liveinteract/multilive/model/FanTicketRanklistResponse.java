package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import webcast.data.multi_guest_play.UserCountdownRecord;

/* JADX INFO: loaded from: classes.dex */
public final class FanTicketRanklistResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class CountdownInfo {

        @C09CT("history_exists")
        public boolean historyExists;

        @C09CT("in_progress_record")
        public UserCountdownRecord inProgressRecord;
    }

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class RanklistUser {

        @C09CT("index")
        public long index;

        @C09CT("score")
        public long score;

        @C09CT("user")
        public User user;
    }

    public static final class ResponseData {

        @C09CT("countdown_info")
        public CountdownInfo countdownInfo;

        @C09CT("fan_ticket_total")
        public long fanTicketTotal;

        @C09CT("guest_user")
        public User guestUser;

        @C09CT("own_index")
        public long ownIndex;

        @C09CT("own_score")
        public long ownScore;

        @C09CT("ranklist_users")
        public List<RanklistUser> ranklistUsers;

        @C09CT("room_reset_point_after_leave")
        public int roomResetPointAfterLeave;

        @C09CT("self_info")
        public SelfInfo selfInfo;
    }

    public static final class SelfInfo {

        @C09CT("index")
        public long index;

        @C09CT("score")
        public long score;

        @C09CT("user")
        public User user;
    }
}
