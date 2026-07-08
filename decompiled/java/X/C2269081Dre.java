package X;

import aa3.a;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Dre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269081Dre extends C09AY implements Function0<C0VVD> {
    public C2269081Dre() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0VVD] */
    @Override // kotlin.jvm.functions.Function0
    public final C0VVD invoke() {
        return new ICreativePerformanceMonitorService() { // from class: X.0VVD
            public final C830490Whz<String, C0VVA> LIZ = new C830490Whz<>();
            public final C830490Whz<String, C0VVE> LIZIZ = new C830490Whz<>();

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final String getBatteryPercent() throws Exception {
                C2216191BoX.LIZ.getClass();
                Intent intentLJIJI = C786410Ut5.LJIJI(C2216191BoX.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentLJIJI == null) {
                    return "";
                }
                int intExtra = intentLJIJI.getIntExtra("level", Integer.MIN_VALUE);
                int intExtra2 = intentLJIJI.getIntExtra("scale", Integer.MIN_VALUE);
                return (intExtra == Integer.MIN_VALUE || intExtra2 == Integer.MIN_VALUE) ? "" : String.valueOf((intExtra * 100) / intExtra2);
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final int getBatteryState() throws Exception {
                int intExtra;
                C2216191BoX.LIZ.getClass();
                Intent intentLJIJI = C786410Ut5.LJIJI(C2216191BoX.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentLJIJI != null && (intExtra = intentLJIJI.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.MIN_VALUE)) != Integer.MIN_VALUE && intExtra != 1) {
                    int i = 2;
                    if (intExtra != 2) {
                        i = 3;
                        if (intExtra == 3 || intExtra == 4) {
                            return 1;
                        }
                        if (intExtra != 5) {
                        }
                    }
                    return i;
                }
                return 0;
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final String getBatteryTemperature() throws Exception {
                int intExtra;
                C2216191BoX.LIZ.getClass();
                Intent intentLJIJI = C786410Ut5.LJIJI(C2216191BoX.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                return (intentLJIJI == null || (intExtra = intentLJIJI.getIntExtra("temperature", Integer.MAX_VALUE)) == Integer.MAX_VALUE) ? "" : String.valueOf(intExtra / 10);
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final Map<String, Double> getCpuRate() {
                HashMap map = new HashMap();
                a aVarLIZ = C0VGK.LIZ();
                map.put("cpu_rate", Double.valueOf(aVarLIZ.LIZ));
                map.put("cpu_speed", Double.valueOf(aVarLIZ.LIZIZ));
                return map;
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final void getJatoBoostAbilityForShootPage() {
                C800730Vb5.LIZ(((Number) C300000BpO.LIZ.getValue()).longValue());
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final Map<String, Long> getMemory() {
                HashMap map = new HashMap();
                C844470XAv.LIZ.getClass();
                C0VGL c0vglLIZIZ = C0VGK.LIZIZ(C844470XAv.LIZ());
                map.put("mem_java_total", Long.valueOf(c0vglLIZIZ.LIZ));
                map.put("mem_java_free", Long.valueOf(c0vglLIZIZ.LIZIZ));
                map.put("mem_java_used", Long.valueOf(c0vglLIZIZ.LIZJ));
                map.put("mem_java_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
                map.put("mem_pss_dalvik", Long.valueOf(c0vglLIZIZ.LIZLLL));
                map.put("mem_pss_native", Long.valueOf(c0vglLIZIZ.LJ));
                map.put("mem_pss_total", Long.valueOf(c0vglLIZIZ.LJFF));
                map.put("mem_graphics", Long.valueOf(c0vglLIZIZ.LJI));
                map.put("mem_vmsize", Long.valueOf(c0vglLIZIZ.LJII));
                return map;
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final String getMemoryUsedRate() {
                C844470XAv.LIZ.getClass();
                C0VGL c0vglLIZIZ = C0VGK.LIZIZ(C844470XAv.LIZ());
                return String.valueOf(c0vglLIZIZ.LIZJ / c0vglLIZIZ.LIZ);
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final String getCpuUsedRate() {
                String strValueOf = String.valueOf(C0VGK.LIZ().LIZ);
                return strValueOf == null ? "" : strValueOf;
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final void getJatoBoostAbilityForEditPage() {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tool_jato_edit_page_settings", true, false)) {
                    C800730Vb5.LIZ(0L);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final void getJatoBoostAbilityForPublishPage() {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tool_jato_publish_page_settings", true, false)) {
                    C800730Vb5.LIZ(0L);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final void destroyMonitors(String str) {
                C0VVE c0vveRemove = this.LIZIZ.remove(str);
                if (c0vveRemove != null) {
                    c0vveRemove.LIZJ();
                }
                C0VVA c0vvaRemove = this.LIZ.remove(str);
                if (c0vvaRemove != null) {
                    c0vvaRemove.LIZJ();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final void startJatoBoostAbility(long j) {
                C800730Vb5.LIZ(j);
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final void stopBlockMonitor(String str) {
                C0VVA c0vva = this.LIZ.get(str);
                if (c0vva != null) {
                    c0vva.LIZJ();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final void stopFpsMonitor(String str) {
                C0VVE c0vve = this.LIZIZ.get(str);
                if (c0vve != null) {
                    c0vve.LIZJ();
                }
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final void startBlockMonitor(String str, int i, long j, LagDataCallback lagDataCallback) {
                C0VVA c0vva = this.LIZ.get(str);
                if (c0vva != null) {
                    c0vva.LJIIIZ = i;
                    c0vva.LIZ(lagDataCallback);
                    if (j == -1) {
                        c0vva.LIZIZ();
                        return;
                    } else {
                        if (c0vva.LJFF) {
                            return;
                        }
                        c0vva.LIZIZ();
                        c0vva.LJI = true;
                        C786410Ut5.LJLIIL(j, C2487409ou.LIZIZ(), c0vva.LJ);
                        return;
                    }
                }
                C0VVA c0vva2 = new C0VVA(str);
                this.LIZ.put(str, c0vva2);
                synchronized (c0vva2) {
                    try {
                        c0vva2.LJIIIIZZ = lagDataCallback;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (j == -1) {
                    c0vva2.LIZIZ();
                } else {
                    if (c0vva2.LJFF) {
                        return;
                    }
                    c0vva2.LIZIZ();
                    c0vva2.LJI = true;
                    C786410Ut5.LJLIIL(j, C2487409ou.LIZIZ(), c0vva2.LJ);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
            public final void startFpsMonitor(String str, long j, LagDataCallback lagDataCallback, Function0<? extends HashMap<String, String>> function0) {
                C0VVE c0vve = this.LIZIZ.get(str);
                if (c0vve != null) {
                    c0vve.LIZ(lagDataCallback);
                    if (j == -1) {
                        c0vve.LIZIZ();
                        return;
                    } else {
                        if (c0vve.LIZLLL) {
                            return;
                        }
                        c0vve.LJ = true;
                        c0vve.LIZIZ();
                        C786410Ut5.LJLIIL(j, C2487409ou.LIZIZ(), c0vve.LJFF);
                        return;
                    }
                }
                C0VVE c0vve2 = new C0VVE(str, function0);
                this.LIZIZ.put(str, c0vve2);
                C0VV7 c0vv7 = c0vve2.LIZIZ;
                synchronized (c0vv7) {
                    c0vv7.LLILLL = lagDataCallback;
                }
                if (j == -1) {
                    c0vve2.LIZIZ();
                } else {
                    if (c0vve2.LIZLLL) {
                        return;
                    }
                    c0vve2.LJ = true;
                    c0vve2.LIZIZ();
                    C786410Ut5.LJLIIL(j, C2487409ou.LIZIZ(), c0vve2.LJFF);
                }
            }
        };
    }
}
