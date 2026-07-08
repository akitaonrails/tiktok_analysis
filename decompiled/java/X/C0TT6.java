package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TT6, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TT6 {
    public static final int LIZ(int i) {
        C844470XAv.LIZ.getClass();
        return (int) ((C844470XAv.LIZ().getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    public static final void LIZIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LIZLLL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LIZJ(final View view, final String str, final Function1<? super String, Unit> function1) {
        if (!view.getViewTreeObserver().isAlive()) {
            return;
        }
        final Rect rect = new Rect();
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0TT7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (view.getGlobalVisibleRect(rect)) {
                    function1.invoke(str);
                    C786410Ut5.C3(view.getViewTreeObserver(), this);
                }
            }
        });
    }
}
