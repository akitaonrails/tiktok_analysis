package Y;

import X.C19PN;
import X.C19PO;
import X.C19PP;
import X.C21576919cN;
import X.C21648419nu;
import X.EnumC21577619cU;
import X.InterfaceC21576219cG;
import X.InterfaceC21577819cW;
import X.InterfaceC21578219ca;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;

/* JADX INFO: loaded from: classes34.dex */
public class ALAdapterS14S0110000_33 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                this.z1 = true;
                break;
            case 1:
                this.z1 = true;
                break;
            case 2:
                this.z1 = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
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
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public ALAdapterS14S0110000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(ALAdapterS14S0110000_33 aLAdapterS14S0110000_33, Animator animator) {
        if (!aLAdapterS14S0110000_33.z1) {
            ((C19PN) aLAdapterS14S0110000_33.l0).LIZ();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS14S0110000_33 aLAdapterS14S0110000_33, Animator animator) {
        if (!aLAdapterS14S0110000_33.z1) {
            ((C19PO) aLAdapterS14S0110000_33.l0).LIZ();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS14S0110000_33 aLAdapterS14S0110000_33, Animator animator) {
        if (!aLAdapterS14S0110000_33.z1) {
            ((C19PP) aLAdapterS14S0110000_33.l0).LIZ();
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS14S0110000_33 aLAdapterS14S0110000_33, Animator animator) {
        float f;
        C21648419nu c21648419nu = (C21648419nu) aLAdapterS14S0110000_33.l0;
        if (aLAdapterS14S0110000_33.z1) {
            f = c21648419nu.LJI + c21648419nu.LJFF;
        } else {
            f = 0.0f;
        }
        c21648419nu.LJIIIIZZ = f;
        c21648419nu.LJIIIZ = false;
        c21648419nu.LJIIL = null;
    }

    public static final void onAnimationEnd$4(ALAdapterS14S0110000_33 aLAdapterS14S0110000_33, Animator animator) {
        ((C21576919cN) aLAdapterS14S0110000_33.l0).setStateDirectLoading(aLAdapterS14S0110000_33.z1);
    }

    public static final void onAnimationEnd$5(ALAdapterS14S0110000_33 aLAdapterS14S0110000_33, Animator animator) {
        ((C21576919cN) aLAdapterS14S0110000_33.l0).LLLLLLLLLL = System.currentTimeMillis();
        ((C21576919cN) aLAdapterS14S0110000_33.l0).LJIILIIL(EnumC21577619cU.Refreshing);
        C21576919cN c21576919cN = (C21576919cN) aLAdapterS14S0110000_33.l0;
        InterfaceC21578219ca interfaceC21578219ca = c21576919cN.LLLILZJ;
        if (interfaceC21578219ca != null) {
            if (aLAdapterS14S0110000_33.z1) {
                interfaceC21578219ca.LJFF();
            }
        } else if (c21576919cN.LLLIZZ == null) {
            c21576919cN.LJIIIIZZ(LivePreCreateNextRoomPlayer.ENABLE, Boolean.FALSE, true);
        }
        C21576919cN c21576919cN2 = (C21576919cN) aLAdapterS14S0110000_33.l0;
        InterfaceC21576219cG interfaceC21576219cG = c21576919cN2.LLLLLILLIL;
        if (interfaceC21576219cG != null) {
            int i = c21576919cN2.LLLLIIIILLL;
            interfaceC21576219cG.LIZ(c21576919cN2, i, (int) (c21576919cN2.LLLLJ * i));
        }
        C21576919cN c21576919cN3 = (C21576919cN) aLAdapterS14S0110000_33.l0;
        InterfaceC21577819cW interfaceC21577819cW = c21576919cN3.LLLIZZ;
        if (interfaceC21577819cW != null && (c21576919cN3.LLLLLILLIL instanceof InterfaceC21576219cG)) {
            if (aLAdapterS14S0110000_33.z1) {
                interfaceC21577819cW.LJFF();
            }
            ((C21576919cN) aLAdapterS14S0110000_33.l0).LLLIZZ.LJ();
        }
    }

    public ALAdapterS14S0110000_33(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
