package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08da, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2162408da {
    public static final String LIZ;
    public static final C1964307mj LIZIZ;
    public static final String LIZJ;
    public static String LIZLLL;

    static {
        String strLIZ;
        String strValueOf = String.valueOf(Build.VERSION.SDK);
        LIZ = strValueOf;
        LIZIZ = new C1964307mj();
        LIZJ = strValueOf;
        try {
            strLIZ = LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strLIZ = null;
        }
        if (C2093608Ic.LJ(strLIZ)) {
            strLIZ = LIZ;
        }
        LIZJ = strLIZ;
    }

    public static String LIZ() {
        boolean z;
        try {
            String strLIZIZ = LIZIZ("ro.build.version.emui");
            LIZLLL = strLIZIZ;
            boolean zLJ = C2093608Ic.LJ(strLIZIZ);
            if (!zLJ) {
                LIZLLL = LIZLLL.toLowerCase();
            }
            z = !zLJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            z = false;
        }
        if (z) {
            if (C2093608Ic.LJ(LIZLLL)) {
                LIZLLL = LIZIZ("ro.build.version.emui");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZLLL);
            sbLIZ.append("_");
            sbLIZ.append(Build.DISPLAY);
            String lowerCase = C2188811AlT.LIZIZ(sbLIZ).toLowerCase();
            return !C2093608Ic.LJ(lowerCase) ? lowerCase.toLowerCase() : LIZ;
        }
        String strLIZIZ2 = LIZIZ("ro.vivo.os.build.display.id");
        if (!C2093608Ic.LJ(strLIZIZ2) && strLIZIZ2.toLowerCase().contains("funtouch")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LIZIZ("ro.vivo.os.build.display.id"));
            sbLIZ2.append("_");
            sbLIZ2.append(LIZIZ("ro.vivo.product.version"));
            return C2188811AlT.LIZIZ(sbLIZ2).toLowerCase();
        }
        String str = Build.MANUFACTURER;
        if (!(!C2093608Ic.LJ(str) ? str.toLowerCase().contains("oppo") : false) && !LIZLLL()) {
            if (!C2162308dZ.LJII()) {
                return LIZ;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("miui_");
            sbLIZ3.append(LIZIZ("ro.miui.ui.version.name"));
            sbLIZ3.append("_");
            sbLIZ3.append(Build.VERSION.INCREMENTAL);
            return C2188811AlT.LIZIZ(sbLIZ3).toLowerCase();
        }
        if (!(C2093608Ic.LJ(str) ? false : str.toLowerCase().contains("oppo")) && !LIZLLL()) {
            return LIZ;
        }
        String strLIZIZ3 = LIZIZ("ro.build.version.opporom");
        if (TextUtils.isEmpty(strLIZIZ3)) {
            strLIZIZ3 = LIZIZ("ro.build.version.oplusrom");
        }
        if (TextUtils.isEmpty(strLIZIZ3)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("AOSP_ro.build.version.release_");
            sbLIZ4.append(Build.DISPLAY);
            return C2188811AlT.LIZIZ(sbLIZ4).toLowerCase();
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("coloros_");
        sbLIZ5.append(strLIZIZ3);
        sbLIZ5.append("_");
        sbLIZ5.append(Build.DISPLAY);
        return C2188811AlT.LIZIZ(sbLIZ5).toLowerCase();
    }

    public static boolean LIZLLL() {
        String str = Build.MANUFACTURER;
        if (C2093608Ic.LJ(str)) {
            return false;
        }
        return str.toLowerCase().contains("realme");
    }

    public static boolean LIZJ() {
        if (!C2162308dZ.LJII()) {
            return false;
        }
        try {
            return CastIntegerProtector.parseInt(LIZIZ("ro.miui.ui.version.name").substring(1)) >= 12;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static String LIZIZ(String str) {
        return LIZIZ.LIZ(str);
    }
}
