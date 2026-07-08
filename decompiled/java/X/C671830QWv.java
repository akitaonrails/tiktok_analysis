package X;

import Y.ARunnableS110S0100000_10;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QWv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671830QWv {
    public static final void LIZ(final View view) {
        view.requestFocus();
        if (view.hasWindowFocus()) {
            if (view.isFocused()) {
                HandlerHook.viewPost(view, new ARunnableS110S0100000_10(view, 203));
                return;
            }
            return;
        }
        view.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0QWu
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                if (z) {
                    if (!view.isFocused()) {
                        view.requestFocus();
                    }
                    View view2 = view;
                    if (view2.isFocused()) {
                        HandlerHook.viewPost(view2, new ARunnableS110S0100000_10(view2, 203));
                    }
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                }
            }
        });
    }

    public static final void LIZIZ(final View view, final Function0<Unit> function0) {
        view.requestFocus();
        if (view.hasWindowFocus()) {
            function0.invoke();
            return;
        }
        if (C1835807Gy.LIZ()) {
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0QWx
                    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                    public final void onWindowFocusChanged(boolean z) {
                        if (z) {
                            function0.invoke();
                            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                        }
                    }
                });
                return;
            } else {
                view.addOnAttachStateChangeListener(new C0R48(function0, view, 21));
                return;
            }
        }
        view.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0QWw
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                boolean zLJI = MethodIDManager.LJI(72003);
                if (z) {
                    function0.invoke();
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
        });
    }
}
