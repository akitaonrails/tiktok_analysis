package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomCommonImageOptimizeModel;

/* JADX INFO: renamed from: X.0kXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323240kXS {
    public static final EcomCommonImageOptimizeModel LIZ;

    static {
        EcomCommonImageOptimizeModel ecomCommonImageOptimizeModel = new EcomCommonImageOptimizeModel();
        EcomCommonImageOptimizeModel ecomCommonImageOptimizeModel2 = (EcomCommonImageOptimizeModel) SettingsManager.LIZLLL().LJIIIIZZ("ecom_common_image_optimize", EcomCommonImageOptimizeModel.class, ecomCommonImageOptimizeModel);
        if (ecomCommonImageOptimizeModel2 != null) {
            ecomCommonImageOptimizeModel = ecomCommonImageOptimizeModel2;
        }
        LIZ = ecomCommonImageOptimizeModel;
    }
}
