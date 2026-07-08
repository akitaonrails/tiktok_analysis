package X;

import com.ss.android.ugc.aweme.ml.feature.flash.FlashCommonFreeRideApiConfig;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashCommonFreeRideApiConfigs;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508910pMv extends C09AY implements Function0<List<? extends FlashCommonFreeRideApiConfig>> {
    public C1508910pMv() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends FlashCommonFreeRideApiConfig> invoke() {
        Collection<FlashCommonFreeRideApiConfig> collectionValues;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FlashCommonFreeRideApiConfigs flashCommonFreeRideApiConfigs = C1508920pMw.LIZ;
        FlashCommonFreeRideApiConfigs flashCommonFreeRideApiConfigs2 = (FlashCommonFreeRideApiConfigs) c0c64LJIILLIIL.LJJII(FlashCommonFreeRideApiConfigs.class, flashCommonFreeRideApiConfigs, "flash_common_free_ride_api_config", true);
        if (flashCommonFreeRideApiConfigs2 != null) {
            flashCommonFreeRideApiConfigs = flashCommonFreeRideApiConfigs2;
        }
        Map<String, FlashCommonFreeRideApiConfig> map = flashCommonFreeRideApiConfigs.configMap;
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        return C13LP.LLIIII(collectionValues);
    }
}
