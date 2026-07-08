package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.08Be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2075608Be {
    public static volatile Boolean LIZ;
    public static volatile Boolean LIZIZ;

    public static boolean LIZ(Context context) {
        C19EG c19egLIZIZ;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || Build.VERSION.SDK_INT < 28) {
            return false;
        }
        View decorView = c19egLIZIZ.getWindow().getDecorView();
        try {
            Object objInvoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
            Object objInvoke2 = objInvoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(objInvoke, new Object[0]);
            List list = (List) objInvoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(objInvoke2, new Object[0]);
            if (list == null) {
                return false;
            }
            if (list.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZIZ(Context context) {
        boolean z;
        String string;
        try {
            if (LIZIZ != null) {
                return LIZIZ.booleanValue();
            }
            Resources resources = context.getResources();
            int iN3 = C786410Ut5.n3(resources, "config_mainBuiltInDisplayCutout", "string", "android");
            if (iN3 > 0 && (string = resources.getString(iN3)) != null && !TextUtils.isEmpty(string)) {
                z = true;
            } else {
                z = false;
            }
            LIZIZ = Boolean.valueOf(z);
            return LIZIZ.booleanValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ = Boolean.FALSE;
            return false;
        }
    }

    public static boolean LIZJ(Context context) {
        boolean z = false;
        if (context instanceof Activity) {
            if (LIZ == null) {
                if (LIZ(context) || new C2075208Ba(context).LIZ || LIZIZ(context)) {
                    z = true;
                }
                LIZ = Boolean.valueOf(z);
            }
            return LIZ.booleanValue();
        }
        if (!LIZ(context) && !new C2075208Ba(context).LIZ && !LIZIZ(context)) {
            return false;
        }
        return true;
    }
}
