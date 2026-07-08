package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0f9W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116200f9W {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(C474500IjA c474500IjA, DataChannel dataChannel) {
        String str;
        LiveMode streamType;
        c474500IjA.LJIJJLI(dataChannel);
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str = streamType.logStreamingType;
        } else {
            str = null;
        }
        c474500IjA.LJJ(str);
        if (C500260Jjc.LJIJI(dataChannel)) {
            c474500IjA.LJJII(Integer.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).WS1()), "user_rank");
            c474500IjA.LJJII("user", "user_type");
        } else {
            c474500IjA.LJJII("anchor", "user_type");
        }
        if (C497740JfY.LJIL()) {
            c474500IjA.LJJII("portrait", "room_orientation");
        } else {
            c474500IjA.LJJII("landscape", "room_orientation");
        }
    }

    public static void LIZJ(DataChannel dataChannel, C1116210f9X c1116210f9X, String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_delete_show");
        LJ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(c1116210f9X.LL, "comment_id");
        if (c1116210f9X.LLILZLL == 10) {
            str2 = "basic";
        } else {
            str2 = "up_grade";
        }
        c474500IjALIZ.LJJII(str2, "gear_type");
        c474500IjALIZ.LJJII(str, "delete_position");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(C1116210f9X c1116210f9X, DataChannel dataChannel, boolean z) {
        String str;
        int iLIZIZ;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_show");
        LJ(c474500IjALIZ, dataChannel);
        if (c1116210f9X.LLILZLL == 10) {
            str = "basic";
        } else {
            str = "up_grade";
        }
        c474500IjALIZ.LJJII(str, "gear_type");
        c474500IjALIZ.LJJII(c1116210f9X.LL, "comment_id");
        InterfaceC1116290f9f interfaceC1116290f9f = (InterfaceC1116290f9f) dataChannel.gg0(C1110110ezh.class);
        int i = 0;
        if (interfaceC1116290f9f != null) {
            iLIZIZ = interfaceC1116290f9f.LIZIZ();
        } else {
            iLIZIZ = 0;
        }
        c474500IjALIZ.LJJII(C1116190f9V.LIZ(iLIZIZ), "role");
        c474500IjALIZ.LJJII(Integer.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2()), "online_watch_users");
        if (c1116210f9X.LLILLJJLI.getId() == UserService.getInstance().user().getCurrentUserId()) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_self");
        c474500IjALIZ.LJJII(Long.valueOf(c1116210f9X.LLILZ), "server_start_time_ms");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "client_start_time_ms");
        c474500IjALIZ.LJJII(Long.valueOf(C158B.LIZ()), "client_start_time_ntp_ms");
        c474500IjALIZ.LJJII(c1116210f9X.LLJILJILJ, "source");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "has_received_msg");
        if (C500260Jjc.LJJIFFI((Boolean) dataChannel.gg0(C0TZM.class))) {
            if (InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue()) {
                str2 = "close";
            } else {
                str2 = "right_panel";
            }
            c474500IjALIZ.LJJII(str2, "public_area_status");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(DataChannel dataChannel, C1116210f9X c1116210f9X, String str, String str2) {
        String str3;
        if (dataChannel != null && c1116210f9X != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_click");
            LJ(c474500IjALIZ, dataChannel);
            c474500IjALIZ.LJJII(str, "action_type");
            c474500IjALIZ.LJJII(str2, "click_area");
            if (c1116210f9X.LLILZLL == 10) {
                str3 = "basic";
            } else {
                str3 = "up_grade";
            }
            c474500IjALIZ.LJJII(str3, "gear_type");
            c474500IjALIZ.LJJII(c1116210f9X.LL, "comment_id");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZIZ(DataChannel dataChannel, C1116210f9X c1116210f9X, String str, String str2) {
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_deleted");
        LJ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(str, "deleted_by");
        c474500IjALIZ.LJJII(c1116210f9X.LL, "comment_id");
        if (c1116210f9X.LLILZLL == 10) {
            str3 = "basic";
        } else {
            str3 = "up_grade";
        }
        c474500IjALIZ.LJJII(str3, "gear_type");
        c474500IjALIZ.LJJII(str2, "delete_position");
        c474500IjALIZ.LIZ();
    }
}
