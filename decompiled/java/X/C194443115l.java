package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.115l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194443115l {
    public static final int LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
    public static final int LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public static final int LJIIJ;
    public static final int LJIIJJI;
    public static final int LJIIL;
    public static final int LJIILIIL;
    public static final int LJIILJJIL;
    public static final float LJIILL;
    public final Context LIZ;
    public PopupWindow LIZIZ;
    public TuxIconView LIZJ;
    public TuxIconView LIZLLL;
    public TuxIconView LJ;
    public LinearLayout LJFF;
    public ValueAnimator LJI;
    public boolean LJII;

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        LJIIJ = iLIZIZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        LJIIJJI = iLIZIZ2;
        LJIIL = iLIZIZ + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + iLIZIZ2;
        LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        LJIILJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        LJIILL = C418440Gaw.LIZIZ(Float.valueOf(2.5f));
    }

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJI = null;
        PopupWindow popupWindow = this.LIZIZ;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.LIZIZ = null;
        this.LJII = false;
    }

    public final void LIZIZ() {
        boolean z = this.LJII;
        Integer numValueOf = Integer.valueOf(R.attr.zm);
        if (!z) {
            TuxIconView tuxIconView = this.LIZJ;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZ = R.raw.icon_unlock_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            TuxIconView tuxIconView2 = this.LIZLLL;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColorRes(R.attr.a1k);
            }
            LinearLayout linearLayout = this.LJFF;
            if (linearLayout != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = numValueOf;
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
                linearLayout.setBackground(c384050F3z.LIZ(this.LIZ));
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LIZJ;
        if (tuxIconView3 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ2.LIZ = R.raw.icon_lock_fill;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.zi);
            tuxIconView3.setTuxIcon(c419910GdJ2);
        }
        TuxIconView tuxIconView4 = this.LIZLLL;
        if (tuxIconView4 != null) {
            C0DTR.LIZIZ(tuxIconView4);
        }
        LinearLayout linearLayout2 = this.LJFF;
        if (linearLayout2 != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = numValueOf;
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
            c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f))));
            c384050F3z2.LJFF = Integer.valueOf(R.attr.a0d);
            linearLayout2.setBackground(c384050F3z2.LIZ(this.LIZ));
        }
    }

    public C194443115l(Context context) {
        this.LIZ = context;
    }
}
