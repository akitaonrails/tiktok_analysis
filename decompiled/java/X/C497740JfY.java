package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.0JfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497740JfY {
    public static int LIZ = 1;
    public static final DisplayMetrics LIZIZ = Resources.getSystem().getDisplayMetrics();
    public static int LIZJ = 0;
    public static volatile int LIZLLL = 0;
    public static boolean LJ = false;
    public static String LJFF = null;

    public static String LJ() {
        String str = LJFF;
        if (str != null) {
            return str;
        }
        String lowerCase = Build.BRAND.toLowerCase(Locale.ROOT);
        LJFF = lowerCase;
        return lowerCase;
    }

    public static Context LJII() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.context();
        }
        return null;
    }

    public static Context LJIIIIZZ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return new ContextThemeWrapper(iHostAppContext.context(), C011Z.LIZ.LJIIIZ());
        }
        return null;
    }

    public static int LJIJ() {
        int iN3;
        if (LIZJ == 0) {
            Context contextLJII = LJII();
            int dimensionPixelSize = 0;
            if (contextLJII != null && (iN3 = C786410Ut5.n3(contextLJII.getResources(), "status_bar_height", "dimen", "android")) > 0) {
                dimensionPixelSize = contextLJII.getResources().getDimensionPixelSize(iN3);
            }
            LIZJ = dimensionPixelSize;
        }
        return LIZJ;
    }

    public static Resources LJIILJJIL() {
        Context contextLJII = LJII();
        if (contextLJII == null) {
            return null;
        }
        return contextLJII.getResources();
    }

    public static int LJIILL() {
        return LJIILLIIL() - LJIJ();
    }

    public static int LJIILLIIL() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int LJIIZILJ() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static boolean LJIL() {
        return (LJII() == null || LJII().getResources() == null || LJII().getResources().getConfiguration() == null) ? LIZ == 1 : LIZ == 1 || LJII().getResources().getConfiguration().orientation == 1;
    }

    public static boolean LJJ() {
        if (LJII() == null) {
            return false;
        }
        if (LIZLLL == 0) {
            LJ = (LJII().getApplicationInfo().flags & 4194304) == 4194304;
            LIZLLL = 1;
        }
        return LJ && (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 || (LJIILJJIL() != null && C786410Ut5.t2(LJIILJJIL().getConfiguration().locale).equals("ar")));
    }

    public static int LIZ(float f) {
        return (int) LIZIZ(f);
    }

    public static float LIZIZ(float f) {
        return (f * LIZIZ.density) + 0.5f;
    }

    public static int LIZJ(int i) {
        return LIZLLL(i, LJII());
    }

    public static int LJFF(int i) {
        Context contextLJII = LJII();
        if (contextLJII != null && contextLJII.getResources() != null) {
            return contextLJII.getResources().getColor(i);
        }
        return 0;
    }

    public static int LJIIIZ(int i) {
        Context contextLJII = LJII();
        if (contextLJII != null && contextLJII.getResources() != null) {
            return (int) contextLJII.getResources().getDimension(i);
        }
        return 0;
    }

    public static Drawable LJIIJ(int i) {
        Context contextLJII;
        Drawable drawable = null;
        if (C1119850fFP.LJJIII) {
            contextLJII = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity();
        } else {
            contextLJII = null;
        }
        if (contextLJII == null) {
            contextLJII = LJII();
        }
        if (contextLJII != null) {
            try {
                if (contextLJII.getResources() != null) {
                    drawable = contextLJII.getResources().getDrawable(i);
                    return drawable;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return drawable;
    }

    public static DisplayMetrics LJIILIIL(C19EG c19eg) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (c19eg == null) {
            return displayMetrics;
        }
        C2204961BRm.LLILZIL(c19eg.getWindowManager(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYH5R57mRFKD6uIga/NEGIoNoo", null)).getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String LJIJI(int i) {
        Context contextLJII = LJII();
        if (contextLJII == null) {
            return null;
        }
        return contextLJII.getString(i);
    }

    public static boolean LJIJJLI(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof Activity) {
            if (((Activity) context).isDestroyed()) {
                return false;
            }
            return !r3.isFinishing();
        }
        if ((context instanceof Application) || !(context instanceof ContextWrapper)) {
            return true;
        }
        return LJIJJLI(((ContextWrapper) context).getBaseContext());
    }

    public static float LJJI(int i) {
        return i / LIZIZ.density;
    }

    public static float LJJIFFI(float f) {
        return TypedValue.applyDimension(2, f, LIZIZ);
    }

    public static int LIZLLL(int i, Context context) {
        if (context == null) {
            return 0;
        }
        return C20736316Cj.LIZIZ(i, context);
    }

    public static int LJI(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            if (!str.startsWith("#")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("#");
                sbLIZ.append(str);
                str = C2188811AlT.LIZIZ(sbLIZ);
            }
            return Color.parseColor(str);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    public static String LJIIJJI(int i, int i2) {
        Context contextLJII = LJII();
        String quantityString = null;
        if (contextLJII == null) {
            return null;
        }
        try {
            quantityString = contextLJII.getResources().getQuantityString(i, i2);
            return quantityString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return quantityString;
        }
    }

    public static String LJIJJ(int i, Object... objArr) {
        Context contextLJII = LJII();
        if (contextLJII == null) {
            return null;
        }
        return contextLJII.getString(i, objArr);
    }

    public static String LJIIL(int i, int i2, Object... objArr) {
        Context contextLJII = LJII();
        String quantityString = null;
        if (contextLJII == null) {
            return null;
        }
        try {
            quantityString = contextLJII.getResources().getQuantityString(i, i2, objArr);
            return quantityString;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return quantityString;
        }
    }
}
