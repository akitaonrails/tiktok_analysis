package X;

import android.os.Debug;
import android.os.Process;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pgd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521130pgd {
    public static volatile Integer LIZ;

    public static void LIZJ() {
        if (LIZ == null && Intrinsics.LJFF(C786410Ut5.u3().getName(), "Lynx_JS")) {
            LIZ = Integer.valueOf(Process.myTid());
        }
    }

    public static void LIZIZ(AbstractC1521100pga abstractC1521100pga) {
        if (!EnumC1520990pgP.NATIVE_PERF_MONITOR.isEnabled()) {
            return;
        }
        abstractC1521100pga.LIZLLL().LJ(C2097608Jq.LJIIJ(new Pair(EnumC1521120pgc.PAGE_FINISH_MEMORY.getKey(), Long.valueOf(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())), new Pair(EnumC1521120pgc.PAGE_FINISH_MEMORY_NATIVE.getKey(), Long.valueOf(Debug.getNativeHeapAllocatedSize()))));
    }

    public static void LIZ(AbstractC1521100pga abstractC1521100pga, EnumC1520910pgH enumC1520910pgH) {
        C798350VTl c798350VTl;
        Integer num;
        Long l;
        if (!EnumC1520990pgP.NATIVE_PERF_MONITOR.isEnabled()) {
            return;
        }
        C798360VTm c798360VTm = abstractC1521100pga.LLJJ;
        if (c798360VTm != null) {
            c798360VTm.LIZ();
        }
        C798360VTm c798360VTm2 = abstractC1521100pga.LLJJ;
        if (c798360VTm2 != null) {
            c798350VTl = c798360VTm2.LJI;
        } else {
            c798350VTl = null;
        }
        abstractC1521100pga.LLJJ = null;
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair(EnumC1521120pgc.PAGE_EXIT_MEMORY.getKey(), Long.valueOf(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())), new Pair(EnumC1521120pgc.PAGE_EXIT_MEMORY_NATIVE.getKey(), Long.valueOf(Debug.getNativeHeapAllocatedSize())));
        if (c798350VTl != null) {
            mapLJIIJ.put(EnumC1521120pgc.CPU_AVG_USAGE.getKey(), Double.valueOf((c798350VTl.LIZIZ * 1.0d) / ((double) Runtime.getRuntime().availableProcessors())));
            if (enumC1520910pgH == EnumC1520910pgH.LYNX && (num = LIZ) != null) {
                int iIntValue = num.intValue();
                Map<Integer, Long> map = c798350VTl.LJIIIIZZ;
                if (map != null && (l = map.get(Integer.valueOf(iIntValue))) != null) {
                    mapLJIIJ.put(EnumC1521120pgc.LYNX_JS_THREAD_USAGE.getKey(), Double.valueOf((l.longValue() * 1.0d) / c798350VTl.LJ));
                }
            }
        }
        Long l2 = abstractC1521100pga.LLJILLL;
        if (l2 != null) {
            mapLJIIJ.put(EnumC1521120pgc.LYNX_MEMORY.getKey(), Long.valueOf(l2.longValue()));
        }
        abstractC1521100pga.LIZLLL().LJ(mapLJIIJ);
    }
}
