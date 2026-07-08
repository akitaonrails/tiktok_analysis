package X;

import com.bytedance.android.livesdk.userservice.UserService;
import qo2.w;

/* JADX INFO: renamed from: X.010j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2639010j {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C474500IjA c474500IjA, String str) {
        String str2;
        w.LIZ.getClass();
        c474500IjA.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjA.LJJII(w.LJIIL(), "enter_method");
        c474500IjA.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
        c474500IjA.LJJII(Long.valueOf(w.LJ()), "anchor_id");
        c474500IjA.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjA.LJJII(str, "goal_status");
        if (C2640010k.LIZIZ()) {
            str2 = "anchor";
        } else {
            str2 = "user";
        }
        c474500IjA.LJJII(str2, "user_type");
    }

    public static void LIZIZ(long j, Integer num, String str, boolean z) {
        int i;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_goal_fetch_status");
        c474500IjALIZ.LJIL();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_anchor");
        c474500IjALIZ.LJJII(num, "error_code");
        c474500IjALIZ.LJJII(str, "request_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LIZ();
    }
}
