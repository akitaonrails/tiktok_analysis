package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.bytedance.keva.Keva;
import java.util.List;

/* JADX INFO: renamed from: X.0uHJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697630uHJ {
    public static int LIZ;
    public static boolean LIZIZ;
    public static float LIZJ = -1.0f;
    public static int LIZLLL = -1;
    public static int LJ = -1;
    public static int LJFF = -1;
    public static final C01GW LJI = C452501pT.LIZIZ(new C1697640uHK());

    public static float LIZ() {
        int i = LIZ;
        if (i == 0) {
            return 1.0f;
        }
        if (i != 1) {
            return (i == 2 || i == 3) ? 1.1f : 1.0f;
        }
        return 1.05f;
    }

    public static float LIZIZ() {
        int i = LIZ;
        if (i == 0) {
            return 1.0f;
        }
        if (i == 1) {
            return 1.05f;
        }
        if (i != 2) {
            return i == 3 ? 1.18f : 1.0f;
        }
        return 1.1f;
    }

    public static void LIZJ(Context context) {
        LIZLLL(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        if (LIZJ < 0.0f) {
            LIZJ = displayMetrics.density;
            LIZLLL = displayMetrics.densityDpi;
            LJ = configuration.screenWidthDp;
            LJFF = configuration.screenHeightDp;
        }
        int iLIZ = (int) (LJ / LIZ());
        float f = LJ / iLIZ;
        float f2 = LIZJ * f;
        float f3 = configuration.fontScale * f2;
        int i = (int) (LIZLLL * f);
        List<Resources> listLJIILJJIL = C1697810uHb.LJIILJJIL(Resources.getSystem());
        Context contextN3 = C786410Ut5.N3(context);
        if (contextN3 != null) {
            listLJIILJJIL.add(contextN3.getResources());
        }
        for (Resources resources2 : listLJIILJJIL) {
            resources2.getDisplayMetrics().density = f2;
            resources2.getDisplayMetrics().scaledDensity = f3;
            resources2.getDisplayMetrics().densityDpi = i;
            resources2.getConfiguration().screenWidthDp = iLIZ;
            resources2.getConfiguration().screenHeightDp = (int) (configuration.screenHeightDp / f);
            resources2.getConfiguration().smallestScreenWidthDp = configuration.screenWidthDp;
            resources2.updateConfiguration(resources2.getConfiguration(), resources2.getDisplayMetrics());
        }
    }

    public static void LIZLLL(Context context) {
        if (LIZIZ) {
            return;
        }
        C01GW c01gw = LJI;
        int i = ((Keva) c01gw.getValue()).getInt("dynamic_font_mode", 0);
        float f = context.getResources().getConfiguration().fontScale;
        if (f > 1.0f) {
            if (f <= 1.3f) {
                if (((Number) C283020B7k.LIZ.getValue()).intValue() != 0) {
                    ((Keva) c01gw.getValue()).storeInt("dynamic_font_mode", 1);
                    i = 1;
                }
            } else if (f <= 1.6f) {
                if (((Number) C283030B7l.LIZ.getValue()).intValue() != 0) {
                    i = 2;
                    ((Keva) c01gw.getValue()).storeInt("dynamic_font_mode", 2);
                }
            } else if (((Number) C283010B7j.LIZ.getValue()).intValue() != 0) {
                i = 3;
                ((Keva) c01gw.getValue()).storeInt("dynamic_font_mode", 3);
            }
        }
        LIZ = i;
        LIZIZ = true;
    }

    public static void LJ(Activity activity) {
        int iMin;
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        float f = LIZJ;
        if (f <= 0.0f) {
            return;
        }
        if (configuration.orientation == 2) {
            iMin = Math.max(i, i2);
        } else {
            iMin = Math.min(i, i2);
        }
        float f2 = iMin / f;
        int iLIZ = (int) (f2 / LIZ());
        float f3 = f2 / iLIZ;
        float f4 = f * f3;
        float f5 = configuration.fontScale * f4;
        int i3 = (int) (LIZLLL * f3);
        List<Resources> listLJIILJJIL = C1697810uHb.LJIILJJIL(Resources.getSystem(), activity.getResources());
        Context contextL3 = C786410Ut5.L3(activity);
        if (contextL3 != null && contextL3.getResources() != activity.getResources()) {
            listLJIILJJIL.add(contextL3.getResources());
        }
        for (Resources resources : listLJIILJJIL) {
            resources.getDisplayMetrics().density = f4;
            resources.getDisplayMetrics().scaledDensity = f5;
            resources.getDisplayMetrics().densityDpi = i3;
            resources.getConfiguration().screenWidthDp = iLIZ;
            resources.getConfiguration().screenHeightDp = (int) (i2 / f4);
            resources.getConfiguration().smallestScreenWidthDp = (int) (Math.min(i, i2) / f4);
            resources.getConfiguration().densityDpi = i3;
            resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
        }
    }
}
