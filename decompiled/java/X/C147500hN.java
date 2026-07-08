package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.00hN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C147500hN {
    public static boolean LIZ(int i) {
        return C1697810uHb.LJIIJJI(4, 5, 6, 7, 9).contains(Integer.valueOf(i));
    }

    public static void LIZIZ(long j, long j2, Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        if (!LIZ(iIntValue) || j == UserService.getInstance().user().getCurrentUserId()) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_paid_partnership_show");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "room_id");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LIZ();
    }
}
