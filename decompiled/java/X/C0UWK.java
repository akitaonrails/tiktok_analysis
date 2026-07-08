package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* JADX INFO: renamed from: X.0UWK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWK {
    public static final void LIZ(int i, String str, String str2, long j, String str3, String str4, String str5) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_definition_manual_speedtest_result");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LJJII(str, "test_result");
        c474500IjALIZ.LJJII(str2, "cancel_reason");
        c474500IjALIZ.LJJII(str3, "previous_definition");
        c474500IjALIZ.LJJII(str4, "current_definition");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "failure_code");
        c474500IjALIZ.LJJII(str5, "failure_reason");
        c474500IjALIZ.LIZ();
    }
}
