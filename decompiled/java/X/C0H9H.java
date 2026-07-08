package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.utils.IECContextService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0H9H, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H9H {
    public static final float LIZ(float f) {
        IECContextService iECContextService = (IECContextService) PluggableExtentionKt.pluggableSpi$default(IECContextService.class, false, false, false, 14, null);
        if (iECContextService != null) {
            return 0.5f + (iECContextService.getContext().getResources().getDisplayMetrics().density * f);
        }
        return f;
    }

    public static final int LIZIZ(int i) {
        return (int) LIZ(i);
    }

    public static final View LIZJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = i;
        }
        view.requestLayout();
        return view;
    }

    public static final View LIZLLL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginEnd(i);
        }
        view.requestLayout();
        return view;
    }

    public static final void LJ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(i);
                marginLayoutParams.setMarginEnd(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJFF(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginStart(i);
            }
            view.requestLayout();
        }
    }

    public static final void LJI(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LJII(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = i;
        }
        view.requestLayout();
    }
}
