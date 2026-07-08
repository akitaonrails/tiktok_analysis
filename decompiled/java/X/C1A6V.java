package X;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: X.1A6V, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A6V {
    public final C1A6X LIZ;

    public C1A6V(WindowInsetsController windowInsetsController) {
        this.LIZ = new C1A6S(windowInsetsController, new C1A6Q(windowInsetsController));
    }

    public final void LIZ(int i) {
        this.LIZ.LIZ(i);
    }

    public final void LIZIZ(boolean z) {
        this.LIZ.LIZJ(z);
    }

    public final void LIZJ(boolean z) {
        this.LIZ.LIZLLL(z);
    }

    public final void LIZLLL(int i) {
        this.LIZ.LJFF(i);
    }

    public C1A6V(final Window window, View view) {
        final C1A6Q c1a6q = new C1A6Q(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C1A6S(window, c1a6q);
        } else if (i >= 26) {
            this.LIZ = new C1A6U(window, c1a6q) { // from class: X.1A6W
                @Override // X.C1A6X
                public final void LIZJ(boolean z) {
                    if (z) {
                        this.LIZ.clearFlags(134217728);
                        this.LIZ.addFlags(Integer.MIN_VALUE);
                        LJI(16);
                        return;
                    }
                    LJII(16);
                }
            };
        } else {
            this.LIZ = new C1A6U(window, c1a6q);
        }
    }
}
