package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.EcMixMallTrafficSourceConfigModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190481AoA extends C09AY implements Function0<EcMixMallTrafficSourceConfigModel> {
    public C2190481AoA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.mixmall.settings.EcMixMallTrafficSourceConfigModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final EcMixMallTrafficSourceConfigModel invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcMixMallTrafficSourceConfigModel ecMixMallTrafficSourceConfigModel = C2190471Ao9.LIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("ec_mix_mall_traffic_source_config", EcMixMallTrafficSourceConfigModel.class, ecMixMallTrafficSourceConfigModel);
        return LJIIIIZZ != 0 ? LJIIIIZZ : ecMixMallTrafficSourceConfigModel;
    }
}
