package X;

import Y.ARunnableS22S0400000_13;
import android.content.Context;
import android.os.Process;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.crash.CrashSummary;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import dl3.h;
import im3.b;
import im3.o;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Ve6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802600Ve6 {
    public static C802600Ve6 LIZLLL;
    public final C0VSJ LIZ;
    public final C802930Ved LIZIZ;
    public final C0VSJ LIZJ;

    public static String LIZ() {
        long jLIZJ = C0VX9.LIZJ();
        int iMyPid = Process.myPid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(jLIZJ);
        sbLIZ.append("-");
        sbLIZ.append(iMyPid);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C802600Ve6(Context context, C0VSJ c0vsj) {
        C0VSJ c0vsjLIZIZ = C2112008Pe.LIZIZ(c0vsj, "crash");
        this.LIZ = c0vsjLIZIZ;
        C2112008Pe.LIZIZ(c0vsj, "protector");
        C0VSJ c0vsj2 = new C0VSJ(c0vsjLIZIZ, LIZ());
        this.LIZJ = c0vsj2;
        C801700Vce c801700Vce = new C801700Vce(c0vsj2);
        new C802250VdX(c801700Vce);
        C0VYT.LIZ("JavaCrash_Init");
        this.LIZIZ = new C802930Ved(context, c801700Vce);
        C0VYT.LIZ("NativeCrash_Init");
    }

    public final void LIZJ(final C802790VeP c802790VeP, long j) {
        File[] fileArrListFiles = this.LIZ.listFiles();
        if (fileArrListFiles != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uploadAll:crashDumpDir:");
            sbLIZ.append(this.LIZJ.getName());
            C2188811AlT.LIZIZ(sbLIZ);
            int i = 0;
            if (j > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int length = fileArrListFiles.length;
                while (i < length) {
                    File file = fileArrListFiles[i];
                    if (!file.getName().equals(this.LIZJ.getName())) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("uploadAll ");
                        sbLIZ2.append(file.getAbsolutePath());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        CrashSummary crashSummaryLoadFromDirectory = CrashSummary.loadFromDirectory(file);
                        if (crashSummaryLoadFromDirectory != null) {
                            C802500Vdw.LIZLLL(crashSummaryLoadFromDirectory.mCrashType, crashSummaryLoadFromDirectory.getProcessName(), crashSummaryLoadFromDirectory.getPid(), crashSummaryLoadFromDirectory.getCrashTime());
                            if (crashSummaryLoadFromDirectory.getCrashTime() - crashSummaryLoadFromDirectory.getStartTime() > C802300Vdc.LIZ) {
                                arrayList.add(crashSummaryLoadFromDirectory);
                                arrayList2.add(file);
                            } else {
                                LIZIZ(crashSummaryLoadFromDirectory, c802790VeP, file);
                            }
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("uploadAll delete dir");
                            sbLIZ3.append(file.getAbsolutePath());
                            C2188811AlT.LIZIZ(sbLIZ3);
                            C2112008Pe.LJ(file);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("uploadCrash() summary is null:");
                            sbLIZ4.append(file.getAbsolutePath());
                            C801940Vd2.LIZLLL("NPTH_CRASH_ERROR", new Exception(C2188811AlT.LIZIZ(sbLIZ4)));
                        }
                    }
                    i++;
                }
                if (!arrayList.isEmpty()) {
                    C0VXF.postDelayed(new ARunnableS22S0400000_13(this, arrayList, c802790VeP, arrayList2, 1), j);
                }
            } else {
                int length2 = fileArrListFiles.length;
                while (i < length2) {
                    File file2 = fileArrListFiles[i];
                    if (!file2.getName().equals(this.LIZJ.getName())) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("uploadAll ");
                        sbLIZ5.append(file2.getAbsolutePath());
                        C2188811AlT.LIZIZ(sbLIZ5);
                        CrashSummary crashSummaryLoadFromDirectory2 = CrashSummary.loadFromDirectory(file2);
                        if (crashSummaryLoadFromDirectory2 != null) {
                            C802500Vdw.LIZLLL(crashSummaryLoadFromDirectory2.mCrashType, crashSummaryLoadFromDirectory2.getProcessName(), crashSummaryLoadFromDirectory2.getPid(), crashSummaryLoadFromDirectory2.getCrashTime());
                            JSONObject jSONObject = new JSONObject();
                            C803410VfP.LIZJ(crashSummaryLoadFromDirectory2, file2, jSONObject);
                            crashSummaryLoadFromDirectory2.upload(c802790VeP, jSONObject);
                        } else {
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("uploadAll delete dir");
                            sbLIZ6.append(file2.getAbsolutePath());
                            C2188811AlT.LIZIZ(sbLIZ6);
                            C2112008Pe.LJ(file2);
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("uploadCrash() summary is null:");
                            sbLIZ7.append(file2.getAbsolutePath());
                            C801940Vd2.LIZLLL("NPTH_CRASH_ERROR", new Exception(C2188811AlT.LIZIZ(sbLIZ7)));
                        }
                    }
                    i++;
                }
            }
        }
        C0VXF.postDelayed(new Runnable() { // from class: X.0Vdu
            public final void LIZ() {
                File[] fileArrListFiles2;
                final C802790VeP c802790VeP2 = c802790VeP;
                try {
                    final C0VSJ c0vsj = C803150Vez.LJII.LIZ;
                    new AbstractC802520Vdy(c802790VeP2, c0vsj) { // from class: X.0Ve2
                        public static String LJIIL(String str) {
                            int iIndexOf = str.indexOf("==/lib/");
                            int iIndexOf2 = str.indexOf(".so");
                            if (iIndexOf < 0 || iIndexOf2 < 0) {
                                return "null";
                            }
                            return str.substring(iIndexOf, iIndexOf2).substring(7);
                        }

                        @Override // X.AbstractC802520Vdy
                        public final void LJII(Map<String, String> map, C802900Vea c802900Vea) {
                            String str;
                            super.LJII(map, c802900Vea);
                            if (!c802900Vea.LIZIZ.isEmpty()) {
                                str = "true";
                            } else {
                                str = "false";
                            }
                            HashMap map2 = (HashMap) map;
                            map2.put("has_gwp_asan", str);
                            map2.put("gwp_asan_app", C0VX9.LJ().getPackageName());
                        }

                        @Override // X.AbstractC802520Vdy
                        public final boolean LJIIIZ(File file3, C802900Vea c802900Vea) {
                            int iLIZIZ;
                            String[] strArrSplit;
                            String[] strArrSplit2;
                            String[] strArrSplit3;
                            String[] strArrSplit4;
                            String str = "Invalid Free";
                            C0VSJ c0vsj2 = new C0VSJ(file3, "tombstone.txt");
                            if (!c0vsj2.exists()) {
                                return false;
                            }
                            try {
                                JSONArray jSONArrayLJFF = C08SE.LJFF(c0vsj2.getAbsolutePath());
                                if (jSONArrayLJFF == null || (iLIZIZ = AbstractC802520Vdy.LIZIZ(0, "pid:", jSONArrayLJFF)) < 0) {
                                    return false;
                                }
                                String[] strArrSplit5 = jSONArrayLJFF.optString(iLIZIZ, null).trim().split("\\s");
                                for (int i2 = 0; i2 < strArrSplit5.length; i2++) {
                                    String str2 = strArrSplit5[i2];
                                    if ("pid:".equals(str2)) {
                                        String str3 = strArrSplit5[i2 + 1];
                                        c802900Vea.LJ = Long.decode(str3.substring(0, str3.length() - 1)).intValue();
                                    } else if ("tid:".equals(str2)) {
                                        String str4 = strArrSplit5[i2 + 1];
                                        c802900Vea.LJFF = Long.decode(str4.substring(0, str4.length() - 1)).intValue();
                                    } else if ("name:".equals(str2)) {
                                        String str5 = strArrSplit5[i2 + 1];
                                        c802900Vea.LIZJ = str5.substring(0, str5.length() - 1);
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                int iLIZIZ2 = AbstractC802520Vdy.LIZIZ(iLIZIZ + 1, "Signal ", jSONArrayLJFF);
                                if (iLIZIZ2 < 0) {
                                    return false;
                                }
                                sb.append(jSONArrayLJFF.optString(iLIZIZ2, null));
                                sb.append('\n');
                                int iLIZIZ3 = AbstractC802520Vdy.LIZIZ(iLIZIZ2 + 1, "GWP-ASan message:", jSONArrayLJFF);
                                if (iLIZIZ3 < 0) {
                                    return false;
                                }
                                String strReplace = jSONArrayLJFF.optString(iLIZIZ3, null).replace("GWP-ASan message:", "abort message:");
                                sb.append(strReplace);
                                sb.append('\n');
                                if (strReplace.contains("Use After Free")) {
                                    str = "Use After Free";
                                } else if (strReplace.contains("Double Free")) {
                                    str = "Double Free";
                                } else if (strReplace.contains("Buffer Overflow")) {
                                    str = "Buffer Overflow";
                                } else if (strReplace.contains("Buffer Underflow")) {
                                    str = "Buffer Underflow";
                                } else if (!strReplace.contains("Invalid Free")) {
                                    str = "Unknown";
                                }
                                int iLIZIZ4 = AbstractC802520Vdy.LIZIZ(iLIZIZ3 + 1, "backtrace:", jSONArrayLJFF);
                                if (iLIZIZ4 < 0) {
                                    return false;
                                }
                                String str6 = "    #00";
                                int i3 = iLIZIZ4 + 1;
                                String strSubstring = "None";
                                String strSubstring2 = "None";
                                while (i3 < jSONArrayLJFF.length()) {
                                    String strOptString = jSONArrayLJFF.optString(i3, null);
                                    if (!strOptString.startsWith("    #")) {
                                        break;
                                    }
                                    sb.append(strOptString.trim());
                                    sb.append('\n');
                                    if ("Double Free".equals(str)) {
                                        str6 = "    #03";
                                    }
                                    if (!strOptString.endsWith("libc.so") && !strOptString.endsWith("libc++_shared.so")) {
                                        if (strOptString.startsWith(str6) && (strArrSplit4 = LJIIL(strOptString).trim().split("/")) != null && strArrSplit4.length > 1) {
                                            String str7 = strArrSplit4[1];
                                            strSubstring2 = str7.substring(str7.lastIndexOf(47) + 1);
                                        }
                                    } else if (strOptString.startsWith("    #01") && (strArrSplit3 = LJIIL(strOptString).trim().split("/")) != null && strArrSplit3.length > 1) {
                                        String str8 = strArrSplit3[1];
                                        strSubstring2 = str8.substring(str8.lastIndexOf(47) + 1);
                                    }
                                    i3++;
                                }
                                c802900Vea.LIZIZ = sb.toString();
                                int iLIZIZ5 = AbstractC802520Vdy.LIZIZ(i3, "deallocated by thread", jSONArrayLJFF) + 1;
                                String strSubstring3 = "None";
                                while (iLIZIZ5 < jSONArrayLJFF.length()) {
                                    String strOptString2 = jSONArrayLJFF.optString(iLIZIZ5, null);
                                    if ((strOptString2.startsWith("    #01") || strOptString2.startsWith("    #02")) && !strOptString2.endsWith("libnpth_xasan.so") && !strOptString2.endsWith("libc++_shared.so") && (strArrSplit2 = LJIIL(strOptString2).trim().split("/")) != null && strArrSplit2.length > 1) {
                                        String str9 = strArrSplit2[1];
                                        strSubstring3 = str9.substring(str9.lastIndexOf(47) + 1);
                                        if (strSubstring3.length() >= 1 && !strSubstring3.isEmpty()) {
                                            break;
                                        }
                                    }
                                    iLIZIZ5++;
                                }
                                int iLIZIZ6 = AbstractC802520Vdy.LIZIZ(iLIZIZ5, "allocated by thread", jSONArrayLJFF) + 1;
                                while (iLIZIZ6 < jSONArrayLJFF.length()) {
                                    String strOptString3 = jSONArrayLJFF.optString(iLIZIZ6, null);
                                    if ((strOptString3.startsWith("    #01") || strOptString3.startsWith("    #02")) && !strOptString3.endsWith("libnpth_xasan.so") && !strOptString3.endsWith("libc++_shared.so") && (strArrSplit = LJIIL(strOptString3).trim().split("/")) != null && strArrSplit.length > 1) {
                                        String str10 = strArrSplit[1];
                                        strSubstring = str10.substring(str10.lastIndexOf(47) + 1);
                                        if (strSubstring.length() >= 1 && !strSubstring.isEmpty()) {
                                            break;
                                        }
                                    }
                                    iLIZIZ6++;
                                }
                                int iLIZIZ7 = AbstractC802520Vdy.LIZIZ(iLIZIZ6, "build id:", jSONArrayLJFF);
                                if (iLIZIZ7 > 0) {
                                    for (int i4 = iLIZIZ7 + 1; i4 < jSONArrayLJFF.length(); i4++) {
                                        String strOptString4 = jSONArrayLJFF.optString(i4, null);
                                        if (strOptString4.startsWith("    /")) {
                                            String[] strArrSplit6 = strOptString4.trim().split("\\s");
                                            if (strArrSplit6.length >= 3) {
                                                String str11 = strArrSplit6[0];
                                                c802900Vea.LJI.put(new JSONObject().put("lib_name", str11.substring(str11.lastIndexOf(47) + 1)).put("lib_uuid", AbstractC802520Vdy.LIZ(strArrSplit6[strArrSplit6.length - 1].substring(0, strArrSplit6[strArrSplit6.length - 1].length() - 1))));
                                            }
                                        }
                                    }
                                }
                                ((HashMap) c802900Vea.LJII).put("gwp_asan_type", str);
                                ((HashMap) c802900Vea.LJII).put("gwp_asan_fatal_lib", strSubstring2);
                                ((HashMap) c802900Vea.LJII).put("gwp_asan_deallocated_lib", strSubstring3);
                                ((HashMap) c802900Vea.LJII).put("gwp_asan_allocated_lib", strSubstring);
                                return true;
                            } catch (IOException | JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("parseReport :");
                                sbLIZ8.append(e);
                                C2188811AlT.LIZIZ(sbLIZ8);
                                return false;
                            }
                        }
                    }.LJIIJJI();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("upload exception:");
                    sbLIZ8.append(th);
                    C2188811AlT.LIZIZ(sbLIZ8);
                }
                try {
                    new C802530Vdz(c802790VeP2, C803150Vez.LJII.LIZIZ).LJIIJJI();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("upload exception:");
                    sbLIZ9.append(th2);
                    C2188811AlT.LIZIZ(sbLIZ9);
                }
                try {
                    final C0VSJ c0vsj2 = C803150Vez.LJII.LIZJ;
                    new AbstractC802520Vdy(c802790VeP2, c0vsj2) { // from class: X.0Ve7
                        @Override // X.AbstractC802520Vdy
                        public final void LJII(Map<String, String> map, C802900Vea c802900Vea) {
                            super.LJII(map, c802900Vea);
                            HashMap map2 = (HashMap) map;
                            String str = "true";
                            map2.put("mmap_monitor", "true");
                            map2.put("has_mmap_leak", "true");
                            if (!C802770VeN.LJI()) {
                                str = "false";
                            }
                            map2.put("is_root", str);
                            map2.put("mmap_leak_app", C0VX9.LJ().getPackageName());
                        }

                        @Override // X.AbstractC802520Vdy
                        public final boolean LJIIIZ(File file3, C802900Vea c802900Vea) {
                            C0VSJ c0vsj3 = new C0VSJ(file3, "tombstone.txt");
                            C0VSJ c0vsj4 = new C0VSJ(file3, "javastack.txt");
                            if (!c0vsj3.exists()) {
                                return false;
                            }
                            try {
                                if (c0vsj4.exists()) {
                                    c802900Vea.LIZ = C08SE.LIZLLL(c0vsj4.getAbsolutePath());
                                }
                                JSONArray jSONArrayLJFF = C08SE.LJFF(c0vsj3.getAbsolutePath());
                                if (jSONArrayLJFF == null) {
                                    return false;
                                }
                                int iLIZIZ = AbstractC802520Vdy.LIZIZ(0, "pid:", jSONArrayLJFF);
                                if (iLIZIZ >= 0) {
                                    String[] strArrSplit = jSONArrayLJFF.optString(iLIZIZ, null).trim().split("\\s");
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= strArrSplit.length) {
                                            break;
                                        }
                                        if ("name:".equals(strArrSplit[i2])) {
                                            c802900Vea.LIZJ = strArrSplit[i2 + 1];
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                int iLIZIZ2 = AbstractC802520Vdy.LIZIZ(iLIZIZ + 1, "Signal ", jSONArrayLJFF);
                                if (iLIZIZ2 >= 0) {
                                    sb.append(jSONArrayLJFF.optString(iLIZIZ2, null));
                                    sb.append('\n');
                                }
                                int iLIZIZ3 = AbstractC802520Vdy.LIZIZ(iLIZIZ2 + 1, "Abort message:", jSONArrayLJFF);
                                if (iLIZIZ3 >= 0) {
                                    String strReplace = jSONArrayLJFF.optString(iLIZIZ3, null).replace("Abort message:", "abort message:");
                                    c802900Vea.LIZLLL = strReplace;
                                    sb.append(strReplace);
                                    sb.append('\n');
                                    if (c802900Vea.LIZLLL.startsWith("abort message:")) {
                                        try {
                                            Matcher matcher = PatternProtector.compile("^.*:\\s+(\\S+):.*,.*,.*:\\s+(\\S+)\\(.*:(\\S+)\\s+(\\S+)\\).*$").matcher(c802900Vea.LIZLLL);
                                            if (matcher.find()) {
                                                ((HashMap) c802900Vea.LJII).put("mmap_leak_lib", matcher.group(1));
                                                ((HashMap) c802900Vea.LJII).put("mmap_leak_reason", matcher.group(2));
                                                ((HashMap) c802900Vea.LJII).put("mmap_leak_size", AbstractC802520Vdy.LIZJ(matcher.group(3), matcher.group(4)));
                                            }
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                        }
                                    }
                                }
                                int iLIZIZ4 = AbstractC802520Vdy.LIZIZ(iLIZIZ3 + 1, "backtrace:", jSONArrayLJFF);
                                if (iLIZIZ4 >= 0) {
                                    for (int i3 = iLIZIZ4 + 1; i3 < jSONArrayLJFF.length(); i3++) {
                                        String strOptString = jSONArrayLJFF.optString(i3, null);
                                        if (!strOptString.startsWith("    #")) {
                                            break;
                                        }
                                        sb.append(strOptString.trim());
                                        sb.append('\n');
                                    }
                                    c802900Vea.LIZIZ = sb.toString();
                                }
                                return true;
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                                return false;
                            }
                        }
                    }.LJIIJJI();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                    sbLIZ10.append("upload exception:");
                    sbLIZ10.append(th3);
                    C2188811AlT.LIZIZ(sbLIZ10);
                }
                try {
                    final C0VSJ c0vsj3 = C803150Vez.LJII.LIZLLL;
                    new AbstractC802520Vdy(c802790VeP2, c0vsj3) { // from class: X.0Ve1
                        public static String LJIIL(int i2) {
                            return i2 < 300 ? "0 ~ 200" : i2 < 500 ? "200 ~ 500" : i2 < 800 ? "500 ~ 800" : i2 < 1024 ? "800 ~ 1000" : i2 < 1500 ? "1000 ~ 1500" : "> 1500";
                        }

                        public static final void LJIILIIL(File file3, C802900Vea c802900Vea) {
                            C0VSJ c0vsj4 = new C0VSJ(file3, "fd_so_list.txt");
                            if (!c0vsj4.exists()) {
                                return;
                            }
                            JSONArray jSONArray = new JSONArray();
                            try {
                                int i2 = 0;
                                for (String str : C08SE.LIZLLL(c0vsj4.getAbsolutePath()).split("\n")) {
                                    String[] strArrSplit = str.trim().split("\\s+");
                                    if (strArrSplit.length >= 3) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        int i3 = CastIntegerProtector.parseInt(strArrSplit[1]);
                                        jSONObject2.put("so_name", strArrSplit[2]);
                                        jSONObject2.put("fd_count", CastLongProtector.parseLong(strArrSplit[1]));
                                        if (i2 == 0) {
                                            i2 = i3;
                                        }
                                        jSONArray.put(jSONObject2);
                                    }
                                }
                                c802900Vea.LJIIIIZZ.put("fd_leak_so_list", jSONArray);
                                ((HashMap) c802900Vea.LJII).put("top_so_fd_count", LJIIL(i2));
                            } catch (Throwable th4) {
                                TryCatchGuardChecker.doCheck(th4);
                            }
                        }

                        @Override // X.AbstractC802520Vdy
                        public final void LJII(Map<String, String> map, C802900Vea c802900Vea) {
                            String str;
                            super.LJII(map, c802900Vea);
                            if (C802770VeN.LJI()) {
                                str = "true";
                            } else {
                                str = "false";
                            }
                            HashMap map2 = (HashMap) map;
                            map2.put("is_root", str);
                            map2.put("fd_leak_app", C0VX9.LJ().getPackageName());
                        }

                        @Override // X.AbstractC802520Vdy
                        public final boolean LJIIIZ(File file3, C802900Vea c802900Vea) {
                            String strOptString;
                            C0VSJ c0vsj4 = new C0VSJ(file3, "tombstone.txt");
                            C0VSJ c0vsj5 = new C0VSJ(file3, "javastack.txt");
                            C0VSJ c0vsj6 = new C0VSJ(file3, "fd_types.txt");
                            if (!c0vsj4.exists()) {
                                return false;
                            }
                            try {
                                LJIILIIL(file3, c802900Vea);
                                AbstractC802520Vdy.LJIIIIZZ(file3, c802900Vea);
                                if (c0vsj5.exists()) {
                                    c802900Vea.LIZ = C08SE.LIZLLL(c0vsj5.getAbsolutePath());
                                }
                                JSONArray jSONArrayLJFF = C08SE.LJFF(c0vsj4.getAbsolutePath());
                                if (jSONArrayLJFF == null) {
                                    return false;
                                }
                                int iLIZIZ = AbstractC802520Vdy.LIZIZ(0, "pid:", jSONArrayLJFF);
                                if (iLIZIZ >= 0) {
                                    String[] strArrSplit = jSONArrayLJFF.optString(iLIZIZ, null).trim().split("\\s");
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= strArrSplit.length) {
                                            break;
                                        }
                                        if ("name:".equals(strArrSplit[i2])) {
                                            String str = strArrSplit[i2 + 1];
                                            c802900Vea.LIZJ = str.substring(0, str.length());
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                int iLIZIZ2 = AbstractC802520Vdy.LIZIZ(iLIZIZ + 1, "Signal ", jSONArrayLJFF);
                                if (iLIZIZ2 >= 0) {
                                    sb.append(jSONArrayLJFF.optString(iLIZIZ2, null));
                                    sb.append('\n');
                                }
                                int iLIZIZ3 = AbstractC802520Vdy.LIZIZ(iLIZIZ2 + 1, "Abort message:", jSONArrayLJFF);
                                if (iLIZIZ3 >= 0) {
                                    String strReplace = jSONArrayLJFF.optString(iLIZIZ3, null).replace("Abort message:", "abort message:");
                                    c802900Vea.LIZLLL = strReplace;
                                    sb.append(strReplace);
                                    sb.append('\n');
                                    if (c802900Vea.LIZLLL.startsWith("abort message:")) {
                                        try {
                                            Matcher matcher = PatternProtector.compile("^.*:\\s+(\\S+):.*,.*,\\s+\\S+\\s+(\\S+)\\(.*$").matcher(c802900Vea.LIZLLL);
                                            if (matcher.find()) {
                                                ((HashMap) c802900Vea.LJII).put("fd_leak_lib", matcher.group(1));
                                                ((HashMap) c802900Vea.LJII).put("fd_leak_reason", matcher.group(2));
                                            }
                                        } catch (Throwable th4) {
                                            TryCatchGuardChecker.doCheck(th4);
                                        }
                                    }
                                }
                                int iLIZIZ4 = AbstractC802520Vdy.LIZIZ(iLIZIZ3 + 1, "backtrace:", jSONArrayLJFF);
                                if (iLIZIZ4 >= 0) {
                                    for (int i3 = iLIZIZ4 + 1; i3 < jSONArrayLJFF.length(); i3++) {
                                        String strOptString2 = jSONArrayLJFF.optString(i3, null);
                                        if (!strOptString2.startsWith("    #")) {
                                            break;
                                        }
                                        sb.append(strOptString2.trim());
                                        sb.append('\n');
                                    }
                                    c802900Vea.LIZIZ = sb.toString();
                                }
                                try {
                                    JSONArray jSONArrayLJFF2 = C08SE.LJFF(c0vsj6.getAbsolutePath());
                                    if (jSONArrayLJFF2 != null && (strOptString = jSONArrayLJFF2.optString(0, null)) != null && !"".equals(strOptString)) {
                                        ((HashMap) c802900Vea.LJII).put("fd_leak_count_range", LJIIL(CastIntegerProtector.parseInt(strOptString.trim().split(" ")[1])));
                                    }
                                    ((HashMap) c802900Vea.LJII).put("has_fd_track", "true");
                                    return true;
                                } catch (Throwable th5) {
                                    TryCatchGuardChecker.doCheck(th5);
                                    return true;
                                }
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return false;
                            } catch (Throwable th6) {
                                TryCatchGuardChecker.doCheck(th6);
                                return false;
                            }
                        }
                    }.LJIIJJI();
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append("upload exception:");
                    sbLIZ11.append(th4);
                    C2188811AlT.LIZIZ(sbLIZ11);
                }
                try {
                    final C0VSJ c0vsj4 = C803150Vez.LJII.LJ;
                    new AbstractC802520Vdy(c802790VeP2, c0vsj4) { // from class: X.0Ve3
                        public static String LJIILIIL(String str) {
                            try {
                                int i2 = CastIntegerProtector.parseInt(str);
                                if (i2 <= 100) {
                                    return "[0, 100]";
                                }
                                if (i2 <= 200) {
                                    return "(100, 200]";
                                }
                                if (i2 <= 500) {
                                    return "(200, 500]";
                                }
                                if (i2 <= 1000) {
                                    return "(500, 1000]";
                                }
                                if (i2 <= 5000) {
                                    return "(1000, 5000]";
                                }
                                if (i2 <= 10000) {
                                    return "(5000, 10000]";
                                }
                                int i3 = i2 / 10000;
                                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                sbLIZ12.append(e3.h);
                                sbLIZ12.append(i3);
                                sbLIZ12.append("0000, ");
                                sbLIZ12.append(i3 + 1);
                                sbLIZ12.append("0000]");
                                return C2188811AlT.LIZIZ(sbLIZ12);
                            } catch (Throwable th5) {
                                TryCatchGuardChecker.doCheck(th5);
                                return CardStruct.IStatusCode.DEFAULT;
                            }
                        }

                        @Override // X.AbstractC802520Vdy
                        public final void LJII(Map<String, String> map, C802900Vea c802900Vea) {
                            String str;
                            super.LJII(map, c802900Vea);
                            if (C802770VeN.LJI()) {
                                str = "true";
                            } else {
                                str = "false";
                            }
                            ((HashMap) map).put("is_root", str);
                        }

                        @Override // X.AbstractC802520Vdy
                        public final boolean LJIIIZ(File file3, C802900Vea c802900Vea) {
                            C0VSJ c0vsj5 = new C0VSJ(file3, "ref_table.txt");
                            if (!c0vsj5.exists()) {
                                return false;
                            }
                            try {
                                if (C08SE.LJFF(c0vsj5.getAbsolutePath()) == null) {
                                    return false;
                                }
                                BufferedReader bufferedReader = new BufferedReader(new C0VSF(c0vsj5));
                                StringBuilder sb = new StringBuilder();
                                StringBuilder sb2 = new StringBuilder();
                                String str = null;
                                char c = 0;
                                boolean z = false;
                                String str2 = "";
                                String str3 = "";
                                String str4 = "";
                                String str5 = "";
                                String strGroup = "";
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    if (!"".equals(line)) {
                                        char cCharAt = line.charAt(0);
                                        String strTrim = line.trim();
                                        if (strTrim.length() == 0) {
                                            continue;
                                        } else if (cCharAt >= 'a' && cCharAt <= 'z') {
                                            if (str == null) {
                                                str = line.split(" ")[0];
                                            } else {
                                                try {
                                                    Matcher matcher = PatternProtector.compile("^.*:\\s+(\\S+),.*:\\s+(.*),.*:\\s+(\\S+).*$").matcher(line);
                                                    if (matcher.find()) {
                                                        strGroup = matcher.group(1);
                                                        String strGroup2 = matcher.group(2);
                                                        Objects.requireNonNull(strGroup2);
                                                        c802900Vea.LJFF = Long.decode(strGroup2).longValue();
                                                        c802900Vea.LIZJ = matcher.group(3);
                                                    }
                                                } catch (Throwable th5) {
                                                    TryCatchGuardChecker.doCheck(th5);
                                                }
                                            }
                                            c = 1;
                                        } else if (c == 1) {
                                            if (cCharAt < '0' || cCharAt > '9') {
                                                if (strTrim.startsWith("Summary")) {
                                                }
                                            } else {
                                                String[] strArrSplit = line.split("\\s+");
                                                if (strArrSplit.length != 2) {
                                                    C802300Vdc.LIZ();
                                                    break;
                                                }
                                                str2 = strArrSplit[0];
                                                str5 = strArrSplit[1];
                                            }
                                            c = 2;
                                        } else if (c == 2) {
                                            if (strTrim.startsWith("#")) {
                                                sb.append(line);
                                                sb.append("\n");
                                            } else if (strTrim.startsWith("at")) {
                                                sb2.append(line);
                                                sb2.append("\n");
                                                if (!z) {
                                                    z = true;
                                                }
                                            } else {
                                                if (z) {
                                                    break;
                                                }
                                                char cCharAt2 = strTrim.charAt(0);
                                                if (cCharAt2 > '0' && cCharAt2 <= '9') {
                                                    String[] strArrSplit2 = strTrim.split("\\s+");
                                                    if (strArrSplit2.length >= 3) {
                                                        str4 = strArrSplit2[0];
                                                        str3 = strArrSplit2[2];
                                                    }
                                                    c = 0;
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                                String string = sb.toString();
                                c802900Vea.LIZ = sb2.toString();
                                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                sbLIZ12.append("pid: 1234, tid: ");
                                sbLIZ12.append(c802900Vea.LJFF);
                                sbLIZ12.append(", ThreadName: ");
                                sbLIZ12.append(c802900Vea.LIZJ);
                                sbLIZ12.append("  >>> ");
                                sbLIZ12.append(C0VX9.LJ().getPackageName());
                                sbLIZ12.append(" <<<\n");
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ12);
                                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                sbLIZ13.append("abort message: ");
                                sbLIZ13.append(str);
                                sbLIZ13.append(" ref leak type: ");
                                sbLIZ13.append(str3);
                                sbLIZ13.append("(count: ");
                                sbLIZ13.append(str4);
                                sbLIZ13.append("), backtrace type: ");
                                sbLIZ13.append(str5);
                                sbLIZ13.append("(count: ");
                                sbLIZ13.append(str2);
                                sbLIZ13.append(")\n");
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ13);
                                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                sbLIZ14.append("Signal 6(SIGABRT), Code -12(SI_REF_LEAK)\n");
                                sbLIZ14.append(string);
                                c802900Vea.LIZIZ = C2188811AlT.LIZIZ(sbLIZ14);
                                StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                                sbLIZ15.append(strLIZIZ);
                                sbLIZ15.append("Signal 6(SIGABRT), Code -12(SI_REF_LEAK)\n");
                                sbLIZ15.append(strLIZIZ2);
                                sbLIZ15.append("backtrace: \n");
                                sbLIZ15.append(string);
                                LJIIL(file3, "tombstone.txt", C2188811AlT.LIZIZ(sbLIZ15));
                                LJIIL(file3, "javastack.txt", c802900Vea.LIZ);
                                ((HashMap) c802900Vea.LJII).put("has_ref_leak_log", "true");
                                ((HashMap) c802900Vea.LJII).put("ref_leak_type", str);
                                Map<String, String> map = c802900Vea.LJII;
                                StringBuilder sbLIZ16 = C2188811AlT.LIZ();
                                sbLIZ16.append(str);
                                sbLIZ16.append("_ref_range");
                                ((HashMap) map).put(C2188811AlT.LIZIZ(sbLIZ16), LJIILIIL(strGroup));
                                Map<String, String> map2 = c802900Vea.LJII;
                                StringBuilder sbLIZ17 = C2188811AlT.LIZ();
                                sbLIZ17.append(str);
                                sbLIZ17.append("_ref_top_type");
                                ((HashMap) map2).put(C2188811AlT.LIZIZ(sbLIZ17), str3);
                                return true;
                            } catch (Throwable th6) {
                                TryCatchGuardChecker.doCheck(th6);
                                return false;
                            }
                        }

                        public static void LJIIL(File file3, String str, String str2) {
                            if (str2 != null && !"".equals(str2)) {
                                C0VSJ c0vsj5 = new C0VSJ(file3, str);
                                try {
                                    if (!c0vsj5.exists()) {
                                        c0vsj5.createNewFile();
                                    }
                                    C08SE.LJIIIIZZ(c0vsj5, str2, false);
                                } catch (Throwable th5) {
                                    TryCatchGuardChecker.doCheck(th5);
                                }
                            }
                        }
                    }.LJIIJJI();
                } catch (Throwable th5) {
                    TryCatchGuardChecker.doCheck(th5);
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append("upload exception:");
                    sbLIZ12.append(th5);
                    C2188811AlT.LIZIZ(sbLIZ12);
                }
                C0VSJ c0vsj5 = new C0VSJ(C0VX9.LJFF(), "protector");
                if (!c0vsj5.exists() || (fileArrListFiles2 = c0vsj5.listFiles()) == null) {
                    return;
                }
                for (File file3 : fileArrListFiles2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                        sbLIZ13.append("upload ");
                        sbLIZ13.append(file3.getAbsolutePath());
                        C2188811AlT.LIZIZ(sbLIZ13);
                        C802790VeP c802790VeP3 = k.LIZ;
                        if (c802790VeP3 != null) {
                            JSONObject jSONObject2 = Header.LIZIZ(c802790VeP3, jCurrentTimeMillis, CrashType.NATIVE_CUSTOMIZE, Process.myPid()).LIZ;
                            CrashSummary crashSummaryLoadFromDirectory3 = CrashSummary.loadFromDirectory(file3);
                            if (crashSummaryLoadFromDirectory3 == null) {
                                StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                sbLIZ14.append("upload delete dir");
                                sbLIZ14.append(file3.getAbsolutePath());
                                C2188811AlT.LIZIZ(sbLIZ14);
                                C2112008Pe.LJ(file3);
                            } else {
                                JSONObject jSONObject3 = crashSummaryLoadFromDirectory3.assemblyCrashBody(c802790VeP3).LIZ;
                                jSONObject3.put("event_type", "native_exception");
                                jSONObject3.put("message", "protector");
                                jSONObject3.put("log_type", "1");
                                jSONObject3.put("timestamp", System.currentTimeMillis());
                                jSONObject3.put("exception_type", 1);
                                String stackTrace = crashSummaryLoadFromDirectory3.getStackTrace();
                                if (stackTrace != null) {
                                    jSONObject3.put("class_ref", "Native");
                                    jSONObject3.put("method", "Native");
                                    jSONObject3.put("is_core", 1);
                                    jSONObject3.put("line_num", -1);
                                    jSONObject3.put("ensure_type", "EnsureNotReachHere");
                                    C0VJH.LIZIZ().getClass();
                                    jSONObject3.put("crash_lib_uuid", C0VJH.LIZJ(stackTrace));
                                    jSONObject3.put("stack", stackTrace);
                                    jSONObject3.put("has_dump", "true");
                                }
                                JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("filters");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                    jSONObject3.put("filters", jSONObjectOptJSONObject);
                                }
                                C803410VfP.LIZJ(crashSummaryLoadFromDirectory3, file3, jSONObjectOptJSONObject);
                                JSONArray jSONArray = new JSONArray();
                                jSONArray.put(jSONObject3);
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("data", jSONArray);
                                jSONObject4.put("header", jSONObject2);
                                String strLIZLLL = o.LIZLLL(h.LJIIJJI.LJFF, jSONObject2);
                                String strJ3 = C786410Ut5.J3(jSONObject4);
                                ArrayList arrayList3 = new ArrayList();
                                File[] fileArrListFiles3 = file3.listFiles();
                                if (fileArrListFiles3 != null) {
                                    for (File file4 : fileArrListFiles3) {
                                        String name = file4.getName();
                                        if (!name.endsWith(".summary") && !name.endsWith(".json") && !name.endsWith(".inf")) {
                                            arrayList3.add(file4);
                                        }
                                    }
                                }
                                if (b.LJFF("ensure_zip", strLIZLLL, strJ3, arrayList3).LIZ()) {
                                    C802300Vdc.LIZ();
                                    C08SE.LIZIZ(file3);
                                }
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CrashManager@b28c.uploadAll$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CrashManager@b28c.uploadAll$2");
            }
        }, j);
    }

    public static void LIZIZ(CrashSummary crashSummary, C802790VeP c802790VeP, File file) {
        JSONObject jSONObject = new JSONObject();
        C803410VfP.LIZJ(crashSummary, file, jSONObject);
        CrashType crashType = crashSummary.mCrashType;
        if (crashType == CrashType.JAVA || crashType == CrashType.LAUNCH) {
            C0VJO.LJIIIIZZ(jSONObject, "from_custom", Boolean.FALSE);
        }
        crashSummary.upload(c802790VeP, jSONObject);
    }
}
