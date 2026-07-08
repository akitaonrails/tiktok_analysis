package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: X.0Txz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C763970Txz {
    public Object LIZ;
    public Drawable LIZIZ;
    public CharSequence LIZJ;
    public CharSequence LJ;
    public View LJI;
    public C21546719Ub LJII;
    public C21546819Uc LJIIIIZZ;
    public int LJIIJJI;
    public int LJIIL;
    public Typeface LJIILJJIL;
    public boolean LIZLLL = true;
    public int LJFF = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public int LJIILIIL = -1;

    public final void LIZ() {
        C21546719Ub c21546719Ub = this.LJII;
        if (c21546719Ub == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c21546719Ub.LJIILJJIL(this, true);
    }

    public final void LJ() {
        C21546819Uc c21546819Uc = this.LJIIIIZZ;
        if (c21546819Uc != null) {
            c21546819Uc.LIZ();
        }
    }

    public final void LIZIZ(int i) {
        this.LJI = C786410Ut5.Td(C786410Ut5.ne(this.LJIIIIZZ.getContext()), i, this.LJIIIIZZ, false);
        LJ();
    }

    public final void LIZJ(View view) {
        this.LJI = view;
        LJ();
    }

    public final void LIZLLL(CharSequence charSequence) {
        int i = this.LJIIJ;
        int i2 = this.LJIIIZ;
        if (this.LJIIIIZZ != null && TextUtils.isEmpty(this.LJ) && !TextUtils.isEmpty(charSequence)) {
            this.LJIIIIZZ.setContentDescription(charSequence);
        }
        this.LIZJ = charSequence;
        this.LJII.getClass();
        this.LJIIJ = i;
        this.LJIIIZ = i2;
        LJ();
    }
}
