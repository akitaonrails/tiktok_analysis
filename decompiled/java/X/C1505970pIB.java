package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.network.ECNetworkScoreConfigModel;

/* JADX INFO: renamed from: X.0pIB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505970pIB {
    public static final ECNetworkScoreConfigModel LIZ = new ECNetworkScoreConfigModel(false, false, 10000, new ECNetworkScoreConfigModel.Boundaries(new ECNetworkScoreConfigModel.Range(1000, 200), new ECNetworkScoreConfigModel.Range(200, 2000), new ECNetworkScoreConfigModel.Range(5, 20)), new ECNetworkScoreConfigModel.SampleThresholds(5, 3, 3), new ECNetworkScoreConfigModel.ComparisonMetrics(ECNetworkScoreConfigModel.Aggregation.P50, ECNetworkScoreConfigModel.Aggregation.P50, ECNetworkScoreConfigModel.Aggregation.MEAN), new ECNetworkScoreConfigModel.SwitchThresholds(2, 2));

    public static final ECNetworkScoreConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECNetworkScoreConfigModel eCNetworkScoreConfigModel = LIZ;
        ECNetworkScoreConfigModel eCNetworkScoreConfigModel2 = (ECNetworkScoreConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_network_score_config", ECNetworkScoreConfigModel.class, eCNetworkScoreConfigModel);
        return eCNetworkScoreConfigModel2 != null ? eCNetworkScoreConfigModel2 : eCNetworkScoreConfigModel;
    }
}
