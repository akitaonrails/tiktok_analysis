package X;

import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0f9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116320f9i {
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
        c474500IjA.LJJII(Long.valueOf(id), "room_id");
        c474500IjA.LJJII(Long.valueOf(id2), "anchor_id");
        c474500IjA.LJJII(Integer.valueOf(((IRankService) C1161920gLG.LIZJ(IRankService.class)).WS1()), "user_rank");
        if (C497740JfY.LJIL()) {
            c474500IjA.LJJII("portrait", "room_orientation");
        } else {
            c474500IjA.LJJII("landscape", "room_orientation");
        }
    }

    public static void LIZIZ(C474500IjA c474500IjA, Throwable th, String str) {
        int i;
        if (th instanceof C477520Io2) {
            c474500IjA.LJJII("custom_api_error", "error_type");
            C477520Io2 c477520Io2 = (C477520Io2) th;
            c474500IjA.LJJII(Integer.valueOf(c477520Io2.getErrorCode()), str);
            c474500IjA.LJJII(c477520Io2.getErrorMsg(), "error_msg");
            c474500IjA.LJJII(c477520Io2.getxTtLogId(), "log_id");
            return;
        }
        if (th instanceof C501470JlZ) {
            c474500IjA.LJJII("api_error", "error_type");
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            c474500IjA.LJJII(Integer.valueOf(c501470JlZ.getErrorCode()), str);
            c474500IjA.LJJII(c501470JlZ.getErrorMsg(), "error_msg");
            c474500IjA.LJJII(c501470JlZ.getLogId(), "log_id");
            return;
        }
        if (th instanceof C1811850xFX) {
            c474500IjA.LJJII("net_error", "error_type");
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            c474500IjA.LJJII(Integer.valueOf(c1811850xFX.getCronetError()), str);
            c474500IjA.LJJII(c1811850xFX.getMessage(), "error_msg");
            return;
        }
        if (th instanceof C1494690ozz) {
            c474500IjA.LJJII("cronet_io_error", "error_type");
            c474500IjA.LJJII(-2, str);
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
                c474500IjA.LJJII(Integer.valueOf(i), str);
                c474500IjA.LJJII(th.getMessage(), "error_msg");
                return;
            }
            c474500IjA.LJJII(th.getClass().getCanonicalName(), "error_type");
            c474500IjA.LJJII(-1, str);
            c474500IjA.LJJII(th.getMessage(), "error_msg");
        }
    }

    public static void LIZJ(long j, String str, boolean z) {
        int i;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_panel_show");
        c474500IjALIZ.LJIL();
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "enter_from");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_qualified");
        c474500IjALIZ.LJJII(Long.valueOf(j), "unavailable_reason");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(int i, String str, String str2) {
        String str3;
        if (i != 10) {
            if (i != 20) {
                str3 = "";
            } else {
                str3 = "up_grade";
            }
        } else {
            str3 = "basic";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_send_fail");
        c474500IjALIZ.LJIL();
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LJJII(str3, "gear_type");
        c474500IjALIZ.LJJII(str, "error_code");
        c474500IjALIZ.LIZ();
    }
}
