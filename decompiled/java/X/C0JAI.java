package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;

/* JADX INFO: renamed from: X.0JAI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JAI {
    public static final int LIZIZ(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public static final int LIZJ(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static final int LIZLLL(Context context) {
        int iN3;
        if (context == null || (iN3 = C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(iN3);
    }

    public static float LIZ(float f, Context context) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int LJ(float f, Context context) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void LJFF(LiveIconView liveIconView, float f) {
        if (liveIconView == null) {
            return;
        }
        int iApplyDimension = (int) TypedValue.applyDimension(1, f, liveIconView.getContext().getResources().getDisplayMetrics());
        ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.leftMargin == -3 && marginLayoutParams.topMargin == iApplyDimension && marginLayoutParams.rightMargin == -3 && marginLayoutParams.bottomMargin == -3) {
                return;
            }
            if (iApplyDimension != -3) {
                marginLayoutParams.topMargin = iApplyDimension;
            }
            C786410Ut5.W5(liveIconView, marginLayoutParams);
        }
    }

    public static float LJI(float f, Context context) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static void LJII(int i, int i2, View view) {
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
}
