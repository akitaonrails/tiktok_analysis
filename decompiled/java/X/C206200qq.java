package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;

/* JADX INFO: renamed from: X.00qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C206200qq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Room room, int i, int i2) {
        Long lValueOf;
        User owner;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_recognization_result");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "room_id");
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf2), "anchor_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "recognization_result");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "recognization_method");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(Room room, String str, String str2, String str3, Map map) {
        Long lValueOf;
        User owner;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_sync_dm_component");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        Long lValueOf2 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf), "room_id");
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf2 = Long.valueOf(owner.getId());
        }
        c474500IjALIZ.LJJII(String.valueOf(lValueOf2), "anchor_id");
        c474500IjALIZ.LJJII(str2, "model_type");
        c474500IjALIZ.LJJII(str, "action_type");
        if (str3.length() > 0) {
            c474500IjALIZ.LJJII(str3, "model_score");
        }
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(1, "is_service_plus");
        c474500IjALIZ.LIZ();
    }
}
