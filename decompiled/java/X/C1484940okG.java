package X;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0okG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484940okG {
    public static final C2837017z LIZ = new C2837017z();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("app_start_to_main_focus", "feed_total", "cold_boot_application_attach_duration", "cold_boot_application_attach_to_create", "cold_boot_application_create_duration", "cold_boot_application_to_main", "cold_boot_main_create_duration", "cold_boot_main_create_to_resume", "cold_boot_main_resume_duration", "cold_boot_main_resume_to_measure", "cold_boot_main_measure_duration", "cold_boot_main_measure_to_focus", "main_task_SplitCompatInstall", "main_task_LegacyTask", "main_task_InitAVModule", "main_task_NpthCoreInitTask", "main_task_HybridKitConfigTask", "main_task_UIInitTask", "main_task_MediaStrategyInitTask", "main_task_InitPushTask", "main_task_LegacyTask", "main_task_InitAppsFlyer", "main_task_AssemInitTask", "main_task_NetworkInitTask", "main_task_AppStartupRecordTask");

    public static C1484950okH LIZIZ() {
        try {
            Intent intentLJIJI = C786410Ut5.LJIJI(C1BWL.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentLJIJI != null) {
                int intExtra = intentLJIJI.getIntExtra("temperature", 0) / 10;
                boolean booleanExtra = Build.VERSION.SDK_INT >= 28 ? intentLJIJI.getBooleanExtra("battery_low", false) : false;
                if (intExtra > 42 || intExtra < 0) {
                    return new C1484950okH("env_abnormal_temperature", String.valueOf(intExtra));
                }
                if (booleanExtra && intentLJIJI.getIntExtra("plugged", 0) == 0) {
                    return new C1484950okH("env_abnormal_low_battery", CardStruct.IStatusCode.DEFAULT);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce A[Catch: all -> 0x013c, TryCatch #0 {all -> 0x013c, blocks: (B:3:0x000c, B:6:0x0016, B:8:0x001d, B:9:0x0028, B:11:0x002e, B:13:0x003a, B:14:0x0046, B:16:0x004e, B:17:0x0053, B:19:0x005b, B:21:0x0065, B:23:0x006b, B:24:0x0079, B:28:0x0085, B:30:0x0093, B:32:0x009b, B:36:0x00ad, B:38:0x00b3, B:40:0x00bd, B:44:0x00c9, B:45:0x00ce, B:47:0x00d6, B:48:0x00e1, B:52:0x00f0, B:53:0x0101, B:55:0x0107, B:57:0x010f, B:58:0x0128, B:61:0x0133, B:59:0x012d, B:62:0x0136), top: B:69:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1484950okH LIZ(org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1484940okG.LIZ(org.json.JSONObject):X.0okH");
    }

    public static C1484950okH LIZJ(JSONObject jSONObject) {
        int iOptInt;
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        String str = null;
        int i2 = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (u.LJJIIJZLJL(next, "main_task_", false) && (iOptInt = jSONObject.optInt(next)) > 400 && iOptInt > i2) {
                str = next;
                i2 = iOptInt;
            }
        }
        if (str != null) {
            return new C1484950okH("cold_boot_heavy_main_task", str);
        }
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("cold_boot_application_attach_to_create");
        arrayList.add("cold_boot_application_to_main");
        arrayList.add("cold_boot_main_create_to_resume");
        arrayList.add("cold_boot_main_resume_to_measure");
        arrayList.add("cold_boot_main_measure_to_focus");
        String str2 = null;
        int i3 = 0;
        for (String str3 : arrayList) {
            int iOptInt2 = jSONObject.optInt(str3);
            if (iOptInt2 > 1000 && iOptInt2 > i3) {
                str2 = str3;
                i3 = iOptInt2;
            }
        }
        if (str2 != null) {
            return new C1484950okH("cold_boot_heavy_lifecycle_gap", str2);
        }
        ArrayList<String> arrayList2 = new ArrayList();
        arrayList2.add("cold_boot_application_attach_duration");
        arrayList2.add("cold_boot_application_attach_to_create");
        arrayList2.add("cold_boot_application_create_duration");
        arrayList2.add("cold_boot_application_to_main");
        arrayList2.add("cold_boot_main_create_duration");
        arrayList2.add("cold_boot_main_create_to_resume");
        arrayList2.add("cold_boot_main_resume_duration");
        arrayList2.add("cold_boot_main_resume_to_measure");
        arrayList2.add("cold_boot_main_measure_duration");
        arrayList2.add("cold_boot_main_measure_to_focus");
        String str4 = null;
        for (String str5 : arrayList2) {
            int iOptInt3 = jSONObject.optInt(str5);
            if (iOptInt3 > i) {
                str4 = str5;
                i = iOptInt3;
            }
        }
        if (Intrinsics.LJFF(str4, "cold_boot_main_measure_duration")) {
            int iOptInt4 = jSONObject.optInt("cold_boot_main_create_duration");
            if (iOptInt4 > 0 && i / iOptInt4 > 3) {
                return new C1484950okH("cold_boot_abnormal_phase", "cold_boot_main_measure_duration");
            }
        } else if (str4 != null) {
            return new C1484950okH("cold_boot_abnormal_phase", str4);
        }
        return null;
    }

    public static C1484950okH LJ(JSONObject jSONObject) {
        if (jSONObject.optInt("cold_boot_use_cache") == 1 && jSONObject.optInt("app_start_to_main_focus") <= 3800) {
            int iOptInt = jSONObject.optInt("app_start_to_main_focus");
            int iOptInt2 = jSONObject.optInt("cold_boot_start_to_setsurface");
            ArrayList<String> arrayList = new ArrayList();
            if (iOptInt2 - iOptInt > 1000) {
                arrayList.add("cold_boot_start_to_precreate");
                arrayList.add("player_precreate_real_duration");
                arrayList.add("player_precreate_end_to_prerender_start");
                arrayList.add("feed_get_cache_duration");
                arrayList.add("player_prerender_real_duration");
                arrayList.add("player_prerender_to_onprepared");
                arrayList.add("player_prerender_onprepared_to_setsurface");
            } else {
                arrayList.add("player_setsurface_duration");
                arrayList.add("player_setsurface_to_renderstart");
                arrayList.add("player_renderstart_to_firstframe");
            }
            int i = 0;
            String str = null;
            for (String str2 : arrayList) {
                int iOptInt3 = jSONObject.optInt(str2);
                if (iOptInt3 > i) {
                    str = str2;
                    i = iOptInt3;
                }
            }
            if (str != null) {
                return new C1484950okH("cold_boot_player_phase_abnormal", str);
            }
        }
        return null;
    }

    public static void LIZLLL(int i, JSONObject jSONObject) {
        Long lValueOf;
        int iIntValue;
        Long l;
        Double dValueOf;
        long jLongValue;
        int iIntValue2;
        ArrayList<Map> arrayList = new ArrayList(LIZ.LIZ());
        if (!arrayList.isEmpty()) {
            ListProtector.remove(arrayList, 0);
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            long jLongValue2 = 0;
            while (it2.hasNext()) {
                Long l2 = (Long) ((Map) it2.next()).get("app_start_to_main_focus");
                if (l2 != null) {
                    jLongValue2 += l2.longValue();
                    i2++;
                }
            }
            if (i2 > 3 && jLongValue2 / ((double) i2) < 2500.0d && i > 3800) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map map : arrayList) {
                    for (String str : LIZIZ) {
                        Long l3 = (Long) map.get(str);
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            Long l4 = (Long) linkedHashMap3.get(str);
                            if (l4 != null) {
                                jLongValue = l4.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            linkedHashMap3.put(str, Long.valueOf(jLongValue + jLongValue3));
                            Integer num = (Integer) linkedHashMap2.get(str);
                            if (num != null) {
                                iIntValue2 = num.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                            linkedHashMap2.put(str, Integer.valueOf(iIntValue2 + 1));
                        }
                    }
                }
                for (Object obj : linkedHashMap3.keySet()) {
                    Integer num2 = (Integer) linkedHashMap2.get(obj);
                    if (num2 != null && (iIntValue = num2.intValue()) > 0 && (l = (Long) linkedHashMap3.get(obj)) != null && (dValueOf = Double.valueOf(l.longValue())) != null) {
                        linkedHashMap.put(obj, Double.valueOf(dValueOf.doubleValue() / ((double) iIntValue)));
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    List<String> list = LIZIZ;
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iLIZIZ);
                    for (String str2 : list) {
                        String str3 = str2;
                        if (jSONObject.has(str3)) {
                            lValueOf = Long.valueOf(jSONObject.optLong(str3));
                        } else {
                            lValueOf = null;
                        }
                        linkedHashMap4.put(str2, lValueOf);
                    }
                    double d = 0.0d;
                    double d2 = 0.0d;
                    for (String str4 : LIZIZ) {
                        Long l5 = (Long) linkedHashMap4.get(str4);
                        Double d3 = (Double) linkedHashMap.get(str4);
                        if (l5 != null && d3 != null && d3.doubleValue() > d) {
                            long jLongValue4 = l5.longValue() - ((long) d3.doubleValue());
                            if (l5.longValue() > d3.doubleValue() * ((double) 2) && jLongValue4 > 200) {
                                double dLongValue = l5.longValue() / d3.doubleValue();
                                if (dLongValue > d2) {
                                    d2 = dLongValue;
                                    if (str4 != null) {
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        d = 0.0d;
                    }
                }
            }
        }
    }
}
