package X;

import Y.ARunnableS7S0001000_23;
import Y.ARunnableS98S0000000_23;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.net.AVMDLMultiNetwork;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oOJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471330oOJ {
    public final ConcurrentMap<String, ConcurrentMap<String, Object>> LIZ = new ConcurrentHashMap();
    public final ConcurrentMap<String, Object> LIZIZ = new ConcurrentHashMap();
    public final Queue<Map<String, Object>> LIZJ = new ConcurrentLinkedQueue();

    public static Map<String, Object> LIZ(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof Map) {
                map2.put(entry.getKey(), LIZ((Map) entry.getValue()));
            } else if (entry.getValue() instanceof AtomicInteger) {
                map2.put(entry.getKey(), Integer.valueOf(((AtomicInteger) entry.getValue()).get()));
            } else {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    public static Map LIZJ(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject(C790230UzF.LIZ.LIZJ().popLogData(i, str));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
            if (!((Boolean) C1474810oTv.d2.getValue()).booleanValue()) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("traceId: ");
                sbLIZ.append(str);
                sbLIZ.append(", type: ");
                sbLIZ.append(i);
                sbLIZ.append(", gotten log data: ");
                sbLIZ.append(map);
                C1471660oOq.LIZJ("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ));
            }
            return map;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("event log parse failed: ");
            sbLIZ2.append(e);
            C1471660oOq.LIZIZ("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    public static ConcurrentMap<String, Object> LIZLLL(ConcurrentMap<String, Object> concurrentMap, String str) {
        concurrentMap.putIfAbsent(str, new ConcurrentHashMap());
        return (ConcurrentMap) concurrentMap.get(str);
    }

    public final void LIZIZ(int i, int i2, String str, String str2) {
        ConcurrentMap<String, Object> concurrentMap;
        Object jSONObject;
        if (!TextUtils.isEmpty(str) && !"unknown".equalsIgnoreCase(str)) {
            ((ConcurrentHashMap) this.LIZ).putIfAbsent(str, new ConcurrentHashMap());
            concurrentMap = (ConcurrentMap) ((ConcurrentHashMap) this.LIZ).get(str);
        } else {
            concurrentMap = this.LIZIZ;
        }
        switch (i) {
            case 2000:
                concurrentMap.putIfAbsent("st_play_task_op", new ConcurrentHashMap());
                ConcurrentMap concurrentMap2 = (ConcurrentMap) concurrentMap.get("st_play_task_op");
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (i2 != 6) {
                                    if (i2 != 7) {
                                        switch (i2) {
                                            case 100:
                                                concurrentMap2.put("seek_label", str2);
                                                break;
                                            case 101:
                                                try {
                                                } catch (NumberFormatException e) {
                                                    e = e;
                                                }
                                                try {
                                                    concurrentMap2.put("first_block_decision_time", Long.valueOf(CastLongProtector.parseLong(str2)));
                                                } catch (NumberFormatException e2) {
                                                    e = e2;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    int i3 = C2187451AjH.LIZ;
                                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                    sbLIZ.append("PLAY_TASK_FIRST_BLOCK_DECISION_TIME:\n");
                                                    sbLIZ.append(e);
                                                    C1471660oOq.LIZIZ("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ));
                                                    concurrentMap2.put("first_block_decision_time", str2);
                                                    return;
                                                }
                                                break;
                                            case 102:
                                                try {
                                                } catch (NumberFormatException e3) {
                                                    e = e3;
                                                }
                                                try {
                                                    concurrentMap2.put("first_block_exec_time", Long.valueOf(CastLongProtector.parseLong(str2)));
                                                } catch (NumberFormatException e4) {
                                                    e = e4;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    int i4 = C2187451AjH.LIZ;
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append("PLAY_TASK_FIRST_BLOCK_EXEC_TIME:\n");
                                                    sbLIZ2.append(e);
                                                    C1471660oOq.LIZIZ("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ2));
                                                    concurrentMap2.put("first_block_exec_time", str2);
                                                    return;
                                                }
                                                break;
                                            case 103:
                                                try {
                                                } catch (NumberFormatException e5) {
                                                    e = e5;
                                                }
                                                try {
                                                    concurrentMap2.put("est_play", Long.valueOf(CastLongProtector.parseLong(str2)));
                                                } catch (NumberFormatException e6) {
                                                    e = e6;
                                                    TryCatchGuardChecker.doCheck(e);
                                                    int i5 = C2187451AjH.LIZ;
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("EST_PLAYTIME:\n");
                                                    sbLIZ3.append(e);
                                                    C1471660oOq.LIZIZ("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ3));
                                                    concurrentMap2.put("est_play", str2);
                                                    return;
                                                }
                                                break;
                                            case 104:
                                                concurrentMap2.put("smart_level", str2);
                                                break;
                                        }
                                    } else {
                                        if (str2 == null) {
                                            int i6 = C2187451AjH.LIZ;
                                            C1471660oOq.LIZIZ("StrategyEvent", "PLAY_TASK_SAFE_FACTOR");
                                        } else {
                                            try {
                                            } catch (JSONException e7) {
                                                e = e7;
                                            }
                                            try {
                                                concurrentMap2.put("safe_factor", new JSONObject(str2));
                                            } catch (JSONException e8) {
                                                e = e8;
                                                TryCatchGuardChecker.doCheck(e);
                                                int i7 = C2187451AjH.LIZ;
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append("PLAY_TASK_SAFE_FACTOR:\n");
                                                sbLIZ4.append(e);
                                                TTVideoEngineLog.w("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ4));
                                                concurrentMap2.put("safe_factor", str2);
                                                return;
                                            }
                                        }
                                        break;
                                    }
                                } else {
                                    if (str2 == null) {
                                        int i8 = C2187451AjH.LIZ;
                                        C1471660oOq.LIZIZ("StrategyEvent", "PLAY_TASK_TARGET_BUFFER");
                                    } else {
                                        try {
                                        } catch (JSONException e9) {
                                            e = e9;
                                        }
                                        try {
                                            concurrentMap2.put("target_buffer", new JSONObject(str2));
                                        } catch (JSONException e10) {
                                            e = e10;
                                            TryCatchGuardChecker.doCheck(e);
                                            int i9 = C2187451AjH.LIZ;
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("PLAY_TASK_TARGET_BUFFER:\n");
                                            sbLIZ5.append(e);
                                            TTVideoEngineLog.w("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ5));
                                            concurrentMap2.put("target_buffer", str2);
                                            return;
                                        }
                                    }
                                    break;
                                }
                            } else {
                                if (str2 == null) {
                                    int i10 = C2187451AjH.LIZ;
                                    C1471660oOq.LIZIZ("StrategyEvent", "PLAY_TASK_RANGE_DURATION: logInfo is null");
                                } else {
                                    try {
                                    } catch (JSONException e11) {
                                        e = e11;
                                    }
                                    try {
                                        concurrentMap2.put("range_dur", new JSONObject(str2));
                                    } catch (JSONException e12) {
                                        e = e12;
                                        TryCatchGuardChecker.doCheck(e);
                                        int i11 = C2187451AjH.LIZ;
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append("PLAY_TASK_RANGE_DURATION:\n");
                                        sbLIZ6.append(e);
                                        TTVideoEngineLog.w("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ6));
                                        concurrentMap2.put("range_dur", str2);
                                        return;
                                    }
                                }
                                break;
                            }
                        } else {
                            concurrentMap2.putIfAbsent("range", new AtomicInteger());
                            ((AtomicInteger) concurrentMap2.get("range")).incrementAndGet();
                            break;
                        }
                    } else {
                        concurrentMap2.putIfAbsent("resume", new AtomicInteger());
                        ((AtomicInteger) concurrentMap2.get("resume")).incrementAndGet();
                        break;
                    }
                } else {
                    concurrentMap2.putIfAbsent("pause", new AtomicInteger());
                    ((AtomicInteger) concurrentMap2.get("pause")).incrementAndGet();
                    break;
                }
                break;
            case 2001:
                if (!TextUtils.isEmpty(str2)) {
                    LIZLLL(this.LIZIZ, "st_preload").put("name", str2);
                }
                break;
            case 2002:
                LIZLLL(concurrentMap, "st_buf_dur").put("rebuf_dur_init", Integer.valueOf(i2));
                break;
            case 2003:
                ConcurrentMap<String, Object> concurrentMapLIZLLL = LIZLLL(concurrentMap, "st_buf_dur");
                concurrentMapLIZLLL.put("startup_buf_dur", Integer.valueOf(i2));
                if (str2 != null) {
                    try {
                    } catch (JSONException e13) {
                        e = e13;
                    }
                    try {
                        concurrentMapLIZLLL.put("startup_cache", new JSONObject(str2));
                    } catch (JSONException e14) {
                        e = e14;
                        TryCatchGuardChecker.doCheck(e);
                        int i12 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("LOG_KEY_STARTUP_CACHE_SIZE:\n");
                        sbLIZ7.append(e);
                        TTVideoEngineLog.w("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ7));
                        concurrentMapLIZLLL.put("startup_cache", str2);
                        return;
                    }
                }
                break;
            case 2004:
                LIZLLL(concurrentMap, "st_preload_personalized").put("preload_personalized_option", Integer.valueOf(i2));
                break;
            case 2005:
                LIZLLL(concurrentMap, "st_preload_personalized").put("watch_duration_label", Integer.valueOf(i2));
                break;
            case 2006:
                LIZLLL(concurrentMap, "st_preload_personalized").put("stall_label", Integer.valueOf(i2));
                break;
            case 2007:
                LIZLLL(concurrentMap, "st_preload_personalized").put("first_frame_label", Integer.valueOf(i2));
                break;
            case 2008:
                LIZLLL(concurrentMap, "st_adaptive_range").put("enabled", Integer.valueOf(i2));
                break;
            case 2009:
                if (str2 == null) {
                    int i13 = C2187451AjH.LIZ;
                    C1471660oOq.LIZIZ("StrategyEvent", "EVENT_ADAPTIVE_RANGE_BUFFER: logInfo is null");
                } else {
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (JSONException e15) {
                        TryCatchGuardChecker.doCheck(e15);
                        int i14 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("EVENT_ADAPTIVE_RANGE_BUFFER:\n");
                        sbLIZ8.append(e15);
                        TTVideoEngineLog.w("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ8));
                        jSONObject = str2;
                    }
                    LIZLLL(concurrentMap, "st_adaptive_range").put("buffer_log", jSONObject);
                }
                break;
            case 2010:
                concurrentMap.put("st_remaining_buf_dur", Integer.valueOf(i2));
                break;
            case 2011:
                Map map = (Map) concurrentMap.get("st_buf_dur");
                if (map != null) {
                    Integer num = (Integer) map.get("diff_ret_count");
                    if (num == null) {
                        num = 0;
                    }
                    map.put("diff_ret_count", Integer.valueOf(num.intValue() + i2));
                }
                break;
            case 2012:
                try {
                    concurrentMap.put("st_preload_finished_time", Long.valueOf(CastLongProtector.parseLong(str2)));
                } catch (NumberFormatException e16) {
                    TryCatchGuardChecker.doCheck(e16);
                    int i15 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("EVENT_PLAY_RELATED_PRELOAD_FINISHED:\n");
                    sbLIZ9.append(e16);
                    C1471660oOq.LIZIZ("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ9));
                    concurrentMap.put("st_preload_finished_time", str2);
                    return;
                }
                break;
            case 2013:
                ConcurrentMap<String, Object> concurrentMapLIZLLL2 = LIZLLL(concurrentMap, "st_band_range");
                concurrentMapLIZLLL2.put("current_bandwidth", Integer.valueOf(i2));
                try {
                    concurrentMapLIZLLL2.put("band_bitrate_ratio", Float.valueOf(CastFloatProtector.parseFloat(str2)));
                } catch (NumberFormatException e17) {
                    TryCatchGuardChecker.doCheck(e17);
                    int i16 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append("LOG_KEY_BANDWIDTH_BITRATE_RATIO:\n");
                    sbLIZ10.append(e17);
                    C1471660oOq.LIZIZ("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ10));
                    concurrentMapLIZLLL2.put("band_bitrate_ratio", str2);
                    return;
                }
                break;
            case 2014:
                ((ConcurrentHashMap) this.LIZIZ).put("st_common", Collections.singletonMap("module_activated", Integer.valueOf(i2)));
                break;
            case 2015:
                if (str2 != null) {
                    try {
                        LIZLLL(concurrentMap, "st_preload_decision").put("info", new JSONObject(str2));
                    } catch (JSONException e18) {
                        TryCatchGuardChecker.doCheck(e18);
                        int i17 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append("LOG_KEY_PRELOAD_DECISION_INFO:\n");
                        sbLIZ11.append(e18);
                        TTVideoEngineLog.w("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ11));
                        LIZLLL(concurrentMap, "st_preload_decision").put("info", str2);
                        return;
                    }
                }
                break;
            case 2016:
                LIZLLL(concurrentMap, "st_buf_dur").put("lc_version", Integer.valueOf(i2));
                break;
            case 2017:
                LIZLLL(concurrentMap, "st_buf_dur").put("sliding_window", Integer.valueOf(i2));
                break;
            case 2018:
                if (!TextUtils.isEmpty(str2)) {
                    LIZLLL(this.LIZIZ, "st_preload").put(Scene.SCENE_SERVICE, str2);
                }
                break;
            case 2021:
                if (str2 != null) {
                    try {
                        LIZLLL(concurrentMap, "st_preload_decision2").put("info", new JSONObject(str2));
                    } catch (JSONException e19) {
                        TryCatchGuardChecker.doCheck(e19);
                        int i18 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                        sbLIZ12.append("LOG_KEY_PRELOAD_DECISION_INFO2:\n");
                        sbLIZ12.append(e19);
                        TTVideoEngineLog.w("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ12));
                        LIZLLL(concurrentMap, "st_preload_decision2").put("info", str2);
                        return;
                    }
                }
                break;
            case 2022:
                int i19 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("StrategyEvent", "[NetStrategy]receive event EVENT_APPLY_SWITCH_TO_CELLULAR.");
                C1471350oOL c1471350oOL = C1471340oOK.LIZ;
                int iLIZ = c1471350oOL.LIZ();
                int i20 = c1471350oOL.LIZ;
                EnumC1471360oOM enumC1471360oOM = EnumC1471360oOM.READY_SWITCH_TO_CELL;
                c1471350oOL.LIZ = enumC1471360oOM.getValue();
                c1471350oOL.LIZIZ(i20, enumC1471360oOM.getValue());
                TTVideoEngineLog.d("[NetStrategy]", C786410Ut5.j4("apply to cellular, start a delay timeout task, operateIndex:[%d].", new Object[]{Integer.valueOf(iLIZ)}));
                C786410Ut5.LJLIIL(30000L, C1475000oUE.LJ, new ARunnableS7S0001000_23(iLIZ, 1));
                break;
            case 2023:
                int i21 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("StrategyEvent", "[NetStrategy]receive event EVENT_APPLY_SWITCH_TO_WIFI.");
                C1471350oOL c1471350oOL2 = C1471340oOK.LIZ;
                int iLIZ2 = c1471350oOL2.LIZ();
                int i22 = c1471350oOL2.LIZ;
                EnumC1471360oOM enumC1471360oOM2 = EnumC1471360oOM.READY_SWITCH_TO_WIFI;
                c1471350oOL2.LIZ = enumC1471360oOM2.getValue();
                c1471350oOL2.LIZIZ(i22, enumC1471360oOM2.getValue());
                TTVideoEngineLog.d("[NetStrategy]", C786410Ut5.j4("apply to wifi, start a delay timeout task, operateIndex:[%d].", new Object[]{Integer.valueOf(iLIZ2)}));
                C786410Ut5.LJLIIL(30000L, C1475000oUE.LJ, new ARunnableS7S0001000_23(iLIZ2, 0));
                break;
            case 2024:
                int i23 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("StrategyEvent", "[NetStrategy]receive event EVENT_IO_SWITCH_TO_CELLULAR.");
                DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                dataLoaderHelper.getClass();
                if (C1474810oTv.LJJIFFI()) {
                    dataLoaderHelper.LJLJJL.getClass();
                    TTVideoEngineLog.d("multinetwork", "start do switch to cellular");
                    AVMDLMultiNetwork.switchToCellularNetwork();
                    TTVideoEngineLog.d("multinetwork", "end do switch to cellular");
                } else {
                    TTVideoEngineLog.d("multinetwork", "start do switch to cellular");
                    AVMDLMultiNetwork.switchToCellularNetwork();
                    TTVideoEngineLog.d("multinetwork", "end do switch to cellular");
                }
                break;
            case 2025:
                int i24 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("StrategyEvent", "[NetStrategy]receive event EVENT_IO_SWITCH_TO_DEFAULT.");
                DataLoaderHelper dataLoaderHelper2 = C805420Vie.LIZ;
                dataLoaderHelper2.getClass();
                if (C1474810oTv.LJJIFFI()) {
                    dataLoaderHelper2.LJLJJL.getClass();
                    TTVideoEngineLog.d("multinetwork", "start do switch to default");
                    AVMDLMultiNetwork.switchToDefaultNetwork();
                    TTVideoEngineLog.d("multinetwork", "end do switch to default");
                } else {
                    TTVideoEngineLog.d("multinetwork", "start do switch to default");
                    AVMDLMultiNetwork.switchToDefaultNetwork();
                    TTVideoEngineLog.d("multinetwork", "end do switch to default");
                }
                break;
            case 2026:
                int i25 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("StrategyEvent", "[NetStrategy]receive event EVENT_NET_API_VOD_CONTROL_MESSAGE.");
                try {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                    sbLIZ13.append("message: ");
                    sbLIZ13.append(jSONObject2);
                    TTVideoEngineLog.d("ApiVodNetController", C2188811AlT.LIZIZ(sbLIZ13));
                    C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS98S0000000_23(jSONObject2, 6));
                } catch (JSONException e20) {
                    TryCatchGuardChecker.doCheck(e20);
                    int i26 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append("EVENT_NET_API_VOD_CONTROL_MESSAGE:\n");
                    sbLIZ14.append(e20);
                    C1471660oOq.LIZIZ("StrategyEvent", C2188811AlT.LIZIZ(sbLIZ14));
                    return;
                }
                break;
            case 2027:
                int i27 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("StrategyEvent", "[NetStrategy]receive event EVENT_NET_API_VOD_CONTROL_ENTER_SCENE.");
                TTVideoEngineLog.d("ApiVodNetController", "enterApiNetControl.");
                C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS98S0000000_23(4));
                break;
            case 2028:
                int i28 = C2187451AjH.LIZ;
                TTVideoEngineLog.d("StrategyEvent", "[NetStrategy]receive event EVENT_NET_API_VOD_CONTROL_EXIT_SCENE.");
                TTVideoEngineLog.d("ApiVodNetController", "exitApiNetControl.");
                C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS98S0000000_23(5));
                break;
        }
    }
}
