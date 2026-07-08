package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveColdBootApiOptConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CPL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CPL extends C09AY implements Function0<LiveColdBootApiOptConfig> {
    public C0CPL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.LiveColdBootApiOptConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LiveColdBootApiOptConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveColdBootApiOptConfig liveColdBootApiOptConfig = C0CPM.LIZLLL;
        ?? LJJII = c0c64LJIILLIIL.LJJII(LiveColdBootApiOptConfig.class, liveColdBootApiOptConfig, "live_webcast_cold_boot_api_opt", true);
        return LJJII != 0 ? LJJII : liveColdBootApiOptConfig;
    }
}
