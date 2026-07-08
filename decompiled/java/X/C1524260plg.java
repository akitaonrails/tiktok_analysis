package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0plg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524260plg implements InterfaceC1163130gND {
    public final WeakReference<SparkContext> LL;
    public final Set<String> LLILLJJLI = new LinkedHashSet();
    public final AtomicInteger LLILLL = new AtomicInteger(0);
    public final AtomicInteger LLILZ = new AtomicInteger(0);
    public final AtomicBoolean LLILZIL = new AtomicBoolean(false);

    @Override // X.InterfaceC1163130gND
    public final void release() {
        final C1524270plh c1524270plh;
        SparkContext sparkContext = this.LL.get();
        if (sparkContext == null || (c1524270plh = sparkContext.session) == null) {
            return;
        }
        final boolean z = sparkContext.isNewAuthChecker;
        final String strLJJIL = sparkContext.LJJIL();
        final String str = sparkContext.containerId;
        ExecutorService executorService = C2281108wj.LIZ;
        C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new Runnable() { // from class: X.0plf
            public final void LIZ() throws JSONException {
                if (this.LL.LLILZIL.compareAndSet(false, true)) {
                    C1524260plg c1524260plg = this.LL;
                    C1524270plh c1524270plh2 = c1524270plh;
                    String str2 = strLJJIL;
                    String str3 = str;
                    boolean z2 = z;
                    c1524260plg.getClass();
                    double sampleRatio = C1545580qK4.LIZIZ.getSampleRatio(c1524270plh2.LIZ());
                    if (sampleRatio > 0.0d) {
                        double dNextDouble = AbstractC19994813Le.Default.nextDouble();
                        C1490740otc c1490740otc = C1490740otc.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("sample_rate=");
                        sbLIZ.append(sampleRatio);
                        sbLIZ.append(", random=");
                        sbLIZ.append(dNextDouble);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "RomaSDK", 2);
                        if (dNextDouble > sampleRatio && sampleRatio < 1.0d) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("report is skipped, sample_rate=");
                            sbLIZ2.append(sampleRatio);
                            sbLIZ2.append(", identity=");
                            sbLIZ2.append(c1524270plh2.LIZ());
                            C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ2), null, "RomaSDK", 2);
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", c1524270plh2.LIZJ);
                        String str4 = c1524270plh2.LIZ;
                        if (str4 != null) {
                            jSONObject.put("page_name", str4);
                        }
                        String str5 = c1524270plh2.LIZIZ;
                        if (str5 != null) {
                            jSONObject.put("pattern", str5);
                        }
                        jSONObject.put("bridges", C13LP.LJJLIIIJ(c1524260plg.LLILLJJLI, ",", null, null, 0, null, null, 62));
                        jSONObject.put("schema", str2);
                        jSONObject.put("sample_rate", sampleRatio);
                        if (z2) {
                            jSONObject.put("bridge_call_count", c1524260plg.LLILLL.get());
                            jSONObject.put("bridge_call_fail_count", c1524260plg.LLILZ.get());
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("report jsb:");
                        sbLIZ3.append(jSONObject);
                        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ3), null, "RomaSDK", 2);
                        C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_page_permissions");
                        c1520360pfO.LIZLLL = jSONObject;
                        c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                        C1520080pew.LIZ(str3, c1520360pfO.LIZ());
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BridgeCollectSession@e032.release$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BridgeCollectSession@e032.release$1");
            }
        });
    }

    public C1524260plg(WeakReference<SparkContext> weakReference) {
        this.LL = weakReference;
    }
}
