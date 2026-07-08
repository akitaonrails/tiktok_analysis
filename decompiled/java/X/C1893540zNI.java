package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.touchpoint.api.service.IIncentiveSparkService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS144S0110000_28;

/* JADX INFO: renamed from: X.0zNI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893540zNI {
    public static final C1893540zNI LIZ = new C1893540zNI();
    public static boolean LIZIZ = true;
    public static final Map<String, String> LIZJ = new LinkedHashMap();
    public static final List<String> LIZLLL = new ArrayList();
    public static volatile String LJ = "";

    public static void LIZ(SparkContext sparkContext, boolean z) {
        IIncentiveSparkService iIncentiveSparkService = (IIncentiveSparkService) PluggableExtentionKt.pluggableSpi$default(IIncentiveSparkService.class, false, false, false, 14, null);
        if (iIncentiveSparkService != null && iIncentiveSparkService.LIZIZ(sparkContext) && z) {
            return;
        }
        C01U6.LIZIZ(new AwS144S0110000_28(sparkContext, z, 10));
    }
}
