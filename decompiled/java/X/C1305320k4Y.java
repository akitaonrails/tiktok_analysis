package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.android.livesdk.performance.CpuTemperaturePathListSetting;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.0k4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305320k4Y {
    public static final C1305330k4Z LIZ = new FileFilter() { // from class: X.0k4Z
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
    public static int LIZIZ = -1;
    public static float LIZJ = -1.0f;

    public static boolean LJI(double d) {
        return d >= -30.0d && d <= 250.0d;
    }

    public static int LIZ(String str) throws Throwable {
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

    public static float LIZIZ(Context context) {
        if (context == null) {
            return -999.0f;
        }
        C1305440k4k c1305440k4kLIZJ = C1305440k4k.LIZJ(context, "live-app-core-sdk");
        String str = (String) c1305440k4kLIZJ.LIZLLL("cpu_temperature_path", EnumC1305450k4l.STRING, "");
        if (TextUtils.equals(str, "unknow")) {
            return -999.0f;
        }
        if (!TextUtils.isEmpty(str)) {
            float fLJII = LJII(new C0VSJ(str));
            if (fLJII != -999.0f) {
                if (LJI(fLJII)) {
                    return fLJII;
                }
                float f = fLJII / 1000.0f;
                if (!LJI(f)) {
                    return -999.0f;
                }
                return f;
            }
        }
        for (String str2 : CpuTemperaturePathListSetting.INSTANCE.getPathList()) {
            float fLJII2 = LJII(new C0VSJ(str2));
            if (fLJII2 != -999.0f) {
                if (LJI(fLJII2)) {
                    c1305440k4kLIZJ.LJII(str2, "cpu_temperature_path");
                    return fLJII2;
                }
                float f2 = fLJII2 / 1000.0f;
                if (!LJI(f2)) {
                    return -999.0f;
                }
                c1305440k4kLIZJ.LJII(str2, "cpu_temperature_path");
                return f2;
            }
        }
        c1305440k4kLIZJ.LJII("unknow", "cpu_temperature_path");
        return -999.0f;
    }

    public static float LIZJ(Context context) {
        if (context == null) {
            return -999.0f;
        }
        float f = LIZJ;
        if (f != -1.0f) {
            return f;
        }
        C1305440k4k c1305440k4kLIZJ = C1305440k4k.LIZJ(context, "live-app-core-sdk");
        int iLJFF = c1305440k4kLIZJ.LJFF("device_total_memory", -1);
        if (iLJFF != -1) {
            float f2 = iLJFF;
            LIZJ = f2;
            return f2;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF((ActivityManager) C786410Ut5.H2(context, "activity"), memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYH5R57mRFKD6uIgapNES0t9YNEMy8", null));
        float f3 = memoryInfo.totalMem;
        if (f3 != -1.0f) {
            c1305440k4kLIZJ.LJII(Float.valueOf(f3), "device_total_memory");
            LIZJ = f3;
            return f3;
        }
        LIZJ = -999.0f;
        return -999.0f;
    }

    public static long LIZLLL(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYH5R57mRFKD6uIgapNES0t9YNEMy8", null)) * C2204961BRm.LLFF(statFs, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYH5R57mRFKD6uIgapNES0t9YNEMy8", null));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return -1L;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return -1L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r1 != (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJ(android.content.Context r6) {
        /*
            r5 = -999(0xfffffffffffffc19, float:NaN)
            if (r6 != 0) goto L5
            return r5
        L5:
            int r0 = X.C1305320k4Y.LIZIZ
            r4 = -1
            if (r0 == r4) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "live-app-core-sdk"
            X.0k4k r3 = X.C1305440k4k.LIZJ(r6, r0)
            java.lang.String r2 = "cpu_core"
            int r0 = r3.LJFF(r2, r4)
            if (r0 == r4) goto L1c
            X.C1305320k4Y.LIZIZ = r0
            return r0
        L1c:
            java.lang.String r0 = "/sys/devices/system/cpu/possible"
            int r1 = LIZ(r0)     // Catch: java.lang.SecurityException -> L47 java.lang.NullPointerException -> L4c
            if (r1 != r4) goto L2a
            java.lang.String r0 = "/sys/devices/system/cpu/present"
            int r1 = LIZ(r0)     // Catch: java.lang.SecurityException -> L47 java.lang.NullPointerException -> L4c
        L2a:
            if (r1 != r4) goto L3b
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.SecurityException -> L47 java.lang.NullPointerException -> L4c
            java.lang.String r0 = "/sys/devices/system/cpu/"
            r1.<init>(r0)     // Catch: java.lang.SecurityException -> L47 java.lang.NullPointerException -> L4c
            X.0k4Z r0 = X.C1305320k4Y.LIZ     // Catch: java.lang.SecurityException -> L47 java.lang.NullPointerException -> L4c
            java.io.File[] r0 = r1.listFiles(r0)     // Catch: java.lang.SecurityException -> L47 java.lang.NullPointerException -> L4c
            int r1 = r0.length     // Catch: java.lang.SecurityException -> L47 java.lang.NullPointerException -> L4c
            goto L3d
        L3b:
            if (r1 == r4) goto L50
        L3d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.LJII(r0, r2)
            X.C1305320k4Y.LIZIZ = r1
            return r1
        L47:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L50
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L50:
            X.C1305320k4Y.LIZIZ = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1305320k4Y.LJ(android.content.Context):int");
    }

    public static C1305270k4T LJFF(Context context) {
        C1305270k4T c1305270k4T = new C1305270k4T();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(context, "window");
        if (windowManager != null && C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYH5R57mRFKD6uIgapNES0t9YNEMy8", null)) != null) {
            C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYH5R57mRFKD6uIgapNES0t9YNEMy8", null)).getMetrics(displayMetrics);
            c1305270k4T.LIZ = displayMetrics.densityDpi;
            c1305270k4T.LIZIZ = displayMetrics.widthPixels;
            c1305270k4T.LIZJ = displayMetrics.heightPixels;
        }
        return c1305270k4T;
    }

    public static float LJII(C0VSJ c0vsj) {
        try {
            C0VSP c0vsp = new C0VSP(c0vsj);
            InputStreamReader inputStreamReader = new InputStreamReader(c0vsp);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            bufferedReader.close();
            inputStreamReader.close();
            c0vsp.close();
            try {
                return CastFloatProtector.parseFloat(line);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return -999.0f;
            }
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return -999.0f;
        }
    }
}
