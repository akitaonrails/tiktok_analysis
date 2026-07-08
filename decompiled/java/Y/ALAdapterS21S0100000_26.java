package Y;

import X.C04CK;
import X.C1154360g94;
import X.C1295960jpS;
import X.C1748340vb6;
import X.C1748720vbi;
import X.C1754640vlG;
import X.C1754650vlH;
import X.C1755130vm3;
import X.C1765350w2X;
import X.C1765620w2y;
import X.C1765730w39;
import X.C1954807lC;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1154350g93;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public class ALAdapterS21S0100000_26 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationStart$1(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 4:
                onAnimationCancel$1(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
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
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$11(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$12(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$0(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$1(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
            default:
                super.onAnimationStart(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public ALAdapterS21S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1754650vlH) aLAdapterS21S0100000_26.l0).LLLFFI = 1.0f;
    }

    public static final void onAnimationCancel$1(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1754640vlG) aLAdapterS21S0100000_26.l0).LLLFF = 1.0f;
    }

    public static final void onAnimationCancel$2(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        C1748340vb6 c1748340vb6 = (C1748340vb6) aLAdapterS21S0100000_26.l0;
        c1748340vb6.LLILLL = false;
        if (c1748340vb6.getLayerType() == 2) {
            c1748340vb6.setLayerType(0, null);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1754650vlH) aLAdapterS21S0100000_26.l0).LLJJI.LJI(false);
    }

    public static final void onAnimationEnd$1(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1765730w39) aLAdapterS21S0100000_26.l0).setNeedShowMask(false);
        ((C1765730w39) aLAdapterS21S0100000_26.l0).LIZIZ();
    }

    public static final void onAnimationEnd$10(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1765350w2X) aLAdapterS21S0100000_26.l0).G2(1);
    }

    public static final void onAnimationEnd$11(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ListProtector.remove((List) aLAdapterS21S0100000_26.l0, 0);
    }

    public static final void onAnimationEnd$12(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        C1748340vb6 c1748340vb6 = (C1748340vb6) aLAdapterS21S0100000_26.l0;
        c1748340vb6.LLILLL = false;
        if (c1748340vb6.getLayerType() == 2) {
            c1748340vb6.setLayerType(0, null);
        }
        ((C1748340vb6) aLAdapterS21S0100000_26.l0).requestLayout();
    }

    public static final void onAnimationEnd$2(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1765730w39) aLAdapterS21S0100000_26.l0).LIZIZ();
    }

    public static final void onAnimationEnd$3(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1765730w39) aLAdapterS21S0100000_26.l0).setNeedShowMask(true);
        ((C1765730w39) aLAdapterS21S0100000_26.l0).LIZ(3000L);
        ((C1765730w39) aLAdapterS21S0100000_26.l0).LIZIZ();
    }

    public static final void onAnimationEnd$4(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1754640vlG) aLAdapterS21S0100000_26.l0).LLJJI.LJI(false);
    }

    public static final void onAnimationEnd$5(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        PdpBodyAssem pdpBodyAssem = (PdpBodyAssem) aLAdapterS21S0100000_26.l0;
        EnumC1154350g93 enumC1154350g93 = EnumC1154350g93.TIME_END;
        pdpBodyAssem.getClass();
        Keva keva = C1755130vm3.LIZ;
        if (!keva.getBoolean(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId(), false)) {
            if (pdpBodyAssem.LLLI) {
                PdpViewModel pdpViewModelLp = pdpBodyAssem.lp();
                if (pdpViewModelLp != null && pdpViewModelLp.LLJLILLLLZIIL != null) {
                    ECBaseFragment eCBaseFragment = (ECBaseFragment) C724240Sb0.LJI(pdpBodyAssem);
                    int i = C1154360g94.LIZ[enumC1154350g93.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            C1748720vbi.LIZIZ(eCBaseFragment, new C04CK() { // from class: X.0vm1
                                @Override // X.AbstractC1748790vbp
                                public final C1748850vbv LIZ() {
                                    return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("product_id", new C1747940vaS[0]), new C1748840vbu("shop_id", new C1747940vaS[0]), new C1748840vbu("gesture_type", new C1747940vaS[0]), new C1748840vbu("disappear_type", new C1747940vaS[0]));
                                }
                            }, AFwS268S0000000_26.get$arr$(749));
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        C1748720vbi.LIZIZ(eCBaseFragment, new C04CK() { // from class: X.0vm1
                            @Override // X.AbstractC1748790vbp
                            public final C1748850vbv LIZ() {
                                return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("product_id", new C1747940vaS[0]), new C1748840vbu("shop_id", new C1747940vaS[0]), new C1748840vbu("gesture_type", new C1747940vaS[0]), new C1748840vbu("disappear_type", new C1747940vaS[0]));
                            }
                        }, AFwS268S0000000_26.get$arr$(748));
                    }
                }
                keva.storeBoolean(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId(), true);
                pdpBodyAssem.LLLI = false;
            }
            C1295960jpS c1295960jpS = (C1295960jpS) pdpBodyAssem.getContentView().findViewById(R.id.ius);
            LinearLayout linearLayout = (LinearLayout) pdpBodyAssem.getContentView().findViewById(R.id.wsg);
            C786410Ut5.LLD(8, c1295960jpS);
            AnimatorSet animatorSet = pdpBodyAssem.LLLII;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = pdpBodyAssem.LLLII;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            pdpBodyAssem.LLLII = null;
            ValueAnimator valueAnimator = pdpBodyAssem.LLLIIII;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = pdpBodyAssem.LLLIIII;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
            }
            pdpBodyAssem.LLLIIII = null;
            C786410Ut5.Mc(linearLayout, 0.0f);
        }
    }

    public static final void onAnimationEnd$6(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1765620w2y) aLAdapterS21S0100000_26.l0).setNeedShowMask(false);
        ((C1765620w2y) aLAdapterS21S0100000_26.l0).LIZLLL();
    }

    public static final void onAnimationEnd$7(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        super.onAnimationEnd(animator);
        ((C1765620w2y) aLAdapterS21S0100000_26.l0).LIZLLL();
    }

    public static final void onAnimationEnd$8(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1765620w2y) aLAdapterS21S0100000_26.l0).setNeedShowMask(true);
        ((C1765620w2y) aLAdapterS21S0100000_26.l0).LIZJ(3000L);
        ((C1765620w2y) aLAdapterS21S0100000_26.l0).LIZLLL();
    }

    public static final void onAnimationEnd$9(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1765350w2X) aLAdapterS21S0100000_26.l0).G2(0);
        ((C1765350w2X) aLAdapterS21S0100000_26.l0).LLILLL = false;
    }

    public static final void onAnimationStart$0(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        ((C1765350w2X) aLAdapterS21S0100000_26.l0).G2(3);
    }

    public static final void onAnimationStart$2(ALAdapterS21S0100000_26 aLAdapterS21S0100000_26, Animator animator) {
        C1748340vb6 c1748340vb6 = (C1748340vb6) aLAdapterS21S0100000_26.l0;
        c1748340vb6.LLILLL = true;
        if (c1748340vb6.LLILZLL && c1748340vb6.LLILZIL) {
            c1748340vb6.setLayerType(2, null);
        }
    }
}
