package Y;

import X.C1762400vxm;
import X.C1765720w38;
import X.EnumC1508450pMB;
import X.KeyEventCallbackC1765760w3C;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class ALAdapterS20S0200000_26 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationStart$0(ALAdapterS20S0200000_26 aLAdapterS20S0200000_26, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS20S0200000_26 aLAdapterS20S0200000_26, Animator animator) {
        ((C1762400vxm) aLAdapterS20S0200000_26.l0).LLJJI = false;
        Function0 function0 = (Function0) aLAdapterS20S0200000_26.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS20S0200000_26 aLAdapterS20S0200000_26, Animator animator) {
        KeyEventCallbackC1765760w3C.LLJJIII = EnumC1508450pMB.PORTRAIT;
        KeyEventCallbackC1765760w3C.LIZJ((C1765720w38) aLAdapterS20S0200000_26.l0);
        ViewGroup.LayoutParams layoutParams = ((C1765720w38) aLAdapterS20S0200000_26.l0).getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        C1765720w38 c1765720w38 = (C1765720w38) aLAdapterS20S0200000_26.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1765720w38);
        c1765720w38.setLayoutParams(layoutParams);
        KeyEventCallbackC1765760w3C.LIZ((C1765720w38) aLAdapterS20S0200000_26.l0, (ViewGroup) aLAdapterS20S0200000_26.l1, Integer.valueOf(r2.getChildCount() - 1));
        C1765720w38 c1765720w382 = KeyEventCallbackC1765760w3C.LLIZLLLIL;
        if (c1765720w382 != null) {
            c1765720w382.LJ(KeyEventCallbackC1765760w3C.LLJJIII);
        }
        ImageView imageView = KeyEventCallbackC1765760w3C.LLJILJIL;
        if (imageView != null) {
            HandlerHook.viewPost(imageView, new ARunnableS126S0100000_26(imageView, 129));
        }
    }

    public ALAdapterS20S0200000_26(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
