package X;

import android.app.ActivityManager;
import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;

/* JADX INFO: renamed from: X.0WYJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WYJ {
    public static final C2428809fS LIZ = new FileFilter() { // from class: X.09fS
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0036: MOVE (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:54), block:B:15:0x0036 */
    public static int LJIILIIL() throws Throwable {
        C0VSP c0vsp;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/proc/");
                sbLIZ.append(Process.myPid());
                sbLIZ.append("/limits");
                c0vsp = new C0VSP(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    int iLJJI = LJJI("Max open files", c0vsp);
                    LIZIZ(c0vsp);
                    return iLJJI;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    LIZIZ(c0vsp);
                    return -1;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                TryCatchGuardChecker.doCheck(th);
                LIZIZ(closeable2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            c0vsp = null;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            LIZIZ(closeable2);
            throw th;
        }
    }

    public static int LJIILJJIL() throws Throwable {
        int length = -1;
        try {
            int iLJIIIIZZ = LJIIIIZZ("/sys/devices/system/cpu/possible");
            if (iLJIIIIZZ == -1) {
                iLJIIIIZZ = LJIIIIZZ("/sys/devices/system/cpu/present");
            }
            if (iLJIIIIZZ != -1) {
                return iLJIIIIZZ;
            }
            length = new C0VSJ("/sys/devices/system/cpu/").listFiles(LIZ).length;
            return length;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return length;
        } catch (SecurityException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return length;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0036: MOVE (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:54), block:B:15:0x0036 */
    public static int LJIIZILJ() throws Throwable {
        C0VSP c0vsp;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/proc/");
                sbLIZ.append(Process.myPid());
                sbLIZ.append("/status");
                c0vsp = new C0VSP(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    int iLJJI = LJJI("Threads", c0vsp);
                    LIZIZ(c0vsp);
                    return iLJJI;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    LIZIZ(c0vsp);
                    return -1;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                TryCatchGuardChecker.doCheck(th);
                LIZIZ(closeable2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            c0vsp = null;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            LIZIZ(closeable2);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0036: MOVE (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:54), block:B:15:0x0036 */
    public static int LJIJJLI() throws Throwable {
        C0VSP c0vsp;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/proc/");
                sbLIZ.append(Process.myPid());
                sbLIZ.append("/status");
                c0vsp = new C0VSP(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    int iLJJI = LJJI("VmPeak", c0vsp);
                    LIZIZ(c0vsp);
                    return iLJJI;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    LIZIZ(c0vsp);
                    return -1;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                TryCatchGuardChecker.doCheck(th);
                LIZIZ(closeable2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            c0vsp = null;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            LIZIZ(closeable2);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0036: MOVE (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:54), block:B:15:0x0036 */
    public static int LJIL() throws Throwable {
        C0VSP c0vsp;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/proc/");
                sbLIZ.append(Process.myPid());
                sbLIZ.append("/status");
                c0vsp = new C0VSP(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    int iLJJI = LJJI("VmSize", c0vsp);
                    LIZIZ(c0vsp);
                    return iLJJI;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    LIZIZ(c0vsp);
                    return -1;
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                TryCatchGuardChecker.doCheck(th);
                LIZIZ(closeable2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            c0vsp = null;
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            LIZIZ(closeable2);
            throw th;
        }
    }

    public static C0WYM LJIIIZ() {
        C0WYM c0wym = new C0WYM();
        c0wym.LIZ = LJIIJ();
        int i = -1;
        int iIntValue = -1;
        for (int i2 = 0; i2 < LJIILJJIL(); i2++) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/sys/devices/system/cpu/cpu");
                sbLIZ.append(i2);
                sbLIZ.append("/cpufreq/cpuinfo_max_freq");
                C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
                if (c0vsj.exists()) {
                    byte[] bArr = new byte[128];
                    C0VSP c0vsp = new C0VSP(c0vsj);
                    try {
                        try {
                            c0vsp.read(bArr);
                            int i3 = 0;
                            while (Character.isDigit(bArr[i3]) && i3 < 128) {
                                i3++;
                            }
                            Integer numValueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i3)));
                            if (numValueOf.intValue() > iIntValue) {
                                iIntValue = numValueOf.intValue();
                            }
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        c0vsp.close();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c0vsp.close();
                        throw th;
                    }
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        if (iIntValue == -1) {
            C0VSP c0vsp2 = new C0VSP("/proc/cpuinfo");
            try {
                int iLJJI = LJJI("cpu MHz", c0vsp2) * LSPassThroughRecordSizeConfig.DEFAULT;
                if (iLJJI > iIntValue) {
                    iIntValue = iLJJI;
                }
                c0vsp2.close();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c0vsp2.close();
                throw th2;
            }
        }
        i = iIntValue;
        if (String.valueOf(i).length() >= 6) {
            i /= LSPassThroughRecordSizeConfig.DEFAULT;
        }
        c0wym.LIZIZ = i * LSPassThroughRecordSizeConfig.DEFAULT;
        c0wym.LIZJ = LJIILJJIL();
        return c0wym;
    }

    public static String LJIIJ() {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new C0VSF("/proc/cpuinfo"));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            LIZIZ(bufferedReader2);
                            break;
                        }
                        if (line.contains(":")) {
                            String[] strArrSplit = line.split(":");
                            if (strArrSplit[0].contains("Hardware")) {
                                String str = strArrSplit[1];
                                LIZIZ(bufferedReader2);
                                return str;
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        TryCatchGuardChecker.doCheck(e);
                        LIZIZ(bufferedReader);
                        return Build.HARDWARE;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        TryCatchGuardChecker.doCheck(th);
                        LIZIZ(bufferedReader);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean LJJ() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        try {
            if (new C0VSJ("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return LIZ("/system/xbin/which su") || LIZ("/system/bin/which su") || LIZ("which su") || LIZ("busybox which su");
    }

    public static long LJI() {
        if (Environment.getDataDirectory() != null) {
            return LJIIJJI(Environment.getDataDirectory().getPath());
        }
        return -1L;
    }

    public static long LJIJ() {
        if (Environment.getDataDirectory() != null) {
            try {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                return C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYexBlLCalR83I=", null)) * C2204961BRm.LLFZ(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYexBlLCalR83I=", null));
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return -1L;
    }

    public static boolean LIZ(String str) {
        boolean z = false;
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(str);
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                z = true;
            }
            processExec.destroy();
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (processExec != null) {
                processExec.destroy();
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (processExec != null) {
                processExec.destroy();
            }
            throw th;
        }
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static long LIZJ(File file) {
        long length;
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                length = LJIIL(file2);
            } else {
                length = file2.length();
            }
            j += length;
        }
        return j;
    }

    public static long LJ(Context context) {
        long jLJIIL;
        String parent;
        if (context == null) {
            return -1L;
        }
        try {
            if (TextUtils.isEmpty(context.getPackageName())) {
                return -1L;
            }
            long jLJIIL2 = 0;
            try {
                parent = C786410Ut5.w2(context).getParent();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (parent != null) {
                jLJIIL = LJIIL(new C0VSJ(parent));
            } else {
                jLJIIL = 0;
            }
            try {
                String parent2 = C786410Ut5.x2(context).getParent();
                if (parent2 != null) {
                    jLJIIL2 = LJIIL(new C0VSJ(parent2));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            return jLJIIL + jLJIIL2;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            return -1L;
        }
    }

    public static long LJFF(Context context) {
        File fileX2;
        if (context == null || (fileX2 = C786410Ut5.x2(context)) == null) {
            return -1L;
        }
        long jLJIIJJI = LJIIJJI(fileX2.getPath());
        if (jLJIIJJI == -1) {
            return -1L;
        }
        return jLJIIJJI;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:33|3)|(3:5|(1:7)|22)(1:10)|37|11|30|12|20|21|22|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|33|3|(3:5|(1:7)|22)(1:10)|37|11|30|12|20|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0050 -> B:24:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJII(android.content.Context r8) throws java.lang.Throwable {
        /*
            r5 = 0
            r6 = -1
            android.app.ActivityManager$MemoryInfo r3 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Exception -> L23
            r3.<init>()     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "activity"
            java.lang.Object r2 = X.C786410Ut5.H2(r8, r0)     // Catch: java.lang.Exception -> L23
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Exception -> L23
            if (r2 == 0) goto L27
            X.0WZX r1 = new X.0WZX     // Catch: java.lang.Exception -> L23
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYexBlLCalR83I="
            r1.<init>(r0, r5)     // Catch: java.lang.Exception -> L23
            X.C2204961BRm.LJFF(r2, r3, r1)     // Catch: java.lang.Exception -> L23
            long r2 = r3.availMem     // Catch: java.lang.Exception -> L23
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L48
            goto L29
        L23:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L27:
            r2 = -1
        L29:
            X.0VSP r4 = new X.0VSP     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.lang.String r0 = "/proc/meminfo"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.lang.String r0 = "MemAvailable"
            int r0 = LJJI(r0, r4)     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L49
            goto L41
        L37:
            r0 = move-exception
            goto L3d
        L39:
            r0 = move-exception
            goto L4b
        L3b:
            r0 = move-exception
            r4 = r5
        L3d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L49
            goto L45
        L41:
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L49
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
        L45:
            LIZIZ(r4)
        L48:
            return r2
        L49:
            r0 = move-exception
        L4a:
            r5 = r4
        L4b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4f
            goto L52
        L4f:
            r0 = move-exception
            r4 = r5
            goto L4a
        L52:
            LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WYJ.LJII(android.content.Context):long");
    }

    public static int LJIIIIZZ(String str) throws Throwable {
        C0VSP c0vsp;
        int iIntValue = -1;
        C0VSP c0vsp2 = null;
        try {
            try {
                c0vsp = new C0VSP(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            String line = new BufferedReader(new InputStreamReader(c0vsp)).readLine();
            if (line != null && line.matches("0-[\\d]+$")) {
                iIntValue = CastIntegerProtector.valueOf(line.substring(2)).intValue() + 1;
            }
            try {
                c0vsp.close();
                return iIntValue;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return iIntValue;
            }
        } catch (IOException e3) {
            e = e3;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    return -1;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th2) {
            th = th2;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(th);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    throw th;
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static long LJIIJJI(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYexBlLCalR83I=", null)) * C2204961BRm.LLFF(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYexBlLCalR83I=", null));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1L;
        }
    }

    public static long LJIIL(File file) {
        if (C2259908tJ.LIZIZ()) {
            long jLIZ = C2259908tJ.LIZ(file);
            if (jLIZ <= 0) {
                return LIZJ(file);
            }
            return jLIZ;
        }
        return LIZJ(file);
    }

    public static C0WYL LJIILL(Context context) {
        C0WYL c0wyl = new C0WYL();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (windowManager != null) {
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYexBlLCalR83I=", null)).getMetrics(displayMetrics);
            c0wyl.LIZ = displayMetrics.densityDpi;
            c0wyl.LIZIZ = displayMetrics.widthPixels;
            c0wyl.LIZJ = displayMetrics.heightPixels;
            c0wyl.LIZLLL = displayMetrics.xdpi;
            c0wyl.LJ = displayMetrics.ydpi;
            c0wyl.LJFF = displayMetrics.density;
        }
        return c0wyl;
    }

    public static C0WYK LJIILLIIL(Context context) {
        long jLJIIL;
        int i;
        String parent;
        C0WYK c0wyk = new C0WYK();
        long jLJIIL2 = 0;
        try {
            parent = C786410Ut5.x2(context).getParent();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (parent != null) {
            jLJIIL = LJIIL(new C0VSJ(parent));
        } else {
            jLJIIL = 0;
        }
        c0wyk.LJFF = jLJIIL;
        try {
            String parent2 = C786410Ut5.w2(context).getParent();
            if (parent2 != null) {
                jLJIIL2 = LJIIL(new C0VSJ(parent2));
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        c0wyk.LJI = jLJIIL2;
        c0wyk.LJ = c0wyk.LJFF + jLJIIL2;
        c0wyk.LIZ = LJFF(context);
        c0wyk.LIZJ = LJI();
        long jLJI = C09N1.LJI(context);
        if (jLJI == -1) {
            jLJI = -1;
        }
        c0wyk.LIZIZ = jLJI;
        c0wyk.LIZLLL = LJIJ();
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if ((context.getApplicationInfo().flags & 262144) != 262144) {
            i = 0;
        } else {
            i = 1;
        }
        c0wyk.LJII = i;
        LJJIFFI(context, c0wyk);
        return c0wyk;
    }

    public static long LJIJI(Context context) throws Throwable {
        long j;
        C0VSP c0vsp;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(context, "activity");
        C0VSP c0vsp2 = null;
        if (activityManager != null) {
            C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYexBlLCalR83I=", null));
            j = memoryInfo.totalMem;
            if (j == -1) {
            }
            return j;
        }
        j = -1;
        try {
            try {
                c0vsp = new C0VSP("/proc/meminfo");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long jLJJI = ((long) LJJI("MemTotal", c0vsp)) * 1024;
            LIZIZ(c0vsp);
            return jLJJI;
        } catch (Exception e2) {
            e = e2;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(e);
            LIZIZ(c0vsp2);
            return j;
        } catch (Throwable th2) {
            th = th2;
            c0vsp2 = c0vsp;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    LIZIZ(c0vsp2);
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    public static int LJIJJ(Context context) {
        try {
            return ((ActivityManager) C786410Ut5.H2(context, "activity")).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public static int LIZLLL(byte[] bArr, int i) {
        byte b;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return CastIntegerProtector.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0035, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: NumberFormatException -> 0x0038, IOException -> 0x003d, TryCatch #2 {IOException -> 0x003d, NumberFormatException -> 0x0038, blocks: (B:3:0x0005, B:5:0x000c, B:12:0x001b, B:14:0x0025, B:16:0x002d, B:18:0x0032, B:19:0x0035, B:9:0x0016), top: B:26:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[Catch: NumberFormatException -> 0x0038, IOException -> 0x003d, TryCatch #2 {IOException -> 0x003d, NumberFormatException -> 0x0038, blocks: (B:3:0x0005, B:5:0x000c, B:12:0x001b, B:14:0x0025, B:16:0x002d, B:18:0x0032, B:19:0x0035, B:9:0x0016), top: B:26:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJJI(java.lang.String r8, X.C0VSP r9) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r0]
            r6 = -1
            int r5 = r9.read(r7)     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            r4 = 0
        La:
            if (r4 >= r5) goto L41
            r1 = r7[r4]     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            r0 = 10
            if (r1 == r0) goto L16
            if (r4 != 0) goto L35
            if (r1 != r0) goto L18
        L16:
            int r4 = r4 + 1
        L18:
            r3 = r4
        L19:
            if (r3 >= r5) goto L35
            int r2 = r3 - r4
            r1 = r7[r3]     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            char r0 = r8.charAt(r2)     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            if (r1 != r0) goto L35
            int r0 = r8.length()     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            int r0 = r0 + (-1)
            if (r2 != r0) goto L32
            int r0 = LIZLLL(r7, r3)     // Catch: java.lang.NumberFormatException -> L38 java.io.IOException -> L3d
            return r0
        L32:
            int r3 = r3 + 1
            goto L19
        L35:
            int r4 = r4 + 1
            goto La
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r6
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WYJ.LJJI(java.lang.String, X.0VSP):int");
    }

    public static void LJJIFFI(Context context, C0WYK c0wyk) {
        UUID uuidFromString;
        c0wyk.LJIIIIZZ = -1L;
        c0wyk.LJIIIZ = -1L;
        c0wyk.LJIIJ = -1L;
        if (context != null && Build.VERSION.SDK_INT >= 26) {
            StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
            StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
            if (storageManager != null && storageStatsManager != null) {
                c0wyk.LJIIIIZZ = 0L;
                c0wyk.LJIIIZ = 0L;
                c0wyk.LJIIJ = 0L;
                String packageName = context.getPackageName();
                for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                    if ("mounted".equals(storageVolume.getState())) {
                        String uuid = storageVolume.getUuid();
                        if (uuid == null) {
                            try {
                                uuidFromString = StorageManager.UUID_DEFAULT;
                            } catch (IllegalArgumentException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else {
                            uuidFromString = UUID.fromString(uuid);
                        }
                        if (uuidFromString != null) {
                            try {
                                StorageStats storageStatsLJJIFFI = C2204961BRm.LJJIFFI(storageStatsManager, uuidFromString, packageName, Process.myUserHandle(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+8apPdkhYexBlLCalR83I=", null));
                                c0wyk.LJIIIIZZ += storageStatsLJJIFFI.getAppBytes();
                                c0wyk.LJIIIZ += storageStatsLJJIFFI.getDataBytes() - storageStatsLJJIFFI.getCacheBytes();
                                c0wyk.LJIIJ += storageStatsLJJIFFI.getCacheBytes();
                            } catch (PackageManager.NameNotFoundException | IOException | SecurityException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    }
                }
            }
        }
    }
}
