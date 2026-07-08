package X;

import android.os.Debug;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14Wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.performance.EcPerformanceCollector$collect$1", f = "EcPerformanceCollector.kt", l = {}, m = "invokeSuspend")
public final class C20278014Wc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NWX LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20278014Wc(C0NWX c0nwx, String str, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C20278014Wc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0nwx;
        this.LLILLJJLI = str;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20278014Wc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        double dDoubleValue;
        long j5;
        C1C7U.LIZ("EcPerformanceCollector@26c6.collect$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SystemClock.elapsedRealtime();
        C054G c054g = C0NTE.LIZ;
        C20278114Wd c20278114Wd = null;
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            int i = memoryInfo.dalvikPss;
            if (i <= 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EcPerformanceCollector@26c6.collect$1");
                return unit;
            }
            if (this.LL != C0NWX.ENTER) {
                c20278114Wd = C0NTE.LIZJ.get(this.LLILLJJLI);
            }
            C054G c054g2 = C0NTE.LIZ;
            try {
                j = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                j = 0;
            }
            C054G c054g3 = C0NTE.LIZ;
            try {
                j2 = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.gc-time"));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                j2 = 0;
            }
            C054G c054g4 = C0NTE.LIZ;
            try {
                j3 = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-time"));
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                j3 = 0;
            }
            C054G c054g5 = C0NTE.LIZ;
            try {
                j4 = CastLongProtector.parseLong(Debug.getRuntimeStat("art.gc.blocking-gc-count"));
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                j4 = 0;
            }
            long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            C054G c054g6 = C0NTE.LIZ;
            if (jFreeMemory > 0) {
                dDoubleValue = new BigDecimal(jFreeMemory).divide(new BigDecimal(Runtime.getRuntime().maxMemory()), 4, RoundingMode.HALF_UP).doubleValue();
            } else {
                dDoubleValue = -1.0d;
            }
            double d = C1BCA.LIZLLL().LIZIZ;
            long j6 = jFreeMemory / ((long) 1048576);
            long j7 = ((long) i) / 1024;
            long j8 = ((long) memoryInfo.nativePss) / 1024;
            long totalPss = ((long) memoryInfo.getTotalPss()) / 1024;
            String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
            if (C770702zh.LIZIZ(memoryStat)) {
                try {
                    j5 = ((long) CastIntegerProtector.parseInt(memoryStat)) * 1024;
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    j5 = -1;
                }
            } else {
                j5 = -1;
            }
            long j9 = j5 / 1024;
            int iActiveCount = Thread.activeCount();
            C20278114Wd c20278114Wd2 = new C20278114Wd(d, j6, dDoubleValue, j7, j8, totalPss, j9, j, j2, j4, j3, iActiveCount);
            if (this.LL == C0NWX.ENTER) {
                C0NTE.LIZJ.put(this.LLILLJJLI, c20278114Wd2);
            }
            C054G c054g7 = C0NTE.LIZ;
            Map<String, Object> map = this.LLILLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C2097608Jq.LJIIIIZZ(new Pair("cpu_used_rate", Double.valueOf(d)), new Pair("java_heap", Long.valueOf(j6)), new Pair("java_heap_used_rate", Double.valueOf(dDoubleValue)), new Pair("dalvik_pss", Long.valueOf(j7)), new Pair("native_pss", Long.valueOf(j8)), new Pair("total_pss", Long.valueOf(totalPss)), new Pair("graphics", Long.valueOf(j9)), new Pair("gc_count", Long.valueOf(j)), new Pair("gc_time", Long.valueOf(j2)), new Pair("gc_block_count", Long.valueOf(j4)), new Pair("gc_block_time", Long.valueOf(j3)), new Pair("thread_count", Integer.valueOf(iActiveCount))));
            linkedHashMap.putAll(map);
            if (c20278114Wd != null) {
                linkedHashMap.putAll(C2097608Jq.LJIIZILJ(C2097608Jq.LJIIIIZZ(new Pair("cpu_used_rate_diff", Double.valueOf(d - c20278114Wd.LIZ)), new Pair("java_heap_diff", Long.valueOf(j6 - c20278114Wd.LIZIZ)), new Pair("java_heap_used_rate_diff", Double.valueOf(dDoubleValue - c20278114Wd.LIZJ)), new Pair("dalvik_pss_diff", Long.valueOf(j7 - c20278114Wd.LIZLLL)), new Pair("native_pss_diff", Long.valueOf(j8 - c20278114Wd.LJ)), new Pair("total_pss_diff", Long.valueOf(totalPss - c20278114Wd.LJFF)), new Pair("graphics_diff", Long.valueOf(j9 - c20278114Wd.LJI)), new Pair("gc_count_diff", Long.valueOf(j - c20278114Wd.LJII)), new Pair("gc_time_diff", Long.valueOf(j2 - c20278114Wd.LJIIIIZZ)), new Pair("gc_block_count_diff", Long.valueOf(j4 - c20278114Wd.LJIIIZ)), new Pair("gc_block_time_diff", Long.valueOf(j3 - c20278114Wd.LJIIJ)), new Pair("thread_count_diff", Integer.valueOf(iActiveCount - c20278114Wd.LJIIJJI)))));
            }
            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
            JSONObject jSONObjectLIZ = C051S.LIZ(linkedHashMap);
            c1507790pL7.getClass();
            C1507790pL7.LIZLLL("rd_tiktokec_performance_monitor", jSONObjectLIZ);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EcPerformanceCollector@26c6.collect$1");
            return unit2;
        } catch (Exception e6) {
            TryCatchGuardChecker.doCheck(e6);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("EcPerformanceCollector@26c6.collect$1");
            return unit3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
