package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0fJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122600fJq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Room room, String str, C1122670fJx c1122670fJx, String str2, C1122710fK1 c1122710fK1) {
        Long lValueOf;
        Long lValueOf2;
        User owner;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("event", "livesdk_service_sku_routing_component");
        Long lValueOf3 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        pairArr[1] = new Pair("room_id", lValueOf);
        pairArr[2] = new Pair("action", str);
        pairArr[3] = new Pair("sku", c1122670fJx.LIZ);
        pairArr[4] = new Pair("strategy", c1122670fJx.LIZIZ);
        pairArr[5] = new Pair("routing_score", Float.valueOf(c1122670fJx.LIZJ));
        pairArr[6] = new Pair("trigger_source", c1122670fJx.LIZLLL);
        pairArr[7] = new Pair("trigger_score", Float.valueOf(c1122670fJx.LJ));
        pairArr[8] = new Pair("industry_type", str2);
        pairArr[9] = new Pair("snapshot", c1122710fK1);
        C051E.LIZ("track.component", pairArr);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_sku_routing_component");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (room != null) {
            lValueOf2 = Long.valueOf(room.getId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf2), "room_id");
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf3 = Long.valueOf(owner.getId());
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf3), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(c1122670fJx.LIZ.getTrackingValue(), "tool_type");
        c474500IjALIZ.LJJII(c1122670fJx.LIZLLL.getTrackingValue(), "model_type");
        c474500IjALIZ.LJJII(c1122670fJx.LIZIZ.getTrackingValue(), "routing_strategy");
        c474500IjALIZ.LJJIFFI(Float.valueOf(c1122670fJx.LIZJ), "routing_score");
        c474500IjALIZ.LJJIFFI(Float.valueOf(c1122670fJx.LJ), "trigger_model_score");
        c474500IjALIZ.LJJII(str2, "industry_type");
        c474500IjALIZ.LJJII(Integer.valueOf(c1122710fK1.LIZ), "session_comment_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(c1122710fK1.LIZIZ), "session_watch_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(c1122710fK1.LIZJ), "session_host_profile_picture_click_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(c1122710fK1.LIZLLL), "session_share_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(c1122710fK1.LJ), "session_follow_anchor_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(c1122710fK1.LJFF), "session_like_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(c1122710fK1.LJI), "session_send_gift_cnt");
        c474500IjALIZ.LIZ();
    }
}
