package X;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: X.13fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20068613fg {
    public static final Integer LIZJ(int i) {
        boolean z;
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        return null;
    }

    public static final C20071313g7 LIZLLL(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return null;
                            }
                            return new C20071313g7(6);
                        }
                        return new C20071313g7(4);
                    }
                    return new C20071313g7(5);
                }
                return new C20071313g7(3);
            }
            return new C20071313g7(1);
        }
        return new C20071313g7(2);
    }

    public static final C1683130ttv LIZ(View view, View view2) {
        int[] iArr = C20071813gC.LIZ;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        float f = i - i3;
        float f2 = i2 - i4;
        return new C1683130ttv(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final boolean LIZIZ(View view, Integer num, Rect rect) {
        View viewFindFocus;
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            if (viewFindNextFocusFromRect != null) {
                return viewFindNextFocusFromRect.requestFocus(num.intValue(), rect);
            }
            return view.requestFocus(num.intValue(), rect);
        }
        if (view.hasFocus()) {
            viewFindFocus = view.findFocus();
        } else {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewFindFocus, num.intValue());
        if (viewFindNextFocus != null) {
            return viewFindNextFocus.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue());
    }
}
