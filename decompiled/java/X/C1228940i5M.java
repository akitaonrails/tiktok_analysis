package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0i5M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228940i5M {
    public final C16G0 LIZ;
    public final C16GW LIZIZ;
    public final View LIZJ;
    public ViewOnLayoutChangeListenerC1265870j2v LIZLLL;

    public final void LIZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int height;
        ViewGroup.LayoutParams layoutParams = this.LIZJ.getLayoutParams();
        if (!(layoutParams instanceof C16G1) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.height == (height = this.LIZ.getHeight() - this.LIZIZ.getHeight()) || height <= 0) {
            return;
        }
        marginLayoutParams.height = height;
        C786410Ut5.W5(this.LIZJ, marginLayoutParams);
    }

    public C1228940i5M(C16G0 c16g0, C16GW c16gw, View view) {
        this.LIZ = c16g0;
        this.LIZIZ = c16gw;
        this.LIZJ = view;
    }
}
