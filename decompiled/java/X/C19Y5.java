package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: X.19Y5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19Y5 {
    public Object LIZ;
    public Drawable LIZIZ;
    public CharSequence LIZJ;
    public CharSequence LIZLLL;
    public View LJFF;
    public C19Y3 LJII;
    public C19Y2 LJIIIIZZ;
    public int LJ = -1;
    public int LJI = -1;

    public final void LIZ() {
        C19Y3 c19y3 = this.LJII;
        if (c19y3 == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c19y3.LJIILIIL(this, true);
    }

    public final void LIZJ() {
        C19Y2 c19y2 = this.LJIIIIZZ;
        if (c19y2 != null) {
            c19y2.LIZ();
        }
    }

    public final void LIZIZ(CharSequence charSequence) {
        this.LIZJ = charSequence;
        LIZJ();
    }
}
