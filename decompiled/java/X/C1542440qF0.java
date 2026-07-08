package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.Map;

/* JADX INFO: renamed from: X.0qF0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542440qF0 implements InterfaceC1537230q6b<Map<String, ?>> {
    @Override // X.InterfaceC1537230q6b
    public final /* bridge */ /* synthetic */ Map<String, ?> create() {
        return null;
    }

    @Override // X.InterfaceC1537230q6b
    public final Map<String, ?> LIZ(Object obj) {
        if (!(obj instanceof C1530150pvB)) {
            C1542450qF1.LIZ("Create GlobalProps error, the context is not valid.");
            return null;
        }
        C1530150pvB c1530150pvB = (C1530150pvB) obj;
        SparkContext sparkContext = (SparkContext) c1530150pvB.LIZ;
        C1537510q73 c1537510q73 = new C1537510q73();
        c1537510q73.put("containerID", (Object) sparkContext.containerId);
        c1537510q73.put("originUrl", (Object) sparkContext.LJJIL());
        C1545480qJu c1545480qJu = C1545480qJu.LIZ;
        String str = sparkContext.containerId;
        c1545480qJu.getClass();
        c1537510q73.put("queryItems", (Object) C08RQ.LIZJ(str));
        c1537510q73.putAll(sparkContext.extraRuntimeInfo);
        C1541480qDS c1541480qDS = c1530150pvB.LIZIZ;
        if (c1541480qDS == null) {
            C1542450qF1.LIZ("Create GlobalProps error, the initParams is null.");
            return null;
        }
        c1541480qDS.LJIIIIZZ().putAll(c1537510q73);
        return c1541480qDS.LJIIIIZZ();
    }
}
