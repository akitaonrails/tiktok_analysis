package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00hl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C149900hl {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C474500IjA c474500IjA) {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long id2 = 0;
        if (room != null) {
            id = room.getId();
            if (room.getOwner() != null) {
                id2 = room.getOwner().getId();
            }
        } else {
            id = 0;
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        c474500IjA.LJJII(Long.valueOf(id), "room_id");
        c474500IjA.LJJII(Long.valueOf(id2), "anchor_id");
        c474500IjA.LJJII(Long.valueOf(currentUserId), "user_id");
    }

    public static void LIZIZ(Integer num) {
        try {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_receive_gift_unlock_im");
            c474500IjALIZ.LJIL();
            LIZ(c474500IjALIZ);
            c474500IjALIZ.LJJII("unlock", "type");
            c474500IjALIZ.LJJII(num, "unlock_num");
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
