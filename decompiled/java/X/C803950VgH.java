package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803950VgH {
    public static String LIZ(long j) {
        C802910Veb c802910Veb = new C802910Veb("ms");
        c802910Veb.LIZJ(new Long[]{0L, 1000L, 2000L, 3000L, Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), 7000L, 10000L});
        return c802910Veb.LIZ(j);
    }

    public static String LIZIZ(int i) {
        C802910Veb c802910Veb = new C802910Veb("");
        c802910Veb.LIZJ(new Long[]{0L, 1L, 5L, 10L, 20L});
        return c802910Veb.LIZ(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x008a, code lost:
    
        return 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:16:0x002b, B:24:0x004d, B:42:0x0080, B:44:0x0082, B:27:0x0057, B:29:0x005f, B:31:0x0064, B:34:0x006d), top: B:52:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LJFF(java.lang.String r8) {
        /*
            r7 = 0
            if (r8 == 0) goto L8b
            int r0 = r8.length()
            r5 = 2
            if (r0 < r5) goto L8b
            r4 = 0
            r3 = 0
        Lc:
            int r0 = r8.length()
            r2 = -1
            if (r3 >= r0) goto L8a
            char r0 = r8.charAt(r3)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L28
            char r1 = r8.charAt(r3)
            r0 = 46
            if (r1 == r0) goto L28
            if (r3 == r2) goto L8a
            goto L2b
        L28:
            int r3 = r3 + 1
            goto Lc
        L2b:
            java.lang.String r0 = r8.substring(r4, r3)     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = r8.substring(r3)     // Catch: java.lang.Throwable -> L85
            float r4 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.Throwable -> L85
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L85
            r0 = 115(0x73, float:1.61E-43)
            r3 = 3
            r2 = 1
            if (r1 == r0) goto L6d
            r0 = 3494(0xda6, float:4.896E-42)
            if (r1 == r0) goto L64
            r0 = 3525(0xdc5, float:4.94E-42)
            if (r1 == r0) goto L57
            r0 = 3742(0xe9e, float:5.244E-42)
            if (r1 != r0) goto L84
            java.lang.String r0 = "us"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L84
            goto L77
        L57:
            java.lang.String r0 = "ns"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L84
            r0 = 1232348160(0x49742400, float:1000000.0)
            float r4 = r4 / r0
            return r4
        L64:
            java.lang.String r0 = "ms"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L84
            return r4
        L6d:
            java.lang.String r0 = "s"
            boolean r0 = r6.equals(r0)     // Catch: java.lang.Throwable -> L85
            if (r0 == 0) goto L84
            r1 = 3
            goto L78
        L77:
            r1 = 1
        L78:
            r0 = 1148846080(0x447a0000, float:1000.0)
            if (r1 == r2) goto L82
            if (r1 == r5) goto L81
            if (r1 != r3) goto L84
            float r4 = r4 * r0
        L81:
            return r4
        L82:
            float r4 = r4 / r0
            return r4
        L84:
            return r7
        L85:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r7
        L8a:
            return r7
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C803950VgH.LJFF(java.lang.String):float");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static long LJI(String str) {
        long j;
        if (str != null && !str.isEmpty()) {
            boolean zStartsWith = str.startsWith("-");
            if (zStartsWith || str.startsWith("+")) {
                str = str.substring(1);
            }
            Matcher matcher = PatternProtector.compile("(\\d+)([dhms]+)").matcher(str);
            long j2 = 0;
            while (matcher.find()) {
                long j3 = CastLongProtector.parseLong(matcher.group(1));
                String strGroup = matcher.group(2);
                strGroup.getClass();
                switch (strGroup.hashCode()) {
                    case 100:
                        if (strGroup.equals("d")) {
                            j = 86400000;
                            j3 *= j;
                            j2 += j3;
                        }
                        break;
                    case 104:
                        if (strGroup.equals("h")) {
                            j = 3600000;
                            j3 *= j;
                            j2 += j3;
                        }
                        break;
                    case 109:
                        if (strGroup.equals("m")) {
                            j = 60000;
                            j3 *= j;
                            j2 += j3;
                        }
                        break;
                    case 115:
                        if (strGroup.equals("s")) {
                            j = 1000;
                            j3 *= j;
                            j2 += j3;
                        }
                        break;
                    case 3494:
                        if (strGroup.equals("ms")) {
                            j2 += j3;
                        }
                        break;
                }
            }
            if (zStartsWith) {
                return -j2;
            }
            return j2;
        }
        return -1L;
    }

    public static void LJIIIIZZ(JSONObject jSONObject) {
        String str;
        int i;
        long j;
        long j2;
        long j3;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("logcat");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("filters");
        long jOptLong = jSONObject.optLong("crash_time");
        int iOptInt = jSONObject.optInt("pid");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0 && jSONObjectOptJSONObject != null) {
            C803960VgI c803960VgI = new C803960VgI();
            C803970VgJ c803970VgJ = new C803970VgJ();
            int i2 = 1;
            int length = jSONArrayOptJSONArray.length() - 1;
            while (length > 0) {
                try {
                    String string = JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, length);
                    if (!TextUtils.isEmpty(string)) {
                        long jLIZJ = LIZJ(jOptLong, string);
                        String strSubstring = string.substring(19);
                        if (strSubstring.contains("ANR_LOG")) {
                            i = 0;
                        } else if (strSubstring.contains("GC freed")) {
                            i = 1;
                        } else if (strSubstring.contains("WaitForGcToComplete blocked")) {
                            i = 2;
                        }
                        Matcher matcher = PatternProtector.compile("(\\d+)\\s+(\\d+) \\S\\s+[\\s\\S]*:([\\s\\S]*)").matcher(strSubstring);
                        if (matcher.find()) {
                            String strGroup = matcher.group(i2);
                            String strGroup2 = matcher.group(2);
                            String strGroup3 = matcher.group(3);
                            if (strGroup != null) {
                                j = CastLongProtector.parseLong(strGroup);
                            } else {
                                j = 0;
                            }
                            if (strGroup2 != null) {
                                j3 = CastLongProtector.parseLong(strGroup2);
                                j2 = 0;
                            } else {
                                j2 = 0;
                                j3 = 0;
                            }
                            if (j != j2 && iOptInt == j && strGroup3 != null) {
                                if (i == 0) {
                                    try {
                                        LIZLLL(c803970VgJ, jOptLong, jLIZJ, strGroup3);
                                    } catch (Exception e) {
                                        e = e;
                                        TryCatchGuardChecker.doCheck(e);
                                        new RuntimeException(e);
                                    }
                                } else {
                                    try {
                                        LJ(c803960VgI, jOptLong, i, jLIZJ, j, j3, strGroup3);
                                    } catch (Exception e2) {
                                        e = e2;
                                        TryCatchGuardChecker.doCheck(e);
                                        new RuntimeException(e);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                length--;
                i2 = 1;
            }
            long j4 = 0;
            try {
                C0VJO.LJIIIIZZ(jSONObject, "logcat_gc_info", c803960VgI.LIZJ());
                String str2 = c803960VgI.LJII;
                if (str2 != null) {
                    jSONObjectOptJSONObject.put("logcat_gc_cause", str2);
                    jSONObjectOptJSONObject.put("logcat_gc_cause_cost", LIZ(c803960VgI.LJIIIIZZ));
                    jSONObjectOptJSONObject.put("logcat_gc_count_range", LIZIZ(c803960VgI.LJ));
                    jSONObjectOptJSONObject.put("logcat_gc_total_cost_range", LIZ(c803960VgI.LIZ));
                    int i3 = c803960VgI.LJ;
                    if (i3 != 0) {
                        j4 = c803960VgI.LIZ / ((long) i3);
                    }
                    jSONObjectOptJSONObject.put("logcat_gc_avg_cost_range", LIZ(j4));
                }
                C0VJO.LJIIIIZZ(jSONObject, "logcat_anr_info", c803970VgJ.LIZ());
                int i4 = c803970VgJ.LIZJ;
                if (i4 != 0) {
                    if (i4 != i2) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    str = "wrong";
                                } else {
                                    str = "parsed_msg";
                                }
                            } else {
                                str = "dropped";
                            }
                        } else {
                            str = "parsed_log";
                        }
                    } else {
                        str = "found";
                    }
                } else {
                    str = "none";
                }
                C0VJO.LJIIIIZZ(jSONObjectOptJSONObject, "anr_log_tag", str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static long LIZJ(long j, String str) {
        try {
            String strSubstring = str.substring(0, 18);
            String strJ4 = C786410Ut5.j4("%tY", new Object[]{new Date(j)});
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strJ4);
            sbLIZ.append("-");
            sbLIZ.append(strSubstring);
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").parse(C2188811AlT.LIZIZ(sbLIZ));
            if (date != null) {
                return date.getTime();
            }
            return -1L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(org.json.JSONObject r7, java.io.File r8) {
        /*
            X.0VSJ r5 = new X.0VSJ
            java.lang.String r6 = "logcat.txt"
            r5.<init>(r8, r6)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L1d
            boolean r0 = r5.isDirectory()
            if (r0 != 0) goto L1d
            long r3 = r5.length()
            r1 = 50
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3c
        L1d:
            java.lang.String r1 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L26
            r0 = 0
            com.bytedance.crash.jni.NativeBridge.LJIIJJI(r1, r0)     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2a:
            X.0VSJ r5 = new X.0VSJ
            r5.<init>(r8, r6)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L3b
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L3c
        L3b:
            return
        L3c:
            long r0 = r5.length()
            int r4 = (int) r0
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            X.0VSF r0 = new X.0VSF     // Catch: java.lang.Throwable -> L67
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L67
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L67
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L67
        L50:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L6e
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r4 >= r0) goto L5d
            r3.put(r1)     // Catch: java.lang.Throwable -> L65
        L5d:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L65
            int r0 = r0 + 1
            int r4 = r4 - r0
            goto L50
        L65:
            r0 = move-exception
            goto L69
        L67:
            r0 = move-exception
            r2 = 0
        L69:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L76
        L6e:
            r2.close()     // Catch: java.io.IOException -> L72
            goto L76
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L76:
            int r0 = r3.length()
            if (r0 == 0) goto L86
            java.lang.String r0 = "logcat"
            r7.put(r0, r3)     // Catch: org.json.JSONException -> L82
            return
        L82:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L86:
            return
        L87:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L87
            if (r2 == 0) goto L95
            r2.close()     // Catch: java.io.IOException -> L91
            throw r1
        L91:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L95:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C803950VgH.LJII(org.json.JSONObject, java.io.File):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C803970VgJ r10, long r11, long r13, java.lang.String r15) {
        /*
            java.lang.String r0 = "Blocked msg"
            boolean r0 = r15.contains(r0)
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = r10.LIZJ
            r6 = 1
            if (r6 <= r0) goto L10
            r10.LIZJ = r6
        L10:
            java.lang.String r0 = ".*?Blocked msg = (\\{.*?\\}) , cost\\s+=\\s+(\\d+)\\s+ms"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)     // Catch: java.lang.Throwable -> Lbc
            java.util.regex.Matcher r1 = r0.matcher(r15)     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r1.find()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto Lc5
            int r0 = r10.LIZJ     // Catch: java.lang.Throwable -> Lbc
            r5 = 2
            if (r5 <= r0) goto L27
            r10.LIZJ = r5     // Catch: java.lang.Throwable -> Lbc
        L27:
            java.lang.String r4 = r1.group(r6)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r1.group(r5)     // Catch: java.lang.Throwable -> Lbc
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> Lbc
            long r2 = (long) r0     // Catch: java.lang.Throwable -> Lbc
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r7 = r11 - r0
            r0 = 10000(0x2710, double:4.9407E-320)
            long r11 = r11 - r0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 < 0) goto L56
            long r0 = r10.LIZ     // Catch: java.lang.Throwable -> Lbc
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 > 0) goto L4e
            r7 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L5b
            goto L56
        L4e:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L56
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5b
        L56:
            r0 = 1
        L57:
            r1 = 3
            if (r0 == 0) goto L64
            goto L5d
        L5b:
            r0 = 0
            goto L57
        L5d:
            int r0 = r10.LIZJ     // Catch: java.lang.Throwable -> Lbc
            if (r1 <= r0) goto L63
            r10.LIZJ = r1     // Catch: java.lang.Throwable -> Lbc
        L63:
            return
        L64:
            r10.LIZIZ = r13     // Catch: java.lang.Throwable -> Lbc
            r10.LIZ = r2     // Catch: java.lang.Throwable -> Lbc
            r2 = -1
            r10.LIZLLL = r2     // Catch: java.lang.Throwable -> Lbc
            r10.LJ = r2     // Catch: java.lang.Throwable -> Lbc
            r7 = 0
            r10.LJFF = r7     // Catch: java.lang.Throwable -> Lbc
            r10.LJI = r7     // Catch: java.lang.Throwable -> Lbc
            r10.LJII = r7     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto L78
            goto L7c
        L78:
            r8 = r7
            r6 = -1
            r5 = r7
            goto Lb0
        L7c:
            java.lang.String r0 = ".*?when=(\\S+)\\s+what=(\\d+)\\s+target=(\\S+)\\s+(.*?)=(.*?)\\}$"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)     // Catch: java.lang.Throwable -> Lbc
            java.util.regex.Matcher r4 = r0.matcher(r4)     // Catch: java.lang.Throwable -> Lbc
            boolean r0 = r4.find()     // Catch: java.lang.Throwable -> Lbc
            if (r0 == 0) goto L78
            java.lang.String r0 = r4.group(r6)     // Catch: java.lang.Throwable -> Lbc
            long r2 = LJI(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r4.group(r5)     // Catch: java.lang.Throwable -> Lbc
            int r6 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r5 = r4.group(r1)     // Catch: java.lang.Throwable -> Lbc
            r1 = 4
            java.lang.String r8 = r4.group(r1)     // Catch: java.lang.Throwable -> Lbc
            r0 = 5
            java.lang.String r7 = r4.group(r0)     // Catch: java.lang.Throwable -> Lbc
            int r0 = r10.LIZJ     // Catch: java.lang.Throwable -> Lbc
            if (r1 <= r0) goto Lb0
            r10.LIZJ = r1     // Catch: java.lang.Throwable -> Lbc
        Lb0:
            r10.LIZLLL = r2     // Catch: java.lang.Throwable -> Lbc
            long r0 = (long) r6     // Catch: java.lang.Throwable -> Lbc
            r10.LJ = r0     // Catch: java.lang.Throwable -> Lbc
            r10.LJFF = r5     // Catch: java.lang.Throwable -> Lbc
            r10.LJI = r8     // Catch: java.lang.Throwable -> Lbc
            r10.LJII = r7     // Catch: java.lang.Throwable -> Lbc
            return
        Lbc:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "parseAnrLogException"
            X.C801940Vd2.LIZIZ(r0, r1)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C803950VgH.LIZLLL(X.0VgJ, long, long, java.lang.String):void");
    }

    public static void LJ(C803960VgI c803960VgI, long j, int i, long j2, long j3, long j4, String str) {
        if (j2 <= Mp4ScreenVideoLoadTimeout.CONTROL + j && j2 >= j - 30000) {
            if (i == 1) {
                c803960VgI.LJFF++;
                Matcher matcher = PatternProtector.compile("(\\S+)\\s+.*?GC freed.*?paused \\S+ total (\\S+)").matcher(str);
                if (matcher.find()) {
                    String strGroup = matcher.group(1);
                    float fLJFF = LJFF(matcher.group(2));
                    c803960VgI.LIZIZ = (long) (c803960VgI.LIZIZ + fLJFF);
                    if (!"Background".equals(strGroup)) {
                        c803960VgI.LIZ = (long) (c803960VgI.LIZ + fLJFF);
                        c803960VgI.LJ++;
                    }
                    if (j3 == j4) {
                        c803960VgI.LIZLLL = (long) (c803960VgI.LIZLLL + fLJFF);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            Matcher matcher2 = PatternProtector.compile("WaitForGcToComplete blocked \\S+ on (\\S+) for (\\S+)").matcher(str);
            if (!matcher2.find()) {
                return;
            }
            String strGroup2 = matcher2.group(1);
            long jLJFF = (long) LJFF(matcher2.group(2));
            Long l = (Long) ((HashMap) c803960VgI.LJIIIZ).get(strGroup2);
            if (l == null) {
                ((HashMap) c803960VgI.LJIIIZ).put(strGroup2, Long.valueOf(jLJFF));
            } else {
                ((HashMap) c803960VgI.LJIIIZ).put(strGroup2, Long.valueOf(l.longValue() + jLJFF));
            }
            if (j3 != j4) {
                return;
            }
            c803960VgI.LIZJ = c803960VgI.LIZJ + 1 + jLJFF;
        }
    }
}
