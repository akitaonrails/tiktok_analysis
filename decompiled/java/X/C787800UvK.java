package X;

import Y.ARunnableS82S0200000_13;
import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0UvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787800UvK implements InterfaceC792700V7s {
    public String LLILLJJLI;
    public ViewTreeObserverOnGlobalLayoutListenerC787810UvL LLILLL;
    public ARunnableS82S0200000_13 LLILZ;
    public long LLILZLL;
    public boolean LLIZ;
    public long LL = -1;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());

    @Override // X.InterfaceC792700V7s
    public final void LIZLLL(Activity activity) {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJII(Activity activity) {
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityStarted(Activity activity) {
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0UvL] */
    public final void LIZ(Activity activity) {
        this.LL = System.currentTimeMillis();
        String canonicalName = activity.getClass().getCanonicalName();
        this.LLILLJJLI = canonicalName;
        final Integer numLIZ = C07RX.LIZ(canonicalName);
        if (numLIZ == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(activity.getWindow().getDecorView());
        this.LLILLL = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0UvL
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                View viewFindViewById;
                ViewTreeObserverOnGlobalLayoutListenerC787810UvL viewTreeObserverOnGlobalLayoutListenerC787810UvL;
                if (weakReference.get() != null && (viewFindViewById = ((View) weakReference.get()).findViewById(numLIZ.intValue())) != null && viewFindViewById.getVisibility() == 0 && viewFindViewById.getWidth() > 0) {
                    ViewTreeObserver viewTreeObserver = ((View) weakReference.get()).getViewTreeObserver();
                    if (viewTreeObserver.isAlive() && (viewTreeObserverOnGlobalLayoutListenerC787810UvL = this.LLILLL.LLILLL) != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC787810UvL);
                        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC787810UvL, ViewTreeObserver.OnGlobalLayoutListener.class);
                    }
                    C787800UvK c787800UvK = this.LLILLL;
                    ARunnableS82S0200000_13 aRunnableS82S0200000_13 = c787800UvK.LLILZ;
                    if (aRunnableS82S0200000_13 != null) {
                        c787800UvK.LLILZIL.removeCallbacks(aRunnableS82S0200000_13);
                        this.LLILLL.LLILZ = null;
                    }
                    C787800UvK c787800UvK2 = this.LLILLL;
                    c787800UvK2.LLILLL = null;
                    if (c787800UvK2.LL > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C787800UvK c787800UvK3 = this.LLILLL;
                        long j = jCurrentTimeMillis - c787800UvK3.LL;
                        c787800UvK3.LL = 0L;
                        if (j >= c787800UvK3.LLILZLL || j <= 0) {
                            return;
                        }
                        AutoPageTraceHelper.reportViewIdStats(jCurrentTimeMillis, c787800UvK3.LLILLJJLI);
                        MonitorTool.reportTraceTime(this.LLILLL.LLILLJJLI, "activityOnCreateToViewShow", j);
                    }
                }
            }
        };
        C786410Ut5.x3(((View) weakReference.get()).getViewTreeObserver(), this.LLILLL);
        ARunnableS82S0200000_13 aRunnableS82S0200000_13 = new ARunnableS82S0200000_13(this, weakReference, 70);
        this.LLILZ = aRunnableS82S0200000_13;
        C786410Ut5.LJLIIL(this.LLILZLL, this.LLILZIL, aRunnableS82S0200000_13);
    }

    @Override // X.InterfaceC792700V7s
    public final void LJIIJ(Activity activity) {
        this.LL = 0L;
        try {
            if (this.LLILLL != null) {
                C786410Ut5.C3(activity.getWindow().getDecorView().getViewTreeObserver(), this.LLILLL);
                this.LLILLL = null;
            }
            ARunnableS82S0200000_13 aRunnableS82S0200000_13 = this.LLILZ;
            if (aRunnableS82S0200000_13 != null) {
                this.LLILZIL.removeCallbacks(aRunnableS82S0200000_13);
                this.LLILZ = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC792700V7s
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (!((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(activity) && this.LLIZ) {
            try {
                LIZ(activity);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
