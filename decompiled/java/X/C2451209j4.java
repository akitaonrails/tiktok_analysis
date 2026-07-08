package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09j4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2451209j4 {
    public static final int LIZ = Build.VERSION.SDK_INT;

    public static boolean LIZIZ() {
        if ((TextUtils.isEmpty(LIZ("ro.build.version.emui")) ^ true ? LIZ("ro.build.version.emui") : "").contains("EmotionUI_3.0")) {
            return true;
        }
        String strLIZ = TextUtils.isEmpty(LIZ("ro.build.version.emui")) ^ true ? LIZ("ro.build.version.emui") : "";
        return "EmotionUI 3".equals(strLIZ) || strLIZ.contains("EmotionUI_3.1");
    }

    public static boolean LIZJ() {
        String strLIZ = LIZ("ro.build.display.id").toLowerCase().contains("flyme") ? LIZ("ro.build.display.id") : "";
        if (!strLIZ.isEmpty()) {
            try {
                return (strLIZ.toLowerCase().contains("os") ? CastIntegerProtector.parseInt(strLIZ.substring(9, 10)) : CastIntegerProtector.parseInt(strLIZ.substring(6, 7))) >= 4;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZLLL() {
        String strLIZ = TextUtils.isEmpty(LIZ("ro.miui.ui.version.name")) ^ true ? LIZ("ro.miui.ui.version.name") : "";
        boolean z = 0;
        int iIntValue = 0;
        if (!strLIZ.isEmpty()) {
            try {
                iIntValue = CastIntegerProtector.valueOf(strLIZ.substring(1)).intValue();
                return iIntValue >= 6;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                z = iIntValue;
            }
        }
        return z;
    }

    public static String LIZ(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
