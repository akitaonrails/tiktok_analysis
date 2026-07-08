package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0dbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056680dbW {
    public static int LJIIIZ;
    public static int LJIIJ;
    public static int LJIIJJI;
    public static int LJIIL;
    public static int LJIILL;
    public static final C1056680dbW LIZ = new C1056680dbW();
    public static final C01GW LIZIZ = C292401Bi.LIZ(AFwS189S0000000_3.get$arr$(801));
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
    public static int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static int LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
    public static int LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static int LJIILIIL = C497740JfY.LJIIZILJ();
    public static int LJIILJJIL = C497740JfY.LJIILLIIL();
    public static int LJIILLIIL = -1;

    public static final int LIZIZ(C421460Gfo c421460Gfo, C421460Gfo c421460Gfo2) {
        return LJIILJJIL - (((((((((((((LJIIJJI + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(58.0d)))) + LJFF) + LJI) + c421460Gfo.getMeasuredHeight()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) + c421460Gfo2.getMeasuredHeight()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) + LJIIIIZZ) + LJII) + LJI) + LIZLLL) + LJIIL) + LJ);
    }

    public static void LIZJ(View view, C421460Gfo c421460Gfo, View view2, View view3, C197039127h c197039127h) {
        int iLIZIZ;
        int measuredWidth;
        int measuredWidth2;
        TextView textView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = LJIIJJI + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(58.0d)));
            C786410Ut5.W5(view, marginLayoutParams);
            ViewGroup.LayoutParams layoutParams2 = c421460Gfo.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = LJI + LJFF + ((LJIILL - LJIIJ) / 2);
                C786410Ut5.W5(c421460Gfo, marginLayoutParams2);
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.height = LJIIJ;
                    C786410Ut5.W5(view2, marginLayoutParams3);
                    if (LJIILLIIL <= 0) {
                        if ((view3 instanceof TextView) && (textView = (TextView) view3) != null) {
                            measuredWidth = (int) (textView.getPaint().measureText(textView.getText().toString()) + textView.getPaddingLeft() + textView.getPaddingRight());
                        } else {
                            view3.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                            measuredWidth = view3.getMeasuredWidth();
                        }
                        if ((c197039127h instanceof TextView) && c197039127h != null) {
                            measuredWidth2 = (int) (c197039127h.getPaint().measureText(c197039127h.getText().toString()) + c197039127h.getPaddingLeft() + c197039127h.getPaddingRight());
                        } else {
                            c197039127h.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                            measuredWidth2 = c197039127h.getMeasuredWidth();
                        }
                        LJIILLIIL = Math.max(measuredWidth, measuredWidth2);
                    }
                    int iLIZIZ2 = (LJIILLIIL * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    int i = LJIILIIL;
                    int i2 = (i - LJIIIZ) / 2;
                    if (iLIZIZ2 > i - (i2 * 2) && (i2 = (i - iLIZIZ2) / 2) < (iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)))) {
                        i2 = iLIZIZ;
                    }
                    ViewGroup.LayoutParams layoutParams4 = view3.getLayoutParams();
                    if (layoutParams4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams4.height = LJII;
                        marginLayoutParams4.topMargin = LJIIIIZZ;
                        marginLayoutParams4.setMarginStart(i2);
                        marginLayoutParams4.setMarginEnd(0);
                        C786410Ut5.W5(view3, marginLayoutParams4);
                        ViewGroup.LayoutParams layoutParams5 = c197039127h.getLayoutParams();
                        if (layoutParams5 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                            marginLayoutParams5.height = LJII;
                            marginLayoutParams5.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                            marginLayoutParams5.setMarginEnd(i2);
                            C786410Ut5.W5(c197039127h, marginLayoutParams5);
                            C426750GoL.LJIIL(view, null, null, null, Integer.valueOf(LIZLLL), 23);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static void LIZ(IScreenComponentAbility iScreenComponentAbility, View view, C421460Gfo c421460Gfo, C421460Gfo c421460Gfo2, View view2, View view3, C197039127h c197039127h) {
        LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
        LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LJIILIIL = iScreenComponentAbility.getScreenWidth();
        LJIILJJIL = iScreenComponentAbility.getScreenHeight();
        int i = LJIILIIL;
        int i2 = LIZJ * 2;
        int iMin = Math.min(i - i2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(520)));
        LJIIIZ = iMin;
        LJIIJ = (iMin * 4) / 3;
        try {
            int iKA2 = iScreenComponentAbility.KA2();
            if (iKA2 <= 0) {
                iKA2 = C497820Jfg.LIZJ(c421460Gfo.getContext());
            }
            LJIIJJI = iKA2;
            LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL)));
            if (c421460Gfo.getMeasuredHeight() <= 0) {
                c421460Gfo.measure(View.MeasureSpec.makeMeasureSpec(LJIILIIL - i2, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            if (c421460Gfo2.getMeasuredHeight() <= 0) {
                c421460Gfo2.measure(View.MeasureSpec.makeMeasureSpec(LJIILIIL - i2, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            int iLIZIZ = LIZIZ(c421460Gfo, c421460Gfo2);
            LJIILL = iLIZIZ;
            if (iLIZIZ <= LJIIJ) {
                LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                int iLIZIZ2 = LIZIZ(c421460Gfo, c421460Gfo2);
                LJIILL = iLIZIZ2;
                if (iLIZIZ2 <= LJIIJ) {
                    LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                    LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    LJFF = 0;
                    LJ = 0;
                    int iLIZIZ3 = LIZIZ(c421460Gfo, c421460Gfo2);
                    LJIILL = iLIZIZ3;
                    if (iLIZIZ3 <= LJIIJ) {
                        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
                        if (iLIZIZ3 < iLIZIZ4) {
                            iLIZIZ3 = iLIZIZ4;
                        }
                        LJIIJ = iLIZIZ3;
                        LJIIIZ = (int) ((iLIZIZ3 * 3.0f) / 4.0f);
                        LIZJ(view, c421460Gfo, view2, view3, c197039127h);
                        return;
                    }
                }
            }
            LIZJ(view, c421460Gfo, view2, view3, c197039127h);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ(view, c421460Gfo, view2, view3, c197039127h);
            throw th;
        }
    }
}
