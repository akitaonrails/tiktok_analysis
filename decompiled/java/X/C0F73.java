package X;

import Y.ARunnableS105S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F73, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F73 {
    public final View LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public boolean LJI;
    public Float LJII;
    public Integer LJIIIIZZ;
    public Integer LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public ARunnableS105S0100000_5 LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public final long LJIJJ;

    public final void LIZJ() {
        ViewGroup.LayoutParams layoutParams;
        View view;
        int iIntValue;
        View view2 = (View) this.LJFF.getValue();
        if (view2 == null || (layoutParams = view2.getLayoutParams()) == null || (view = (View) this.LIZLLL.getValue()) == null) {
            return;
        }
        View view3 = (View) this.LIZIZ.getValue();
        int iIntValue2 = 0;
        if (view3 != null) {
            Integer numValueOf = Integer.valueOf(view3.getHeight());
            iIntValue = numValueOf.intValue() > 0 ? numValueOf.intValue() : view3.getMeasuredHeight();
        } else {
            iIntValue = 0;
        }
        View view4 = (View) this.LIZJ.getValue();
        if (view4 != null) {
            Integer numValueOf2 = Integer.valueOf(view4.getHeight());
            iIntValue2 = numValueOf2.intValue() > 0 ? numValueOf2.intValue() : view4.getMeasuredHeight();
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = Integer.valueOf(layoutParams.height);
        }
        int top = (((int) (view.getTop() + view.getTranslationY())) - iIntValue) - iIntValue2;
        int i = this.LJIILIIL;
        if (top < i) {
            top = i;
        }
        if (layoutParams.height != top) {
            layoutParams.height = top;
            C786410Ut5.W5(view2, layoutParams);
        }
    }

    public C0F73(C385350F8z c385350F8z) {
        this.LIZ = c385350F8z;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZIZ = C452501pT.LIZ(enumC452301pR, new AwS549S0100000_5(this, 246));
        this.LIZJ = C452501pT.LIZ(enumC452301pR, new AwS549S0100000_5(this, 247));
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, new AwS549S0100000_5(this, 244));
        this.LJ = C452501pT.LIZ(enumC452301pR, new AwS549S0100000_5(this, 243));
        this.LJFF = C452501pT.LIZ(enumC452301pR, new AwS549S0100000_5(this, 245));
        this.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        this.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        this.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(127));
        this.LJIILIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(168));
        this.LJIJ = -1;
        this.LJIJI = -1;
        this.LJIJJ = 80L;
    }

    public final void LIZ(long j) {
        ARunnableS105S0100000_5 aRunnableS105S0100000_5 = this.LJIIZILJ;
        if (aRunnableS105S0100000_5 != null) {
            HandlerHook.viewRemoveCallbacks(this.LIZ, aRunnableS105S0100000_5);
        }
        ARunnableS105S0100000_5 aRunnableS105S0100000_52 = new ARunnableS105S0100000_5(this, 29);
        this.LJIIZILJ = aRunnableS105S0100000_52;
        if (j > 0) {
            HandlerHook.viewPostDelay(this.LIZ, aRunnableS105S0100000_52, j);
        } else {
            this.LIZ.postOnAnimation(aRunnableS105S0100000_52);
        }
    }

    public final void LIZIZ(int i, C385350F8z c385350F8z) {
        View view;
        C20244914Jj c20244914JjLIZ;
        int i2;
        C20244914Jj c20244914JjLIZ2;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = c385350F8z.getLayoutParams();
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.height = i;
        C786410Ut5.W5(c385350F8z, layoutParams2);
        Object parent = c385350F8z.getParent();
        if (parent instanceof View) {
            view = (View) parent;
            if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                layoutParams.height = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                C786410Ut5.W5(view, layoutParams);
            }
        } else {
            view = null;
        }
        View view2 = (View) this.LIZLLL.getValue();
        if (view2 != null) {
            C20246014Ju c20246014JuLIZ = C14K4.LIZ(this.LIZ);
            int i3 = 0;
            if (c20246014JuLIZ != null && (c20244914JjLIZ = c20246014JuLIZ.LIZ(8)) != null && (i2 = c20244914JjLIZ.LIZLLL) > 0) {
                if (c20246014JuLIZ != null && (c20244914JjLIZ2 = c20246014JuLIZ.LIZ(2)) != null) {
                    int i4 = c20244914JjLIZ2.LIZLLL;
                    if (i4 >= 0) {
                        i3 = i4;
                    }
                    Integer numValueOf = Integer.valueOf(i3);
                    if (numValueOf != null) {
                        this.LJIILL = numValueOf.intValue();
                    }
                }
                LIZLLL(i2, view2);
            }
        }
        c385350F8z.requestLayout();
        if (view != null) {
            view.requestLayout();
        }
        HandlerHook.viewPost(c385350F8z, new ARunnableS105S0100000_5(this, 30));
    }

    public final void LIZLLL(int i, View view) {
        float translationY;
        if (i <= 0) {
            return;
        }
        Float f = this.LJII;
        if (f != null) {
            translationY = f.floatValue();
        } else {
            translationY = view.getTranslationY();
        }
        float f2 = translationY - ((i - this.LJIILL) + this.LJIIJ);
        if (view.getTranslationY() != f2) {
            C786410Ut5.ed(view, f2);
        }
    }
}
