package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.08dh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2163108dh {
    public static final Object LIZ = new Object();
    public static int LIZIZ = 0;

    public static String LIZ(Context context) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        synchronized (LIZ) {
            try {
                if (LIZIZ == 0) {
                    try {
                        LIZIZ = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionCode;
                    } catch (PackageManager.NameNotFoundException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                i = LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        sb.append(i);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append("; Cronet/TTNetVersion:3a9f3ddf 2026-06-25 QuicVersion:c3b23989 2026-06-25)");
        return sb.toString();
    }
}
