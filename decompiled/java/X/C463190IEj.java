package X;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0IEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463190IEj {
    public boolean LIZIZ;
    public final WeakReference<View> LIZ = new WeakReference<>(null);
    public int LIZJ = 1;

    public final void LIZ() {
        View view = this.LIZ.get();
        if (view != null) {
            C786410Ut5.LJLLLLLL((this.LIZIZ && this.LIZJ == 1) ? 0 : 8, view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
            }
        }
    }
}
