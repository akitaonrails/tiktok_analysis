package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: X.0m5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383090m5z {
    public Drawable LIZ;
    public CharSequence LIZIZ;
    public CharSequence LIZJ;
    public View LJ;
    public C19YK LJI;
    public C19YJ LJII;
    public int LIZLLL = -1;
    public int LJFF = -1;

    public final void LIZ() {
        C19YK c19yk = this.LJI;
        if (c19yk == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c19yk.LJIIJJI(this, true);
    }

    public final void LIZIZ() {
        C19YJ c19yj = this.LJII;
        if (c19yj != null) {
            c19yj.LIZ();
        }
    }
}
