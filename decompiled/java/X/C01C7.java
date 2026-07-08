package X;

import android.view.View;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: renamed from: X.01C7, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01C7 {
    public static final void LIZIZ(View.OnClickListener onClickListener, View view) {
        if (view != null) {
            C786410Ut5.I7(new C01C8(onClickListener), view);
        }
    }

    public static final void LIZ(DataChannel dataChannel, String str, Map<String, String> map) {
        Object objValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            objValueOf = Long.valueOf(room.getId());
        } else {
            objValueOf = "";
        }
        c474500IjALIZ.LJJII(objValueOf, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(C0KYR.LIZJ(dataChannel), "admin_type");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
