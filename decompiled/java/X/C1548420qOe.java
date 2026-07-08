package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* JADX INFO: renamed from: X.0qOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548420qOe {
    public static final WebKitView LIZ(SparkContext sparkContext) {
        C1529870puj c1529870puj = C1529870puj.LIZ;
        String str = sparkContext.containerId;
        c1529870puj.getClass();
        InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str);
        if (interfaceC1541990qEHLJFF == null || !(interfaceC1541990qEHLJFF instanceof WebKitView)) {
            return null;
        }
        return (WebKitView) interfaceC1541990qEHLJFF;
    }

    public static final void LIZIZ(SparkContext sparkContext, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Boolean) {
            sparkContext.LJJL(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            sparkContext.LJJJLL(((Number) obj).doubleValue(), str);
            return;
        }
        if (obj instanceof Integer) {
            sparkContext.LJJJLZIJ(((Number) obj).intValue(), str);
        } else {
            if (!(obj instanceof String) || ((CharSequence) obj).length() <= 0) {
                return;
            }
            sparkContext.LJJJZ(str, (String) obj);
        }
    }
}
