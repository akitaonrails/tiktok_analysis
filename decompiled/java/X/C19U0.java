package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;

/* JADX INFO: renamed from: X.19U0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19U0 {
    public Object LIZ;
    public Drawable LIZIZ;
    public CharSequence LIZJ;
    public CharSequence LIZLLL;
    public View LJFF;
    public C19U1 LJII;
    public C21546519Tz LJIIIIZZ;
    public int LJ = -1;
    public final int LJI = 1;
    public int LJIIIZ = -1;

    public final boolean LIZ() {
        C19U1 c19u1 = this.LJII;
        if (c19u1 != null) {
            return c19u1.getSelectedTabPosition() == this.LJ;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void LIZIZ() {
        C19U1 c19u1 = this.LJII;
        if (c19u1 == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        c19u1.selectTab(this);
    }

    public final void LJI() {
        C21546519Tz c21546519Tz = this.LJIIIIZZ;
        if (c21546519Tz != null) {
            c21546519Tz.update();
        }
    }

    public final void LIZJ(int i) {
        this.LJFF = C786410Ut5.Td(C786410Ut5.ne(this.LJIIIIZZ.getContext()), i, this.LJIIIIZZ, false);
        LJI();
    }

    public final void LIZLLL(View view) {
        this.LJFF = view;
        LJI();
    }

    public final void LJ(TuxIconDrawable tuxIconDrawable) {
        this.LIZIZ = tuxIconDrawable;
        C19U1 c19u1 = this.LJII;
        if (c19u1.tabGravity == 1 || c19u1.mode == 2) {
            c19u1.updateTabViews(true);
        }
        LJI();
    }

    public final void LJFF(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.LIZLLL) && !TextUtils.isEmpty(charSequence)) {
            this.LJIIIIZZ.setContentDescription(charSequence);
        }
        this.LIZJ = charSequence;
        LJI();
    }
}
