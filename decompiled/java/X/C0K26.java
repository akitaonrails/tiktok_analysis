package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0K26, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K26 {
    public static final C0K26 LIZ = new C0K26();

    public static void LIZIZ(String str, String str2) {
        String currentUserID;
        C511970K5z c511970K5z = new C511970K5z("livesdk_anchor_subscription_space_newpost_click");
        c511970K5z.LIZIZ(str, "post_type");
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
            currentUserID = "";
        }
        c511970K5z.LIZIZ(currentUserID, "anchor_id");
        c511970K5z.LIZIZ(str2, "space_show_entrance");
        c511970K5z.LIZLLL();
    }

    public static void LIZJ(String str, String str2, String str3) {
        String currentUserID;
        C511970K5z c511970K5z = new C511970K5z("livesdk_anchor_subscription_space_newpost_progress");
        c511970K5z.LIZIZ("topic", "post_type");
        c511970K5z.LIZIZ(str, "click_type");
        c511970K5z.LIZIZ(str2, "topic_type");
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
            currentUserID = "";
        }
        c511970K5z.LIZIZ(currentUserID, "anchor_id");
        c511970K5z.LIZIZ(str3, "space_show_entrance");
        c511970K5z.LIZLLL();
    }

    public static void LIZ(int i, String str, String str2, String str3) {
        C511970K5z c511970K5z = new C511970K5z("livesdk_anchor_subscription_space_activity_message");
        c511970K5z.LIZIZ(str, "action_type");
        c511970K5z.LIZIZ(str2, "anchor_id");
        c511970K5z.LIZIZ(str3, "space_show_entrance");
        c511970K5z.LIZIZ(Integer.valueOf(i), "message_count");
        c511970K5z.LIZLLL();
    }
}
