package Y;

import X.C189200o6;
import X.C23118094a;
import X.C786410Ut5;
import X.InterfaceC20236714Gf;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public class ALAdapterS0S0500000_2 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0500000_2 aLAdapterS0S0500000_2, Animator animator) {
        if (C23118094a.LJIIIIZZ((CoroutineContext) aLAdapterS0S0500000_2.l0)) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) aLAdapterS0S0500000_2.l1;
            View view = (View) aLAdapterS0S0500000_2.l2;
            ImageView imageView = (ImageView) aLAdapterS0S0500000_2.l3;
            Function0 function0 = (Function0) aLAdapterS0S0500000_2.l4;
            C786410Ut5.LJJJLZIJ(imageView, (ViewGroup) view);
            function0.invoke();
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0500000_2 aLAdapterS0S0500000_2, Animator animator) {
        if (C23118094a.LJIIIIZZ((CoroutineContext) aLAdapterS0S0500000_2.l0)) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) aLAdapterS0S0500000_2.l1;
            View view = (View) aLAdapterS0S0500000_2.l2;
            ImageView imageView = (ImageView) aLAdapterS0S0500000_2.l3;
            Function0 function0 = (Function0) aLAdapterS0S0500000_2.l4;
            C786410Ut5.LJJJLZIJ(imageView, (ViewGroup) view);
            function0.invoke();
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS0S0500000_2 aLAdapterS0S0500000_2, Animator animator) {
        if (C23118094a.LJIIIIZZ((CoroutineContext) aLAdapterS0S0500000_2.l0)) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) aLAdapterS0S0500000_2.l1;
            View view = (View) aLAdapterS0S0500000_2.l2;
            SmartImageView smartImageView = (SmartImageView) aLAdapterS0S0500000_2.l3;
            Function0 function0 = (Function0) aLAdapterS0S0500000_2.l4;
            C786410Ut5.LJJJLZIJ(smartImageView, (ViewGroup) view);
            function0.invoke();
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
    }

    public ALAdapterS0S0500000_2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
