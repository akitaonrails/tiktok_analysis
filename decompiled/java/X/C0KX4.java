package X;

import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0KX4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KX4 {
    public static final /* synthetic */ int LIZ = 0;

    public static C474500IjA LIZ(String str, Map map, Double d, boolean z) {
        C474500IjA c474500IjALIZIZ;
        if (!Intrinsics.LJFF("livesdk_linkmic_multi_guest_icon_show", str) && !Intrinsics.LJFF("livesdk_linkmic_perf_api_finish", str)) {
            c474500IjALIZIZ = C0IJT.LIZ(str);
            c474500IjALIZIZ.LJJIIZI(map);
        } else {
            c474500IjALIZIZ = C0IJT.LIZIZ(str, d);
            c474500IjALIZIZ.LJJIIZI(map);
        }
        if ((Intrinsics.LJFF("livesdk_linkmic_multi_guest_icon_show", str) || Intrinsics.LJFF("livesdk_multilive_mode_watch_duration", str) || Intrinsics.LJFF("livesdk_multilive_mode_watch_start", str) || Intrinsics.LJFF("livesdk_linkmic_perf_api_finish", str) || Intrinsics.LJFF("livesdk_video_box_gift_icon_effect_show", str) || Intrinsics.LJFF("livesdk_guest_connection_icon_show", str)) && BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJJII(w.LIZ.LIZJ(), "live_type");
            c474500IjALIZIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZIZ.LJJII(w.LJIJI(), "request_id");
            if (z) {
                c474500IjALIZIZ.LJJIJL();
            }
        } else {
            c474500IjALIZIZ.LJIL();
            if (z) {
                c474500IjALIZIZ.LIZ();
                return c474500IjALIZIZ;
            }
        }
        return c474500IjALIZIZ;
    }
}
