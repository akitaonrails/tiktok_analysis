package X;

import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.TryModeFixAbSetting;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UON, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UON {
    public static RoomCreateInfo LIZ;
    public static C099G LIZIZ;
    public static AnonymousClass0956 LIZJ;
    public static Boolean LIZLLL;
    public static Boolean LJ;
    public static Integer LJFF;

    public static int LIZ() {
        Integer num = LJFF;
        if (num != null && num.intValue() == 1 && TryModeFixAbSetting.INSTANCE.enable()) {
            return Intrinsics.LJFF(InterfaceC772600USk.zf.LIZIZ(), Boolean.FALSE) ? 1 : 0;
        }
        Integer num2 = LJFF;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public static void LIZJ(boolean z) {
        AnonymousClass0956 anonymousClass0956;
        LIZ = null;
        LIZIZ = null;
        AnonymousClass0956 anonymousClass09562 = LIZJ;
        if (anonymousClass09562 != null && anonymousClass09562.isActive() && (anonymousClass0956 = LIZJ) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (z) {
            LIZLLL = null;
            LJ = null;
            LJFF = null;
        }
    }

    public static void LIZIZ(int i, long j, String str) {
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_broadcast_path_get_room_create_info_from_tools", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LJJII("normal", "enter_from");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_success");
        c474500IjALIZIZ.LJJII(str, "error");
        c474500IjALIZIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZIZ.LIZ();
    }
}
