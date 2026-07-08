package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06Mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1595406Mm extends AbstractC1538690q8x {
    public final Map<String, Long> LIZIZ = new LinkedHashMap();
    public final Map<String, Boolean> LIZJ = new LinkedHashMap();

    @Override // X.AbstractC1538690q8x
    public final String LJI() {
        return "compliance_hybrid";
    }

    @Override // X.AbstractC1538690q8x
    public final void LJ(SparkContext sparkContext, String str) {
        final String strLJIJI = sparkContext.LJIJI();
        final String str2 = sparkContext.containerId;
        C793770VBv.LJII("pns_hybrid_kit_container_init", new JSONObject().put("url", strLJIJI), null, null);
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.06Mn
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                long jCurrentTimeMillis;
                if (!Intrinsics.LJFF(((LinkedHashMap) this.LLILLJJLI.LIZJ).get(str2), Boolean.TRUE)) {
                    Long lRemove = this.LLILLJJLI.LIZIZ.remove(str2);
                    if (lRemove != null) {
                        jCurrentTimeMillis = System.currentTimeMillis() - lRemove.longValue();
                    } else {
                        jCurrentTimeMillis = 0;
                    }
                    C1595406Mm c1595406Mm = this.LLILLJJLI;
                    String str3 = strLJIJI;
                    c1595406Mm.getClass();
                    C793770VBv.LJII("pns_hybrid_kit_load_success", new JSONObject().put("load_time", jCurrentTimeMillis).put("url", str3), null, null);
                    return;
                }
                this.LLILLJJLI.LIZIZ.remove(str2);
                this.LLILLJJLI.LIZJ.remove(str2);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str3) {
                this.LLILLJJLI.LIZJ.put(str2, Boolean.TRUE);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str3) {
                this.LLILLJJLI.LIZIZ.put(str2, Long.valueOf(System.currentTimeMillis()));
                this.LLILLJJLI.LIZJ.put(str2, Boolean.FALSE);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str3, C1542120qEU c1542120qEU) {
                LJLI(interfaceC1541990qEH, str3, c1542120qEU.LIZIZ);
                this.LLILLJJLI.LIZJ.put(str2, Boolean.TRUE);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str3, String str4) {
                long jCurrentTimeMillis;
                LJJZZIII(interfaceC1541990qEH, str3);
                this.LLILLJJLI.LIZJ.put(str2, Boolean.TRUE);
                Long lRemove = this.LLILLJJLI.LIZIZ.remove(str2);
                if (lRemove != null) {
                    jCurrentTimeMillis = System.currentTimeMillis() - lRemove.longValue();
                } else {
                    jCurrentTimeMillis = 0;
                }
                this.LLILLJJLI.getClass();
                JSONObject jSONObject = new JSONObject();
                if (str4 == null) {
                    str4 = "unknown";
                }
                C793770VBv.LJII("pns_hybrid_kit_load_error", jSONObject.put("error_code", str4).put("url", str3).put("load_time", jCurrentTimeMillis), null, null);
            }
        });
        super.LJ(sparkContext, str);
    }
}
