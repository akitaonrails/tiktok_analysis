package X;

import com.bytedance.android.livesdk.userservice.UserService;
import webcast.api.game.CreateInfoResponse;

/* JADX INFO: renamed from: X.00k1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C163900k1 {
    public static CreateInfoResponse.ResponseData LIZ;

    public static void LIZ(int i, String str, boolean z) {
        int i2;
        if (!z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_live_create_room_result");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "uid");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "result");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "error_message");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
