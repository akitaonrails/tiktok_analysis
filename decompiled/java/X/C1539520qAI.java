package X;

import android.content.Context;
import com.bytedance.lynx.hybrid.ssr.cache.SSRCacheManager;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: X.0qAI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539520qAI {
    public static final C1539520qAI LIZ = new C1539520qAI();

    public static void LIZ(Context context, Map map, SparkSchemaParam sparkSchemaParam, C1537480q70 c1537480q70) {
        if (sparkSchemaParam == null) {
            return;
        }
        InterfaceC1539510qAH.LIZ.getClass();
        InterfaceC1539510qAH interfaceC1539510qAH = C1535760q4E.LIZIZ;
        int iIntValue = 1;
        if (interfaceC1539510qAH != null && interfaceC1539510qAH.LJ() && ((Boolean) C1539630qAT.LIZ(c1537480q70, sparkSchemaParam).getFirst()).booleanValue() && c1537480q70.ssrCacheKey == null && sparkSchemaParam.getSsrUrl() != null) {
            String string = UUID.randomUUID().toString();
            c1537480q70.ssrCacheKey = string;
            SSRCacheManager sSRCacheManager = SSRCacheManager.LIZ;
            Integer ssrMode = sparkSchemaParam.getSsrMode();
            if (ssrMode != null) {
                iIntValue = ssrMode.intValue();
            }
            sSRCacheManager.getClass();
            SSRCacheManager.LIZIZ(context, string, map, iIntValue, c1537480q70, sparkSchemaParam, 300L);
        }
    }
}
