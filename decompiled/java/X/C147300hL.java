package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00hL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C147300hL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Integer num, Integer num2) {
        try {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_system_comment_badge_filter_monitor");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(num, "original_number");
            c474500IjALIZ.LJJII(num2, "left_number");
            c474500IjALIZ.LJJII("too many", "reason");
            c474500IjALIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
