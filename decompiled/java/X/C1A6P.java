package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.1A6P, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1A6P extends C21644719nJ {
    public final View LIZIZ;
    public final WindowInsetsController LIZJ;

    @Override // X.C21644719nJ
    public final void LIZ() {
        View view;
        View view2;
        WindowInsetsController windowInsetsController = this.LIZJ;
        if (windowInsetsController == null && ((view2 = this.LIZIZ) == null || (windowInsetsController = view2.getWindowInsetsController()) == null)) {
            super.LIZ();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: X.1A6R
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                boolean z;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                if ((i & 8) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                atomicBoolean2.set(z);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        if (!atomicBoolean.get() && (view = this.LIZIZ) != null) {
            ((InputMethodManager) C786410Ut5.H2(view.getContext(), "input_method")).hideSoftInputFromWindow(this.LIZIZ.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // X.C21644719nJ
    public final void LIZIZ() {
        View view;
        View view2 = this.LIZIZ;
        if (view2 != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) C786410Ut5.H2(view2.getContext(), "input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.LIZJ;
        if (windowInsetsController != null || ((view = this.LIZIZ) != null && (windowInsetsController = view.getWindowInsetsController()) != null)) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.LIZIZ();
    }

    public C1A6P(WindowInsetsController windowInsetsController) {
        super(null);
        this.LIZJ = windowInsetsController;
    }

    public C1A6P(View view) {
        super(view);
        this.LIZIZ = view;
    }
}
