package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.File;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802460Vds {
    public final File LIZ;
    public boolean LIZIZ;

    public static void LIZ(String str, JSONObject jSONObject) {
        int i;
        Matcher matcher = PatternProtector.compile("^ (\\d{1,2})% (.+)$").matcher(str);
        if (!matcher.find()) {
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_cpu_efficiency", "unavailable");
            return;
        }
        int i2 = CastIntegerProtector.parseInt(matcher.group(1));
        C802910Veb c802910Veb = new C802910Veb("%");
        c802910Veb.LIZIZ(100L, 10L);
        C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_cpu_efficiency", c802910Veb.LIZ(i2));
        Matcher matcher2 = PatternProtector.compile("\\[(\\d+\\.\\d+)-\\d+\\.\\d+\\]\\{([\\d-]+)\\}(?:,\\\\s*)?").matcher(matcher.group(2));
        double d = 0.0d;
        while (matcher2.find()) {
            double d2 = CastDoubleProtector.parseDouble(matcher2.group(1));
            String strGroup = matcher2.group(2);
            if (strGroup != null && strGroup.contains("-")) {
                String[] strArrSplit = strGroup.split("-");
                i = (CastIntegerProtector.parseInt(strArrSplit[1]) - CastIntegerProtector.parseInt(strArrSplit[0])) + 1;
            } else {
                i = 1;
            }
            d += d2 * ((double) i);
        }
        C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_cpu_total_power", Long.valueOf((long) d));
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        Matcher matcher = PatternProtector.compile("^ Thread \\d+ = (\\d+) \\+ (\\d+), Process \\d+ = (\\d+) \\+ (\\d+)$").matcher(str);
        if (matcher.find() && matcher.groupCount() == 4) {
            int i = CastIntegerProtector.parseInt(matcher.group(1));
            int i2 = CastIntegerProtector.parseInt(matcher.group(2));
            int i3 = CastIntegerProtector.parseInt(matcher.group(3));
            int i4 = CastIntegerProtector.parseInt(matcher.group(4));
            C802910Veb c802910Veb = new C802910Veb("%");
            c802910Veb.LIZJ(new Long[]{0L, 1L, 10L, 25L, 50L, 75L, 100L});
            int i5 = i4 + i3;
            if (i5 != 0) {
                C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_jiff_thread_ratio", c802910Veb.LIZ(((i + i2) * 100) / i5));
            }
            if (i2 + i != 0) {
                C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_jiff_thread_user_ratio", c802910Veb.LIZ((i * 100) / r10));
            }
            if (i5 != 0) {
                C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_jiff_process_user_ratio", c802910Veb.LIZ((i3 * 100) / i5));
            }
        }
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        Matcher matcher = PatternProtector.compile("^ (\\d+)\\.\\d{2} \\(.*\\)$").matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            int i = CastIntegerProtector.parseInt(matcher.group(1));
            C802910Veb c802910Veb = new C802910Veb("");
            c802910Veb.LIZJ(new Long[]{0L, 4L, 10L, 30L, 60L, 100L, 150L, 200L});
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_loads", c802910Veb.LIZ(i));
        }
    }

    public static void LIZLLL(String str, JSONObject jSONObject) {
        Matcher matcher = PatternProtector.compile("^ Exec \\d+\\.\\d+\\((\\d+)%\\), Wait (.*), Sleep (.*), IOWait (.*)$").matcher(str);
        if (matcher.find() && matcher.groupCount() == 4) {
            C802910Veb c802910Veb = new C802910Veb("%");
            c802910Veb.LIZJ(new Long[]{0L, 1L, 10L, 25L, 50L, 75L, 100L});
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_exec_ratio", c802910Veb.LIZ(CastIntegerProtector.parseInt(matcher.group(1))));
            String[] strArr = {"wait_ratio", "sleep_ratio", "iowait_ratio"};
            int i = 0;
            do {
                String strGroup = matcher.group(i + 2);
                String strLIZ = "---";
                if (!"---".equals(strGroup)) {
                    Matcher matcher2 = PatternProtector.compile("^\\d+\\.\\d+\\((\\d+)%\\)$").matcher(strGroup);
                    if (matcher2.find() && matcher2.groupCount() == 1) {
                        if (i == 2) {
                            c802910Veb.LIZJ(new Long[]{0L, 1L, 5L, 10L, 25L, 50L, 75L, 100L});
                        }
                        strLIZ = c802910Veb.LIZ(CastIntegerProtector.parseInt(matcher2.group(1)));
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("npth_profiler_");
                sbLIZ.append(strArr[i]);
                C0VJO.LJIIIIZZ(jSONObject, C2188811AlT.LIZIZ(sbLIZ), strLIZ);
                i++;
            } while (i < 3);
        }
    }

    public static void LJ(String str, JSONObject jSONObject) {
        Matcher matcher = PatternProtector.compile("^ JavaHeap \\d+MB, Time (\\d+)\\.(\\d+), BlockTime (\\d+)\\.(\\d+), Count (\\d+), BlockCount (\\d+), MainWaitGcTime (\\d+)\\.(\\d+), MainGcTime (\\d+)\\.(\\d+)$").matcher(str);
        if (matcher.find() && matcher.groupCount() == 10) {
            long j = (CastLongProtector.parseLong(matcher.group(1)) * 1000) + CastLongProtector.parseLong(matcher.group(2));
            long j2 = (CastLongProtector.parseLong(matcher.group(3)) * 1000) + CastLongProtector.parseLong(matcher.group(4));
            long j3 = CastLongProtector.parseLong(matcher.group(5));
            long j4 = CastLongProtector.parseLong(matcher.group(6));
            long j5 = (CastLongProtector.parseLong(matcher.group(7)) * 1000) + CastLongProtector.parseLong(matcher.group(8));
            long j6 = (CastLongProtector.parseLong(matcher.group(9)) * 1000) + CastLongProtector.parseLong(matcher.group(10));
            C802910Veb c802910Veb = new C802910Veb("ms");
            c802910Veb.LIZJ(new Long[]{0L, 1L, 500L, 1000L, 1500L, 2000L, 3000L, Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL)});
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_gc_time", c802910Veb.LIZ(j));
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_gc_block_time", c802910Veb.LIZ(j2));
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_main_wait_gc_time", c802910Veb.LIZ(j5));
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_main_gc_time", c802910Veb.LIZ(j6));
            C802910Veb c802910Veb2 = new C802910Veb("");
            c802910Veb2.LIZJ(new Long[]{0L, 1L, 5L, 10L, 50L, 100L});
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_gc_count", c802910Veb2.LIZ(j3));
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_gc_block_count", c802910Veb2.LIZ(j4));
        }
    }

    public static void LJFF(String str, JSONObject jSONObject) {
        int i;
        Matcher matcher = PatternProtector.compile("^ Thread (\\d+) (\\d+), Process (\\d+) (\\d+)$").matcher(str);
        if (matcher.find() && matcher.groupCount() == 4) {
            C802910Veb c802910Veb = new C802910Veb("");
            int i2 = 0;
            c802910Veb.LIZJ(new Long[]{0L, 1L, 10L, 100L, 1000L, 10000L, 100000L});
            String[] strArr = {"thread_minor", "thread_major", "process_minor", "process_major"};
            do {
                i = i2 + 1;
                long j = CastLongProtector.parseLong(matcher.group(i));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("npth_profiler_fault_");
                sbLIZ.append(strArr[i2]);
                C0VJO.LJIIIIZZ(jSONObject, C2188811AlT.LIZIZ(sbLIZ), c802910Veb.LIZ(j));
                i2 = i;
            } while (i < 4);
        }
    }

    public static void LJI(String str, JSONObject jSONObject) {
        Matcher matcher = PatternProtector.compile("^ VSS \\d+\\([+-]\\d+\\)MB, RSS (\\d+)\\([+-]\\d+\\)MB, SWAP (\\d+)\\([+-]\\d+\\)MB$").matcher(str);
        if (matcher.find() && matcher.groupCount() == 2) {
            long j = CastLongProtector.parseLong(matcher.group(1)) + CastLongProtector.parseLong(matcher.group(2));
            C802910Veb c802910Veb = new C802910Veb("MB");
            c802910Veb.LIZJ(new Long[]{0L, 1L, 64L, 128L, 256L, 512L, 768L, 1024L, 1536L, 2048L});
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_procram_total", c802910Veb.LIZ(j));
        }
    }

    public static void LJIIIIZZ(String str, JSONObject jSONObject) {
        Matcher matcher = PatternProtector.compile("^ Total (\\d+)MB, Used \\d+\\([+-]\\d+\\)MB, Free \\d+\\([+-]\\d+\\)MB, Swapped (\\d+)\\(([+-])(\\d+)\\)MB$").matcher(str);
        if (matcher.find() && matcher.groupCount() == 4) {
            long j = CastLongProtector.parseLong(matcher.group(1));
            long j2 = CastLongProtector.parseLong(matcher.group(2));
            String strGroup = matcher.group(3);
            long j3 = CastLongProtector.parseLong(matcher.group(4));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((j / 1024) + 1);
            sbLIZ.append("GB");
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_sysram_total_size", C2188811AlT.LIZIZ(sbLIZ));
            C802910Veb c802910Veb = new C802910Veb("MB");
            c802910Veb.LIZJ(new Long[]{0L, 1L, 128L, 256L, 512L, 1024L, 1536L, 2048L, 3072L, 4096L});
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_sysram_swapped_size", c802910Veb.LIZ(j2));
            c802910Veb.LIZJ(new Long[]{0L, 1L, 16L, 32L, 64L, 128L, 256L, 512L});
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strGroup);
            sbLIZ2.append(" ");
            sbLIZ2.append(c802910Veb.LIZ(j3));
            C0VJO.LJIIIIZZ(jSONObject, "npth_profiler_sysram_swapped_delta", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static void LJIIIZ(JSONObject jSONObject, File file) {
        String strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "anr_ml_features.json"));
        if (strLJFF != null) {
            try {
                C0VJO.LIZLLL(jSONObject, new JSONObject(strLJFF));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            String strLIZJ = C08SE.LIZJ(new C0VSJ(file, "/anr_profiler.txt"));
            C0VJO.LJIIIIZZ(jSONObject, "anr_profiler", strLIZJ);
            if (!strLIZJ.isEmpty() && strLIZJ.length() > 10) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("filters");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                    jSONObject.put("filters", jSONObjectOptJSONObject);
                }
                C0VJO.LJIIIIZZ(jSONObjectOptJSONObject, "has_anr_profiler", "true");
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C802460Vds(java.io.File r17, org.json.JSONObject r18, X.C0VJI r19, X.C802470Vdt r20) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802460Vds.<init>(java.io.File, org.json.JSONObject, X.0VJI, X.0Vdt):void");
    }

    public final void LJII(String str, String str2, String str3, JSONObject jSONObject) {
        String str4;
        if (this.LIZIZ) {
            return;
        }
        try {
            String[] strArrSplit = str.trim().split(" ");
            boolean z = false;
            String str5 = strArrSplit[0];
            int i = CastIntegerProtector.parseInt(strArrSplit[3]);
            if (str5.startsWith(str2)) {
                if (jSONObject.has("lifecycle_from_adj")) {
                    boolean zOptBoolean = jSONObject.optBoolean("is_background_from_adj");
                    if (i > 200) {
                        z = true;
                    }
                    StringBuilder sb = new StringBuilder();
                    String str6 = "b";
                    if (z) {
                        str4 = "b";
                    } else {
                        str4 = "f";
                    }
                    sb.append(str4);
                    sb.append("_");
                    if (!zOptBoolean) {
                        str6 = "f";
                    }
                    sb.append(str6);
                    jSONObject.put("anr_process_lifecycle", sb);
                }
                try {
                    jSONObject.put("npth_profiler_main_nice", String.valueOf(strArrSplit[4]));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                try {
                    jSONObject.put("npth_profiler_main_group", strArrSplit[2]);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                try {
                    jSONObject.put("npth_profiler_process_adj", strArrSplit[3]);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                this.LIZIZ = true;
                return;
            }
            if (str5.startsWith(str3)) {
                if (i > 200) {
                    z = true;
                }
                try {
                    jSONObject.put("is_background_from_adj", z);
                    jSONObject.put("lifecycle_from_adj", 1);
                    return;
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    return;
                }
            }
            return;
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            C801940Vd2.LIZIZ("pushLifecycleFilters", th5);
        }
        TryCatchGuardChecker.doCheck(th5);
        C801940Vd2.LIZIZ("pushLifecycleFilters", th5);
    }
}
