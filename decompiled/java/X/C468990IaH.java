package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveUseSurfaceViewExperiment;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468990IaH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        if (LiveUseSurfaceViewExperiment.INSTANCE.isEnable()) {
            Pair pair = new Pair(Integer.valueOf(R.layout.gj_), "ttlive_fragment_live_play");
            C0J3Y.LIZ.LJIILL(((Number) pair.getFirst()).intValue(), null, 2, C485760J3e.LIZ((String) pair.getSecond()), EnumC485780J3g.UN_SET, false);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        LiveToolbarReuseOptimizeSetting liveToolbarReuseOptimizeSetting = LiveToolbarReuseOptimizeSetting.INSTANCE;
        if (!liveToolbarReuseOptimizeSetting.enableStrategy("AUDIENCE_SLOT")) {
            LIZJ();
        }
        if (liveToolbarReuseOptimizeSetting.enableStrategy("AUDIENCE_INTERACTION_FEATURES")) {
            return;
        }
        LIZIZ();
    }

    public static void LIZIZ() {
        Pair pair = ToolBarButtonWithTextExperiment.hasText() ? new Pair(Integer.valueOf(R.layout.huv), "ttlive_view_toolbar_audience_interaction_with_text") : new Pair(Integer.valueOf(R.layout.huu), "ttlive_view_toolbar_audience_interaction_no_text");
        C0J3Y c0j3y = C0J3Y.LIZ;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        C485730J3b c485730J3bLIZ = C485760J3e.LIZ((String) pair.getSecond());
        EnumC485780J3g enumC485780J3g = EnumC485780J3g.UN_SET;
        c0j3y.getClass();
        C0J3Y.LJIILIIL(iIntValue, null, c485730J3bLIZ, enumC485780J3g, false);
    }

    public static void LIZJ() {
        Pair pair = ToolBarButtonWithTextExperiment.hasText() ? new Pair(Integer.valueOf(R.layout.huy), "ttlive_view_toolbar_audience_slot_icon_with_text") : new Pair(Integer.valueOf(R.layout.hux), "ttlive_view_toolbar_audience_slot_icon");
        C0J3Y c0j3y = C0J3Y.LIZ;
        int iIntValue = ((Number) pair.getFirst()).intValue();
        C485730J3b c485730J3bLIZ = C485760J3e.LIZ((String) pair.getSecond());
        EnumC485780J3g enumC485780J3g = EnumC485780J3g.UN_SET;
        c0j3y.getClass();
        C0J3Y.LJIILIIL(iIntValue, null, c485730J3bLIZ, enumC485780J3g, false);
    }
}
