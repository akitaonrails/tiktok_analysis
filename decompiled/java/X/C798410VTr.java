package X;

import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.applog.AppLog;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.otis.resource.cpu.CpuNative;
import com.bytedance.otis.resource.cpu.OtisCPUTime;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.api.IBootLogApi;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798410VTr {
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile int LJFF;
    public static final Map<Integer, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair(6, "pss_code_so"), new Pair(7, "pss_code_jar"), new Pair(8, "pss_code_apk"), new Pair(9, "pss_code_ttf"), new Pair(10, "pss_code_dex"), new Pair(11, "pss_code_oat"), new Pair(23, "pss_code_zygote"), new Pair(24, "pss_code_app"));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C292140Bci());
    public static volatile C798420VTs LJ = new C798420VTs();
    public static final Object LJI = new Object();
    public static volatile long LJII = -1;

    public static boolean LJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static final boolean LIZ() {
        return LJ() && !LIZJ && LIZLLL;
    }

    public static void LIZIZ(int i) {
        if (i == C0CBG.CURRENT.getCode()) {
            C798460VTw.LIZIZ(C798440VTu.LIZIZ, null);
        } else {
            C798460VTw.LIZIZ(C798440VTu.LIZ, null);
        }
    }

    public static String LIZLLL(String str) {
        Long lLJIILIIL;
        String strValueOf;
        if (str == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null || (strValueOf = String.valueOf(C08M9.LIZ(lLJIILIIL.longValue(), false))) == null) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return strValueOf;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void LJFF(Map<String, ? extends Object> map) {
        try {
            if (!LIZ()) {
                return;
            }
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                switch (key.hashCode()) {
                    case -439023270:
                        if (key.equals("ui_page")) {
                            LJ.LIZ(entry.getValue(), entry.getKey());
                            Object value = entry.getValue();
                            if (Intrinsics.LJFF(value, "fyp")) {
                                LJ.LIZ(1, "ui_has_fyp");
                            } else if (Intrinsics.LJFF(value, "follow")) {
                                LJ.LIZ(1, "ui_has_follow");
                            } else if (Intrinsics.LJFF(value, "dm")) {
                                LJ.LIZ(1, "ui_has_dm");
                            } else if (Intrinsics.LJFF(value, "profile_public")) {
                                LJ.LIZ(1, "ui_has_post");
                            } else if (Intrinsics.LJFF(value, "profile_private")) {
                                LJ.LIZ(1, "ui_has_private");
                            } else if (Intrinsics.LJFF(value, "profile_likes")) {
                                LJ.LIZ(1, "ui_has_likes");
                            } else if (Intrinsics.LJFF(value, "favorite_videos")) {
                                LJ.LIZ(1, "ui_has_favorite");
                            } else if (Intrinsics.LJFF(value, "music")) {
                                LJ.LIZ(1, "ui_has_music");
                            } else if (Intrinsics.LJFF(value, "challenge")) {
                                LJ.LIZ(1, "ui_has_challenge");
                            } else {
                                LJ.LIZ(1, "ui_has_other");
                            }
                        } else {
                            LJ.LIZ(entry.getValue(), entry.getKey());
                        }
                        break;
                    case -363502076:
                        if (key.equals("data_page")) {
                            LJ.LIZ(entry.getValue(), entry.getKey());
                            Object value2 = entry.getValue();
                            if (Intrinsics.LJFF(value2, "fyp")) {
                                LJ.LIZ(1, "data_has_fyp");
                            } else if (Intrinsics.LJFF(value2, "follow")) {
                                LJ.LIZ(1, "data_has_follow");
                            } else if (Intrinsics.LJFF(value2, "dm")) {
                                LJ.LIZ(1, "data_has_dm");
                            } else if (Intrinsics.LJFF(value2, "profile_public")) {
                                LJ.LIZ(1, "data_has_post");
                            } else if (Intrinsics.LJFF(value2, "profile_private")) {
                                LJ.LIZ(1, "data_has_private");
                            } else if (Intrinsics.LJFF(value2, "profile_likes")) {
                                LJ.LIZ(1, "data_has_likes");
                            } else if (Intrinsics.LJFF(value2, "favorite_videos")) {
                                LJ.LIZ(1, "data_has_favorite");
                            } else if (Intrinsics.LJFF(value2, "music")) {
                                LJ.LIZ(1, "data_has_music");
                            } else if (Intrinsics.LJFF(value2, "challenge")) {
                                LJ.LIZ(1, "data_has_challenge");
                            } else {
                                LJ.LIZ(1, "data_has_other");
                            }
                        } else {
                            LJ.LIZ(entry.getValue(), entry.getKey());
                        }
                        break;
                    case -230065082:
                        if (key.equals("launch_type")) {
                            C798420VTs c798420VTs = LJ;
                            String key2 = entry.getKey();
                            Object value3 = entry.getValue();
                            c798420VTs.getClass();
                            if (key2 != null && value3 != null && !c798420VTs.LIZ.containsKey(key2)) {
                                if (!(value3 instanceof Integer) && !Intrinsics.LJFF(value3, C2340809Fe.LIZ) && !Intrinsics.LJFF(value3, C778860Ugu.LIZ)) {
                                    c798420VTs.LIZ.put(key2, value3.toString());
                                } else {
                                    c798420VTs.LIZ.put(key2, value3);
                                }
                            }
                        } else {
                            LJ.LIZ(entry.getValue(), entry.getKey());
                        }
                        break;
                    case 820285452:
                        if (key.equals("vv_code")) {
                            Object value4 = entry.getValue();
                            if (value4 instanceof Integer) {
                                Number number = (Number) value4;
                                if (LJFF < number.intValue()) {
                                    LJFF = number.intValue();
                                    LJ.LIZ(Integer.valueOf(LJFF), "vv_code");
                                    if (LJFF == 9000) {
                                        LIZJ = true;
                                    }
                                }
                            }
                        } else {
                            LJ.LIZ(entry.getValue(), entry.getKey());
                        }
                        break;
                    default:
                        LJ.LIZ(entry.getValue(), entry.getKey());
                        break;
                }
            }
            if (LJFF >= 200) {
                final long jUptimeMillis = SystemClock.uptimeMillis();
                C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0VTv
                    public final void LIZ() {
                        Object obj = C798410VTr.LJI;
                        long j = jUptimeMillis;
                        synchronized (obj) {
                            try {
                                if (j > C798410VTr.LJII) {
                                    C798440VTu.LIZIZ(C798410VTr.LJ.LIZ);
                                    C798410VTr.LJII = j;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    @C1BCF(distinctId = 21, scene = "boot", taskPriority = EnumC21352718hJ.P2)
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ZeroVideoViewLogger@7e60.syncMonitorData2Storage$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ZeroVideoViewLogger@7e60.syncMonitorData2Storage$1");
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static Map LIZJ(boolean z, boolean z2) {
        long jElapsedRealtime;
        double dLIZIZ;
        if (!((Boolean) C0B88.LIZ.getValue()).booleanValue()) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double dLIZIZ2 = 0.0d;
        if (z2 && C0B88.LIZ(1)) {
            if (Build.VERSION.SDK_INT >= 24) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
            } else {
                jElapsedRealtime = 0;
            }
            OtisCPUTime otisCPUTimeDumpOtisCpuTime = CpuNative.dumpOtisCpuTime(false, false, true, null, false, false);
            if (jElapsedRealtime <= 0) {
                dLIZIZ = 0.0d;
            } else {
                dLIZIZ = C08M9.LIZIZ(otisCPUTimeDumpOtisCpuTime.getProcCpu() / jElapsedRealtime, 2);
            }
            linkedHashMap.put("cpu_speed", String.valueOf(dLIZIZ));
        }
        if (z && C0B88.LIZ(2)) {
            int iLIZ = C08M9.LIZ(C2367709Pn.LIZLLL(), true);
            int iLIZ2 = C08M9.LIZ(Runtime.getRuntime().maxMemory(), true);
            double dLIZIZ3 = C08M9.LIZIZ(((double) iLIZ) / ((double) iLIZ2), 2);
            linkedHashMap.put("java_used_memory", String.valueOf(iLIZ));
            linkedHashMap.put("java_used_rate", String.valueOf(dLIZIZ3));
            linkedHashMap.put("max_java_memory", String.valueOf(iLIZ2));
        }
        if (z && C0B88.LIZ(4)) {
            linkedHashMap.put("native_heap_allocated_size", String.valueOf(C08M9.LIZ(Debug.getNativeHeapAllocatedSize(), true)));
        }
        if (z2 && C0B88.LIZ(8)) {
            C844470XAv.LIZ.getClass();
            long[] jArrLIZIZ = C2367709Pn.LIZIZ(C844470XAv.LIZ());
            int iLIZ3 = C08M9.LIZ(jArrLIZIZ[0], true);
            int iLIZ4 = C08M9.LIZ(jArrLIZIZ[1], true);
            if (iLIZ4 > 0) {
                dLIZIZ2 = C08M9.LIZIZ(((double) (iLIZ4 - iLIZ3)) / ((double) iLIZ4), 2);
            }
            linkedHashMap.put("available_physical_memory", String.valueOf(iLIZ3));
            linkedHashMap.put("physical_memory_used_rate", String.valueOf(dLIZIZ2));
        }
        if (z2 && C0B88.LIZ(32)) {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            Map<String, String> memoryStats = memoryInfo.getMemoryStats();
            linkedHashMap.put("pss", LIZLLL(memoryStats.get("summary.total-pss")));
            linkedHashMap.put("pss_swap", LIZLLL(memoryStats.get("summary.total-swap")));
            linkedHashMap.put("pss_system", LIZLLL(memoryStats.get("summary.system")));
            linkedHashMap.put("pss_other", LIZLLL(memoryStats.get("summary.private-other")));
            linkedHashMap.put("pss_graphics", LIZLLL(memoryStats.get("summary.graphics")));
            linkedHashMap.put("pss_code", LIZLLL(memoryStats.get("summary.code")));
            linkedHashMap.put("pss_native", LIZLLL(memoryStats.get("summary.native-heap")));
            linkedHashMap.put("pss_java", LIZLLL(memoryStats.get("summary.java-heap")));
            linkedHashMap.put("pss_stack", LIZLLL(memoryStats.get("summary.stack")));
            if (C0B88.LIZ(64)) {
                try {
                    for (Map.Entry entry : C09NZ.LIZIZ(C1962107mN.LIZIZ(memoryInfo, true)).entrySet()) {
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        int iIntValue2 = ((Number) entry.getValue()).intValue();
                        String str = LIZ.get(Integer.valueOf(iIntValue));
                        if (str != null) {
                            linkedHashMap.put(str, String.valueOf(iIntValue2));
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return linkedHashMap;
                }
            }
        } else if (z2 && C0B88.LIZ(16)) {
            linkedHashMap.put("pss", String.valueOf(C08M9.LIZ(Debug.getPss(), false)));
        }
        return linkedHashMap;
    }

    public static void LJI(int i, Map map) {
        Map mapLIZ;
        String strValueOf;
        Object obj;
        boolean z;
        C0CBG c0cbg = C0CBG.LAST;
        if (i != c0cbg.getCode()) {
            LIZJ = true;
        }
        if (!LJ()) {
            return;
        }
        if (i == c0cbg.getCode()) {
            mapLIZ = C798440VTu.LIZ(C798440VTu.LIZ);
        } else if (i == C0CBG.CURRENT.getCode()) {
            mapLIZ = C798440VTu.LIZ(C798440VTu.LIZIZ);
        } else {
            return;
        }
        if (mapLIZ.isEmpty()) {
            return;
        }
        String str = (String) mapLIZ.get("vv_code");
        boolean z2 = false;
        if (str != null && CastIntegerProtector.parseInt(str) >= 2000) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    mapLIZ.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
            if (!Intrinsics.LJFF(mapLIZ.get("vv_code"), "9000")) {
                LIZIZ(i);
            }
            C013C c013c = new C013C();
            try {
                if (i == C0CBG.LAST.getCode()) {
                    mapLIZ.put("report_end_type", "3");
                    strValueOf = "-1";
                } else {
                    strValueOf = String.valueOf(((Number) C1245604u6.LIZJ.getValue()).intValue());
                }
                boolean zBooleanValue = ((Boolean) C0AD8.LIZ.getValue()).booleanValue();
                String str2 = "1";
                if (((IBootLogApi) C04TM.LIZ.getValue()).isNewUser()) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                mapLIZ.put("is_cold_start_first_launch", obj);
                mapLIZ.put("ts_start", String.valueOf(C1150504el.LIZ().LJJIII));
                mapLIZ.put("ts_end", String.valueOf(SystemClock.elapsedRealtime()));
                mapLIZ.put("from_start_to_current_duration", String.valueOf(SystemClock.elapsedRealtime() - C1150504el.LIZ().LJJIII));
                if (DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId().length() <= 0) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                mapLIZ.put("is_did_ready", str2);
                mapLIZ.put("report_timing_type", strValueOf);
                LJ.LIZ(AppLog.getSessionId(), "session_id");
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (C2140508a3.LIZ()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (zBooleanValue && z) {
                        z2 = true;
                    }
                    Map mapLIZJ = LIZJ(true, z2);
                    c013c.element = z;
                    mapLIZ.putAll(mapLIZJ);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("memory dump v1 cost:");
                    sbLIZ.append(jCurrentTimeMillis2);
                    C2188811AlT.LIZIZ(sbLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C1103004Tc.LIZ.LIZJ(mapLIZ, new C321540Cj2(mapLIZ, zBooleanValue, c013c), new C798480VTy(i, mapLIZ));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }
}
