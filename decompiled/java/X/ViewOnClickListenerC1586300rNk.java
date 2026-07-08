package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.IDiscoveryAsyncInflateService;
import com.ss.android.ugc.aweme.discover.impl.DiscoveryAsyncInflateImpl;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.video.ILivePlayerManagerService;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class ViewOnClickListenerC1586300rNk implements View.OnClickListener {
    public final Context LL;
    public final C19EG LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(697));

    public ViewOnClickListenerC1586300rNk(Context context) {
        this.LL = context;
        this.LLILLJJLI = C1388190mED.LIZIZ(context);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IDiscoveryAsyncInflateService iDiscoveryAsyncInflateService;
        TabChangeManager tabChangeManagerLIZ = C343710Ddh.LIZ(this.LLILLJJLI);
        ScrollSwitchStateManager scrollSwitchStateManagerLIZIZ = C486860J7k.LIZIZ(this.LLILLJJLI);
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).enterFromService().setEnterFrom("DISCOVER");
        C581760Mrm.LIZIZ = false;
        C1150504el.LIZ().LJIILJJIL(EnumC1589930rTb.DISCOVER);
        C1150504el.LIZ().LJIIIIZZ = false;
        C1376270luz.LIZ.getClass();
        C1376270luz.LJFF = null;
        tabChangeManagerLIZ.getClass();
        ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI();
        String strCQ2 = tabChangeManagerLIZ.CQ2();
        if (Intrinsics.LJFF(strCQ2, "HOME")) {
            if (C1058550deX.LIZIZ(this.LLILLJJLI, "page_profile")) {
                ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI();
            }
        } else if (Intrinsics.LJFF(strCQ2, "NOTIFICATION")) {
            C128Y c128yBQ2 = tabChangeManagerLIZ.BQ2();
            if ((c128yBQ2 instanceof InterfaceC1255270ilp) && !((InterfaceC1255270ilp) c128yBQ2).P9()) {
                InterfaceC1581830rGX interfaceC1581830rGX = (InterfaceC1581830rGX) c128yBQ2;
                interfaceC1581830rGX.getPageName();
                ((InterfaceC1586310rNl) c128yBQ2).getEnterMethod();
                if (c128yBQ2 instanceof InterfaceC1581830rGX) {
                    interfaceC1581830rGX.getPageName();
                }
            }
        }
        if (!Intrinsics.LJFF("DISCOVER", tabChangeManagerLIZ.CQ2())) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("fromStart", "MainPage", bundle);
            try {
                Hox.LLJILJIL.LIZ(this.LLILLJJLI).TQ2(bundle, "DISCOVER", false);
                IPlayerManagerService iPlayerManagerService = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IPlayerManagerService.class, false, false, false, 14, null);
                if (iPlayerManagerService != null) {
                    iPlayerManagerService.LIZ();
                }
                ILivePlayerManagerService iLivePlayerManagerService = (ILivePlayerManagerService) PluggableExtentionKt.pluggableSpi$default(ILivePlayerManagerService.class, false, false, false, 14, null);
                if (iLivePlayerManagerService != null) {
                    iLivePlayerManagerService.LIZ();
                }
                C1564620qom.LIZ(this.LLILLJJLI);
                scrollSwitchStateManagerLIZIZ.KQ2(false);
                ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).qg();
                ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LIZIZ(this.LLILLJJLI);
                C19371010qS.LIZLLL("discovery_trigger_net");
                C19371010qS.LIZLLL("discovery_cost_time");
                C818480W8w.LIZ("discover_page");
                Object objLIZ = C04TD.LIZ(IDiscoveryAsyncInflateService.class, false);
                if (objLIZ != null) {
                    iDiscoveryAsyncInflateService = (IDiscoveryAsyncInflateService) objLIZ;
                } else {
                    if (C04TD.LLLLZLLIL == null) {
                        synchronized (IDiscoveryAsyncInflateService.class) {
                            if (C04TD.LLLLZLLIL == null) {
                                C04TD.LLLLZLLIL = new DiscoveryAsyncInflateImpl();
                            }
                        }
                    }
                    iDiscoveryAsyncInflateService = C04TD.LLLLZLLIL;
                }
                iDiscoveryAsyncInflateService.LIZ(this.LL);
                if (tabChangeManagerLIZ.BQ2() != null) {
                    C0N1U.LIZ.getClass();
                    C1514430pVp.LJFF(EnumC1584370rKd.DISCOVER);
                } else {
                    C10EU.LJIIIIZZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                String message = th.getMessage();
                if (message == null) {
                    message = "message empty";
                }
                C20598085c.LIZ = message;
                Npth.addAttachUserData(new C20598085c(), CrashType.JAVA);
                throw new IllegalStateException("switch node fail!");
            }
        }
        C15O7.LIZIZ(new Callable() { // from class: X.0iVJ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("BottomDiscoverObserver@d4e6.onClick$1");
                C844470XAv.LIZ.getClass();
                C810650Vr5.LIZ(C844470XAv.LIZ(), "discovery", "click");
                C1C7U.LIZIZ("BottomDiscoverObserver@d4e6.onClick$1");
                return null;
            }
        }, C20684815ws.LJFF(), null);
        FeedCommonService feedCommonService = (FeedCommonService) PluggableExtentionKt.pluggableSpi$default(FeedCommonService.class, false, false, false, 14, null);
        if (feedCommonService != null) {
            feedCommonService.LIZLLL();
        }
    }
}
