package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0J55, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J55 {
    public static final C0J55 LIZ = new C0J55();

    public static C2344009Gk LIZ(Aweme aweme, LiveRoomStruct liveRoomStruct) {
        long j;
        String uid;
        Long lValueOf;
        String requestId;
        Integer numValueOf;
        Integer numValueOf2;
        boolean z;
        String str;
        String str2;
        long clientAcceptanceTime;
        User user;
        User user2;
        User user3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (liveRoomStruct != null) {
            j = liveRoomStruct.create_time * 1000;
        } else {
            j = jCurrentTimeMillis;
        }
        long j2 = jCurrentTimeMillis - j;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from_merge", "homepage_friends");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        Integer numValueOf3 = null;
        if (liveRoomStruct != null && (user3 = liveRoomStruct.owner) != null) {
            uid = user3.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_id", uid);
        if (liveRoomStruct != null) {
            lValueOf = Long.valueOf(liveRoomStruct.id);
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("room_id", String.valueOf(lValueOf));
        if (aweme != null) {
            requestId = aweme.getRequestId();
        } else {
            requestId = null;
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        c2344009Gk.LJIIIIZZ("room_orientation", "portrait");
        c2344009Gk.LIZLLL(j2, "room_golive_duration");
        if (liveRoomStruct != null && (user2 = liveRoomStruct.owner) != null) {
            numValueOf = Integer.valueOf(user2.getFollowStatus());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "follow_status");
        String str3 = "1";
        c2344009Gk.LJIIIIZZ("is_waterfall", "1");
        if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
            numValueOf2 = Integer.valueOf(user.getFollowStatus());
        } else {
            numValueOf2 = null;
        }
        c2344009Gk.LJ(numValueOf2, "initial_follow_status");
        if (aweme != null && aweme.isAd()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_ad", str);
        if (liveRoomStruct == null || !liveRoomStruct.hasCommerceGoods) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_ecom", str3);
        c2344009Gk.LJIIIIZZ("live_window_mode", "full_screen");
        if (liveRoomStruct != null) {
            str2 = RoomStruct.getStreamType(liveRoomStruct).logStreamingType;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("live_type", str2);
        if (aweme != null) {
            clientAcceptanceTime = AwemeBizExtKt.getClientAcceptanceTime(aweme);
        } else {
            clientAcceptanceTime = 0;
        }
        c2344009Gk.LIZLLL(clientAcceptanceTime, "request_ts");
        if (aweme != null) {
            numValueOf3 = Integer.valueOf(AwemeBizExtKt.getPositionInRequest(aweme));
        }
        c2344009Gk.LJ(numValueOf3, "request_position");
        return c2344009Gk;
    }

    public static void LIZIZ(int i, long j, LiveRoomStruct liveRoomStruct, Aweme aweme, HashMap map) {
        Integer numValueOf;
        C2344009Gk c2344009GkLIZ = LIZ(aweme, liveRoomStruct);
        c2344009GkLIZ.LJIIIIZZ("enter_method", "live_cell");
        c2344009GkLIZ.LJIIIIZZ("action_type", "click");
        c2344009GkLIZ.LIZLLL(j, "room_golive_duration");
        c2344009GkLIZ.LJIIIIZZ("event_page", "preview_card");
        c2344009GkLIZ.LJIIIIZZ("request_page", "fyp_long_press");
        User user = liveRoomStruct.owner;
        if (user != null) {
            numValueOf = Integer.valueOf(user.getFollowStatus());
        } else {
            numValueOf = null;
        }
        c2344009GkLIZ.LJ(numValueOf, "follow_status");
        c2344009GkLIZ.LIZJ(i, "room_position");
        c2344009GkLIZ.LIZJ(i, "request_position");
        c2344009GkLIZ.LJIIIIZZ("first_label", CardStruct.IStatusCode.DEFAULT);
        c2344009GkLIZ.LJIIIIZZ("second_label", CardStruct.IStatusCode.DEFAULT);
        c2344009GkLIZ.LJIIIIZZ("user_type", "user");
        c2344009GkLIZ.LJI(map);
        c2344009GkLIZ.LJIIIIZZ("panel_source", "preview_press");
        C20684815ws.LJIILLIIL("livesdk_share", c2344009GkLIZ.LIZ);
    }
}
