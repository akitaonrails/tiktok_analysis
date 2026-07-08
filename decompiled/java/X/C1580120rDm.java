package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0rDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580120rDm {
    public final ViewGroup.LayoutParams LIZ;
    public final ViewGroup.LayoutParams LIZIZ;
    public final C1580210rDv LIZJ;
    public final C1580210rDv LIZLLL;

    public final void LIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            ViewGroup.LayoutParams layoutParams2 = this.LIZ;
            marginLayoutParams.width = layoutParams2.width;
            marginLayoutParams.height = layoutParams2.height;
        }
        C1580210rDv c1580210rDv = this.LIZJ;
        if (c1580210rDv != null) {
            C426750GoL.LJIIL(view, Integer.valueOf(c1580210rDv.LIZ), Integer.valueOf(this.LIZJ.LIZIZ), Integer.valueOf(this.LIZJ.LIZJ), Integer.valueOf(this.LIZJ.LIZLLL), 16);
        }
    }

    public C1580120rDm(ViewGroup.LayoutParams layoutParams, ViewGroup.LayoutParams layoutParams2, C1580210rDv c1580210rDv, C1580210rDv c1580210rDv2) {
        this.LIZ = layoutParams;
        this.LIZIZ = layoutParams2;
        this.LIZJ = c1580210rDv;
        this.LIZLLL = c1580210rDv2;
    }
}
