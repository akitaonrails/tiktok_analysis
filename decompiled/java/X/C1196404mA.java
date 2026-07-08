package X;

import com.ss.android.ugc.aweme.ml.feature.flash.FlashApplogConfig;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashApplogConfigs;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04mA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1196404mA extends C09AY implements Function0<List<? extends FlashApplogConfig>> {
    public C1196404mA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends FlashApplogConfig> invoke() {
        Collection<FlashApplogConfig> collectionValues;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FlashApplogConfigs flashApplogConfigs = C1196504mB.LIZ;
        FlashApplogConfigs flashApplogConfigs2 = (FlashApplogConfigs) c0c64LJIILLIIL.LJJII(FlashApplogConfigs.class, flashApplogConfigs, "flash_free_ride_applog_config", true);
        if (flashApplogConfigs2 != null) {
            flashApplogConfigs = flashApplogConfigs2;
        }
        Map<String, FlashApplogConfig> map = flashApplogConfigs.configMap;
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        return C13LP.LLIIII(collectionValues);
    }
}
