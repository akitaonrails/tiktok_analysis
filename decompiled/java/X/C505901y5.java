package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01y5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C505901y5 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Integer num, String str, String str2) {
        try {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_sync_resource", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
            c474500IjALIZIZ.LJJII(str, "access_key");
            c474500IjALIZIZ.LJJII(str2, "channel");
            c474500IjALIZIZ.LJJII(num, "grade");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                c474500IjALIZIZ.LJIL();
                c474500IjALIZIZ.LIZ();
            } else {
                c474500IjALIZIZ.LJJIJLIJ();
                c474500IjALIZIZ.LJJIJL();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(Boolean bool, Integer num, String str, String str2) {
        int i;
        try {
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_user_level_resource_exist_enter_room", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
            if (str == null) {
                str = "";
            }
            c474500IjALIZIZ.LJJII(str, "access");
            c474500IjALIZIZ.LJJII(str2, "channel");
            c474500IjALIZIZ.LJJII(num, "grade");
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                i = 1;
            } else {
                i = 0;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_exist");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
                c474500IjALIZIZ.LJIL();
                c474500IjALIZIZ.LIZ();
            } else {
                c474500IjALIZIZ.LJJIJLIJ();
                c474500IjALIZIZ.LJJIJL();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
