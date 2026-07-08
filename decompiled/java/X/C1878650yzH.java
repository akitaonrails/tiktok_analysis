package X;

import com.bytedance.touchpoint.api.service.IIncentiveSparkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0yzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878650yzH {
    public static final C1878650yzH LIZ = new C1878650yzH();

    public static boolean LIZ() {
        boolean z;
        IIncentiveSparkService iIncentiveSparkService = (IIncentiveSparkService) PluggableExtentionKt.pluggableSpi$default(IIncentiveSparkService.class, false, false, false, 14, null);
        if (iIncentiveSparkService != null) {
            iIncentiveSparkService.LIZJ();
            z = true;
        } else {
            z = false;
        }
        return z && ((Boolean) C267090AdP.LIZ.getValue()).booleanValue();
    }
}
