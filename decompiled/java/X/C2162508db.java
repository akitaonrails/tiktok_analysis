package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: X.08db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2162508db {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static String LIZJ;
    public static Method LIZLLL;

    public static boolean LIZJ() {
        try {
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("hua")) {
                return true;
            }
            String str2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str2)) {
                if (str2.toLowerCase().startsWith("hua")) {
                    return true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    public static String LIZ() {
        boolean z;
        String strLIZIZ;
        if (LIZIZ && !TextUtils.isEmpty(LIZJ)) {
            return LIZJ;
        }
        boolean z2 = true;
        try {
            Class.forName("miui.os.Build");
            LIZ = true;
            z = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = LIZ;
        }
        String strLIZIZ2 = "";
        if (z) {
            try {
                Class.forName("miui.os.Build");
                LIZ = true;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                z2 = LIZ;
            }
            if (z2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("miui_");
                sbLIZ.append(LIZIZ("ro.miui.ui.version.name"));
                sbLIZ.append("_");
                sbLIZ.append(Build.VERSION.INCREMENTAL);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            String str = Build.DISPLAY;
            if (!(str.contains("Flyme") || "flyme".equals(Build.USER))) {
                String str2 = Build.MANUFACTURER;
                if (!TextUtils.isEmpty(str2) ? str2.toLowerCase(Locale.getDefault()).contains("oppo") : false) {
                    if (TextUtils.isEmpty(str2) ? false : str2.toLowerCase(Locale.getDefault()).contains("oppo")) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("coloros_");
                        sbLIZ2.append(LIZIZ("ro.build.version.opporom"));
                        sbLIZ2.append("_");
                        sbLIZ2.append(str);
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                } else {
                    String strLIZIZ3 = LIZIZ("ro.build.version.emui");
                    if (strLIZIZ3 == null || !strLIZIZ3.toLowerCase(Locale.getDefault()).contains("emotionui")) {
                        strLIZIZ = "";
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ3);
                        sbLIZ3.append("_");
                        sbLIZ3.append(str);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    if (TextUtils.isEmpty(strLIZIZ)) {
                        String strLIZIZ4 = LIZIZ("ro.vivo.os.build.display.id");
                        if (!TextUtils.isEmpty(strLIZIZ4) && strLIZIZ4.toLowerCase(Locale.getDefault()).contains("funtouch")) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(LIZIZ("ro.vivo.os.build.display.id"));
                            sbLIZ4.append("_");
                            sbLIZ4.append(LIZIZ("ro.vivo.product.version"));
                            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                        } else {
                            if (!TextUtils.isEmpty(str) && str.toLowerCase(Locale.getDefault()).contains("amigo")) {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append(str);
                                sbLIZ5.append("_");
                                sbLIZ5.append(LIZIZ("ro.gn.sv.version"));
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                            } else {
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append(str2);
                                sbLIZ6.append(Build.BRAND);
                                String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ6);
                                if (!TextUtils.isEmpty(strLIZIZ5)) {
                                    String lowerCase = strLIZIZ5.toLowerCase(Locale.getDefault());
                                    if (lowerCase.contains("360") || lowerCase.contains("qiku")) {
                                        z = true;
                                    }
                                }
                                if (z) {
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append(LIZIZ("ro.build.uiversion"));
                                    sbLIZ7.append("_");
                                    sbLIZ7.append(str);
                                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                                } else {
                                    if (!TextUtils.isEmpty(LIZIZ("ro.letv.release.version"))) {
                                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                        sbLIZ8.append("eui_");
                                        sbLIZ8.append(LIZIZ("ro.letv.release.version"));
                                        sbLIZ8.append("_");
                                        sbLIZ8.append(str);
                                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ8);
                                    }
                                    if (TextUtils.isEmpty(strLIZIZ2)) {
                                        LIZIZ = true;
                                        strLIZIZ2 = str;
                                    }
                                }
                            }
                        }
                    } else {
                        strLIZIZ2 = strLIZIZ;
                    }
                }
            } else if (str.toLowerCase(Locale.getDefault()).contains("flyme")) {
                strLIZIZ2 = str;
            }
        }
        LIZJ = strLIZIZ2;
        return strLIZIZ2;
    }

    public static String LIZIZ(String str) {
        String str2;
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            if (LIZLLL == null) {
                LIZLLL = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            }
            str2 = (String) LIZLLL.invoke(null, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            Runtime runtime = Runtime.getRuntime();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getprop ");
            sbLIZ.append(str);
            Process processExec = runtime.exec(C2188811AlT.LIZIZ(sbLIZ));
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 1024);
            try {
                line = bufferedReader2.readLine();
                processExec.destroy();
                C1971107np.LIZ(bufferedReader2);
                return line;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C1971107np.LIZ(bufferedReader);
                    return line;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1971107np.LIZ(bufferedReader);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
