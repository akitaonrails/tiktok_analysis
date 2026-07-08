package X;

import com.ss.android.ugc.aweme.ml.feature.flash.FlashFreeRideConfig;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashFreeRideConfigs;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508890pMt extends C09AY implements Function0<Map<String, ? extends FlashFreeRideConfig>> {
    public C1508890pMt() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends FlashFreeRideConfig> invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FlashFreeRideConfigs flashFreeRideConfigs = C1508900pMu.LIZ;
        FlashFreeRideConfigs flashFreeRideConfigs2 = (FlashFreeRideConfigs) c0c64LJIILLIIL.LJJII(FlashFreeRideConfigs.class, flashFreeRideConfigs, "flash_free_ride_config", true);
        if (flashFreeRideConfigs2 != null) {
            flashFreeRideConfigs = flashFreeRideConfigs2;
        }
        return flashFreeRideConfigs.configMap;
    }
}
