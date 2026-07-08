package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheckClusterData;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.07eu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1915807eu {
    public static final SmartCheckClusterData LIZ = new SmartCheckClusterData(false, new LinkedHashMap());

    public static final SmartCheckClusterData LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        SmartCheckClusterData smartCheckClusterData = LIZ;
        SmartCheckClusterData smartCheckClusterData2 = (SmartCheckClusterData) settingsManagerLIZLLL.LJIIIIZZ("ecom_smartcheck_cluster_key", SmartCheckClusterData.class, smartCheckClusterData);
        return smartCheckClusterData2 != null ? smartCheckClusterData2 : smartCheckClusterData;
    }
}
