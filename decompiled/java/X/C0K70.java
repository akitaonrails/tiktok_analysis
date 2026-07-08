package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0K70, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K70 {
    public static final Map<String, C0K73> LIZ = new LinkedHashMap();
    public static final Map<String, C1098100egK> LIZIZ = new LinkedHashMap();

    public static int LIZ(Throwable th) {
        if (th == null) {
            return 0;
        }
        if (th instanceof C501470JlZ) {
            return ((C501520Jle) th).getErrorCode();
        }
        if (th instanceof C1494450ozb) {
            return ((C1494450ozb) th).getCronetInternalErrorCode();
        }
        if (th instanceof C1811850xFX) {
            return ((C1811850xFX) th).statusCode;
        }
        if (th instanceof C1494430ozZ) {
            return ((C1494430ozZ) th).getStatusCode();
        }
        if (th instanceof C1494690ozz) {
            return ((C1494690ozz) th).getStatusCode();
        }
        return -1;
    }

    public static long LIZIZ(Context context) {
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJjkU28CW5xrH7wCrBChNtxvn++0tb0akxscRtkWRR1RoT4K72icECnkw==", null));
        return memoryInfo.totalMem - memoryInfo.availMem;
    }

    public static void LIZJ(Context context, String str) {
        if (context == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0K73 c0k73 = (C0K73) ((LinkedHashMap) LIZ).get(str);
        if (c0k73 == null) {
            return;
        }
        C0K71 c0k71 = c0k73.LIZ;
        if (c0k71.LIZJ != 0) {
            return;
        }
        c0k71.LIZJ = jCurrentTimeMillis;
        c0k71.LJFF = jCurrentTimeMillis - c0k71.LIZIZ;
        C0K72 c0k72 = c0k73.LIZIZ;
        c0k72.LIZLLL = LIZIZ(context) - c0k72.LIZJ;
    }

    public static void LIZLLL(String str, Context context) {
        if (context != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0K73 c0k73 = (C0K73) ((LinkedHashMap) LIZ).get(str);
            if (c0k73 != null) {
                C0K71 c0k71 = c0k73.LIZ;
                if (c0k71.LIZLLL == 0) {
                    c0k71.LIZLLL = jCurrentTimeMillis;
                    c0k71.LJI = jCurrentTimeMillis - c0k71.LIZIZ;
                    C0K72 c0k72 = c0k73.LIZIZ;
                    c0k72.LJ = LIZIZ(context) - c0k72.LIZJ;
                    c0k73.LIZ.LJIIIIZZ = LIZ(null);
                    c0k73.LIZIZ.LJII = LIZ(null);
                }
            }
        }
    }

    public static void LJ(String str, Context context, EnumC499450JiJ enumC499450JiJ) {
        C0K73 c0k73;
        boolean z;
        if (context != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, C0K73> map = LIZ;
            C0K73 c0k732 = (C0K73) ((LinkedHashMap) map).get(str);
            if (c0k732 != null) {
                C0K71 c0k71 = c0k732.LIZ;
                if (c0k71.LJ == 0) {
                    c0k71.LJ = jCurrentTimeMillis;
                    c0k71.LJII = jCurrentTimeMillis - c0k71.LIZIZ;
                    C0K72 c0k72 = c0k732.LIZIZ;
                    c0k72.LJFF = LIZIZ(context) - c0k72.LIZJ;
                    c0k732.LIZ.LJIIIZ = LIZ(null);
                    c0k732.LIZIZ.LJIIIIZZ = LIZ(null);
                    if (map.containsKey(str) && (c0k73 = (C0K73) ((LinkedHashMap) map).get(str)) != null) {
                        if (enumC499450JiJ == EnumC499450JiJ.GENERAL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C0K71 c0k712 = c0k73.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("livesdk_subscription_");
                        sbLIZ.append(enumC499450JiJ.getType());
                        sbLIZ.append("_page_show_time");
                        C474500IjA c474500IjALIZ = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        c474500IjALIZ.LJJII(Long.valueOf(c0k712.LIZIZ), "start_ts");
                        c474500IjALIZ.LJJII(Long.valueOf(c0k712.LIZJ), "fcp_ts");
                        c474500IjALIZ.LJJII(Long.valueOf(c0k712.LIZLLL), "fmp_ts");
                        c474500IjALIZ.LJJII(Long.valueOf(c0k712.LJ), "tti_ts");
                        c474500IjALIZ.LJJII(Long.valueOf(c0k712.LJFF), "fcp_duration");
                        c474500IjALIZ.LJJII(Long.valueOf(c0k712.LJI), "fmp_duration");
                        c474500IjALIZ.LJJII(Long.valueOf(c0k712.LJII), "tti_duration");
                        c474500IjALIZ.LJJII(Integer.valueOf(c0k712.LJIIIIZZ), "fmp_error_code");
                        c474500IjALIZ.LJJII(Integer.valueOf(c0k712.LJIIIZ), "tti_error_code");
                        c474500IjALIZ.LJJII(c0k712.LJIIJ, "show_entrance");
                        if (z) {
                            c474500IjALIZ.LJJII(c0k712.LIZ, "entrance");
                        }
                        c474500IjALIZ.LIZ();
                        C0K72 c0k722 = c0k73.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("livesdk_subscription_");
                        sbLIZ2.append(enumC499450JiJ.getType());
                        sbLIZ2.append("_page_memory");
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        c474500IjALIZ2.LJJII(Long.valueOf(c0k722.LIZIZ), "start_ts");
                        c474500IjALIZ2.LJJII(Long.valueOf(c0k722.LIZJ / 1024), "start_memory");
                        c474500IjALIZ2.LJJII(Long.valueOf(c0k722.LIZLLL / 1024), "fcp_memory_increase");
                        c474500IjALIZ2.LJJII(Long.valueOf(c0k722.LJ / 1024), "fmp_memory_increase");
                        c474500IjALIZ2.LJJII(Long.valueOf(c0k722.LJFF / 1024), "tti_memory_increase");
                        c474500IjALIZ2.LJJII(c0k722.LJI, "show_entrance");
                        c474500IjALIZ2.LJJII(Integer.valueOf(c0k722.LJII), "fmp_memory_error_code");
                        c474500IjALIZ2.LJJII(Integer.valueOf(c0k722.LJIIIIZZ), "tti_memory_error_code");
                        if (z) {
                            c474500IjALIZ2.LJJII(c0k722.LIZ, "entrance");
                        }
                        c474500IjALIZ2.LIZ();
                        map.remove(str);
                    }
                }
            }
        }
    }

    public static void LJFF(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZ.put(str, new C0K73(new C0K71(str3, jCurrentTimeMillis, str2), new C0K72(str3, jCurrentTimeMillis, LIZIZ(context), str2)));
    }
}
