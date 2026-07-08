package X;

import com.ss.android.ugc.aweme.ml.feature.flash.FlashFeatureSetConfig;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashFeatureSetConfigs;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Aog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190801Aog extends C09AY implements Function0<List<? extends FlashFeatureSetConfig>> {
    public C2190801Aog() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends FlashFeatureSetConfig> invoke() {
        Collection<FlashFeatureSetConfig> collectionValues;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FlashFeatureSetConfigs flashFeatureSetConfigs = C2190811Aoh.LIZ;
        FlashFeatureSetConfigs flashFeatureSetConfigs2 = (FlashFeatureSetConfigs) c0c64LJIILLIIL.LJJII(FlashFeatureSetConfigs.class, flashFeatureSetConfigs, "flash_client_ai_feature_config", true);
        if (flashFeatureSetConfigs2 != null) {
            flashFeatureSetConfigs = flashFeatureSetConfigs2;
        }
        Map<String, FlashFeatureSetConfig> map = flashFeatureSetConfigs.configMap;
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        return C13LP.LLIIII(collectionValues);
    }
}
