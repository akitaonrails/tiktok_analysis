package X;

import com.ss.android.ugc.aweme.ecommerce.image.EcomImageMonitorOptData;

/* JADX INFO: renamed from: X.0kcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326360kcU {
    public static final EcomImageMonitorOptData LIZ;

    static {
        EcomImageMonitorOptData ecomImageMonitorOptData = new EcomImageMonitorOptData(false, 30);
        EcomImageMonitorOptData ecomImageMonitorOptData2 = (EcomImageMonitorOptData) C0C64.LJIILLIIL().LJJII(EcomImageMonitorOptData.class, ecomImageMonitorOptData, "ecom_image_monitor_opt", true);
        if (ecomImageMonitorOptData2 != null) {
            ecomImageMonitorOptData = ecomImageMonitorOptData2;
        }
        LIZ = ecomImageMonitorOptData;
    }

    public static EcomImageMonitorOptData LIZ() {
        return LIZ;
    }
}
