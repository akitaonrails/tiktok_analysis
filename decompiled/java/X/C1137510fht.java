package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;

/* JADX INFO: renamed from: X.0fht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1137510fht extends C1136640fgU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(final int i, final C1138600fje c1138600fje, final Long l, final Long l2, final String str, final boolean z) {
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
            return;
        }
        C1138350fjF.LIZ(new Runnable() { // from class: X.0fhs
            public final /* synthetic */ boolean LL = true;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveGiftVideoPlayerMonitor@155d.onEffectPlayFinished$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveGiftVideoPlayerMonitor@155d.onEffectPlayFinished$1");
            }

            public final void LIZ() {
                C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("gift_render_finished", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
                c474500IjALIZIZ.LJJII(Integer.valueOf(this.LL ? 1 : 0), "use_sdk");
                c474500IjALIZIZ.LJJII(Integer.valueOf(i), "res_type");
                c474500IjALIZIZ.LJJII(Boolean.valueOf(z), "is_success");
                c474500IjALIZIZ.LJJII(str, "reason");
                C1136940fgy.LIZ.getClass();
                c474500IjALIZIZ.LJJII(Integer.valueOf(C1136140ffg.LIZ()), "is_anchor");
                c474500IjALIZIZ.LJJII(l, "effect_id");
                c474500IjALIZIZ.LJJII(l2, "gift_id");
                C1138600fje c1138600fje2 = c1138600fje;
                if (c1138600fje2 != null) {
                    c474500IjALIZIZ.LJJII(c1138600fje2.LIZIZ, "log_id");
                    c474500IjALIZIZ.LJJII(Integer.valueOf(c1138600fje.LIZLLL ? 1 : 0), "is_local");
                    c474500IjALIZIZ.LJJII(Long.valueOf(c1138600fje.LIZ), "msg_id");
                }
                c474500IjALIZIZ.LJIL();
                c474500IjALIZIZ.LIZ();
            }
        });
    }
}
