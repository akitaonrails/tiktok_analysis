package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1A9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174781A9k {
    public static final void LIZ(View view) {
        new C1A6Q(view).LIZ.LIZ();
        Object tag = view.getTag(R.id.yzq);
        if (tag instanceof ViewTreeObserver.OnWindowFocusChangeListener) {
            view.getViewTreeObserver().removeOnWindowFocusChangeListener((ViewTreeObserver.OnWindowFocusChangeListener) tag);
        }
    }

    public static final void LIZIZ(final View view) {
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.1A9l
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    View view3 = view;
                    if (view3.hasWindowFocus()) {
                        new C1A6Q(view).LIZ();
                    } else {
                        if (view3.getTag(R.id.yzq) != null) {
                            return;
                        }
                        view3.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserverOnWindowFocusChangeListenerC2174801A9m(view3, view));
                    }
                }
            });
            return;
        }
        if (view.hasWindowFocus()) {
            new C1A6Q(view).LIZ();
        } else {
            if (view.getTag(R.id.yzq) != null) {
                return;
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserverOnWindowFocusChangeListenerC2174801A9m(view, view));
        }
    }
}
