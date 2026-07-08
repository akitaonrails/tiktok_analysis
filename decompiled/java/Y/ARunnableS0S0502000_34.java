package Y;

import X.C19M5;
import X.C1C7U;
import X.C2248101Cyu;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.skydoves.balloon.Balloon;
import java.util.Arrays;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS0S0502000_34 implements Runnable {
    public final int $t;
    public int i5;
    public int i6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Boolean boolValueOf = Boolean.valueOf(((Balloon) this.l0).LIZLLL((View) this.l1));
        if (boolValueOf.booleanValue()) {
            boolValueOf.booleanValue();
            ((Balloon) this.l0).LLILLJJLI.getClass();
            Balloon balloon = (Balloon) this.l0;
            balloon.LLIZ = true;
            long j = balloon.LLILLJJLI.LJJIJIIJIL;
            if (j != -1) {
                balloon.LJ(j);
            }
            if (((Balloon) this.l0).LJIIIZ()) {
                Balloon balloon2 = (Balloon) this.l0;
                balloon2.LJIJI(balloon2.LLILLL.LLILZ);
            } else {
                Balloon balloon3 = (Balloon) this.l0;
                C2248101Cyu c2248101Cyu = balloon3.LLILLL;
                balloon3.LJIIL(c2248101Cyu.LLILZ, c2248101Cyu.LLILZLL);
            }
            ((Balloon) this.l0).LLILLL.LL.measure(0, 0);
            ((Balloon) this.l0).LLILLJJLI.getClass();
            Balloon balloon4 = (Balloon) this.l0;
            balloon4.LLILZIL.setWidth(balloon4.LJIIIIZZ());
            Balloon balloon5 = (Balloon) this.l0;
            balloon5.LLILZIL.setHeight(balloon5.LJII());
            C19M5 c19m5 = ((Balloon) this.l0).LLILLL.LLILZLL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19m5);
            c19m5.setLayoutParams(layoutParams);
            ((Balloon) this.l0).LJIIJ((View) this.l1);
            ((Balloon) this.l0).LJIIJJI();
            ((Balloon) this.l0).LIZJ();
            Balloon balloon6 = (Balloon) this.l0;
            View[] viewArr = (View[]) this.l2;
            balloon6.LJIIZILJ((View[]) Arrays.copyOf(viewArr, viewArr.length));
            ((Balloon) this.l0).LLILLJJLI.getClass();
            ((Balloon) this.l0).LIZIZ();
            ((Balloon) this.l0).LJIJ();
            Balloon balloon7 = (Balloon) this.l3;
            PopupWindow popupWindow = balloon7.LLILZIL;
            View view = (View) this.l4;
            C786410Ut5.i3(popupWindow, view, balloon7.LLILLJJLI.LJJJJI * (((view.getMeasuredWidth() / 2) - (((Balloon) this.l3).LJIIIIZZ() / 2)) + this.i5), this.i6);
        }
    }

    public final void LIZ$1() {
        Boolean boolValueOf = Boolean.valueOf(((Balloon) this.l0).LIZLLL((View) this.l1));
        if (boolValueOf.booleanValue()) {
            boolValueOf.booleanValue();
            ((Balloon) this.l0).LLILLJJLI.getClass();
            Balloon balloon = (Balloon) this.l0;
            balloon.LLIZ = true;
            long j = balloon.LLILLJJLI.LJJIJIIJIL;
            if (j != -1) {
                balloon.LJ(j);
            }
            if (((Balloon) this.l0).LJIIIZ()) {
                Balloon balloon2 = (Balloon) this.l0;
                balloon2.LJIJI(balloon2.LLILLL.LLILZ);
            } else {
                Balloon balloon3 = (Balloon) this.l0;
                C2248101Cyu c2248101Cyu = balloon3.LLILLL;
                balloon3.LJIIL(c2248101Cyu.LLILZ, c2248101Cyu.LLILZLL);
            }
            ((Balloon) this.l0).LLILLL.LL.measure(0, 0);
            ((Balloon) this.l0).LLILLJJLI.getClass();
            Balloon balloon4 = (Balloon) this.l0;
            balloon4.LLILZIL.setWidth(balloon4.LJIIIIZZ());
            Balloon balloon5 = (Balloon) this.l0;
            balloon5.LLILZIL.setHeight(balloon5.LJII());
            C19M5 c19m5 = ((Balloon) this.l0).LLILLL.LLILZLL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19m5);
            c19m5.setLayoutParams(layoutParams);
            ((Balloon) this.l0).LJIIJ((View) this.l1);
            ((Balloon) this.l0).LJIIJJI();
            ((Balloon) this.l0).LIZJ();
            Balloon balloon6 = (Balloon) this.l0;
            View[] viewArr = (View[]) this.l2;
            balloon6.LJIIZILJ((View[]) Arrays.copyOf(viewArr, viewArr.length));
            ((Balloon) this.l0).LLILLJJLI.getClass();
            ((Balloon) this.l0).LIZIZ();
            ((Balloon) this.l0).LJIJ();
            Balloon balloon7 = (Balloon) this.l3;
            PopupWindow popupWindow = balloon7.LLILZIL;
            View view = (View) this.l4;
            C786410Ut5.i3(popupWindow, view, balloon7.LLILLJJLI.LJJJJI * (((view.getMeasuredWidth() / 2) - (((Balloon) this.l3).LJIIIIZZ() / 2)) + this.i5), ((-((Balloon) this.l3).LJII()) - ((View) this.l4).getMeasuredHeight()) + this.i6);
        }
    }

    public final void LIZ$2() {
        Boolean boolValueOf = Boolean.valueOf(((Balloon) this.l0).LIZLLL((View) this.l1));
        if (boolValueOf.booleanValue()) {
            boolValueOf.booleanValue();
            ((Balloon) this.l0).LLILLJJLI.getClass();
            Balloon balloon = (Balloon) this.l0;
            balloon.LLIZ = true;
            long j = balloon.LLILLJJLI.LJJIJIIJIL;
            if (j != -1) {
                balloon.LJ(j);
            }
            if (((Balloon) this.l0).LJIIIZ()) {
                Balloon balloon2 = (Balloon) this.l0;
                balloon2.LJIJI(balloon2.LLILLL.LLILZ);
            } else {
                Balloon balloon3 = (Balloon) this.l0;
                C2248101Cyu c2248101Cyu = balloon3.LLILLL;
                balloon3.LJIIL(c2248101Cyu.LLILZ, c2248101Cyu.LLILZLL);
            }
            ((Balloon) this.l0).LLILLL.LL.measure(0, 0);
            ((Balloon) this.l0).LLILLJJLI.getClass();
            Balloon balloon4 = (Balloon) this.l0;
            balloon4.LLILZIL.setWidth(balloon4.LJIIIIZZ());
            Balloon balloon5 = (Balloon) this.l0;
            balloon5.LLILZIL.setHeight(balloon5.LJII());
            C19M5 c19m5 = ((Balloon) this.l0).LLILLL.LLILZLL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19m5);
            c19m5.setLayoutParams(layoutParams);
            ((Balloon) this.l0).LJIIJ((View) this.l1);
            ((Balloon) this.l0).LJIIJJI();
            ((Balloon) this.l0).LIZJ();
            Balloon balloon6 = (Balloon) this.l0;
            View[] viewArr = (View[]) this.l2;
            balloon6.LJIIZILJ((View[]) Arrays.copyOf(viewArr, viewArr.length));
            ((Balloon) this.l0).LLILLJJLI.getClass();
            ((Balloon) this.l0).LIZIZ();
            ((Balloon) this.l0).LJIJ();
            C786410Ut5.i3(((Balloon) this.l3).LLILZIL, (View) this.l4, this.i5, this.i6);
        }
    }

    public static final void run$0(ARunnableS0S0502000_34 aRunnableS0S0502000_34) {
        boolean zLIZ;
        C1C7U.LIZ("Balloon@9a33.showAlignBottom$$inlined$show$1");
        try {
            aRunnableS0S0502000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Balloon@9a33.showAlignBottom$$inlined$show$1");
    }

    public static final void run$1(ARunnableS0S0502000_34 aRunnableS0S0502000_34) {
        boolean zLIZ;
        C1C7U.LIZ("Balloon@9a33.showAlignTop$$inlined$show$1");
        try {
            aRunnableS0S0502000_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Balloon@9a33.showAlignTop$$inlined$show$1");
    }

    public static final void run$2(ARunnableS0S0502000_34 aRunnableS0S0502000_34) {
        boolean zLIZ;
        C1C7U.LIZ("Balloon@9a33.showAsDropDown$$inlined$show$1");
        try {
            aRunnableS0S0502000_34.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Balloon@9a33.showAsDropDown$$inlined$show$1");
    }

    public ARunnableS0S0502000_34(Balloon balloon, View view, View[] viewArr, Balloon balloon2, View view2, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = balloon;
        this.l1 = view;
        this.l2 = viewArr;
        this.l3 = balloon2;
        this.l4 = view2;
        this.i5 = i;
        this.i6 = i2;
    }
}
