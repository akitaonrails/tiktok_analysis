package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.performance.EcPerfCollectConfigModel;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NWT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NWT {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(599));
    public static final EcPerfCollectConfigModel LIZIZ = new EcPerfCollectConfigModel(false, null, 0.0f, 7, null);

    public static boolean LIZ() {
        EcPerfCollectConfigModel ecPerfCollectConfigModelLIZIZ = LIZIZ();
        return ecPerfCollectConfigModelLIZIZ.enable && ((Number) LIZ.getValue()).floatValue() < ecPerfCollectConfigModelLIZIZ.rate;
    }

    public static EcPerfCollectConfigModel LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcPerfCollectConfigModel ecPerfCollectConfigModel = LIZIZ;
        EcPerfCollectConfigModel ecPerfCollectConfigModel2 = (EcPerfCollectConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_perf_collect_config", EcPerfCollectConfigModel.class, ecPerfCollectConfigModel);
        return ecPerfCollectConfigModel2 != null ? ecPerfCollectConfigModel2 : ecPerfCollectConfigModel;
    }
}
