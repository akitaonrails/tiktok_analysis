package Y;

import X.C1338270kvh;
import X.C1602160rnK;
import X.C20441214yg;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C945740aia;
import X.C945770aid;
import X.C950660aqW;
import X.C961940b8i;
import X.C962470b9Z;
import X.C962490b9b;
import X.C978060bYi;
import X.C985030bjx;
import X.C986580bmS;
import X.EnumC961950b8j;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnClickListenerC986770bml;
import Y.ALAdapterS11S0100000_15;
import Y.AUListenerS264S0100000_15;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayDodgeEvent;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class ALAdapterS11S0100000_15 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (3 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            onAnimationCancel$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationEnd$0(this, animator);
                break;
            case 2:
                onAnimationEnd$1(this, animator);
                break;
            case 3:
                onAnimationEnd$2(this, animator);
                break;
            case 4:
            case 5:
            case 6:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case 16:
            default:
                super.onAnimationEnd(animator);
                break;
            case 7:
                onAnimationEnd$3(this, animator);
                break;
            case 8:
                onAnimationEnd$4(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$5(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$6(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$7(this, animator);
                break;
            case 14:
                onAnimationEnd$8(this, animator);
                break;
            case 15:
                onAnimationEnd$9(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$10(this, animator);
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
            case 2:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            case 15:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                onAnimationStart$2(this, animator);
                break;
            case 4:
                onAnimationStart$3(this, animator);
                break;
            case 5:
                onAnimationStart$4(this, animator);
                break;
            case 6:
                onAnimationStart$5(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$6(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$7(this, animator);
                break;
            case 16:
                onAnimationStart$8(this, animator);
                break;
        }
    }

    public ALAdapterS11S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        C786410Ut5.LJZL(8, ((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).getTeamMatePowerUpEnterLayout());
        C786410Ut5.W4(((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).getTeamMatePowerUpEnterLayout(), 1.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        ImageView imageView = ((C985030bjx) aLAdapterS11S0100000_15.l0).LLILZ;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(4, imageView);
    }

    public static final void onAnimationEnd$1(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        ((C945740aia) aLAdapterS11S0100000_15.l0).removeAnimatorListener(aLAdapterS11S0100000_15);
        super.onAnimationEnd(animator);
        C945770aid c945770aid = C945770aid.LIZ;
        c945770aid.getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        c945770aid.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_monitor_finish_");
        sbLIZ.append("ApplyDetailMonitor");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void onAnimationEnd$10(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LLIZLLLIL((RecyclerView) aLAdapterS11S0100000_15.l0, 8);
    }

    public static final void onAnimationEnd$2(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        C786410Ut5.LJZL(8, ((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).getTeamMatePowerUpEnterLayout());
        C786410Ut5.W4(((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).getTeamMatePowerUpEnterLayout(), 1.0f);
    }

    public static final void onAnimationEnd$3(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LJLLLLLL(8, ((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).getViewScreenShareInfo());
    }

    public static final void onAnimationEnd$4(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bml = (ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0;
        viewOnClickListenerC986770bml.LLZL = false;
        viewOnClickListenerC986770bml.LLZILL = Boolean.FALSE;
    }

    public static final void onAnimationEnd$5(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animatePeriodicScoreReveal: restore animation ended, uid=");
        sbLIZ.append(((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).getUid());
        C20441214yg.LIZIZ("CoHostWindowView", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.T4(((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).getViewAnchorInfo(), 1.0f);
        ((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).k1();
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bml = (ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0;
        viewOnClickListenerC986770bml.E2(viewOnClickListenerC986770bml.LLLZZIL, viewOnClickListenerC986770bml.LLZIL);
    }

    public static final void onAnimationEnd$6(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        if (((C962490b9b) aLAdapterS11S0100000_15.l0).LLJIJIL != EnumC961950b8j.INVITE_LIST_SCROLL_DOWN_STATE.getState()) {
            C20441214yg.LIZIZ("MultiHostInviteListHeaderView", "scroll state inconsistent show compressUserListLayout");
            C500260Jjc.LLFFF(((C962490b9b) aLAdapterS11S0100000_15.l0).LLIZ);
            C962470b9Z c962470b9Z = ((C962490b9b) aLAdapterS11S0100000_15.l0).LLIZ;
            if (c962470b9Z != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c962470b9Z);
                c962470b9Z.setAlpha(1.0f);
            }
            C500260Jjc.LJIILIIL(((C962490b9b) aLAdapterS11S0100000_15.l0).getExtendTitleContainer());
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        super.onAnimationEnd(animator);
        if (((C962490b9b) aLAdapterS11S0100000_15.l0).LLJIJIL != EnumC961950b8j.INVITE_LIST_SCROLL_UP_STATE_COMPRESS.getState()) {
            C20441214yg.LIZIZ("MultiHostInviteListHeaderView", "scroll state inconsistent show extendTitleContainer");
            C500260Jjc.LJIILIIL(((C962490b9b) aLAdapterS11S0100000_15.l0).LLIZ);
            C500260Jjc.LLFFF(((C962490b9b) aLAdapterS11S0100000_15.l0).getExtendTitleContainer());
            C786410Ut5.R4(1.0f, ((C962490b9b) aLAdapterS11S0100000_15.l0).getExtendTitleContainer());
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        ((C986580bmS) aLAdapterS11S0100000_15.l0).LLJLILLLLZIIL = true;
        C20441214yg.LIZIZ("AICommentaryVoiceVisualisationView", "Entrance scale animation done");
        C986580bmS c986580bmS = (C986580bmS) aLAdapterS11S0100000_15.l0;
        if (c986580bmS.LLJLIL) {
            c986580bmS.LIZJ();
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        final C986580bmS c986580bmS = (C986580bmS) aLAdapterS11S0100000_15.l0;
        final float f = 1.2f;
        final float f2 = 1.0f;
        HandlerHook.viewPostDelay(c986580bmS, new Runnable() { // from class: X.0bmU
            public final void LIZ() {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
                C986580bmS c986580bmS2 = c986580bmS;
                valueAnimatorOfFloat.setDuration(c986580bmS2.LLJJL);
                valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS264S0100000_15(c986580bmS2, 12));
                valueAnimatorOfFloat.addListener(new ALAdapterS11S0100000_15(c986580bmS, 14));
                valueAnimatorOfFloat.start();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AICommentaryVoiceVisualisationView@f904.startEntranceScaleAnimation$1$onAnimationEnd$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AICommentaryVoiceVisualisationView@f904.startEntranceScaleAnimation$1$onAnimationEnd$1");
            }
        }, c986580bmS.LLJJJJLIIL);
    }

    public static final void onAnimationStart$0(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        super.onAnimationStart(animator);
        C950660aqW c950660aqW = ((C961940b8i) aLAdapterS11S0100000_15.l0).LLILLL;
        int visibility = c950660aqW.getVisibility();
        c950660aqW.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c950660aqW);
    }

    public static final void onAnimationStart$1(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        ImageView imageView = ((C985030bjx) aLAdapterS11S0100000_15.l0).LLILZ;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(0, imageView);
    }

    public static final void onAnimationStart$2(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        C786410Ut5.LJZL(0, ((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).getTeamMatePowerUpEnterLayout());
        C786410Ut5.W4(((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).getTeamMatePowerUpEnterLayout(), 1.0f);
    }

    public static final void onAnimationStart$3(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        super.onAnimationStart(animator);
        DataChannel dataChannel = (DataChannel) aLAdapterS11S0100000_15.l0;
        if (dataChannel != null) {
            dataChannel.zW(MatchGiftTrayDodgeEvent.class, new C978060bYi(0.3f, 1.0f, 200L));
        }
    }

    public static final void onAnimationStart$4(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        super.onAnimationStart(animator);
        DataChannel dataChannel = (DataChannel) aLAdapterS11S0100000_15.l0;
        if (dataChannel != null) {
            dataChannel.zW(MatchGiftTrayDodgeEvent.class, new C978060bYi(0.3f, 1.0f, 200L));
        }
    }

    public static final void onAnimationStart$5(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        super.onAnimationStart(animator);
        C786410Ut5.LJLLLLLL(0, ((ViewOnClickListenerC986770bml) aLAdapterS11S0100000_15.l0).getViewScreenShareInfo());
    }

    public static final void onAnimationStart$6(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        View viewFindViewById;
        super.onAnimationStart(animator);
        C500260Jjc.LLFFF(((C962490b9b) aLAdapterS11S0100000_15.l0).LLIZ);
        View rootView = ((C962490b9b) aLAdapterS11S0100000_15.l0).getRootView();
        if (rootView != null && (viewFindViewById = rootView.findViewById(R.id.view_shadow)) != null) {
            C500260Jjc.LLFFF(viewFindViewById);
        }
    }

    public static final void onAnimationStart$7(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        View viewFindViewById;
        super.onAnimationStart(animator);
        C500260Jjc.LLFFF(((C962490b9b) aLAdapterS11S0100000_15.l0).getExtendTitleContainer());
        View rootView = ((C962490b9b) aLAdapterS11S0100000_15.l0).getRootView();
        if (rootView != null && (viewFindViewById = rootView.findViewById(R.id.view_shadow)) != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
    }

    public static final void onAnimationStart$8(ALAdapterS11S0100000_15 aLAdapterS11S0100000_15, Animator animator) {
        View viewFindViewById;
        super.onAnimationStart(animator);
        ((LinkDialog) aLAdapterS11S0100000_15.l0).getClass();
        View view = ((LinkDialog) aLAdapterS11S0100000_15.l0).LLILLL;
        if (view != null && (viewFindViewById = view.findViewById(R.id.view_shadow)) != null) {
            C500260Jjc.LLFFF(viewFindViewById);
        }
    }
}
