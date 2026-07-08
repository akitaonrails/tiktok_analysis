package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pWE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514680pWE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8) {
        try {
            ExecutorService executorService = C2281108wj.LIZ;
            C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new Runnable() { // from class: X.0pWD
                public final void LIZ() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    String str9 = str2;
                    String str10 = str3;
                    String str11 = str4;
                    String str12 = str5;
                    String str13 = str6;
                    String str14 = str7;
                    String str15 = str8;
                    jSONObject.put("optimization_name", str9);
                    jSONObject.put("optimization_stage", str10);
                    jSONObject.put("config_method", str11);
                    jSONObject.put("schema", str12);
                    jSONObject.put("bid", str13);
                    jSONObject.put("extra", str14);
                    jSONObject.put("state", str15);
                    C1520360pfO c1520360pfO = new C1520360pfO("hybrid_monitor_container_optimization_capability");
                    c1520360pfO.LIZIZ = str6;
                    c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
                    c1520360pfO.LIZLLL = jSONObject;
                    c1520360pfO.LJIIIIZZ = str;
                    C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                    String str16 = str;
                    if (str16 == null || a0.LJJJIL(str16)) {
                        C1520380pfQ.LIZ.getClass();
                        C1520380pfQ.LIZ(c1520350pfNLIZ);
                    } else {
                        C1520200pf8.LIZ.getClass();
                        C1520200pf8.LIZ(c1520350pfNLIZ);
                    }
                    String str17 = str;
                    if (str17 != null) {
                        C1491570oux c1491570oux = C1491570oux.LIZ;
                        final String str18 = str2;
                        final String str19 = str3;
                        final String str20 = str4;
                        final String str21 = str7;
                        final String str22 = str8;
                        InterfaceC1491630ov3 interfaceC1491630ov3 = new InterfaceC1491630ov3() { // from class: X.0pEL
                            @Override // X.InterfaceC1491630ov3
                            public final void onReceiveValue(Object obj) {
                                C1491690ov9 c1491690ov9 = (C1491690ov9) obj;
                                if (c1491690ov9 != null) {
                                    c1491690ov9.LJ(C2097608Jq.LJIIIIZZ(new Pair("name", str18), new Pair("stage", str19), new Pair("config_method", str20), new Pair("extra", str21), new Pair("state", str22)));
                                }
                            }
                        };
                        c1491570oux.getClass();
                        C1491570oux.LJIIIIZZ(str17, "spark_opt", interfaceC1491630ov3);
                    }
                    C1490740otc.LIZIZ(C1490740otc.LIZ, C786410Ut5.J3(jSONObject), null, "OptimizationCapability", 2);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MonitorCommonUtils@cd68.reportOptimizationCapability$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MonitorCommonUtils@cd68.reportOptimizationCapability$1$1");
                }
            });
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
