package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0f9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116240f9a {
    public static int LIZ;
    public static int LIZIZ;
    public static int LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final HashSet<String> LJI = new HashSet<>();

    public static void LIZIZ(C474500IjA c474500IjA, DataChannel dataChannel) {
        String str;
        int iLIZIZ;
        LiveMode streamType;
        c474500IjA.LJIJJLI(dataChannel);
        if (C500260Jjc.LJIJI(dataChannel)) {
            c474500IjA.LJJII(Integer.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).WS1()), "user_rank");
            c474500IjA.LJJII("user", "user_type");
        } else {
            c474500IjA.LJJII("anchor", "user_type");
        }
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str = streamType.logStreamingType;
        } else {
            str = null;
        }
        c474500IjA.LJJ(str);
        c474500IjA.LJJII(Integer.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2()), "online_watch_users");
        InterfaceC1116290f9f interfaceC1116290f9f = (InterfaceC1116290f9f) dataChannel.gg0(C1110110ezh.class);
        if (interfaceC1116290f9f != null) {
            iLIZIZ = interfaceC1116290f9f.LIZIZ();
        } else {
            iLIZIZ = 0;
        }
        c474500IjA.LJJII(C1116190f9V.LIZ(iLIZIZ), "role");
        if (C497740JfY.LJIL()) {
            c474500IjA.LJJII("portrait", "room_orientation");
        } else {
            c474500IjA.LJJII("landscape", "room_orientation");
        }
    }

    public static void LIZJ(C474500IjA c474500IjA, Throwable th) {
        int i;
        if (th instanceof C477520Io2) {
            c474500IjA.LJJII("custom_api_error", "error_type");
            C477520Io2 c477520Io2 = (C477520Io2) th;
            c474500IjA.LJJII(Integer.valueOf(c477520Io2.getErrorCode()), "error_code");
            c474500IjA.LJJII(c477520Io2.getErrorMsg(), "error_msg");
            c474500IjA.LJJII(c477520Io2.getxTtLogId(), "log_id");
            return;
        }
        if (th instanceof C501470JlZ) {
            c474500IjA.LJJII("api_error", "error_type");
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            c474500IjA.LJJII(Integer.valueOf(c501470JlZ.getErrorCode()), "error_code");
            c474500IjA.LJJII(c501470JlZ.getErrorMsg(), "error_msg");
            c474500IjA.LJJII(c501470JlZ.getLogId(), "log_id");
            return;
        }
        if (th instanceof C1811850xFX) {
            c474500IjA.LJJII("net_error", "error_type");
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            c474500IjA.LJJII(Integer.valueOf(c1811850xFX.getCronetError()), "error_code");
            c474500IjA.LJJII(c1811850xFX.getMessage(), "error_msg");
            return;
        }
        if (th instanceof C1494690ozz) {
            c474500IjA.LJJII("cronet_io_error", "error_type");
            c474500IjA.LJJII(-2, "error_code");
            c474500IjA.LJJII(th.getMessage(), "error_msg");
        } else {
            if (th instanceof C1494450ozb) {
                c474500IjA.LJJII("net_not_available_error", "error_type");
                C497740JfY.LJII();
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!C036E.LIZ.LIZIZ()) {
                    i = -3;
                } else {
                    i = -4;
                }
                c474500IjA.LJJII(Integer.valueOf(i), "error_code");
                c474500IjA.LJJII(th.getMessage(), "error_msg");
                return;
            }
            c474500IjA.LJJII(th.getClass().getCanonicalName(), "error_type");
            c474500IjA.LJJII(-1, "error_code");
            c474500IjA.LJJII(th.getMessage(), "error_msg");
        }
    }

    public static void LIZ(C1116210f9X c1116210f9X, DataChannel dataChannel, boolean z) {
        String str;
        int i;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_show_finish");
        LIZIZ(c474500IjALIZ, dataChannel);
        if (c1116210f9X.LLILZLL == 10) {
            str = "basic";
        } else {
            str = "up_grade";
        }
        c474500IjALIZ.LJJII(str, "gear_type");
        c474500IjALIZ.LJJII(c1116210f9X.LL, "comment_id");
        if (c1116210f9X.LLILLJJLI.getId() == UserService.getInstance().user().getCurrentUserId()) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_self");
        c474500IjALIZ.LJJII(Long.valueOf((SystemClock.elapsedRealtime() - c1116210f9X.LLJI) - c1116210f9X.LLJILJIL), "duration");
        c474500IjALIZ.LJJII(c1116210f9X.LLJILJILJ, "source");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "has_received_msg");
        c474500IjALIZ.LIZ();
    }
}
