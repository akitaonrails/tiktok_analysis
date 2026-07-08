package X;

import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeUserInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0K9P, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K9P {
    public static final C0K9P LIZ = new C0K9P();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.09Gk] */
    public static final void LIZ(C1ACA c1aca, boolean z, DataChannel dataChannel) {
        ?? BooleanValue;
        String str;
        String uid;
        Long lValueOf;
        long j;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        User user;
        SubscribeUserInfoResponse subscribeUserInfoResponse;
        if (dataChannel != null && (subscribeUserInfoResponse = (SubscribeUserInfoResponse) dataChannel.gg0(C2276291E7v.class)) != null) {
            BooleanValue = subscribeUserInfoResponse.subscribing.subInfo.isSubscribing.booleanValue();
        } else {
            BooleanValue = 0;
        }
        ?? c2344009Gk = new C2344009Gk();
        String requestId = null;
        if (c1aca != null) {
            str = c1aca.LIZLLL;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from_merge", str);
        c2344009Gk.LJIIIIZZ("action_type", "click");
        if (c1aca != null && (liveRoomStruct3 = c1aca.LIZJ) != null && (user = liveRoomStruct3.owner) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_id", uid);
        if (c1aca != null && (liveRoomStruct2 = c1aca.LIZJ) != null) {
            lValueOf = Long.valueOf(liveRoomStruct2.id);
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "room_id");
        if (c1aca != null && (aweme = c1aca.LIZIZ) != null) {
            requestId = aweme.getRequestId();
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_preview_over");
        c2344009Gk.LIZJ(BooleanValue, "user_type");
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            j = liveRoomStruct.maxPreviewTime;
        } else {
            j = 0;
        }
        c2344009Gk.LIZLLL(j / 1000, "maximum_preview_duration");
        C20684815ws.LJIILLIIL("livesdk_sub_only_live_preview_show", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void LIZIZ(C1ACA c1aca, long j, DataChannel dataChannel) {
        long j2;
        ?? BooleanValue;
        String str;
        String uid;
        Long lValueOf;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        User user;
        SubscribeUserInfoResponse subscribeUserInfoResponse;
        LiveRoomStruct liveRoomStruct4;
        if (c1aca != null && (liveRoomStruct4 = c1aca.LIZJ) != null) {
            j2 = liveRoomStruct4.allowPreviewTime;
        } else {
            j2 = -1;
        }
        long j3 = 0;
        if (j <= 0 && j2 < 0) {
            return;
        }
        if (dataChannel != null && (subscribeUserInfoResponse = (SubscribeUserInfoResponse) dataChannel.gg0(C2276291E7v.class)) != null) {
            BooleanValue = subscribeUserInfoResponse.subscribing.subInfo.isSubscribing.booleanValue();
        } else {
            BooleanValue = 0;
        }
        ?? c2344009Gk = new C2344009Gk();
        String requestId = null;
        if (c1aca != null) {
            str = c1aca.LIZLLL;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from_merge", str);
        c2344009Gk.LJIIIIZZ("action_type", "click");
        if (c1aca != null && (liveRoomStruct3 = c1aca.LIZJ) != null && (user = liveRoomStruct3.owner) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_id", uid);
        if (c1aca != null && (liveRoomStruct2 = c1aca.LIZJ) != null) {
            lValueOf = Long.valueOf(liveRoomStruct2.id);
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "room_id");
        if (c1aca != null && (aweme = c1aca.LIZIZ) != null) {
            requestId = aweme.getRequestId();
        }
        c2344009Gk.LJIIIIZZ("request_id", requestId);
        c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
        c2344009Gk.LJIIIIZZ("event_page", "others");
        c2344009Gk.LIZJ(BooleanValue, "user_type");
        c2344009Gk.LIZLLL((j - j2) / 1000, "duration");
        if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
            j3 = liveRoomStruct.maxPreviewTime;
        }
        c2344009Gk.LIZLLL(j3 / 1000, "maximum_preview_duration");
        C20684815ws.LJIILLIIL("livesdk_sub_only_live_preview_duration", c2344009Gk.LIZ);
    }
}
