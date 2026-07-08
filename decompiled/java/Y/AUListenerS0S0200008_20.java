package Y;

import X.AbstractC1313520kHm;
import X.C1313230kHJ;
import X.C1313490kHj;
import X.C1313580kHs;
import X.C786410Ut5;
import X.InterfaceC1298200jt4;
import X.InterfaceC1313090kH5;
import android.animation.ValueAnimator;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;

/* JADX INFO: loaded from: classes21.dex */
public class AUListenerS0S0200008_20 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f2;
    public float f3;
    public float f4;
    public float f5;
    public float f6;
    public float f7;
    public float f8;
    public float f9;
    public Object l0;
    public Object l1;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS0S0200008_20 aUListenerS0S0200008_20, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C786410Ut5.Jc(((LynxUI) aUListenerS0S0200008_20.l1).mView, aUListenerS0S0200008_20.f2 + ((((C1313230kHJ) aUListenerS0S0200008_20.l0).LJIIIZ() - aUListenerS0S0200008_20.f2) * animatedFraction));
        C786410Ut5.ed(((LynxUI) aUListenerS0S0200008_20.l1).mView, aUListenerS0S0200008_20.f3 + ((((C1313230kHJ) aUListenerS0S0200008_20.l0).LJIIJ() - aUListenerS0S0200008_20.f3) * animatedFraction));
        ((LynxUI) aUListenerS0S0200008_20.l1).mView.setTranslationZ(aUListenerS0S0200008_20.f4 + ((((C1313230kHJ) aUListenerS0S0200008_20.l0).LJIIJJI() - aUListenerS0S0200008_20.f4) * animatedFraction));
        C786410Ut5.Ab(((LynxUI) aUListenerS0S0200008_20.l1).mView, aUListenerS0S0200008_20.f5 + ((((C1313230kHJ) aUListenerS0S0200008_20.l0).LIZJ() - aUListenerS0S0200008_20.f5) * animatedFraction));
        C786410Ut5.Hb(((LynxUI) aUListenerS0S0200008_20.l1).mView, aUListenerS0S0200008_20.f6 + ((((C1313230kHJ) aUListenerS0S0200008_20.l0).LIZLLL() - aUListenerS0S0200008_20.f6) * animatedFraction));
        C786410Ut5.Ib(((LynxUI) aUListenerS0S0200008_20.l1).mView, aUListenerS0S0200008_20.f7 + ((((C1313230kHJ) aUListenerS0S0200008_20.l0).LJ() - aUListenerS0S0200008_20.f7) * animatedFraction));
        C786410Ut5.Ob(((LynxUI) aUListenerS0S0200008_20.l1).mView, aUListenerS0S0200008_20.f8 + ((((C1313230kHJ) aUListenerS0S0200008_20.l0).LJFF() - aUListenerS0S0200008_20.f8) * animatedFraction));
        C786410Ut5.pc(((LynxUI) aUListenerS0S0200008_20.l1).mView, aUListenerS0S0200008_20.f9 + (animatedFraction * (((C1313230kHJ) aUListenerS0S0200008_20.l0).LJI() - aUListenerS0S0200008_20.f9)));
        InterfaceC1313090kH5 interfaceC1313090kH5 = ((LynxUI) aUListenerS0S0200008_20.l1).mParent;
        if (interfaceC1313090kH5 instanceof UIShadowProxy) {
            ((UIShadowProxy) interfaceC1313090kH5).LJJIJ();
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0200008_20 aUListenerS0S0200008_20, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C786410Ut5.Jc(((AbstractC1313520kHm) aUListenerS0S0200008_20.l1).LLLLLILLIL, aUListenerS0S0200008_20.f2 + ((((C1313580kHs) aUListenerS0S0200008_20.l0).LJFF() - aUListenerS0S0200008_20.f2) * animatedFraction));
        C786410Ut5.ed(((AbstractC1313520kHm) aUListenerS0S0200008_20.l1).LLLLLILLIL, aUListenerS0S0200008_20.f3 + ((((C1313580kHs) aUListenerS0S0200008_20.l0).LJI() - aUListenerS0S0200008_20.f3) * animatedFraction));
        ((AbstractC1313520kHm) aUListenerS0S0200008_20.l1).LLLLLILLIL.setTranslationZ(aUListenerS0S0200008_20.f4 + ((((C1313580kHs) aUListenerS0S0200008_20.l0).LJII() - aUListenerS0S0200008_20.f4) * animatedFraction));
        C786410Ut5.Ab(((AbstractC1313520kHm) aUListenerS0S0200008_20.l1).LLLLLILLIL, aUListenerS0S0200008_20.f5 + ((((C1313580kHs) aUListenerS0S0200008_20.l0).LIZ() - aUListenerS0S0200008_20.f5) * animatedFraction));
        C786410Ut5.Hb(((AbstractC1313520kHm) aUListenerS0S0200008_20.l1).LLLLLILLIL, aUListenerS0S0200008_20.f6 + ((((C1313580kHs) aUListenerS0S0200008_20.l0).LIZIZ() - aUListenerS0S0200008_20.f6) * animatedFraction));
        C786410Ut5.Ib(((AbstractC1313520kHm) aUListenerS0S0200008_20.l1).LLLLLILLIL, aUListenerS0S0200008_20.f7 + ((((C1313580kHs) aUListenerS0S0200008_20.l0).LIZJ() - aUListenerS0S0200008_20.f7) * animatedFraction));
        C786410Ut5.Ob(((AbstractC1313520kHm) aUListenerS0S0200008_20.l1).LLLLLILLIL, aUListenerS0S0200008_20.f8 + ((((C1313580kHs) aUListenerS0S0200008_20.l0).LIZLLL() - aUListenerS0S0200008_20.f8) * animatedFraction));
        C786410Ut5.pc(((AbstractC1313520kHm) aUListenerS0S0200008_20.l1).LLLLLILLIL, aUListenerS0S0200008_20.f9 + (animatedFraction * (((C1313580kHs) aUListenerS0S0200008_20.l0).LJ() - aUListenerS0S0200008_20.f9)));
        InterfaceC1298200jt4 interfaceC1298200jt4 = ((AbstractC1313520kHm) aUListenerS0S0200008_20.l1).LLILZLL;
        if (interfaceC1298200jt4 instanceof C1313490kHj) {
            ((SDUIBaseUI) interfaceC1298200jt4).LJJJJZ();
        }
    }

    public AUListenerS0S0200008_20(float f, Object obj, Object obj2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i) {
        this.$t = i;
        this.f2 = f;
        this.l0 = obj;
        this.l1 = obj2;
        this.f3 = f2;
        this.f4 = f3;
        this.f5 = f4;
        this.f6 = f5;
        this.f7 = f6;
        this.f8 = f7;
        this.f9 = f8;
    }
}
