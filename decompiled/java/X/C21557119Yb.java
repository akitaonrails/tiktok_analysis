package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: X.19Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21557119Yb {
    public Drawable LIZ;
    public CharSequence LIZIZ;
    public View LIZLLL;
    public C19YY LJFF;
    public C19YX LJI;
    public int LIZJ = -1;
    public final boolean LJ = true;

    public final void LIZ() {
        C19YY c19yy = this.LJFF;
        if (c19yy == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c19yy.LJIILJJIL(this, true, false);
    }

    public final void LIZJ() {
        C19YX c19yx = this.LJI;
        if (c19yx != null) {
            c19yx.LIZ();
        }
    }

    public final void LIZIZ(View view) {
        this.LIZLLL = view;
        LIZJ();
    }
}
