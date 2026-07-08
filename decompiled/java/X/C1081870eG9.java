package X;

import Y.ACListenerS152S0100000_17;
import Y.AObjectS387S0100000_12;
import Y.ARunnableS116S0100000_16;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eG9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081870eG9 implements C0UAG {
    public final ViewGroup LIZ;
    public final Function0<Pair<Integer, Integer>> LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJFF;
    public int LJI;
    public boolean LJIIIIZZ;
    public final View LJIIIZ;
    public final ARunnableS116S0100000_16 LJIIJ;
    public String LJ = "";
    public boolean LJII = true;

    public final void LIZ() {
        Pair<Integer, Integer> pairInvoke = this.LIZIZ.invoke();
        int iIntValue = pairInvoke.getFirst().intValue();
        int iIntValue2 = pairInvoke.getSecond().intValue();
        int width = this.LIZ.getWidth();
        int height = this.LIZ.getHeight();
        if (iIntValue == 0 || iIntValue2 == 0 || width == 0 || height == 0) {
            return;
        }
        float f = iIntValue / iIntValue2;
        if (width / height > f) {
            this.LIZLLL = width;
            this.LIZJ = (int) (width / f);
        } else {
            this.LIZJ = height;
            this.LIZLLL = (int) (height * f);
        }
    }

    public static void LIZJ(boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gesture_effect_user");
        if (z) {
            str = "click";
        } else {
            str = "show";
        }
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LIZ();
    }

    public C1081870eG9(ViewGroup viewGroup, AObjectS387S0100000_12 aObjectS387S0100000_12) {
        this.LIZ = viewGroup;
        this.LIZIZ = aObjectS387S0100000_12;
        View view = new View(viewGroup.getContext());
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 82), view);
        view.setBackgroundColor(0);
        this.LJIIIZ = view;
        this.LJIIJ = new ARunnableS116S0100000_16(this, 100);
    }

    public final void LIZIZ(double d, double d2, double d3, double d4, int i) {
        float f;
        int iIntValue = this.LIZIZ.invoke().getFirst().intValue();
        int iIntValue2 = this.LIZIZ.invoke().getSecond().intValue();
        if (iIntValue2 == 0) {
            f = 1.0f;
        } else {
            f = this.LIZJ / iIntValue2;
        }
        int i2 = this.LIZLLL;
        double d5 = ((double) this.LIZJ) * d2;
        double d6 = ((double) iIntValue) * d3;
        double d7 = f;
        double width = ((((double) i2) * d) - (d6 * d7)) - ((double) ((i2 - this.LIZ.getWidth()) / 2));
        double d8 = ((double) iIntValue2) * d4;
        double height = (d5 - (d8 * d7)) - ((double) ((this.LIZJ - this.LIZ.getHeight()) / 2));
        double d9 = 2;
        int i3 = (int) (d6 * d9 * d7);
        int i4 = (int) (d8 * d9 * d7);
        if (i3 != this.LJFF || i4 != this.LJI) {
            ViewGroup.LayoutParams layoutParams = this.LJIIIZ.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(i3, i4);
            }
            layoutParams.width = i3;
            layoutParams.height = i4;
            C786410Ut5.W5(this.LJIIIZ, layoutParams);
        }
        this.LJFF = i3;
        this.LJI = i4;
        if (this.LIZ.indexOfChild(this.LJIIIZ) == -1) {
            this.LIZ.addView(this.LJIIIZ, 0);
        }
        C786410Ut5.Jc(this.LJIIIZ, (float) width);
        C786410Ut5.ed(this.LJIIIZ, (float) height);
        Handler handlerLIZ = C473410IhP.LIZ();
        handlerLIZ.removeCallbacks(this.LJIIJ);
        C786410Ut5.LJLIIL(((long) (i + 1)) * 1000, handlerLIZ, this.LJIIJ);
    }
}
