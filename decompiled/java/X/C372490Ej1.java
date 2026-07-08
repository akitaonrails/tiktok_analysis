package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ej1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372490Ej1 {
    public final View LIZ;
    public final Function0<Context> LIZIZ;
    public final Function0<C0ETT> LIZJ;
    public final Function1<Boolean, Boolean> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Boolean> LJI;
    public final Function0<Boolean> LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public TuxIconView LJIIJ;

    public final C0ETT LIZ() {
        return this.LIZJ.invoke();
    }

    public final Drawable LIZIZ(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int iIntValue;
        int i5;
        int i6;
        int i7;
        boolean z2 = LIZ().LJIIIIZZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (!LIZ().LJIJJLI && !z2) {
            i = R.raw.icon_chevron_left_ltr;
        } else {
            i = R.raw.icon_x_mark;
        }
        c419910GdJ.LIZ = i;
        if (z) {
            i2 = R.attr.zk;
        } else {
            i2 = R.attr.ee;
        }
        c419910GdJ.LJ = Integer.valueOf(i2);
        if (z2) {
            i3 = 24;
        } else {
            i3 = 20;
        }
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3));
        if (z2) {
            i4 = 24;
        } else {
            i4 = 20;
        }
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i4));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LIZIZ.invoke());
        C384050F3z c384050F3z = new C384050F3z();
        if (!z2 || LIZ().LJIL) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.agm, this.LIZIZ.invoke());
            int iIntValue2 = 0;
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.z_, this.LIZIZ.invoke());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            }
            c384050F3z.LIZ = Integer.valueOf(C2441009hQ.LJIIJ(iIntValue, iIntValue2));
            if (C288180BRg.LIZ()) {
                i5 = 40;
            } else {
                i5 = 32;
            }
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i5));
            if (C288180BRg.LIZ()) {
                i6 = 40;
            } else {
                i6 = 32;
            }
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i6));
            if (C288180BRg.LIZ()) {
                i7 = 20;
            } else {
                i7 = 16;
            }
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(i7));
        }
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.LIZIZ.invoke()));
    }

    public final Drawable LIZJ(boolean z) {
        int i;
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_ellipsis_horizontal_fill;
        if (z) {
            i = R.attr.zk;
        } else {
            i = R.attr.ee;
        }
        c419910GdJ.LJ = Integer.valueOf(i);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LIZIZ.invoke());
        C384050F3z c384050F3z = new C384050F3z();
        int iLIZJ = C1308910kAL.LIZJ(R.attr.agm, this.LIZIZ.invoke());
        if (iLIZJ == null) {
            iLIZJ = 0;
        }
        c384050F3z.LIZ = iLIZJ;
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(37));
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.LIZIZ.invoke()));
    }

    public final Drawable LIZLLL(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2 = LIZ().LJIIIIZZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (!LIZ().LJIJI && !z2 && !LIZ().LJIJJLI) {
            i = R.raw.icon_arrow_right_fill_ltr;
        } else {
            i = R.raw.icon_tick;
        }
        c419910GdJ.LIZ = i;
        if (z) {
            i2 = R.attr.zk;
        } else {
            i2 = R.attr.ee;
        }
        c419910GdJ.LJ = Integer.valueOf(i2);
        if (z2) {
            i3 = 24;
        } else {
            i3 = 20;
        }
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i3));
        if (z2) {
            i4 = 24;
        } else {
            i4 = 20;
        }
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i4));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LIZIZ.invoke());
        C384050F3z c384050F3z = new C384050F3z();
        if (!z2 || LIZ().LJIL) {
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ob);
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        }
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.LIZIZ.invoke()));
    }

    public final <T extends View> T LJ(int i) {
        return (T) this.LIZ.findViewById(i);
    }

    public C372490Ej1(View view, AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, AwS584S0100000_5 awS584S0100000_5, AwS549S0100000_5 awS549S0100000_53, AwS549S0100000_5 awS549S0100000_54, AwS549S0100000_5 awS549S0100000_55, AwS549S0100000_5 awS549S0100000_56) {
        this.LIZ = view;
        this.LIZIZ = awS549S0100000_5;
        this.LIZJ = awS549S0100000_52;
        this.LIZLLL = awS584S0100000_5;
        this.LJ = awS549S0100000_53;
        this.LJFF = awS549S0100000_54;
        this.LJI = awS549S0100000_55;
        this.LJII = awS549S0100000_56;
    }
}
