package Y;

import X.AbstractC1263550izB;
import X.AbstractC21673719rz;
import X.C0C3D;
import X.C0W93;
import X.C1016730cZ5;
import X.C1036360d4k;
import X.C1036540d52;
import X.C1050860dS8;
import X.C1053440dWI;
import X.C1070520dxq;
import X.C1070540dxs;
import X.C1072280e0g;
import X.C1073840e3C;
import X.C1073880e3G;
import X.C1074010e3T;
import X.C10CC;
import X.C1250250idj;
import X.C1262970iyF;
import X.C1389890mGx;
import X.C1459960o5y;
import X.C1619980sG4;
import X.C1658060tFU;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1ACA;
import X.C20441214yg;
import X.C2097608Jq;
import X.C21415018rM;
import X.C2188811AlT;
import X.C291001Au;
import X.C319860CgK;
import X.C786410Ut5;
import X.C818480W8w;
import X.C996240c22;
import X.EnumC1036120d4M;
import X.EnumC1036160d4Q;
import X.EnumC1070410dxf;
import X.EnumC992450bvv;
import X.InterfaceC1036350d4j;
import X.ViewOnClickListenerC998120c54;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEgg;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggSetting;
import com.ss.android.ugc.aweme.ad.feed.shakeEgg.ShakeEggVM;
import com.ss.android.ugc.aweme.commercialize.model.ShakeModel;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.InteractionAnimationWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.tag.BcToggleInfoWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedEmptyPageCell;
import com.ss.android.ugc.aweme.history.AdWebHistoryFragment;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.PoiSlashPostsTriggerLine;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.common.ProfilePageFragment;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS7S1001000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public class AObserverS220S0100000_16 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
            case 37:
                onChanged$37(this, obj);
                break;
            case 38:
                onChanged$38(this, obj);
                break;
            case 39:
                onChanged$39(this, obj);
                break;
            case 40:
                onChanged$40(this, obj);
                break;
            case 41:
                onChanged$41(this, obj);
                break;
            case 42:
                onChanged$42(this, obj);
                break;
            case 43:
                onChanged$43(this, obj);
                break;
            case 44:
                onChanged$44(this, obj);
                break;
            case 45:
                onChanged$45(this, obj);
                break;
            case 46:
                onChanged$46(this, obj);
                break;
        }
    }

    public AObserverS220S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((FeedAdLynxCard) aObserverS220S0100000_16.l0).LJFF((FollowStatus) obj);
    }

    public static final void onChanged$1(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((FeedAdLynxCard) aObserverS220S0100000_16.l0).LJFF((FollowStatus) obj);
    }

    public static final void onChanged$10(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        C1658060tFU c1658060tFU = ((C1459960o5y) aObserverS220S0100000_16.l0).LLJJI;
        if (c1658060tFU != null) {
            float f = C996240c22.LIZ;
            LinearLayout collapsedToolbarViewContainer = c1658060tFU.getCollapsedToolbarViewContainer();
            HorizontalScrollView fixedRegionScrollView = c1658060tFU.getFixedRegionScrollView();
            LinearLayout collapseViewContainer = c1658060tFU.getCollapseViewContainer();
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(fixedRegionScrollView, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
            objectAnimatorOfFloat.setDuration(150L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(fixedRegionScrollView, "translationY", C996240c22.LIZ, 0.0f);
            objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
            objectAnimatorOfFloat2.setDuration(150L);
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(collapsedToolbarViewContainer, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJIILIIL());
            objectAnimatorOfFloat3.setDuration(150L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(collapseViewContainer, "alpha", 1.0f, 0.0f);
            objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJIILIIL());
            objectAnimatorOfFloat4.setDuration(150L);
            objectAnimatorOfFloat4.addListener(new AAListenerS327S0100000_16(collapseViewContainer, 1));
            animatorSet.playTogether(animatorSet2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
            animatorSet.addListener(new AAListenerS327S0100000_16(c1658060tFU, 10));
            animatorSet.addListener(new AAListenerS327S0100000_16(c1658060tFU, 9));
            animatorSet.start();
        }
    }

    public static final void onChanged$11(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        if (obj != null) {
            ((Function1) aObserverS220S0100000_16.l0).invoke(obj);
        }
    }

    public static final void onChanged$12(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        float f;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            View view = (View) aObserverS220S0100000_16.l0;
            boolean zBooleanValue = bool.booleanValue();
            view.setEnabled(zBooleanValue);
            if (zBooleanValue) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            C786410Ut5.T4(view, f);
        }
    }

    public static final void onChanged$13(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        float f;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            View view = (View) aObserverS220S0100000_16.l0;
            if (bool.booleanValue()) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            C786410Ut5.T4(view, f);
        }
    }

    public static final void onChanged$14(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            View view = (View) aObserverS220S0100000_16.l0;
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public static final void onChanged$15(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        Animator animator;
        if (((Boolean) obj).booleanValue()) {
            C1658060tFU c1658060tFU = ((C1459960o5y) aObserverS220S0100000_16.l0).LLJJI;
            if (c1658060tFU != null) {
                C786410Ut5.LJLLLLLL(0, c1658060tFU.getSlideGuideTouchIcon());
                C786410Ut5.LJLLLLLL(0, c1658060tFU.getSlideGuideTextView());
                float f = C996240c22.LIZ;
                View slideGuideTouchIcon = c1658060tFU.getSlideGuideTouchIcon();
                HorizontalScrollView fixedRegionScrollView = c1658060tFU.getFixedRegionScrollView();
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet animatorSet2 = new AnimatorSet();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(slideGuideTouchIcon, "scaleX", 1.0f, 0.9f);
                objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
                objectAnimatorOfFloat.setDuration(100L);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(slideGuideTouchIcon, "scaleY", 1.0f, 0.9f);
                objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIILIIL());
                objectAnimatorOfFloat2.setDuration(100L);
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                AnimatorSet animatorSet3 = new AnimatorSet();
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(slideGuideTouchIcon, "scaleX", 0.9f, 1.0f);
                objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJIILIIL());
                objectAnimatorOfFloat3.setDuration(100L);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(slideGuideTouchIcon, "scaleY", 0.9f, 1.0f);
                objectAnimatorOfFloat4.setInterpolator(C1619980sG4.LJIILIIL());
                objectAnimatorOfFloat4.setDuration(100L);
                animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                animatorSet.playSequentially(animatorSet2, C996240c22.LIZJ(slideGuideTouchIcon, fixedRegionScrollView), C996240c22.LIZ(), C996240c22.LIZLLL(slideGuideTouchIcon, fixedRegionScrollView), C996240c22.LIZ(), C996240c22.LIZJ(slideGuideTouchIcon, fixedRegionScrollView), C996240c22.LIZ(), C996240c22.LIZLLL(slideGuideTouchIcon, fixedRegionScrollView), animatorSet3);
                animatorSet.addListener(new AAListenerS327S0100000_16(c1658060tFU, 14));
                animatorSet.start();
                c1658060tFU.LLILZLL = animatorSet;
                return;
            }
            return;
        }
        C1658060tFU c1658060tFU2 = ((C1459960o5y) aObserverS220S0100000_16.l0).LLJJI;
        if (c1658060tFU2 == null || (animator = c1658060tFU2.LLILZLL) == null) {
            return;
        }
        animator.cancel();
    }

    public static final void onChanged$16(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1658060tFU c1658060tFU = ((C1459960o5y) aObserverS220S0100000_16.l0).LLJJI;
            if (c1658060tFU != null) {
                float f = C996240c22.LIZ;
                Animator animatorLIZIZ = C996240c22.LIZIZ(c1658060tFU.getCollapsedToolbarViewContainer(), c1658060tFU.getFixedRegionScrollView(), c1658060tFU.getCollapseViewContainer());
                animatorLIZIZ.addListener(new AAListenerS327S0100000_16(c1658060tFU, 12));
                animatorLIZIZ.addListener(new AAListenerS327S0100000_16(c1658060tFU, 11));
                animatorLIZIZ.start();
                return;
            }
            return;
        }
        C1658060tFU c1658060tFU2 = ((C1459960o5y) aObserverS220S0100000_16.l0).LLJJI;
        if (c1658060tFU2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, c1658060tFU2.getFixedRegionScrollView());
        float f2 = C996240c22.LIZ;
        Animator animatorLIZIZ2 = C996240c22.LIZIZ(c1658060tFU2.getCollapsedToolbarViewContainer(), c1658060tFU2.getFixedRegionScrollView(), c1658060tFU2.getCollapseViewContainer());
        animatorLIZIZ2.addListener(new AAListenerS327S0100000_16(c1658060tFU2, 13));
        animatorLIZIZ2.start();
        animatorLIZIZ2.end();
    }

    public static final void onChanged$17(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((ProfilePageFragment) aObserverS220S0100000_16.l0).LLJILJILJ = (String) obj;
    }

    public static final void onChanged$18(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        if (((Boolean) obj).booleanValue() && !TextUtils.isEmpty(((LabelContainerWidget) aObserverS220S0100000_16.l0).LLJZIJLIL)) {
            LabelContainerWidget labelContainerWidget = (LabelContainerWidget) aObserverS220S0100000_16.l0;
            labelContainerWidget.e2(labelContainerWidget.LLJZIJLIL);
        }
        ((LabelContainerWidget) aObserverS220S0100000_16.l0).LLJZIJLIL = "";
    }

    public static final void onChanged$19(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((ShakeEgg) aObserverS220S0100000_16.l0).LJIILJJIL();
    }

    public static final void onChanged$2(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ShakeEgg shakeEgg = (ShakeEgg) aObserverS220S0100000_16.l0;
        ShakeEggVM shakeEggVM = shakeEgg.LLILLL;
        if (shakeEggVM == null) {
            shakeEggVM = null;
        }
        if (shakeEggVM.LLILLJJLI) {
            shakeEgg.LJIILJJIL();
        }
        ShakeEgg shakeEgg2 = (ShakeEgg) aObserverS220S0100000_16.l0;
        int i = shakeEgg2.LLJILJIL + 1;
        shakeEgg2.LLJILJIL = i;
        if (i >= ShakeEggSetting.LIZ().destroyCount) {
            ((ShakeEgg) aObserverS220S0100000_16.l0).LJIIIZ(true);
            ((ShakeEgg) aObserverS220S0100000_16.l0).LLJILJIL = 0;
        }
    }

    public static final void onChanged$20(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        if (!((ArrayList) ((ShakeEgg) aObserverS220S0100000_16.l0).LLILZLL).contains(obj)) {
            ((ArrayList) ((ShakeEgg) aObserverS220S0100000_16.l0).LLILZLL).add(obj);
            ((ShakeEgg) aObserverS220S0100000_16.l0).LIZJ();
        }
    }

    public static final void onChanged$21(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        if (((ArrayList) ((ShakeEgg) aObserverS220S0100000_16.l0).LLILZLL).contains(obj)) {
            ((ArrayList) ((ShakeEgg) aObserverS220S0100000_16.l0).LLILZLL).remove(obj);
            if (((ArrayList) ((ShakeEgg) aObserverS220S0100000_16.l0).LLILZLL).isEmpty()) {
                if (Intrinsics.LJFF(obj, "ad_mask_block")) {
                    C1016730cZ5 c1016730cZ5 = C1016730cZ5.LIZIZ;
                    ShakeEggVM shakeEggVM = ((ShakeEgg) aObserverS220S0100000_16.l0).LLILLL;
                    if (shakeEggVM == null) {
                        shakeEggVM = null;
                    }
                    ShakeModel shakeModelLIZIZ = c1016730cZ5.LIZIZ(shakeEggVM.LL.getValue());
                    if (shakeModelLIZIZ == null || shakeModelLIZIZ.showTime != 0) {
                        return;
                    }
                }
                ((ShakeEgg) aObserverS220S0100000_16.l0).LJIIL();
            }
        }
    }

    public static final void onChanged$22(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((ShakeEgg) aObserverS220S0100000_16.l0).LJIIL();
    }

    public static final void onChanged$23(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ShakeEggVM shakeEggVM;
        String aid;
        ShakeEggVM shakeEggVM2 = ((ShakeEgg) aObserverS220S0100000_16.l0).LLILLL;
        if (shakeEggVM2 == null) {
            shakeEggVM = null;
        } else {
            shakeEggVM = shakeEggVM2;
        }
        if (shakeEggVM.LLILLL) {
            if (shakeEggVM2 == null) {
                shakeEggVM2 = null;
            }
            Aweme value = shakeEggVM2.LL.getValue();
            if (value != null && (aid = value.getAid()) != null) {
                shakeEggVM2.LLJILLL.setValue(aid);
            }
        }
    }

    public static final void onChanged$24(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        C1070540dxs c1070540dxs = (C1070540dxs) obj;
        if (c1070540dxs != null) {
            boolean z = c1070540dxs.LIZIZ;
            FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
            if (findCtxViewModel != null) {
                findCtxViewModel.LL = z;
            }
            ((Function1) aObserverS220S0100000_16.l0).invoke(Boolean.valueOf(z));
        }
    }

    public static final void onChanged$25(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        C1070540dxs c1070540dxs = (C1070540dxs) obj;
        if (c1070540dxs != null) {
            boolean z = c1070540dxs.LIZIZ;
            FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
            if (findCtxViewModel != null) {
                findCtxViewModel.LLILLJJLI = z;
            }
            ((Function1) aObserverS220S0100000_16.l0).invoke(Boolean.valueOf(z));
        }
    }

    public static final void onChanged$26(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        C1070540dxs c1070540dxs = (C1070540dxs) obj;
        if (c1070540dxs != null) {
            boolean z = c1070540dxs.LIZIZ;
            FindCtxViewModel findCtxViewModel = C1070520dxq.LIZJ;
            if (findCtxViewModel != null) {
                findCtxViewModel.LLILLL = z;
            }
            ((Function1) aObserverS220S0100000_16.l0).invoke(Boolean.valueOf(z));
        }
    }

    public static final void onChanged$27(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        float f;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        View view = (View) aObserverS220S0100000_16.l0;
        view.setEnabled(zBooleanValue);
        if (zBooleanValue) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        C786410Ut5.T4(view, f);
    }

    public static final void onChanged$28(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        float f;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        View view = (View) aObserverS220S0100000_16.l0;
        if (zBooleanValue) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        C786410Ut5.T4(view, f);
    }

    public static final void onChanged$29(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        int i;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        View view = (View) aObserverS220S0100000_16.l0;
        if (zBooleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public static final void onChanged$3(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((LiveWatchPreviewWidget) aObserverS220S0100000_16.l0).G1();
    }

    public static final void onChanged$30(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        int i;
        Boolean bool = (Boolean) obj;
        View view = (View) ((C10CC) aObserverS220S0100000_16.l0).LIZJ.getValue();
        if (view != null) {
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public static final void onChanged$31(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((ViewOnClickListenerC998120c54) aObserverS220S0100000_16.l0).LLJILJIL.LJI = ((Boolean) obj).booleanValue();
    }

    public static final void onChanged$32(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((ViewOnClickListenerC998120c54) aObserverS220S0100000_16.l0).LLJILJIL.LJII = ((Boolean) obj).booleanValue();
    }

    public static final void onChanged$33(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Float f = (Float) obj;
        if (!Intrinsics.LIZLLL(f, 0.0f)) {
            View view = ((PoiSlashPostsTriggerLine) aObserverS220S0100000_16.l0).LJ;
            ViewGroup.LayoutParams layoutParams = null;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                if (f != null) {
                    int iFloatValue = (int) f.floatValue();
                    PoiSlashPostsTriggerLine poiSlashPostsTriggerLine = (PoiSlashPostsTriggerLine) aObserverS220S0100000_16.l0;
                    marginLayoutParams.topMargin = iFloatValue + poiSlashPostsTriggerLine.LJIIL;
                    View view2 = poiSlashPostsTriggerLine.LJ;
                    if (view2 != null) {
                        C786410Ut5.W5(view2, marginLayoutParams);
                        return;
                    }
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public static final void onChanged$34(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Float f = (Float) obj;
        if (!Intrinsics.LIZLLL(f, 0.0f)) {
            View view = ((PoiSlashPostsTriggerLine) aObserverS220S0100000_16.l0).LJFF;
            ViewGroup.LayoutParams layoutParams = null;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            }
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                if (f != null) {
                    int iFloatValue = (int) f.floatValue();
                    PoiSlashPostsTriggerLine poiSlashPostsTriggerLine = (PoiSlashPostsTriggerLine) aObserverS220S0100000_16.l0;
                    marginLayoutParams.topMargin = iFloatValue + poiSlashPostsTriggerLine.LJIIL;
                    View view2 = poiSlashPostsTriggerLine.LJFF;
                    if (view2 != null) {
                        C786410Ut5.W5(view2, marginLayoutParams);
                        return;
                    }
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public static final void onChanged$35(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            View view = ((PoiSlashPostsTriggerLine) aObserverS220S0100000_16.l0).LJFF;
            if (view != null) {
                view.setBackgroundColor(-7829368);
            }
            View view2 = ((PoiSlashPostsTriggerLine) aObserverS220S0100000_16.l0).LJ;
            if (view2 != null) {
                view2.setBackgroundColor(-7829368);
                return;
            }
            return;
        }
        View view3 = ((PoiSlashPostsTriggerLine) aObserverS220S0100000_16.l0).LJFF;
        if (view3 != null) {
            view3.setBackgroundColor(-65536);
        }
        View view4 = ((PoiSlashPostsTriggerLine) aObserverS220S0100000_16.l0).LJ;
        if (view4 == null) {
            return;
        }
        view4.setBackgroundColor(-65536);
    }

    public static final void onChanged$36(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((AdWebHistoryFragment) aObserverS220S0100000_16.l0).OR((List) obj, true);
    }

    public static final void onChanged$37(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((AdWebHistoryFragment) aObserverS220S0100000_16.l0).OR((List) obj, false);
    }

    public static final void onChanged$38(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        C1053440dWI c1053440dWI;
        List list = (List) obj;
        AdWebHistoryFragment adWebHistoryFragment = (AdWebHistoryFragment) aObserverS220S0100000_16.l0;
        adWebHistoryFragment.getClass();
        if (list.isEmpty()) {
            RecyclerView recyclerView = adWebHistoryFragment.LL;
            if (recyclerView != null && (c1053440dWI = adWebHistoryFragment.LLILLL) != null) {
                c1053440dWI.mmLoadMoreState.LIZ = -1;
                HandlerHook.viewPost(recyclerView, new ARunnableS85S0200000_16(c1053440dWI, recyclerView, 66));
                return;
            }
            return;
        }
        C1053440dWI c1053440dWI2 = adWebHistoryFragment.LLILLL;
        if (c1053440dWI2 != null) {
            c1053440dWI2.resetLoadMoreState();
        }
        C1053440dWI c1053440dWI3 = adWebHistoryFragment.LLILLL;
        if (c1053440dWI3 == null) {
            return;
        }
        c1053440dWI3.setDataAfterLoadMore(list);
    }

    public static final void onChanged$39(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            C1053440dWI c1053440dWI = ((AdWebHistoryFragment) aObserverS220S0100000_16.l0).LLILLL;
            if (c1053440dWI == null || c1053440dWI.getItemCount() == 0) {
                AdWebHistoryFragment adWebHistoryFragment = (AdWebHistoryFragment) aObserverS220S0100000_16.l0;
                adWebHistoryFragment.LJIIL();
                C1749280vcc c1749280vcc = adWebHistoryFragment.LLILZIL;
                if (c1749280vcc != null) {
                    C786410Ut5.LLLZLZ(c1749280vcc, 0);
                }
                C1749280vcc c1749280vcc2 = adWebHistoryFragment.LLILZIL;
                if (c1749280vcc2 != null) {
                    c1749280vcc2.setStatus((C1722300uv6) adWebHistoryFragment.LLJIJIL.getValue());
                }
                adWebHistoryFragment.PR(2, 0L);
            }
        }
    }

    public static final void onChanged$4(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((LiveWatchPreviewWidget) aObserverS220S0100000_16.l0).I1();
    }

    public static final void onChanged$40(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        int i;
        View view = (View) aObserverS220S0100000_16.l0;
        if (obj == EnumC992450bvv.REDDOT) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    public static final void onChanged$41(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        int i;
        View view = (View) aObserverS220S0100000_16.l0;
        if (obj == EnumC992450bvv.REDDOT) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$42(Y.AObserverS220S0100000_16 r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS220S0100000_16.onChanged$42(Y.AObserverS220S0100000_16, java.lang.Object):void");
    }

    public static final void onChanged$43(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        if (!((C1073880e3G) obj).LIZ) {
            ((FriendsFeedEmptyPageCell) aObserverS220S0100000_16.l0).unBind();
            return;
        }
        FriendsFeedEmptyPageCell friendsFeedEmptyPageCell = (FriendsFeedEmptyPageCell) aObserverS220S0100000_16.l0;
        if (friendsFeedEmptyPageCell.LLILZLL) {
            return;
        }
        friendsFeedEmptyPageCell.LLILZLL = true;
        C818480W8w.LIZJ("friends_tab_empty", C0W93.SUCCESS, null, C2097608Jq.LJ());
    }

    public static final void onChanged$44(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        Boolean bool = (Boolean) obj;
        int i = 0;
        if (C319860CgK.LIZ()) {
            C786410Ut5.LLLLZLL((TuxTextView) ((FriendsFeedEmptyPageCell) aObserverS220S0100000_16.l0).itemView.findViewById(R.id.f720im3), 8);
            FriendsFeedEmptyPageCell friendsFeedEmptyPageCell = (FriendsFeedEmptyPageCell) aObserverS220S0100000_16.l0;
            if (friendsFeedEmptyPageCell.LLILZIL) {
                C786410Ut5.LLLLZIL((C21415018rM) friendsFeedEmptyPageCell.itemView.findViewById(R.id.im5), 8);
                return;
            } else {
                C786410Ut5.LLLLZIL((C21415018rM) friendsFeedEmptyPageCell.itemView.findViewById(R.id.im5), 0);
                return;
            }
        }
        FriendsFeedEmptyPageCell friendsFeedEmptyPageCell2 = (FriendsFeedEmptyPageCell) aObserverS220S0100000_16.l0;
        if (friendsFeedEmptyPageCell2.LLILZIL) {
            C786410Ut5.LLLLZIL((C21415018rM) friendsFeedEmptyPageCell2.itemView.findViewById(R.id.im5), 8);
            TuxTextView tuxTextView = (TuxTextView) ((FriendsFeedEmptyPageCell) aObserverS220S0100000_16.l0).itemView.findViewById(R.id.f720im3);
            if (!bool.booleanValue()) {
                i = 4;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
            return;
        }
        C786410Ut5.LLLLZLL((TuxTextView) friendsFeedEmptyPageCell2.itemView.findViewById(R.id.f720im3), 8);
        C21415018rM c21415018rM = (C21415018rM) ((FriendsFeedEmptyPageCell) aObserverS220S0100000_16.l0).itemView.findViewById(R.id.im5);
        if (!bool.booleanValue()) {
            i = 4;
        }
        C786410Ut5.LLLLZIL(c21415018rM, i);
    }

    public static final void onChanged$45(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        List<EnumC1070410dxf> listLIZ;
        Integer numLIZ;
        C1072280e0g c1072280e0g = (C1072280e0g) obj;
        C1073840e3C c1073840e3C = (C1073840e3C) aObserverS220S0100000_16.l0;
        AbstractC1263550izB abstractC1263550izB = c1073840e3C.LLIZLLLIL;
        if (abstractC1263550izB != null && c1072280e0g != null) {
            C291001Au<Unit> c291001Au = c1072280e0g.LIZIZ;
            AbstractC21673719rz itemAnimator = null;
            if (c291001Au != null && c291001Au.LIZ() != null) {
                c1073840e3C.LLILZ.removeCallbacksAndMessages(null);
                C786410Ut5.LJLIIL(500L, c1073840e3C.LLILZ, new ARunnableS85S0200000_16(c1073840e3C, abstractC1263550izB, 75));
            } else {
                C291001Au<List<EnumC1070410dxf>> c291001Au2 = c1072280e0g.LIZ;
                if (c291001Au2 != null && (listLIZ = c291001Au2.LIZ()) != null) {
                    abstractC1263550izB.LJJLIIIJILLIZJL(null, null, listLIZ);
                    ((C1262970iyF) abstractC1263550izB).LLFZ(false);
                }
            }
            ((C1073840e3C) aObserverS220S0100000_16.l0).setPageLoading(c1072280e0g.LIZLLL);
            C1073840e3C c1073840e3C2 = (C1073840e3C) aObserverS220S0100000_16.l0;
            c1073840e3C2.getClass();
            C291001Au<Integer> c291001Au3 = c1072280e0g.LIZJ;
            if (c291001Au3 != null && (numLIZ = c291001Au3.LIZ()) != null) {
                int iIntValue = numLIZ.intValue();
                Fragment fragment = c1073840e3C2.LLILZIL;
                if (fragment == null) {
                    fragment = null;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                c1389890mGx.LJIIIZ(iIntValue);
                c1389890mGx.LJIIJJI();
            }
            C1073840e3C c1073840e3C3 = (C1073840e3C) aObserverS220S0100000_16.l0;
            if (!c1072280e0g.LIZLLL) {
                C1074010e3T emptyPagePowerListFromXml = c1073840e3C3.getEmptyPagePowerListFromXml();
                AbstractC1263550izB abstractC1263550izB2 = c1073840e3C3.LLIZLLLIL;
                if (abstractC1263550izB2 != null) {
                    itemAnimator = ((C1262970iyF) abstractC1263550izB2).getItemAnimator();
                }
                emptyPagePowerListFromXml.setItemAnimator(itemAnimator);
                return;
            }
            c1073840e3C3.getClass();
        }
    }

    public static final void onChanged$46(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        ((C1050860dS8) aObserverS220S0100000_16.l0).LIZ(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$5(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        int height;
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) ((InteractionAnimationWidget) aObserverS220S0100000_16.l0).LLJJI.getValue();
        if (livePreviewGuideEnterVM != null) {
            ViewGroup viewGroupO1 = ((InteractionAnimationWidget) aObserverS220S0100000_16.l0).O1();
            if ((viewGroupO1 instanceof View) && viewGroupO1 != null) {
                height = viewGroupO1.getHeight();
            } else {
                height = 0;
            }
            livePreviewGuideEnterVM.LLIZLLLIL = height;
        }
    }

    public static final void onChanged$6(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        int i = 0;
        if (num.intValue() > 0) {
            InteractionAnimationWidget interactionAnimationWidget = (InteractionAnimationWidget) aObserverS220S0100000_16.l0;
            if (interactionAnimationWidget.LLJJIJIIJIL) {
                interactionAnimationWidget.LLJJIJIIJIL = false;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("changeWhenTtlsCardShowV1 ");
                sbLIZ.append(interactionAnimationWidget.hashCode());
                C20441214yg.LJIIIZ("InteractionAnimationWidget", C2188811AlT.LIZIZ(sbLIZ));
                interactionAnimationWidget.O1().animate().cancel();
                C786410Ut5.bd(0.0f, interactionAnimationWidget.O1());
                C786410Ut5.LJJZZIII(interactionAnimationWidget.LLJJIJI, new ARunnableS116S0100000_16(interactionAnimationWidget, 121));
                return;
            }
            return;
        }
        InteractionAnimationWidget interactionAnimationWidget2 = (InteractionAnimationWidget) aObserverS220S0100000_16.l0;
        if (num.intValue() < 0) {
            z = true;
        } else {
            z = false;
        }
        interactionAnimationWidget2.LLJJIJI.removeCallbacksAndMessages(null);
        if (interactionAnimationWidget2.LLJJIJIIJIL && !z) {
            return;
        }
        interactionAnimationWidget2.LLJJIJIIJIL = true;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("changeWhenTtlsCardHide ");
        sbLIZ2.append(interactionAnimationWidget2.hashCode());
        C20441214yg.LJIIIZ("InteractionAnimationWidget", C2188811AlT.LIZIZ(sbLIZ2));
        if (z) {
            interactionAnimationWidget2.O1().animate().cancel();
            C786410Ut5.bd(0.0f, interactionAnimationWidget2.O1());
            C0C3D.LIZ.getClass();
            if (C0C3D.LIZ()) {
                View viewN1 = interactionAnimationWidget2.N1();
                if ((viewN1 instanceof View) && viewN1 != null) {
                    C786410Ut5.ed(viewN1, 0.0f);
                }
            }
            int childCount = interactionAnimationWidget2.O1().getChildCount();
            while (i < childCount) {
                View childAt = interactionAnimationWidget2.O1().getChildAt(i);
                childAt.animate().cancel();
                C786410Ut5.T4(childAt, 1.0f);
                i++;
            }
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = interactionAnimationWidget2.O1().animate();
        viewPropertyAnimatorAnimate.cancel();
        viewPropertyAnimatorAnimate.translationY(0.0f).setDuration(360L).setStartDelay(250L).start();
        C0C3D.LIZ.getClass();
        if (C0C3D.LIZ()) {
            View viewN12 = interactionAnimationWidget2.N1();
            if ((viewN12 instanceof View) && viewN12 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = viewN12.animate();
                viewPropertyAnimatorAnimate2.cancel();
                viewPropertyAnimatorAnimate2.translationY(0.0f).setDuration(360L).setStartDelay(250L).start();
            }
        }
        int childCount2 = interactionAnimationWidget2.O1().getChildCount();
        while (i < childCount2) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate3 = interactionAnimationWidget2.O1().getChildAt(i).animate();
            viewPropertyAnimatorAnimate3.cancel();
            viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(200L).setStartDelay(450L).start();
            i++;
        }
    }

    public static final void onChanged$7(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        LiveRoomStruct liveRoomStruct;
        FypRecommendInfo ecommerceFypRecommendInfo;
        View view;
        boolean z;
        Integer num = (Integer) obj;
        C1ACA c1acaZ1 = ((BcToggleInfoWidget) aObserverS220S0100000_16.l0).z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (ecommerceFypRecommendInfo = liveRoomStruct.getEcommerceFypRecommendInfo()) != null && 2 == ecommerceFypRecommendInfo.getDisplayStyle() && (view = ((BcToggleInfoWidget) aObserverS220S0100000_16.l0).getView()) != null) {
            BcToggleInfoWidget bcToggleInfoWidget = (BcToggleInfoWidget) aObserverS220S0100000_16.l0;
            if (num.intValue() > 0) {
                ViewPropertyAnimator viewPropertyAnimator = bcToggleInfoWidget.LLJILLL;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                bcToggleInfoWidget.LLJILLL = null;
                if (view.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C786410Ut5.T4(view, 0.0f);
                    return;
                } else {
                    if (view.getAlpha() == 0.0f) {
                        return;
                    }
                    ViewPropertyAnimator duration = view.animate().alpha(0.0f).setDuration(200L);
                    duration.start();
                    bcToggleInfoWidget.LLJILLL = duration;
                    return;
                }
            }
            ViewPropertyAnimator viewPropertyAnimator2 = bcToggleInfoWidget.LLJILLL;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            bcToggleInfoWidget.LLJILLL = null;
            if (-1 != num.intValue() && view.getVisibility() == 0) {
                if (view.getAlpha() == 1.0f) {
                    return;
                }
                ViewPropertyAnimator duration2 = view.animate().alpha(1.0f).setDuration(200L);
                duration2.start();
                bcToggleInfoWidget.LLJILLL = duration2;
                return;
            }
            C786410Ut5.T4(view, 1.0f);
        }
    }

    public static final void onChanged$8(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        EnumC1036160d4Q enumC1036160d4Q;
        int iIntValue = ((Number) obj).intValue();
        EnumC1036160d4Q enumC1036160d4Q2 = null;
        TuxNavBar tuxNavBar = null;
        if (iIntValue == 1) {
            C1036540d52 c1036540d52 = (C1036540d52) aObserverS220S0100000_16.l0;
            C1036360d4k c1036360d4k = c1036540d52.LIZLLL;
            if (c1036360d4k != null) {
                enumC1036160d4Q = c1036360d4k.LJFF;
            } else {
                enumC1036160d4Q = null;
            }
            if (enumC1036160d4Q == EnumC1036160d4Q.FROM_SCROLL_VIEW_PAGER) {
                if (c1036540d52.LJI == EnumC1036120d4M.FULLSCREEN_IMMERSION) {
                    C1250250idj c1250250idj = c1036540d52.LJ;
                    if (c1250250idj != null) {
                        c1250250idj.LIZJ = "";
                    }
                    TuxNavBar tuxNavBar2 = c1036540d52.LJIIIIZZ;
                    if (tuxNavBar2 != null) {
                        tuxNavBar = tuxNavBar2;
                    }
                    tuxNavBar.setNavBackground(0);
                }
                ((C1036540d52) aObserverS220S0100000_16.l0).LJII();
                IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) ((C1036540d52) aObserverS220S0100000_16.l0).LJII.getValue();
                if (iAdLandingPagePopUpService != null) {
                    iAdLandingPagePopUpService.LIZ(true);
                    return;
                }
                return;
            }
            return;
        }
        if (iIntValue != 0) {
            return;
        }
        C1036540d52 c1036540d522 = (C1036540d52) aObserverS220S0100000_16.l0;
        C1036360d4k c1036360d4k2 = c1036540d522.LIZLLL;
        if (c1036360d4k2 != null) {
            enumC1036160d4Q2 = c1036360d4k2.LJFF;
        }
        if (enumC1036160d4Q2 != EnumC1036160d4Q.FROM_SCROLL_VIEW_PAGER) {
            return;
        }
        InterfaceC1036350d4j interfaceC1036350d4j = c1036540d522.LIZJ;
        if (interfaceC1036350d4j != null) {
            interfaceC1036350d4j.LIZLLL(0, Boolean.TRUE, Boolean.FALSE);
        }
        IAdLandingPagePopUpService iAdLandingPagePopUpService2 = (IAdLandingPagePopUpService) ((C1036540d52) aObserverS220S0100000_16.l0).LJII.getValue();
        if (iAdLandingPagePopUpService2 == null) {
            return;
        }
        iAdLandingPagePopUpService2.LIZ(false);
    }

    public static final void onChanged$9(AObserverS220S0100000_16 aObserverS220S0100000_16, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        FindFriendsPageVM findFriendsPageVM = (FindFriendsPageVM) aObserverS220S0100000_16.l0;
        findFriendsPageVM.getClass();
        findFriendsPageVM.withState(new AwS7S1001000_16(followStatus.getUserId(), followStatus.getFollowStatus(), 0));
    }
}
