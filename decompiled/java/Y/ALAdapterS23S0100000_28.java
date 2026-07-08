package Y;

import X.AbstractC1912160zrK;
import X.C013C;
import X.C1189060h32;
import X.C1295960jpS;
import X.C1322110kVd;
import X.C1391190mJ3;
import X.C1619980sG4;
import X.C1892600zLm;
import X.C1897280zTK;
import X.C1897290zTL;
import X.C1897300zTM;
import X.C1898700zVc;
import X.C1902360zbW;
import X.C1911400zq6;
import X.C1911410zq7;
import X.C19ME;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C785100Uqy;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1902000zaw;
import X.EnumC1911450zqB;
import X.InterfaceC784990Uqn;
import X.InterfaceC785110Uqz;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService;
import com.ss.android.ugc.aweme.journey.step.slogan.SloganAndConsentFragment;
import com.ss.android.ugc.aweme.localservice.live.common.config.TtlsLiveConfigSettings;
import com.ss.android.ugc.aweme.notification.open.container.NoticeBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class ALAdapterS23S0100000_28 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$1(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
    }

    public static final void onAnimationCancel$2(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
    }

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
            default:
                super.onAnimationCancel(animator);
                break;
            case 4:
                onAnimationCancel$2(this, animator);
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
            case 14:
            case 15:
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
            default:
                super.onAnimationEnd(animator);
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
            case 19:
                onAnimationEnd$13(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 6:
                onAnimationStart$0(this, animator);
                break;
            case 7:
                onAnimationStart$1(this, animator);
                break;
            case 8:
                onAnimationStart$2(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            default:
                super.onAnimationStart(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$3(this, animator);
                break;
            case 14:
                onAnimationStart$4(this, animator);
                break;
            case 15:
                onAnimationStart$5(this, animator);
                break;
            case 16:
                onAnimationStart$6(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationStart$7(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationStart$8(this, animator);
                break;
        }
    }

    public ALAdapterS23S0100000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        C1911410zq7.LIZ("SloganAndConsentFrag", "onAnimationCancel exitSloganPageWithDelay");
        SloganAndConsentFragment sloganAndConsentFragment = (SloganAndConsentFragment) aLAdapterS23S0100000_28.l0;
        sloganAndConsentFragment.LLLIILIL = true;
        sloganAndConsentFragment.hS();
        ((SloganAndConsentFragment) aLAdapterS23S0100000_28.l0).iS();
    }

    public static final void onAnimationEnd$0(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        C1911410zq7.LIZ("SloganAndConsentFrag", "proceed onAnimationEnd3 under small screen");
        SloganAndConsentFragment sloganAndConsentFragment = (SloganAndConsentFragment) aLAdapterS23S0100000_28.l0;
        sloganAndConsentFragment.LLLIILIL = true;
        sloganAndConsentFragment.cS();
    }

    public static final void onAnimationEnd$1(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        C1911410zq7.LIZ("SloganAndConsentFrag", "onAnimationEnd exitSloganPageWithDelay");
        SloganAndConsentFragment sloganAndConsentFragment = (SloganAndConsentFragment) aLAdapterS23S0100000_28.l0;
        sloganAndConsentFragment.LLLIILIL = true;
        sloganAndConsentFragment.hS();
        ((SloganAndConsentFragment) aLAdapterS23S0100000_28.l0).iS();
    }

    public static final void onAnimationEnd$10(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        C1295960jpS c1295960jpS = ((C1897300zTM) aLAdapterS23S0100000_28.l0).LIZLLL;
        if (c1295960jpS != null) {
            c1295960jpS.setRepeatCount(-1);
        }
        C1295960jpS c1295960jpS2 = ((C1897300zTM) aLAdapterS23S0100000_28.l0).LIZLLL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.removeAllAnimatorListeners();
        }
        C1295960jpS c1295960jpS3 = ((C1897300zTM) aLAdapterS23S0100000_28.l0).LIZLLL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.playAnimation();
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        C1322110kVd c1322110kVd = ((C1897280zTK) aLAdapterS23S0100000_28.l0).LJIJ;
        if (c1322110kVd != null) {
            C786410Ut5.LLZZLLIL(c1322110kVd, 8);
        }
        C1322110kVd c1322110kVd2 = ((C1897280zTK) aLAdapterS23S0100000_28.l0).LJIJ;
        if (c1322110kVd2 != null) {
            C786410Ut5.H5(c1322110kVd2, 1.0f);
        }
    }

    public static final void onAnimationEnd$12(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        C1295960jpS c1295960jpS = ((C1897290zTL) aLAdapterS23S0100000_28.l0).LJIIL;
        if (c1295960jpS != null) {
            c1295960jpS.setRepeatCount(-1);
        }
        C1295960jpS c1295960jpS2 = ((C1897290zTL) aLAdapterS23S0100000_28.l0).LJIIL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.removeAllAnimatorListeners();
        }
        C1295960jpS c1295960jpS3 = ((C1897290zTL) aLAdapterS23S0100000_28.l0).LJIIL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.playAnimation();
        }
    }

    public static final void onAnimationEnd$13(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS23S0100000_28.l0);
    }

    public static final void onAnimationEnd$2(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnimationEnd shakehandsSet: ");
        sbLIZ.append(((SloganAndConsentFragment) aLAdapterS23S0100000_28.l0).LLJZIJLIL);
        C1911410zq7.LIZ("SloganAndConsentFrag", C2188811AlT.LIZIZ(sbLIZ));
        SloganAndConsentFragment sloganAndConsentFragment = (SloganAndConsentFragment) aLAdapterS23S0100000_28.l0;
        if (sloganAndConsentFragment.LLJZIJLIL != null) {
            C1911410zq7.LIZ("SloganAndConsentFrag", "proceed onAnimationEnd3");
            sloganAndConsentFragment.LLLIILIL = true;
            sloganAndConsentFragment.cS();
            return;
        }
        C1911410zq7.LIZLLL("SloganAndConsentFrag", "skip onAnimationEnd3");
    }

    public static final void onAnimationEnd$3(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAnimationEnd shakeHndsScaleY: ");
        sbLIZ.append(((SloganAndConsentFragment) aLAdapterS23S0100000_28.l0).LLJZ);
        C1911410zq7.LIZ("SloganAndConsentFrag", C2188811AlT.LIZIZ(sbLIZ));
        C1295960jpS c1295960jpS = ((SloganAndConsentFragment) aLAdapterS23S0100000_28.l0).LLJZ;
        if (c1295960jpS != null) {
            C1911410zq7.LIZ("SloganAndConsentFrag", "proceed onAnimationEnd2");
            c1295960jpS.playAnimation();
        } else {
            C1911410zq7.LIZ("SloganAndConsentFrag", "skip onAnimationEnd2");
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        float fLIZIZ;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enter onAnimationEnd1, sloganTextView: ");
        sbLIZ.append(((SloganAndConsentFragment) aLAdapterS23S0100000_28.l0).LLL);
        C1911410zq7.LIZ("SloganAndConsentFrag", C2188811AlT.LIZIZ(sbLIZ));
        SloganAndConsentFragment sloganAndConsentFragment = (SloganAndConsentFragment) aLAdapterS23S0100000_28.l0;
        TuxTextView tuxTextView = sloganAndConsentFragment.LLL;
        if (tuxTextView != null) {
            C1911410zq7.LIZ("SloganAndConsentFrag", "proceed onAnimationEnd1");
            if (sloganAndConsentFragment.oS()) {
                sloganAndConsentFragment.LLLIILIL = true;
                sloganAndConsentFragment.iS();
                return;
            }
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            C1911410zq7.LIZ("SloganAndConsentFrag", "enter showConsentLottieWithAnimation");
            LinearLayout linearLayout = sloganAndConsentFragment.LLJLIL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            EnumC1911450zqB enumC1911450zqBGS = SloganAndConsentFragment.gS();
            EnumC1911450zqB enumC1911450zqB = EnumC1911450zqB.INLINE;
            if (enumC1911450zqBGS == enumC1911450zqB && C1911400zq6.LIZ(sloganAndConsentFragment.getContext())) {
                if (SloganAndConsentFragment.gS() != enumC1911450zqB || !C1911400zq6.LIZ(sloganAndConsentFragment.getContext())) {
                    return;
                }
                C1295960jpS c1295960jpS = sloganAndConsentFragment.LLJZ;
                if (c1295960jpS != null) {
                    c1295960jpS.cancelAnimation();
                    C786410Ut5.LLD(8, c1295960jpS);
                }
                LinearLayout linearLayout2 = sloganAndConsentFragment.LLJLIL;
                if (linearLayout2 != null) {
                    layoutParams = linearLayout2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                    c19me.topToTop = 0;
                    c19me.bottomToTop = -1;
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
                    c19me.verticalBias = 1.0f;
                    LinearLayout linearLayout3 = sloganAndConsentFragment.LLJLIL;
                    if (linearLayout3 != null) {
                        C786410Ut5.d6(linearLayout3, c19me);
                    }
                }
                LinearLayout linearLayout4 = sloganAndConsentFragment.LLJLIL;
                if (linearLayout4 == null) {
                    return;
                }
                C786410Ut5.LJZL(0, linearLayout4);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(linearLayout4, "translationY", C418440Gaw.LIZIZ(70), 0.0f);
                objectAnimatorOfFloat5.setDuration(800L);
                objectAnimatorOfFloat5.setInterpolator(C1619980sG4.LJIIJ());
                objectAnimatorOfFloat5.addListener(new ALAdapterS23S0100000_28(sloganAndConsentFragment, 0));
                C786410Ut5.Pd(objectAnimatorOfFloat5);
                return;
            }
            if (SloganAndConsentFragment.gS() == enumC1911450zqB) {
                fLIZIZ = C418440Gaw.LIZIZ(-70);
            } else {
                fLIZIZ = 0.0f;
            }
            LinearLayout linearLayout5 = sloganAndConsentFragment.LLJLIL;
            if (linearLayout5 != null) {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout5, "translationY", C418440Gaw.LIZIZ(50), fLIZIZ);
                objectAnimatorOfFloat.setStartDelay(0L);
                objectAnimatorOfFloat.setDuration(800L);
                objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIJ());
            } else {
                objectAnimatorOfFloat = null;
            }
            C1295960jpS c1295960jpS2 = sloganAndConsentFragment.LLJZ;
            if (c1295960jpS2 != null) {
                C786410Ut5.Wb(c1295960jpS2, 0.0f);
                C786410Ut5.vc(c1295960jpS2, 0.0f);
                C786410Ut5.LLD(0, c1295960jpS2);
            }
            C1295960jpS c1295960jpS3 = sloganAndConsentFragment.LLJZ;
            if (c1295960jpS3 != null) {
                objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1295960jpS3, "translationY", 0.0f, fLIZIZ);
                objectAnimatorOfFloat2.setStartDelay(0L);
                objectAnimatorOfFloat2.setDuration(800L);
                objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIJ());
            } else {
                objectAnimatorOfFloat2 = null;
            }
            C1295960jpS c1295960jpS4 = sloganAndConsentFragment.LLJZ;
            if (c1295960jpS4 != null) {
                objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(c1295960jpS4, "scaleX", 0.0f, 1.0f);
                objectAnimatorOfFloat3.setStartDelay(0L);
                objectAnimatorOfFloat3.setDuration(800L);
                objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJIIJ());
            } else {
                objectAnimatorOfFloat3 = null;
            }
            C1295960jpS c1295960jpS5 = sloganAndConsentFragment.LLJZ;
            if (c1295960jpS5 != null) {
                objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c1295960jpS5, "scaleY", 0.0f, 1.0f);
                objectAnimatorOfFloat4.setStartDelay(0L);
                objectAnimatorOfFloat4.setDuration(800L);
                objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJIIJ());
                objectAnimatorOfFloat4.addListener(new ALAdapterS23S0100000_28(sloganAndConsentFragment, 3));
            } else {
                objectAnimatorOfFloat4 = null;
            }
            if (objectAnimatorOfFloat != null && objectAnimatorOfFloat3 != null && objectAnimatorOfFloat4 != null) {
                C1911410zq7.LIZ("SloganAndConsentFrag", "proceed showConsentLottieWithAnimation");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.addListener(new ALAdapterS23S0100000_28(sloganAndConsentFragment, 2));
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                animatorSet.start();
                return;
            }
            C1911410zq7.LIZLLL("SloganAndConsentFrag", "skip start animation part 2 & 3");
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        super.onAnimationEnd(animator);
        C500260Jjc.LJIILIIL(((MatchCountDownAssem) aLAdapterS23S0100000_28.l0).LLJJIII);
    }

    public static final void onAnimationEnd$6(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        super.onAnimationEnd(animator);
        AbstractC1912160zrK abstractC1912160zrK = (AbstractC1912160zrK) aLAdapterS23S0100000_28.l0;
        if (abstractC1912160zrK.LLJILLL) {
            AFwS217S0000000_28 aFwS217S0000000_28 = abstractC1912160zrK.LLILZLL.LJ;
        }
        abstractC1912160zrK.LLJILLL = false;
    }

    public static final void onAnimationEnd$7(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        int iIntValue;
        Integer num;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        IIconSlot.SlotViewModel slotViewModel = ((C1892600zLm) aLAdapterS23S0100000_28.l0).LLJILJILJ;
        if (slotViewModel == null || (mutableLiveData2 = slotViewModel.LLJJIJI) == null || !Intrinsics.LJFF(mutableLiveData2.getValue(), Boolean.FALSE)) {
            IIconSlot.SlotViewModel slotViewModel2 = ((C1892600zLm) aLAdapterS23S0100000_28.l0).LLJILJILJ;
            if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LLJJIJI) != null) {
                mutableLiveData.setValue(Boolean.FALSE);
            }
            final C1892600zLm c1892600zLm = (C1892600zLm) aLAdapterS23S0100000_28.l0;
            c1892600zLm.LLJILLL = false;
            final C013C c013c = new C013C();
            IIconSlot.SlotViewModel slotViewModel3 = c1892600zLm.LLJILJILJ;
            if (slotViewModel3 != null) {
                slotViewModel3.LLL = new InterfaceC784990Uqn() { // from class: X.0zLw
                    @Override // X.InterfaceC784990Uqn
                    public final void LIZ() {
                        c013c.element = true;
                    }
                };
                slotViewModel3.LLLF = new InterfaceC785110Uqz() { // from class: X.0zLv
                    @Override // X.InterfaceC785110Uqz
                    public final void LIZ(int i) {
                        c013c.element = false;
                        Function0<Unit> function0 = c1892600zLm.LLJJ;
                        if (function0 != null) {
                            function0.invoke();
                        }
                        c1892600zLm.LLJJ = null;
                    }
                };
                TtlsLiveConfigSettings.ShopBagConfigModel shopBagConfigModel = TtlsLiveConfigSettings.LIZ().shopBagConfig;
                if (shopBagConfigModel != null && (num = shopBagConfigModel.bubbleShowDuration) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 2000;
                }
                slotViewModel3.LLJLIL = iIntValue;
                MutableLiveData<C785100Uqy> mutableLiveData3 = slotViewModel3.LLJJI;
                if (mutableLiveData3 != null) {
                    mutableLiveData3.setValue(new C785100Uqy("TTLS_SHOP_BAG_GUIDE", c1892600zLm.LLILLJJLI.getContext().getString(2131836560)));
                }
                C1189060h32.LJIJ(new ARunnableS97S0200000_28(c013c, c1892600zLm, 37));
            }
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIIZILJ((NoticeBottomSheetDialogFragment) aLAdapterS23S0100000_28.l0, false);
        NoticeBottomSheetDialogFragment noticeBottomSheetDialogFragment = (NoticeBottomSheetDialogFragment) aLAdapterS23S0100000_28.l0;
        View viewFindViewById = noticeBottomSheetDialogFragment.LLJ;
        if (viewFindViewById == null) {
            View view = noticeBottomSheetDialogFragment.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            noticeBottomSheetDialogFragment.LLJ = (TuxNavBar) viewFindViewById;
        }
        ((TuxNavBar) viewFindViewById).LJJ(AFwS271S0000000_28.get$arr$(432), "expand");
        if (((NoticeBottomSheetDialogFragment) aLAdapterS23S0100000_28.l0).SR().biz == EnumC1902000zaw.FRIENDS) {
            ((IFriendsFeedService) ServiceManager.get().getService(IFriendsFeedService.class)).R1(true);
        }
    }

    public static final void onAnimationEnd$9(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        C786410Ut5.LLIL(((C1898700zVc) aLAdapterS23S0100000_28.l0).getCoinTextView(), 8);
    }

    public static final void onAnimationStart$0(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        super.onAnimationStart(animator);
        C500260Jjc.LLFFF(((MatchCountDownAssem) aLAdapterS23S0100000_28.l0).LLJJIII);
    }

    public static final void onAnimationStart$1(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        super.onAnimationStart(animator);
        ((AbstractC1912160zrK) aLAdapterS23S0100000_28.l0).LLJILLL = true;
    }

    public static final void onAnimationStart$2(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        super.onAnimationStart(animator);
        C1892600zLm c1892600zLm = (C1892600zLm) aLAdapterS23S0100000_28.l0;
        c1892600zLm.LLJILLL = true;
        c1892600zLm.LJJIIZI("StepBagAnimationStart", new JSONObject());
    }

    public static final void onAnimationStart$3(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        C1322110kVd c1322110kVd = ((C1897280zTK) aLAdapterS23S0100000_28.l0).LJIJ;
        if (c1322110kVd != null) {
            C786410Ut5.LLZZLLIL(c1322110kVd, 0);
        }
    }

    public static final void onAnimationStart$4(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        LinearLayout linearLayout = ((C1897280zTK) aLAdapterS23S0100000_28.l0).LJIIZILJ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
    }

    public static final void onAnimationStart$5(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        TuxTextView tuxTextView = ((C1897280zTK) aLAdapterS23S0100000_28.l0).LJIIIZ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    public static final void onAnimationStart$6(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        TuxTextView tuxTextView = ((C1897280zTK) aLAdapterS23S0100000_28.l0).LJIIJ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    public static final void onAnimationStart$7(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        FrameLayout frameLayout = ((C1897280zTK) aLAdapterS23S0100000_28.l0).LJIILIIL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
    }

    public static final void onAnimationStart$8(ALAdapterS23S0100000_28 aLAdapterS23S0100000_28, Animator animator) {
        super.onAnimationStart(animator);
        Function0<Unit> function0 = ((C1902360zbW) aLAdapterS23S0100000_28.l0).LLIZLLLIL;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
