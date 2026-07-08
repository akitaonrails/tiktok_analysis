package X;

import Y.ARunnableS29S1100000_24;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.TabLifecycleAbility;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.account.experiment.ProfileTabDoubleTapSwitchConfig;
import com.ss.android.ugc.aweme.account.switchaccount.IProfileTabDoubleClickHandler;
import com.ss.android.ugc.aweme.account.switchaccount.IProfileTabLongPressHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.TabAlphaController;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.spi.IHomeTabSavedStateService;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.ss.android.ugc.aweme.ui.FragmentTabHost;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0rNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586420rNw implements InterfaceC1590350rUH {
    public FragmentTabHost LIZ;
    public TabChangeManager LIZIZ;
    public ScrollSwitchStateManager LIZJ;

    @Override // X.InterfaceC1590280rUA
    public final void onDestroyView() {
        TabAlphaController tabAlphaControllerLIZ = C1586450rNz.LIZ();
        if (tabAlphaControllerLIZ != null) {
            if (tabAlphaControllerLIZ.hasMessages(1)) {
                tabAlphaControllerLIZ.removeMessages(1);
            }
            tabAlphaControllerLIZ.LL = null;
        }
    }

    @Override // X.InterfaceC1590280rUA
    public final View LIZ(AbsFragment absFragment, LayoutInflater layoutInflater) {
        int i;
        ComponentCallbacks2 componentCallbacks2LJFF;
        if (((Boolean) C303460Buy.LIZIZ.getValue()).booleanValue()) {
            i = R.layout.cdc;
        } else {
            i = R.layout.cdb;
        }
        C19EG activity = absFragment.getActivity();
        if (activity != null) {
            Context context = absFragment.getContext();
            InterfaceC214902198i interfaceC214902198i = null;
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                Fragment parentFragment = absFragment;
                while (true) {
                    if (parentFragment instanceof InterfaceC214902198i) {
                        interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                        break;
                    }
                    parentFragment = parentFragment.getParentFragment();
                    if (parentFragment == null) {
                        break;
                    }
                }
            }
            View viewLJJII = SAFExtensionKt.LJJII(activity, layoutInflater.getContext(), i, C682840QqQ.LIZ(interfaceC214902198i, activity));
            FragmentTabHost fragmentTabHost = (FragmentTabHost) viewLJJII.findViewById(R.id.nx0);
            this.LIZ = fragmentTabHost;
            if (fragmentTabHost != null) {
                fragmentTabHost.setHideWhenTabChanged(true);
            }
            this.LIZJ = C486860J7k.LIZIZ(absFragment.getActivity());
            return viewLJJII;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1590280rUA
    public final void LIZIZ(final AbsFragment absFragment, View view) {
        View viewFindViewById;
        IProfileTabDoubleClickHandler iProfileTabDoubleClickHandler;
        IProfileTabLongPressHandler iProfileTabLongPressHandler;
        FragmentTabHost fragmentTabHost;
        TabWidget tabWidget;
        TabAlphaController tabAlphaControllerLIZ = C1586450rNz.LIZ();
        if (tabAlphaControllerLIZ != null) {
            absFragment.getLifecycle().addObserver(tabAlphaControllerLIZ);
        }
        FragmentTabHost fragmentTabHost2 = this.LIZ;
        if (fragmentTabHost2 != null) {
            fragmentTabHost2.LIZLLL(absFragment.getActivity(), absFragment.getChildFragmentManager());
        }
        FragmentTabHost fragmentTabHost3 = this.LIZ;
        if (fragmentTabHost3 != null && (tabWidget = fragmentTabHost3.getTabWidget()) != null) {
            int visibility = tabWidget.getVisibility();
            tabWidget.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, tabWidget);
        }
        if ((absFragment instanceof InterfaceC1586410rNv) && (fragmentTabHost = this.LIZ) != null) {
            fragmentTabHost.setOnTabSwitchListener((InterfaceC1586410rNv) absFragment);
        }
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(absFragment.getActivity());
        this.LIZIZ = tabChangeManagerLIZ;
        if (tabChangeManagerLIZ != null) {
            tabChangeManagerLIZ.LL = this.LIZ;
            tabChangeManagerLIZ.LLJIJIL = absFragment.getChildFragmentManager();
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.LIZJ;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.LLJJIJIIJIL = new MutableLiveData<Fragment>() { // from class: com.ss.android.ugc.aweme.homepage.MainPageFragmentProxy$onViewCreated$2
                @Override // androidx.lifecycle.LiveData
                public Fragment getValue() {
                    TabChangeManager tabChangeManager = this.this$0.LIZIZ;
                    if (tabChangeManager != null) {
                        return tabChangeManager.BQ2();
                    }
                    return null;
                }
            };
        }
        TabChangeManager tabChangeManager = this.LIZIZ;
        if (tabChangeManager != null) {
            tabChangeManager.LLJILJIL = new C1586370rNr(this);
        }
        if ((absFragment instanceof InterfaceC1586360rNq) && tabChangeManager != null) {
            tabChangeManager.wQ2((InterfaceC1586360rNq) absFragment);
        }
        C1150504el.LIZ().LIZLLL("method_main_page_add_tab_duration", false);
        C1150504el.LIZ().LJI("method_main_page_add_tab_duration", false);
        FragmentTabHost fragmentTabHost4 = this.LIZ;
        if (fragmentTabHost4 != null) {
            HandlerHook.viewPost(fragmentTabHost4, new Runnable() { // from class: X.0J7i
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MainPageFragmentProxy@9bcf.onViewCreated$4");
                    try {
                        ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).runInTabHostRunnable(absFragment);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MainPageFragmentProxy@9bcf.onViewCreated$4");
                }
            });
        }
        View view2 = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.ch9);
        } else {
            viewFindViewById = null;
        }
        if (absFragment.isViewValid()) {
            boolean z = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            if (viewFindViewById != null) {
                C810560Vqw.LIZJ(new RunnableC343190Dcr(1, viewFindViewById, view2, view2));
            }
        }
        List<C0DMT> list = C1582020rGq.LIZ;
        absFragment.getChildFragmentManager().LJZL(new AbstractC813200VvC(absFragment) { // from class: X.0rUK
            public final HomeTabAbility LL;

            {
                HomeTabAbility homeTabAbilityLIZ;
                MainActivityScope mainActivityScopeLIZIZ = C0S4U.LIZIZ(absFragment);
                if (mainActivityScopeLIZIZ != null) {
                    homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZIZ);
                } else {
                    homeTabAbilityLIZ = null;
                }
                this.LL = homeTabAbilityLIZ;
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                String strPz;
                super.onFragmentResumed(fragmentManager, fragment);
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    HomeTabAbility homeTabAbility = this.LL;
                    if (homeTabAbility != null) {
                        strPz = homeTabAbility.pz(fragment);
                    } else {
                        strPz = null;
                    }
                    tabSwitchMetricServiceLIZ.LJIIIZ(fragment, strPz, EnumC1593230rYv.ON_RESUME);
                }
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                String strPz;
                super.onFragmentAttached(fragmentManager, fragment, context);
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    HomeTabAbility homeTabAbility = this.LL;
                    if (homeTabAbility != null) {
                        strPz = homeTabAbility.pz(fragment);
                    } else {
                        strPz = null;
                    }
                    tabSwitchMetricServiceLIZ.LJIIIZ(fragment, strPz, EnumC1593230rYv.ON_ATTACH);
                }
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                String strPz;
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    HomeTabAbility homeTabAbility = this.LL;
                    if (homeTabAbility != null) {
                        strPz = homeTabAbility.pz(fragment);
                    } else {
                        strPz = null;
                    }
                    tabSwitchMetricServiceLIZ.LJIIIZ(fragment, strPz, EnumC1593230rYv.ON_CREATE);
                }
            }

            @Override // X.AbstractC813200VvC
            public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view3, Bundle bundle) {
                String strPz;
                HomeTabAbility homeTabAbility = this.LL;
                if (homeTabAbility != null) {
                    strPz = homeTabAbility.pz(fragment);
                } else {
                    strPz = null;
                }
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    tabSwitchMetricServiceLIZ.LJIIIZ(fragment, strPz, EnumC1593230rYv.ON_VIEW_CREATED);
                }
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view3, new ARunnableS29S1100000_24(view3, strPz, 6));
            }
        }, false);
        if (C1586440rNy.LIZ() && (iProfileTabLongPressHandler = (IProfileTabLongPressHandler) PluggableExtentionKt.pluggableSpi$default(IProfileTabLongPressHandler.class, false, false, false, 14, null)) != null) {
            iProfileTabLongPressHandler.init(absFragment);
        }
        if (ProfileTabDoubleTapSwitchConfig.LIZIZ() && (iProfileTabDoubleClickHandler = (IProfileTabDoubleClickHandler) PluggableExtentionKt.pluggableSpi$default(IProfileTabDoubleClickHandler.class, false, false, false, 14, null)) != null) {
            iProfileTabDoubleClickHandler.init(absFragment);
        }
    }

    @Override // X.InterfaceC1590280rUA
    public final void LIZJ(AbsFragment absFragment, Bundle bundle) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        TabLifecycleAbility tabLifecycleAbility;
        String strLIZIZ;
        FragmentTabHost fragmentTabHost;
        IHomeTabSavedStateService.LIZ.getClass();
        IHomeTabSavedStateService iHomeTabSavedStateServiceLIZ = C1586430rNx.LIZ();
        if (iHomeTabSavedStateServiceLIZ != null && (strLIZIZ = iHomeTabSavedStateServiceLIZ.LIZIZ()) != null && strLIZIZ.length() != 0 && (fragmentTabHost = this.LIZ) != null) {
            fragmentTabHost.setCurrentTabByTag(strLIZIZ);
        }
        MainActivityScope mainActivityScopeLIZIZ = C0S4U.LIZIZ(absFragment);
        if (mainActivityScopeLIZIZ != null && (interfaceC665370Q7z = mainActivityScopeLIZIZ.LL) != null && (tabLifecycleAbility = (TabLifecycleAbility) C1558520qew.LIZ(interfaceC665370Q7z, TabLifecycleAbility.class, null)) != null) {
            tabLifecycleAbility.W31(absFragment);
        }
    }
}
