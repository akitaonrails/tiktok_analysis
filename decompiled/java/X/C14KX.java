package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: renamed from: X.14KX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14KX {
    public static Boolean LIZ;
    public static List<String> LIZIZ;

    public static Activity LIZ(View view) {
        while (view != null) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                return null;
            }
        }
        return null;
    }

    public static int LIZIZ(View view) {
        DisplayCutout displayCutout;
        Context context = view.getContext();
        if (context.getResources().getConfiguration().orientation != 1) {
            return 0;
        }
        if (LIZLLL("oppo")) {
            return C2212301BiG.LIZIZ(context);
        }
        if (Build.VERSION.SDK_INT >= 28 && (context instanceof Activity) && view.isAttachedToWindow() && (displayCutout = view.getRootWindowInsets().getDisplayCutout()) != null) {
            return displayCutout.getSafeInsetTop();
        }
        return C2212301BiG.LIZIZ(context);
    }

    public static boolean LIZJ(View view) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        if (!view.isAttachedToWindow() || (rootWindowInsets = view.getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null || displayCutout.getSafeInsetTop() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(String str) {
        String lowerCase = Build.BRAND.toLowerCase();
        if (!TextUtils.isEmpty(lowerCase)) {
            return lowerCase.equals(str);
        }
        return false;
    }

    public static boolean LJ(View view) {
        Activity activityLIZ = LIZ(view);
        boolean z = false;
        if (activityLIZ == null) {
            return false;
        }
        Window window = activityLIZ.getWindow();
        if ((window.getAttributes().flags & 1024) == 1024) {
            z = true;
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        if ((systemUiVisibility & 4) == 4 && (systemUiVisibility & 1024) == 1024) {
            return true;
        }
        return z;
    }

    public static boolean LJFF(View view) {
        Activity activityLIZ = LIZ(view);
        if (activityLIZ != null) {
            int systemUiVisibility = activityLIZ.getWindow().getDecorView().getSystemUiVisibility();
            int i = activityLIZ.getWindow().getAttributes().flags;
            if ((systemUiVisibility & 1024) != 0 && (systemUiVisibility & 4) == 0 && (i & 1024) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
