package X;

import com.bytedance.android.livesdk.livesetting.gift.GiftPanelOptimiseMetrics;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0fQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126770fQZ {
    public static final void LIZ(long j, long j2, String str) {
        if (GiftPanelOptimiseMetrics.INSTANCE.isOptimised()) {
            return;
        }
        HashMap map = new HashMap();
        map.put("time", String.valueOf(j));
        map.put("tag", "ttlive_sdk");
        map.put("gift_id", String.valueOf(j2));
        map.put("gift_icon_url", str);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_gift_icon_download_time")) {
            C1CC2.LJIIJJI(0, "ttlive_gift_icon_download_time", map, j);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_gift_icon_download_time");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
