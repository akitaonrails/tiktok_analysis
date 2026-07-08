package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.settings.EcomCommonSparkInterceptorChannels;

/* JADX INFO: renamed from: X.0w9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769880w9q {
    public static final String[] LIZ;

    static {
        EcomCommonSparkInterceptorChannels ecomCommonSparkInterceptorChannels = new EcomCommonSparkInterceptorChannels();
        EcomCommonSparkInterceptorChannels ecomCommonSparkInterceptorChannels2 = (EcomCommonSparkInterceptorChannels) SettingsManager.LIZLLL().LJIIIIZZ("ecom_common_spark_interceptor_channels", EcomCommonSparkInterceptorChannels.class, ecomCommonSparkInterceptorChannels);
        if (ecomCommonSparkInterceptorChannels2 != null) {
            ecomCommonSparkInterceptorChannels = ecomCommonSparkInterceptorChannels2;
        }
        String[] strArr = ecomCommonSparkInterceptorChannels.channelsV2;
        if (strArr.length == 0) {
            strArr = ecomCommonSparkInterceptorChannels.channelsV1;
        }
        LIZ = strArr;
    }
}
