package Y;

import X.AbstractC498420Jge;
import X.C1096340edU;
import X.C189200o6;
import X.C421360Gfe;
import X.C463130IEd;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520200Kag;
import X.C520220Kai;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1096020ecy;
import X.InterfaceC20236714Gf;
import X.InterfaceC514560KFy;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.microom.MicRoomUserInfoWidget;
import com.bytedance.android.livesdk.subcription.subspaceeditor.CommentMentionAssem;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.PlayCardFeedCellV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.assem.PGCCommentMentionAssem;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public class ALAdapterS4S0200000_7 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 5:
                onAnimationCancel$0(this, animator);
                break;
            case 6:
                onAnimationCancel$1(this, animator);
                break;
            case 14:
                onAnimationCancel$2(this, animator);
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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$9(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$10(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$11(this, animator);
                break;
            case 14:
                onAnimationEnd$12(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                break;
            case 3:
                onAnimationStart$1(this, animator);
                break;
            case 4:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            default:
                super.onAnimationStart(animator);
                break;
            case 5:
                onAnimationStart$2(this, animator);
                break;
            case 6:
                onAnimationStart$3(this, animator);
                break;
            case 7:
                onAnimationStart$4(this, animator);
                break;
            case 8:
                onAnimationStart$5(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$6(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$7(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$8(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$9(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ((PlayCardFeedCellV2) aLAdapterS4S0200000_7.l1).LLJJJJJIL = null;
    }

    public static final void onAnimationCancel$1(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ((PlayCardFeedCellV2) aLAdapterS4S0200000_7.l1).LLJJJJJIL = null;
    }

    public static final void onAnimationCancel$2(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ((AnimatorSet) aLAdapterS4S0200000_7.l0).removeAllListeners();
        ((InterfaceC20236714Gf) aLAdapterS4S0200000_7.l1).LJJIIZ(new CancellationException("small_card_fade_out_cancelled"));
    }

    public static final void onAnimationEnd$0(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.ed((View) aLAdapterS4S0200000_7.l0, ((CommentMentionAssem) aLAdapterS4S0200000_7.l1).LLJJIJI);
    }

    public static final void onAnimationEnd$1(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ((C463130IEd) ((InterfaceC514560KFy) aLAdapterS4S0200000_7.l0)).LIZ();
        ((PortraitAudienceInteractionFragment) aLAdapterS4S0200000_7.l1).A = true;
    }

    public static final void onAnimationEnd$10(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJJI.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        C786410Ut5.X5(layoutParams, ((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJJI);
        ((GradientDrawable) aLAdapterS4S0200000_7.l1).setCornerRadius((int) C497740JfY.LIZIZ(13.5f));
        C1096340edU c1096340edU = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJLIL;
        if (c1096340edU != null) {
            c1096340edU.LJ();
        }
        C500260Jjc.LJIILIIL(((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJJI);
    }

    public static final void onAnimationEnd$11(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationEnd(animator);
        ((ConstraintProperty) aLAdapterS4S0200000_7.l0).visibility(8);
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C520220Kai c520220Kai = (C520220Kai) aLAdapterS4S0200000_7.l1;
        c784440UpuLIZ.LIZIZ(new C520200Kag(c520220Kai.LIZ, c520220Kai.LIZIZ));
    }

    public static final void onAnimationEnd$12(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ((AnimatorSet) aLAdapterS4S0200000_7.l0).removeAllListeners();
        if (((InterfaceC20236714Gf) aLAdapterS4S0200000_7.l1).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) aLAdapterS4S0200000_7.l1;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationEnd(animator);
        Iterator it2 = ((List) aLAdapterS4S0200000_7.l1).iterator();
        while (it2.hasNext()) {
            C500260Jjc.LJIILIIL((View) it2.next());
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_7.l1).LLLIIII.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        C786410Ut5.X5(layoutParams, ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_7.l1).LLLIIII);
        GradientDrawable gradientDrawable = (GradientDrawable) aLAdapterS4S0200000_7.l0;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(18.0f));
        }
        C1096340edU c1096340edU = ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_7.l1).LLLZ;
        if (c1096340edU.LJIILL == EnumC1096020ecy.FOLLOW_ANIM) {
            c1096340edU.LJIIJ();
        }
        C500260Jjc.LLFFF(((ClearScreenUserInfoWidget) aLAdapterS4S0200000_7.l1).LLLIIII);
    }

    public static final void onAnimationEnd$4(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.ed((View) aLAdapterS4S0200000_7.l0, ((PGCCommentMentionAssem) aLAdapterS4S0200000_7.l1).LLJJIJI);
    }

    public static final void onAnimationEnd$5(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ((PlayCardFeedCellV2) aLAdapterS4S0200000_7.l1).LLJJJJJIL = null;
    }

    public static final void onAnimationEnd$6(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ((PlayCardFeedCellV2) aLAdapterS4S0200000_7.l1).LLJJJJJIL = null;
    }

    public static final void onAnimationEnd$7(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationEnd(animator);
        ((ConstraintProperty) aLAdapterS4S0200000_7.l1).translationX(0.0f);
    }

    public static final void onAnimationEnd$8(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationEnd(animator);
        if (C497740JfY.LJJ()) {
            ((ConstraintProperty) aLAdapterS4S0200000_7.l0).translationX(-C497740JfY.LJIILLIIL());
        } else {
            ((ConstraintProperty) aLAdapterS4S0200000_7.l0).translationX(C497740JfY.LJIILLIIL());
        }
        ((ConstraintProperty) aLAdapterS4S0200000_7.l0).visibility(8);
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C520220Kai c520220Kai = (C520220Kai) aLAdapterS4S0200000_7.l1;
        c784440UpuLIZ.LIZIZ(new C520200Kag(c520220Kai.LIZ, c520220Kai.LIZIZ));
    }

    public static final void onAnimationEnd$9(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJJI.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        C786410Ut5.X5(layoutParams, ((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJJI);
        ((GradientDrawable) aLAdapterS4S0200000_7.l1).setCornerRadius((int) C497740JfY.LIZIZ(18.0f));
        C1096340edU c1096340edU = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJLIL;
        if (c1096340edU.LJIILL == EnumC1096020ecy.FOLLOW_ANIM) {
            c1096340edU.LJIIJ();
        }
        C500260Jjc.LLFFF(((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJJI);
    }

    public static final void onAnimationStart$0(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationStart(animator);
        for (View view : (List) aLAdapterS4S0200000_7.l0) {
            if (view != null) {
                C786410Ut5.T4(view, 0.0f);
            }
            C500260Jjc.LLFFF(view);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        C500260Jjc.LJIILLIIL(((ClearScreenUserInfoWidget) aLAdapterS4S0200000_7.l1).LLLIIII);
        C1096340edU c1096340edU = ((ClearScreenUserInfoWidget) aLAdapterS4S0200000_7.l1).LLLZ;
        if (c1096340edU != null) {
            c1096340edU.LJ();
        }
    }

    public static final void onAnimationStart$2(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS4S0200000_7.l0).start();
    }

    public static final void onAnimationStart$3(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS4S0200000_7.l0).start();
    }

    public static final void onAnimationStart$4(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationStart(animator);
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C520220Kai c520220Kai = (C520220Kai) aLAdapterS4S0200000_7.l0;
        c784440UpuLIZ.LIZIZ(new C520200Kag(c520220Kai.LIZ, c520220Kai.LIZIZ));
        ((ConstraintProperty) aLAdapterS4S0200000_7.l1).visibility(0);
    }

    public static final void onAnimationStart$5(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationStart(animator);
        ((ConstraintProperty) aLAdapterS4S0200000_7.l0).translationX(0.0f);
    }

    public static final void onAnimationStart$6(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationStart(animator);
        C421360Gfe c421360GfeLJJIFFI = ((AbstractC498420Jge) aLAdapterS4S0200000_7.l0).LJJIFFI();
        if (c421360GfeLJJIFFI != null) {
            c421360GfeLJJIFFI.setText((CharSequence) aLAdapterS4S0200000_7.l1);
        }
        C421360Gfe c421360GfeLJJIFFI2 = ((AbstractC498420Jge) aLAdapterS4S0200000_7.l0).LJJIFFI();
        if (c421360GfeLJJIFFI2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c421360GfeLJJIFFI2);
            c421360GfeLJJIFFI2.setAlpha(1.0f);
        }
    }

    public static final void onAnimationStart$7(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        C500260Jjc.LJIILLIIL(((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJJI);
        C1096340edU c1096340edU = ((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJLIL;
        if (c1096340edU != null) {
            c1096340edU.LJ();
        }
    }

    public static final void onAnimationStart$8(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        C500260Jjc.LJIILLIIL(((MicRoomUserInfoWidget) aLAdapterS4S0200000_7.l0).LLJJI);
    }

    public static final void onAnimationStart$9(ALAdapterS4S0200000_7 aLAdapterS4S0200000_7, Animator animator) {
        super.onAnimationStart(animator);
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C520220Kai c520220Kai = (C520220Kai) aLAdapterS4S0200000_7.l0;
        c784440UpuLIZ.LIZIZ(new C520200Kag(c520220Kai.LIZ, c520220Kai.LIZIZ));
        ((ConstraintProperty) aLAdapterS4S0200000_7.l1).visibility(0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ALAdapterS4S0200000_7(X.C520220Kai r2, com.bytedance.ies.sdk.widgets.ConstraintProperty r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 7: goto Le;
                case 13: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS4S0200000_7.<init>(X.0Kai, com.bytedance.ies.sdk.widgets.ConstraintProperty, int):void");
    }

    public ALAdapterS4S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
