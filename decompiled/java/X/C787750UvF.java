package X;

import Y.ARunnableS9S0500000_13;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787750UvF {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0UvH] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0UvJ] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0UvG] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0UvI] */
    public static void LIZ(C2211761BhO c2211761BhO, final Function0 function0, final Function0 function02) {
        final Function0 function03 = null;
        final ?? r3 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0UvH
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Function0<Unit> function04 = function03;
                if (function04 != null) {
                    function04.invoke();
                }
            }
        };
        final Object[] objArr = 0 == true ? 1 : 0;
        final ?? r4 = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0UvJ
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Function0<Unit> function04 = objArr;
                if (function04 != null) {
                    function04.invoke();
                }
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final ?? r5 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0UvG
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                Function1<Boolean, Unit> function1 = objArr2;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
            }
        };
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final ?? r6 = new ViewTreeObserver.OnDrawListener() { // from class: X.0UvI
            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                Function0<Unit> function04 = objArr3;
                if (function04 != null) {
                    function04.invoke();
                }
            }
        };
        View view = c2211761BhO.getViewRef().get();
        if (view != null) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0UvE
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(final View view2) {
                    final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = r3;
                    final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = r4;
                    final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = r5;
                    final ViewTreeObserver.OnDrawListener onDrawListener = r6;
                    HandlerHook.viewPost(view2, new Runnable() { // from class: X.0UvD
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ExposeViewExtKt@24b7.addListeners$1$onViewAttachedToWindow$1");
                            try {
                                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = onGlobalLayoutListener;
                                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener2 = onScrollChangedListener;
                                ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener2 = onWindowFocusChangeListener;
                                ViewTreeObserver.OnDrawListener onDrawListener2 = onDrawListener;
                                C786410Ut5.x3(viewTreeObserver, onGlobalLayoutListener2);
                                viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener2);
                                C2187701Ajg.LIZ(viewTreeObserver, onScrollChangedListener2, ViewTreeObserver.OnScrollChangedListener.class);
                                viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener2);
                                viewTreeObserver.addOnDrawListener(onDrawListener2);
                                C2187701Ajg.LIZ(viewTreeObserver, onDrawListener2, ViewTreeObserver.OnDrawListener.class);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ExposeViewExtKt@24b7.addListeners$1$onViewAttachedToWindow$1");
                        }
                    });
                    Function0<Unit> function04 = function0;
                    if (function04 != null) {
                        function04.invoke();
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = r3;
                    ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = r5;
                    HandlerHook.viewPost(view2, new ARunnableS9S0500000_13(view2, r6, onGlobalLayoutListener, r4, onWindowFocusChangeListener, 0));
                    Function0<Unit> function04 = function02;
                    if (function04 != null) {
                        function04.invoke();
                    }
                }
            });
        }
    }
}
