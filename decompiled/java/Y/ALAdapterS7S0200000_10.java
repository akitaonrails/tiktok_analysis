package Y;

import X.C0R11;
import X.C677190QhJ;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem;

/* JADX INFO: loaded from: classes11.dex */
public class ALAdapterS7S0200000_10 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onAnimationEnd$0(ALAdapterS7S0200000_10 aLAdapterS7S0200000_10, Animator animator) {
        ViewGroup viewGroup;
        ViewParent parent = ((View) aLAdapterS7S0200000_10.l0).getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null && ((MixFloatingLayerAssem) aLAdapterS7S0200000_10.l1).LLJJ) {
            C786410Ut5.LJJJJI(viewGroup);
            C786410Ut5.LJLZ(8, viewGroup);
        }
        MixFloatingLayerAssem mixFloatingLayerAssem = (MixFloatingLayerAssem) aLAdapterS7S0200000_10.l1;
        if (mixFloatingLayerAssem.LLJJ) {
            C786410Ut5.fd(mixFloatingLayerAssem.ap(), 0.0f);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS7S0200000_10 aLAdapterS7S0200000_10, Animator animator) {
        super.onAnimationEnd(animator);
        ((C0R11) aLAdapterS7S0200000_10.l0).getClass();
    }

    public static final void onAnimationEnd$2(ALAdapterS7S0200000_10 aLAdapterS7S0200000_10, Animator animator) {
        super.onAnimationEnd(animator);
        C0R11 c0r11 = (C0R11) aLAdapterS7S0200000_10.l0;
        View view = (View) aLAdapterS7S0200000_10.l1;
        if (!c0r11.LL) {
            ((C677190QhJ) c0r11).LLILLL.invoke(view);
            c0r11.LL = true;
            if (view != null) {
                HandlerHook.viewPostDelay(view, c0r11.LLILLJJLI, 700L);
            }
        }
    }

    public ALAdapterS7S0200000_10(View view, MixFloatingLayerAssem mixFloatingLayerAssem, int i) {
        this.$t = i;
        this.l0 = view;
        this.l1 = mixFloatingLayerAssem;
    }

    public ALAdapterS7S0200000_10(C0R11 c0r11, View view, MotionEvent motionEvent, int i) {
        this.$t = i;
        this.l0 = c0r11;
        this.l1 = view;
    }
}
