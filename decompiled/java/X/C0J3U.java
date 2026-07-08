package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0J3U, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3U {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(C1ACA c1aca) {
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from_merge", c1aca.LIZLLL);
        linkedHashMap.put("action_type", "click");
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        long j2 = -1;
        if (liveRoomStruct != null) {
            j = liveRoomStruct.id;
        } else {
            j = -1;
        }
        linkedHashMap.put("room_id", String.valueOf(j));
        linkedHashMap.put("enter_method", "live_cell");
        LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
        if (liveRoomStruct2 != null) {
            j2 = liveRoomStruct2.ownerUserId;
        }
        linkedHashMap.put("anchor_id", String.valueOf(j2));
        C487710JAr c487710JAr = C487710JAr.LIZ;
        LiveRoomStruct liveRoomStruct3 = c1aca.LIZJ;
        c487710JAr.getClass();
        linkedHashMap.put("follow_status", String.valueOf(C487710JAr.LIZ(liveRoomStruct3)));
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        if (strValueOf == null) {
            strValueOf = "";
        }
        linkedHashMap.put("user_id", strValueOf);
        return linkedHashMap;
    }
}
