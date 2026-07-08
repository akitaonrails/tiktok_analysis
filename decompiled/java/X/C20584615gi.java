package X;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20584615gi implements InterfaceC440740HQa {
    public final int LIZ;

    public C20584615gi(int i) {
        if (i >= 0) {
            this.LIZ = i;
            return;
        }
        throw new IllegalArgumentException("Margin must be non-negative");
    }

    @Override // X.InterfaceC440740HQa
    public final void LIZ(View view, float f) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof C20632315oP)) {
            C20632315oP c20632315oP = (C20632315oP) parent2;
            float f2 = this.LIZ * f;
            if (c20632315oP.getOrientation() == 0) {
                if (c20632315oP.LLIZ.getLayoutDirection() == 1) {
                    f2 = -f2;
                }
                C786410Ut5.Jc(view, f2);
                return;
            }
            C786410Ut5.ed(view, f2);
            return;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
