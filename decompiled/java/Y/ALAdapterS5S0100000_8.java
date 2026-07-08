package Y;

import X.C094D;
import X.C0BDV;
import X.C0E12;
import X.C0L98;
import X.C0LJV;
import X.C0MRF;
import X.C0MS5;
import X.C0MW9;
import X.C0MWB;
import X.C1295960jpS;
import X.C1447800nmM;
import X.C19A3;
import X.C285960BIs;
import X.C363750ENx;
import X.C523910Kgf;
import X.C527360KmE;
import X.C528030KnJ;
import X.C538480L9y;
import X.C538490L9z;
import X.C569680MVy;
import X.C786410Ut5;
import X.EnumC538450L9v;
import X.InterfaceC538470L9x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class ALAdapterS5S0100000_8 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case 3:
                onAnimationCancel$3(this, animator);
                break;
            case 4:
                onAnimationCancel$4(this, animator);
                break;
            case 5:
                onAnimationCancel$5(this, animator);
                break;
            case 6:
            case 7:
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                super.onAnimationCancel(animator);
                break;
            case 8:
                onAnimationCancel$6(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationCancel$7(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Throwable {
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
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$13(this, animator);
                break;
            case 14:
                onAnimationEnd$14(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (5 - this.$t != 0) {
            super.onAnimationStart(animator, z);
        } else {
            onAnimationStart$0(this, animator, z);
        }
    }

    public ALAdapterS5S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        C527360KmE c527360KmE = (C527360KmE) aLAdapterS5S0100000_8.l0;
        c527360KmE.LLIZ = C0L98.NONE;
        View view = c527360KmE.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        ((C527360KmE) aLAdapterS5S0100000_8.l0).LLIZ = C0L98.NONE;
    }

    public static final void onAnimationCancel$2(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        ((C1295960jpS) aLAdapterS5S0100000_8.l0).removeAllAnimatorListeners();
    }

    public static final void onAnimationCancel$3(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        super.onAnimationCancel(animator);
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS5S0100000_8.l0);
    }

    public static final void onAnimationCancel$4(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        C538480L9y c538480L9y = (C538480L9y) aLAdapterS5S0100000_8.l0;
        c538480L9y.LLIZ = EnumC538450L9v.NONE;
        View view = c538480L9y.LLILLL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
        InterfaceC538470L9x interfaceC538470L9x = ((C538480L9y) aLAdapterS5S0100000_8.l0).LLILZLL;
        if (interfaceC538470L9x != null) {
            interfaceC538470L9x.LIZLLL();
        }
    }

    public static final void onAnimationCancel$5(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        ((C538480L9y) aLAdapterS5S0100000_8.l0).LLIZ = EnumC538450L9v.NONE;
    }

    public static final void onAnimationCancel$6(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        super.onAnimationCancel(animator);
        ((C0LJV) aLAdapterS5S0100000_8.l0).LJ();
        C786410Ut5.R4(1.0f, ((C0LJV) aLAdapterS5S0100000_8.l0).LLILZIL);
        C786410Ut5.T4(((C0LJV) aLAdapterS5S0100000_8.l0).LLJ, 0.0f);
    }

    public static final void onAnimationCancel$7(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        super.onAnimationCancel(animator);
        View view = ((C528030KnJ) aLAdapterS5S0100000_8.l0).LLJJJJJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        C527360KmE c527360KmE = (C527360KmE) aLAdapterS5S0100000_8.l0;
        c527360KmE.LLIZ = C0L98.NONE;
        View view = c527360KmE.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        C527360KmE c527360KmE = (C527360KmE) aLAdapterS5S0100000_8.l0;
        c527360KmE.setContentAlpha(c527360KmE.LLJI);
        C0E12 c0e12 = C363750ENx.LIZ;
        if (!c0e12.LIZ("ep_guide_show_in_album_page", false)) {
            c0e12.LIZIZ("ep_guide_show_in_album_page", true);
        } else if (!((Boolean) C0BDV.LIZ.getValue()).booleanValue()) {
            ((C527360KmE) aLAdapterS5S0100000_8.l0).getClass();
            ((C527360KmE) aLAdapterS5S0100000_8.l0).LLIZ = C0L98.NONE;
            return;
        }
        C527360KmE c527360KmE2 = (C527360KmE) aLAdapterS5S0100000_8.l0;
        C786410Ut5.LJLIIL(450L, c527360KmE2.LLILZLL, new ARunnableS108S0100000_8(c527360KmE2, 16));
        ((C527360KmE) aLAdapterS5S0100000_8.l0).LIZJ();
    }

    public static final void onAnimationEnd$10(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        super.onAnimationEnd(animator);
        View view = ((C528030KnJ) aLAdapterS5S0100000_8.l0).LLJJJJJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        super.onAnimationEnd(animator);
        C0MS5 c0ms5 = (C0MS5) aLAdapterS5S0100000_8.l0;
        c0ms5.LLIZ = false;
        c0ms5.getClass();
    }

    public static final void onAnimationEnd$12(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) throws Throwable {
        super.onAnimationEnd(animator);
        C0MRF c0mrf = (C0MRF) aLAdapterS5S0100000_8.l0;
        int i = c0mrf.LLLF + 1;
        c0mrf.LLLF = i;
        c0mrf.LLLF = i % c0mrf.LLLFZ;
        SmartImageView smartImageView = c0mrf.LLLFF;
        c0mrf.LLLFF = c0mrf.LLLFFI;
        c0mrf.LLLFFI = smartImageView;
        c0mrf.LLLIIII.run();
        ((C0MRF) aLAdapterS5S0100000_8.l0).LLLLLL();
    }

    public static final void onAnimationEnd$13(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        ((C094D) aLAdapterS5S0100000_8.l0).LJIIJJI(null);
    }

    public static final void onAnimationEnd$14(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        Keva.getRepo("keva_repo_auto_cut_operational_activity").storeBoolean("has_shown_create_tab_eoy", true);
        if (C285960BIs.LIZ()) {
            ((C569680MVy) aLAdapterS5S0100000_8.l0).LLLIIIIL();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        ((C1295960jpS) aLAdapterS5S0100000_8.l0).removeAllAnimatorListeners();
    }

    public static final void onAnimationEnd$3(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS5S0100000_8.l0);
    }

    public static final void onAnimationEnd$4(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        C538480L9y c538480L9y = (C538480L9y) aLAdapterS5S0100000_8.l0;
        c538480L9y.LLIZ = EnumC538450L9v.NONE;
        View view = c538480L9y.LLILLL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
        InterfaceC538470L9x interfaceC538470L9x = ((C538480L9y) aLAdapterS5S0100000_8.l0).LLILZLL;
        if (interfaceC538470L9x != null) {
            interfaceC538470L9x.LIZJ();
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        C538480L9y c538480L9y = (C538480L9y) aLAdapterS5S0100000_8.l0;
        c538480L9y.setContentAlpha(c538480L9y.LLILLJJLI);
        C538480L9y c538480L9y2 = (C538480L9y) aLAdapterS5S0100000_8.l0;
        c538480L9y2.LLJILJIL = c538480L9y2.getLottieAnimationType();
        if (Intrinsics.LJFF(((C538480L9y) aLAdapterS5S0100000_8.l0).getLottieAnimationType(), C0MWB.LIZ)) {
            C538480L9y c538480L9y3 = (C538480L9y) aLAdapterS5S0100000_8.l0;
            c538480L9y3.getClass();
            C538490L9z.LIZJ(System.currentTimeMillis());
            boolean z = c538480L9y3.LL.LIZ.getBoolean("autocut_guide_should_show", true);
            if (z) {
                c538480L9y3.LL.LIZ.storeBoolean("autocut_guide_should_show", false);
            }
            c538480L9y3.LJFF(z);
            return;
        }
        if (Intrinsics.LJFF(((C538480L9y) aLAdapterS5S0100000_8.l0).getLottieAnimationType(), C0MW9.LIZ)) {
            InterfaceC538470L9x interfaceC538470L9x = ((C538480L9y) aLAdapterS5S0100000_8.l0).LLILZLL;
            if (interfaceC538470L9x != null) {
                interfaceC538470L9x.LIZ(false);
            }
            ((C538480L9y) aLAdapterS5S0100000_8.l0).LLIZ = EnumC538450L9v.NONE;
            return;
        }
        if (((C538480L9y) aLAdapterS5S0100000_8.l0).LL.LIZ.getBoolean("autocut_guide_should_show", true)) {
            ((C538480L9y) aLAdapterS5S0100000_8.l0).LL.LIZ.storeBoolean("autocut_guide_should_show", false);
            ((C538480L9y) aLAdapterS5S0100000_8.l0).LJFF(true);
            return;
        }
        InterfaceC538470L9x interfaceC538470L9x2 = ((C538480L9y) aLAdapterS5S0100000_8.l0).LLILZLL;
        if (interfaceC538470L9x2 != null) {
            interfaceC538470L9x2.LIZ(false);
        }
        ((C538480L9y) aLAdapterS5S0100000_8.l0).LLIZ = EnumC538450L9v.NONE;
    }

    public static final void onAnimationEnd$6(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        super.onAnimationEnd(animator);
        C0LJV c0ljv = (C0LJV) aLAdapterS5S0100000_8.l0;
        c0ljv.LLIZLLLIL.setBackground(c0ljv.LIZJ());
    }

    public static final void onAnimationEnd$7(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        super.onAnimationEnd(animator);
        C0LJV c0ljv = (C0LJV) aLAdapterS5S0100000_8.l0;
        c0ljv.LLIZLLLIL.setBackground(c0ljv.LIZJ());
        C0LJV c0ljv2 = (C0LJV) aLAdapterS5S0100000_8.l0;
        HandlerHook.viewPostDelay(c0ljv2, c0ljv2.LLJILLL, 3000L);
    }

    public static final void onAnimationEnd$8(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        super.onAnimationEnd(animator);
        ((C0LJV) aLAdapterS5S0100000_8.l0).LJ();
        C786410Ut5.R4(1.0f, ((C0LJV) aLAdapterS5S0100000_8.l0).LLILZIL);
        C786410Ut5.T4(((C0LJV) aLAdapterS5S0100000_8.l0).LLJ, 0.0f);
    }

    public static final void onAnimationEnd$9(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator) {
        C19A3 c19a3;
        C19A3 c19a32;
        ChooseMediaViewModel chooseMediaViewModel = ((MvChoosePhotoScene) aLAdapterS5S0100000_8.l0).chooseMediaViewModel;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.yR2(new AwS587S0100000_8((ClosingChooseMediaPageState) ClosingChooseMediaPageState.Closed.INSTANCE, 166));
        }
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ((MvChoosePhotoScene) aLAdapterS5S0100000_8.l0);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLJJJ = true;
            navigationSceneLIZ.LLJJIJIL = null;
        }
        NavigationScene navigationSceneLIZ2 = C1447800nmM.LIZ((MvChoosePhotoScene) aLAdapterS5S0100000_8.l0);
        if (navigationSceneLIZ2 != null && C523910Kgf.LIZ((MvChoosePhotoScene) aLAdapterS5S0100000_8.l0, navigationSceneLIZ2)) {
            NavigationScene navigationSceneLIZ3 = C1447800nmM.LIZ((MvChoosePhotoScene) aLAdapterS5S0100000_8.l0);
            if (navigationSceneLIZ3 != null) {
                navigationSceneLIZ3.remove((MvChoosePhotoScene) aLAdapterS5S0100000_8.l0);
                return;
            }
            return;
        }
        Scene scene = ((MvChoosePhotoScene) aLAdapterS5S0100000_8.l0).mParentScene;
        if (!(scene instanceof C19A3) || (c19a3 = (C19A3) scene) == null || c19a3.findSceneByTag("album_scene") == null) {
            return;
        }
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aLAdapterS5S0100000_8.l0;
        Scene scene2 = mvChoosePhotoScene.mParentScene;
        if (!(scene2 instanceof C19A3) || (c19a32 = (C19A3) scene2) == null) {
            return;
        }
        c19a32.remove(mvChoosePhotoScene);
    }

    public static final void onAnimationStart$0(ALAdapterS5S0100000_8 aLAdapterS5S0100000_8, Animator animator, boolean z) {
        InterfaceC538470L9x interfaceC538470L9x = ((C538480L9y) aLAdapterS5S0100000_8.l0).LLILZLL;
        if (interfaceC538470L9x != null) {
            interfaceC538470L9x.LIZIZ();
        }
    }
}
