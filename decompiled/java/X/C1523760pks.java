package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigItem;
import com.ss.android.ugc.aweme.ecommerce.sparkpreload.ECSparkPreloadConfigModel;
import java.util.List;

/* JADX INFO: renamed from: X.0pks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523760pks implements InterfaceC1523710pkn {
    public static final C1523760pks LIZ = new C1523760pks();
    public static final ECSparkPreloadConfigModel LIZIZ = new ECSparkPreloadConfigModel(false, null, false);

    public static ECSparkPreloadConfigModel LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECSparkPreloadConfigModel eCSparkPreloadConfigModel = LIZIZ;
        ECSparkPreloadConfigModel eCSparkPreloadConfigModel2 = (ECSparkPreloadConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_spark_common_preload_config", ECSparkPreloadConfigModel.class, eCSparkPreloadConfigModel);
        return eCSparkPreloadConfigModel2 != null ? eCSparkPreloadConfigModel2 : eCSparkPreloadConfigModel;
    }

    @Override // X.InterfaceC1523710pkn
    public final List<ECSparkPreloadConfigItem> LIZ() {
        if (LIZIZ().enable) {
            return LIZIZ().preloadConfig;
        }
        return null;
    }
}
