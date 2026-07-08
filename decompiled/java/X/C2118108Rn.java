package X;

import com.ss.android.ugc.aweme.ml.feature.flash.FlashFeedPbFeatureConfig;
import com.ss.android.ugc.aweme.ml.feature.flash.FlashFeedPbFeatureConfigs;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2118108Rn extends C09AY implements Function0<List<? extends FlashFeedPbFeatureConfig>> {
    public C2118108Rn() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends FlashFeedPbFeatureConfig> invoke() {
        Collection<FlashFeedPbFeatureConfig> collectionValues;
        Set<String> setKeySet;
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        FlashFeedPbFeatureConfigs flashFeedPbFeatureConfigs = C2118008Rm.LIZ;
        FlashFeedPbFeatureConfigs flashFeedPbFeatureConfigs2 = (FlashFeedPbFeatureConfigs) c0c64LJIILLIIL.LJJII(FlashFeedPbFeatureConfigs.class, flashFeedPbFeatureConfigs, "flash_feed_feature_config", true);
        if (flashFeedPbFeatureConfigs2 != null) {
            flashFeedPbFeatureConfigs = flashFeedPbFeatureConfigs2;
        }
        Map<String, FlashFeedPbFeatureConfig> map = flashFeedPbFeatureConfigs.configMap;
        if (map != null && (setKeySet = map.keySet()) != null) {
            C2118008Rm.LIZIZ.addAll(setKeySet);
        }
        Map<String, FlashFeedPbFeatureConfig> map2 = flashFeedPbFeatureConfigs.configMap;
        if (map2 == null || (collectionValues = map2.values()) == null) {
            return null;
        }
        return C13LP.LLIIII(collectionValues);
    }
}
