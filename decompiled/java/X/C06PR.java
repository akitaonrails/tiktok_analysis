package X;

import Y.ALAdapterS0S0100000_2;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06PR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06PR {
    public static final void LIZ(final float f, final long j, final long j2, final View view) {
        float x;
        if (view.getVisibility() == 8) {
            return;
        }
        if (j != 0 && j2 != 0) {
            if (view.isLaidOut() && !view.isLayoutRequested()) {
                if (C426750GoL.LIZLLL(view.getContext())) {
                    x = view.getX() + f + view.getContext().getResources().getDimension(R.dimen.wm);
                } else {
                    x = view.getX() - (f + view.getContext().getResources().getDimension(R.dimen.wl));
                }
                view.animate().x(x).setDuration(j);
                C786410Ut5.T4(view, 1.0f);
                view.animate().alpha(0.0f).setDuration(j2).setListener(new ALAdapterS0S0100000_2(view, 1));
                return;
            }
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.06PS
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    float x2;
                    view2.removeOnLayoutChangeListener(this);
                    if (C426750GoL.LIZLLL(view.getContext())) {
                        x2 = view.getX() + f + view.getContext().getResources().getDimension(R.dimen.wm);
                    } else {
                        x2 = view.getX() - (f + view.getContext().getResources().getDimension(R.dimen.wl));
                    }
                    view.animate().x(x2).setDuration(j);
                    C786410Ut5.T4(view, 1.0f);
                    view.animate().alpha(0.0f).setDuration(j2).setListener(new ALAdapterS0S0100000_2(view, 1));
                }
            });
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
        C786410Ut5.T4(view, 1.0f);
    }
}
