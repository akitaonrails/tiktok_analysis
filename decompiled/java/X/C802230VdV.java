package X;

import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.crash.NativeCrashSummary;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import dl3.h;
import im3.b;
import java.io.File;
import java.io.FilenameFilter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VdV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802230VdV {
    public static C802230VdV LJI;
    public static boolean LJII;
    public final ConcurrentHashMap<String, C0VF4> LIZ;
    public final C0VSJ LIZIZ;
    public boolean LIZJ;
    public volatile boolean LIZLLL;
    public final FileObserverC802310Vdd LJ;
    public final C0VSJ LJFF;

    public final void LJIILIIL() {
        try {
            synchronized (this) {
                try {
                    if (this.LIZ.size() > 0) {
                        this.LIZ.clear();
                        LJIIJJI();
                        LJIJ();
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
    }

    public static C802230VdV LJ() {
        synchronized (C802230VdV.class) {
            try {
                if (LJI == null) {
                    LJI = new C802230VdV();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return LJI;
    }

    public static void LJIIJJI() {
        if (LIZ("/monitor/collect/c/crash")) {
            C802430Vdp.LJIIJ = true;
            C802250VdX.LJI = true;
            C801880Vcw.LIZ = true;
            C801850Vct.LIZ = true;
        } else {
            C802430Vdp.LJIIJ = false;
            C801880Vcw.LIZ = false;
            C801850Vct.LIZ = false;
            C802250VdX.LJI = false;
        }
        RunnableC801900Vcy.LLIZLLLIL = LIZ("/monitor/collect/c/exception");
        NativeBridge.LJJJJZ(LIZ("/monitor/collect/c/native_bin_crash") ? 1 : 0);
    }

    public final int LJIIJ() {
        try {
            this.LJFF.createNewFile();
            return NativeBridge.LJIILLIIL(this.LJFF.getAbsolutePath());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r3 = X.C08SE.LIZJ(r6.LIZIZ);
        com.bytedance.crash.jni.NativeBridge.LJJLIIIJJIZ(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ() {
        /*
            r6 = this;
            X.0VSJ r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L81
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L78
            X.0VSJ r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L81
            long r3 = r0.length()     // Catch: java.lang.Throwable -> L81
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L78
            java.lang.String r3 = ""
            r5 = 0
            r2 = 0
        L18:
            int r2 = r2 + 1
            int r1 = r6.LJIIJ()     // Catch: java.lang.Throwable -> L34
            if (r1 <= 0) goto L2a
            X.0VSJ r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = X.C08SE.LIZJ(r0)     // Catch: java.lang.Throwable -> L34
            com.bytedance.crash.jni.NativeBridge.LJJLIIIJJIZ(r1)     // Catch: java.lang.Throwable -> L34
            goto L38
        L2a:
            r0 = 50
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L34
            r0 = 10
            if (r2 < r0) goto L18
            goto L38
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L81
        L38:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L81
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "Disaster:syncNetworkStateFromFile mJsonArray="
            r1.append(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L81
            r1.append(r0)     // Catch: java.lang.Throwable -> L81
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L81
        L50:
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L81
            if (r5 >= r0) goto L91
            org.json.JSONObject r3 = com.bytedance.mt.protector.impl.JSONArrayProtectorUtils.getJSONObject(r4, r5)     // Catch: java.lang.Throwable -> L81
            java.util.Iterator r0 = r3.keys()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L81
            X.0VF4 r1 = new X.0VF4     // Catch: java.lang.Throwable -> L81
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r3, r2)     // Catch: java.lang.Throwable -> L81
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L81
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0VF4> r0 = r6.LIZ     // Catch: java.lang.Throwable -> L81
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L81
            LJIIJJI()     // Catch: java.lang.Throwable -> L81
            int r5 = r5 + 1
            goto L50
        L78:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0VF4> r0 = r6.LIZ     // Catch: java.lang.Throwable -> L81
            r0.clear()     // Catch: java.lang.Throwable -> L81
            LJIIJJI()     // Catch: java.lang.Throwable -> L81
            return
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0VF4> r0 = r6.LIZ
            r0.clear()
            LJIIJJI()
            r0 = 0
            r6.LJIJJLI(r0)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802230VdV.LJIIZILJ():void");
    }

    public final void LJIJ() {
        synchronized (this.LIZ) {
            try {
                JSONArray jSONArray = new JSONArray();
                try {
                    for (Map.Entry<String, C0VF4> entry : this.LIZ.entrySet()) {
                        if (entry != null) {
                            jSONArray.put(entry.getValue().LIZ());
                        }
                    }
                    if (jSONArray.length() <= 0) {
                        this.LIZ.clear();
                        LJIIJJI();
                        LJIJJLI(null);
                    } else {
                        LJIJJLI(jSONArray);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Disaster:syncNetworkStateToFile mJsonArray=");
                        sbLIZ.append(jSONArray.toString());
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZ.clear();
                    LJIIJJI();
                    LJIJJLI(null);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public C802230VdV() {
        C0VSJ c0vsj = new C0VSJ(C0VX9.LJFF(), "network_disaster");
        C2112008Pe.LIZJ(c0vsj);
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, "networkStatef");
        this.LIZIZ = c0vsj2;
        this.LIZ = new ConcurrentHashMap<>();
        this.LIZJ = false;
        this.LIZLLL = false;
        try {
            this.LJ = new FileObserverC802310Vdd(this, c0vsj2.getAbsolutePath());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LJFF = new C0VSJ(c0vsj, "disasterLock");
    }

    public static boolean LIZ(String str) {
        C802230VdV c802230VdVLJ = LJ();
        if (c802230VdVLJ != null && c802230VdVLJ.LIZ.size() > 0 && !LJII) {
            String strLIZ = null;
            try {
                if (TextUtils.isEmpty(null)) {
                    strLIZ = k.LIZ.LIZ();
                }
                int iLJI = c802230VdVLJ.LJI(LJFF(strLIZ, str));
                if (iLJI == 4 || iLJI == 5) {
                    return true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }

    public static long LIZIZ(URL url) {
        C802230VdV c802230VdVLJ = LJ();
        long jLJIIIIZZ = 0;
        if (c802230VdVLJ == null) {
            return 0L;
        }
        if (c802230VdVLJ.LIZ.size() > 0 && !LJII) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Disaster:checkPermission url=");
            sbLIZ.append(url);
            C2188811AlT.LIZIZ(sbLIZ);
            String strLJII = null;
            try {
                if (TextUtils.isEmpty(null)) {
                    strLJII = LJII(url);
                }
                if (TextUtils.isEmpty(strLJII)) {
                    return -1L;
                }
                C0VF4 c0vf4 = c802230VdVLJ.LIZ.get(LJFF(strLJII, url.getPath()));
                if (c0vf4 != null) {
                    jLJIIIIZZ = c802230VdVLJ.LJIIIIZZ(c0vf4);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Disaster:checkPermission return timeout=");
            sbLIZ2.append(jLJIIIIZZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        return jLJIIIIZZ;
    }

    public static void LIZJ(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteCrashLog:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            h hVar = h.LJIIJJI;
            if (new URL(hVar.LIZIZ).getPath().equals(str)) {
                LIZLLL(CrashType.JAVA);
                LIZLLL(CrashType.ANR);
            } else {
                if (new URL(hVar.LIZJ).getPath().equals(str)) {
                    C802980Vei.LIZIZ();
                    C0VSJ c0vsj = C08P6.LJ.LIZIZ;
                    if (c0vsj != null) {
                        C08SE.LIZIZ(c0vsj);
                    }
                    LIZLLL(CrashType.LAUNCH);
                    return;
                }
                if (new URL(hVar.LJII).getPath().equals(str)) {
                    LIZLLL(CrashType.NATIVE);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static void LIZLLL(CrashType crashType) {
        ?? arrayList;
        if (crashType == CrashType.JAVA) {
            List<File> listLJIIIZ = LJIIIZ(C802490Vdv.LLILZ);
            if (listLJIIIZ != null) {
                arrayList = new ArrayList();
                for (File file : (ArrayList) listLJIIIZ) {
                    if (!new C0VSJ(file, "launch").exists()) {
                        arrayList.add(file);
                    }
                }
            } else {
                return;
            }
        } else if (crashType == CrashType.LAUNCH) {
            List<File> listLJIIIZ2 = LJIIIZ(C802490Vdv.LLILZ);
            if (listLJIIIZ2 != null) {
                arrayList = new ArrayList();
                for (File file2 : (ArrayList) listLJIIIZ2) {
                    if (new C0VSJ(file2, "launch").exists()) {
                        arrayList.add(file2);
                    }
                }
            } else {
                return;
            }
        } else {
            if (crashType == CrashType.NATIVE) {
                arrayList = LJIIIZ(NativeCrashSummary.FILE_NAME);
            } else if (crashType == CrashType.ANR) {
                arrayList = LJIIIZ(C802440Vdq.LLIZLLLIL);
            } else {
                return;
            }
            if (arrayList == 0) {
                return;
            }
        }
        if (arrayList.size() > 0) {
            for (File file3 : arrayList) {
                if (!file3.isFile()) {
                    C08SE.LIZIZ(file3);
                }
            }
        }
    }

    public static String LJII(URL url) {
        String strDecode = "";
        try {
            String query = url.getQuery();
            if (query != null && query.contains("&") && query.contains("=")) {
                for (String str : query.split("&")) {
                    String[] strArrSplit = str.split("=");
                    if (strArrSplit != null && strArrSplit.length >= 2) {
                        try {
                            if (URLDecoder.decode(strArrSplit[0], "UTF-8").equals("aid")) {
                                strDecode = URLDecoder.decode(strArrSplit[1], "UTF-8");
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("getQueryParams value = ");
                                sbLIZ.append(strDecode);
                                C2188811AlT.LIZIZ(sbLIZ);
                                return strDecode;
                            }
                            continue;
                        } catch (UnsupportedEncodingException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return strDecode;
    }

    public static List<File> LJIIIZ(final String str) {
        C0VSJ c0vsj;
        File[] fileArrListFiles;
        C802600Ve6 c802600Ve6 = C802600Ve6.LIZLLL;
        if (c802600Ve6 == null || (c0vsj = c802600Ve6.LIZ) == null || (fileArrListFiles = c0vsj.listFiles()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.listFiles(new FilenameFilter() { // from class: X.0Vdf
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.endsWith(str);
                }
            }) == null) {
                return null;
            }
            arrayList.add(file);
        }
        return arrayList;
    }

    public final int LJI(String str) {
        synchronized (this) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return -1;
                }
                C0VF4 c0vf4 = this.LIZ.get(str);
                if (c0vf4 == null) {
                    return 0;
                }
                return c0vf4.LJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r4 == 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIIIIZZ(X.C0VF4 r13) {
        /*
            r12 = this;
            long r2 = java.lang.System.currentTimeMillis()
            long r6 = r13.LIZLLL
            int r4 = r13.LJ
            r10 = 0
            r0 = 1
            if (r4 != r0) goto L14
            long r4 = r13.LJII
        Lf:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L29
        L13:
            return r10
        L14:
            r0 = 3
            r1 = 5
            if (r4 == r0) goto L1d
            r0 = 4
            if (r4 == r0) goto L1d
            if (r4 != r1) goto L13
        L1d:
            r1 = 0
            int r0 = r13.LJI
            if (r0 <= 0) goto L2f
            r1 = r0
            r0 = 6
            if (r1 <= r0) goto L2f
            r4 = 1800000(0x1b7740, double:8.89318E-318)
        L29:
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L87
            monitor-enter(r12)
            goto L37
        L2f:
            int r0 = r1 * 5
            int r0 = r0 * 60
            int r0 = r0 * 1000
            long r4 = (long) r0
            goto Lf
        L37:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0VF4> r0 = r12.LIZ     // Catch: java.lang.Throwable -> L7d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> L7d
        L41:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L7d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L41
            java.lang.Object r8 = r0.getValue()     // Catch: java.lang.Throwable -> L7d
            X.0VF4 r8 = (X.C0VF4) r8     // Catch: java.lang.Throwable -> L7d
            r8.LIZLLL = r2     // Catch: java.lang.Throwable -> L7d
            java.text.DateFormat r0 = X.C0VXL.LIZLLL     // Catch: java.lang.Throwable -> L76
            if (r0 != 0) goto L69
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "yyyy-MM-dd@HH-mm-ss.SSS"
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L76
            r6.<init>(r1, r0)     // Catch: java.lang.Throwable -> L76
            X.C0VXL.LIZLLL = r6     // Catch: java.lang.Throwable -> L76
        L69:
            java.text.DateFormat r7 = X.C0VXL.LIZLLL     // Catch: java.lang.Throwable -> L76
            java.util.Date r6 = new java.util.Date     // Catch: java.lang.Throwable -> L76
            long r0 = r8.LIZLLL     // Catch: java.lang.Throwable -> L76
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L76
            r7.format(r6)     // Catch: java.lang.Throwable -> L76
            goto L41
        L76:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            goto L41
        L7b:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L7d
            goto L83
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L7d
            throw r0
        L83:
            r12.LJIJ()
            r6 = r2
        L87:
            long r2 = r2 - r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L8e
            long r10 = r4 - r2
        L8e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802230VdV.LJIIIIZZ(X.0VF4):long");
    }

    public final void LJIILJJIL(String str) {
        synchronized (this) {
            try {
                try {
                    if (this.LIZ.containsKey(str)) {
                        this.LIZ.remove(str);
                        LJIIJJI();
                        LJIJ();
                    }
                } finally {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r1 <= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        com.bytedance.crash.jni.NativeBridge.LJJLIIIJJIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r5.LIZLLL == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        java.lang.Thread.sleep(20);
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r2 < 50) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        r5.LIZLLL = true;
        X.C08SE.LJI(r5.LIZIZ, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(org.json.JSONArray r6) {
        /*
            r5 = this;
            r4 = 1
            r3 = 0
            r2 = 0
        L3:
            int r2 = r2 + 1
            int r1 = r5.LJIIJ()     // Catch: java.lang.Throwable -> L33
            r0 = -1
            if (r1 != r0) goto L16
            r0 = 50
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L33
            r0 = 20
            if (r2 >= r0) goto L37
            goto L3
        L16:
            r5.LIZLLL = r4     // Catch: java.lang.Throwable -> L33
            X.0VSJ r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L33
            X.C08SE.LJI(r0, r6)     // Catch: java.lang.Throwable -> L33
            if (r1 <= 0) goto L22
            com.bytedance.crash.jni.NativeBridge.LJJLIIIJJIZ(r1)     // Catch: java.lang.Throwable -> L33
        L22:
            r2 = 0
        L23:
            boolean r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L37
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L33
            int r2 = r2 + 1
            r0 = 50
            if (r2 < r0) goto L23
            goto L37
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L37:
            r5.LIZLLL = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802230VdV.LJIJJLI(org.json.JSONArray):void");
    }

    public static String LJFF(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_");
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    public static void LJIJI(URL url, C802240VdW c802240VdW) {
        C802230VdV c802230VdVLJ = LJ();
        if (c802230VdVLJ != null && !LJII && url != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Disaster:updateNetworkState url=");
            sbLIZ.append(url);
            C2188811AlT.LIZIZ(sbLIZ);
            try {
                String strLJII = LJII(url);
                String path = url.getPath();
                if (TextUtils.isEmpty(strLJII)) {
                    return;
                }
                c802230VdVLJ.LJIJJ(strLJII, path, c802240VdW);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005e -> B:25:0x0072). Please report as a decompilation issue!!! */
    public final void LJIILLIIL(String str, String str2) {
        C802240VdW c802240VdW;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Disaster:syncNetworkStateByNet path=");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            String str3 = h.LJIIJJI.LJIIJ;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", CastIntegerProtector.valueOf(str));
                jSONObject.put("os", "Android");
                jSONObject.put("path", str2);
                String strJ3 = C786410Ut5.J3(jSONObject);
                try {
                    if (!TextUtils.isEmpty(strJ3) && !TextUtils.isEmpty(str3)) {
                        c802240VdW = b.LIZ(str3, strJ3.getBytes(), EnumC797190VOz.GZIP, false);
                    } else {
                        c802240VdW = new C802240VdW(201);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c802240VdW = new C802240VdW(th);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                c802240VdW = new C802240VdW(207);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Disaster:syncNetworkStateByNet rsp=");
            sbLIZ2.append(c802240VdW.toString());
            C2188811AlT.LIZIZ(sbLIZ2);
            LJIJJ(str, str2, c802240VdW);
            if (this.LIZJ || c802240VdW.LIZ != 0) {
                this.LIZJ = false;
                LJIILIIL();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b A[Catch: all -> 0x012f, TryCatch #0 {all -> 0x012f, blocks: (B:6:0x0011, B:8:0x001b, B:10:0x0021, B:13:0x0036, B:16:0x0075, B:18:0x0081, B:20:0x00a1, B:23:0x00a8, B:26:0x00b0, B:28:0x00b9, B:41:0x00e0, B:43:0x00e9, B:55:0x0109, B:57:0x0115, B:60:0x012b, B:31:0x00c1, B:33:0x00c9, B:36:0x00d3), top: B:67:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIJJ(java.lang.String r23, java.lang.String r24, X.C802240VdW r25) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802230VdV.LJIJJ(java.lang.String, java.lang.String, X.0VdW):int");
    }

    public static void LJIIL(int i, String str, String str2, boolean z) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals("2010")) {
                String strLJFF = LJFF(str, str2);
                C0VX9.LJ();
                String strLIZ = C802270VdZ.LIZ();
                JSONObject jSONObject = new JSONObject();
                C0VJO.LJIIIIZZ(jSONObject, "path", strLJFF);
                if (z) {
                    C0VJO.LJIIIIZZ(jSONObject, "state", "exit");
                } else {
                    C0VJO.LJIIIIZZ(jSONObject, "state", "enter");
                }
                C0VJO.LJIIIIZZ(jSONObject, "strategy", String.valueOf(i));
                C0VJO.LJIIIIZZ(jSONObject, "pname", strLIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("disaster:reportEvent aid=");
                sbLIZ.append(str);
                sbLIZ.append(" path=");
                sbLIZ.append(str2);
                sbLIZ.append(" isRestore");
                sbLIZ.append(z);
                sbLIZ.append(" strategy=");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        LIZJ(r12);
        com.bytedance.crash.jni.NativeBridge.LJJLIIIJJIZ(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(int r7, long r8, int r10, java.lang.String r11, java.lang.String r12) {
        /*
            r6 = this;
            java.lang.String r4 = LJFF(r11, r12)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lb
            return
        Lb:
            monitor-enter(r6)
            r1 = 1
            if (r7 != 0) goto L20
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0VF4> r0 = r6.LIZ     // Catch: java.lang.Throwable -> La5
            boolean r0 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto La3
            r6.LJIILJJIL(r4)     // Catch: java.lang.Throwable -> La5
            r0 = -1
            LJIIL(r0, r11, r12, r1)     // Catch: java.lang.Throwable -> La5
            goto La3
        L20:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0VF4> r0 = r6.LIZ     // Catch: java.lang.Throwable -> La5
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> La5
            X.0VF4 r5 = (X.C0VF4) r5     // Catch: java.lang.Throwable -> La5
            r0 = 0
            if (r5 != 0) goto L33
            LJIIL(r7, r11, r12, r0)     // Catch: java.lang.Throwable -> La5
            X.0VF4 r5 = new X.0VF4     // Catch: java.lang.Throwable -> La5
            r5.<init>(r11, r12)     // Catch: java.lang.Throwable -> La5
        L33:
            if (r7 == r1) goto L43
            int r0 = r5.LJ     // Catch: java.lang.Throwable -> La5
            if (r7 == r0) goto L3c
            r5.LJI = r1     // Catch: java.lang.Throwable -> La5
            goto L45
        L3c:
            int r0 = r5.LJI     // Catch: java.lang.Throwable -> La5
            int r0 = r0 + 1
            r5.LJI = r0     // Catch: java.lang.Throwable -> La5
            goto L45
        L43:
            r5.LJI = r0     // Catch: java.lang.Throwable -> La5
        L45:
            r5.LJ = r7     // Catch: java.lang.Throwable -> La5
            r5.LJFF = r10     // Catch: java.lang.Throwable -> La5
            if (r7 != r1) goto L4e
            r5.LJII = r8     // Catch: java.lang.Throwable -> La5
            goto L6f
        L4e:
            r0 = 5
            if (r7 != r0) goto L6f
            r2 = 0
        L52:
            int r2 = r2 + 1
            int r0 = r6.LJIIJ()     // Catch: java.lang.Throwable -> L6b
            if (r0 <= 0) goto L61
            LIZJ(r12)     // Catch: java.lang.Throwable -> L6b
            com.bytedance.crash.jni.NativeBridge.LJJLIIIJJIZ(r0)     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L61:
            r0 = 50
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> L6b
            r0 = 10
            if (r2 < r0) goto L52
            goto L6f
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La5
        L6f:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La5
            r5.LIZLLL = r0     // Catch: java.lang.Throwable -> La5
            java.text.DateFormat r0 = X.C0VXL.LIZLLL     // Catch: java.lang.Throwable -> L94
            if (r0 != 0) goto L87
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = "yyyy-MM-dd@HH-mm-ss.SSS"
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L94
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L94
            X.C0VXL.LIZLLL = r2     // Catch: java.lang.Throwable -> L94
        L87:
            java.text.DateFormat r3 = X.C0VXL.LIZLLL     // Catch: java.lang.Throwable -> L94
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L94
            long r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L94
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L94
            r3.format(r2)     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La5
        L98:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0VF4> r0 = r6.LIZ     // Catch: java.lang.Throwable -> La5
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> La5
            LJIIJJI()     // Catch: java.lang.Throwable -> La5
            r6.LJIJ()     // Catch: java.lang.Throwable -> La5
        La3:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La5
            return
        La5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La5
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802230VdV.LJIILL(int, long, int, java.lang.String, java.lang.String):void");
    }
}
