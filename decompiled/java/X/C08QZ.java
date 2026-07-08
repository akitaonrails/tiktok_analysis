package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: X.08QZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08QZ {
    public static final /* synthetic */ int LIZ = 0;

    static {
        UriProtector.parse("*");
        UriProtector.parse("");
    }

    public static PackageInfo LIZIZ() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static PackageInfo LIZ(Context context) {
        PackageInfo packageInfoLIZIZ;
        String str;
        PackageInfo packageInfoY3 = null;
        if (Build.VERSION.SDK_INT >= 26) {
            packageInfoLIZIZ = C800500Vai.LIZ();
        } else {
            try {
                packageInfoLIZIZ = LIZIZ();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
                packageInfoLIZIZ = null;
            }
        }
        if (packageInfoLIZIZ != null) {
            return packageInfoLIZIZ;
        }
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                str = (String) Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            } else {
                str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            }
            if (str != null) {
                try {
                    packageInfoY3 = C786410Ut5.Y3(context.getPackageManager(), str, 0);
                    return packageInfoY3;
                } catch (PackageManager.NameNotFoundException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            return packageInfoY3;
        } catch (ClassNotFoundException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return null;
        } catch (IllegalAccessException e4) {
            TryCatchGuardChecker.doCheck(e4);
            return null;
        } catch (NoSuchMethodException e5) {
            TryCatchGuardChecker.doCheck(e5);
            return null;
        } catch (InvocationTargetException e6) {
            TryCatchGuardChecker.doCheck(e6);
            return null;
        }
    }
}
