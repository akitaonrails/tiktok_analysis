package X;

import Y.ARunnableS101S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04I6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04I6 extends C09AY implements Function0<C04I5> {
    public final /* synthetic */ SeaPdpBodyWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04I6(SeaPdpBodyWidget seaPdpBodyWidget) {
        super(0);
        this.LL = seaPdpBodyWidget;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.04I5] */
    @Override // kotlin.jvm.functions.Function0
    public final C04I5 invoke() {
        if (Build.VERSION.SDK_INT < 34) {
            return null;
        }
        final SeaPdpBodyWidget seaPdpBodyWidget = this.LL;
        return new Activity.ScreenCaptureCallback() { // from class: X.04I5
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                IECommerceHostService iECommerceHostService;
                String strLJJLIIIJ;
                LinearLayoutManager linearLayoutManager;
                C928103jz top;
                Context context;
                Activity activityLIZIZ;
                SeaPdpBodyWidget seaPdpBodyWidget2 = seaPdpBodyWidget;
                if (seaPdpBodyWidget2.LLJLLIL || !seaPdpBodyWidget2.LLJLLL) {
                    return;
                }
                try {
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
                    if (rootPageMonitor == null || (top = rootPageMonitor.getTop()) == null || (context = top.LIZ) == null || (activityLIZIZ = C737910Sx3.LIZIZ(context)) == null || Intrinsics.LJFF(activityLIZIZ, C1745060vVo.LIZ(seaPdpBodyWidget2))) {
                        List<Fragment> listLJJLIIIJL = seaPdpBodyWidget2.LLJ.getParentFragmentManager().LJJLIIIJL();
                        ArrayList arrayList = new ArrayList();
                        for (Fragment fragment : listLJJLIIIJL) {
                            Fragment fragment2 = fragment;
                            if (fragment2.isAdded() && fragment2.isVisible()) {
                                arrayList.add(fragment);
                            }
                        }
                        if (!Intrinsics.LJFF(C13LP.LJJLIIIJL(arrayList), seaPdpBodyWidget2.LLJ)) {
                            return;
                        }
                        if (seaPdpBodyWidget2.LJIIIZ().LLLLIILL || !C948503nH.LIZJ(seaPdpBodyWidget)) {
                            return;
                        }
                        C1054104Ah c1054104Ah = seaPdpBodyWidget.LJIIIZ().LLJLIL;
                        if (c1054104Ah != null) {
                            SeaPdpBodyWidget seaPdpBodyWidget3 = seaPdpBodyWidget;
                            View viewFindViewById = seaPdpBodyWidget3.LLJILLL;
                            if (viewFindViewById == null) {
                                View view = seaPdpBodyWidget3.LLILZ;
                                viewFindViewById = view != null ? view.findViewById(R.id.t0h) : null;
                                seaPdpBodyWidget3.LLJILLL = (C1338430kvx) viewFindViewById;
                            }
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
                            RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                            if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
                                strLJJLIIIJ = "";
                                c1054104Ah.LJJIL(strLJJLIIIJ, null);
                            } else {
                                C04CC c04cc = (C04CC) seaPdpBodyWidget3.LJIIIZ().LLJLLL.getValue();
                                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                                c04cc.getClass();
                                try {
                                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                                    if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                                        while (true) {
                                            String str = c04cc.LIZIZ.get(Integer.valueOf(iFindFirstVisibleItemPosition));
                                            if (str != null) {
                                                copyOnWriteArrayList.add(str);
                                            }
                                            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                                                break;
                                            } else {
                                                iFindFirstVisibleItemPosition++;
                                            }
                                        }
                                    }
                                    CopyOnWriteArrayList<String> copyOnWriteArrayList2 = c04cc.LIZ;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (String str2 : copyOnWriteArrayList2) {
                                        String str3 = str2;
                                        if (copyOnWriteArrayList.contains(str3) && !c04cc.LIZJ.contains(str3)) {
                                            arrayList2.add(str2);
                                        }
                                    }
                                    strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C1AF0.LJ(th);
                                    strLJJLIIIJ = "";
                                }
                                c1054104Ah.LJJIL(strLJJLIIIJ, null);
                            }
                        }
                        SeaPdpBodyWidget seaPdpBodyWidget4 = seaPdpBodyWidget;
                        seaPdpBodyWidget4.LLJLLIL = true;
                        C786410Ut5.LJLIIL(1000L, seaPdpBodyWidget4.LLJLL, new ARunnableS101S0100000_1(seaPdpBodyWidget4, 22));
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C1AF0.LJ(th2);
                }
            }
        };
    }
}
