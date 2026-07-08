package Y;

import X.AbstractC453920Hr4;
import X.C09AE;
import X.C0DXR;
import X.C0GY5;
import X.C0GY9;
import X.C0HGU;
import X.C0I93;
import X.C0I94;
import X.C0PEM;
import X.C1052130dUB;
import X.C1117710fBx;
import X.C1295960jpS;
import X.C12ES;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1440005kM;
import X.C1554610qYd;
import X.C1558520qew;
import X.C15DF;
import X.C1602160rnK;
import X.C1609220ryi;
import X.C1618440sDa;
import X.C1619980sG4;
import X.C16F5;
import X.C1858620ySy;
import X.C19599711mF;
import X.C19EG;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C21629019km;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C337180DJs;
import X.C339190DRl;
import X.C417610GZb;
import X.C419210GcB;
import X.C419400GcU;
import X.C421390Gfh;
import X.C421600Gg2;
import X.C421640Gg6;
import X.C422190Ggz;
import X.C429740GtA;
import X.C430440GuI;
import X.C433560GzK;
import X.C433570GzL;
import X.C434000H0c;
import X.C453930Hr5;
import X.C453940Hr6;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC1106640eu6;
import X.InterfaceC594300NSq;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.impl.revenue.announcement.widget.LivePrivilegeAnnouncementWidget;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.privilege.LiveAdvanceMessageContinuesAnimSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.collection.common.protocol.CleanModeProtocol;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.feed.common.sub.abroll.StoryAbRollComponent;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryPhotoAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.component.StoryStickerInteractAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.abroll.StoryAbRollProgressButton;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class ALAdapterS3S0100000_6 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$9(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
    }

    public static final void onAnimationEnd$33(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
    }

    public static final void onAnimationStart$13(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 5:
                onAnimationCancel$0(this, animator);
                break;
            case 6:
                onAnimationCancel$1(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationCancel$2(this, animator);
                break;
            case 27:
                onAnimationCancel$3(this, animator);
                break;
            case 28:
                onAnimationCancel$4(this, animator);
                break;
            case 29:
                onAnimationCancel$5(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationCancel$6(this, animator);
                break;
            case 40:
                onAnimationCancel$7(this, animator);
                break;
            case 41:
                onAnimationCancel$8(this, animator);
                break;
            case 47:
                onAnimationCancel$9(this, animator);
                break;
            case 53:
                onAnimationCancel$10(this, animator);
                break;
            case 56:
                onAnimationCancel$11(this, animator);
                break;
            case 58:
                super.onAnimationCancel(animator);
                break;
            case 67:
                onAnimationCancel$13(this, animator);
                break;
            case 68:
                onAnimationCancel$14(this, animator);
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
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 23:
            case 30:
            case 31:
            case 38:
            case 42:
            case 43:
            case 52:
            case 63:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                onAnimationEnd$1(this, animator);
                break;
            case 3:
                onAnimationEnd$2(this, animator);
                break;
            case 4:
                onAnimationEnd$3(this, animator);
                break;
            case 5:
                onAnimationEnd$4(this, animator);
                break;
            case 6:
                onAnimationEnd$5(this, animator);
                break;
            case 7:
                onAnimationEnd$6(this, animator);
                break;
            case 8:
                onAnimationEnd$7(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$8(this, animator);
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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$12(this, animator);
                break;
            case 14:
                onAnimationEnd$13(this, animator);
                break;
            case 15:
                onAnimationEnd$14(this, animator);
                break;
            case 16:
                onAnimationEnd$15(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$16(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$17(this, animator);
                break;
            case 19:
                onAnimationEnd$18(this, animator);
                break;
            case 21:
                onAnimationEnd$19(this, animator);
                break;
            case 22:
                onAnimationEnd$20(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationEnd$21(this, animator);
                break;
            case 25:
                onAnimationEnd$22(this, animator);
                break;
            case 26:
                onAnimationEnd$23(this, animator);
                break;
            case 27:
                onAnimationEnd$24(this, animator);
                break;
            case 28:
                onAnimationEnd$25(this, animator);
                break;
            case 29:
                onAnimationEnd$26(this, animator);
                break;
            case 32:
                onAnimationEnd$27(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationEnd$28(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onAnimationEnd$29(this, animator);
                break;
            case 35:
                onAnimationEnd$30(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationEnd$31(this, animator);
                break;
            case 37:
                onAnimationEnd$32(this, animator);
                break;
            case 39:
                onAnimationEnd$33(this, animator);
                break;
            case 40:
                onAnimationEnd$34(this, animator);
                break;
            case 41:
                onAnimationEnd$35(this, animator);
                break;
            case 44:
                onAnimationEnd$36(this, animator);
                break;
            case 45:
                onAnimationEnd$37(this, animator);
                break;
            case 46:
                onAnimationEnd$38(this, animator);
                break;
            case 47:
                onAnimationEnd$39(this, animator);
                break;
            case 48:
                onAnimationEnd$40(this, animator);
                break;
            case 49:
                onAnimationEnd$41(this, animator);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onAnimationEnd$42(this, animator);
                break;
            case 51:
                onAnimationEnd$43(this, animator);
                break;
            case 53:
                onAnimationEnd$44(this, animator);
                break;
            case 54:
                onAnimationEnd$45(this, animator);
                break;
            case 55:
                onAnimationEnd$46(this, animator);
                break;
            case 56:
                onAnimationEnd$47(this, animator);
                break;
            case 57:
                onAnimationEnd$48(this, animator);
                break;
            case 58:
                onAnimationEnd$49(this, animator);
                break;
            case 59:
                onAnimationEnd$50(this, animator);
                break;
            case 60:
                onAnimationEnd$51(this, animator);
                break;
            case 61:
                onAnimationEnd$52(this, animator);
                break;
            case BaseNotice.CREATOR /* 62 */:
                onAnimationEnd$53(this, animator);
                break;
            case 64:
                onAnimationEnd$54(this, animator);
                break;
            case 65:
                onAnimationEnd$55(this, animator);
                break;
            case 66:
                onAnimationEnd$56(this, animator);
                break;
            case 67:
                onAnimationEnd$57(this, animator);
                break;
            case 68:
                onAnimationEnd$58(this, animator);
                break;
            case 69:
                onAnimationEnd$59(this, animator);
                break;
            case 70:
                onAnimationEnd$60(this, animator);
                break;
            case 71:
                onAnimationEnd$61(this, animator);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                onAnimationEnd$62(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (68 - this.$t != 0) {
            super.onAnimationRepeat(animator);
        } else {
            onAnimationRepeat$0(this, animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                break;
            case 3:
                onAnimationStart$1(this, animator);
                break;
            case 8:
                onAnimationStart$2(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$3(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationStart$4(this, animator);
                break;
            case 22:
                super.onAnimationStart(animator);
                break;
            case 23:
                onAnimationStart$6(this, animator);
                break;
            case 30:
                onAnimationStart$7(this, animator);
                break;
            case 31:
                onAnimationStart$8(this, animator);
                break;
            case 38:
                onAnimationStart$9(this, animator);
                break;
            case 39:
                onAnimationStart$10(this, animator);
                break;
            case 42:
                onAnimationStart$11(this, animator);
                break;
            case 43:
                onAnimationStart$12(this, animator);
                break;
            case 47:
                onAnimationStart$13(this, animator);
                break;
            case 52:
                onAnimationStart$14(this, animator);
                break;
            case 57:
                onAnimationStart$15(this, animator);
                break;
            case 58:
                super.onAnimationStart(animator);
                break;
            case 59:
                onAnimationStart$17(this, animator);
                break;
            case 61:
                onAnimationStart$18(this, animator);
                break;
            case BaseNotice.CREATOR /* 62 */:
                onAnimationStart$19(this, animator);
                break;
            case 63:
                onAnimationStart$20(this, animator);
                break;
            case 67:
                onAnimationStart$21(this, animator);
                break;
            case 68:
                onAnimationStart$22(this, animator);
                break;
            case 69:
                onAnimationStart$23(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS3S0100000_6(int i) {
        this.$t = i;
        this.l0 = null;
    }

    public ALAdapterS3S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((C421390Gfh) aLAdapterS3S0100000_6.l0).LJFF();
    }

    public static final void onAnimationCancel$1(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.Jc((View) aLAdapterS3S0100000_6.l0, 0.0f);
    }

    public static final void onAnimationCancel$10(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationCancel(animator);
        ((C1609220ryi) aLAdapterS3S0100000_6.l0).setLayerType(0, null);
    }

    public static final void onAnimationCancel$11(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationCancel(animator);
        Function0 function0 = (Function0) aLAdapterS3S0100000_6.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationCancel$13(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationCancel(animator);
        Function1 function1 = (Function1) aLAdapterS3S0100000_6.l0;
        if (function1 != null) {
            function1.invoke(3);
        }
    }

    public static final void onAnimationCancel$14(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lottie A onAnimationCancel — playback CANCELLED (viewHash=");
        sbLIZ.append(((C1295960jpS) aLAdapterS3S0100000_6.l0).hashCode());
        sbLIZ.append(" progress=");
        sbLIZ.append(((C1295960jpS) aLAdapterS3S0100000_6.l0).getProgress());
        sbLIZ.append("). Expected on cross-fade to Lottie B or on search cancel.");
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationCancel$2(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationCancel(animator);
        C786410Ut5.Ob((View) aLAdapterS3S0100000_6.l0, 1.0f);
        C786410Ut5.pc((View) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationCancel$3(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        View view = (View) aLAdapterS3S0100000_6.l0;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = (View) aLAdapterS3S0100000_6.l0;
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
        }
    }

    public static final void onAnimationCancel$4(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0100000_6.l0);
        C786410Ut5.T4((View) aLAdapterS3S0100000_6.l0, 0.0f);
    }

    public static final void onAnimationCancel$5(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((C430440GuI) aLAdapterS3S0100000_6.l0).getLayoutParams().height = -2;
    }

    public static final void onAnimationCancel$6(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationCancel(animator);
        ((C421600Gg2) aLAdapterS3S0100000_6.l0).setLayerType(0, null);
    }

    public static final void onAnimationCancel$7(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationCancel(animator);
        ((C421640Gg6) aLAdapterS3S0100000_6.l0).setLayerType(0, null);
    }

    public static final void onAnimationCancel$8(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS3S0100000_6.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJZI(8, (ImageView) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationEnd$1(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        AvatarComponentView avatarComponentView = (AvatarComponentView) aLAdapterS3S0100000_6.l0;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(avatarComponentView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.9f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.9f));
        objectAnimatorOfPropertyValuesHolder.setDuration(75L);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(avatarComponentView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.9f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.9f, 1.0f));
        objectAnimatorOfPropertyValuesHolder2.setDuration(75L);
        objectAnimatorOfPropertyValuesHolder2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfPropertyValuesHolder, objectAnimatorOfPropertyValuesHolder2);
        animatorSet.start();
    }

    public static final void onAnimationEnd$10(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) aLAdapterS3S0100000_6.l0, (Property<View, Float>) View.SCALE_Y, 0.6f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        objectAnimatorOfFloat.setDuration(500L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static final void onAnimationEnd$11(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        StoryAbRollComponent storyAbRollComponent = (StoryAbRollComponent) aLAdapterS3S0100000_6.l0;
        storyAbRollComponent.LLLI = false;
        if (storyAbRollComponent.LLLII) {
            storyAbRollComponent.LLLII = false;
            storyAbRollComponent.LLLIIII = false;
            StoryAbRollProgressButton storyAbRollProgressButtonJp = storyAbRollComponent.Jp();
            if (storyAbRollProgressButtonJp != null) {
                storyAbRollProgressButtonJp.LIZLLL();
            }
            StoryPhotoAbility storyPhotoAbility = (StoryPhotoAbility) ((StoryAbRollComponent) aLAdapterS3S0100000_6.l0).LLJLLIL.getValue();
            if (storyPhotoAbility != null) {
                storyPhotoAbility.LJIILLIIL();
            }
            List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL((StoryAbRollComponent) aLAdapterS3S0100000_6.l0), CleanModeProtocol.class, false);
            if (listLIZIZ != null) {
                Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                while (it2.hasNext()) {
                    ((CleanModeProtocol) it2.next()).Iu0();
                }
            }
            C1618440sDa.LIZIZ.LJJLIIIIJ(C1558520qew.LJIIL((StoryAbRollComponent) aLAdapterS3S0100000_6.l0), false);
            StoryStickerInteractAbility storyStickerInteractAbility = (StoryStickerInteractAbility) ((StoryAbRollComponent) aLAdapterS3S0100000_6.l0).LLJLLL.getValue();
            if (storyStickerInteractAbility != null) {
                storyStickerInteractAbility.xv0();
                return;
            }
            return;
        }
        storyAbRollComponent.LLLII = true;
    }

    public static final void onAnimationEnd$12(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) aLAdapterS3S0100000_6.l0, (Property<View, Float>) View.SCALE_X, 0.6f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        objectAnimatorOfFloat.setDuration(500L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static final void onAnimationEnd$13(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) aLAdapterS3S0100000_6.l0, (Property<View, Float>) View.SCALE_Y, 0.6f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIIZ());
        objectAnimatorOfFloat.setDuration(500L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public static final void onAnimationEnd$14(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        StoryAbRollProgressButton storyAbRollProgressButton = (StoryAbRollProgressButton) aLAdapterS3S0100000_6.l0;
        if (!storyAbRollProgressButton.LLJJ) {
            ObjectAnimator objectAnimator = storyAbRollProgressButton.LLJILJILJ;
            if (objectAnimator != null) {
                C786410Ut5.Pd(objectAnimator);
            }
            ObjectAnimator objectAnimator2 = ((StoryAbRollProgressButton) aLAdapterS3S0100000_6.l0).LLJILLL;
            if (objectAnimator2 != null) {
                C786410Ut5.Pd(objectAnimator2);
            }
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        StoryAbRollProgressButton storyAbRollProgressButton = (StoryAbRollProgressButton) aLAdapterS3S0100000_6.l0;
        if (!storyAbRollProgressButton.LLJJ) {
            ObjectAnimator objectAnimator = storyAbRollProgressButton.LLJIJIL;
            if (objectAnimator != null) {
                C786410Ut5.Pd(objectAnimator);
            }
            ObjectAnimator objectAnimator2 = ((StoryAbRollProgressButton) aLAdapterS3S0100000_6.l0).LLJILJIL;
            if (objectAnimator2 != null) {
                C786410Ut5.Pd(objectAnimator2);
            }
        }
    }

    public static final void onAnimationEnd$16(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLZ(8, (ViewGroup) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationEnd$17(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.Ob((View) aLAdapterS3S0100000_6.l0, 1.0f);
        C786410Ut5.pc((View) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationEnd$18(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.Fb((TuxIconView) aLAdapterS3S0100000_6.l0, 0.0f);
    }

    public static final void onAnimationEnd$19(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        Object obj;
        super.onAnimationEnd(animator);
        StoryAbRollComponent storyAbRollComponent = (StoryAbRollComponent) aLAdapterS3S0100000_6.l0;
        if (storyAbRollComponent.LLLFZ) {
            if (!storyAbRollComponent.LLLI) {
                storyAbRollComponent.Fp(true);
                StoryAbRollComponent storyAbRollComponent2 = (StoryAbRollComponent) aLAdapterS3S0100000_6.l0;
                storyAbRollComponent2.getClass();
                try {
                    StoryApi storyApi = StoryApi.LIZIZ;
                    C724270Sb3 c724270Sb3 = storyAbRollComponent2.LLJI;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    } else {
                        obj = null;
                    }
                    storyApi.reportUserInteraction(((VideoItemParams) obj).getAweme().getAid(), 4, "").enqueue(new InterfaceC594300NSq<BaseResponse>() { // from class: X.06LP
                        @Override // X.InterfaceC594300NSq
                        public final void onFailure(C0X9S<BaseResponse> c0x9s, Throwable th) {
                        }

                        @Override // X.InterfaceC594300NSq
                        public final void onResponse(C0X9S<BaseResponse> c0x9s, C0X52<BaseResponse> c0x52) {
                        }
                    });
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.getMessage();
                }
                ((StoryAbRollComponent) aLAdapterS3S0100000_6.l0).Qp(true);
                return;
            }
            return;
        }
        if (!storyAbRollComponent.LLLI) {
            storyAbRollComponent.Ep();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationEnd$20(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        FrameLayout waveAnimationContainerFromXml = ((C15DF) aLAdapterS3S0100000_6.l0).getWaveAnimationContainerFromXml();
        if (waveAnimationContainerFromXml != null) {
            C786410Ut5.LJZ(8, waveAnimationContainerFromXml);
        }
    }

    public static final void onAnimationEnd$21(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.Vc((TuxTextView) aLAdapterS3S0100000_6.l0, 0.0f);
    }

    public static final void onAnimationEnd$22(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LLLLZLL((TuxTextView) aLAdapterS3S0100000_6.l0, 8);
        C786410Ut5.B5((TuxTextView) aLAdapterS3S0100000_6.l0, 0.0f);
    }

    public static final void onAnimationEnd$23(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((View) aLAdapterS3S0100000_6.l0).animate().alpha(1.0f).setDuration(300L).setInterpolator(C1619980sG4.LJIILIIL()).start();
    }

    public static final void onAnimationEnd$24(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        View view = (View) aLAdapterS3S0100000_6.l0;
        if (view != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        View view2 = (View) aLAdapterS3S0100000_6.l0;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
    }

    public static final void onAnimationEnd$25(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.T4((View) aLAdapterS3S0100000_6.l0, 1.0f);
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationEnd$26(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((C430440GuI) aLAdapterS3S0100000_6.l0).getLayoutParams().height = -2;
    }

    public static final void onAnimationEnd$27(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((C0HGU) aLAdapterS3S0100000_6.l0).LIZLLL();
    }

    public static final void onAnimationEnd$28(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        ((C421600Gg2) aLAdapterS3S0100000_6.l0).setLayerType(0, null);
    }

    public static final void onAnimationEnd$29(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0100000_6.l0);
        C786410Ut5.T4((View) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationEnd$3(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C421390Gfh c421390Gfh = (C421390Gfh) aLAdapterS3S0100000_6.l0;
        float fMeasureText = c421390Gfh.LJ.getPaint().measureText(c421390Gfh.LJ.getText().toString());
        float measuredWidth = c421390Gfh.LJFF.getMeasuredWidth() - C421390Gfh.LJIJ;
        if (fMeasureText > measuredWidth) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c421390Gfh.LJ, (Property<C16F5, Float>) View.TRANSLATION_X, 0.0f, measuredWidth - fMeasureText);
            objectAnimatorOfFloat.setDuration(4200 - C421390Gfh.LJIJI);
            objectAnimatorOfFloat.setRepeatCount(1);
            objectAnimatorOfFloat.setRepeatMode(2);
            objectAnimatorOfFloat.setStartDelay(200L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public static final void onAnimationEnd$30(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0100000_6.l0);
        C786410Ut5.T4((View) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationEnd$31(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0100000_6.l0);
        C786410Ut5.T4((View) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationEnd$32(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LLLLZLL((TuxTextView) aLAdapterS3S0100000_6.l0, 8);
        C786410Ut5.B5((TuxTextView) aLAdapterS3S0100000_6.l0, 0.0f);
    }

    public static final void onAnimationEnd$34(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        ((C421640Gg6) aLAdapterS3S0100000_6.l0).setLayerType(0, null);
    }

    public static final void onAnimationEnd$35(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS3S0100000_6.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$36(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C419400GcU c419400GcU = (C419400GcU) aLAdapterS3S0100000_6.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c419400GcU);
        c419400GcU.setAlpha(1.0f);
    }

    public static final void onAnimationEnd$37(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJZI(8, ((C1117710fBx) aLAdapterS3S0100000_6.l0).LLJJIJIL);
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$38(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C417610GZb c417610GZb = ((C1117710fBx) aLAdapterS3S0100000_6.l0).LLJJIJI;
        int visibility = c417610GZb.getVisibility();
        c417610GZb.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c417610GZb);
        super.onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$39(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationEnd$4(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((C421390Gfh) aLAdapterS3S0100000_6.l0).LJFF();
        ((C421390Gfh) aLAdapterS3S0100000_6.l0).LJIIJ.invoke();
    }

    public static final void onAnimationEnd$40(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS3S0100000_6.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$41(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJZI(0, ((C0I94) aLAdapterS3S0100000_6.l0).LIZIZ);
    }

    public static final void onAnimationEnd$42(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        LifecycleCoroutineScope lifecycleScope;
        C786410Ut5.LJZI(8, ((C0I94) aLAdapterS3S0100000_6.l0).LIZJ);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C0I94) aLAdapterS3S0100000_6.l0).LJFF);
        if (c19egLIZIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C0I93((C0I94) aLAdapterS3S0100000_6.l0, null), 3);
        }
    }

    public static final void onAnimationEnd$43(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJZI(8, (ImageView) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationEnd$44(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1609220ryi) aLAdapterS3S0100000_6.l0).setLayerType(0, null);
    }

    public static final void onAnimationEnd$45(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((C0GY5) aLAdapterS3S0100000_6.l0).LIZIZ();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.72f, 1.0f);
        C0GY5 c0gy5 = (C0GY5) aLAdapterS3S0100000_6.l0;
        valueAnimatorOfFloat.setDuration(450L);
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(c0gy5, 149));
        valueAnimatorOfFloat.start();
    }

    public static final void onAnimationEnd$46(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS3S0100000_6.l0);
        C786410Ut5.ed((View) aLAdapterS3S0100000_6.l0, 0.0f);
    }

    public static final void onAnimationEnd$47(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        Function0 function0 = (Function0) aLAdapterS3S0100000_6.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$48(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C339190DRl.LIZIZ((ImageView) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationEnd$49(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        TextView textView = (TextView) aLAdapterS3S0100000_6.l0;
        if (textView != null) {
            C786410Ut5.S4(1.0f, textView);
        }
        C12ES.LJIILL(8, (TextView) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationEnd$5(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.Jc((View) aLAdapterS3S0100000_6.l0, 0.0f);
    }

    public static final void onAnimationEnd$50(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.Ob((View) aLAdapterS3S0100000_6.l0, 1.0f);
        C786410Ut5.pc((View) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationEnd$51(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS3S0100000_6.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$52(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.Ob((View) aLAdapterS3S0100000_6.l0, 1.0f);
        C786410Ut5.pc((View) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationEnd$53(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C339190DRl.LIZIZ((View) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationEnd$54(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((View) aLAdapterS3S0100000_6.l0).setBackground(null);
    }

    public static final void onAnimationEnd$55(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS3S0100000_6.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$56(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationEnd(animator);
        C422190Ggz c422190Ggz = (C422190Ggz) aLAdapterS3S0100000_6.l0;
        RecyclerView recyclerView = c422190Ggz.LIZJ;
        if (recyclerView != null) {
            recyclerView.removeItemDecoration((C0DXR) c422190Ggz.LJ.getValue());
        }
        ((C422190Ggz) aLAdapterS3S0100000_6.l0).LJFF = false;
    }

    public static final void onAnimationEnd$57(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        Function1 function1 = (Function1) aLAdapterS3S0100000_6.l0;
        if (function1 != null) {
            function1.invoke(2);
        }
    }

    public static final void onAnimationEnd$58(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lottie A onAnimationEnd — playback ENDED (viewHash=");
        sbLIZ.append(((C1295960jpS) aLAdapterS3S0100000_6.l0).hashCode());
        sbLIZ.append(" progress=");
        sbLIZ.append(((C1295960jpS) aLAdapterS3S0100000_6.l0).getProgress());
        sbLIZ.append("). For an INFINITE loop this should normally NOT fire unless cancelAnimation() was called or the view was detached.");
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationEnd$59(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((C19599711mF) aLAdapterS3S0100000_6.l0).getClass();
        C1440005kM.LIZ(new C453940Hr6(false, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
    }

    public static final void onAnimationEnd$6(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C419210GcB c419210GcB = (C419210GcB) aLAdapterS3S0100000_6.l0;
        int visibility = c419210GcB.getVisibility();
        c419210GcB.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c419210GcB);
    }

    public static final void onAnimationEnd$60(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C339190DRl.LIZIZ((View) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationEnd$61(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((LivePrivilegeAnnouncementWidget) aLAdapterS3S0100000_6.l0).E1();
    }

    public static final void onAnimationEnd$62(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ConstraintLayout constraintLayout;
        long j;
        LivePrivilegeAnnouncementWidget livePrivilegeAnnouncementWidget = (LivePrivilegeAnnouncementWidget) aLAdapterS3S0100000_6.l0;
        livePrivilegeAnnouncementWidget.getClass();
        if (LiveAdvanceMessageContinuesAnimSetting.INSTANCE.getValue() && (constraintLayout = livePrivilegeAnnouncementWidget.LLILLL) != null) {
            ObjectAnimator objectAnimator = livePrivilegeAnnouncementWidget.LLJJJ;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.TRANSLATION_X, constraintLayout.getTranslationX(), 0.0f);
            if (livePrivilegeAnnouncementWidget.LLJLIL > 4000) {
                j = 1000;
            } else {
                j = 0;
            }
            objectAnimatorOfFloat.setDuration(j + 4000);
            objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            livePrivilegeAnnouncementWidget.LLJJJ = objectAnimatorOfFloat;
        }
        ((LivePrivilegeAnnouncementWidget) aLAdapterS3S0100000_6.l0).E1();
    }

    public static final void onAnimationEnd$7(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        int iIntValue;
        C434000H0c tvLiveTipsFromXml = ((C21629019km) aLAdapterS3S0100000_6.l0).getTvLiveTipsFromXml();
        if (tvLiveTipsFromXml != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, ((C21629019km) aLAdapterS3S0100000_6.l0).getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -1;
            }
            tvLiveTipsFromXml.setTextColor(iIntValue);
        }
        C434000H0c tvLiveTipsFromXml2 = ((C21629019km) aLAdapterS3S0100000_6.l0).getTvLiveTipsFromXml();
        if (tvLiveTipsFromXml2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tvLiveTipsFromXml2);
            tvLiveTipsFromXml2.setAlpha(0.7f);
        }
        C21629019km c21629019km = (C21629019km) aLAdapterS3S0100000_6.l0;
        if (c21629019km.LLJLILLLLZIIL) {
            return;
        }
        Map<EnumC1106640eu6, C09AE> map = c21629019km.LLJLLIL;
        EnumC1106640eu6 enumC1106640eu6 = EnumC1106640eu6.GLINT_RECOVER;
        C09AE c09ae = (C09AE) ((LinkedHashMap) map).get(enumC1106640eu6);
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        Map<EnumC1106640eu6, C09AE> map2 = ((C21629019km) aLAdapterS3S0100000_6.l0).LLJLLIL;
        C1DFH c1dfh = C0PEM.LIZ;
        map2.put(enumC1106640eu6, C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C433560GzK((C21629019km) aLAdapterS3S0100000_6.l0, null), 3));
    }

    public static final void onAnimationEnd$8(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C21629019km c21629019km = (C21629019km) aLAdapterS3S0100000_6.l0;
        if (c21629019km.LLJLILLLLZIIL) {
            return;
        }
        Map<EnumC1106640eu6, C09AE> map = c21629019km.LLJLLIL;
        EnumC1106640eu6 enumC1106640eu6 = EnumC1106640eu6.ANIMATION;
        C09AE c09ae = (C09AE) ((LinkedHashMap) map).get(enumC1106640eu6);
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        Map<EnumC1106640eu6, C09AE> map2 = ((C21629019km) aLAdapterS3S0100000_6.l0).LLJLLIL;
        C1DFH c1dfh = C0PEM.LIZ;
        map2.put(enumC1106640eu6, C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C433570GzL((C21629019km) aLAdapterS3S0100000_6.l0, null), 3));
    }

    public static final void onAnimationEnd$9(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((AnimatorSet) aLAdapterS3S0100000_6.l0).start();
    }

    public static final void onAnimationRepeat$0(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lottie A onAnimationRepeat — loop iteration (viewHash=");
        sbLIZ.append(((C1295960jpS) aLAdapterS3S0100000_6.l0).hashCode());
        sbLIZ.append(')');
        C20441214yg.LIZIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationStart$0(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LLLLLLZZ((TuxIconView) aLAdapterS3S0100000_6.l0, 0);
    }

    public static final void onAnimationStart$1(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0100000_6.l0);
        C786410Ut5.T4((View) aLAdapterS3S0100000_6.l0, 0.0f);
    }

    public static final void onAnimationStart$10(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C1858620ySy c1858620ySy = (C1858620ySy) aLAdapterS3S0100000_6.l0;
        int visibility = c1858620ySy.getVisibility();
        c1858620ySy.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1858620ySy);
    }

    public static final void onAnimationStart$11(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((C429740GtA) aLAdapterS3S0100000_6.l0).e0();
    }

    public static final void onAnimationStart$12(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        AnimatorSet animatorSet = ((C419400GcU) aLAdapterS3S0100000_6.l0).LLILZIL;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public static final void onAnimationStart$14(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationStart$15(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C337180DJs.LIZJ((ImageView) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationStart$17(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.Ob((View) aLAdapterS3S0100000_6.l0, 1.0f);
        C786410Ut5.pc((View) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationStart$18(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.Ob((View) aLAdapterS3S0100000_6.l0, 1.0f);
        C786410Ut5.pc((View) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationStart$19(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C339190DRl.LIZLLL((View) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationStart$2(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C434000H0c tvLiveTipsFromXml = ((C21629019km) aLAdapterS3S0100000_6.l0).getTvLiveTipsFromXml();
        if (tvLiveTipsFromXml != null) {
            tvLiveTipsFromXml.setTextColor(ColorProtector.parseColor("#B2FFFFFF"));
        }
        C434000H0c tvLiveTipsFromXml2 = ((C21629019km) aLAdapterS3S0100000_6.l0).getTvLiveTipsFromXml();
        if (tvLiveTipsFromXml2 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(tvLiveTipsFromXml2);
            tvLiveTipsFromXml2.setAlpha(1.0f);
        }
    }

    public static final void onAnimationStart$20(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0100000_6.l0);
    }

    public static final void onAnimationStart$21(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        Function1 function1 = (Function1) aLAdapterS3S0100000_6.l0;
        if (function1 != null) {
            function1.invoke(1);
        }
    }

    public static final void onAnimationStart$22(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Lottie A onAnimationStart — playback STARTED (viewHash=");
        sbLIZ.append(((C1295960jpS) aLAdapterS3S0100000_6.l0).hashCode());
        sbLIZ.append(" duration=");
        sbLIZ.append(((C1295960jpS) aLAdapterS3S0100000_6.l0).getDuration());
        sbLIZ.append("ms repeatCount=");
        sbLIZ.append(((C1295960jpS) aLAdapterS3S0100000_6.l0).getRepeatCount());
        sbLIZ.append(" progress=");
        sbLIZ.append(((C1295960jpS) aLAdapterS3S0100000_6.l0).getProgress());
        sbLIZ.append(')');
        C20441214yg.LJIIIZ("QuickPairWaitingAnimComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationStart$23(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((C19599711mF) aLAdapterS3S0100000_6.l0).getClass();
        C1440005kM.LIZ(new C453940Hr6(true, false, (AbstractC453920Hr4) C453930Hr5.LIZ));
    }

    public static final void onAnimationStart$3(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        ((C21629019km) aLAdapterS3S0100000_6.l0).LJIIIIZZ(!r1.LLJLL);
        ((C21629019km) aLAdapterS3S0100000_6.l0).LJIILLIIL();
        ((C21629019km) aLAdapterS3S0100000_6.l0).getSubTitleHelper().LIZ(((C21629019km) aLAdapterS3S0100000_6.l0).getPreviewLiveSubTips(), ((C21629019km) aLAdapterS3S0100000_6.l0).getPreviewContextData());
    }

    public static final void onAnimationStart$4(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C339190DRl.LIZLLL(((C1052130dUB) aLAdapterS3S0100000_6.l0).LLILZIL);
    }

    public static final void onAnimationStart$6(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationStart(animator);
        FrameLayout waveAnimationContainerFromXml = ((C15DF) aLAdapterS3S0100000_6.l0).getWaveAnimationContainerFromXml();
        if (waveAnimationContainerFromXml != null) {
            C786410Ut5.LJZ(0, waveAnimationContainerFromXml);
        }
    }

    public static final void onAnimationStart$7(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        super.onAnimationStart(animator);
        C786410Ut5.T4((View) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationStart$8(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.B5((TuxTextView) aLAdapterS3S0100000_6.l0, 1.0f);
    }

    public static final void onAnimationStart$9(ALAdapterS3S0100000_6 aLAdapterS3S0100000_6, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS3S0100000_6.l0);
        C786410Ut5.T4((View) aLAdapterS3S0100000_6.l0, 0.0f);
    }
}
