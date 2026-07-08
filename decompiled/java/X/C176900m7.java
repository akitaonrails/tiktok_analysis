package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import qo2.w;

/* JADX INFO: renamed from: X.00m7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C176900m7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C474500IjA c474500IjA) {
        long id;
        User owner;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        long id2 = 0;
        if (room != null && (owner = room.getOwner()) != null) {
            id = owner.getId();
        } else {
            id = 0;
        }
        w.LIZ.getClass();
        String strLJIIIZ = w.LJIIIZ();
        String strLJIIL = w.LJIIL();
        c474500IjA.LJJII(strLJIIIZ, "enter_from_merge");
        c474500IjA.LJJII(strLJIIL, "enter_method");
        c474500IjA.LJJII(Long.valueOf(id), "anchor_id");
        c474500IjA.LJJII(Long.valueOf(currentUserId), "user_id");
        if (room != null) {
            id2 = room.getId();
        }
        c474500IjA.LJJII(Long.valueOf(id2), "room_id");
        c474500IjA.LJJII(Integer.valueOf(C1135800ff8.LJJII() ? 1 : 0), "is_anchor");
    }
}
