package X;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xpV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834150xpV {
    public static String LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            return str.replace((char) 65532, ' ');
        }
        return str;
    }

    public static LayoutInflater LIZJ(LayoutInflater layoutInflater) {
        return layoutInflater.cloneInContext(LJII(layoutInflater.getContext()));
    }

    public static LayoutInflater LJ(LayoutInflater layoutInflater) {
        return layoutInflater.cloneInContext(LJIIIIZZ(layoutInflater.getContext()));
    }

    public static boolean LJFF(Context context) {
        boolean z;
        TypedValue typedValueLIZ = C20736316Cj.LIZ();
        context.getTheme().resolveAttribute(R.attr.es5, typedValueLIZ, true);
        if (typedValueLIZ.type == 18 && typedValueLIZ.data != 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static boolean LJI(Context context) {
        return C011Z.LIZ.LJIJJ(context);
    }

    public static Context LJII(Context context) {
        return new ContextThemeWrapper(context, C011Z.LIZ.LJ());
    }

    public static Context LJIIIIZZ(Context context) {
        return new ContextThemeWrapper(context, C011Z.LIZ.LJIIIZ());
    }

    public static Context LJIIIZ(Context context) {
        return new ContextThemeWrapper(context, C011Z.LIZ.LJIILJJIL(context));
    }

    public static Context LJIIJJI(Context context) {
        if (context == null) {
            return context;
        }
        return new ContextThemeWrapper(context, C011Z.LIZ.LJIILJJIL(context));
    }

    public static void LIZ(Context context, boolean z) {
        int iLJIIIZ;
        if (context != null) {
            C1119850fFP c1119850fFP = C011Z.LIZ;
            if (c1119850fFP.LJIJ(context)) {
                if (!z) {
                    boolean zLJI = LJI(context);
                    boolean zLJIIZILJ = c1119850fFP.LJIIZILJ(context);
                    if (zLJI) {
                        if (zLJIIZILJ) {
                            iLJIIIZ = c1119850fFP.LJ();
                        } else {
                            iLJIIIZ = R.style.uy;
                        }
                    } else if (!zLJIIZILJ) {
                        iLJIIIZ = c1119850fFP.LJIIIZ();
                    } else {
                        iLJIIIZ = R.style.v0;
                    }
                } else {
                    iLJIIIZ = c1119850fFP.LJ();
                }
            } else {
                iLJIIIZ = c1119850fFP.LJIIIZ();
            }
            context.getTheme().applyStyle(iLJIIIZ, false);
        }
    }

    public static LayoutInflater LIZLLL(LayoutInflater layoutInflater, int i) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIJ(View view, boolean z) {
        if (view == 0) {
            return;
        }
        if (view instanceof InterfaceC1834170xpX) {
            ((InterfaceC1834160xpW) view).setAllowClickWhenDisabledCompat(z);
        } else if (Build.VERSION.SDK_INT >= 31) {
            view.setAllowClickWhenDisabled(z);
        } else {
            if (!(view instanceof InterfaceC1834160xpW)) {
                return;
            }
            ((InterfaceC1834160xpW) view).setAllowClickWhenDisabledCompat(z);
        }
    }
}
