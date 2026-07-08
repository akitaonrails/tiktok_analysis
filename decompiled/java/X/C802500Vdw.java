package X;

import android.app.ApplicationExitInfo;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.k;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import im3.b;
import im3.o;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802500Vdw {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static C0VSJ LIZJ;
    public static C0VSJ LIZLLL;
    public static volatile boolean LJ;
    public static final Map<String, List<C803470VfV>> LJFF = new HashMap();
    public static List<ApplicationExitInfo> LJI;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            boolean r0 = X.C802500Vdw.LIZIZ
            if (r0 == 0) goto L82
            boolean r0 = X.C802860VeW.LIZ()
            if (r0 == 0) goto L82
            boolean r0 = X.C802500Vdw.LIZ
            if (r0 == 0) goto Lf
            return
        Lf:
            r0 = 1
            X.C802500Vdw.LIZ = r0
            LIZIZ()
            X.0VSJ r1 = new X.0VSJ
            X.0VSJ r0 = X.C802500Vdw.LIZJ
            java.lang.String r3 = "lastReasonTime"
            r1.<init>(r0, r3)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L28
            LJ()
            return
        L28:
            java.util.List r2 = X.C802860VeW.LIZIZ()
            if (r2 != 0) goto L2f
            return
        L2f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.C802500Vdw.LJI = r0
            LIZIZ()
            X.0VSJ r1 = new X.0VSJ
            X.0VSJ r0 = X.C802500Vdw.LIZJ
            r1.<init>(r0, r3)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L5c
            java.lang.String r0 = X.C08SE.LIZJ(r1)     // Catch: java.io.IOException -> L58
            java.lang.Long r0 = java.lang.Long.decode(r0)     // Catch: java.lang.Throwable -> L53
            long r5 = r0.longValue()     // Catch: java.lang.Throwable -> L53
            goto L5e
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5c:
            r5 = -1
        L5e:
            java.util.Iterator r4 = r2.iterator()
        L62:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r3 = r4.next()
            android.app.ApplicationExitInfo r3 = (android.app.ApplicationExitInfo) r3
            long r1 = r3.getTimestamp()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L7e
            java.util.List<android.app.ApplicationExitInfo> r0 = X.C802500Vdw.LJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r3)
            goto L62
        L7e:
            LJ()
            return
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802500Vdw.LIZ():void");
    }

    public static void LIZIZ() {
        if (LIZIZ && C802860VeW.LIZ() && !LJ) {
            LJ = true;
            if (LIZJ == null) {
                LIZJ = new C0VSJ(C0VX9.LJFF(), "crash_exit_history");
            }
            if (!LIZJ.exists()) {
                LIZJ.mkdirs();
            }
            if (LIZLLL == null) {
                LIZLLL = new C0VSJ(LIZJ, "history_crash_list");
            }
            if (LIZLLL.exists()) {
                return;
            }
            LIZLLL.mkdirs();
        }
    }

    public static void LJ() {
        try {
            C08SE.LJIIIIZZ(new C0VSJ(LIZJ, "lastReasonTime"), String.valueOf(System.currentTimeMillis()), false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJFF() {
        try {
            ArrayList<ApplicationExitInfo> arrayList = new ArrayList();
            for (ApplicationExitInfo applicationExitInfo : (ArrayList) LJI) {
                if (applicationExitInfo.getReason() == 6 || applicationExitInfo.getReason() == 4 || applicationExitInfo.getReason() == 5) {
                    List list = (List) ((HashMap) LJFF).get(applicationExitInfo.getProcessName());
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                arrayList.add(applicationExitInfo);
                                break;
                            }
                            C803470VfV c803470VfV = (C803470VfV) it2.next();
                            long timestamp = applicationExitInfo.getTimestamp() - c803470VfV.LIZJ;
                            int reason = applicationExitInfo.getReason();
                            if (!(reason == 6 ? CrashType.ANR : reason == 5 ? CrashType.NATIVE : reason == 4 ? CrashType.JAVA : CrashType.UNKNOWN).getName().equals(c803470VfV.LIZIZ.getName()) || applicationExitInfo.getPid() != c803470VfV.LIZ || timestamp <= 0 || timestamp >= 30000) {
                            }
                        }
                    } else {
                        arrayList.add(applicationExitInfo);
                    }
                }
            }
            LJ();
            for (ApplicationExitInfo applicationExitInfo2 : arrayList) {
                int reason2 = applicationExitInfo2.getReason();
                int i = C803130Vex.LIZ[(reason2 == 6 ? CrashType.ANR : reason2 == 5 ? CrashType.NATIVE : reason2 == 4 ? CrashType.JAVA : CrashType.UNKNOWN).ordinal()];
                if (i == 1) {
                    LJI(applicationExitInfo2);
                } else if (i == 2) {
                    LJIIIIZZ(applicationExitInfo2);
                } else if (i == 3) {
                    LJII(applicationExitInfo2);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static String LIZJ(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        if (inputStream == null) {
            return "";
        }
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th) {
            th = th;
            bufferedInputStream = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = bufferedInputStream.read(bArr, 0, 8192);
                if (i <= 0) {
                    break;
                }
                sb.append(new String(bArr, 0, i));
            }
            String string = sb.toString();
            try {
                inputStream.close();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            try {
                bufferedInputStream.close();
                return string;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                return string;
            }
        } catch (Throwable th4) {
            th = th4;
            TryCatchGuardChecker.doCheck(th);
            try {
                inputStream.close();
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                    return "";
                } catch (Throwable th6) {
                    TryCatchGuardChecker.doCheck(th6);
                    return "";
                }
            }
            return "";
        }
    }

    public static void LJI(ApplicationExitInfo applicationExitInfo) {
        Object obj;
        if (!C802860VeW.LIZ()) {
            return;
        }
        Header headerLIZJ = Header.LIZJ(k.LIZ, applicationExitInfo.getTimestamp(), CrashType.ANR, applicationExitInfo.getPid());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0VJO.LJIIIIZZ(jSONObject, "header", headerLIZJ.LIZ);
        try {
            jSONObject.put("filters", jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C0VJO.LJIIIIZZ(jSONObject, "is_anr", 1);
        C0VJO.LJIIIIZZ(jSONObject, "crash_time", Long.valueOf(applicationExitInfo.getTimestamp()));
        String str = "true";
        C0VJO.LJIIIIZZ(jSONObject, "has_dump", "true");
        String description = applicationExitInfo.getDescription();
        if (TextUtils.isEmpty(description)) {
            description = "invalid";
        }
        C0VJO.LJIIIIZZ(jSONObject, "anr_info", description);
        C0VJO.LJIIIIZZ(jSONObject, "app_start_time", Long.valueOf(applicationExitInfo.getTimestamp()));
        C0VJO.LJIIIIZZ(jSONObject, "jiffy", Long.valueOf(C802770VeN.LIZLLL()));
        JSONObject jSONObject3 = new JSONObject();
        C0VJO.LJIIIIZZ(jSONObject3, "thread_number", 1);
        C0VJO.LJIIIIZZ(jSONObject3, "mainStackFromTrace", "at ApplicationExit InvalidStack.NoStackAvailable(Invalid.java:1).\n");
        C0VJO.LJIIIIZZ(jSONObject3, "pid", Integer.valueOf(applicationExitInfo.getPid()));
        C0VJO.LJIIIIZZ(jSONObject3, "package", applicationExitInfo.getProcessName());
        C0VJO.LJIIIIZZ(jSONObject3, "invalid", Boolean.FALSE);
        C0VJO.LJIIIIZZ(jSONObject3, "is_new_stack", 10);
        C0VJO.LJIIIIZZ(jSONObject3, "not_current", 1);
        C0VJO.LJIIIIZZ(jSONObject3, "is_remote_process", 0);
        C0VJO.LJIIIIZZ(jSONObject, "data", C786410Ut5.J3(jSONObject3));
        C0VJO.LJIIIIZZ(jSONObject2, "sdk_version", AnonymousClass0825.LIZ);
        if (NativeBridge.LJJIJIIJI()) {
            obj = "true";
        } else {
            obj = "false";
        }
        C0VJO.LJIIIIZZ(jSONObject2, "is_64_runtime", obj);
        String strOptString = headerLIZJ.LIZ.optString("cpu_abi");
        if (!TextUtils.isEmpty(strOptString)) {
            boolean zContains = strOptString.contains("64");
            C0VJO.LJIIIIZZ(jSONObject2, "is_x86_devices", Boolean.valueOf(strOptString.contains("86")));
            C0VJO.LJIIIIZZ(jSONObject2, "is_64_devices", Boolean.valueOf(zContains));
        }
        if (!C802770VeN.LJI()) {
            str = "false";
        }
        C0VJO.LJIIIIZZ(jSONObject2, "is_root", str);
        C0VJO.LJIIIIZZ(jSONObject2, "kernel_version", headerLIZJ.LIZ.optString("kernel_version"));
        C0VJO.LJIIIIZZ(jSONObject2, "is_hm_os", String.valueOf(C801160Vbm.LIZ()));
        C0VJO.LJIIIIZZ(jSONObject2, "exit_reason", String.valueOf(applicationExitInfo.getReason()));
        C0VJO.LJIIIIZZ(jSONObject2, "exit_status", String.valueOf(applicationExitInfo.getStatus()));
        C0VJO.LJIIIIZZ(jSONObject2, "crash_from", "app_exit_history");
        C0VJO.LJIIIIZZ(jSONObject2, "description", String.valueOf(applicationExitInfo.getDescription()));
        C0VJO.LJIIIIZZ(jSONObject2, "importance", String.valueOf(applicationExitInfo.getImportance()));
        C0VJO.LJIIIIZZ(jSONObject2, "pss", String.valueOf(applicationExitInfo.getPss()));
        C0VJO.LJIIIIZZ(jSONObject2, "rss", String.valueOf(applicationExitInfo.getRss()));
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject.put("custom", jSONObject4);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        String description2 = applicationExitInfo.getDescription();
        if (description2 != null) {
            C0VJO.LJIIIIZZ(jSONObject2, "description", description2);
            C0VJO.LJIIIIZZ(jSONObject4, "description", description2);
            if (description2.contains("bg anr")) {
                C0VJO.LJIIIIZZ(jSONObject, "is_background", Boolean.TRUE);
            } else {
                C0VJO.LJIIIIZZ(jSONObject, "is_background", Boolean.FALSE);
            }
            if (description2.contains("Input dispatching timed out")) {
                C0VJO.LJIIIIZZ(jSONObject2, "anr_reason", "Input dispatching timed out");
                int iIndexOf = description2.indexOf("Activity");
                int i = iIndexOf;
                while (i > 0 && '/' != description2.charAt(i)) {
                    i--;
                }
                if (iIndexOf != i) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(description2.substring(i + 1, iIndexOf));
                    sbLIZ.append("Activity");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0VJO.LJIIIIZZ(jSONObject2, "last_resume_activity", strLIZIZ);
                    C0VJO.LJIIIIZZ(jSONObject2, "anr_tag", strLIZIZ);
                }
            } else if (description2.contains("executing service")) {
                C0VJO.LJIIIIZZ(jSONObject2, "anr_reason", "executing service");
                int iIndexOf2 = description2.indexOf("Service");
                int i2 = iIndexOf2;
                while (i2 > 0 && '/' != description2.charAt(i2)) {
                    i2--;
                }
                if (iIndexOf2 != i2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(description2.substring(i2 + 1, iIndexOf2));
                    sbLIZ2.append("Service");
                    C0VJO.LJIIIIZZ(jSONObject2, "anr_tag", C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else if (description2.contains("Broadcast of Intent")) {
                C0VJO.LJIIIIZZ(jSONObject2, "anr_reason", "Broadcast of Intent");
                int iIndexOf3 = description2.indexOf("{");
                int iIndexOf4 = description2.indexOf("}");
                if (iIndexOf3 != -1 && iIndexOf4 != -1) {
                    C0VJO.LJIIIIZZ(jSONObject2, "anr_tag", description2.substring(iIndexOf3 + 1, iIndexOf4).trim());
                }
            }
        }
        C0VJO.LJIIIIZZ(jSONObject4, "importance", String.valueOf(applicationExitInfo.getImportance()));
        C0VJO.LJIIIIZZ(jSONObject4, "pss", String.valueOf(applicationExitInfo.getPss()));
        C0VJO.LJIIIIZZ(jSONObject4, "rss", String.valueOf(applicationExitInfo.getRss()));
        C0VJO.LJIIIIZZ(jSONObject4, "app_info_description", applicationExitInfo.toString());
        try {
            String strLIZJ = LIZJ(applicationExitInfo.getTraceInputStream());
            if (strLIZJ != null) {
                C0VJO.LJIIIIZZ(jSONObject4, "anr_trace_description", strLIZJ);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        CrashType crashType = CrashType.ANR;
        String strLJFF = o.LJFF(crashType, headerLIZJ.LIZ);
        ArrayList arrayList = new ArrayList();
        arrayList.add(LIZJ);
        b.LJFF(crashType.getName(), strLJFF, C786410Ut5.J3(jSONObject), arrayList);
    }

    public static void LJII(ApplicationExitInfo applicationExitInfo) {
        String strLIZJ;
        Object obj;
        Object obj2;
        if (!C802860VeW.LIZ()) {
            return;
        }
        Header headerLIZJ = Header.LIZJ(k.LIZ, applicationExitInfo.getTimestamp(), CrashType.JAVA, applicationExitInfo.getPid());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0VJO.LJIIIIZZ(jSONObject, "header", headerLIZJ.LIZ);
        try {
            jSONObject.put("filters", jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            strLIZJ = LIZJ(applicationExitInfo.getTraceInputStream());
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            strLIZJ = null;
        }
        String str = "at ApplicationExit InvalidStack.NoStackAvailable(Invalid.java:1).\n";
        if (TextUtils.isEmpty(strLIZJ) || strLIZJ.contains("failed to read status response from tombstoned:")) {
            strLIZJ = "at ApplicationExit InvalidStack.NoStackAvailable(Invalid.java:1).\n";
        }
        C0VJO.LJIIIIZZ(jSONObject, "isJava", 1);
        C0VJO.LJIIIIZZ(jSONObject, "crash_time", Long.valueOf(applicationExitInfo.getTimestamp()));
        String str2 = "true";
        C0VJO.LJIIIIZZ(jSONObject, "has_dump", "true");
        C0VJO.LJIIIIZZ(jSONObject, "jiffy", Long.valueOf(C802770VeN.LIZLLL()));
        if (!TextUtils.isEmpty(strLIZJ)) {
            str = strLIZJ;
        }
        C0VJO.LJIIIIZZ(jSONObject, "data", str);
        C0VJO.LJIIIIZZ(jSONObject2, "sdk_version", AnonymousClass0825.LIZ);
        if (NativeBridge.LJJIJIIJI()) {
            obj = "true";
        } else {
            obj = "false";
        }
        C0VJO.LJIIIIZZ(jSONObject2, "is_64_runtime", obj);
        String strOptString = headerLIZJ.LIZ.optString("cpu_abi");
        if (!TextUtils.isEmpty(strOptString)) {
            boolean zContains = strOptString.contains("64");
            C0VJO.LJIIIIZZ(jSONObject2, "is_x86_devices", Boolean.valueOf(strOptString.contains("86")));
            C0VJO.LJIIIIZZ(jSONObject2, "is_64_devices", Boolean.valueOf(zContains));
        }
        if (C802770VeN.LJI()) {
            obj2 = "true";
        } else {
            obj2 = "false";
        }
        C0VJO.LJIIIIZZ(jSONObject2, "is_root", obj2);
        C0VJO.LJIIIIZZ(jSONObject2, "kernel_version", headerLIZJ.LIZ.optString("kernel_version"));
        C0VJO.LJIIIIZZ(jSONObject2, "is_hm_os", String.valueOf(C801160Vbm.LIZ()));
        if (!C802770VeN.LJI()) {
            str2 = "false";
        }
        C0VJO.LJIIIIZZ(jSONObject2, "is_root", str2);
        C0VJO.LJIIIIZZ(jSONObject2, "exit_reason", String.valueOf(applicationExitInfo.getReason()));
        C0VJO.LJIIIIZZ(jSONObject2, "exit_status", String.valueOf(applicationExitInfo.getStatus()));
        C0VJO.LJIIIIZZ(jSONObject2, "crash_from", "app_exit_history");
        C0VJO.LJIIIIZZ(jSONObject2, "description", String.valueOf(applicationExitInfo.getDescription()));
        C0VJO.LJIIIIZZ(jSONObject2, "importance", String.valueOf(applicationExitInfo.getImportance()));
        C0VJO.LJIIIIZZ(jSONObject2, "pss", String.valueOf(applicationExitInfo.getPss()));
        C0VJO.LJIIIIZZ(jSONObject2, "rss", String.valueOf(applicationExitInfo.getRss()));
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("custom", jSONObject3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        C0VJO.LJIIIIZZ(jSONObject3, "app_info_description", applicationExitInfo.toString());
        CrashType crashType = CrashType.JAVA;
        String strLJFF = o.LJFF(crashType, headerLIZJ.LIZ);
        ArrayList arrayList = new ArrayList();
        arrayList.add(LIZJ);
        b.LJFF(crashType.getName(), strLJFF, C786410Ut5.J3(jSONObject), arrayList);
    }

    public static void LJIIIIZZ(ApplicationExitInfo applicationExitInfo) {
        Object obj;
        Object obj2;
        String strLIZJ;
        if (!C802860VeW.LIZ()) {
            return;
        }
        Header headerLIZJ = Header.LIZJ(k.LIZ, applicationExitInfo.getTimestamp(), CrashType.NATIVE, applicationExitInfo.getPid());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0VJO.LJIIIIZZ(jSONObject, "header", headerLIZJ.LIZ);
        try {
            jSONObject.put("filters", jSONObject2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C0VJO.LJIIIIZZ(jSONObject, "is_native_crash", 1);
        C0VJO.LJIIIIZZ(jSONObject, "crash_time", Long.valueOf(applicationExitInfo.getTimestamp()));
        String str = "true";
        C0VJO.LJIIIIZZ(jSONObject, "has_dump", "true");
        C0VJO.LJIIIIZZ(jSONObject, "jiffy", Long.valueOf(C802770VeN.LIZLLL()));
        C0VJO.LJIIIIZZ(jSONObject, "data", "Signal 111(CRASH_FROM_EXIT)\n\n");
        C0VJO.LJIIIIZZ(jSONObject2, "sdk_version", AnonymousClass0825.LIZ);
        if (NativeBridge.LJJIJIIJI()) {
            obj = "true";
        } else {
            obj = "false";
        }
        C0VJO.LJIIIIZZ(jSONObject2, "is_64_runtime", obj);
        String strOptString = headerLIZJ.LIZ.optString("cpu_abi");
        if (!TextUtils.isEmpty(strOptString)) {
            boolean zContains = strOptString.contains("64");
            C0VJO.LJIIIIZZ(jSONObject2, "is_x86_devices", Boolean.valueOf(strOptString.contains("86")));
            C0VJO.LJIIIIZZ(jSONObject2, "is_64_devices", Boolean.valueOf(zContains));
        }
        if (C802770VeN.LJI()) {
            obj2 = "true";
        } else {
            obj2 = "false";
        }
        C0VJO.LJIIIIZZ(jSONObject2, "is_root", obj2);
        C0VJO.LJIIIIZZ(jSONObject2, "kernel_version", headerLIZJ.LIZ.optString("kernel_version"));
        C0VJO.LJIIIIZZ(jSONObject2, "is_hm_os", String.valueOf(C801160Vbm.LIZ()));
        if (!C802770VeN.LJI()) {
            str = "false";
        }
        C0VJO.LJIIIIZZ(jSONObject2, "is_root", str);
        C0VJO.LJIIIIZZ(jSONObject2, "exit_reason", String.valueOf(applicationExitInfo.getReason()));
        C0VJO.LJIIIIZZ(jSONObject2, "exit_status", String.valueOf(applicationExitInfo.getStatus()));
        C0VJO.LJIIIIZZ(jSONObject2, "crash_from", "app_exit_history");
        C0VJO.LJIIIIZZ(jSONObject2, "description", String.valueOf(applicationExitInfo.getDescription()));
        C0VJO.LJIIIIZZ(jSONObject2, "importance", String.valueOf(applicationExitInfo.getImportance()));
        C0VJO.LJIIIIZZ(jSONObject2, "pss", String.valueOf(applicationExitInfo.getPss()));
        C0VJO.LJIIIIZZ(jSONObject2, "rss", String.valueOf(applicationExitInfo.getRss()));
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject.put("custom", jSONObject3);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C0VJO.LJIIIIZZ(jSONObject3, "app_info_description", applicationExitInfo.toString());
        try {
            strLIZJ = LIZJ(applicationExitInfo.getTraceInputStream());
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            strLIZJ = null;
        }
        if (!TextUtils.isEmpty(strLIZJ) && !strLIZJ.contains("failed to read status response from tombstoned:")) {
            C0VJO.LJIIIIZZ(jSONObject3, "native_crash_trace", strLIZJ);
        }
        CrashType crashType = CrashType.NATIVE;
        String strLJFF = o.LJFF(crashType, headerLIZJ.LIZ);
        ArrayList arrayList = new ArrayList();
        arrayList.add(LIZJ);
        b.LJFF(crashType.getName(), strLJFF, C786410Ut5.J3(jSONObject), arrayList);
    }

    public static void LIZLLL(CrashType crashType, String str, int i, long j) {
        List arrayList;
        List<ApplicationExitInfo> list = LJI;
        if (list != null && ((ArrayList) list).size() != 0) {
            try {
                C803470VfV c803470VfV = new C803470VfV();
                if (crashType == CrashType.LAUNCH) {
                    c803470VfV.LIZIZ = CrashType.JAVA;
                } else {
                    c803470VfV.LIZIZ = crashType;
                }
                c803470VfV.LIZ = i;
                c803470VfV.LIZJ = j;
                Map<String, List<C803470VfV>> map = LJFF;
                if (!((HashMap) map).containsKey(str) || (arrayList = (List) ((HashMap) map).get(str)) == null) {
                    arrayList = new ArrayList();
                    ((HashMap) map).put(str, arrayList);
                }
                arrayList.add(c803470VfV);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
