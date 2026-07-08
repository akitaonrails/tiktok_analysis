package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomImagePriorityConfigBean;

/* JADX INFO: renamed from: X.0kXR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323230kXR {
    public static final EcomImagePriorityConfigBean LIZ;

    static {
        EcomImagePriorityConfigBean ecomImagePriorityConfigBean = new EcomImagePriorityConfigBean();
        EcomImagePriorityConfigBean ecomImagePriorityConfigBean2 = (EcomImagePriorityConfigBean) SettingsManager.LIZLLL().LJIIIIZZ("ecom_image_priority", EcomImagePriorityConfigBean.class, ecomImagePriorityConfigBean);
        if (ecomImagePriorityConfigBean2 != null) {
            ecomImagePriorityConfigBean = ecomImagePriorityConfigBean2;
        }
        LIZ = ecomImagePriorityConfigBean;
    }
}
