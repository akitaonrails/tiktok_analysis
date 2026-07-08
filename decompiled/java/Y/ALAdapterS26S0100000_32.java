package Y;

import X.AbstractC21463118z7;
import X.AnonymousClass1853;
import X.AnonymousClass1863;
import X.AnonymousClass1964;
import X.AnonymousClass1965;
import X.AnonymousClass1985;
import X.C0F96;
import X.C1421105hJ;
import X.C1741890vQh;
import X.C187K;
import X.C187R;
import X.C195F;
import X.C195H;
import X.C195U;
import X.C196E;
import X.C2097608Jq;
import X.C21212117zj;
import X.C21212917zr;
import X.C212219183d;
import X.C212329187j;
import X.C212334187o;
import X.C21389618nG;
import X.C21392818nm;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LiveBagIconAnimationItem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class ALAdapterS26S0100000_32 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (6 - this.$t != 0) {
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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            case 21:
            case 22:
            case 23:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$9(this, animator);
                break;
            case 14:
                onAnimationEnd$10(this, animator);
                break;
            case 15:
                onAnimationEnd$11(this, animator);
                break;
            case 16:
                onAnimationEnd$12(this, animator);
                break;
            case 19:
                onAnimationEnd$13(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$14(this, animator);
                break;
            case 25:
                onAnimationEnd$15(this, animator);
                break;
            case 26:
                onAnimationEnd$16(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator, z);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$1(this, animator, z);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$2(this, animator, z);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$3(this, animator, z);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$4(this, animator, z);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$5(this, animator, z);
                break;
            case 21:
                onAnimationEnd$6(this, animator, z);
                break;
            case 22:
                onAnimationEnd$7(this, animator, z);
                break;
            case 23:
                onAnimationEnd$8(this, animator, z);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationEnd$9(this, animator, z);
                break;
            default:
                super.onAnimationEnd(animator, z);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 5:
                onAnimationStart$0(this, animator);
                break;
            case 26:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS26S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        ((AnonymousClass1863) aLAdapterS26S0100000_32.l0).LJJIIJ();
        ((AnonymousClass1863) aLAdapterS26S0100000_32.l0).LJFF = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS26S0100000_32.l0).invoke();
    }

    public static final void onAnimationEnd$1(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        AnonymousClass1985 anonymousClass1985 = (AnonymousClass1985) aLAdapterS26S0100000_32.l0;
        FrameLayout frameLayout = anonymousClass1985.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.LJJJZ(anonymousClass1985.LLILZ, frameLayout);
        }
    }

    public static final void onAnimationEnd$10(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        ((C196E) aLAdapterS26S0100000_32.l0).LJJJJLL(true);
    }

    public static final void onAnimationEnd$11(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        super.onAnimationEnd(animator);
        C21389618nG.LJII((View) aLAdapterS26S0100000_32.l0);
    }

    public static final void onAnimationEnd$12(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        super.onAnimationEnd(animator);
        ((C212334187o) aLAdapterS26S0100000_32.l0).setCountDownText(-1L);
    }

    public static final void onAnimationEnd$13(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        ((AbstractC21463118z7) aLAdapterS26S0100000_32.l0).LJIIL();
        animator.removeListener(aLAdapterS26S0100000_32);
    }

    public static final void onAnimationEnd$14(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS26S0100000_32.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        super.onAnimationEnd(animator);
        C195H c195h = ((C195F) aLAdapterS26S0100000_32.l0).LIZJ;
        if (!c195h.LIZIZ) {
            c195h.LIZIZ = true;
            c195h.LIZ.run();
        }
        ((C195F) aLAdapterS26S0100000_32.l0).LIZIZ.removeListener(aLAdapterS26S0100000_32);
    }

    public static final void onAnimationEnd$16(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        IIconSlot.SlotViewModel slotViewModel = ((C21212117zj) aLAdapterS26S0100000_32.l0).LLJ;
        if (slotViewModel == null || (mutableLiveData2 = slotViewModel.LLJJIJI) == null || !Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.FALSE)) {
            IIconSlot.SlotViewModel slotViewModel2 = ((C21212117zj) aLAdapterS26S0100000_32.l0).LLJ;
            if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLJJIJI) != null) {
                mutableLiveData.setValue(Boolean.FALSE);
            }
            ((C21212117zj) aLAdapterS26S0100000_32.l0).LJJIZ(false);
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        ((AnonymousClass1965) aLAdapterS26S0100000_32.l0).LJJJJLL(true);
    }

    public static final void onAnimationEnd$3(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        ((AnonymousClass1965) aLAdapterS26S0100000_32.l0).LLJILJILJ.run();
    }

    public static final void onAnimationEnd$4(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        View topTabContainer;
        C0F96 c0f96 = ((C21392818nm) aLAdapterS26S0100000_32.l0).LLILLL;
        if ((c0f96 == null || !c0f96.isFocused()) && (topTabContainer = ((C21392818nm) aLAdapterS26S0100000_32.l0).getTopTabContainer()) != null) {
            C786410Ut5.T4(topTabContainer, 1.0f);
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        ((AnonymousClass1863) aLAdapterS26S0100000_32.l0).LJJIIJ();
        ((AnonymousClass1863) aLAdapterS26S0100000_32.l0).LJFF = null;
    }

    public static final void onAnimationEnd$6(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        ((C195U) aLAdapterS26S0100000_32.l0).LJFF.invoke();
    }

    public static final void onAnimationEnd$7(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        ((C195U) aLAdapterS26S0100000_32.l0).LJ.invoke();
    }

    public static final void onAnimationEnd$8(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        ((AnonymousClass1964) aLAdapterS26S0100000_32.l0).LJJJJLL(true);
    }

    public static final void onAnimationEnd$9(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        ((AnonymousClass1964) aLAdapterS26S0100000_32.l0).LLJJIII.run();
    }

    public static final void onAnimationStart$0(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        View topTabContainer;
        C0F96 c0f96 = ((C21392818nm) aLAdapterS26S0100000_32.l0).LLILLL;
        if (c0f96 != null && c0f96.isFocused() && (topTabContainer = ((C21392818nm) aLAdapterS26S0100000_32.l0).getTopTabContainer()) != null) {
            C786410Ut5.T4(topTabContainer, 0.0f);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator) {
        Integer num;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<String> mutableLiveData;
        HashMap<String, Object> mapLJIIJ;
        MutableLiveData<String> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        super.onAnimationStart(animator);
        C21212117zj c21212117zj = (C21212117zj) aLAdapterS26S0100000_32.l0;
        IIconSlot.SlotViewModel slotViewModel2 = c21212117zj.LLJ;
        if (slotViewModel2 != null) {
            num = slotViewModel2.LLJZ;
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 5) {
                IIconSlot.SlotViewModel slotViewModel3 = c21212117zj.LLJ;
                if (slotViewModel3 != null && (mutableLiveData3 = slotViewModel3.LLJJJJLIIL) != null) {
                    mutableLiveData3.setValue(Boolean.TRUE);
                }
                IIconSlot.SlotViewModel slotViewModel4 = c21212117zj.LLJ;
                if (slotViewModel4 != null && (mutableLiveData2 = slotViewModel4.LLILZLL) != null) {
                    mutableLiveData2.setValue("");
                }
                C21212917zr c21212917zrLJJIJIIJIL = c21212117zj.LJJIJIIJIL();
                if (c21212917zrLJJIJIIJIL != null) {
                    c21212917zrLJJIJIIJIL.LJ();
                    LiveBagIconAnimationItem liveBagIconAnimationItem = c21212917zrLJJIJIIJIL.LJJIFFI;
                    if (liveBagIconAnimationItem != null) {
                        Map mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("page_name", "live"), new Pair("toast_name", "promotion_type"));
                        String str = liveBagIconAnimationItem.daInfo;
                        if (str != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null) {
                            mapLJIIJ2.putAll(mapLJIIJ);
                        }
                        C1421105hJ.LIZJ("tiktokec_toast_show", mapLJIIJ2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (num.intValue() != 8 || (slotViewModel = c21212117zj.LLJ) == null || (mutableLiveData = slotViewModel.LLILZLL) == null) {
                return;
            }
            mutableLiveData.setValue("");
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator, boolean z) {
        if (((C212219183d) aLAdapterS26S0100000_32.l0).LLLFFI.LJI()) {
            ((C212219183d) aLAdapterS26S0100000_32.l0).LLLFFI.LJIIJ(false);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator, boolean z) {
        C212329187j c212329187j = (C212329187j) aLAdapterS26S0100000_32.l0;
        c212329187j.LJJIII(c212329187j.LJJIIZ(), (TuxTextView) ((C212329187j) aLAdapterS26S0100000_32.l0).LJIILLIIL.getValue(), true);
    }

    public static final void onAnimationEnd$2(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator, boolean z) {
        C212329187j c212329187j = (C212329187j) aLAdapterS26S0100000_32.l0;
        c212329187j.LJJIII(c212329187j.LJJIIZ(), (TuxTextView) ((C212329187j) aLAdapterS26S0100000_32.l0).LJIILLIIL.getValue(), false);
    }

    public static final void onAnimationEnd$3(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator, boolean z) {
        ((C187K) aLAdapterS26S0100000_32.l0).LJIJJ(false);
    }

    public static final void onAnimationEnd$4(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator, boolean z) {
        C187R c187r = (C187R) aLAdapterS26S0100000_32.l0;
        c187r.LJJIIJ(c187r.LJJIIZI(), (TuxTextView) ((C187R) aLAdapterS26S0100000_32.l0).LJIIZILJ.getValue(), true);
    }

    public static final void onAnimationEnd$5(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator, boolean z) {
        C187R c187r = (C187R) aLAdapterS26S0100000_32.l0;
        c187r.LJJIIJ(c187r.LJJIIZI(), (TuxTextView) ((C187R) aLAdapterS26S0100000_32.l0).LJIIZILJ.getValue(), false);
    }

    public static final void onAnimationEnd$6(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator, boolean z) {
        ((AnonymousClass1853) aLAdapterS26S0100000_32.l0).LLLIL.LJIIIZ(false);
    }

    public static final void onAnimationEnd$7(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator, boolean z) {
        ((AnonymousClass1853) aLAdapterS26S0100000_32.l0).LLLILZ.LJIIIZ(false);
        ((AnonymousClass1853) aLAdapterS26S0100000_32.l0).V0();
    }

    public static final void onAnimationEnd$8(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator, boolean z) {
        if (((AnonymousClass1853) aLAdapterS26S0100000_32.l0).LLLIILIL.LJFF()) {
            ((AnonymousClass1853) aLAdapterS26S0100000_32.l0).LLLIILIL.LJIIIZ(false);
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS26S0100000_32 aLAdapterS26S0100000_32, Animator animator, boolean z) {
        ((AnonymousClass1853) aLAdapterS26S0100000_32.l0).LLLFFI.LJIIIZ(false);
    }
}
