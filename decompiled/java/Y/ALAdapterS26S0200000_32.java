package Y;

import X.AbstractC21463118z7;
import X.AnonymousClass1853;
import X.AnonymousClass1863;
import X.AnonymousClass1964;
import X.C118300cf;
import X.C1295960jpS;
import X.C185H;
import X.C185I;
import X.C185K;
import X.C187I;
import X.C18RL;
import X.C191C;
import X.C191E;
import X.C212334187o;
import X.C212360188o;
import X.C2187451AjH;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C830490Whz;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.favorites.business.video.FavoriteVideoTabRootFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS26S0200000_32 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (4 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
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
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$8(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        switch (this.$t) {
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$0(this, animator, z);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            default:
                super.onAnimationEnd(animator, z);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$1(this, animator, z);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$2(this, animator, z);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 8:
                onAnimationStart$1(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$2(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        super.onAnimationCancel(animator);
        ((C18RL) aLAdapterS26S0200000_32.l0).LIZ.getWindow().getDecorView().setBackground((Drawable) aLAdapterS26S0200000_32.l1);
        int i = C2187451AjH.LIZ;
    }

    public static final void onAnimationEnd$0(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        super.onAnimationEnd(animator);
        ((C191E) aLAdapterS26S0200000_32.l0).LIZ(1.0f);
        C191C c191c = (C191C) aLAdapterS26S0200000_32.l1;
        c191c.LJ(c191c.LLILLL);
    }

    public static final void onAnimationEnd$1(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        if (((FavoriteVideoTabRootFragment) aLAdapterS26S0200000_32.l0).isAdded()) {
            ((FavoriteVideoTabRootFragment) aLAdapterS26S0200000_32.l0).NR((Fragment) aLAdapterS26S0200000_32.l1);
        }
        ((FavoriteVideoTabRootFragment) aLAdapterS26S0200000_32.l0).LLIZLLLIL = null;
    }

    public static final void onAnimationEnd$2(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        float f;
        ((AnonymousClass1863) aLAdapterS26S0200000_32.l0).LJIIL((C185H) aLAdapterS26S0200000_32.l1, false, true);
        LinearLayout linearLayoutLJJI = ((AnonymousClass1863) aLAdapterS26S0200000_32.l0).LJJI();
        if (((AnonymousClass1863) aLAdapterS26S0200000_32.l0).LJJI().getVisibility() == 0) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.W4(linearLayoutLJJI, f);
        C786410Ut5.hd(((AnonymousClass1863) aLAdapterS26S0200000_32.l0).LJJI(), 0.0f);
    }

    public static final void onAnimationEnd$3(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        C1295960jpS c1295960jpS = (C1295960jpS) aLAdapterS26S0200000_32.l0;
        c1295960jpS.setFrame((int) c1295960jpS.getMaxFrame());
        ((AnonymousClass1964) aLAdapterS26S0200000_32.l1).LLJJIII.run();
    }

    public static final void onAnimationEnd$4(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        ((C18RL) aLAdapterS26S0200000_32.l0).LIZ.getWindow().getDecorView().setBackground((Drawable) aLAdapterS26S0200000_32.l1);
        int i = C2187451AjH.LIZ;
    }

    public static final void onAnimationEnd$5(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        ((C212360188o) aLAdapterS26S0200000_32.l0).LJII(0.0f);
        ((Function0) aLAdapterS26S0200000_32.l1).invoke();
    }

    public static final void onAnimationEnd$6(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        C118300cf c118300cf = (C118300cf) aLAdapterS26S0200000_32.l0;
        int i = c118300cf.element - 1;
        c118300cf.element = i;
        if (i == 0) {
            ((Function0) aLAdapterS26S0200000_32.l1).invoke();
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        C118300cf c118300cf = (C118300cf) aLAdapterS26S0200000_32.l0;
        int i = c118300cf.element - 1;
        c118300cf.element = i;
        if (i == 0) {
            ((Function0) aLAdapterS26S0200000_32.l1).invoke();
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        ((C830490Whz) aLAdapterS26S0200000_32.l0).remove(animator);
        ((AbstractC21463118z7) aLAdapterS26S0200000_32.l1).LLJJ.remove(animator);
    }

    public static final void onAnimationStart$0(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        super.onAnimationStart(animator);
        C191C c191c = (C191C) aLAdapterS26S0200000_32.l1;
        c191c.LJFF(c191c.LLILLL);
    }

    public static final void onAnimationStart$1(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        long jLongValue;
        super.onAnimationStart(animator);
        C212334187o c212334187o = (C212334187o) aLAdapterS26S0200000_32.l0;
        Long l = (Long) aLAdapterS26S0200000_32.l1;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 1;
        }
        c212334187o.setCountDownText(jLongValue);
    }

    public static final void onAnimationStart$2(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator) {
        ((AbstractC21463118z7) aLAdapterS26S0200000_32.l1).LLJJ.add(animator);
    }

    public ALAdapterS26S0200000_32(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }

    public static final void onAnimationEnd$0(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator, boolean z) {
        ((C187I) aLAdapterS26S0200000_32.l0).LJIJJLI(false);
        Function0 function0 = (Function0) aLAdapterS26S0200000_32.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator, boolean z) {
        ((AnonymousClass1853) aLAdapterS26S0200000_32.l0).LLLFFI.LJIJJLI((C185I) aLAdapterS26S0200000_32.l1);
    }

    public static final void onAnimationEnd$2(ALAdapterS26S0200000_32 aLAdapterS26S0200000_32, Animator animator, boolean z) {
        boolean z2;
        int measuredHeight;
        View viewLJJI;
        ((AnonymousClass1853) aLAdapterS26S0200000_32.l0).LLLILZ.LJJIIJZLJL((C185K) aLAdapterS26S0200000_32.l1);
        AnonymousClass1863 anonymousClass1863 = ((AnonymousClass1853) aLAdapterS26S0200000_32.l0).LLLILZ;
        C185K c185k = anonymousClass1863.LIZLLL;
        if (c185k != null) {
            Animator animator2 = anonymousClass1863.LJFF;
            if (animator2 != null) {
                animator2.cancel();
            }
            anonymousClass1863.LJJIII(c185k, false, false, true);
            if (AnonymousClass1863.LJJIIZ(c185k.LIZ)) {
                anonymousClass1863.LJJIIJ();
                return;
            }
            int i = c185k.LIZIZ.LIZ;
            anonymousClass1863.LJJIIJ();
            Integer numValueOf = Integer.valueOf(anonymousClass1863.LJIJ().getHeight());
            if (numValueOf.intValue() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                measuredHeight = numValueOf.intValue();
            } else {
                measuredHeight = anonymousClass1863.LJIJ().getMeasuredHeight();
            }
            anonymousClass1863.LJIJ().setClipBounds(new Rect(0, 0, 0, measuredHeight));
            C786410Ut5.B5(anonymousClass1863.LJJ(), 0.0f);
            C786410Ut5.Vc(anonymousClass1863.LJJ(), -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            if (i == 0) {
                viewLJJI = anonymousClass1863.LJIJI();
            } else {
                viewLJJI = anonymousClass1863.LJJI();
            }
            if (viewLJJI != null && viewLJJI.getVisibility() == 0) {
                C786410Ut5.T4(viewLJJI, 0.0f);
                C786410Ut5.Jc(viewLJJI, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            }
            ARunnableS101S0200000_32 aRunnableS101S0200000_32 = anonymousClass1863.LJII;
            if (aRunnableS101S0200000_32 != null) {
                HandlerHook.viewRemoveCallbacks(anonymousClass1863.LIZ, aRunnableS101S0200000_32);
            }
            anonymousClass1863.LJII = new ARunnableS101S0200000_32(anonymousClass1863, c185k, 27);
            FrameLayout frameLayout = (FrameLayout) anonymousClass1863.LIZ;
            C786410Ut5.LJZ(0, frameLayout);
            C786410Ut5.U4(frameLayout, 1.0f);
            HandlerHook.viewPost(frameLayout, anonymousClass1863.LJII);
        }
    }
}
