package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.broadcast.record.LiveRecordManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0UaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774850UaR {
    public static long LIZ;
    public static String LIZIZ;

    public static void LIZLLL() {
        LIZ = SystemClock.uptimeMillis();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_floating_ball_show");
        c474500IjALIZ.LJIL();
        LiveRecordManager.LL.getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(LiveRecordManager.LLILZ)) ? 1 : 0), "is_record");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_discard_popup");
        c474500IjALIZ.LJIL();
        LiveRecordManager.LL.getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(LiveRecordManager.LLIZ), "duration");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII("click_floating_ball", "discard_method");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, boolean z) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_floating_ball_click");
        c474500IjALIZ.LJIL();
        LiveRecordManager.LL.getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(LiveRecordManager.LLILZ)) ? 1 : 0), "is_record");
        c474500IjALIZ.LJJII(str, "click_position");
        if (z) {
            str2 = "close";
        } else {
            str2 = "open";
        }
        c474500IjALIZ.LJJII(str2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LIZ();
    }

    public static void LJ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_icon");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "action_type");
        LiveRecordManager.LL.getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(LiveRecordManager.LLILZ)) ? 1 : 0), "is_record");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recording_toast_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "toast_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(DataChannel dataChannel, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_authorize_popup");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(str2, "popup_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(int i, DataChannel dataChannel, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_record_result");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LiveRecordManager.LL.getClass();
        c474500IjALIZ.LJJII(Integer.valueOf(LiveRecordManager.LLIZ), "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (!z) {
            c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        }
        c474500IjALIZ.LIZ();
    }
}
