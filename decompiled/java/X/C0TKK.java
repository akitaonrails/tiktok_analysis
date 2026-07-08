package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TKK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKK {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(522));

    public static final long LIZ() {
        return ((Number) LIZ.getValue()).longValue();
    }

    public static final void LIZIZ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stream_quality_icon_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "room_id");
        c474500IjALIZ.LJJII(str, "btn_name");
        c474500IjALIZ.LJJII(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZJ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stream_quality_page_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "room_id");
        c474500IjALIZ.LJJII(str, "page_name");
        c474500IjALIZ.LJJII(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZLLL(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stream_quality_retest_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "room_id");
        c474500IjALIZ.LJJII(str, "btn_name");
        c474500IjALIZ.LJJII(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        c474500IjALIZ.LIZ();
    }

    public static final void LJ(int i, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stream_quality_toast");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "room_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "reason");
        c474500IjALIZ.LJJII(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        if (Intrinsics.LJFF(str, "click")) {
            c474500IjALIZ.LJJII(str2, "btn_name");
        }
        c474500IjALIZ.LIZ();
    }
}
