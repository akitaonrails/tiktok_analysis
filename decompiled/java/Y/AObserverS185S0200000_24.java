package Y;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0XQ7;
import X.C1058550deX;
import X.C123100dR;
import X.C1255390im1;
import X.C1295960jpS;
import X.C1388190mED;
import X.C1576640r8A;
import X.C1580440rEI;
import X.C1584320rKY;
import X.C1586440rNy;
import X.C1586480rO2;
import X.C1586680rOM;
import X.C1589640rT8;
import X.C1595430rcT;
import X.C1904920zfe;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C296370BjX;
import X.C319860CgK;
import X.C486860J7k;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC1586970rOp;
import X.EnumC1587000rOs;
import X.EnumC1904890zfb;
import android.app.Activity;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.fragment.FragmentRoute;
import com.ss.android.ugc.aweme.account.switchaccount.ProfileTabLongPressHandlerImpl;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideController;
import com.ss.android.ugc.aweme.inbox.NotificationContainer;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.profile.IProfileService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailDescriptionAssem;
import com.ss.android.ugc.aweme.series.seriesdetail.viewmodel.SeriesDetailVideoListViewModel;
import com.ss.android.ugc.aweme.sidebar.SidebarPageFragment;
import com.ss.android.ugc.aweme.sidebar.components.SidebarUserGuideAssem;
import java.util.Map;
import kotlin.jvm.internal.AwS41S0310000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public class AObserverS185S0200000_24 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void onChanged$0(AObserverS185S0200000_24 aObserverS185S0200000_24, Object obj) {
        C19EG activity;
        if (Intrinsics.LJFF(obj, "USER")) {
            ProfileTabLongPressHandlerImpl profileTabLongPressHandlerImpl = (ProfileTabLongPressHandlerImpl) aObserverS185S0200000_24.l0;
            Fragment fragment = (Fragment) aObserverS185S0200000_24.l1;
            profileTabLongPressHandlerImpl.getClass();
            if (C1586440rNy.LIZ() && C0XQ7.LIZJ().isEnableMultiAccountLogin() && (activity = fragment.getActivity()) != null && !activity.isFinishing() && !activity.getSupportFragmentManager().LJLJJI() && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                String str = C486860J7k.LIZIZ(activity).LLJJIJIL;
                C1584320rKY.LIZ.getClass();
                String strLJI = C1584320rKY.LJI(str);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", strLJI);
                C20684815ws.LJIILLIIL("long_press_profile_tab", c2344009Gk.LIZ);
                C1904920zfe.LIZJ(EnumC1904890zfb.LONG_PRESS);
                C1255390im1 c1255390im1 = new C1255390im1(strLJI, "long_press", null, null, null, null, 252);
                IProfileService iProfileService = (IProfileService) ServiceManager.get().getService(IProfileService.class);
                if (iProfileService != null) {
                    iProfileService.showInChooseAccountBottomSheet(activity.getSupportFragmentManager(), c1255390im1, "switch_account_long_press", null, null, null);
                }
            }
        }
    }

    public static final void onChanged$1(AObserverS185S0200000_24 aObserverS185S0200000_24, Object obj) {
        ((Boolean) obj).booleanValue();
        C1586480rO2 c1586480rO2 = (C1586480rO2) aObserverS185S0200000_24.l0;
        if (c1586480rO2.LIZIZ) {
            c1586480rO2.LIZIZ = false;
            return;
        }
        if (C319860CgK.LIZ()) {
            return;
        }
        if (C296370BjX.LIZ()) {
            C1586480rO2 c1586480rO22 = (C1586480rO2) aObserverS185S0200000_24.l0;
            C19EG c19eg = (C19EG) aObserverS185S0200000_24.l1;
            c1586480rO22.getClass();
            Fragment fragmentKi = Hox.LLJILJIL.LIZ(c19eg).Ki("FRIENDS_FEED");
            if ((fragmentKi instanceof FeedFragment) && fragmentKi != null && C1589640rT8.LIZIZ.l2()) {
                return;
            }
            if (C1595430rcT.LIZIZ.LIZIZ().redDotLogic().LJIJJLI()) {
                C1586680rOM c1586680rOM = C1586680rOM.LIZ;
                EnumC1586970rOp enumC1586970rOp = EnumC1586970rOp.NON_PERSONALIZED_CHANGED;
                boolean zLJI = MethodIDManager.LJI(137209);
                c1586680rOM.getClass();
                C1586680rOM.LIZJ(enumC1586970rOp, null);
                if (!zLJI) {
                    return;
                }
                MethodIDManager.LJ();
                return;
            }
            C1589640rT8.LIZIZ.o3(EnumC1587000rOs.NON_PERSONALIZED_FEED_CHANGE.getScene(), "", "unknown");
            return;
        }
        C1586480rO2 c1586480rO23 = (C1586480rO2) aObserverS185S0200000_24.l0;
        C19EG c19eg2 = (C19EG) aObserverS185S0200000_24.l1;
        c1586480rO23.getClass();
        Fragment fragmentKi2 = Hox.LLJILJIL.LIZ(c19eg2).Ki("FRIENDS_FEED");
        if (!(fragmentKi2 instanceof FeedFragment) || fragmentKi2 == null) {
            C1589640rT8.LIZIZ.o3(EnumC1587000rOs.NON_PERSONALIZED_FEED_CHANGE.getScene(), "", "unknown");
        }
        if (C1589640rT8.LIZIZ.l2()) {
            return;
        }
        C1586680rOM c1586680rOM2 = C1586680rOM.LIZ;
        EnumC1586970rOp enumC1586970rOp2 = EnumC1586970rOp.NON_PERSONALIZED_CHANGED;
        boolean zLJI2 = MethodIDManager.LJI(137209);
        c1586680rOM2.getClass();
        C1586680rOM.LIZJ(enumC1586970rOp2, null);
        if (!zLJI2) {
            return;
        }
        MethodIDManager.LJ();
    }

    public static final void onChanged$2(AObserverS185S0200000_24 aObserverS185S0200000_24, Object obj) {
        if (Intrinsics.LJFF(((ScrollSwitchStateManager) aObserverS185S0200000_24.l0).CQ2(((Number) obj).intValue()), "page_feed")) {
            SlideGuideController slideGuideController = (SlideGuideController) aObserverS185S0200000_24.l1;
            slideGuideController.LIZJ(new AwS568S0100000_24(slideGuideController, 571));
        }
    }

    public static final void onChanged$3(AObserverS185S0200000_24 aObserverS185S0200000_24, Object obj) {
        Activity activityLIZ = C1388190mED.LIZ((C19EG) aObserverS185S0200000_24.l0);
        if (activityLIZ != null && Intrinsics.LJFF(obj, "NOTIFICATION") && C1058550deX.LIZIZ((C19EG) activityLIZ, "NOTIFICATION")) {
            NotificationContainer notificationContainer = (NotificationContainer) aObserverS185S0200000_24.l1;
            if (notificationContainer.getChildFragmentManager().LJJLIIIIJ() > 0) {
                FragmentRoute fragmentRouteFragmentNavigation = SmartRouter.fragmentNavigation(notificationContainer);
                fragmentRouteFragmentNavigation.pop(Boolean.TRUE);
                fragmentRouteFragmentNavigation.commit(Boolean.FALSE);
            }
        }
    }

    public static final void onChanged$4(AObserverS185S0200000_24 aObserverS185S0200000_24, Object obj) {
        boolean zLJFF = Intrinsics.LJFF("page_sidebar", ((ScrollSwitchStateManager) aObserverS185S0200000_24.l0).CQ2(((Number) obj).intValue()));
        Integer value = ((ScrollSwitchStateManager) aObserverS185S0200000_24.l0).LLJ.getValue();
        if (zLJFF) {
            if ((value == null || value.intValue() != 0) && !((ScrollSwitchStateManager) aObserverS185S0200000_24.l0).FQ2("page_sidebar")) {
                ((SidebarPageFragment) aObserverS185S0200000_24.l1).OR();
            }
        }
    }

    public static final void onChanged$5(AObserverS185S0200000_24 aObserverS185S0200000_24, Object obj) {
        if (((Number) obj).intValue() == 0 && ((ScrollSwitchStateManager) aObserverS185S0200000_24.l0).FQ2("page_sidebar")) {
            C1580440rEI.LIZ.getClass();
            C01GW c01gw = C1580440rEI.LIZIZ;
            if (((Keva) c01gw.getValue()).getBoolean(C1580440rEI.LIZIZ("sidebar_not_shown"), true)) {
                SidebarUserGuideAssem sidebarUserGuideAssem = (SidebarUserGuideAssem) aObserverS185S0200000_24.l1;
                if (!sidebarUserGuideAssem.LLJIJIL) {
                    ViewGroup viewGroup = sidebarUserGuideAssem.LLJ;
                    if (viewGroup != null) {
                        C786410Ut5.LJLLLLLL(0, viewGroup);
                    }
                    C1295960jpS c1295960jpS = sidebarUserGuideAssem.LLJI;
                    if (c1295960jpS != null) {
                        c1295960jpS.playAnimation();
                    }
                    ((Keva) c01gw.getValue()).storeBoolean(C1580440rEI.LIZIZ("sidebar_not_shown"), false);
                    C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0rE5
                        public static void LIZ() throws JSONException {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("enter_from", C1580280rE2.LIZIZ);
                            jSONObject.put("enter_method", C1580280rE2.LIZJ);
                            jSONObject.put("entrance_id", C1580280rE2.LIZ);
                            C20684815ws.LJIJ("sidebar_swipe_prompt_show", jSONObject);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("SidebarTrackHelper@aa6a.sidebarUserGuideShow$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("SidebarTrackHelper@aa6a.sidebarUserGuideShow$1");
                        }
                    });
                }
            }
        }
    }

    public static final void onChanged$6(AObserverS185S0200000_24 aObserverS185S0200000_24, Object obj) {
        String uid;
        C1576640r8A c1576640r8A = (C1576640r8A) ((Map) obj).get(Long.valueOf(((CollectionDetailModel) aObserverS185S0200000_24.l0).collectionId));
        if (c1576640r8A != null) {
            SeriesDetailDescriptionAssem seriesDetailDescriptionAssem = (SeriesDetailDescriptionAssem) aObserverS185S0200000_24.l1;
            CollectionDetailModel collectionDetailModel = (CollectionDetailModel) aObserverS185S0200000_24.l0;
            seriesDetailDescriptionAssem.LLJIJIL.onNext(c1576640r8A);
            String curUserId = C0XQ7.LJFF().getCurUserId();
            User user = collectionDetailModel.collectionCreator;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            boolean zEquals = curUserId.equals(uid);
            if (!c1576640r8A.LJIIIIZZ && C123100dR.LIZ(c1576640r8A.LIZLLL)) {
                seriesDetailDescriptionAssem.kp(collectionDetailModel, c1576640r8A.LJ);
            } else {
                PriceInfo priceInfo = collectionDetailModel.discountedPriceInfo;
                if (priceInfo != null) {
                    seriesDetailDescriptionAssem.kp(collectionDetailModel, priceInfo.priceInUsd);
                }
            }
            if (collectionDetailModel.enableSingleVideoPurchase) {
                SeriesDetailVideoListViewModel seriesDetailVideoListViewModelOo = seriesDetailDescriptionAssem.Oo();
                String str = c1576640r8A.LJI;
                seriesDetailVideoListViewModelOo.getClass();
                seriesDetailVideoListViewModelOo.setState(new AwS74S1000000_24(str, 19));
            }
            seriesDetailDescriptionAssem.withState(seriesDetailDescriptionAssem.Lo(), new AwS41S0310000_24(seriesDetailDescriptionAssem, collectionDetailModel, zEquals, c1576640r8A, 0));
        }
    }

    public AObserverS185S0200000_24(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public AObserverS185S0200000_24(ScrollSwitchStateManager scrollSwitchStateManager, SidebarPageFragment sidebarPageFragment, C19EG c19eg, int i) {
        this.$t = i;
        this.l0 = scrollSwitchStateManager;
        this.l1 = sidebarPageFragment;
    }
}
