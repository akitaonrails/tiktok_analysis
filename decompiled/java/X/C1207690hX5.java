package X;

import com.ss.android.ugc.tiktok.location.popup.config.FypPoiPermissionFrequencyConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hX5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207690hX5 extends C09AY implements Function0<FypPoiPermissionFrequencyConfig> {
    public C1207690hX5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.tiktok.location.popup.config.FypPoiPermissionFrequencyConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FypPoiPermissionFrequencyConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FypPoiPermissionFrequencyConfig fypPoiPermissionFrequencyConfig = C1207680hX4.LIZIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(FypPoiPermissionFrequencyConfig.class, fypPoiPermissionFrequencyConfig, "gps_frequency_control", false);
        if (LJJII != 0) {
            return LJJII;
        }
        C1207680hX4.LIZ.getClass();
        return fypPoiPermissionFrequencyConfig;
    }
}
