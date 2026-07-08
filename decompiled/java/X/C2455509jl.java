package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09jl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2455509jl {
    static {
        C0VI8.LIZIZ("PackageManagerHelper");
    }

    public static void LIZ(Context context, Class<?> cls, boolean z) {
        int i;
        Object obj;
        String str = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                obj = "enabled";
            } else {
                obj = "disabled";
            }
            objArr[1] = obj;
            C786410Ut5.j4("%s %s", objArr);
            c0vi8LIZ.getClass();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = "disabled";
            }
            objArr2[1] = str;
            C786410Ut5.j4("%s could not be %s", objArr2);
            c0vi8LIZ2.getClass();
        }
    }
}
