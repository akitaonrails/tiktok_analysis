package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.galleryviewer.GalleryFragment;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0plV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524150plV extends C09AY implements Function0<C1524130plT> {
    public final /* synthetic */ GalleryFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1524150plV(GalleryFragment galleryFragment) {
        super(0);
        this.LL = galleryFragment;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0plT] */
    @Override // kotlin.jvm.functions.Function0
    public final C1524130plT invoke() {
        final GalleryFragment galleryFragment = this.LL;
        return new Activity.ScreenCaptureCallback() { // from class: X.0plT
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                IECommerceHostService iECommerceHostService;
                C928103jz top;
                Context context;
                Activity activityLIZ;
                GalleryFragment galleryFragment2 = galleryFragment;
                galleryFragment2.getClass();
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
                    if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (context = top.LIZ) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                        if (!Intrinsics.LJFF(activityLIZ, C1388190mED.LIZ(galleryFragment2.requireContext()))) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        return;
                    }
                }
                GalleryFragment galleryFragment3 = galleryFragment;
                if (galleryFragment3.LLJILLL) {
                    return;
                }
                InterfaceC1524140plU interfaceC1524140plU = galleryFragment3.LLJIJIL;
                if (interfaceC1524140plU != null) {
                    interfaceC1524140plU.onScreenCaptured();
                }
                GalleryFragment galleryFragment4 = galleryFragment;
                galleryFragment4.LLJILLL = true;
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(galleryFragment4), null, null, new C314090CSx(galleryFragment, null), 3);
            }
        };
    }
}
