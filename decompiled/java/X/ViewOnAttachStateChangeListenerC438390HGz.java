package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0HGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewOnAttachStateChangeListenerC438390HGz implements View.OnAttachStateChangeListener {
    public static final C0HH0 LL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0HH0] */
    static {
        final int i = 0;
        LL = new AbstractC1585810rMx(i) { // from class: X.0HH0
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i2) {
                if (i2 == 0) {
                    int i3 = C2187451AjH.LIZ;
                    C2211751BhN.LJ(C2211751BhN.LJIIIZ(), true);
                }
            }
        };
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            C0HH0 c0hh0 = LL;
            recyclerView.removeOnScrollListener(c0hh0);
            recyclerView.addOnScrollListener(c0hh0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).removeOnScrollListener(LL);
        }
    }
}
