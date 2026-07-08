package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03Cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C806303Cz extends LinearLayout {
    public int LL;

    public final void setCurrentDot(int i) {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        int i2 = this.LL;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == i) {
                View childAt = getChildAt(i3);
                if ((childAt instanceof TuxIconView) && (tuxIconView2 = (TuxIconView) childAt) != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    c419910GdJ.LIZ = R.raw.icon_ellipsis_single;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
                    tuxIconView2.setTuxIcon(c419910GdJ);
                }
            } else {
                View childAt2 = getChildAt(i3);
                if ((childAt2 instanceof TuxIconView) && (tuxIconView = (TuxIconView) childAt2) != null) {
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    c419910GdJ2.LIZ = R.raw.icon_ellipsis_single;
                    c419910GdJ2.LJ = Integer.valueOf(R.attr.a01);
                    tuxIconView.setTuxIcon(c419910GdJ2);
                }
            }
        }
    }

    public final void setDotCount(int i) {
        Integer numValueOf;
        this.LL = i;
        for (int i2 = 0; i2 < i; i2++) {
            TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
            C786410Ut5.M6(tuxIconView, new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            c419910GdJ.LIZ = R.raw.icon_ellipsis_single;
            if (i2 == 0) {
                numValueOf = Integer.valueOf(R.attr.a00);
            } else {
                numValueOf = Integer.valueOf(R.attr.a01);
            }
            c419910GdJ.LJ = numValueOf;
            tuxIconView.setTuxIcon(c419910GdJ);
            addView(tuxIconView);
        }
    }

    public C806303Cz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }
}
