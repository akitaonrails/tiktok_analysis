package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomApiInterceptConfigModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07dZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1907507dZ {
    public static final EcomApiInterceptConfigModel LIZ = new EcomApiInterceptConfigModel(null, null, Boolean.FALSE, null, null, null);

    public static boolean LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomApiInterceptConfigModel ecomApiInterceptConfigModel = LIZ;
        EcomApiInterceptConfigModel ecomApiInterceptConfigModel2 = (EcomApiInterceptConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_api_intercept_config", EcomApiInterceptConfigModel.class, ecomApiInterceptConfigModel);
        if (ecomApiInterceptConfigModel2 != null) {
            ecomApiInterceptConfigModel = ecomApiInterceptConfigModel2;
        }
        return Intrinsics.LJFF(ecomApiInterceptConfigModel.enable, Boolean.TRUE);
    }
}
