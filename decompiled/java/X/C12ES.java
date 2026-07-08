package X;

import android.content.Context;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Toast;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12ES, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12ES {
    public static String LIZ = "";
    public static int LIZIZ = -1;

    public static boolean LJIIL() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void LIZ(View view) {
        if (view != null && view.getAnimation() != null) {
            view.clearAnimation();
        }
    }

    public static void LIZIZ(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            try {
                C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logger.throwException(e);
            }
        }
    }

    public static int LJII(Context context) {
        if (LIZIZ == -1 && context != null) {
            LIZIZ = C786410Ut5.N3(context).getResources().getDisplayMetrics().densityDpi;
        }
        return LIZIZ;
    }

    public static int LJIIIIZZ(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public static String LJIIIZ(Context context) {
        if (C2093608Ic.LJ(LIZ) && context != null) {
            int iLJIIJ = LJIIJ(context);
            int iLJIIIIZZ = LJIIIIZZ(context);
            if (iLJIIJ > 0 && iLJIIIIZZ > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(iLJIIJ);
                sbLIZ.append("*");
                sbLIZ.append(iLJIIIIZZ);
                LIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return LIZ;
    }

    public static int LJIIJ(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static int LJIIJJI(Context context) {
        int iN3;
        if (context == null || (iN3 = C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(iN3);
    }

    public static boolean LJIILIIL(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static float LIZJ(float f, Context context) {
        if (context != null) {
            return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
        }
        return 0.0f;
    }

    public static void LIZLLL(int i, Context context) {
        LJ(context, 0, context.getString(i));
    }

    public static void LJI(int i, Context context) {
        LJ(context, R.drawable.ec6, context.getString(i));
    }

    public static int LJIILJJIL(float f, Context context) {
        if (context != null) {
            return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    public static void LJIILL(int i, View view) {
        if (view != null && view.getVisibility() != i) {
            if (i == 0 || i == 8 || i == 4) {
                C786410Ut5.LJLLLLLL(i, view);
            }
        }
    }

    public static float LJIILLIIL(float f, Context context) {
        if (context != null) {
            return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static void LJIJ(View view, int i) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.leftMargin == -3 && marginLayoutParams.topMargin == -3 && marginLayoutParams.rightMargin == -3 && marginLayoutParams.bottomMargin == i) {
                return;
            }
            if (i != -3) {
                marginLayoutParams.bottomMargin = i;
            }
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    public static void LJ(Context context, int i, String str) {
        LJFF(context, i, 0, 17, str);
    }

    public static void LJIIZILJ(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            if (layoutParams.width == i && layoutParams.height == i2) {
                return;
            }
            if (i != -3) {
                layoutParams.width = i;
            }
            if (i2 != -3) {
                layoutParams.height = i2;
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(final Context context, final int i, final int i2, final int i3, final String str) {
        if (context != 0 && !C2093608Ic.LJ(str)) {
            if (!LJIIL()) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.036H
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("UIUtils@9a06.displayToastInternal$1");
                        try {
                            C12ES.LJFF(context, i, i2, i3, str);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("UIUtils@9a06.displayToastInternal$1");
                    }
                });
                return;
            }
            if (context instanceof C12ET) {
                if (i2 == 1) {
                    ((C12ET) context).showCustomLongToast(i, str);
                    return;
                }
                C12ET c12et = (C12ET) context;
                if (i2 == 0) {
                    i2 = 2000;
                }
                c12et.showCustomToast(i, str, i2, i3);
                return;
            }
            try {
                Toast toastMakeText = Toast.makeText(context, str, i2);
                if (toastMakeText == null) {
                    return;
                }
                toastMakeText.setGravity(i3, 0, 0);
                C786410Ut5.re(toastMakeText);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logger.throwException(e);
            }
        }
    }
}
