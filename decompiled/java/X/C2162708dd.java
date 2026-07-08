package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2162708dd {
    public static final C0XCF LIZ = new AbstractC824140WUq<Boolean>() { // from class: X.0XCF
        @Override // X.AbstractC824140WUq
        public final Boolean LIZ(Object[] objArr) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                return Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                InterfaceC844900XCm interfaceC844900XCm = C844830XCf.LIZIZ;
                if (interfaceC844900XCm != null) {
                    interfaceC844900XCm.LIZLLL("isn't harmony", null);
                }
                return Boolean.FALSE;
            }
        }
    };

    public static boolean LJFF() {
        try {
            return Class.forName("miui.os.Build").getName().length() > 0;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static String LIZ() {
        String strLIZIZ = LIZIZ("persist.pxr.product.forcename");
        if (TextUtils.isEmpty(strLIZIZ)) {
            strLIZIZ = LIZIZ("pxr.vendorhw.product.name");
        }
        return TextUtils.isEmpty(strLIZIZ) ? Build.PRODUCT : strLIZIZ;
    }

    public static boolean LIZLLL() {
        if ("oppo".equalsIgnoreCase(Build.MANUFACTURER)) {
            return true;
        }
        String str = Build.BRAND;
        return "oppo".equalsIgnoreCase(str) || "realme".equalsIgnoreCase(str);
    }

    public static boolean LJ() {
        String str = Build.DISPLAY;
        return (!TextUtils.isEmpty(str) && str.contains("Flyme")) || "flyme".equals(Build.USER);
    }

    public static String LIZIZ(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
