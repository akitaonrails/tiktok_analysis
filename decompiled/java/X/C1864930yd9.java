package X;

import Y.ARunnableS60S0300000_27;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0yd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864930yd9 extends C1704130uRn {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
            default:
                super.onAnimationEnd(animator);
                break;
            case 4:
                onAnimationEnd$3(this, animator);
                break;
            case 5:
                onAnimationEnd$4(this, animator);
                break;
            case 6:
                onAnimationEnd$5(this, animator);
                break;
            case 7:
                onAnimationEnd$6(this, animator);
                break;
            case 8:
                onAnimationEnd$7(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$8(this, animator);
                break;
        }
    }

    @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (3 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationEnd$0(C1864930yd9 c1864930yd9, Animator animator) {
        ((InterfaceC1811000xEA) c1864930yd9.l0).LIZ(((C118300cf) c1864930yd9.l1).element);
    }

    public static final void onAnimationEnd$1(C1864930yd9 c1864930yd9, Animator animator) {
        ((C1843040y3q) c1864930yd9.l0).LJIILIIL.setText(((C1842470y2v) c1864930yd9.l1).LIZIZ);
        C1843040y3q c1843040y3q = (C1843040y3q) c1864930yd9.l0;
        AbstractC1842530y31.LJIIL(c1843040y3q, c1843040y3q.LJIIL, (C1842470y2v) c1864930yd9.l1, false, false, 12);
        C786410Ut5.LLIL(((C1843040y3q) c1864930yd9.l0).LJIILIIL, 0);
        C786410Ut5.S4(1.0f, ((C1843040y3q) c1864930yd9.l0).LJIILIIL);
        C786410Ut5.LJZL(0, ((C1843040y3q) c1864930yd9.l0).LJIIJJI);
        C786410Ut5.W4(((C1843040y3q) c1864930yd9.l0).LJIIJJI, 1.0f);
        C786410Ut5.LJLZ(8, ((C1843040y3q) c1864930yd9.l0).LIZLLL());
        ((C1843040y3q) c1864930yd9.l0).LJIILIIL(false);
    }

    public static final void onAnimationEnd$2(C1864930yd9 c1864930yd9, Animator animator) {
        ((C1842600y38) c1864930yd9.l0).LJIILIIL(false);
        C1842600y38 c1842600y38 = (C1842600y38) c1864930yd9.l0;
        if (!c1842600y38.LJJIJIIJI) {
            c1842600y38.LJIILIIL.setText((CharSequence) c1864930yd9.l1);
        }
        C1842600y38 c1842600y382 = (C1842600y38) c1864930yd9.l0;
        int i = c1842600y382.LJJIIZI - 1;
        c1842600y382.LJJIIZI = i;
        if (i == 0) {
            ARunnableS60S0300000_27 aRunnableS60S0300000_27 = c1842600y382.LJJIIZ;
            c1842600y382.LJJIIZ = null;
            if (aRunnableS60S0300000_27 != null) {
                aRunnableS60S0300000_27.run();
            }
        }
    }

    public static final void onAnimationEnd$3(C1864930yd9 c1864930yd9, Animator animator) {
        C20441214yg.LIZIZ("Ranking Entrance Unification", "GeneralSingleTransitionProcessor - setUpContainerWidthChangeAnimation - onAnimationEnd");
        C1843150y41 c1843150y41 = (C1843150y41) c1864930yd9.l0;
        C1842470y2v c1842470y2v = c1843150y41.LIZIZ.LJIIZILJ;
        if (c1842470y2v != null) {
            c1843150y41.LJIILIIL.setText(c1842470y2v.LIZIZ);
            AbstractC1842530y31.LJIIL(c1843150y41, c1843150y41.LJIIL, c1842470y2v, false, false, 12);
        }
        AbstractC1842530y31.LJIILJJIL(((C1843150y41) c1864930yd9.l0).LIZJ, -2);
        ((C1843150y41) c1864930yd9.l0).LIZIZ();
        final C1843150y41 c1843150y412 = (C1843150y41) c1864930yd9.l0;
        c1843150y412.LJIILL(EnumC1842640y3C.RESET, c1843150y412.LJIILIIL, ((C1842470y2v) c1864930yd9.l1).LIZIZ, -1L, new InterfaceC1704110uRl() { // from class: X.0y3w
            @Override // X.InterfaceC1704110uRl
            public final void LIZ(int i) {
                LJIILIIL(false);
            }
        }, false);
    }

    public static final void onAnimationEnd$4(C1864930yd9 c1864930yd9, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843170y43) c1864930yd9.l0).LJIIJJI);
        ((C1843170y43) c1864930yd9.l0).LJIILIIL.setText(((C1842470y2v) c1864930yd9.l1).LIZIZ);
        C1843170y43 c1843170y43 = (C1843170y43) c1864930yd9.l0;
        AbstractC1842530y31.LJIIL(c1843170y43, c1843170y43.LJIIL, (C1842470y2v) c1864930yd9.l1, false, false, 12);
    }

    public static final void onAnimationEnd$5(C1864930yd9 c1864930yd9, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843210y47) c1864930yd9.l0).LJIIJJI);
        ((C1843210y47) c1864930yd9.l0).LJIILIIL.setText(((C1842470y2v) c1864930yd9.l1).LIZIZ);
        C1843210y47 c1843210y47 = (C1843210y47) c1864930yd9.l0;
        AbstractC1842530y31.LJIIL(c1843210y47, c1843210y47.LJIIL, (C1842470y2v) c1864930yd9.l1, false, false, 12);
    }

    public static final void onAnimationEnd$6(C1864930yd9 c1864930yd9, Animator animator) {
        C786410Ut5.LJZL(8, ((C1843210y47) c1864930yd9.l0).LJIIJJI);
        ((C1843210y47) c1864930yd9.l0).LJIILIIL.setText(((C1842470y2v) c1864930yd9.l1).LIZIZ);
        C1843210y47 c1843210y47 = (C1843210y47) c1864930yd9.l0;
        AbstractC1842530y31.LJIIL(c1843210y47, c1843210y47.LJIIL, (C1842470y2v) c1864930yd9.l1, false, false, 12);
    }

    public static final void onAnimationEnd$7(C1864930yd9 c1864930yd9, Animator animator) {
        ((C1843140y40) c1864930yd9.l0).LJIILIIL.setText(((C1842470y2v) c1864930yd9.l1).LIZIZ);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((C1843140y40) c1864930yd9.l0).LJIILIIL, (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(700L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        objectAnimatorOfFloat.addListener(new C1864940ydA((C1843140y40) c1864930yd9.l0, 30));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static final void onAnimationEnd$8(C1864930yd9 c1864930yd9, Animator animator) {
        ((C1842990y3l) c1864930yd9.l0).LJFF().setText(String.valueOf(((C1843110y3x) c1864930yd9.l1).LIZIZ));
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((C1842990y3l) c1864930yd9.l0).LJFF(), (Property<TextView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(700L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        objectAnimatorOfFloat.addListener(new C1864940ydA((C1842990y3l) c1864930yd9.l0, 32));
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static final void onAnimationStart$0(C1864930yd9 c1864930yd9, Animator animator) {
        TextView textView = ((C1842980y3k) c1864930yd9.l0).LJJI;
        if (textView != null) {
            C786410Ut5.S4(1.0f, textView);
        }
        TextView textView2 = ((C1842980y3k) c1864930yd9.l0).LJJI;
        if (textView2 != null) {
            textView2.setText(String.valueOf(((C1843110y3x) c1864930yd9.l1).LIZIZ));
        }
        C1842980y3k c1842980y3k = (C1842980y3k) c1864930yd9.l0;
        TextView textView3 = c1842980y3k.LJJI;
        if (textView3 != null) {
            C786410Ut5.Mb(c1842980y3k.LIZIZ.LJIILJJIL, textView3);
        }
        C1842980y3k c1842980y3k2 = (C1842980y3k) c1864930yd9.l0;
        TextView textView4 = c1842980y3k2.LJJI;
        if (textView4 != null) {
            C786410Ut5.nc(c1842980y3k2.LIZIZ.LJIILJJIL, textView4);
        }
        C1842980y3k c1842980y3k3 = (C1842980y3k) c1864930yd9.l0;
        TextView textView5 = c1842980y3k3.LJJI;
        if (textView5 != null) {
            C786410Ut5.cd(c1842980y3k3.LIZIZ.LJIILL, textView5);
        }
        TextView textView6 = ((C1842980y3k) c1864930yd9.l0).LJJI;
        if (textView6 != null) {
            C786410Ut5.LLIL(textView6, 0);
        }
    }

    public C1864930yd9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
