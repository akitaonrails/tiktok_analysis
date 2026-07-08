package Y;

import X.C01TT;
import X.C1143100fqu;
import X.C1324720kZq;
import X.C15DF;
import X.C15IT;
import X.C16F4;
import X.C16FS;
import X.C204744159q;
import X.C20519915Rd;
import X.C20588315hJ;
import X.C786410Ut5;
import X.C978940ba8;
import X.EnumC452820HpI;
import X.InterfaceC20588415hK;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public class ALAdapterS25S0200000_31 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                break;
            case 2:
                onAnimationCancel$1(this, animator);
                break;
            case 3:
            case 4:
            case 7:
            default:
                super.onAnimationCancel(animator);
                break;
            case 5:
                onAnimationCancel$2(this, animator);
                break;
            case 6:
                onAnimationCancel$3(this, animator);
                break;
            case 8:
                onAnimationCancel$4(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationCancel$5(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationCancel$6(this, animator);
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
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$11(this, animator);
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
                super.onAnimationStart(animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
            case 4:
            case 7:
            case 8:
            default:
                super.onAnimationStart(animator);
                break;
            case 5:
                onAnimationStart$4(this, animator);
                break;
            case 6:
                onAnimationStart$5(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                super.onAnimationStart(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationCancel(animator);
        ((C1143100fqu) aLAdapterS25S0200000_31.l0).LJFF();
        C786410Ut5.LLLILZ((C1143100fqu) aLAdapterS25S0200000_31.l0, 8);
        C786410Ut5.LLJJIII(((C978940ba8) aLAdapterS25S0200000_31.l1).LL, 0);
    }

    public static final void onAnimationCancel$1(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationCancel(animator);
        ((C1143100fqu) aLAdapterS25S0200000_31.l0).LJFF();
        C786410Ut5.LLLILZ((C1143100fqu) aLAdapterS25S0200000_31.l0, 8);
        C786410Ut5.LLJJIII(((C978940ba8) aLAdapterS25S0200000_31.l1).LL, 0);
    }

    public static final void onAnimationCancel$2(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationCancel(animator);
        ((C16F4) aLAdapterS25S0200000_31.l1).LIZIZ((ImageView) aLAdapterS25S0200000_31.l0);
    }

    public static final void onAnimationCancel$3(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        ((C204744159q) aLAdapterS25S0200000_31.l0).LLJJIJI = true;
    }

    public static final void onAnimationCancel$4(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        ((C16FS) aLAdapterS25S0200000_31.l0).setTextColor((ColorStateList) aLAdapterS25S0200000_31.l1);
    }

    public static final void onAnimationCancel$5(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationCancel(animator);
        ((C16F4) aLAdapterS25S0200000_31.l1).LIZIZ((ImageView) aLAdapterS25S0200000_31.l0);
    }

    public static final void onAnimationCancel$6(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationCancel(animator);
        ((C16F4) aLAdapterS25S0200000_31.l1).LIZIZ((ImageView) aLAdapterS25S0200000_31.l0);
    }

    public static final void onAnimationEnd$0(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        ((AnimatorSet) aLAdapterS25S0200000_31.l1).start();
        C15IT c15it = (C15IT) aLAdapterS25S0200000_31.l0;
        if (c15it != null) {
            c15it.onStateChange(1);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1143100fqu) aLAdapterS25S0200000_31.l0).LJFF();
        C786410Ut5.LLLILZ((C1143100fqu) aLAdapterS25S0200000_31.l0, 8);
        C786410Ut5.LLJJIII(((C978940ba8) aLAdapterS25S0200000_31.l1).LL, 0);
    }

    public static final void onAnimationEnd$10(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.V4((ImageView) aLAdapterS25S0200000_31.l0, 0.0f);
        C786410Ut5.Lc((ImageView) aLAdapterS25S0200000_31.l0, 0.0f);
        C786410Ut5.gd((ImageView) aLAdapterS25S0200000_31.l0, 0.0f);
        ((C16F4) aLAdapterS25S0200000_31.l1).LIZIZ((ImageView) aLAdapterS25S0200000_31.l0);
    }

    public static final void onAnimationEnd$11(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        C01TT.LIZLLL(new AwS432S0200000_31((C20519915Rd) aLAdapterS25S0200000_31.l0, (View) aLAdapterS25S0200000_31.l1, 131));
    }

    public static final void onAnimationEnd$2(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1143100fqu) aLAdapterS25S0200000_31.l0).LJFF();
        C786410Ut5.LLLILZ((C1143100fqu) aLAdapterS25S0200000_31.l0, 8);
        C786410Ut5.LLJJIII(((C978940ba8) aLAdapterS25S0200000_31.l1).LL, 0);
    }

    public static final void onAnimationEnd$3(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        ((AnimatorSet) aLAdapterS25S0200000_31.l1).start();
        InterfaceC20588415hK interfaceC20588415hK = ((C20588315hJ) aLAdapterS25S0200000_31.l0).LL;
        if (interfaceC20588415hK != null) {
            interfaceC20588415hK.onStateChange(1);
        }
        ((C20588315hJ) aLAdapterS25S0200000_31.l0).getClass();
    }

    public static final void onAnimationEnd$4(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS25S0200000_31.l0);
        C786410Ut5.LLJJIII((C1324720kZq) aLAdapterS25S0200000_31.l1, 8);
        C786410Ut5.h5((C1324720kZq) aLAdapterS25S0200000_31.l1, 1.0f);
        C786410Ut5.Qc((C1324720kZq) aLAdapterS25S0200000_31.l1, 0.0f);
    }

    public static final void onAnimationEnd$5(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationEnd(animator);
        ((C16F4) aLAdapterS25S0200000_31.l1).LIZIZ((ImageView) aLAdapterS25S0200000_31.l0);
    }

    public static final void onAnimationEnd$6(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        ((C204744159q) aLAdapterS25S0200000_31.l0).animate().setListener(null);
        C204744159q c204744159q = (C204744159q) aLAdapterS25S0200000_31.l0;
        if (c204744159q.LLJJIJI) {
            c204744159q.LJ(EnumC452820HpI.INTERRUPTED, false);
        } else {
            c204744159q.LJ((EnumC452820HpI) aLAdapterS25S0200000_31.l1, false);
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        ((C15DF) aLAdapterS25S0200000_31.l0).LIZJ(new AwS575S0100000_31((TuxTextView) aLAdapterS25S0200000_31.l1, 1332));
    }

    public static final void onAnimationEnd$8(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        ((C16FS) aLAdapterS25S0200000_31.l0).setTextColor((ColorStateList) aLAdapterS25S0200000_31.l1);
    }

    public static final void onAnimationEnd$9(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.V4((ImageView) aLAdapterS25S0200000_31.l0, 0.0f);
        C786410Ut5.Lc((ImageView) aLAdapterS25S0200000_31.l0, 0.0f);
        C786410Ut5.gd((ImageView) aLAdapterS25S0200000_31.l0, 0.0f);
        C786410Ut5.Qb((ImageView) aLAdapterS25S0200000_31.l0, 1.0f);
        C786410Ut5.rc((ImageView) aLAdapterS25S0200000_31.l0, 1.0f);
        ((C16F4) aLAdapterS25S0200000_31.l1).LIZIZ((ImageView) aLAdapterS25S0200000_31.l0);
    }

    public static final void onAnimationStart$0(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        C15IT c15it = (C15IT) aLAdapterS25S0200000_31.l0;
        if (c15it != null) {
            c15it.onStateChange(0);
        }
    }

    public static final void onAnimationStart$2(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationStart(animator);
        if (((C1143100fqu) aLAdapterS25S0200000_31.l0).LIZ(((C978940ba8) aLAdapterS25S0200000_31.l1).LL) != null) {
            C786410Ut5.LLLILZ((C1143100fqu) aLAdapterS25S0200000_31.l0, 0);
            C786410Ut5.LLJJIII(((C978940ba8) aLAdapterS25S0200000_31.l1).LL, 4);
            ((C1143100fqu) aLAdapterS25S0200000_31.l0).LJ(true);
        }
    }

    public static final void onAnimationStart$3(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        InterfaceC20588415hK interfaceC20588415hK = ((C20588315hJ) aLAdapterS25S0200000_31.l0).LL;
        if (interfaceC20588415hK != null) {
            interfaceC20588415hK.onStateChange(0);
        }
        ((C20588315hJ) aLAdapterS25S0200000_31.l0).getClass();
    }

    public static final void onAnimationStart$4(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        super.onAnimationStart(animator);
        C786410Ut5.V4((ImageView) aLAdapterS25S0200000_31.l0, 1.0f);
        C786410Ut5.Qb((ImageView) aLAdapterS25S0200000_31.l0, 2.56f);
        C786410Ut5.rc((ImageView) aLAdapterS25S0200000_31.l0, 2.56f);
        C786410Ut5.Lc((ImageView) aLAdapterS25S0200000_31.l0, 0.0f);
        C786410Ut5.gd((ImageView) aLAdapterS25S0200000_31.l0, 0.0f);
    }

    public static final void onAnimationStart$5(ALAdapterS25S0200000_31 aLAdapterS25S0200000_31, Animator animator) {
        C204744159q c204744159q = (C204744159q) aLAdapterS25S0200000_31.l0;
        c204744159q.LLJJIII = true;
        c204744159q.LLJJIJI = false;
    }

    public ALAdapterS25S0200000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
