package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0UWT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UWT {
    public static final void LIZ(long j, String str, String str2, String str3, String str4) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_definition_auto_speedtest_result");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration_ms");
        c474500IjALIZ.LJJII(str, "test_result");
        c474500IjALIZ.LJJII(str2, "cancel_reason");
        c474500IjALIZ.LJJII(str3, "previous_definition");
        c474500IjALIZ.LJJII(str4, "current_definition");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(int i, String str, String str2, long j, String str3, String str4, String str5) {
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

    public static final void LIZJ(EnumC783720Uok enumC783720Uok, long j, long j2, String str, String str2, String str3, String str4, int i, String str5) {
        if (enumC783720Uok == EnumC783720Uok.AUTO) {
            LIZ(j2, str, str2, str3, str4);
        } else if (enumC783720Uok == EnumC783720Uok.MANUAL) {
            LIZIZ(i, str, str2, j, str3, str4, str5);
        }
    }
}
