package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveCpuMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostPreviewPowerCacheInterval;
import com.bytedance.android.livesdk.livesetting.performance.LivePullSdkGetDataIntervalSettings;
import com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting;
import com.bytedance.android.livesdk.model.CpuMemoryOptList;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gO4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163660gO4 {
    public static InterfaceC1101100elA LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static Map<String, Integer> LJIIJJI;
    public static boolean LJIIL;
    public static final C1163660gO4 LIZ = new C1163660gO4();
    public static HashMap<String, Double> LIZIZ = new HashMap<>();
    public static HashMap<String, Long> LIZJ = new HashMap<>();
    public static final HashMap<String, String> LIZLLL = new HashMap<>();
    public static String LJIIIIZZ = "";
    public static String LJIIIZ = "";
    public static String LJIIJ = "";

    public static void LIZIZ() {
        HashMap<String, String> map = LIZLLL;
        map.clear();
        InterfaceC1101100elA interfaceC1101100elA = LJ;
        if (interfaceC1101100elA != null) {
            interfaceC1101100elA.LIZLLL(map);
            return;
        }
        InterfaceC1101100elA interfaceC1101100elAOK1 = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).OK1();
        LJ = interfaceC1101100elAOK1;
        if (interfaceC1101100elAOK1 != null) {
            interfaceC1101100elAOK1.LIZLLL(map);
        }
    }

    public static Map LIZ(String str) {
        int iIntValue;
        Integer num;
        Map<String, Integer> map;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return LIZIZ;
        }
        if (!PerformanceSampleSetting.INSTANCE.isReportCpu(LJIIL)) {
            return LIZIZ;
        }
        if (LJIIJJI == null) {
            CpuMemoryOptList value = LiveCpuMemoryOptSetting.INSTANCE.getValue();
            if (value != null) {
                map = value.optList;
            } else {
                map = null;
            }
            LJIIJJI = map;
        }
        Map<String, Integer> map2 = LJIIJJI;
        if (map2 != null && (num = map2.get(str)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        long value2 = ((long) iIntValue) * 1000000000;
        if (Intrinsics.LJFF("livesdk_anchor_heartbeat_preview", str)) {
            value2 = ((long) LiveHostPreviewPowerCacheInterval.getValue()) * 1000000000;
        }
        if (!LIZIZ.isEmpty() && value2 > 0) {
            if (Intrinsics.LJFF("live_pull_sdk_get_data_interval", str)) {
                value2 = LivePullSdkGetDataIntervalSettings.INSTANCE.getValue() * 1000000000;
            }
            if (TextUtils.isEmpty(str) || ((!Intrinsics.LJFF(LJIIIIZZ, str) && Intrinsics.LJFF(LJIIIIZZ, "livesdk_cpu_memory_now_key")) || System.nanoTime() - LJFF >= value2)) {
                LIZIZ = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).getCpuRate();
                LJFF = System.nanoTime();
                LJIIIIZZ = str;
            }
            return LIZIZ;
        }
        LIZIZ = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).getCpuRate();
        LJFF = System.nanoTime();
        LJIIIIZZ = str;
        return LIZIZ;
    }

    public static Map LIZJ(String str) {
        int iIntValue;
        Integer num;
        Map<String, Integer> map;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return LIZLLL;
        }
        if (LJIIJJI == null) {
            CpuMemoryOptList value = LiveCpuMemoryOptSetting.INSTANCE.getValue();
            if (value != null) {
                map = value.optList;
            } else {
                map = null;
            }
            LJIIJJI = map;
        }
        Map<String, Integer> map2 = LJIIJJI;
        if (map2 != null && (num = map2.get(str)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        long value2 = ((long) iIntValue) * 1000000000;
        if (Intrinsics.LJFF("livesdk_anchor_heartbeat_preview", str)) {
            value2 = ((long) LiveHostPreviewPowerCacheInterval.getValue()) * 1000000000;
        }
        HashMap<String, String> map3 = LIZLLL;
        if (!map3.isEmpty() && value2 > 0) {
            if (Intrinsics.LJFF("live_pull_sdk_get_data_interval", str)) {
                value2 = LivePullSdkGetDataIntervalSettings.INSTANCE.getValue() * 1000000000;
            }
            if (TextUtils.isEmpty(str) || ((!Intrinsics.LJFF(LJIIJ, str) && Intrinsics.LJFF(LJIIJ, "livesdk_cpu_memory_now_key")) || System.nanoTime() - LJII >= value2)) {
                LIZIZ();
                LJII = System.nanoTime();
                LJIIJ = str;
            }
            return map3;
        }
        LIZIZ();
        LJII = System.nanoTime();
        LJIIJ = str;
        return map3;
    }

    public static Map LIZLLL(String str) {
        int iIntValue;
        Integer num;
        Map<String, Integer> map;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return LIZJ;
        }
        if (!PerformanceSampleSetting.INSTANCE.isReportMem(LJIIL)) {
            return LIZJ;
        }
        if (LJIIJJI == null) {
            CpuMemoryOptList value = LiveCpuMemoryOptSetting.INSTANCE.getValue();
            if (value != null) {
                map = value.optList;
            } else {
                map = null;
            }
            LJIIJJI = map;
        }
        Map<String, Integer> map2 = LJIIJJI;
        if (map2 != null && (num = map2.get(str)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        long value2 = ((long) iIntValue) * 1000000000;
        if (Intrinsics.LJFF("livesdk_anchor_heartbeat_preview", str)) {
            value2 = ((long) LiveHostPreviewPowerCacheInterval.getValue()) * 1000000000;
        }
        if (!LIZJ.isEmpty() && value2 > 0) {
            if (Intrinsics.LJFF("live_pull_sdk_get_data_interval", str)) {
                value2 = LivePullSdkGetDataIntervalSettings.INSTANCE.getValue() * 1000000000;
            }
            if (TextUtils.isEmpty(str) || ((!Intrinsics.LJFF(LJIIIZ, str) && Intrinsics.LJFF(LJIIIZ, "livesdk_cpu_memory_now_key")) || System.nanoTime() - LJI >= value2)) {
                LIZJ = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).getMemory();
                LJI = System.nanoTime();
                LJIIIZ = str;
            }
            return LIZJ;
        }
        LIZJ = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).getMemory();
        LJI = System.nanoTime();
        LJIIIZ = str;
        return LIZJ;
    }

    public static void LJ(boolean z) {
        if (z || System.nanoTime() - LJFF > 15000000000L) {
            LIZIZ.clear();
            LIZJ.clear();
            LJIIJJI = null;
        }
    }
}
