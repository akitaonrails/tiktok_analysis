package Y;

import X.C183F;
import X.C212203182n;
import X.C212206182q;
import android.animation.Animator;

/* JADX INFO: loaded from: classes33.dex */
public class AAListenerS70S0110000_32 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    public static final void onAnimationRepeat$0(AAListenerS70S0110000_32 aAListenerS70S0110000_32, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS70S0110000_32 aAListenerS70S0110000_32, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(AAListenerS70S0110000_32 aAListenerS70S0110000_32, Animator animator) {
        C212203182n c212203182n = (C212203182n) aAListenerS70S0110000_32.l0;
        c212203182n.LLILZLL = 1;
        if (aAListenerS70S0110000_32.z1) {
            c212203182n.LJIILLIIL();
        } else {
            c212203182n.LJIIZILJ();
        }
        ((C212203182n) aAListenerS70S0110000_32.l0).LLILZIL = null;
    }

    public static final void onAnimationCancel$1(AAListenerS70S0110000_32 aAListenerS70S0110000_32, Animator animator) {
        C212206182q c212206182q = (C212206182q) aAListenerS70S0110000_32.l0;
        c212206182q.LLIZ = 1;
        if (aAListenerS70S0110000_32.z1) {
            c212206182q.LJIIZILJ();
        } else {
            c212206182q.LJIJ();
        }
        ((C212206182q) aAListenerS70S0110000_32.l0).LLILZLL = null;
    }

    public static final void onAnimationEnd$0(AAListenerS70S0110000_32 aAListenerS70S0110000_32, Animator animator) {
        C212203182n c212203182n = (C212203182n) aAListenerS70S0110000_32.l0;
        boolean z = aAListenerS70S0110000_32.z1;
        c212203182n.LLILZLL = 1;
        C183F c183f = c212203182n.LLIZ;
        if (c183f != null) {
            c183f.onDismiss();
        }
        if (z) {
            c212203182n.LJIILLIIL();
        } else {
            c212203182n.LJIIZILJ();
        }
        c212203182n.LLILZIL = null;
    }

    public static final void onAnimationEnd$1(AAListenerS70S0110000_32 aAListenerS70S0110000_32, Animator animator) {
        C212206182q c212206182q = (C212206182q) aAListenerS70S0110000_32.l0;
        boolean z = aAListenerS70S0110000_32.z1;
        c212206182q.LLIZ = 1;
        c212206182q.LJIJI();
        C183F c183f = c212206182q.LLIZLLLIL;
        if (c183f != null) {
            c183f.onDismiss();
        }
        if (z) {
            c212206182q.LJIIZILJ();
        } else {
            c212206182q.LJIJ();
        }
        c212206182q.LLILZLL = null;
    }

    public static final void onAnimationStart$0(AAListenerS70S0110000_32 aAListenerS70S0110000_32, Animator animator) {
        ((C212203182n) aAListenerS70S0110000_32.l0).LLILZLL = 4;
    }

    public static final void onAnimationStart$1(AAListenerS70S0110000_32 aAListenerS70S0110000_32, Animator animator) {
        ((C212206182q) aAListenerS70S0110000_32.l0).LLIZ = 4;
    }

    public AAListenerS70S0110000_32(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
