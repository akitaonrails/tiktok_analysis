package X;

import Y.ARunnableS131S0100000_31;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: renamed from: X.15O3, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15O3 {
    public final Context LIZ;
    public final C15O4 LIZIZ;
    public final View LIZJ;
    public final ViewGroup LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final C15O5 LJIIJJI;
    public int LJIIL;
    public AnimatorSet LJIILIIL;

    public final void LIZIZ() {
        C786410Ut5.LJLLLLLL(8, this.LIZJ);
        AnimatorSet animatorSet = this.LJIILIIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LJIILIIL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.LJIILIIL = null;
        }
        HandlerHook.viewPost(this.LIZJ, new ARunnableS131S0100000_31(this, 119));
        this.LJFF = true;
        Function0<Unit> function0 = this.LIZIZ.LJIILIIL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void LIZLLL() {
        ViewGroup viewGroup;
        Drawable drawableLIZIZ = null;
        if (this.LIZIZ.LJIIIZ != null) {
            C786410Ut5.LJJJJIZL((FrameLayout) this.LIZLLL.findViewById(R.id.eu1));
            View view = this.LIZIZ.LJIIIZ;
            ViewParent parent = view != null ? view.getParent() : null;
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LIZIZ.LJIIIZ, viewGroup);
            }
            ((ViewGroup) this.LIZLLL.findViewById(R.id.eu1)).addView(this.LIZIZ.LJIIIZ);
        }
        Integer num = this.LIZIZ.LIZ;
        if (num != null) {
            int iIntValue = num.intValue();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(this.LIZIZ.LJIIJ);
            c384050F3z.LIZ = Integer.valueOf(iIntValue);
            this.LIZLLL.findViewById(R.id.evm).setBackground(c384050F3z.LIZ(this.LIZ));
        }
        C786410Ut5.LJZI(8, (ImageView) this.LIZLLL.findViewById(R.id.b8w));
        this.LIZIZ.getClass();
        Integer num2 = this.LIZIZ.LIZ;
        if (num2 != null) {
            drawableLIZIZ = C800330VaR.LIZIZ(this.LIZ, R.drawable.a14);
            if (drawableLIZIZ == null) {
                return;
            } else {
                C16GF.LJI(drawableLIZIZ, num2.intValue());
            }
        }
        C786410Ut5.LJZI(0, (ImageView) this.LIZLLL.findViewById(R.id.b8w));
        if (drawableLIZIZ != null) {
            ((ImageView) this.LIZLLL.findViewById(R.id.b8w)).setImageDrawable(drawableLIZIZ);
        }
    }

    public final boolean LJ() {
        this.LIZLLL.measure(0, 0);
        this.LJIIIZ = this.LIZLLL.getMeasuredWidth();
        this.LJIIJ = this.LIZLLL.getMeasuredHeight();
        this.LIZIZ.getClass();
        C15O5 c15o5 = this.LJIIJJI;
        C15O4 c15o4 = this.LIZIZ;
        int i = c15o4.LJII;
        int i2 = c15o4.LJIIIIZZ;
        int[] iArr = new int[2];
        ViewGroup viewGroup = c15o4.LIZIZ;
        if (viewGroup != null) {
            viewGroup.getLocationInWindow(iArr);
        }
        int i3 = (i + i) / 2;
        c15o5.LIZ = (i3 - (this.LJIIIZ / 2)) + this.LIZIZ.LIZJ;
        c15o5.LIZIZ = ((i2 - this.LJIIJ) - this.LJIIIIZZ) - iArr[1];
        LIZJ(c15o5, 1);
        c15o5.LIZJ = i3;
        this.LIZIZ.getClass();
        c15o5.LIZLLL = i2 - this.LJIIIIZZ;
        float f = c15o5.LIZJ;
        float f2 = this.LJI;
        float fLIZIZ = f - (f2 / 2.0f);
        int i4 = this.LJIIL;
        if (fLIZIZ < i4) {
            fLIZIZ = i4 + 0;
        } else {
            float f3 = 0;
            if (f2 + fLIZIZ + f3 > C497820Jfg.LIZIZ(this.LIZ) - this.LJIIL) {
                fLIZIZ = ((C497820Jfg.LIZIZ(this.LIZ) - this.LJIIL) - this.LJI) - f3;
            }
        }
        if (fLIZIZ < c15o5.LIZ) {
            c15o5.LIZ = C814420VxA.LIZIZ(fLIZIZ);
        } else if (this.LJI + fLIZIZ + 0 > r2 + this.LJIIIZ) {
            c15o5.LIZ = (C814420VxA.LIZIZ(fLIZIZ) + this.LJI) - this.LJIIIZ;
        }
        c15o5.LIZJ = C814420VxA.LIZIZ((this.LJI / 2.0f) + fLIZIZ);
        C786410Ut5.Hd((ImageView) this.LIZLLL.findViewById(R.id.b8w), (fLIZIZ - c15o5.LIZ) - 0);
        C1744700vVE.LJIIIIZZ(this.LJII, this.LIZLLL.findViewById(R.id.b8w));
        return LIZJ(c15o5, 0);
    }

    public final void LJFF() {
        ViewGroup viewGroup = this.LIZIZ.LIZIZ;
        if (viewGroup != null) {
            viewGroup.addView(this.LIZJ);
        }
        C786410Ut5.LJLLLLLL(0, this.LIZJ);
        this.LJFF = false;
        C786410Ut5.Ed(this.LJIIJJI.LIZ, this.LIZLLL);
        C786410Ut5.Kd(this.LJIIJJI.LIZIZ, this.LIZLLL);
        LJI(this.LJIIJJI, true);
        Function0<Unit> function0 = this.LIZIZ.LJIILJJIL;
        if (function0 != null) {
            function0.invoke();
        }
        BPEAHandler bPEAHandler = new BPEAHandler();
        ARunnableS131S0100000_31 aRunnableS131S0100000_31 = new ARunnableS131S0100000_31(this, 120);
        C15O4 c15o4 = this.LIZIZ;
        C786410Ut5.LJLIIL(c15o4.LJ + c15o4.LJFF, bPEAHandler, aRunnableS131S0100000_31);
    }

    public final void LIZ(boolean z) {
        if (!this.LJFF) {
            if (this.LIZIZ.LJIILL != null && !z) {
                if (!this.LJ) {
                    LJI(this.LJIIJJI, false);
                    this.LJ = true;
                    C786410Ut5.LJLIIL(this.LIZIZ.LJI, new BPEAHandler(), new ARunnableS131S0100000_31(this, 118));
                    return;
                }
                return;
            }
            LIZIZ();
        }
    }

    public C15O3(Context context, C15O4 c15o4) {
        this.LIZ = context;
        this.LIZIZ = c15o4;
        View viewSd = C786410Ut5.Sd(R.layout.bv9, C786410Ut5.ne(context), null);
        this.LIZJ = viewSd;
        ViewGroup viewGroup = (ViewGroup) viewSd.findViewById(R.id.ex3);
        this.LIZLLL = viewGroup;
        this.LJFF = true;
        this.LJI = c15o4.LJIIJJI;
        this.LJII = c15o4.LJIIL;
        this.LJIIIIZZ = C0H9H.LIZIZ(1);
        this.LJIIJJI = new C15O5();
        this.LJIIL = 0;
        viewGroup.setClipChildren(true);
        if (C426750GoL.LIZLLL(context)) {
            c15o4.LIZJ = -c15o4.LIZJ;
            viewGroup.findViewById(R.id.eu1).setLayoutDirection(1);
        }
        int i = c15o4.LIZLLL;
        this.LJIIL = i;
        if (i < 0) {
            this.LJIIL = 0;
        }
        this.LJIIL = this.LJIIL;
        LIZLLL();
        viewGroup.setClickable(false);
        viewSd.setOnTouchListener(null);
    }

    public final boolean LIZJ(C15O5 c15o5, int i) {
        if (i == 0) {
            int i2 = c15o5.LIZIZ;
            int i3 = this.LJIIL;
            if (i2 < i3) {
                c15o5.LIZIZ = i3;
                return false;
            }
            if (i2 + this.LJIIJ <= (C497820Jfg.LIZ(this.LIZ) + C497820Jfg.LIZJ(this.LIZ)) - this.LJIIL) {
                return true;
            }
            c15o5.LIZIZ = ((C497820Jfg.LIZ(this.LIZ) + C497820Jfg.LIZJ(this.LIZ)) - this.LJIIL) - this.LJIIJ;
            return false;
        }
        int i4 = c15o5.LIZ;
        int i5 = this.LJIIL;
        if (i4 < i5) {
            c15o5.LIZ = i5;
        } else if (i4 + this.LJIIIZ > C497820Jfg.LIZIZ(this.LIZ) - this.LJIIL) {
            c15o5.LIZ = (C497820Jfg.LIZIZ(this.LIZ) - this.LJIIIZ) - this.LJIIL;
            return true;
        }
        return true;
    }

    public final void LJI(C15O5 c15o5, boolean z) {
        long j;
        AwS645S0100000_31 awS645S0100000_31 = this.LIZIZ.LJIILL;
        if (awS645S0100000_31 != null) {
            AnimatorSet animatorSet = (AnimatorSet) awS645S0100000_31.invoke(this.LIZLLL, Boolean.valueOf(z));
            this.LJIILIIL = animatorSet;
            if (z) {
                j = this.LIZIZ.LJFF;
            } else {
                j = this.LIZIZ.LJI;
            }
            animatorSet.setDuration(j);
            this.LIZLLL.setPivotX(c15o5.LIZJ - c15o5.LIZ);
            this.LIZLLL.setPivotY(c15o5.LIZLLL - c15o5.LIZIZ);
            AnimatorSet animatorSet2 = this.LJIILIIL;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }
}
