package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.00ib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C155100ib {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ() {
        if (UserService.getInstance().user() != null) {
            return UserService.getInstance().user().getCurrentUserId();
        }
        return 0L;
    }

    public static void LIZJ(String str, String str2) {
        long id;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_floating_interact_tips_show");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "anchor_id");
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        c474500IjALIZ.LJJII(str, "tips_type");
        c474500IjALIZ.LJJII(str2, "content_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(long j, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_floating_interact_tips_close");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(str, "tips_type");
        c474500IjALIZ.LJJII(str2, "content_type");
        c474500IjALIZ.LIZ();
    }
}
