package X;

import Y.ARunnableS101S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.strategy.SeaSkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.046E, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C046E extends C09AY implements Function0<C10428045y> {
    public final /* synthetic */ SeaSkuPanelFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C046E(SeaSkuPanelFragment seaSkuPanelFragment) {
        super(0);
        this.LL = seaSkuPanelFragment;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.045y] */
    @Override // kotlin.jvm.functions.Function0
    public final C10428045y invoke() {
        if (Build.VERSION.SDK_INT < 34) {
            return null;
        }
        final SeaSkuPanelFragment seaSkuPanelFragment = this.LL;
        return new Activity.ScreenCaptureCallback() { // from class: X.045y
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                IECommerceHostService iECommerceHostService;
                Fragment fragmentPrevious;
                Map<String, Object> mapLJ;
                String str;
                C928103jz top;
                Context context;
                Activity activityLIZIZ;
                SeaSkuPanelFragment seaSkuPanelFragment2 = seaSkuPanelFragment;
                if (seaSkuPanelFragment2.LLJL) {
                    return;
                }
                try {
                    if (seaSkuPanelFragment2.dS().LLLI) {
                        return;
                    }
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                        IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                        C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                        iECommerceHostService = (IECommerceHostService) service;
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
                    if (rootPageMonitor == null || (top = rootPageMonitor.getTop()) == null || (context = top.LIZ) == null || (activityLIZIZ = C737910Sx3.LIZIZ(context)) == null || Intrinsics.LJFF(activityLIZIZ, seaSkuPanelFragment2.getActivity())) {
                        List<Fragment> listLJJLIIIJL = seaSkuPanelFragment2.getParentFragmentManager().LJJLIIIJL();
                        ListIterator<Fragment> listIterator = listLJJLIIIJL.listIterator(listLJJLIIIJL.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                fragmentPrevious = null;
                                break;
                            }
                            fragmentPrevious = listIterator.previous();
                            Fragment fragment = fragmentPrevious;
                            if (fragment.isAdded() && fragment.isVisible()) {
                                break;
                            }
                        }
                        if ((!Intrinsics.LJFF(fragmentPrevious, seaSkuPanelFragment2)) || !seaSkuPanelFragment.isResumed()) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        SkuPanelStarter.SkuEnterParams skuEnterParams = seaSkuPanelFragment.dS().LLJILJIL;
                        if (skuEnterParams == null || (mapLJ = skuEnterParams.trackParams) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        linkedHashMap.putAll(mapLJ);
                        linkedHashMap.put("page_name", "sku");
                        SkuPanelStarter.SkuEnterParams skuEnterParams2 = seaSkuPanelFragment.dS().LLJILJIL;
                        if (skuEnterParams2 == null || (str = skuEnterParams2.enterFrom) == null) {
                            str = "";
                        }
                        linkedHashMap.put("enter_from", str);
                        C044V.LIZ.getClass();
                        C1018703yb.LIZIZ("tiktokec_screenshot_product_detail", linkedHashMap);
                        SeaSkuPanelFragment seaSkuPanelFragment3 = seaSkuPanelFragment;
                        seaSkuPanelFragment3.LLJL = true;
                        C786410Ut5.LJLIIL(1000L, seaSkuPanelFragment3.LLJJLIIIJLLLLLLLZ, new ARunnableS101S0100000_1(seaSkuPanelFragment3, 24));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
            }
        };
    }
}
