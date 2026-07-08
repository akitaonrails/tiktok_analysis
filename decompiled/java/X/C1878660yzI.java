package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.service.IIncentiveSparkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878660yzI {
    public static final boolean LIZ(SparkContext sparkContext) {
        IIncentiveSparkService iIncentiveSparkService;
        if (!Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(sparkContext.LJJIL()), "enable_saf"), "1") || (iIncentiveSparkService = (IIncentiveSparkService) PluggableExtentionKt.pluggableSpi$default(IIncentiveSparkService.class, false, false, false, 14, null)) == null || !iIncentiveSparkService.LIZ()) {
            return false;
        }
        return true;
    }
}
