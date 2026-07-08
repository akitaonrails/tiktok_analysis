package X;

import com.bytedance.crash.CrashType;
import com.bytedance.crash.crash.CrashSummary;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.BufferedReader;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803410VfP {
    public static String LIZ;

    public static String LIZIZ(String str) {
        try {
            long j = CastLongProtector.parseLong(str);
            if (j <= 50) {
                return "0~50ms";
            }
            if (j <= 100) {
                return "50~100ms";
            }
            if (j <= 150) {
                return "100~150ms";
            }
            if (j <= 200) {
                return "150~200ms";
            }
            if (j <= 300) {
                return "200~300ms";
            }
            if (j <= 400) {
                return "300~400ms";
            }
            if (j <= 500) {
                return "400~500ms";
            }
            if (j <= 700) {
                return "500~700ms";
            }
            if (j <= 1000) {
                return "700~1000ms";
            }
            if (j <= 1500) {
                return "1000~1500ms";
            }
            if (j <= 2000) {
                return "1500~2000ms";
            }
            if (j <= 3000) {
                return "2000~3000ms";
            }
            if (j <= 4000) {
                return "3000~4000ms";
            }
            if (j <= Mp4ScreenVideoLoadTimeout.CONTROL) {
                return "4000~5000ms";
            }
            if (j <= 7000) {
                return "5000~7000ms";
            }
            if (j <= 10000) {
                return "7000~10000ms";
            }
            return "> 10000ms";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "none";
        }
    }

    public static String LIZ(String str, Map map) {
        String str2;
        if (map != null && (str2 = (String) map.get(str)) != null && !str2.isEmpty()) {
            return str2;
        }
        return "none";
    }

    public static void LIZJ(CrashSummary crashSummary, File file, JSONObject jSONObject) {
        String str;
        BufferedReader bufferedReader;
        String str2 = "none";
        if (crashSummary.getCrashType() != CrashType.NATIVE) {
            return;
        }
        boolean z = true;
        HashMap map = null;
        if (file != null) {
            C0VSJ c0vsj = new C0VSJ(file, "tombstone.txt");
            if (c0vsj.exists() && c0vsj.length() != 0) {
                try {
                    bufferedReader = new BufferedReader(new C0VSF(c0vsj));
                    loop0: while (true) {
                        boolean z2 = false;
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break loop0;
                                }
                                if (!z2) {
                                    if (line.equals("metrics:")) {
                                        z2 = true;
                                    }
                                } else if (!line.startsWith("--- --- --- ")) {
                                    int iIndexOf = line.indexOf(58);
                                    if (iIndexOf != -1) {
                                        String strSubstring = line.substring(0, iIndexOf);
                                        String strTrim = line.substring(iIndexOf + 1).trim();
                                        if (!strSubstring.isEmpty() && !strTrim.isEmpty()) {
                                            if (map == null) {
                                                map = new HashMap();
                                            }
                                            map.put(strSubstring, strTrim);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("Failed to read metrics from tombstone.");
                                    sbLIZ.append(th);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    C798010VSd.LIZ(bufferedReader);
                                    throw th2;
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
                C798010VSd.LIZ(bufferedReader);
            }
        }
        String[] strArr = {"unwind_return_code", "unwind_to_entrypoint", "unwind_last_name", "dumper_has_stack", "dumper_has_dex", "dump_crash_thread_done", "tombstone_done", "dumper_warning_code", "dumper_all_done", "has_protector"};
        int i = 0;
        do {
            String str3 = strArr[i];
            C0VJO.LIZIZ(str3, LIZ(str3, map), jSONObject);
            i++;
        } while (i < 10);
        C0VJO.LIZJ(jSONObject, "has_dumper_metrics", Boolean.TRUE);
        String strLIZ = LIZ("crash_frames_count", map);
        C0VJO.LIZIZ("crash_frames_count", strLIZ, jSONObject);
        try {
            long j = CastLongProtector.parseLong(strLIZ);
            if (j > 200) {
                strLIZ = "(200 - MAX)";
            } else if (j > 150) {
                strLIZ = "(150 - 200]";
            } else if (j > 100) {
                strLIZ = "(100 - 150]";
            } else if (j > 70) {
                strLIZ = "(70 - 100]";
            } else if (j > 50) {
                strLIZ = "(50 - 70]";
            } else if (j > 40) {
                strLIZ = "(40 - 50]";
            } else if (j > 30) {
                strLIZ = "(30 - 40]";
            } else if (j > 20) {
                strLIZ = "(20 - 30]";
            } else if (j > 15) {
                strLIZ = "(15 - 20]";
            } else if (j > 10) {
                strLIZ = "(10 - 15]";
            } else if (j > 5) {
                strLIZ = "(5 - 10]";
            } else if (j > 1) {
                strLIZ = "(1 - 5]";
            }
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            strLIZ = "none";
        }
        C0VJO.LIZIZ("crash_frames_count_range", strLIZ, jSONObject);
        String strLIZ2 = LIZ("all_frames_count", map);
        C0VJO.LIZIZ("all_frames_count", strLIZ2, jSONObject);
        try {
            long j2 = CastLongProtector.parseLong(strLIZ2);
            if (j2 > Mp4ScreenVideoLoadTimeout.CONTROL) {
                str2 = "(5000 - MAX)";
            } else if (j2 > 4000) {
                str2 = "(4000 - 5000]";
            } else if (j2 > 3000) {
                str2 = "(3000 - 4000]";
            } else if (j2 > 2000) {
                str2 = "(2000 - 3000]";
            } else if (j2 > 1500) {
                str2 = "(1500 - 2000]";
            } else if (j2 > 1000) {
                str2 = "(1000 - 1500]";
            } else if (j2 > 500) {
                str2 = "(500 - 1000]";
            } else if (j2 > 1) {
                str2 = "(1 - 500]";
            } else {
                str2 = strLIZ2;
            }
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
        }
        C0VJO.LIZIZ("all_frames_count_range", str2, jSONObject);
        String strLIZ3 = LIZ("tombstone_time", map);
        C0VJO.LIZIZ("tombstone_time", strLIZ3, jSONObject);
        C0VJO.LIZIZ("tombstone_time_range", LIZIZ(strLIZ3), jSONObject);
        String strLIZ4 = LIZ("dumper_total_time", map);
        C0VJO.LIZIZ("dumper_total_time", strLIZ4, jSONObject);
        C0VJO.LIZIZ("dumper_total_time_range", LIZIZ(strLIZ4), jSONObject);
        String strLIZ5 = LIZ("minidump_done", map);
        C0VSJ c0vsj2 = new C0VSJ(file, "minidump");
        C0VJO.LIZIZ("minidump_enabled", LIZ("minidump_enabled", map), jSONObject);
        C0VJO.LIZIZ("minidump_done", strLIZ5, jSONObject);
        C0VJO.LIZIZ("has_minidump", String.valueOf(c0vsj2.exists()), jSONObject);
        String strLIZ6 = LIZ("minidump_time", map);
        C0VJO.LIZIZ("minidump_time", strLIZ6, jSONObject);
        C0VJO.LIZIZ("minidump_time_range", LIZIZ(strLIZ6), jSONObject);
        C0VJO.LIZIZ("coredump_enabled", LIZ("coredump_enabled", map), jSONObject);
        if (map != null && (str = (String) map.get("coredump_size")) != null) {
            str.isEmpty();
        }
        LIZ("coredump_async_mode", map);
        LIZ = LIZ("coredump_return_code", map);
        LIZ("coredump_time", map);
        try {
            if (CastLongProtector.parseLong(LIZ) != 0) {
                z = false;
            }
            String.valueOf(z);
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
        }
        if (jSONObject.length() > 0) {
            C0VJO.LIZJ(jSONObject, "coredump_miss", Boolean.TRUE);
        }
        C0VJO.LIZIZ("may_have_core_dump", "false", jSONObject);
    }
}
