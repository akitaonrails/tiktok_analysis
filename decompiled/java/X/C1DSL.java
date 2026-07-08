package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1DSL, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DSL {
    public static C1DST LIZ;

    public static C1DST LIZ() {
        C1DSM c1dsm = new C1DSM();
        if (!TextUtils.isEmpty(c1dsm.LIZIZ)) {
            String lowerCase = c1dsm.LIZIZ.toLowerCase(C1DST.LIZ);
            if (lowerCase.startsWith("emotionui") || lowerCase.startsWith("magicui")) {
                return c1dsm;
            }
        }
        try {
            String str = Build.BRAND;
            if (!TextUtils.isEmpty(str)) {
                if (str.toLowerCase(C1DST.LIZ).startsWith("huawei")) {
                    return c1dsm;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            String str2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str2)) {
                if (str2.toLowerCase(C1DST.LIZ).startsWith("huawei")) {
                    return c1dsm;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C1DST c1dst = new C1DST() { // from class: X.1DSR
            public final String LIZIZ = C1DSL.LIZJ("ro.miui.ui.version.name");

            @Override // X.C1DST
            public final String LIZ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("miui_");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append("_");
                sbLIZ.append(Build.VERSION.INCREMENTAL);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        };
        try {
            Class.forName("miui.os.Build");
            return c1dst;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C1DSS c1dss = new C1DSS();
            if (!TextUtils.isEmpty(c1dss.LIZIZ) && c1dss.LIZIZ.toLowerCase(C1DST.LIZ).contains("funtouch")) {
                return c1dss;
            }
            C1DST c1dst2 = new C1DST() { // from class: X.1DSP
                public final String LIZIZ = C1DSL.LIZJ("ro.build.version.opporom");

                @Override // X.C1DST
                public final String LIZ() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("coloros_");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append("_");
                    sbLIZ.append(Build.DISPLAY);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            };
            String str3 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(str3) && str3.toLowerCase(C1DST.LIZ).contains("oppo")) {
                return c1dst2;
            }
            C1DST c1dst3 = new C1DST() { // from class: X.1DSU
            };
            String str4 = Build.DISPLAY;
            if (!TextUtils.isEmpty(str4) && str4.toLowerCase(C1DST.LIZ).contains("flyme")) {
                return c1dst3;
            }
            if (!TextUtils.isEmpty(Build.USER) && Build.USER.equals("flyme")) {
                return c1dst3;
            }
            C1DSN c1dsn = new C1DSN();
            if (!TextUtils.isEmpty(c1dsn.LIZIZ)) {
                return c1dsn;
            }
            C1DST c1dst4 = new C1DST() { // from class: X.1DSV
            };
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str5 = Build.BRAND;
            sbLIZ.append(str5);
            sbLIZ.append(str3);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!TextUtils.isEmpty(strLIZIZ) && strLIZIZ.toLowerCase(C1DST.LIZ).contains("sony")) {
                return c1dst4;
            }
            C1DST c1dst5 = new C1DST() { // from class: X.1DSO
                public final String LIZIZ = C1DSL.LIZJ("ro.gn.sv.version");

                @Override // X.C1DST
                public final String LIZ() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(Build.DISPLAY);
                    sbLIZ2.append("_");
                    sbLIZ2.append(this.LIZIZ);
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }
            };
            if (!TextUtils.isEmpty(str4) && str4.toLowerCase(C1DST.LIZ).contains("amigo")) {
                return c1dst5;
            }
            C1DST c1dst6 = new C1DST() { // from class: X.1DSQ
                public final String LIZIZ = C1DSL.LIZJ("ro.build.uiversion");

                @Override // X.C1DST
                public final String LIZ() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZIZ);
                    sbLIZ2.append("_");
                    sbLIZ2.append(Build.DISPLAY);
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }
            };
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str3);
            sbLIZ2.append(str5);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (!TextUtils.isEmpty(strLIZIZ2)) {
                String lowerCase2 = strLIZIZ2.toLowerCase(C1DST.LIZ);
                if (lowerCase2.contains("360") || lowerCase2.contains("qiku")) {
                    return c1dst6;
                }
            }
            return new C1DST() { // from class: X.1DSW
            };
        }
    }

    public static String LIZIZ() {
        if (LIZ == null) {
            synchronized (C1DST.class) {
                try {
                    if (LIZ == null) {
                        LIZ = LIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ.LIZ();
    }

    public static String LIZJ(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
