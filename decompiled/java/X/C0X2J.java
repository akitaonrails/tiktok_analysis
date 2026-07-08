package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.network.EcomWeakNetworkConfigModel;
import java.util.List;

/* JADX INFO: renamed from: X.0X2J, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2J {
    public static final List<Integer> LIZ;
    public static final EcomWeakNetworkConfigModel LIZIZ;

    static {
        List<Integer> listLJIIJJI = C1697810uHb.LJIIJJI(40, 75, 400, 600, 1400, 1600);
        LIZ = listLJIIJJI;
        LIZIZ = new EcomWeakNetworkConfigModel(listLJIIJJI, 4, C1697810uHb.LJIIJJI(2, 3), 1400, C13BV.INSTANCE, 0);
    }

    public static final EcomWeakNetworkConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomWeakNetworkConfigModel ecomWeakNetworkConfigModel = LIZIZ;
        EcomWeakNetworkConfigModel ecomWeakNetworkConfigModel2 = (EcomWeakNetworkConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_weak_network_config", EcomWeakNetworkConfigModel.class, ecomWeakNetworkConfigModel);
        return ecomWeakNetworkConfigModel2 != null ? ecomWeakNetworkConfigModel2 : ecomWeakNetworkConfigModel;
    }
}
