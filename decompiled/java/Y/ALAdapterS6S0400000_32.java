package Y;

import X.AnonymousClass1914;
import X.C013C;
import X.C118300cf;
import X.C21267318Kp;
import X.C21465618zW;
import X.C214696190k;
import X.C214711190z;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS6S0400000_32 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS6S0400000_32 aLAdapterS6S0400000_32, Animator animator) {
        super.onAnimationEnd(animator);
        for (AnonymousClass1914 anonymousClass1914 : (List) aLAdapterS6S0400000_32.l1) {
            anonymousClass1914.LIZJ.LIZIZ(true);
            C21465618zW.LIZJ(anonymousClass1914.LIZIZ);
            C786410Ut5.LJLLLLLL(0, anonymousClass1914.LIZIZ);
            C786410Ut5.LJLLLLLL(0, anonymousClass1914.LIZ);
        }
        if (((C214711190z) aLAdapterS6S0400000_32.l3).LIZLLL) {
            C214696190k.LIZ((ViewGroup) ((View) aLAdapterS6S0400000_32.l0).getRootView(), false);
        }
        ((Runnable) aLAdapterS6S0400000_32.l2).run();
    }

    public static final void onAnimationEnd$1(ALAdapterS6S0400000_32 aLAdapterS6S0400000_32, Animator animator) {
        super.onAnimationEnd(animator);
        for (AnonymousClass1914 anonymousClass1914 : (List) aLAdapterS6S0400000_32.l1) {
            anonymousClass1914.LIZJ.LIZIZ(false);
            C21465618zW.LIZJ(anonymousClass1914.LIZ);
            C786410Ut5.LJLLLLLL(0, anonymousClass1914.LIZIZ);
            C786410Ut5.LJLLLLLL(0, anonymousClass1914.LIZ);
        }
        if (((C214711190z) aLAdapterS6S0400000_32.l3).LIZLLL) {
            C214696190k.LIZ((ViewGroup) ((View) aLAdapterS6S0400000_32.l0).getRootView(), false);
        }
        ((Runnable) aLAdapterS6S0400000_32.l2).run();
    }

    public static final void onAnimationEnd$2(ALAdapterS6S0400000_32 aLAdapterS6S0400000_32, Animator animator) {
        C118300cf c118300cf = (C118300cf) aLAdapterS6S0400000_32.l0;
        int i = c118300cf.element - 1;
        c118300cf.element = i;
        if (i <= 0) {
            C013C c013c = (C013C) aLAdapterS6S0400000_32.l1;
            if (!c013c.element) {
                c013c.element = true;
                ((C21267318Kp) aLAdapterS6S0400000_32.l2).getClass();
                Function0 function0 = (Function0) aLAdapterS6S0400000_32.l3;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final void onAnimationStart$0(ALAdapterS6S0400000_32 aLAdapterS6S0400000_32, Animator animator) {
        super.onAnimationStart(animator);
        if (((C214711190z) aLAdapterS6S0400000_32.l3).LIZLLL) {
            C214696190k.LIZ((ViewGroup) ((View) aLAdapterS6S0400000_32.l0).getRootView(), true);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS6S0400000_32 aLAdapterS6S0400000_32, Animator animator) {
        super.onAnimationStart(animator);
        if (((C214711190z) aLAdapterS6S0400000_32.l3).LIZLLL) {
            C214696190k.LIZ((ViewGroup) ((View) aLAdapterS6S0400000_32.l0).getRootView(), true);
        }
    }

    public ALAdapterS6S0400000_32(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
