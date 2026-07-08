package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0plo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524340plo {
    public static final C01GW<C1524340plo> LJI = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(143));
    public final Thread.UncaughtExceptionHandler LIZ;
    public final List<String> LIZIZ;
    public final Map<String, C1550010qRD> LIZJ;
    public final C01GW LIZLLL;
    public final C1522450pil LJ;
    public final C1522460pim LJFF;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0pil] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0pim] */
    public C1524340plo() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = new Thread.UncaughtExceptionHandler() { // from class: X.0plp
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.LIZ.getClass();
                C1524340plo c1524340plo = this.LIZ;
                th.getCause();
                c1524340plo.getClass();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.LIZ.LIZ;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
            }
        };
        this.LIZ = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        this.LIZIZ = new ArrayList();
        this.LIZJ = new LinkedHashMap();
        new ConcurrentHashMap();
        new Regex("Chrome/(\\d+.\\d+.\\d+.\\d+)");
        this.LIZLLL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS548S0100000_4(this, 441));
        this.LJ = new InterfaceC1522470pin() { // from class: X.0pil
            @Override // X.InterfaceC1522470pin
            public final void LIZ(Integer num, JSONObject jSONObject, boolean z) {
                JSONObject jSONObject2;
                int iIntValue;
                JSONObject jSONObjectOptJSONObject;
                if (z) {
                    jSONObject2 = jSONObject;
                } else {
                    jSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("tag", "ttlive_sdk");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C844470XAv.LIZ.getClass();
                    try {
                        jSONObject2.put("aid", String.valueOf(C844470XAv.LJIIJ));
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    try {
                        jSONObject2.put("extra", jSONObject);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
                C338201Sy.LIZ.getClass();
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extra");
                if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("client_category")) != null && Intrinsics.LJFF(jSONObjectOptJSONObject.optString("type"), "lynx")) {
                    try {
                        C338201Sy.LIZ(jSONObjectOptJSONObject, jSONObjectOptJSONObject2.optJSONObject("client_metric"), jSONObjectOptJSONObject2.optJSONObject("client_extra"));
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIIZ("bd_hybrid_monitor_service_all_in_one", iIntValue, null, jSONObject2);
            }

            @Override // X.InterfaceC1522470pin
            public final void LIZJ(Exception exc, String str, Map<String, String> map) {
                C1AF0.LJI(exc, str, map);
            }
        };
        this.LJFF = new InterfaceC1550070qRJ() { // from class: X.0pim
            public String LIZ = "";
            public String LIZIZ = "";

            @Override // X.InterfaceC1550070qRJ
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1550070qRJ
            public final void LJFF() {
            }

            public static String LIZJ() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("webview_is_need_monitor", true);
                jSONObject.put("webview_classes", new JSONArray());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("bid", "ies");
                jSONObject.put("commonReportConfig", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("interval", 8000L);
                jSONObject3.put("FPSMonitor", jSONObject4);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("interval", 8000L);
                jSONObject3.put("MemoryMonitor", jSONObject5);
                jSONObject.put("apmReportConfig", jSONObject3);
                JSONObject jSONObject6 = new JSONObject();
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("interval", 10L);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put("DOMContentLoaded");
                jSONObject7.put("checkPoint", jSONArray);
                jSONObject6.put("PerformanceMonitor", jSONObject7);
                jSONObject.put("performanceReportConfig", jSONObject6);
                JSONObject jSONObject8 = new JSONObject();
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("ignore", new JSONArray());
                jSONObject8.put("StaticErrorMonitor", jSONObject9);
                jSONObject.put("errorMsgReportConfig", jSONObject8);
                JSONObject jSONObject10 = new JSONObject();
                JSONObject jSONObject11 = new JSONObject();
                jSONObject11.put("slowSession", 8000L);
                jSONObject11.put("sampleRate", 0.1d);
                jSONObject10.put("StaticPerformanceMonitor", jSONObject11);
                jSONObject.put("resourceTimingReportConfig", jSONObject10);
                return C786410Ut5.J3(jSONObject);
            }

            @Override // X.InterfaceC1550070qRJ
            public final List<String> LIZ() {
                return new ArrayList();
            }

            @Override // X.InterfaceC1550070qRJ
            public final String LIZIZ() {
                if (this.LIZIZ.length() == 0) {
                    this.LIZIZ = "SysWebView";
                }
                return this.LIZIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
            @Override // X.InterfaceC1550070qRJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String LJ() throws org.json.JSONException {
                /*
                    r1 = this;
                    java.lang.String r0 = r1.LIZ
                    int r0 = r0.length()
                    if (r0 <= 0) goto Le
                    r0 = 1
                L9:
                    if (r0 == 0) goto L10
                    java.lang.String r0 = r1.LIZ
                    return r0
                Le:
                    r0 = 0
                    goto L9
                L10:
                    X.0plo r0 = r1.LIZJ
                    r0.getClass()
                    X.0CLW r0 = X.C0CLW.LIZIZ     // Catch: X.C316660CbA -> L1e
                    com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r0.LIZ     // Catch: X.C316660CbA -> L1e
                    com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig r0 = r0.getHybridMonitorConfig()     // Catch: X.C316660CbA -> L1e
                    goto L23
                L1e:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    r0 = 0
                L23:
                    if (r0 == 0) goto L34
                    java.lang.String r0 = r0.getSlardarSdkConfig()     // Catch: X.C316660CbA -> L2a
                    goto L32
                L2a:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    java.lang.String r0 = LIZJ()
                L32:
                    if (r0 != 0) goto L38
                L34:
                    java.lang.String r0 = LIZJ()
                L38:
                    r1.LIZ = r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1522460pim.LJ():java.lang.String");
            }
        };
    }
}
