package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.adaptation.LowScreenNewStrategyAPI;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeABImpl;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.14LC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14LC {
    public static final boolean LJIIIZ;
    public static final int LJIIJ;
    public static final LowScreenNewStrategyAPI LJIIJJI = LowScreenOptimizeABImpl.LIZIZ();
    public static final boolean LJIIL;
    public static final int LJIILIIL;
    public static final int LJIILJJIL;
    public static int LJIILL;
    public static int LJIILLIIL;
    public static final MutableLiveData<Integer> LJIIZILJ;
    public static final MutableLiveData LJIJ;
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final C1604400rqw LJ = new C1604400rqw();
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public static int LIZIZ() {
        return C341940Daq.LIZ(LJIILIIL);
    }

    static {
        DisplayMetrics displayMetrics;
        boolean zLIZ;
        boolean zLIZ2;
        LJIIL = false;
        if (!C336620DHo.LIZ || (displayMetrics = C336620DHo.LIZIZ) == null) {
            C844470XAv.LIZ.getClass();
            Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(C844470XAv.LIZ(), "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusYo/a3Sb5FC8T1FJe35JUkMw3XlAjpq9hKhY=", null));
            displayMetrics = new DisplayMetrics();
            try {
                displayLLILZIL.getRealMetrics(displayMetrics);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJI(e);
            }
        }
        if (C336620DHo.LIZ && C336620DHo.LIZJ) {
            zLIZ = C336620DHo.LIZLLL;
            zLIZ2 = C336620DHo.LJFF;
            LJIIL = C336620DHo.LJ;
        } else {
            int iMax = (int) (Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels) / displayMetrics.density);
            LJIIIZ = iMax <= 640;
            zLIZ = C303940Bvk.LIZ();
            zLIZ2 = C303950Bvl.LIZ();
            LJIIL = LJIIJJI.LIZ(iMax);
        }
        if (zLIZ && !zLIZ2) {
            LJIIIZ = true;
            LJIIJ = 42;
        }
        boolean z = LJIIL;
        if (z) {
            LJIIJ = 42;
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        LJIILIIL = c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII() ? c19252910Tv.LIZLLL().LJIJI().LJJL().LJIIJJI() : (LJIIIZ || z) ? LJIIJ : C303810BvX.LIZ();
        LJIILJJIL = C341940Daq.LIZ(r0 - 47);
        C341940Daq.LIZ(8.0d);
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        LJIIZILJ = mutableLiveData;
        LJIJ = mutableLiveData;
    }

    public static int LIZJ(Context context) {
        if (!C2162308dZ.LIZLLL()) {
            return 0;
        }
        int[] iArr = {0, 0};
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((int[]) clsLoadClass.getMethod("getNotchSize", new Class[0]).invoke(clsLoadClass, new Object[0]))[1];
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                C2344809Gs.LJI(th);
                return iArr[1];
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return iArr[1];
            }
        }
    }

    public static int LIZLLL(Context context) {
        if (C2162308dZ.LIZLLL()) {
            return LIZJ(context);
        }
        return C497820Jfg.LIZJ(context);
    }

    public static int LJ(Activity activity) throws Throwable {
        int height;
        C844470XAv.LIZ.getClass();
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(C844470XAv.LIZ(), "window");
        int i = 0;
        if (windowManager == null) {
            return 0;
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusYo/a3Sb5FC8T1FJe35JUkMw3XlAjpq9hKhY=", null));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(displayLLILZIL, displayMetrics);
            int i2 = displayMetrics.heightPixels;
            if (activity != null && TextUtils.equals("OnePlus", Build.BRAND)) {
                View decorView = activity.getWindow().getDecorView();
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                height = rect.bottom;
            } else {
                height = displayLLILZIL.getHeight();
            }
            i = i2 - height;
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            return i;
        }
    }

    public static void LIZ(final ViewGroup viewGroup, final View view, final View view2, final boolean z, final boolean z2, final boolean z3, final boolean z4, final Activity activity, int i, final C14LF c14lf, boolean z5) throws Throwable {
        boolean z6;
        boolean z7;
        final int iLJ;
        boolean z8;
        if (activity == null) {
            return;
        }
        Display displayLLILZIL = C2204961BRm.LLILZIL(activity.getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOusYo/a3Sb5FC8T1FJe35JUkMw3XlAjpq9hKhY=", null));
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            displayLLILZIL.getRealMetrics(displayMetrics);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
        final boolean z9 = false;
        if (C2162308dZ.LJII() && C14KI.LJFF(activity)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (C2162308dZ.LJII() && Build.VERSION.SDK_INT >= 28 && !C14KI.LJFF(activity)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z6) {
            iLJ = 0;
        } else {
            iLJ = LJ(activity);
        }
        if (C815020Vy8.LIZIZ() && Build.VERSION.SDK_INT >= 28 && (Settings.Global.getInt(activity.getContentResolver(), "navigationbar_trigger_mode", 0) != 0 || Settings.Global.getInt(activity.getContentResolver(), "nav_fixed_mode", 0) != 0)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (C2162308dZ.LIZLLL() && Settings.Secure.getInt(activity.getContentResolver(), "display_notch_status", 0) == 0) {
            z9 = true;
        }
        final int iLIZJ = LIZJ(activity);
        final int iLIZJ2 = C497820Jfg.LIZJ(activity);
        if ((z9 && iLIZJ > 0) || z7 || z8) {
            iLJ -= iLIZJ2;
        }
        final int iLIZ = C418440Gaw.LIZ(Integer.valueOf(i));
        if (z5) {
            LJFF(viewGroup, view, view2, z, z2, z3, z4, activity, c14lf, displayMetrics, z9, iLIZJ, iLIZJ2, iLJ, iLIZ);
        } else {
            C15O7.LIZIZ(new Callable() { // from class: X.14LE
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ViewGroup viewGroup2 = viewGroup;
                    View view3 = view;
                    View view4 = view2;
                    boolean z10 = z;
                    boolean z11 = z2;
                    boolean z12 = z3;
                    boolean z13 = z4;
                    Activity activity2 = activity;
                    C14LF c14lf2 = c14lf;
                    DisplayMetrics displayMetrics2 = displayMetrics;
                    boolean z14 = z9;
                    int i2 = iLIZJ;
                    int i3 = iLIZJ2;
                    int i4 = iLJ;
                    int i5 = iLIZ;
                    C1C7U.LIZ("AdaptationManager@dcfd.doAdaptationV2$1L");
                    C14LC.LJFF(viewGroup2, view3, view4, z10, z11, z12, z13, activity2, c14lf2, displayMetrics2, z14, i2, i3, i4, i5);
                    C1C7U.LIZIZ("AdaptationManager@dcfd.doAdaptationV2$1L");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }

    public static void LJFF(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2, boolean z3, boolean z4, Activity activity, C14LF c14lf, DisplayMetrics displayMetrics, boolean z5, int i, int i2, int i3, int i4) {
        int iLIZJ;
        String str;
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        if (!activity.isFinishing() && viewGroup != null && view2 != null && view != null) {
            if (c14lf != null) {
                c14lf.Nb();
            }
            WindowInsets rootWindowInsets = viewGroup.getRootWindowInsets();
            if (rootWindowInsets != null) {
                Object objLIZIZ = C1961607mI.LIZIZ(WindowInsets.class, "getDisplayCutout", null, null, rootWindowInsets);
                C14LC c14lc = C309690CBz.LIZ;
                if (objLIZIZ != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c14lc.LJI = z9;
            }
            int iLIZIZ = displayMetrics.heightPixels;
            int iLIZJ2 = displayMetrics.widthPixels;
            if (C656570Pp9.LIZ()) {
                iLIZIZ = C656570Pp9.LIZIZ();
                iLIZJ2 = C656570Pp9.LIZJ();
            }
            C14LC c14lc2 = C309690CBz.LIZ;
            if (c14lc2.LJI && !C2162308dZ.LJII() && !C2162308dZ.LIZLLL()) {
                iLIZJ = C497820Jfg.LIZJ(activity);
            } else {
                iLIZJ = 0;
            }
            int i7 = iLIZIZ + iLIZJ;
            c14lc2.LIZJ = viewGroup.getHeight();
            c14lc2.LIZLLL = z5;
            c14lc2.LIZ = i3;
            double d = i7 - i3;
            double d2 = d - ((double) i2);
            double d3 = i4;
            double d4 = iLIZJ2;
            double d5 = (d2 - d3) / d4;
            double d6 = d2 / d4;
            double d7 = (d - d3) / d4;
            c14lc2.LIZIZ = i;
            if (i3 > 0) {
                if (d / d4 >= 1.7777777777777777d) {
                    if (d5 > 1.7777777777777777d) {
                        str = "D";
                        i6 = i4;
                        i5 = i2;
                    } else if (d6 >= 1.7777777777777777d || d7 >= 1.7777777777777777d) {
                        double d8 = d7 - 1.7777777777777777d;
                        if (d8 > 0.0d) {
                            double d9 = d6 - 1.7777777777777777d;
                            if (d9 < 0.0d || d8 < d9) {
                                str = "E";
                                i6 = i4;
                                i5 = 0;
                            }
                        }
                        str = "F";
                        i5 = i2;
                        i6 = 0;
                    }
                }
                str = "G";
                i5 = 0;
                i6 = 0;
            } else if (d5 >= 1.7777777777777777d) {
                str = "A";
                i6 = i4;
                i5 = i2;
            } else if (d6 < 1.7777777777777777d && d7 < 1.7777777777777777d) {
                str = "Default";
                i5 = 0;
                i6 = 0;
            } else {
                double d10 = d7 - 1.7777777777777777d;
                if (d10 > 0.0d) {
                    double d11 = d6 - 1.7777777777777777d;
                    if (d11 < 0.0d || d10 < d11) {
                        str = "B";
                        i6 = i4;
                        i5 = 0;
                    }
                }
                str = "C";
                i5 = i2;
                i6 = 0;
            }
            if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLLLIIIILLL()) {
                i6 = i4;
            }
            if (z && i5 != 0) {
                i5 = 0;
            } else if (z3) {
                i5 = i2;
            }
            if (z2) {
                i6 = 0;
            } else if (z4) {
                i6 = i4;
            }
            LJIILL = i5;
            LJIILLIIL = i6;
            LJIIZILJ.postValue(Integer.valueOf(i6));
            if (view.getVisibility() == 8) {
                i5 = 0;
            }
            if (view2.getVisibility() == 8) {
                i6 = 0;
            }
            if (i5 != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            c14lc2.LJII = z6;
            if (i6 != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            c14lc2.LJIIIIZZ = z7;
            if (i6 != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            c14lc2.LJFF = z8;
            int i8 = c14lc2.LIZJ;
            if (i8 <= 0) {
                c14lc2.LIZJ = (((int) d) - i5) - i6;
            } else {
                int i9 = (((int) d) - i5) - i6;
                if (i9 != i8) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("realHeight:");
                    sbLIZ.append(i9);
                    sbLIZ.append(" vph:");
                    sbLIZ.append(c14lc2.LIZJ);
                    C2344809Gs.LIZLLL(6, "AdaptationManager", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            c14lc2.LJ.getClass();
            C1604400rqw c1604400rqw = c14lc2.LJ;
            c1604400rqw.LIZ = i2;
            c1604400rqw.LIZIZ = i6;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (layoutParams.height != i5) {
                layoutParams.height = i5;
                C786410Ut5.W5(view, layoutParams);
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
            if (layoutParams2.height != i6) {
                layoutParams2.height = i6;
                C786410Ut5.W5(view2, layoutParams2);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("doAdaptationV2: , realDisplayMetrics.heightPixels:");
            sbLIZ2.append(displayMetrics.heightPixels);
            sbLIZ2.append(", isAndroidPHasNotch():");
            sbLIZ2.append(c14lc2.LJI);
            sbLIZ2.append(", statusBarHeight:");
            sbLIZ2.append(i2);
            sbLIZ2.append(", realScreenHeight:");
            sbLIZ2.append(i7);
            sbLIZ2.append(", virtualBarHeight:");
            sbLIZ2.append(i3);
            sbLIZ2.append(", appNavHeight:");
            sbLIZ2.append(i4);
            sbLIZ2.append(", screenHeightWithoutVirtualBar:");
            sbLIZ2.append(d);
            sbLIZ2.append(", ViewPagerHeight:");
            sbLIZ2.append(c14lc2.LIZJ);
            sbLIZ2.append(", topSpaceHeight:");
            sbLIZ2.append(i5);
            sbLIZ2.append(", bottomSpaceHeight:");
            sbLIZ2.append(i6);
            sbLIZ2.append(", desiredTopSpaceHeight:");
            sbLIZ2.append(LJIILL);
            sbLIZ2.append(", desiredBottomSpaceHeight:");
            sbLIZ2.append(LJIILLIIL);
            sbLIZ2.append(", showTopCorner:");
            sbLIZ2.append(c14lc2.LJII);
            sbLIZ2.append(", showBottomCorner:");
            sbLIZ2.append(c14lc2.LJIIIIZZ);
            sbLIZ2.append(", plan");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                Object tag = viewGroup.getChildAt(i10).getTag(R.id.hu_);
                if (tag instanceof C0RGM) {
                    ((C0RGM) tag).LLI();
                }
            }
            if (c14lf != null) {
                c14lf.y();
            }
        }
    }
}
