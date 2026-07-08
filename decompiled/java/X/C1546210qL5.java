package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0qL5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546210qL5 {
    public static final C1546210qL5 LIZ = new C1546210qL5();
    public static int LIZIZ;
    public static int LIZJ;
    public static int LIZLLL;

    public static String LIZIZ() {
        Locale locale = Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C786410Ut5.t2(locale));
            sb.append('-');
            LruCache<Integer, String> lruCache = C0SRQ.LIZ;
            sb.append(C837920Wty.LIZIZ(locale));
            return sb.toString();
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C786410Ut5.t2(locale) + '-' + C2204961BRm.g0(locale, new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNlU7CcrMsIdGXRfSjwuXXTAg==", null));
        }
    }

    public static float LIZ(Number number) {
        return TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    public static int LIZJ(Context context) {
        try {
            if (LJ(context)[1] > 0) {
                return LJ(context)[1];
            }
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public static int[] LJ(Context context) {
        C1490740otc.LIZIZ(C1490740otc.LIZ, "_________getScreenSize_________", null, "getScreenSize", 2);
        if (context == null) {
            return new int[]{-1, -1};
        }
        try {
            Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNlU7CcrMsIdGXRfSjwuXXTAg==", null));
            Point point = new Point();
            if (displayLLILZIL == null) {
                return new int[]{-1, -1};
            }
            displayLLILZIL.getRealSize(point);
            return new int[]{point.x, point.y};
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1490740otc c1490740otc = C1490740otc.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            c1490740otc.LIZ(message, EnumC1490770otf.E, "DevicesUtil");
            return new int[]{-1, -1};
        }
    }

    public static int LJFF(Context context) {
        int i = 0;
        try {
            if (LJ(context)[0] > 0) {
                i = LJ(context)[0];
                return i;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return i;
    }

    public static int LJII(Context context) {
        int i = LIZLLL;
        if (i > 0) {
            return i;
        }
        int iLIZIZ = 0;
        try {
            int iN3 = C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android");
            if (iN3 > 0) {
                iLIZIZ = context.getResources().getDimensionPixelSize(iN3);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (iLIZIZ == 0) {
            iLIZIZ = (int) C1041450dCx.LIZIZ(25.0f, context);
        }
        LIZLLL = iLIZIZ;
        return iLIZIZ;
    }

    public static boolean LJIIIIZZ(Context context) {
        PowerManager powerManager;
        try {
            Object objH2 = C786410Ut5.H2(context, "power");
            if ((objH2 instanceof PowerManager) && (powerManager = (PowerManager) objH2) != null) {
                return powerManager.isPowerSaveMode();
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean LJIIIZ(Context context) {
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJ(Context context) {
        int rotation = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEgAjS8/YVFkiQFyIfx2bdaMzSphZ1vNlU7CcrMsIdGXRfSjwuXXTAg==", null)).getRotation();
        if (rotation != 0 && rotation != 2) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJJI(Context context) {
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1490740otc c1490740otc = C1490740otc.LIZ;
            String message = th.getMessage();
            if (message == null) {
                message = "get talk back status failed";
            }
            c1490740otc.LIZ(message, EnumC1490770otf.E, "DevicesUtil");
        }
        if (Settings.Secure.getInt(context.getContentResolver(), "touch_exploration_enabled", 0) == 0) {
            return false;
        }
        return true;
    }

    public static int LIZLLL(Context context, boolean z) {
        if (!z || LIZIZ == 0) {
            LIZIZ = LIZJ(context);
        }
        return LIZIZ;
    }

    public static int LJI(Context context, boolean z) {
        if (!z || LIZJ == 0) {
            LIZJ = LJFF(context);
        }
        return LIZJ;
    }

    public static int LJIIL(double d, Context context) {
        return (int) ((d / ((double) context.getResources().getDisplayMetrics().density)) + ((double) 0.5f));
    }

    @InterfaceC1294060jmO
    public static int LJIILIIL(int i, Activity activity) {
        try {
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(new Rect());
            if (LJIIL(r2.top, activity) >= i) {
                return LJIIL(r2.height(), activity);
            }
            return LJIIL(r2.height(), activity) - i;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1490740otc c1490740otc = C1490740otc.LIZ;
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            c1490740otc.LIZ(message, EnumC1490770otf.E, "DevicesUtil");
            return activity.getResources().getDisplayMetrics().heightPixels;
        }
    }
}
