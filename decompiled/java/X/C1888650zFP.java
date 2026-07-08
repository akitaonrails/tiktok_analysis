package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: X.0zFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888650zFP {
    public Object LIZ;
    public Drawable LIZIZ;
    public CharSequence LIZJ;
    public View LJ;
    public C19YU LJI;
    public C19YT LJII;
    public int LIZLLL = -1;
    public boolean LJFF = true;

    public final void LIZ(boolean z) {
        C19YU c19yu = this.LJI;
        if (c19yu != null) {
            c19yu.LJIILIIL(this, true, false, z);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void LIZIZ(int i) {
        this.LJ = C786410Ut5.Td(C786410Ut5.ne(this.LJII.getContext()), i, this.LJII, false);
        C19YT c19yt = this.LJII;
        if (c19yt != null) {
            c19yt.LIZ();
        }
    }
}
