package X;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: X.1A6S, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1A6S extends C1A6X {
    public final WindowInsetsController LIZ;
    public final C1A6Q LIZIZ;
    public final Window LIZJ;

    @Override // X.C1A6X
    public final void LJ() {
        this.LIZ.setSystemBarsBehavior(2);
    }

    @Override // X.C1A6X
    public final boolean LIZIZ() {
        this.LIZ.setSystemBarsAppearance(0, 0);
        return (this.LIZ.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // X.C1A6X
    public final void LIZ(int i) {
        if ((i & 8) != 0) {
            this.LIZIZ.LIZ.LIZ();
        }
        this.LIZ.hide(i & (-9));
    }

    @Override // X.C1A6X
    public final void LIZJ(boolean z) {
        if (z) {
            Window window = this.LIZJ;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.LIZ.setSystemBarsAppearance(16, 16);
            return;
        }
        Window window2 = this.LIZJ;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.LIZ.setSystemBarsAppearance(0, 16);
    }

    @Override // X.C1A6X
    public final void LIZLLL(boolean z) {
        if (z) {
            Window window = this.LIZJ;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.LIZ.setSystemBarsAppearance(8, 8);
            return;
        }
        Window window2 = this.LIZJ;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.LIZ.setSystemBarsAppearance(0, 8);
    }

    @Override // X.C1A6X
    public final void LJFF(int i) {
        if ((i & 8) != 0) {
            this.LIZIZ.LIZ();
        }
        this.LIZ.show(i & (-9));
    }

    public C1A6S(WindowInsetsController windowInsetsController, C1A6Q c1a6q) {
        new C830530Wi3();
        this.LIZ = windowInsetsController;
        this.LIZIZ = c1a6q;
    }

    public C1A6S(Window window, C1A6Q c1a6q) {
        this(window.getInsetsController(), c1a6q);
        this.LIZJ = window;
    }
}
