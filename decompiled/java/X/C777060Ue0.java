package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;

/* JADX INFO: renamed from: X.0Ue0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777060Ue0 {
    public static final void LIZ(EnumC777090Ue3 enumC777090Ue3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_guide_notification_close_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(enumC777090Ue3.getValue(), "notification_type");
        c474500IjALIZ.LJJII("hover", "event_page");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZIZ(EnumC777090Ue3 enumC777090Ue3, EnumC777070Ue1 enumC777070Ue1) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_guide_notification_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(LiveMode.SCREEN_RECORD.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(enumC777090Ue3.getValue(), "notification_type");
        c474500IjALIZ.LJJII(enumC777070Ue1.getValue(), "event_page");
        c474500IjALIZ.LJJII("", "if_close");
        c474500IjALIZ.LIZ();
    }
}
