package X;

import Y.ARunnableS116S0100000_16;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.SlidePage;
import com.ss.android.ugc.aweme.experiment.SlidePageItem;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0dYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055030dYr {
    public final InterfaceC1055050dYt LIZ;
    public boolean LIZJ;
    public AbstractC1583720rJa LIZLLL;
    public boolean LJ;
    public Fragment LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public Bundle LJIIIZ;
    public boolean LJIIJ;
    public String LIZIZ = "";
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(455));

    public C1055030dYr(InterfaceC1055050dYt interfaceC1055050dYt) {
        this.LIZ = interfaceC1055050dYt;
    }

    public final boolean LIZIZ(C19EG c19eg) {
        if (c19eg == null || this.LIZLLL == null) {
            return false;
        }
        if (this.LIZJ) {
            return true;
        }
        if ((!TextUtils.equals(this.LIZIZ, "scroll_to_slide") && !TextUtils.equals(this.LIZIZ, "click_top_icon")) || !(C343710Ddh.LIZ(c19eg).DQ2() instanceof InterfaceC1593630rZZ) || this.LIZ.Oh() || !this.LJIIIIZZ) {
            return false;
        }
        return true;
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        Fragment fragment;
        FragmentManager childFragmentManager;
        C19EH c19ehLJIIJ;
        Fragment fragment2;
        Fragment fragment3;
        FragmentManager childFragmentManager2;
        FragmentManager childFragmentManager3;
        Fragment fragmentLJJJJZI;
        String strTag;
        Fragment fragment4;
        Fragment fragmentNewInstance;
        Fragment fragment5;
        Fragment fragment6;
        Fragment fragmentNewInstance2;
        Class<? extends Fragment> clsLJII;
        if (!this.LJ) {
            this.LJ = true;
            HomePageCommonService homePageCommonService = (HomePageCommonService) this.LJIIJJI.getValue();
            if (homePageCommonService != null) {
                this.LIZLLL = homePageCommonService.LJI();
            }
        }
        boolean z3 = false;
        if (this.LIZLLL != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.LJIIIIZZ = true;
            if (!TextUtils.equals(this.LIZIZ, "click_top_icon")) {
                this.LIZIZ = "scroll_to_slide";
            }
            if (this.LJFF == null) {
                AbstractC1583720rJa abstractC1583720rJa = this.LIZLLL;
                if (abstractC1583720rJa != null) {
                    if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                        String strTag2 = abstractC1583720rJa.tag();
                        if (Intrinsics.LJFF(strTag2, "NOTIFICATION") || Intrinsics.LJFF(strTag2, "USER")) {
                            try {
                                HomePageCommonService homePageCommonService2 = (HomePageCommonService) this.LJIIJJI.getValue();
                                if (homePageCommonService2 != null && (clsLJII = homePageCommonService2.LJII()) != null) {
                                    fragmentNewInstance2 = clsLJII.newInstance();
                                } else {
                                    fragmentNewInstance2 = null;
                                }
                            } catch (Exception e) {
                                e = e;
                                fragmentNewInstance2 = null;
                            }
                            try {
                                Bundle bundle = new Bundle();
                                if (Intrinsics.LJFF(strTag2, "NOTIFICATION")) {
                                    C786410Ut5.LJJJI("tab", "UNLOGIN_NOTIFICATION", bundle);
                                } else if (Intrinsics.LJFF(strTag2, "USER")) {
                                    C786410Ut5.LJJJI("tab", "UNLOGIN_PROFILE", bundle);
                                }
                                Fragment fragment7 = fragmentNewInstance2;
                                if (fragment7 != null) {
                                    fragment7.setArguments(bundle);
                                }
                            } catch (Exception e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                            }
                            fragment5 = fragmentNewInstance2;
                            this.LJFF = fragment5;
                            z3 = true;
                        }
                    }
                    Class<? extends Fragment> clsLJIJ = abstractC1583720rJa.LJIJ();
                    if (clsLJIJ != null) {
                        try {
                            fragmentNewInstance = clsLJIJ.newInstance();
                            try {
                                if (abstractC1583720rJa.LJIIZILJ() != null && (fragment6 = fragmentNewInstance) != null) {
                                    fragment6.setArguments(abstractC1583720rJa.LJIIZILJ());
                                }
                            } catch (Exception e3) {
                                e = e3;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            fragmentNewInstance = null;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } else {
                        fragmentNewInstance = null;
                    }
                    if (TextUtils.equals(abstractC1583720rJa.tag(), "USER")) {
                        fragmentNewInstance = C2277881EDy.LIZIZ.getI18nMyProfileFragment();
                        ((I18nMyProfileFragment) fragmentNewInstance).LLLLJ = new InterfaceC1253300iie() { // from class: X.0dYs
                            @Override // X.InterfaceC1253300iie
                            public final void LJIJ() {
                                Fragment fragment8;
                                C19EG activity;
                                C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                                String value = EnumC1589910rTZ.GOBACK_ICON.getValue();
                                c1584320rKY.getClass();
                                C1584320rKY.LJ = value;
                                C1590810rV1.LJ("profile_2_feed", "click_back");
                                Object obj = this.LIZ.LIZ;
                                if (!(obj instanceof Fragment) || (fragment8 = (Fragment) obj) == null || (activity = fragment8.getActivity()) == null) {
                                    return;
                                }
                                C486860J7k.LIZIZ(activity).kE0("page_feed", true);
                            }
                        };
                        Bundle bundle2 = new Bundle();
                        C786410Ut5.LJJJI("enter_from", this.LIZIZ, bundle2);
                        ((I18nMyProfileFragment) fragmentNewInstance).setArguments(bundle2);
                    }
                } else {
                    fragmentNewInstance = null;
                }
                fragment5 = fragmentNewInstance;
                this.LJFF = fragment5;
                z3 = true;
            }
            Object obj = this.LIZ;
            if ((obj instanceof Fragment) && (fragment4 = (Fragment) obj) != null && fragment4.getActivity() != null) {
                Fragment fragment8 = this.LJFF;
                C1058550deX.LIZ = true;
                C1058550deX.LIZIZ = fragment8;
            }
            AbstractC1583720rJa abstractC1583720rJa2 = this.LIZLLL;
            if (abstractC1583720rJa2 != null && (strTag = abstractC1583720rJa2.tag()) != null) {
                C1058550deX.LIZJ = strTag;
            }
            if (!this.LJII) {
                this.LJII = true;
                Fragment fragment9 = this.LJFF;
                if (fragment9 != null) {
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LJI("CustomSlideManager", "showSlideFragment");
                    if (!this.LIZ.Up()) {
                        Object obj2 = this.LIZ;
                        if ((obj2 instanceof Fragment) && (fragment = (Fragment) obj2) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
                            this.LIZ.HC();
                            Object obj3 = this.LIZ;
                            if (obj3 instanceof Fragment) {
                                fragment2 = (Fragment) obj3;
                            } else {
                                fragment2 = null;
                            }
                            if (fragment2 != null && (childFragmentManager3 = fragment2.getChildFragmentManager()) != null && (fragmentLJJJJZI = childFragmentManager3.LJJJJZI("page_slide_custom_fragment")) != null) {
                                c19ehLJIIJ.LJJIFFI(fragmentLJJJJZI);
                            } else if (!this.LJI) {
                                c19ehLJIIJ.LIZJ(R.id.eqx, fragment9, "page_slide_custom_fragment");
                                this.LJI = true;
                            }
                            this.LJFF = fragment9;
                            this.LIZ.M1();
                            this.LIZ.n3("page_slide_custom_fragment");
                            c19ehLJIIJ.LJIIJ();
                            Object obj4 = this.LIZ;
                            if ((obj4 instanceof Fragment) && (fragment3 = (Fragment) obj4) != null && (childFragmentManager2 = fragment3.getChildFragmentManager()) != null) {
                                childFragmentManager2.LJJJJL();
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("showFragment(), tag is ");
                            sbLIZ.append("page_slide_custom_fragment");
                            C1054960dYk.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    if (z3 || z) {
                        Bundle bundle3 = this.LJIIIZ;
                        if (bundle3 != null) {
                            LIZJ(bundle3, true);
                        }
                        this.LJIIIZ = null;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("CustomSlideManager", "slide node is null");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUserLoginSuccessfully(C486550J6f c486550J6f) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        C19EH c19ehLJIIJ;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("CustomSlideManager", "onUserLoginSuccessfully, clearLoginFragment");
        C1720106oR.LJI("CustomSlideManager", "removeCustomSlidePage");
        Fragment fragment2 = this.LJFF;
        if (fragment2 != null) {
            Object obj = this.LIZ;
            if ((obj instanceof Fragment) && (fragment = (Fragment) obj) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (c19ehLJIIJ = childFragmentManager.LJIIJ()) != null) {
                this.LJII = false;
                c19ehLJIIJ.LJIIZILJ(fragment2);
                c19ehLJIIJ.LJIIJ();
            }
        }
        this.LJI = false;
        this.LJII = false;
        this.LJFF = null;
        this.LIZLLL = null;
        this.LJ = false;
        this.LJIIIIZZ = false;
    }

    public final void LIZJ(Bundle bundle, boolean z) {
        Fragment fragment;
        C19EG activity;
        String strTag;
        String strTag2;
        if (!this.LJII) {
            return;
        }
        if (z && this.LJFF == null) {
            this.LJIIIZ = bundle;
            return;
        }
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && z) {
            C2487409ou.LIZJ(new ARunnableS116S0100000_16(this, 191));
            return;
        }
        Object obj = this.LIZ;
        if ((obj instanceof Fragment) && (fragment = (Fragment) obj) != null && (activity = fragment.getActivity()) != null && (this.LJFF instanceof InterfaceC1055110dYz)) {
            if (z) {
                AbstractC1583720rJa abstractC1583720rJa = this.LIZLLL;
                if (abstractC1583720rJa != null && (strTag2 = abstractC1583720rJa.tag()) != null) {
                    C1058550deX.LIZJ = strTag2;
                    Hox.LLJILJIL.LIZ(activity).QQ2(strTag2);
                }
                this.LIZ.I4(Fragment.class, new AwS417S0200000_16(this, bundle, 87));
                return;
            }
            AbstractC1583720rJa abstractC1583720rJa2 = this.LIZLLL;
            if (abstractC1583720rJa2 != null) {
                strTag = abstractC1583720rJa2.tag();
            } else {
                strTag = null;
            }
            C1058550deX.LIZLLL = strTag;
            C1058550deX.LIZJ = null;
            Fragment fragment2 = this.LJFF;
            C1058550deX.LIZ = false;
            C1058550deX.LIZIZ = fragment2;
            C486860J7k.LIZIZ(activity).LLJJLIIIJLLLLLLLZ.setValue(new C443120HZe<>(Boolean.TRUE, this.LJFF, Boolean.FALSE));
            Hox.LLJILJIL.LIZ(activity).QQ2("profile_fake_child");
        }
    }

    public final void LIZ(ScrollSwitchStateManager scrollSwitchStateManager, int i, C19EG c19eg) {
        SlidePage slidePageLJIIIZ;
        SlidePageItem slidePageItem;
        if (c19eg == null) {
            return;
        }
        C0CXE.LIZ.getClass();
        if (C0CXE.LIZ() && i == 1 && scrollSwitchStateManager.FQ2("page_feed") && (C343710Ddh.LIZ(c19eg).DQ2() instanceof InterfaceC1593630rZZ)) {
            if (!this.LIZ.Oh() && (slidePageLJIIIZ = C1585030rLh.LJIIIZ()) != null && (slidePageItem = slidePageLJIIIZ.right) != null && slidePageItem.scope == 2) {
                LIZLLL(false);
                return;
            }
            if (this.LJII) {
                this.LIZ.N7();
            }
            this.LIZIZ = "";
            this.LJIIIIZZ = false;
            this.LJII = false;
        }
    }
}
