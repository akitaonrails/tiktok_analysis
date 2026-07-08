package X;

import com.bytedance.applog.AppLog;

/* JADX INFO: renamed from: X.0Vgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC804230Vgj implements Runnable {
    public static final RunnableC804230Vgj LL = new RunnableC804230Vgj();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BSRSessionHandler@622e.reportLastSessionBSR$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BSRSessionHandler@622e.reportLastSessionBSR$1");
    }

    public static void LIZ() {
        if (C804320Vgs.LIZ().getFloat("last_bad_vv_radio", 0.0f) > C1DS1.LIZLLL()) {
            C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.VOD, EnumC804170Vgd.VOD_BAD_RATIO_HIGH, C804320Vgs.LIZ().getString("last_app_session", AppLog.getSessionId()), 0L, 16));
        }
        if (C1DS1.LIZIZ() && C804320Vgs.LIZ().getFloat("last_bad_scroll_ratio", 0.0f) > C1DS1.LIZ() && ((Boolean) C1DS1.LJJI.getValue()).booleanValue()) {
            C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.FEED_FORYOU, EnumC804170Vgd.FEED_FORYOU_SCROLL_BAD_RATIO_HIGH, C804320Vgs.LIZ().getString("last_app_session_for_scroll_drop_frame", AppLog.getSessionId()), 0L, 16));
        }
        if (C2214381Blc.LIZ() && C804320Vgs.LIZ().getFloat("last_bad_live_vv_radio", 0.0f) > C1DS1.LIZ()) {
            C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.LIVE, EnumC804170Vgd.LIVE_PLAY_RATIO_HIGH, C804320Vgs.LIZ().getString("last_app_session_live", AppLog.getSessionId()), 0L, 16));
        }
        C804320Vgs.LIZ().clear();
    }
}
