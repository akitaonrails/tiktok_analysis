package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: X.1A6Q, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A6Q {
    public final C21644719nJ LIZ;

    public final void LIZ() {
        this.LIZ.LIZIZ();
    }

    public C1A6Q(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.LIZ = new C1A6P(view);
        } else {
            this.LIZ = new C21644719nJ(view);
        }
    }

    public C1A6Q(WindowInsetsController windowInsetsController) {
        this.LIZ = new C1A6P(windowInsetsController);
    }
}
