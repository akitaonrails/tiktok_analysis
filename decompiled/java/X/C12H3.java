package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: X.12H3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12H3 {
    public Object LIZ;
    public Drawable LIZIZ;
    public CharSequence LIZJ;
    public View LJ;
    public C19YA LJI;
    public C19YC LJII;
    public int LIZLLL = -1;
    public boolean LJFF = true;

    public final void LIZ() {
        C19YA c19ya = this.LJI;
        if (c19ya == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c19ya.selectTab(this);
    }

    public final void LIZIZ() {
        C19YC c19yc = this.LJII;
        if (c19yc != null) {
            c19yc.LIZ();
        }
    }
}
