package X;

import Y.ACallableS424S0100000_19;
import Y.AObserverS223S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IPasskeyPopUpHelper;
import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper;
import com.ss.android.ugc.aweme.appdiff.IProfileAppDiffProtocol;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.ui.ability.IProfileBottomTabService;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ilj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255210ilj implements InterfaceC20660615sy {
    public final Context LL;
    public final C19EG LLILLJJLI;
    public String LLILZ;
    public Fragment LLILZLL;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public final IPopSuiteManagerService LLJ;
    public final C01GW LLJI;
    public boolean LLJIJIL;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(717));
    public boolean LLILZIL = true;

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return "profile";
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        LifecycleOwner lifecycleOwnerRequireMainSAFLifecycle;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        C19EG c19eg = this.LLILLJJLI;
        if (c19eg == null || (lifecycleOwnerRequireMainSAFLifecycle = IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, null, false)) == null || (lifecycle = lifecycleOwnerRequireMainSAFLifecycle.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null) {
            return false;
        }
        return currentState.isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        C19EG c19eg = this.LLILLJJLI;
        if (c19eg != null) {
            return new C688120Qyw(c19eg, IMainSAFLifecycleKt.getEnablePopUpLifecycleRefactor() ? IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, null, false) : c19eg, null);
        }
        return null;
    }

    public final void LIZLLL() throws Throwable {
        Intent intent;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        boolean zLJI = MethodIDManager.LJI(71706);
        if (((IProfileBottomTabService) this.LLJI.getValue()).LIZ()) {
            C0HYP.LIZ.getClass();
            C0HYP.LJ().storeBoolean("profile_icon_flip_clicked", true);
        }
        if (C1ELC.LIZLLL()) {
            boolean z = C0CJG.LIZ;
            C0CJG.LIZJ(this.LL, false);
            C0CJG.LIZ(this.LL);
        }
        this.LLIZ = true;
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(this.LLILLJJLI);
        C1020810cff.LIZ.getClass();
        C1020810cff.LJI.submit(RunnableC1022180chs.LL);
        LJ();
        LIZIZ(tabChangeManagerLIZ.CQ2(), this.LLIZ);
        if (C1585030rLh.LJIILL()) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", "click_top_icon", bundle);
            bundle.putBoolean("isSmoothScroll", true);
            C19EG c19eg = this.LLILLJJLI;
            if (c19eg != null) {
                Hox.LLJILJIL.LIZ(c19eg).TQ2(bundle, "USER", false);
            }
        } else {
            String stringExtra = null;
            Bundle bundle2 = null;
            stringExtra = null;
            stringExtra = null;
            if (C300140Bpc.LIZ() || C1171990gbV.LIZJ()) {
                Bundle bundle3 = new Bundle();
                C786410Ut5.LJJJI("enter_method", "click_bottom_icon", bundle3);
                C786410Ut5.LJJJI("extra_previous_page", this.LLIZLLLIL, bundle3);
                C786410Ut5.LJJJI("from", "from_main", bundle3);
                C19EG c19eg2 = this.LLILLJJLI;
                if (c19eg2 != null && (intent6 = c19eg2.getIntent()) != null) {
                    try {
                        stringExtra = intent6.getStringExtra("profile_from_scene");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                C786410Ut5.LJJJI("profile_from_scene", stringExtra, bundle3);
                C19EG c19eg3 = this.LLILLJJLI;
                if (c19eg3 != null && (intent5 = c19eg3.getIntent()) != null && intent5.getBooleanExtra("show_collect", false)) {
                    bundle3.putBoolean("show_collect", true);
                }
                C19EG c19eg4 = this.LLILLJJLI;
                if (c19eg4 != null && (intent4 = c19eg4.getIntent()) != null) {
                    Integer numValueOf = Integer.valueOf(intent4.getIntExtra("profile_landing_tab", -1));
                    if (numValueOf.intValue() >= 0) {
                        bundle3.putInt("profile_landing_tab", numValueOf.intValue());
                    }
                }
                C19EG c19eg5 = this.LLILLJJLI;
                if (c19eg5 != null && (intent = c19eg5.getIntent()) != null) {
                    try {
                        String stringExtra2 = intent.getStringExtra("favorite_auto_landing_method_for_bottom_tab");
                        if (stringExtra2 != null) {
                            C19EG c19eg6 = this.LLILLJJLI;
                            if (c19eg6 != null && (intent3 = c19eg6.getIntent()) != null) {
                                intent3.removeExtra("favorite_auto_landing_method_for_bottom_tab");
                            }
                            C19EG c19eg7 = this.LLILLJJLI;
                            if (c19eg7 != null && (intent2 = c19eg7.getIntent()) != null) {
                                intent2.putExtra("favorite_auto_landing_method", stringExtra2);
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                bundle2 = bundle3;
            }
            TabChangeManager.xQ2(tabChangeManagerLIZ, "USER", true, bundle2, 18);
        }
        LIZ(tabChangeManagerLIZ.BQ2());
        if (!C1585030rLh.LJIILLIIL()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            C1440005kM.LIZIZ(new C1255230ill());
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r0 = com.ss.android.ugc.aweme.services.IExternalService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.external.IEnterFromService r5 = r0.enterFromService()
            boolean r0 = X.C1585030rLh.LJIILL()
            java.lang.String r4 = "USER"
            r3 = 0
            if (r0 != 0) goto L68
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            r8 = 1
            if (r0 == 0) goto L68
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L68
            java.lang.String r2 = r5.getEnterFrom()
            if (r2 == 0) goto L9b
            int r1 = r2.hashCode()
            r0 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r1 == r0) goto L90
            r0 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r1 == r0) goto L85
            r0 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r1 != r0) goto L9b
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L9b
            java.lang.String r7 = "personal_homepage"
        L49:
            android.content.Context r0 = r9.LL
            X.19EG r6 = X.C1388190mED.LIZIZ(r0)
            X.0Oin r2 = new X.0Oin
            r2.<init>()
            android.os.Bundle r1 = r2.LIZ
            java.lang.String r0 = "show_login_page_first"
            r1.putBoolean(r0, r8)
            android.os.Bundle r2 = r2.LIZ
            X.0e95 r1 = new X.0e95
            r0 = 3
            r1.<init>(r9, r0)
            java.lang.String r0 = "click_profile_tab"
            X.C0XPD.LIZIZ(r6, r7, r0, r2, r1)
        L68:
            r5.setEnterFrom(r4)
            X.C581760Mrm.LIZIZ = r3
            X.145x r1 = X.C1150504el.LIZ()
            X.0rTb r0 = X.EnumC1589930rTb.PROFILE
            r1.LJIILJJIL(r0)
            X.145x r0 = X.C1150504el.LIZ()
            r0.LJIIIIZZ = r3
            X.0luz r0 = X.C1376270luz.LIZ
            r0.getClass()
            r0 = 0
            X.C1376270luz.LJFF = r0
            return
        L85:
            java.lang.String r0 = "HOME"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9b
            java.lang.String r7 = "homepage_hot"
            goto L49
        L90:
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9b
            java.lang.String r7 = "message"
            goto L49
        L9b:
            java.lang.String r7 = r5.getEnterFrom()
            if (r7 != 0) goto L49
            java.lang.String r7 = ""
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1255210ilj.LJ():void");
    }

    public C1255210ilj(Context context) {
        C19EG c19eg;
        this.LL = context;
        this.LLILLJJLI = C1388190mED.LIZIZ(context);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJFF();
        this.LLJ = (IPopSuiteManagerService) ServiceManager.get().getService(IPopSuiteManagerService.class);
        this.LLJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(718));
        InterfaceC1055110dYz interfaceC1055110dYz = new InterfaceC1055110dYz() { // from class: X.0ilk
            @Override // X.InterfaceC1583780rJg
            public final String getHoxNodeTag() {
                return "";
            }

            @Override // X.InterfaceC1055110dYz
            public final void onNodeHide(Bundle bundle) {
                C1255210ilj c1255210ilj = this.LL;
                c1255210ilj.LLIZ = false;
                C19EG c19eg2 = c1255210ilj.LLILLJJLI;
                if (!C1585030rLh.LJIJ("USER") && c19eg2 != null) {
                    C497270Jen.LJFF(c19eg2);
                    C455790Hu5.LIZ(c19eg2);
                }
            }

            @Override // X.InterfaceC1055110dYz
            public final void onNodeShow(Bundle bundle) throws Throwable {
                Fragment fragmentLIZ;
                C1255210ilj c1255210ilj = this.LL;
                C19EG c19eg2 = c1255210ilj.LLILLJJLI;
                Fragment fragmentKi = null;
                if (c19eg2 != null) {
                    fragmentLIZ = C1058550deX.LIZ(c19eg2);
                } else {
                    fragmentLIZ = null;
                }
                c1255210ilj.LIZJ(fragmentLIZ, false, false);
                C19EG c19eg3 = this.LL.LLILLJJLI;
                if (c19eg3 != null) {
                    C1360720lVu.LIZIZ(c19eg3);
                }
                C497270Jen.LJFF(this.LL.LLILLJJLI);
                C497270Jen.LIZJ(this.LL.LLILLJJLI);
                C1255210ilj c1255210ilj2 = this.LL;
                if (!c1255210ilj2.LLIZ) {
                    c1255210ilj2.LJ();
                    C1255210ilj c1255210ilj3 = this.LL;
                    c1255210ilj3.LIZIZ(c1255210ilj3.LLILZ, c1255210ilj3.LLIZ);
                    C1255210ilj c1255210ilj4 = this.LL;
                    c1255210ilj4.LIZ(c1255210ilj4.LLILZLL);
                } else {
                    Keva repo = Keva.getRepo("move_reminder_keva");
                    if (!repo.getBoolean("profile_has_clicked", false)) {
                        repo.storeBoolean("profile_has_clicked", true);
                    }
                }
                this.LL.getClass();
                C1440005kM.LIZIZ(new C1255230ill());
                IProfileService iProfileService = (IProfileService) ServiceManager.get().getService(IProfileService.class);
                C19EG c19eg4 = this.LL.LLILLJJLI;
                if (c19eg4 != null) {
                    fragmentKi = Hox.LLJILJIL.LIZ(c19eg4).Ki("USER");
                }
                iProfileService.checkAndRefreshUser(fragmentKi);
            }
        };
        if (C1585030rLh.LJIILL() && (c19eg = this.LLILLJJLI) != null) {
            Hox.LLJILJIL.LIZ(c19eg).wQ2("USER", interfaceC1055110dYz);
            C486860J7k.LIZIZ(c19eg).LLJJLIIIJLLLLLLLZ.observe(c19eg, new AObserverS223S0100000_19(this, 70));
        }
        this.LLJIJIL = true;
    }

    public final void LIZ(Fragment fragment) throws Throwable {
        ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ;
        C19EG c19egLIZIZ;
        C19EG c19eg;
        Fragment fragmentLIZ;
        LifecycleOwner lifecycleOwnerRequireMainSAFLifecycle;
        LifecycleCoroutineScope lifecycleScope;
        IMainPageFragment iMainPageFragment = (IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class);
        C19EG c19eg2 = this.LLILLJJLI;
        if (c19eg2 != null) {
            scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19eg2);
        } else {
            scrollSwitchStateManagerLIZIZ = null;
        }
        if (!Intrinsics.LJFF("USER", this.LLILZ)) {
            C19EG c19eg3 = this.LLILLJJLI;
            if (c19eg3 != null) {
                iMainPageFragment.LIZLLL(c19eg3);
            }
            C1483410ohn.LJLJJI().LIZ();
            C755980Tl6.LIZ().LIZLLL();
            ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).qg();
            C19EG c19eg4 = this.LLILLJJLI;
            if (c19eg4 != null) {
                ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LIZIZ(c19eg4);
            }
            if (C1585030rLh.LJIILL()) {
                if (scrollSwitchStateManagerLIZIZ != null) {
                    scrollSwitchStateManagerLIZIZ.KQ2(true);
                }
            } else if (scrollSwitchStateManagerLIZIZ != null) {
                scrollSwitchStateManagerLIZIZ.KQ2(false);
            }
            IProfileAppDiffProtocol.LIZ.getClass();
            C1253780ijQ.LIZ().LIZJ();
            if ((!((Boolean) C267750AeT.LIZ.getValue()).booleanValue() || ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) && scrollSwitchStateManagerLIZIZ != null) {
                scrollSwitchStateManagerLIZIZ.KQ2(true);
            }
            if (fragment instanceof I18nMyProfileFragment) {
                fragment.getClass();
            }
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && C0BMS.LIZ() && this.LLILLJJLI != null) {
                PopupManager.LJIJI(new C1255290ilr(this, this.LLILLJJLI), true);
            }
        }
        if (fragment instanceof C0SSZ) {
            fragment.setUserVisibleHint(true);
        }
        if (C1903780zdo.LJIIJJI(4)) {
            C1903780zdo.LIZJ(4);
        }
        C15O7.LIZIZ(new ACallableS424S0100000_19(this, 5), C20684815ws.LJFF(), null);
        C1514430pVp.LJFF(EnumC1584370rKd.PROFILE);
        iMainPageFragment.yl();
        C19EG c19eg5 = this.LLILLJJLI;
        if (c19eg5 != null && (lifecycleOwnerRequireMainSAFLifecycle = IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg5, null, false)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerRequireMainSAFLifecycle)) != null) {
            C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1073480e2c(this, null), 2);
        }
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
        } else if (this.LLJ.shouldShowPopSuitePopup("USER")) {
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null) {
                this.LLJ.popSuiteTriggerPopup(activityLJFF, AFwS207S0000000_19.get$arr$(721));
            }
        } else if (((IPasskeyPopUpHelper) ServiceManager.get().getService(IPasskeyPopUpHelper.class)).LIZJ()) {
            ((IPasskeyPopUpHelper) ServiceManager.get().getService(IPasskeyPopUpHelper.class)).LIZLLL(this.LLILLJJLI, null);
        } else if (SyncNicknameAndUsernamePopUpHelper.LJ().LIZJ()) {
            C19EG c19eg6 = this.LLILLJJLI;
            if (c19eg6 != null && (c19egLIZIZ = C1388190mED.LIZIZ(c19eg6)) != null && (c19eg = this.LLILLJJLI) != null && (fragmentLIZ = C1058550deX.LIZ(c19eg)) != null) {
                SyncNicknameAndUsernamePopUpHelper.LJ().LIZLLL(c19egLIZIZ, fragmentLIZ, AFwS207S0000000_19.get$arr$(722));
            }
        } else {
            C1255120ila c1255120ila = C1255120ila.LIZ;
            c1255120ila.getClass();
            if (C1255120ila.LJFF()) {
                AFwS207S0000000_19 aFwS207S0000000_19 = AFwS207S0000000_19.get$arr$(719);
                AFwS207S0000000_19 aFwS207S0000000_192 = AFwS207S0000000_19.get$arr$(720);
                c1255120ila.getClass();
                C1255120ila.LJI("personal_homepage", aFwS207S0000000_19, aFwS207S0000000_192);
            }
        }
        C1440005kM.LIZ(new C736500Sum());
    }

    public final void LIZIZ(final String str, final boolean z) {
        ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ;
        String str2;
        IMainPageFragment iMainPageFragment = (IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class);
        if (!C1585030rLh.LJIILL() || z) {
            this.LLIZLLLIL = ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI();
        }
        C19EG c19eg = this.LLILLJJLI;
        if (c19eg != null) {
            scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(c19eg);
        } else {
            scrollSwitchStateManagerLIZIZ = null;
        }
        if (!Intrinsics.LJFF("USER", str)) {
            if (C1253130iiN.LJ) {
                C1245340iVo c1245340iVo = C1245340iVo.LIZ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c1245340iVo.getClass();
                C1245340iVo.LJIIIIZZ = jCurrentTimeMillis;
                C818480W8w.LIZ("my_profile");
                C1253150iiP.LIZ(new C1253200iiU(), this.LLIZLLLIL, true, "homepage_self_profile");
            }
            C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            c1250680ieQ.getClass();
            if (!C1250680ieQ.LJIIIZ) {
                C1250680ieQ.LJIIIIZZ = jCurrentTimeMillis2;
            }
            if (!((Boolean) C0B9M.LIZ.getValue()).booleanValue() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C892410Yzf(null), 3);
            }
            C15O7.LIZIZ(new Callable() { // from class: X.0ilo
                /* JADX WARN: Removed duplicated region for block: B:50:0x00b1 A[PHI: r1
                  0x00b1: PHI (r1v20 java.lang.String) = (r1v9 java.lang.String), (r1v21 java.lang.String) binds: [B:49:0x00af, B:47:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00b7 A[PHI: r1
                  0x00b7: PHI (r1v19 java.lang.String) = (r1v9 java.lang.String), (r1v20 java.lang.String) binds: [B:49:0x00af, B:51:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0130 A[PHI: r1
                  0x0130: PHI (r1v22 java.lang.String) = (r1v7 java.lang.String), (r1v23 java.lang.String) binds: [B:42:0x009c, B:40:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instruction units count: 431
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1255260ilo.call():java.lang.Object");
                }
            }, C20684815ws.LJFF(), null);
            if (scrollSwitchStateManagerLIZIZ != null && (str2 = scrollSwitchStateManagerLIZIZ.LLJJIJIL) != null) {
                iMainPageFragment.C8(str2, "USER");
            }
        }
    }

    public final void LIZJ(Fragment fragment, boolean z, boolean z2) {
        if (C1585030rLh.LJIILL() && (fragment instanceof I18nMyProfileFragment)) {
            if (z2 && this.LLILZIL) {
                this.LLILZIL = false;
                return;
            }
            C19EG c19eg = this.LLILLJJLI;
            if (c19eg != null) {
                if (!z) {
                    this.LLIZLLLIL = ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI();
                    this.LLILZLL = fragment;
                    this.LLILZ = C486860J7k.LIZIZ(c19eg).LLJJIJIL;
                    TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(c19eg);
                    tabChangeManagerLIZ.LLILZIL = "USER";
                    tabChangeManagerLIZ.LLILLL = true;
                    TabChangeManager tabChangeManagerLIZ2 = C343710Ddh.LIZ(c19eg);
                    tabChangeManagerLIZ2.LLILZ = fragment;
                    tabChangeManagerLIZ2.LLILLJJLI = true;
                    return;
                }
                if (Intrinsics.LJFF(this.LLILZ, "HOME")) {
                    C497270Jen.LJFF(c19eg);
                    C455790Hu5.LIZ(c19eg);
                }
                TabChangeManager tabChangeManagerLIZ3 = C343710Ddh.LIZ(c19eg);
                tabChangeManagerLIZ3.CQ2();
                tabChangeManagerLIZ3.LLILLL = false;
                tabChangeManagerLIZ3.LLILZIL = null;
                this.LLILZLL = null;
                this.LLILZ = null;
                TabChangeManager tabChangeManagerLIZ4 = C343710Ddh.LIZ(c19eg);
                tabChangeManagerLIZ4.LLILLJJLI = false;
                tabChangeManagerLIZ4.LLILZ = null;
            }
        }
    }
}
