package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0zq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911400zq6 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context) {
        Resources resources;
        DisplayMetrics displayMetrics;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(360));
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            int i = displayMetrics.widthPixels;
            int iLJ = C14KQ.LJ(context);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("screen width: ");
            sbLIZ.append(i / C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            sbLIZ.append("dp");
            C1911410zq7.LIZJ("NUJViewSizeUtils", C2188811AlT.LIZIZ(sbLIZ));
            if (i <= iLIZIZ && iLJ <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZIZ(View view, Float f, Float f2) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Float fValueOf;
        Float fValueOf2;
        Integer numValueOf;
        Integer numValueOf2;
        if (view != null && (resources = view.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            int i = displayMetrics.widthPixels;
            if (f != null) {
                fValueOf = Float.valueOf(f.floatValue() * i);
            } else {
                fValueOf = null;
            }
            if (f2 != null) {
                fValueOf2 = Float.valueOf(f2.floatValue() * i);
            } else {
                fValueOf2 = null;
            }
            if (fValueOf != null) {
                numValueOf = Integer.valueOf((int) fValueOf.floatValue());
            } else {
                numValueOf = null;
            }
            if (fValueOf2 != null) {
                numValueOf2 = Integer.valueOf((int) fValueOf2.floatValue());
            } else {
                numValueOf2 = null;
            }
            LIZJ(view, numValueOf, numValueOf2, null, null);
        }
    }

    public static void LJ(View view, Integer num, Integer num2) {
        ViewGroup.LayoutParams layoutParams;
        int iIntValue;
        int iIntValue2;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = layoutParams.width;
            }
            layoutParams.width = iIntValue;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = layoutParams.height;
            }
            layoutParams.height = iIntValue2;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static void LIZJ(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        ViewGroup.LayoutParams layoutParams;
        int marginStart;
        int marginEnd;
        int iIntValue;
        int iIntValue2;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (num != null) {
                marginStart = num.intValue();
            } else {
                marginStart = marginLayoutParams.getMarginStart();
            }
            marginLayoutParams.setMarginStart(marginStart);
            if (num2 != null) {
                marginEnd = num2.intValue();
            } else {
                marginEnd = marginLayoutParams.getMarginEnd();
            }
            marginLayoutParams.setMarginEnd(marginEnd);
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = marginLayoutParams.topMargin;
            }
            marginLayoutParams.topMargin = iIntValue;
            if (num4 != null) {
                iIntValue2 = num4.intValue();
            } else {
                iIntValue2 = marginLayoutParams.bottomMargin;
            }
            marginLayoutParams.bottomMargin = iIntValue2;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static void LJFF(View view, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        int iIntValue6;
        ViewGroup.LayoutParams layoutParams = null;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        if ((i & 16) != 0) {
            num3 = null;
        }
        if ((i & 32) != 0) {
            num4 = null;
        }
        if ((i & 64) != 0) {
            num5 = null;
        }
        if ((i & 128) != 0) {
            num6 = null;
        }
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if (layoutParams instanceof C19ME) {
            C19ME c19me = (C19ME) view.getLayoutParams();
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c19me.startToStart;
            }
            c19me.startToStart = iIntValue;
            c19me.startToEnd = c19me.startToEnd;
            c19me.endToStart = c19me.endToStart;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = c19me.endToEnd;
            }
            c19me.endToEnd = iIntValue2;
            if (num3 != null) {
                iIntValue3 = num3.intValue();
            } else {
                iIntValue3 = c19me.topToTop;
            }
            c19me.topToTop = iIntValue3;
            if (num4 != null) {
                iIntValue4 = num4.intValue();
            } else {
                iIntValue4 = c19me.topToBottom;
            }
            c19me.topToBottom = iIntValue4;
            if (num5 != null) {
                iIntValue5 = num5.intValue();
            } else {
                iIntValue5 = c19me.bottomToTop;
            }
            c19me.bottomToTop = iIntValue5;
            if (num6 != null) {
                iIntValue6 = num6.intValue();
            } else {
                iIntValue6 = c19me.bottomToBottom;
            }
            c19me.bottomToBottom = iIntValue6;
        }
    }
}
