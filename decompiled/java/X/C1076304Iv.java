package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.04Iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1076304Iv {
    public static final void LIZIZ(View view, Integer num, Integer num2) {
        int paddingTop;
        int paddingBottom;
        if (view != null) {
            int paddingStart = view.getPaddingStart();
            if (num != null) {
                paddingTop = num.intValue();
            } else {
                paddingTop = view.getPaddingTop();
            }
            int paddingEnd = view.getPaddingEnd();
            if (num2 != null) {
                paddingBottom = num2.intValue();
            } else {
                paddingBottom = view.getPaddingBottom();
            }
            view.setPadding(paddingStart, paddingTop, paddingEnd, paddingBottom);
        }
    }

    public static final void LIZ(View view, Integer num, Integer num2, Integer num3) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            if (num != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(num.intValue());
            }
            if (num2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = num2.intValue();
            }
            if (num3 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = num3.intValue();
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
