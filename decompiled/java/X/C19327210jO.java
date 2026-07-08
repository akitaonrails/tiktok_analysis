package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* JADX INFO: renamed from: X.10jO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19327210jO {
    public static final WebKitView LIZ(SparkContext sparkContext) {
        C1529870puj c1529870puj = C1529870puj.LIZ;
        String str = sparkContext.containerId;
        c1529870puj.getClass();
        InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str);
        if (interfaceC1541990qEHLJFF != null && (interfaceC1541990qEHLJFF instanceof WebKitView)) {
            return (WebKitView) interfaceC1541990qEHLJFF;
        }
        return null;
    }
}
