package X;

import Y.ARunnableS44S0300000_11;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1756050vnX {
    public static void LIZ(InterfaceC1740480vOQ interfaceC1740480vOQ, View view, LifecycleOwner lifecycleOwner) {
        if (interfaceC1740480vOQ instanceof Fragment) {
            if (view != null) {
                view.setTag(R.id.gib, interfaceC1740480vOQ);
            }
            ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJII((LifecycleOwner) interfaceC1740480vOQ, interfaceC1740480vOQ);
        } else if (interfaceC1740480vOQ instanceof C19EG) {
            ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJII((LifecycleOwner) interfaceC1740480vOQ, interfaceC1740480vOQ);
        } else {
            if (lifecycleOwner == null) {
                return;
            }
            ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJII(lifecycleOwner, interfaceC1740480vOQ);
        }
    }

    public static void LIZJ(final View view, final InterfaceC1740480vOQ interfaceC1740480vOQ, final Function0 function0, final Function0 function02) {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: X.0vnY
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (!C1756030vnV.LIZJ(interfaceC1740480vOQ, function0, function02)) {
                    return true;
                }
                C786410Ut5.D3(view.getViewTreeObserver(), this);
                return true;
            }
        };
        ViewTreeObserverOnGlobalLayoutListenerC1775950wJd viewTreeObserverOnGlobalLayoutListenerC1775950wJd = new ViewTreeObserverOnGlobalLayoutListenerC1775950wJd(interfaceC1740480vOQ, function0, function02, view, 0);
        if (C1758250vr5.LIZ().drawListener) {
            C786410Ut5.y3(view.getViewTreeObserver(), onPreDrawListener);
        } else {
            C786410Ut5.x3(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1775950wJd);
        }
        boolean z = true;
        if (!((Boolean) C993803ua.LIZ.getValue()).booleanValue()) {
            z = false;
        }
        if (z) {
            final WeakReference weakReference = new WeakReference(view);
            final WeakReference weakReference2 = new WeakReference(onPreDrawListener);
            final WeakReference weakReference3 = new WeakReference(viewTreeObserverOnGlobalLayoutListenerC1775950wJd);
            C1091940eWO.LIZIZ(10000L, new Runnable(weakReference, weakReference2, weakReference3) { // from class: X.0DXx
                public final WeakReference<View> LL;
                public final WeakReference<ViewTreeObserver.OnPreDrawListener> LLILLJJLI;
                public final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> LLILLL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("WeakRunnable@418.run");
                    try {
                        View view2 = this.LL.get();
                        if (view2 != null) {
                            ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = this.LLILLJJLI.get();
                            if (onPreDrawListener2 != null) {
                                C786410Ut5.D3(view2.getViewTreeObserver(), onPreDrawListener2);
                            }
                            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.LLILLL.get();
                            if (onGlobalLayoutListener != null) {
                                C786410Ut5.C3(view2.getViewTreeObserver(), onGlobalLayoutListener);
                            }
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("WeakRunnable@418.run");
                }

                {
                    this.LL = weakReference;
                    this.LLILLJJLI = weakReference2;
                    this.LLILLL = weakReference3;
                }
            });
            return;
        }
        C1091940eWO.LIZIZ(10000L, new ARunnableS44S0300000_11(viewTreeObserverOnGlobalLayoutListenerC1775950wJd, view, onPreDrawListener, 1));
    }
}
